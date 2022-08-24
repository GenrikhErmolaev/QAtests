package com.demoqa.utils;


public class UserLong  {
    public String gender;
    public String mobileNum;
    public String dateOfBirth;
    public String subject;
    public String hobbies;
    public String firstName;
    public String lastName;
    public String emailAddress;
    public String currentAddress;

    public UserLong( String firstName, String lastName, String emailAddress, String mobileNum,
                     String subject, String currentAddress) {
        this.emailAddress = emailAddress;
        this.currentAddress = currentAddress;
        this.mobileNum = mobileNum;
        this.subject = subject;
        this.firstName = firstName;
        this.lastName = lastName;
    }


    public String getGender() {
        return gender;
    }

    public String getMobileNum() {
        return mobileNum;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public String getSubject() {
        return subject;
    }

    public String getHobbies() {
        return hobbies;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}
