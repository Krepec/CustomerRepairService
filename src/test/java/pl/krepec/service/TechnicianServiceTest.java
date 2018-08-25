package pl.krepec.service;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import pl.krepec.service.dto.TechnicianDTO;
import pl.krepec.service.repository.TechnicianRepository;
import pl.krepec.service.repository.model.Technician;

import static org.mockito.Matchers.refEq;
import static org.mockito.Mockito.when;

public class TechnicianServiceTest {

    @InjectMocks
    private TechnicianService technicianService;

    @Mock
    private TechnicianRepository mockTechnicianRepository;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }


    @Test
    public void shpuldAddNewTechnician() {

        // given
        Technician technician = new Technician(12,"Adam","Kowalski");
        when(mockTechnicianRepository.save(refEq(new Technician(12,"Adam","Kowalski")))).thenReturn(technician);

        // when
        Technician result = technicianService.addNewTechnician(new TechnicianDTO(12,"Adam","Kowalski"));

        // then
        Assert.assertEquals(technician, result);

    }
}

