package com.epam.aqa.khalii.framework.steps;

import com.epam.aqa.khalii.framework.pages.ProductPage;
import org.testng.Assert;

public class ProductPageSteps {

    ProductPage productPage;

    public ProductPageSteps(ProductPage productPage){
        this.productPage = productPage;
    }

    public void verifySearchOnProductPage(){
        productPage.getSearchField().sendKeys("asus");
        productPage = productPage.clickSubmit();
        Assert.assertEquals(productPage.getAppliedFilter().getText(),"asus");
    }

}
