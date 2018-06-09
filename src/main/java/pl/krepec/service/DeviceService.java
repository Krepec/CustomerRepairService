package pl.krepec.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.krepec.service.model.CustomerDTO;
import pl.krepec.service.model.DeviceDTO;
import pl.krepec.service.repository.DeviceRepository;
import pl.krepec.service.repository.model.Device;

import java.util.ArrayList;
import java.util.List;

@Service
public class DeviceService {

    @Autowired
    private DeviceRepository deviceRepository;

    public DeviceDTO mapDevice(Device device) {

        DeviceDTO deviceDTO = new DeviceDTO(device.getDeviceId(), device.getMark(), device.getModel(),
                device.getSerialNumber(), device.getImei(), device.getComments());

        return deviceDTO;
    }


    public Iterable<DeviceDTO> findBySerialNumber(String serialNumber) {
        List<DeviceDTO> deviceDTOlist = new ArrayList<DeviceDTO>();
        Iterable<Device> devicelist = deviceRepository.findBySerialNumber(serialNumber);
        for (Device device : devicelist) {
            DeviceDTO deviceDTO = mapDevice(device);
            deviceDTOlist.add(deviceDTO);
        }
        return deviceDTOlist;
    }
}
