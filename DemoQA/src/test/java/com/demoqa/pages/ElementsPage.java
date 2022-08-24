package com.demoqa.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;

public class ElementsPage {
    @FindBy(xpath = "//li[@class=\"btn btn-light \"]//*[text()=\"Text Box\"]")
    public SelenideElement textBoxItem;
    @FindBy(xpath = "//li[@class=\"btn btn-light \"]//*[text()=\"Check Box\"]")
    public SelenideElement checkBoxItem;
    @FindBy(xpath = "//li[@class=\"btn btn-light \"]//*[text()=\"Buttons\"]")
    public SelenideElement bottonsItem;

    public ElementsPage clickTextBoxItem() {
        this.textBoxItem.shouldBe(Condition.visible).click();
        return this;
    }

    public ElementsPage clickCheckBoxItem() {
        this.checkBoxItem.shouldBe(Condition.visible).click();
        return this;
    }

    public ElementsPage clickButtonsItem() {
        this.bottonsItem.scrollTo().shouldBe(Condition.visible).click();
        return this;
    }

    @FindBy(xpath = "//*[@id='userName']")
    public SelenideElement fieldFullName;
    @FindBy(xpath = "//*[@id='userEmail']")
    public SelenideElement fieldEmail;
    @FindBy(xpath = "//*[@id='currentAddress']")
    public SelenideElement fieldCurrentAddress;
    @FindBy(xpath = "//*[@id='permanentAddress']")
    public SelenideElement fieldPermanentAddress;
    @FindBy(xpath = "//*[@id='submit']")
    public SelenideElement submitButton;
    @FindBy(xpath = "//*[@class='mt-4 row']//*[@id='name']")
    public SelenideElement textBoxNameAfterSubmit;

    @FindBy(xpath = "//*[@class='rct-collapse rct-collapse-btn']")
    public SelenideElement collapsButton;
    @FindBy(css = "label[for=\"tree-node-desktop\"]")
    public SelenideElement checkBoxDesktop;
    @FindBy(xpath = "//*[@class='rct-options']//*[@title='Expand all']")
    public SelenideElement expandAllButton;
    @FindBy(xpath = "//*[@class='display-result mt-4']")
    public SelenideElement checkBoxAfterSelect;
    @FindBy(xpath = "//*[@id=\"doubleClickBtn\"]")
    public SelenideElement doubleClickButton;
    @FindBy(xpath = "//*[@id=\"doubleClickMessage\"]")
    public SelenideElement doubleClickButtonConfirmation;
    @FindBy(xpath = "//*[@id=\"rightClickBtn\"]")
    public SelenideElement rigthClickButton;
    @FindBy(xpath = "//*[@id=\"rightClickMessage\"]")
    public SelenideElement rigthClickButtonConfirmation;
    @FindBy(xpath = "//*[text()=\"Click Me\"]")
    public SelenideElement clickMeButton;
    @FindBy(xpath = "//*[@id=\"dynamicClickMessage\"]")
    public SelenideElement clickMeConfirmation;


    public ElementsPage setFullName(String fullName) {
        this.fieldFullName.shouldBe(Condition.visible).sendKeys(fullName);
        return this;
    }

    public ElementsPage setEmail(String email) {
        this.fieldEmail.shouldBe(Condition.visible).sendKeys(email);
        return this;
    }

    public ElementsPage setCurrentAddress(String currentAddress) {
        this.fieldCurrentAddress.shouldBe(Condition.visible).sendKeys(currentAddress);
        return this;
    }

    public ElementsPage setPermanentAddress(String permanentAddress) {
        this.fieldPermanentAddress.shouldBe(Condition.visible).sendKeys(permanentAddress);
        return this;
    }

    public ElementsPage submitButtonClick() {
        this.submitButton.scrollTo().shouldBe(Condition.visible).click();
        return this;
    }

    public ElementsPage checkAfterSubmit() {
        this.textBoxNameAfterSubmit.shouldBe(Condition.visible);
        return this;
    }

    public ElementsPage collapsButtonClick() {
        this.collapsButton.shouldBe(Condition.visible).click();
        return this;
    }

    public ElementsPage checkBoxDesktopClick() {
        this.checkBoxDesktop.shouldBe(Condition.visible).click();
        return this;
    }

    public ElementsPage expandAllButtonCLick() {
        this.expandAllButton.shouldBe(Condition.visible).click();
        return this;
    }

    public ElementsPage confirmResultCheckBoxSelect() {
        this.checkBoxAfterSelect.shouldBe(Condition.visible);
        return this;
    }


    public ElementsPage doubleClickButtonClick() {
        this.doubleClickButton.shouldBe(Condition.visible).doubleClick();
        return this;
    }

    public ElementsPage doubleClickButtonCheck() {
        this.doubleClickButtonConfirmation.shouldBe(Condition.visible);
        return this;
    }

    public ElementsPage rigthButtonClick() {
        this.rigthClickButton.shouldBe(Condition.visible).contextClick();
        return this;
    }

    public ElementsPage rigthButtonCheck() {
        this.rigthClickButtonConfirmation.shouldBe(Condition.visible);
        return this;
    }

    public ElementsPage clickMeButtoncClick() {
        this.clickMeButton.shouldBe(Condition.visible).click();
        return this;
    }
    public ElementsPage clickMeButtonCheck(){
        this.clickMeConfirmation.shouldBe(Condition.visible);
        return this;
    }
}
