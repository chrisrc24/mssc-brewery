package guru.springframework.msscbrewery.web.services;

import java.util.UUID;

import org.springframework.stereotype.Service;

import guru.springframework.msscbrewery.web.model.Customer;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Override
    public Customer getCustomerById(UUID id) {
        return Customer.builder()
        .id(UUID.randomUUID())
        .name("Some Dude")
        .build();
    }
    
}