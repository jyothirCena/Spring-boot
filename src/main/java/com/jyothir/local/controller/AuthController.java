package com.jyothir.local.controller;

import com.jyothir.local.dto.CustomerRequestDto;
import com.jyothir.local.dto.CustomerResponseDto;
import com.jyothir.local.dto.LoginDto;
import com.jyothir.local.dto.ServiceResponseDto;
import com.jyothir.local.mapper.CustomerMapper;
import com.jyothir.local.model.Customer;
import com.jyothir.local.service.CustomerService;
import com.jyothir.local.service.ServiceListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/login")
@CrossOrigin("*")
public class AuthController {

    @Autowired
    private CustomerService customerService;

    @PostMapping
    public ResponseEntity<CustomerResponseDto> validateLogin(@RequestBody LoginDto loginDto){
        Customer customer = customerService.getCustomerById(loginDto.getCustomerId());

        if(customer.getPassword().equals(loginDto.getPassword())){
            return ResponseEntity.ok(CustomerMapper.mapToCustomerResponseDto(customer));
        }
        return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(new CustomerResponseDto());
    }

}
