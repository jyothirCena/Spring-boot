package com.jyothir.local.service;

import com.jyothir.local.dto.CustomerRequestDto;
import com.jyothir.local.dto.CustomerResponseDto;
import com.jyothir.local.mapper.CustomerMapper;
import com.jyothir.local.model.Customer;
import com.jyothir.local.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerServiceImpl implements CustomerService{

    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public Customer createCustomer(CustomerRequestDto customerDto) {

        Customer customer = new Customer();

        customer.setCustomerName(customerDto.getCustomerName());
        customer.setEmail(customerDto.getEmail());
        customer.setPassword(customerDto.getPassword());

        return customerRepository.save(customer);
    }

    @Override
    public CustomerResponseDto getCustomerById(int customerId) {

       Customer customer = customerRepository.findById(customerId)
               .orElseThrow(() -> new RuntimeException("Customer does not exist with id "+customerId));

       CustomerResponseDto responseDto = CustomerMapper.mapToCustomerResponseDto(customer);

       return responseDto;
    }

    @Override
    public List<Customer> getAllCustomers() {
        return customerRepository.findAll();
    }

    @Override
    public String deleteById(int customerId) {
        boolean customer = customerRepository.existsById(customerId);
        if(customer){
            customerRepository.deleteById(customerId);
            return "Customer "+customerId+" deleted successfully";
        }
        return "There is no customer with the id "+customerId;
    }

    @Override
    public Customer updateCustomer(int customerId, Customer updateCustomer) {

        Customer newCustomer = customerRepository.findById(customerId)
                .map(customer -> {customer.setCustomerName(updateCustomer.getCustomerName());
                        customer.setEmail(updateCustomer.getEmail());
                        customer.setPassword(updateCustomer.getPassword());
                        return customer;})
                .orElseThrow( () -> new RuntimeException("No Customer exists "+customerId));

        return customerRepository.save(newCustomer);
    }

    @Override
    public Optional<Customer> getCustomerByEmail(String email) {
        return customerRepository.getCustomerByEmail(email);
    }

}
