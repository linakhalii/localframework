package com.epam.aqa.khalii.framework.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import static com.epam.aqa.khalii.framework.core.BaseTest.getDriver;


public abstract class BasePage {

    public BasePage() {
        PageFactory.initElements(getDriver(), this);
    }

}
