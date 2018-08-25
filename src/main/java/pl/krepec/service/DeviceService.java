package pl.krepec.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.krepec.service.dto.CustomerDTO;
import pl.krepec.service.dto.DeviceDTO;
import pl.krepec.service.repository.DeviceRepository;
import pl.krepec.service.repository.model.Customer;
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

    public Iterable<DeviceDTO> find(String serialNumber, Long imei, String model, String mark) {

        if (serialNumber != null) {
            return findBySerialNumber(serialNumber);
        } else if (imei != null) {
            return findByImei(imei);
        } else if (model != null) {
            return findByModel(model);
        } else if (mark != null) {
            return findByMark(mark);
        }
        return getAllDevices();
    }

    private Iterable<DeviceDTO> getAllDevices() {
        List<DeviceDTO> deviceDTOlist = new ArrayList<DeviceDTO>();
        Iterable<Device> deviceList = deviceRepository.findAll();

        for (Device device : deviceList) {
            DeviceDTO deviceDTO = mapDevice(device);
            deviceDTOlist.add(deviceDTO);
        }
        return deviceDTOlist;
    }

    public DeviceDTO fingById(Long deviceId) {

        Device device = deviceRepository.findOne(deviceId);
        DeviceDTO deviceDTO = mapDevice(device);

        return deviceDTO;
    }



    private Iterable<DeviceDTO> findBySerialNumber(String serialNumber) {
        List<DeviceDTO> deviceDTOlist = new ArrayList<DeviceDTO>();

        Iterable<Device> devicelist = deviceRepository.findBySerialNumber(serialNumber);

        for (Device device : devicelist) {
            DeviceDTO deviceDTO = mapDevice(device);
            deviceDTOlist.add(deviceDTO);
        }
        return deviceDTOlist;
    }

    private Iterable<DeviceDTO> findByImei(Long imei) {
        List<DeviceDTO> deviceDTOlist = new ArrayList<DeviceDTO>();

        Iterable<Device> deviceList = deviceRepository.findByImei(imei);

        for (Device device : deviceList) {
            DeviceDTO deviceDTO = mapDevice(device);
            deviceDTOlist.add(deviceDTO);
        }
        return deviceDTOlist;

    }

    private Iterable<DeviceDTO> findByModel(String model) {
        List<DeviceDTO> deviceDTOList = new ArrayList<DeviceDTO>();
        List<Device> deviceList = deviceRepository.findByModel(model);

        for (Device device : deviceList) {
            DeviceDTO deviceDTO = mapDevice(device);
            deviceDTOList.add(deviceDTO);
        }
        return deviceDTOList;

    }

    private Iterable<DeviceDTO> findByMark(String mark) {
        List<DeviceDTO> deviceDTOList = new ArrayList<DeviceDTO>();
        List<Device> deviceList = deviceRepository.findByMark(mark);

        for (Device device : deviceList) {
            DeviceDTO deviceDTO = mapDevice(device);
            deviceDTOList.add(deviceDTO);
        }
        return deviceDTOList;

    }

    public Device addNewDevice(DeviceDTO deviceDTO) {
        Device device = deviceRepository.save(new Device(deviceDTO.getDeviceId(), deviceDTO.getMark(),
                deviceDTO.getModel(), deviceDTO.getSerialNumber(), deviceDTO.getImei(), deviceDTO.getComments()));
        return device;
    }


}
