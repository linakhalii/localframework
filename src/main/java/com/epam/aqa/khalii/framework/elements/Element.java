package com.epam.aqa.khalii.framework.elements;


import org.openqa.selenium.WebElement;

public class Element {
    protected WebElement webElement;

    public Element(WebElement webElement){
        this.webElement = webElement;
    }

    public void click(){
        this.webElement.click();
    }
}
