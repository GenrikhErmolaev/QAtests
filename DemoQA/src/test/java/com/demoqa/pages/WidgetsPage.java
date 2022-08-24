package com.demoqa.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;

public class WidgetsPage {
    @FindBy(xpath = "//span[text()='Auto Complete']")
    public SelenideElement autoCompleteItem;

    public WidgetsPage clickAutoCompleteItem() {
        this.autoCompleteItem.scrollTo().shouldBe(Condition.visible).click();
        return this;
    }
    @FindBy(xpath = "//span[text()='Slider']")
    public SelenideElement sliderItem;

    public WidgetsPage clickSliderItem() {
        this.sliderItem.scrollTo().shouldBe(Condition.visible).click();
        return this;
    }

    @FindBy(xpath = "//*[@id='autoCompleteMultipleInput']")
    public SelenideElement multipleColorField;

    public WidgetsPage setMultipleColorsField(String colorArray) {
        this.multipleColorField.shouldBe(Condition.visible).setValue(colorArray).pressEnter();
        return this;
    }

//    @FindBy(xpath = "//*[@class='css-1rhbuit-multiValue auto-complete__multi-value']")
    @FindBy(xpath = "//*[@id='autoCompleteMultipleInput']//preceding::div[2]")
    public SelenideElement multipleColorCheck;


    @FindBy(xpath = "//*[@id='autoCompleteSingleInput']")
    public SelenideElement singleColorInput;

    public WidgetsPage setSingleColorInput(String colorArray) {
        this.singleColorInput.click();
        this.singleColorInput.shouldBe(Condition.visible).setValue(colorArray).pressEnter();
        return this;
    }

    @FindBy(xpath = "//*[@id='autoCompleteSingleInput']//preceding::div[1]")
    public SelenideElement checkSingleColor;

    public WidgetsPage checkSinglwColorinput() {
        this.checkSingleColor.shouldBe(Condition.visible).getText();
        return this;
    }
    @FindBy(xpath = "//*[@class=\"range-slider range-slider--primary\"]")
    public SelenideElement slider;


}
