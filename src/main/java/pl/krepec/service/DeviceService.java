package pl.krepec.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.krepec.service.dto.DeviceDTO;
import pl.krepec.service.repository.DeviceRepository;
import pl.krepec.service.repository.model.Device;

import java.util.ArrayList;
import java.util.List;

@Service
public class DeviceService {

    @Autowired
    private DeviceRepository deviceRepository;

    private DeviceDTO mapDevice(Device device) {

        DeviceDTO deviceDTO = new DeviceDTO(device.getDeviceId(), device.getMark(), device.getModel(),
                device.getSerialNumber(), device.getImei(), device.getComments());

        return deviceDTO;
    }

    public Iterable<DeviceDTO> findAllDevices() {
        List<DeviceDTO> deviceDTOlist = new ArrayList<DeviceDTO>();
        Iterable<Device> deviceList = deviceRepository.findAll();

        for (Device device : deviceList) {
            DeviceDTO deviceDTO = mapDevice(device);
            deviceDTOlist.add(deviceDTO);
        }
        return deviceDTOlist;

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

    public Iterable<DeviceDTO> findByImei(Long imei) {
        List<DeviceDTO> deviceDTOlist = new ArrayList<DeviceDTO>();

        Iterable<Device> deviceList = deviceRepository.findByImei(imei);

        for (Device device : deviceList) {
            DeviceDTO deviceDTO = mapDevice(device);
            deviceDTOlist.add(deviceDTO);
        }
        return deviceDTOlist;

    }

    public Iterable<DeviceDTO> findByModel(String model) {
        List<DeviceDTO> deviceDTOList = new ArrayList<DeviceDTO>();
        List<Device> deviceList = deviceRepository.findByModel(model);

        for (Device device : deviceList) {
            DeviceDTO deviceDTO = mapDevice(device);
            deviceDTOList.add(deviceDTO);
        }
        return deviceDTOList;

    }

    public Iterable<DeviceDTO> findByMark(String mark) {
        List<DeviceDTO> deviceDTOList = new ArrayList<DeviceDTO>();
        List<Device> deviceList = deviceRepository.findByMark(mark);

        for (Device device : deviceList) {
            DeviceDTO deviceDTO = mapDevice(device);
            deviceDTOList.add(deviceDTO);
        }
        return deviceDTOList;

    }

    public Integer addNewDevice(DeviceDTO deviceDTO) {
        Device device = deviceRepository.save(new Device(deviceDTO.getDeviceId(), deviceDTO.getMark(),
                deviceDTO.getModel(), deviceDTO.getSerialNumber(), deviceDTO.getImei(), deviceDTO.getComments()));
        return deviceDTO.getDeviceId();
    }


}
