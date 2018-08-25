package pl.krepec.service;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import pl.krepec.service.dto.PartDTO;
import pl.krepec.service.repository.PartRepository;
import pl.krepec.service.repository.model.Part;

import static org.mockito.Matchers.refEq;
import static org.mockito.Mockito.when;

public class PartServiceTest {
    
    @InjectMocks
    private PartService partService;

    @Mock
    private PartRepository mockPartRepository;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }


    @Test
    public void shpuldAddNewPart() {

        // given
        Part part = new Part(3L, 4L,"Lcd", 50.0);
        when(mockPartRepository.save(refEq(new Part(3L, 4L,"Lcd", 50.0)))).thenReturn(part);

        // when
        Part result = partService.addNewPart(new PartDTO(3L, 4L,"Lcd", 50.0));

        // then
        Assert.assertEquals(part, result);


    }
}
