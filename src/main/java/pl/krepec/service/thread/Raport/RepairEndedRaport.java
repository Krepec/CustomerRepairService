package pl.krepec.service.thread.Raport;

import pl.krepec.service.repository.RepairRepository;
import pl.krepec.service.repository.model.Repair;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class RepairEndedRaport {
    public void run(RepairRepository repairRepository){
        new Thread(){
            @Override
            public void run() {
                while (true){
                    try {
                        Thread.sleep(10000);
                        List<Repair> repairsWaitingForRepair = new ArrayList<>();
                        Iterable<Repair> repairList = repairRepository.findAll();
                        for (Repair repair : repairList){
                           if ( repair.getStatusId() == 2){
                               repairsWaitingForRepair.add(repair);

                           }
                        }
                        BufferedWriter writer = new BufferedWriter(new FileWriter("/tmp/reportZakonczoneNaprawy.txt"));
                        for (Repair repair : repairsWaitingForRepair){
                            String status = repair.toString() + "\n";
                                writer.write(status);
                        }
                        writer.close();

                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }


                }
            }
        }.start();
    }
}
