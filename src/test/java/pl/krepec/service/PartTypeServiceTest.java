package pl.krepec.service;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import pl.krepec.service.dto.PartTypeDTO;
import pl.krepec.service.repository.PartTypeRepository;
import pl.krepec.service.repository.model.PartType;

import static org.mockito.Matchers.refEq;
import static org.mockito.Mockito.when;

public class PartTypeServiceTest {

    @InjectMocks
    private PartTypeService partTypeService;

    @Mock
    private PartTypeRepository mockPartTypeRepository;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }


    @Test
    public void shpuldAddNewPartType() {

        // given
        PartType partType = new PartType(2,"BGA IC");
        when(mockPartTypeRepository.save(refEq(new PartType(7,"Touch")))).thenReturn(partType);

        // when
        PartType result = partTypeService.addNewPartType(new PartTypeDTO(7,"Touch"));

        // then
        Assert.assertEquals(partType, result);


    }
}
