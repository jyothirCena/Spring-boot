package com.jyothir.local.service;

import com.jyothir.local.dto.ServiceRequestDto;
import com.jyothir.local.dto.ServiceResponseDto;
import com.jyothir.local.mapper.ServiceMapper;
import com.jyothir.local.model.Customer;
import com.jyothir.local.model.ServiceList;
import com.jyothir.local.repository.CustomerRepository;
import com.jyothir.local.repository.ServiceRepository;
import com.jyothir.local.utility.Utility;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ServiceListServiceImpl implements ServiceListService{

    @Autowired
    private ServiceRepository serviceRepository;

    @Autowired
    private CustomerRepository customerRepository;
    @Override
    public ServiceList createService(ServiceRequestDto serviceRequestDto) {

        Customer customer = customerRepository.findById(serviceRequestDto.getCustomerId())
                .orElseThrow(() -> new RuntimeException("Customer does not exist with id "+ serviceRequestDto.getCustomerId()));

        int serviceId = Utility.nDigitRandomNo(5);

        ServiceList serviceList = ServiceMapper.mapToServiceList(serviceId, serviceRequestDto, customer);

        return serviceRepository.save(serviceList);
    }

    @Override
    public ServiceList getServiceById(int serviceId) {
        return serviceRepository.findById(serviceId)
                .orElseThrow(() -> new RuntimeException("Service does not exist with given id "+serviceId));
    }

    @Override
    public List<ServiceList> getAllServices() {
        return serviceRepository.findAll();
    }

    @Override
    public ServiceList updateService(int serviceId, ServiceRequestDto updatedService) {

        Customer customer = customerRepository.findById(updatedService.getCustomerId())
                .orElseThrow(() -> new RuntimeException("Customer does not exist with id "+ updatedService.getCustomerId()));

        return serviceRepository.findById(serviceId)
                .map(service -> {service.setServiceName(updatedService.getServiceName());
                service.setDate(updatedService.getDate());
                service.setSlot(updatedService.getSlot());
                service.setVendorName(updatedService.getVendorName());
                service.setAddress(updatedService.getAddress());
                service.setAmount(updatedService.getAmount());
                service.setCustomer(customer);
                return service;}
                )
                .orElseThrow(() -> new RuntimeException("Service does not exist with given id "+serviceId));
    }

    @Override
    public void deletedServiceById(int serviceId) {
        serviceRepository.findById(serviceId)
                .orElseThrow(() -> new RuntimeException("Service does not exist with given id "+serviceId));
        serviceRepository.deleteById(serviceId);
    }

    @Override
    public List<ServiceList> getServicesByCustomerId(int customerId){
        return serviceRepository.getServicesByCustomerId(customerId);
    }

}
