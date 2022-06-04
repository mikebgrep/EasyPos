package com.mikegrep.easypos.Models;

public class User {

public enum UserType {
    Employee,
    Manager
}

    public String username;
    private String passwordCode;
    public UserType type;

    public User(String username, String passwordCode, UserType type) {
        this.username = username;
        this.passwordCode = passwordCode;
        this.type = type;
    }

    public String getPasswordCode() {
        return passwordCode;
    }

    public void setPasswordCode(String passwordCode) {
        this.passwordCode = passwordCode;
    }
    
    
    
}


