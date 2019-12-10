package dev.rwscott.co.uk.msscbrewery.service;

import dev.rwscott.co.uk.msscbrewery.web.model.CustomerDto;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class CustomerServiceImpl implements CustomerService{
    @Override
    public CustomerDto getCustomerById(UUID id) {
        CustomerDto customerDto = CustomerDto.builder()
                .id(id)
                .name("Fred Jones")
                .build();
        return customerDto;
    }
}
