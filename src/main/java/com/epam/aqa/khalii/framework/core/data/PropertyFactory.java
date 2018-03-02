package com.epam.aqa.khalii.framework.core.data;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertyFactory {

    public static Properties getInstance(String fileName) {
        Properties properties = new Properties();
        InputStream is;
        try {
            is = new FileInputStream(fileName);
            properties.load(is);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return properties;
    }

}
