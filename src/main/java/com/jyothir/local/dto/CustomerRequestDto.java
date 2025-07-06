package com.jyothir.local.dto;

public class CustomerRequestDto {
    private String customerName;
    private String email;
    private String password;

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

    public CustomerRequestDto(String customerName, String email, String password) {
        this.customerName = customerName;
        this.email = email;
        this.password = password;
    }

    public CustomerRequestDto(){

    }

    @Override
    public String toString() {
        return "CustomerRequestDto{" +
                "customerName='" + customerName + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
