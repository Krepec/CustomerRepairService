package pl.krepec.service;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Matchers;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import pl.krepec.service.dto.StatusDTO;
import pl.krepec.service.repository.StatusRepository;
import pl.krepec.service.repository.model.Status;

import static org.mockito.Matchers.any;
import static org.mockito.Mockito.when;


public class StatusServiceTest {

    @InjectMocks
    private StatusService statusService;

    @Mock
    private StatusRepository mockStatusRepository;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    } // inicjalizacja mocków w tej klasie (this)

    @Test
    public void shouldReadFromDataBase() {

        Status status = new Status(1L, "Trwa");
        when(mockStatusRepository.findOne(Matchers.anyObject())).thenReturn(status);


    }

    @Test
    public void shpuldAddNewStatus() {

        // given
        Status status = new Status(1L, "In progres");  // inicjalizujemy obiekt którychcemy zwracać
        when(mockStatusRepository.save(any(Status.class))).thenReturn(status); // kiedy zostanie wywołana metoda save z (any) kazdym elementem to zwróć obiekt status


        Status result = statusService.addNewStatus(new StatusDTO());  // wywołanie metody addNewStatus która wg, powyższego when powinna zwrocic obiekt status

        // then
        Assert.assertEquals(status, result);


    }
}

