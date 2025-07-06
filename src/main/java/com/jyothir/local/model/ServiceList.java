package com.jyothir.local.model;

import jakarta.persistence.*;

@Entity
@Table(name = "Service")
public class ServiceList {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int serviceId;
    private String serviceName;
    private String date;
    private String slot;
    private String address;
    private String vendorName;
    private double amount;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;

    public int getServiceId() {
        return serviceId;
    }

    public void setServiceId(int serviceId) {
        this.serviceId = serviceId;
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

    public ServiceList(int serviceId, String serviceName, String date, String slot, String address, String vendorName, double amount, Customer customer) {
        this.serviceId = serviceId;
        this.serviceName = serviceName;
        this.date = date;
        this.slot = slot;
        this.address = address;
        this.vendorName = vendorName;
        this.amount = amount;
        this.customer = customer;
    }

    public ServiceList() {

    }

    @Override
    public String toString() {
        return "ServiceList{" +
                "id=" + serviceId +
                ", serviceName='" + serviceName + '\'' +
                ", date='" + date + '\'' +
                ", slot='" + slot + '\'' +
                ", address='" + address + '\'' +
                ", vendorName='" + vendorName + '\'' +
                ", amount=" + amount +
                '}';
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}
