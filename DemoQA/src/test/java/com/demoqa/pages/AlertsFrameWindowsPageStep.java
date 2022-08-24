package com.demoqa.pages;

import org.junit.jupiter.api.Assertions;

import java.util.function.BooleanSupplier;

import static com.codeborne.selenide.Selenide.*;

public class AlertsFrameWindowsPageStep {
    public static void clickNewTab(String expectedUrl) {
        page(AlertsFrameWindowsPage.class).clickBrowserWindowItem()
                .clickNewTab();
        switchTo().window(1);
        Assertions.assertEquals(expectedUrl, webdriver().driver().getCurrentFrameUrl());
        closeWindow();
        switchTo().window(0);
    }

    public static void clickNewWindow(String expectedUrl) {
        page(AlertsFrameWindowsPage.class).clickBrowserWindowItem()
                .clickNewWindow();
        switchTo().window(1);
        Assertions.assertEquals(expectedUrl, webdriver().driver().getCurrentFrameUrl());
        closeWindow();
        switchTo().window(0);
    }

    public static void clickNewWindowMessage() {
        page(AlertsFrameWindowsPage.class).clickBrowserWindowItem();
        String mainWindowHandle = webdriver().driver().getWebDriver().getWindowHandle();
        page(AlertsFrameWindowsPage.class).clickNewWindowMessage();
        webdriver().driver().getWebDriver().getWindowHandles().stream().filter(childWindowHandle -> !childWindowHandle.equals(mainWindowHandle)).forEach(childWindowHandle -> {
            switchTo().window(childWindowHandle);
            Assertions.assertNotEquals(mainWindowHandle, childWindowHandle);
            closeWindow();
            switchTo().window(mainWindowHandle);
        });
    }

    public static void clickSmallModal() {
        page(AlertsFrameWindowsPage.class).clickAmodalDialogsItem()
                .smallModalButtonClick()
                .smallModalHeaderCheck()
                .smallModalCloseButtonClick();
    }
    public static void clickAlertButton(){
        page(AlertsFrameWindowsPage.class).clickAlertsItem()
                .alertButtonClick();
        switchTo().alert().accept();
    }
}

