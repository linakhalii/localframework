package com.epam.aqa.khalii.framework.elements;

import org.openqa.selenium.WebElement;

public class TextArea extends Element {

    public TextArea(WebElement webElement){
        super(webElement);
    }

    public void sendKeys(String text){
        this.webElement.sendKeys(text);
    }

    public void clear(){
        this.webElement.clear();
    }
}
