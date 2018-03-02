package com.epam.aqa.khalii.framework.elements;

import org.openqa.selenium.WebElement;

public class CheckBox extends Element {

    public CheckBox(WebElement webElement){
        super(webElement);
    }

    public boolean isChecked(){
        return this.webElement.isSelected();
    }
}
