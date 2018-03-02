package com.epam.aqa.khalii.framework.elements;


import org.openqa.selenium.WebElement;

public class Button extends Element {

    public Button(WebElement webElement){
        super(webElement);
    }

    public boolean isEnabled(){
        return this.webElement.isEnabled();
    }

    public boolean isDisplayed(){
        return this.webElement.isDisplayed();
    }
}
