package com.jyothir.local.dto;

public class LoginDto {

    private int customerId;
    private String password;



    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public LoginDto(int customerId, String password) {
        this.customerId = customerId;
        this.password = password;
    }

    public LoginDto(){

    }

    @Override
    public String toString() {
        return "LoginDto{" +
                "customerId='" + customerId + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }
}
