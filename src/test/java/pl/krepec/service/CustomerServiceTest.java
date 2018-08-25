package pl.krepec.service;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Matchers;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import pl.krepec.service.dto.CustomerDTO;
import pl.krepec.service.repository.CustomerRepository;
import pl.krepec.service.repository.model.Customer;

import static org.mockito.Matchers.any;
import static org.mockito.Matchers.refEq;
import static org.mockito.Mockito.when;

public class CustomerServiceTest {

    @InjectMocks
    private CustomerService customerService;

    @Mock
    private CustomerRepository mockCustomerRepository;

    @Before
    public void setUp(){
        MockitoAnnotations.initMocks(this);

    }

    @Test

    public void shouldAddNewCustomer(){

        // given
        Customer customer = new Customer(25L,"Adam","Kowalski","123456",
                "654321","Wspolna","2","31","00-000",
                "Warszawa","kowalski@yahoo.com");
        when(mockCustomerRepository.save(refEq(new Customer(55L,"Adam","Kowalski","123456",
                "654321","Wspolna","2","31","00-000",
                "Warszawa","kowalski@yahoo.com")))).thenReturn(customer);

        // when
        Customer result = customerService.addNewCustomer(new CustomerDTO(55L,"Adam","Kowalski","123456",
                "654321","Wspolna","2","31","00-000",
                "Warszawa","kowalski@yahoo.com"));

        // then
        Assert.assertEquals(customer,result);
    }

}
