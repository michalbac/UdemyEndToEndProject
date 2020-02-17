package com.michal.customer.dal;

import com.michal.customer.dal.entities.Customer;
import com.michal.customer.dal.repository.CustomerRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

@SpringBootTest
class CustomerdataApplicationTests {

    @Autowired
    CustomerRepository customerRepository;

    @Test
    void testCreateCustomer() {
        Customer customer = new Customer();
        customer.setName("Marco");
        customer.setEmail("marco.polo@yahoo.com");

        customerRepository.save(customer);
    }

    @Test
    void testFindCustomerById() {
        Optional<Customer> customerOptional = customerRepository.findById(1L);
        if (customerOptional.isPresent()){
            System.out.println(customerOptional.get());
        }
    }

    @Test
    void testUpdateCustomerById() {
        Optional<Customer> optionalCustomer = customerRepository.findById(1L);
        if (optionalCustomer.isPresent()){
            Customer customer = optionalCustomer.get();
            customer.setName("Phil");
            customerRepository.save(customer);
        }
    }

    @Test
    void testDeleteCustomerById() {
        customerRepository.deleteById(1L);
    }
}
