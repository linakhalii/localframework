package com.epam.aqa.khalii.framework.steps;

import com.epam.aqa.khalii.framework.pages.MainPage;
import com.epam.aqa.khalii.framework.pages.ProductPage;

public class MainPageSteps {
    private MainPage mainPage;

    public MainPageSteps(MainPage mainPage){
        this.mainPage = mainPage;

    }

    public ProductPage navigateToMobilePhones(){
        return mainPage.clickMobilePhonesCategories();
    }
}
