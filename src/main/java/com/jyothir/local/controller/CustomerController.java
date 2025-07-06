package com.jyothir.local.controller;

import java.util.List;

import com.jyothir.local.dto.CustomerRequestDto;
import com.jyothir.local.dto.CustomerResponseDto;
import com.jyothir.local.dto.ServiceResponseDto;
import com.jyothir.local.mapper.CustomerMapper;
import com.jyothir.local.model.Customer;
import com.jyothir.local.service.CustomerService;
import com.jyothir.local.service.ServiceListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/customer")
@CrossOrigin("*")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @Autowired
    private ServiceListService serviceListService;

    @PostMapping
    public ResponseEntity<CustomerResponseDto> createCustomer(@RequestBody CustomerRequestDto customer){
        Customer savedCustomer = customerService.createCustomer(customer);
        CustomerResponseDto responseDto = CustomerMapper.mapToCustomerResponseDto(savedCustomer);
        return new ResponseEntity<>(responseDto, HttpStatus.CREATED);
    }

    @GetMapping("{id}")
    public CustomerResponseDto getEmployeeById(@PathVariable("id") int customerId){
        return customerService.getCustomerById(customerId);
    }

    @GetMapping("/all")
    public List<Customer> getAllCustomers(){
        return customerService.getAllCustomers();
    }

    @DeleteMapping("{id}")
    public String deleteEmployeeById(@PathVariable("id") int customerId){
        return customerService.deleteById(customerId);
    }

    @PutMapping("{id}")
    public Customer updateCustomer(@PathVariable("id") int customerId, @RequestBody Customer updateCustomer){
        return customerService.updateCustomer(customerId, updateCustomer);
    }

    @GetMapping("{id}/services")
    public ResponseEntity<List<ServiceResponseDto>> getAllServicesByCustomer(@PathVariable("id") int customerId){
        List<ServiceResponseDto> services = serviceListService.getServicesByCustomerId(customerId);
        return ResponseEntity.ok(services);
    }
}
