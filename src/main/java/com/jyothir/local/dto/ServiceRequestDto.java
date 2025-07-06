package com.jyothir.local.dto;

public class ServiceRequestDto {

    private int id;
    private String serviceName;
    private String date;
    private String slot;
    private String address;
    private String vendorName;
    private double amount;
    private int customerId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

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

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public ServiceRequestDto(int id, String serviceName, String date, String slot, String address, String vendorName, double amount, int customerId) {
        this.id = id;
        this.serviceName = serviceName;
        this.date = date;
        this.slot = slot;
        this.address = address;
        this.vendorName = vendorName;
        this.amount = amount;
        this.customerId = customerId;
    }

    public ServiceRequestDto(){

    }

    @Override
    public String toString() {
        return "ServiceRequestDto{" +
                "id=" + id +
                ", serviceName='" + serviceName + '\'' +
                ", date='" + date + '\'' +
                ", slot='" + slot + '\'' +
                ", address='" + address + '\'' +
                ", vendorName='" + vendorName + '\'' +
                ", amount=" + amount +
                ", customerId=" + customerId +
                '}';
    }
}
