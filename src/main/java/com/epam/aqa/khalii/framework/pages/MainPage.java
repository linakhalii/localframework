package com.epam.aqa.khalii.framework.pages;

import com.epam.aqa.khalii.framework.elements.Link;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import static com.epam.aqa.khalii.framework.core.BaseTest.getDriver;

public class MainPage extends BasePage {

    public MainPage(){
        super();
    }

    private static final By mobile = By.xpath("//a[contains(@href,'1232')]");

    public Link getMobileCategory() {
        return new Link(getDriver().findElement(mobile));
    }

    public ProductPage clickMobilePhonesCategories(){
        getMobileCategory().click();
        return new ProductPage();
    }

}
