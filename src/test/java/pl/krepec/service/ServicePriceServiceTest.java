package pl.krepec.service;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import pl.krepec.service.dto.ServicePriceDTO;
import pl.krepec.service.repository.ServicePriceRepository;
import pl.krepec.service.repository.model.ServicePrice;

import static org.mockito.Matchers.refEq;
import static org.mockito.Mockito.when;

public class ServicePriceServiceTest {
    
    @InjectMocks
    private ServicePriceService servicePriceService;

    @Mock
    private ServicePriceRepository mockServicePriceRepository;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }


    @Test
    public void shpuldAddNewServicePrice() {

        // given
        ServicePrice servicePrice = new ServicePrice(55L,"Level 2","Module change",120.0);
        when(mockServicePriceRepository.save(refEq(new ServicePrice(55L,"Level 4","Resodering",120.0)))).thenReturn(servicePrice);

        // when
        ServicePrice result = servicePriceService.addNewServicePrice(new ServicePriceDTO(55L,"Level 4","Resodering",120.0));

        // then
        System.out.println(servicePrice);
        System.out.println(result);

        Assert.assertEquals(servicePrice, result);

    }
}

