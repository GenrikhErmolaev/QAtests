package com.demoqa.pages;

import static com.codeborne.selenide.Selenide.page;

public class FormsPageStep {
    public static void practiceFormsCheck(String firstName, String lastName, String emailAddress, String mobileNum,
                                          String subject, String currentAddress) {
        String day = "18";
        String month = "January";
        String year = "1983";
        page(FormsPage.class).practiceFormClick()
                .setFirstName(firstName)
                .setLastName(lastName)
                .setEmailADDRESS(emailAddress)
                .setGender()
                .setMobileNumber(mobileNum)
                .setDateOfBirth(day,month,year)
                .setSubject(subject)
                .setHobbies()
                .setCurrentAddress(currentAddress)
                .clickSubmitButton()
                .checkFormsSubmit();
    }
}
