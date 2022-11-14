package com.example.customer;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {
    @Autowired
    CustomerRepository customerRepository;
    public void registerCustomer(CustomerDTO customerDTO) {
        Customer customer = Customer.builder()
                .customerName(customerDTO.customerName())
                .email(customerDTO.email())
                .build();
        customerRepository.save(customer);
    }
}
