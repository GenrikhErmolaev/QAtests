package com.demoqa.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;


public class FormsPage {
    @FindBy(xpath = "//li[@class=\"btn btn-light \"]//*[text()=\"Practice Form\"]")
    public SelenideElement practiceFormItem;

    public FormsPage practiceFormClick() {
        this.practiceFormItem.shouldBe(Condition.visible).click();
        return this;
    }

    @FindBy(xpath = "//*[@id=\"firstName\"]")
    public SelenideElement firstName;

    public FormsPage setFirstName(String firstName) {
        this.firstName.shouldBe(Condition.visible).sendKeys(firstName);
        return this;
    }

    @FindBy(xpath = "//*[@id=\"lastName\"]")
    public SelenideElement lastName;

    public FormsPage setLastName(String lastName) {
        this.lastName.shouldBe(Condition.visible).sendKeys(lastName);
        return this;
    }

    @FindBy(xpath = "//*[@id=\"userEmail\"]")
    public SelenideElement emailAddress;

    public FormsPage setEmailADDRESS(String email) {
        this.emailAddress.shouldBe(Condition.visible).sendKeys(email);
        return this;
    }

    @FindBy(css = "label[for=\"gender-radio-1\"]")
    public SelenideElement genderSet;

    public FormsPage setGender() {
        this.genderSet.shouldBe(Condition.visible).click();
        return this;
    }

    @FindBy(xpath = "//*[@id=\"userNumber\"]")
    public SelenideElement mobileNumber;

    public FormsPage setMobileNumber(String mobileNumber) {
        this.mobileNumber.shouldBe(Condition.visible).sendKeys(mobileNumber);
        return this;
    }

    @FindBy(xpath = "//*[@id=\"dateOfBirthInput\"]")
    public SelenideElement dateOfBirth;
    @FindBy(xpath = "//*[@class=\"react-datepicker__year-select\"]")
    public SelenideElement chooseYear;
    @FindBy(xpath = "//*[@class=\"react-datepicker__month-select\"]")
    public SelenideElement chooseMonth;

    @FindBy(xpath = "//*[@class=\"react-datepicker__month\"]//*[text()='18']")
    public SelenideElement chooseDay;
    @FindBy(xpath = "//*[@id=\"subjectsInput\"]")
    public SelenideElement fieldSubject;

    public FormsPage setSubject(String subject) {
        this.fieldSubject.shouldBe(Condition.visible).sendKeys(subject);
        return this;
    }

    @FindBy(xpath = "//*[@id='submit']")
    public SelenideElement submitButton;

    public FormsPage clickSubmitButton() {
        this.submitButton.scrollTo().shouldBe(Condition.visible).pressEnter();
        return this;
    }

    @FindBy(xpath = "//*[@id=\"example-modal-sizes-title-lg\"]")
    public SelenideElement confirmFormsSubmit;

    public FormsPage checkFormsSubmit() {
        this.confirmFormsSubmit.shouldBe(Condition.visible);
        return this;
    }

    @FindBy( css = "label[for=\"hobbies-checkbox-1\"]")
    public SelenideElement hobbiesSport;

    public FormsPage setHobbies() {
        this.hobbiesSport.click();
        return this;
    }

    @FindBy(xpath = "//*[@id=\"currentAddress\"]")
    public SelenideElement fieldCurrentAddress;

    public FormsPage setCurrentAddress(String address) {
        this.fieldCurrentAddress.shouldBe(Condition.visible).sendKeys(address);
        return this;
    }

    public FormsPage setDateOfBirth(String day, String month, String year) {
        this.dateOfBirth.click();
        this.chooseMonth.selectOption(month);
        this.chooseYear.selectOption(year);
        this.chooseDay.click();
        return this;
    }
}
