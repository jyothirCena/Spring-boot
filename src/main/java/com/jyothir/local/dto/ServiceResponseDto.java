package com.jyothir.local.dto;

import com.jyothir.local.model.Customer;

public class ServiceResponseDto {
    private int serviceId;
    private String serviceName;
    private String date;
    private String slot;
    private String address;
    private String vendorName;
    private double amount;

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getSlot() {
        return slot;
    }

    public void setSlot(String slot) {
        this.slot = slot;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getVendorName() {
        return vendorName;
    }

    public void setVendorName(String vendorName) {
        this.vendorName = vendorName;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public ServiceResponseDto(int serviceId, String serviceName, String date, String slot, String address, String vendorName, double amount) {
        this.serviceId = serviceId;
        this.serviceName = serviceName;
        this.date = date;
        this.slot = slot;
        this.address = address;
        this.vendorName = vendorName;
        this.amount = amount;
    }

    public ServiceResponseDto(){

    }

    @Override
    public String toString() {
        return "ServiceDto{" +
                "serviceId='" + serviceId + '\'' +
                ", serviceName='" + serviceName + '\'' +
                ", date='" + date + '\'' +
                ", slot='" + slot + '\'' +
                ", address='" + address + '\'' +
                ", vendorName='" + vendorName + '\'' +
                ", amount=" + amount +
                '}';
    }

    public int getServiceId() {
        return serviceId;
    }

    public void setServiceId(int serviceId) {
        this.serviceId = serviceId;
    }

}
