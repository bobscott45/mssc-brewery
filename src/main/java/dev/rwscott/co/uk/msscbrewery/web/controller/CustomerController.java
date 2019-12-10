package dev.rwscott.co.uk.msscbrewery.web.controller;

import dev.rwscott.co.uk.msscbrewery.service.CustomerService;
import dev.rwscott.co.uk.msscbrewery.web.model.CustomerDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.UUID;

@Controller
@RequestMapping("/api/v1/customer")
public class CustomerController {

    private final CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping("/{customerId}")
    public ResponseEntity<CustomerDto> getCustomer(@PathVariable UUID customerId) {
        CustomerDto customerDto = customerService.getCustomerById(customerId);
        ResponseEntity<CustomerDto> responseEntity = new ResponseEntity<>(customerDto, HttpStatus.OK);
        return responseEntity;
    }
}
