package pl.krepec.service.thread.Raport;

import pl.krepec.service.repository.RepairRepository;
import pl.krepec.service.repository.model.Repair;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class RepairInProgressRaport {

    public void run(RepairRepository repairaRepository) {
        new Thread() {
            @Override
            public void run() {
                while (true) {
                    try {
                        System.out.println("Sleep sie wywołał");
                        Thread.sleep(10000);
                        List<Repair> repairInProgress = new ArrayList<>();
                        Iterable<Repair> repairList = repairaRepository.findAll();
                        for (Repair repair : repairList) {
                            if (repair.getStatusId() == 1) {
                                repairInProgress.add(repair);
                            }

                        }

                        BufferedWriter writer = new BufferedWriter(new FileWriter("/tmp/reportNaprawyWTrakcie.txt"));
                        for (Repair repair : repairInProgress) {
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


