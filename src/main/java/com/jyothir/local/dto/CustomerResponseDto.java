package com.jyothir.local.dto;

import com.jyothir.local.model.ServiceList;

import java.util.ArrayList;
import java.util.List;

public class CustomerResponseDto {

    private int customerId;
    private String customerName;
    private String email;
    private List<ServiceResponseDto> services;

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public CustomerResponseDto(int customerId, String customerName, String email, List<ServiceResponseDto> services) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.email = email;
        this.services = services;
    }

    public CustomerResponseDto(){

    }

    @Override
    public String toString() {
        return "CustomerResponseDto{" +
                "customerId=" + customerId +
                ", customerName='" + customerName + '\'' +
                ", email='" + email + '\'' +
                ", services='" + services + '\'' +
                '}';
    }

    public List<ServiceResponseDto> getServices() {
        return services;
    }

    public void setServices(List<ServiceResponseDto> services) {
        this.services = services;
    }
}
