package com.banggood.driver;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class AppiumAndroidDriver {

    public static AppiumDriver<MobileElement> driver;

    public static AppiumAndroidDriver appium(){
        try{
            DesiredCapabilities capabilities = new DesiredCapabilities();
            capabilities.setCapability("deviceName", "V2035");
            capabilities.setCapability("udid", "3055867142008CO");
            capabilities.setCapability("platformName", "Android");
            capabilities.setCapability("platformVersion", "12");
            capabilities.setCapability("appPackage", "com.banggood.client");
            capabilities.setCapability("appActivity", "com.banggood.client.module.home.MainActivity");
            capabilities.setCapability("noReset", "true");

            driver = new AppiumDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
        } catch (MalformedURLException e){
            e.printStackTrace();
        }
        return new AppiumAndroidDriver();
    }
    public AppiumDriver<MobileElement> on(){
        return driver;
    }

}
