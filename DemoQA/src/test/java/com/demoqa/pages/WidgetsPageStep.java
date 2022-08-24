package com.demoqa.pages;


import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.Assertions;

import static com.codeborne.selenide.Selenide.page;
import static com.codeborne.selenide.Selenide.webdriver;
import static java.lang.Integer.parseInt;

public class WidgetsPageStep {
    static String[] colorList = new String[]{"Re", "gree", "blac"};

    public static void autoCompleteMultyColorCheck() {
        page(WidgetsPage.class).clickAutoCompleteItem();
        for (String color : colorList) {
            page(WidgetsPage.class).setMultipleColorsField(color);
            String text = page(WidgetsPage.class).multipleColorCheck.getText();
            Assertions.assertTrue(text.toLowerCase().contains(color.toLowerCase()));
        }
    }

    public static void autoCompleteSingleColorCheck() {
        page(WidgetsPage.class).clickAutoCompleteItem();
        for (String color : colorList) {
            page(WidgetsPage.class).setSingleColorInput(color);
            String text = page(WidgetsPage.class).checkSingleColor.getText();
            Assertions.assertTrue(text.toLowerCase().contains(color.toLowerCase()));
        }
    }

    public static void moveSlider() {
        page(WidgetsPage.class).clickSliderItem();
        SelenideElement slider = page(WidgetsPage.class).slider;
        double width = slider.getSize().getWidth() / 100;
        int move = -5;
        int moveTo = (int) ((width * move) + 0.5 * move);
        webdriver().driver().actions().click(slider)
                .dragAndDropBy(slider, moveTo, 0)
                .build().perform();
        String sliderPosition = slider.getAttribute("value");
        Assertions.assertEquals(50+move,parseInt(sliderPosition));
    }
}
