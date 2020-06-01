package guru.springframework.msscbrewery.web.services;

import java.util.UUID;

import org.springframework.stereotype.Service;

import guru.springframework.msscbrewery.web.model.CustomerDto;

public interface CustomerService {
    CustomerDto getCustomerById(UUID id);
}