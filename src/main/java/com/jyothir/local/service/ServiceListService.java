package com.jyothir.local.service;

import com.jyothir.local.dto.ServiceRequestDto;
import com.jyothir.local.dto.ServiceResponseDto;
import com.jyothir.local.model.ServiceList;

import java.util.List;

public interface ServiceListService {

    ServiceList createService(ServiceRequestDto serviceRequestDto);

    ServiceList getServiceById(int serviceId);

    List<ServiceList> getAllServices();

    ServiceList updateService(int serviceId, ServiceRequestDto updatedService);

    void deletedServiceById(int serviceId);

    List<ServiceResponseDto> getServicesByCustomerId(int customerId);

}
