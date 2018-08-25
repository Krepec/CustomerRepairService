package pl.krepec.service;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import pl.krepec.service.repository.RepairCriteriaRepository;
import pl.krepec.service.repository.model.Repair;

import java.util.InputMismatchException;
import java.util.List;

import static org.mockito.Mockito.when;

//przykład wykorzystywania MockitoJUnitRunner zamiast adnotcji @Befire z inject mocks
@RunWith(MockitoJUnitRunner.class)
public class RepairServiceTest {

    @InjectMocks
    private RepairService repairService;

    @Mock
    private RepairCriteriaRepository mockRepairRepository;

    @Test
    public void shouldReturnEmptyListWhenExeption()  {

        // given
        when(mockRepairRepository.findRepairsByCustomerInfo(1L,",","","","")).thenThrow( new InputMismatchException());

       // when
        List<Repair> result = repairService.findRepairsByCustomerInfo(1L,",","","","");

       // then
        Assert.assertTrue(result.isEmpty());

    }



}
