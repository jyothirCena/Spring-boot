package com.jyothir.local.service;

import com.jyothir.local.dto.CustomerRequestDto;
import com.jyothir.local.dto.CustomerResponseDto;
import com.jyothir.local.model.Customer;

import java.util.List;
import java.util.Optional;

public interface CustomerService {

    Customer createCustomer(CustomerRequestDto customer);

    CustomerResponseDto getCustomerById(int customerId);

    List<Customer> getAllCustomers();

    String deleteById(int customerId);

    Customer updateCustomer(int customerId, Customer updateCustomer);

    Optional<Customer> getCustomerByEmail(String email);
}
