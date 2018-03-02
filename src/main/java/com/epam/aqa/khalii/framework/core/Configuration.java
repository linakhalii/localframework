package com.epam.aqa.khalii.framework.core;


import com.epam.aqa.khalii.framework.core.data.PropertyFactory;

import java.util.Properties;

import static com.epam.aqa.khalii.framework.core.data.Constants.TEST_PROPERTY_FILE;

public class Configuration {
    private static ThreadLocal<Configuration> instance = new ThreadLocal<>();

    private String browser;
    private String siteUrl;

    static {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriver.exe");
        System.setProperty("webdriver.gecko.driver", "src/main/resources/drivers/geckodriver.exe");
    }

    public Configuration(String browser){
        setBrowser(browser);
    }

    public static void setUpConfiguration(final String browser) {
        final Configuration configuration = new Configuration(browser);
        final Properties testProperties = PropertyFactory.getInstance(TEST_PROPERTY_FILE);

        configuration.setSiteUrl(testProperties.getProperty("site_url"));
        setConfig(configuration);
    }

    public static Configuration getConfig() {
        return instance.get();
    }

    public synchronized static void setConfig(Configuration config) {
        if (config == null) {
            instance.remove();
        } else {
            instance.set(config);
        }
    }

    public String getSiteUrl(){
        return siteUrl;
    }

    public void setSiteUrl(String siteUrl) {
        this.siteUrl = siteUrl;
    }

    public void setBrowser(String browser) {
        this.browser = browser;
    }

    public String getBrowserName() {
        return browser;
    }
}
