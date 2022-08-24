package com.demoqa.pages;


import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;

public class MainPage {
    @FindBy(xpath = "//*[@class=\"card mt-4 top-card\"][1]")
    public SelenideElement elementsItems;

    public MainPage clickElementsItems() {
        this.elementsItems.shouldBe(Condition.visible).click();
        return this;
    }
    @FindBy(xpath = "//*[@class=\"card mt-4 top-card\"][2]")
    public SelenideElement formsItems;

    public MainPage clickFormsItems() {
        this.formsItems.shouldBe(Condition.visible).click();
        return this;
    }
    @FindBy(xpath = "//*[@class=\"card mt-4 top-card\"][3]")
    public SelenideElement alertsFrameWindowsItems;
    public MainPage clickAlertsFrameWindowsItems() {
        this.alertsFrameWindowsItems.shouldBe(Condition.visible).click();
        return this;
    }
    @FindBy(xpath = "//*[@class=\"card mt-4 top-card\"][4]")
    public SelenideElement widgetsItems;
    public MainPage clickWidgetsItems() {
        this.widgetsItems.shouldBe(Condition.visible).click();
        return this;
    }
}
