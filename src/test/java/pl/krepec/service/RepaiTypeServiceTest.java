package pl.krepec.service;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import pl.krepec.service.dto.RepairTypeDTO;
import pl.krepec.service.repository.RepairTypeRepository;
import pl.krepec.service.repository.model.RepairType;

import static org.mockito.Matchers.refEq;
import static org.mockito.Mockito.when;

public class RepaiTypeServiceTest {
    
    @InjectMocks
    private RepairTypeService repairTypeService;

    @Mock
    private RepairTypeRepository mockRepairTypeRepository;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }


    @Test
    public void shpuldAddNewRepairType() {

        // given
        RepairType repairType = new RepairType(2,"Cary in service");
        when(mockRepairTypeRepository.save(refEq(new RepairType(7,"Delivery")))).thenReturn(repairType);

        // when
        RepairType result = repairTypeService.addNewRepairType(new RepairTypeDTO(7,"Delivery"));

        // then
        Assert.assertEquals(repairType, result);


    }
}
