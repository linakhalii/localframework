package com.epam.aqa.khalii.framework.core.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.HashMap;
import java.util.Map;

public class WebDriverFactory {

//    private static Map<String,WebDriver> drivers = new HashMap<String,WebDriver>(){{
//        put("CHROME", new ChromeDriver());
//        put("FIREFOX", new FirefoxDriver());
//        put("EDGE", new EdgeDriver());
//    }};

    public enum Browsers {
        CHROME {
            public WebDriver create(){
                return new ChromeDriver();
            }
        },
        EDGE {
            public WebDriver create(){
                return new EdgeDriver();
            }
        },
        FIREFOX {
            public WebDriver create() {
                return new FirefoxDriver();
            }
        };
        public WebDriver create(){
            return null;
        }
    }


    public static ThreadLocal<WebDriver> getDriver(String name){
        ThreadLocal<WebDriver> driverThreadLocal = new ThreadLocal<>();
        driverThreadLocal.set(Browsers.valueOf(name).create());
        return driverThreadLocal;

//        ThreadLocal<WebDriver> driverThreadLocal = new ThreadLocal<>();
//        driverThreadLocal.set(drivers.get(name));
//        return driverThreadLocal;
    }


}
