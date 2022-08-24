package com.demoqa.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;

public class AlertsFrameWindowsPage {
    @FindBy(xpath = "//span[text()='Browser Windows']")
    public SelenideElement browserWindowsItem;

    public AlertsFrameWindowsPage clickBrowserWindowItem() {
        this.browserWindowsItem.shouldBe(Condition.visible).click();
        return this;
    }

    @FindBy(xpath = "//span[text()='Modal Dialogs']")
    public SelenideElement modalDialogsItem;

    public AlertsFrameWindowsPage clickAmodalDialogsItem() {
        this.modalDialogsItem.scrollTo().shouldBe(Condition.visible).click();
        return this;
    }

    @FindBy(xpath = "//span[text()='Alerts']")
    public SelenideElement alertsItem;

    public AlertsFrameWindowsPage clickAlertsItem() {
        this.alertsItem.shouldBe(Condition.visible).click();
        return this;
    }

    @FindBy(xpath = "//*[@id='alertButton']")
    public SelenideElement alertButton;

    public AlertsFrameWindowsPage alertButtonClick() {
        this.alertButton.shouldBe(Condition.visible).click();
        return this;
    }

    @FindBy(xpath = "//*[@id=\"tabButton\"]")
    public SelenideElement newTabButton;

    public AlertsFrameWindowsPage clickNewTab() {
        this.newTabButton.shouldBe(Condition.visible).click();
        return this;
    }

    @FindBy(xpath = "//*[@id=\"windowButton\"]")
    public SelenideElement newWindowButton;

    public AlertsFrameWindowsPage clickNewWindow() {
        this.newWindowButton.shouldBe(Condition.visible).click();
        return this;
    }

    @FindBy(xpath = "//*[@id=\"messageWindowButton\"]")
    public SelenideElement newWindowMessageButton;

    public AlertsFrameWindowsPage clickNewWindowMessage() {
        this.newWindowMessageButton.shouldBe(Condition.visible).click();
        return this;
    }

    @FindBy(xpath = "//*[@id='showSmallModal']")
    public SelenideElement smallModalButton;

    public AlertsFrameWindowsPage smallModalButtonClick() {
        this.smallModalButton.shouldBe(Condition.visible).click();
        return this;
    }

    @FindBy(xpath = "//*[@id='closeSmallModal']")
    public SelenideElement smallModalCloseButton;

    public AlertsFrameWindowsPage smallModalCloseButtonClick() {
        this.smallModalCloseButton.shouldBe(Condition.visible).click();
        return this;
    }

    @FindBy(xpath = "//*[@id='example-modal-sizes-title-sm']")
    public SelenideElement smallModalHeader;

    public AlertsFrameWindowsPage smallModalHeaderCheck() {
        this.smallModalHeader.shouldBe(Condition.visible);
        return this;
    }
}
