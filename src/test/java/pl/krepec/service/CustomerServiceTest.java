package pl.krepec.service;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import pl.krepec.service.dto.CustomerDTO;
import pl.krepec.service.repository.CustomerRepository;
import pl.krepec.service.repository.model.Customer;

import static org.mockito.Matchers.any;
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
        Customer customer = new Customer(55L,"Adam","Kowalski","123456",
                "654321","Wspolna","2","31","00-000",
                "Warszawa","kowalski@yahoo.com");
        when(mockCustomerRepository.save(any(Customer.class))).thenReturn(customer);

        // when
        Customer result = customerService.addNewCustomer(new CustomerDTO());

        // then
        Assert.assertEquals(customer,result);
    }

}
