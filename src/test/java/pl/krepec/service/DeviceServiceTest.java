package pl.krepec.service;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import pl.krepec.service.dto.DeviceDTO;
import pl.krepec.service.repository.DeviceRepository;
import pl.krepec.service.repository.model.Device;
import pl.krepec.service.repository.model.Status;

import static org.mockito.Matchers.refEq;
import static org.mockito.Mockito.when;

public class DeviceServiceTest {

    @InjectMocks
    private DeviceService deviceService;

    @Mock
    private DeviceRepository mockDeviceRepository;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }


    @Test
    public void shpuldAddNewDevice() {

        // given
        Device device = new Device(3L,"LG","K600","508Kyyt3243254",1234443267890L,"scratches on back");
        when(mockDeviceRepository.save(refEq(new Device(1L,"LG","K500","505KPCA555344",1234567890L,"scratches on back")))).thenReturn(device);

        // when
        Device result = deviceService.addNewDevice(new DeviceDTO(1L,"LG","K500","505KPCA555344",1234567890L,"scratches on back"));

        // then
        Assert.assertEquals(device, result);


    }
}
