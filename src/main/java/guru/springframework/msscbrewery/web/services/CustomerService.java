package guru.springframework.msscbrewery.web.services;

import java.util.UUID;

import org.springframework.stereotype.Service;

import guru.springframework.msscbrewery.web.model.Customer;

public interface CustomerService {
    Customer getCustomerById(UUID id);
}