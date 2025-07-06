package com.jyothir.local.mapper;

import com.jyothir.local.dto.CustomerResponseDto;
import com.jyothir.local.dto.ServiceResponseDto;
import com.jyothir.local.model.Customer;

import java.util.List;

public class CustomerMapper {

    public static CustomerResponseDto mapToCustomerResponseDto(Customer customer){

        // Adding services to the customer -> services list

//        List<ServiceResponseDto> serviceResponseDtos = customer
//                .getServices()
//                .stream()
//                .map(ServiceMapper::mapToServiceResponseDto)
//                .toList();

        return new CustomerResponseDto(
                customer.getCustomerId(),
                customer.getCustomerName(),
                customer.getEmail()
        );
    }
}
