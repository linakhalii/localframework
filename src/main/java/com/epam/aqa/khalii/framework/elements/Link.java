package com.epam.aqa.khalii.framework.elements;

import org.openqa.selenium.WebElement;

public class Link extends Element {

    public Link(WebElement webElement){
        super(webElement);
    }

    public String getText(){
        return this.webElement.getText();
    }
}
