package com.demoqa.pages;


import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.page;

public class MainPageStep {
    public static void loadPage(String url){
        open(url, MainPage.class);
    }
    public static void clickElements(){
        page(MainPage.class).clickElementsItems();
    }
    public static void clickForms(){
        page(MainPage.class).clickFormsItems();
    }
    public static void clickAlertsFrameWindows(){
        page(MainPage.class).clickAlertsFrameWindowsItems();
    }
    public static void clickWidgets(){
        page(MainPage.class).clickWidgetsItems();
    }
}
