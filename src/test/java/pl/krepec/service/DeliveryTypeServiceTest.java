package pl.krepec.service;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import pl.krepec.service.dto.DeliveryTypeDTO;
import pl.krepec.service.repository.DeliveryTypeRepository;
import pl.krepec.service.repository.model.DeliveryType;

import static org.mockito.Matchers.any;
import static org.mockito.Mockito.when;

public class DeliveryTypeServiceTest {

    @InjectMocks
    private DeliveryTypeService deliveryTypeService;

    @Mock
    private DeliveryTypeRepository mockDeliveryTypeRepository;

    @Before
    public void setUp(){
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void shouldAddNewDeliveryType(){
        // given
        DeliveryType deliveryType = new DeliveryType(1L, "Stacjonarna");
        when(mockDeliveryTypeRepository.save(any(DeliveryType.class))).thenReturn(deliveryType);

        // when
        DeliveryType result = deliveryTypeService.addNewDelivertyType(new DeliveryTypeDTO());

        // then
        Assert.assertEquals(deliveryType,result);
    }



}
