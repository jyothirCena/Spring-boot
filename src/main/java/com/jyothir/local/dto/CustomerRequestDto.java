package com.jyothir.local.dto;

public class CustomerRequestDto {
    private String customerName;
    private String email;
    private String password;
    private String address;
    private String number;

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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public CustomerRequestDto(String customerName, String email, String password, String address, String number) {
        this.customerName = customerName;
        this.email = email;
        this.password = password;
        this.address = address;
        this.number = number;
    }

    public CustomerRequestDto(){

    }

    @Override
    public String toString() {
        return "CustomerRequestDto{" +
                "customerName='" + customerName + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", address='" + address + '\'' +
                ", number='" + number + '\'' +
                '}';
    }
}
