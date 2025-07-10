package com.jyothir.local.mapper;

import com.jyothir.local.dto.ServiceRequestDto;
import com.jyothir.local.dto.ServiceResponseDto;
import com.jyothir.local.model.Customer;
import com.jyothir.local.model.ServiceList;

public class ServiceMapper {

    public static ServiceResponseDto mapToServiceResponseDto(ServiceList serviceList){
        return new ServiceResponseDto(
                serviceList.getServiceId(),
                serviceList.getServiceName(),
                serviceList.getDate(),
                serviceList.getSlot(),
                serviceList.getAddress(),
                serviceList.getVendorName(),
                serviceList.getAmount()
        );
    }

    public static ServiceList mapToServiceList(int serviceId, ServiceRequestDto serviceRequestDto, Customer customer){

        return new ServiceList(
                serviceId,
                serviceRequestDto.getServiceName(),
                serviceRequestDto.getDate(),
                serviceRequestDto.getSlot(),
                serviceRequestDto.getAddress(),
                serviceRequestDto.getVendorName(),
                serviceRequestDto.getAmount(),
                customer);
    }
}
