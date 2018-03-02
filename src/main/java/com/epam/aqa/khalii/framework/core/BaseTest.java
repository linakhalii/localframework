package com.epam.aqa.khalii.framework.core;

import com.epam.aqa.khalii.framework.core.data.Constants;
import com.epam.aqa.khalii.framework.core.driver.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import static com.epam.aqa.khalii.framework.core.Configuration.getConfig;


public class BaseTest {

    private static ThreadLocal<WebDriver> driver;

    protected static void open(){
        String homePageUrl = getConfig().getSiteUrl();
        getDriver().get(homePageUrl);
    }

    @Parameters("browser")
    @BeforeMethod
    protected static void setUp(@Optional String browser) {
        if (browser==null || browser.isEmpty()) {
            Configuration.setUpConfiguration(Constants.DEFAULT_BROWSER);
        } else {
            Configuration.setUpConfiguration(browser);
        }
        setDriver(WebDriverFactory.getDriver(getConfig().getBrowserName()));
    }

    @AfterMethod
    protected void tearDown() {
        if (getDriver() != null)
            getDriver().quit();
    }

    public static WebDriver getDriver() {
        return driver.get();
    }

    public static void setDriver(ThreadLocal<WebDriver> driver) {
        BaseTest.driver = driver;
    }
}
