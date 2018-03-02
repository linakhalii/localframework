package com.epam.aqa.khalii.framework.pages;


import com.epam.aqa.khalii.framework.elements.Button;
import com.epam.aqa.khalii.framework.elements.Link;
import com.epam.aqa.khalii.framework.elements.TextArea;
import org.openqa.selenium.By;

import static com.epam.aqa.khalii.framework.core.BaseTest.getDriver;


public class ProductPage extends BasePage{

    private static final By searchField = By.xpath("//form[@id='search']//input[contains(@class,'text-input')]");

    private static final By submitSearchButton = By.xpath("//form[@id='search']//input[@type='submit']");

    private static final By appliedFilter = By.xpath("//span[@class='active']//a[contains(@href,'1232')]");

    public ProductPage(){
        super();
    }

    public TextArea getSearchField() {
        return new TextArea(getDriver().findElement(searchField));
    }

    public Button getSubmitSearchButton() {
        return new Button(getDriver().findElement(submitSearchButton));
    }

    public Link getAppliedFilter() {
        return new Link(getDriver().findElement(appliedFilter));
    }

    public ProductPage clickSubmit(){
        getSubmitSearchButton().click();
        return new ProductPage();
    }
}
