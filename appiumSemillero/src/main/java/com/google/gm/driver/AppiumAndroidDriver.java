package com.google.gm.driver;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class AppiumAndroidDriver {
    public static AppiumDriver<MobileElement> driver;

    public static AppiumAndroidDriver appium(){
        try {
            DesiredCapabilities capabilities = new DesiredCapabilities();
            capabilities.setCapability("appPackage","com.google.android.gm");
            capabilities.setCapability("appActivity","com.google.android.gm.ConversationListActivityGmail");
            capabilities.setCapability("platformName","Android");
            capabilities.setCapability("platformVersion","9");
            capabilities.setCapability("udid","KBT4C19104000514");
            capabilities.setCapability("noReset","true");
            capabilities.setCapability("deviceName","POT-LX3");

            driver = new AppiumDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);

        }catch (MalformedURLException e){
            e.printStackTrace();
        }

        return new AppiumAndroidDriver();
    }
     public AppiumDriver<MobileElement> on(){
        return driver;
     }
}
