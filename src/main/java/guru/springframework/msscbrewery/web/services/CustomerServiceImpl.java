package guru.springframework.msscbrewery.web.services;

import java.util.UUID;

import org.springframework.stereotype.Service;

import guru.springframework.msscbrewery.web.model.CustomerDto;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Override
    public CustomerDto getCustomerById(UUID id) {
        return CustomerDto.builder()
        .id(UUID.randomUUID())
        .name("Some Dude")
        .build();
    }
    
}