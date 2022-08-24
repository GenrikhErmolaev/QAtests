package com.demoqa.test;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.demoqa.pages.*;
import com.demoqa.utils.Settings;
import com.demoqa.utils.UserLong;
import com.demoqa.utils.UserShort;

import org.junit.jupiter.api.*;


public class TestBase {

    @BeforeAll

    public static void loadUrl() {

        Configuration.headless=true;
        MainPageStep.loadPage(Settings.url);
    }

    @Nested
    @TestInstance(TestInstance.Lifecycle.PER_CLASS)
    @DisplayName("Elements Page")
    class ElementsPage {
        @BeforeAll
        void elementsOpen() {
            MainPageStep.clickElements();
        }

        @AfterEach
        void clearCache() {
            Selenide.clearBrowserCookies();
            Selenide.clearBrowserLocalStorage();
        }

        @AfterAll

        void reloadUrl() {
            MainPageStep.loadPage(Settings.url);
        }

        @Test
        @DisplayName("Elements -> text box")
        void textBoxCheck() {
            UserShort userShort = new UserShort("Ivan Ivanov", "test@test.tt", "Russia", "China");
            ElementsPageStep.textBoxSubmit(userShort.getFullName(), userShort.getEmailAddress(), userShort.getCurrentAddress(), userShort.getPermanentAddress());
            ElementsPageStep.checkBoxSubmit();

        }

        @Test
        @DisplayName("Elements -> check box")
        void checkBoxCheck() {
            ElementsPageStep.checkBoxCheck();
        }

        @Test
        @DisplayName("Elements -> buttons")
        void buttonsCheck() {
            ElementsPageStep.buttonsItemCheck();
        }
    }

    @Nested
    @DisplayName("Forms Page")
    @TestInstance(TestInstance.Lifecycle.PER_CLASS)
    class FormsPage {
        @BeforeAll
        public void formsOpen() {
            MainPageStep.clickForms();
        }

        @AfterEach
        void clearCache() {
            Selenide.clearBrowserCookies();
            Selenide.clearBrowserLocalStorage();
        }

        @AfterAll
        public void reloadUrl() {
            MainPageStep.loadPage(Settings.url);
        }

        @Test
        @DisplayName("Forms -> practice form")
        void formsCheck() {
            UserLong userLong = new UserLong("Ivan",
                    "Ivanov", "test@test.tt",
                    "1111111111", "subject",
                    "Russia");
            FormsPageStep.practiceFormsCheck(userLong.firstName, userLong.lastName, userLong.emailAddress,
                    userLong.mobileNum, userLong.subject, userLong.currentAddress);
        }
    }

    @Nested
    @DisplayName("Alerts, Frame & Windows Page")
    @TestInstance(TestInstance.Lifecycle.PER_CLASS)
    class AlertsFrameWindows {
        String expectedUrl = "https://demoqa.com/sample";

        @BeforeAll
        void formsOpen() {
            MainPageStep.clickAlertsFrameWindows();
        }

        @AfterEach
        void clearCache() {
            Selenide.clearBrowserCookies();
            Selenide.clearBrowserLocalStorage();

        }

        @AfterAll
        void reloadUrl() {

            MainPageStep.loadPage(Settings.url);
        }

        @Test
        @DisplayName("Alerts / Browser Windows -> new tab")
        void newTabOpeningCheck() {
            AlertsFrameWindowsPageStep.clickNewTab(Settings.expectedUrl);
        }

        @Test
        @DisplayName("Alerts / Browser Windows -> new window")
        void newWindowOpeningCheck() {
            AlertsFrameWindowsPageStep.clickNewWindow(Settings.expectedUrl);
        }

        @Test
        @DisplayName("Alerts / Browser Windows -> new window")
        void newWindowMessageCheck() {
            AlertsFrameWindowsPageStep.clickNewWindowMessage();
        }

        @Test
        @DisplayName("Alerts / Modal Dialogs -> small modal")
        void smallModalCheck() {
            AlertsFrameWindowsPageStep.clickSmallModal();
        }

        @Test
        @DisplayName("Alerts / Alerts -> small modal")
        void alertButtonCheck() {
            AlertsFrameWindowsPageStep.clickAlertButton();
        }
    }

    @Nested
    @DisplayName("Widgets")
    @TestInstance(TestInstance.Lifecycle.PER_CLASS)
    class Widgets {

        @BeforeAll
        void widgetsOpen() {
            MainPageStep.clickWidgets();
        }

        @AfterEach
        void clearCache() {
            Selenide.clearBrowserCookies();
            Selenide.clearBrowserLocalStorage();

        }

        @AfterAll
        void reloadUrl() {

            MainPageStep.loadPage(Settings.url);
        }

        @Test
        @DisplayName("Widgets -> Auto Complete / Multy input")
        void autoCompleteMultyColorCheck() {
            WidgetsPageStep.autoCompleteMultyColorCheck();
        }

        @Test
        @DisplayName("Widgets -> Auto Complete / Single input")
        void autoCompleteSingleColorCheck() {
            WidgetsPageStep.autoCompleteSingleColorCheck();
        }

        @Test
        @DisplayName("Widgets -> slider")
        void sliderMoveCheck() {
            WidgetsPageStep.moveSlider();
        }

    }


}

