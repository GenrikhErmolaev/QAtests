package com.demoqa.utils;

public class UserShort {
    private String fullName;
    private String emailAddress;
    private String currentAddress;
    private String permanentAddress;

//    public UserShort(String fullName) {
//        this.fullName = fullName;
//        this.emailAddress = emailAddress;
//        this.currentAddress = currentAddress;
//        this.permanentAddress = permanentAddress;
//    }

    public UserShort(String fullName,String emailAddress, String currentAddress, String permanentAddress) {
        this.fullName = fullName;
        this.emailAddress = emailAddress;
        this.currentAddress = currentAddress;
        this.permanentAddress = permanentAddress;
    }

    public String getFullName() {
        return fullName;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public String getCurrentAddress() {
        return currentAddress;
    }

    public String getPermanentAddress() {
        return permanentAddress;
    }
}
