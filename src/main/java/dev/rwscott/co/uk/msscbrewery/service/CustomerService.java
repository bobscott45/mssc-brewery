package dev.rwscott.co.uk.msscbrewery.service;

import dev.rwscott.co.uk.msscbrewery.web.model.CustomerDto;

import java.util.UUID;

public interface CustomerService {
    CustomerDto getCustomerById(UUID id);
}
