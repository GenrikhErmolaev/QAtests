package com.demoqa.pages;

import static com.codeborne.selenide.Selenide.page;

public class ElementsPageStep {

    public static void textBoxSubmit(String fullName, String email, String currentAddress, String permanentAddress) {
        page(ElementsPage.class).clickTextBoxItem()
                .setFullName(fullName)
                .setEmail(email)
                .setCurrentAddress(currentAddress)
                .setPermanentAddress(permanentAddress)
                .submitButtonClick();
    }

    public static void checkBoxSubmit() {
        page(ElementsPage.class).checkAfterSubmit();
    }

    public static void checkBoxCheck() {
        page(ElementsPage.class).clickCheckBoxItem()
                .collapsButtonClick()
                .checkBoxDesktopClick()
                .expandAllButtonCLick()
                .confirmResultCheckBoxSelect();

    }

    public static void buttonsItemCheck()  {
        page(ElementsPage.class).clickButtonsItem()
                .doubleClickButtonClick()
                .doubleClickButtonCheck()
                .rigthButtonClick()
                .rigthButtonCheck()
                .clickMeButtoncClick()
                .clickMeButtonCheck();
    }
}
