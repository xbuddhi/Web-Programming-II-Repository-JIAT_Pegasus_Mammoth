package com.jiat.web.util;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ApplicationProperties {
    private static ApplicationProperties applicationProperties;
    private Properties properties;

    private ApplicationProperties() {
        properties = new Properties();
        InputStream is = getClass().getClassLoader().getResourceAsStream("application.properties");
        try {
            properties.load(is);
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public  static ApplicationProperties getInstance(){
        if(applicationProperties == null){
            applicationProperties = new ApplicationProperties();
        }
        return applicationProperties;
    }
    public String get(String key){
        return properties.getProperty(key);
    }

}
