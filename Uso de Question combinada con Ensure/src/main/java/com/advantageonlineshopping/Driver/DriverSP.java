package com.advantageonlineshopping.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DriverSP {
    public static WebDriver driver;
    private String url;

    public DriverSP(String url) {
        this.url = url;}

    public static WebDriver chromeDriver(String url){

        ChromeOptions Options = new ChromeOptions();
        Options.addArguments("--start-maximized");
        Options.addArguments("--ignore-certificate-errors");
        Options.addArguments("--disable-infobars");
        Options.addArguments("--incognito");
        Options.addArguments("--disable-site-isolation-trials");
        driver = new ChromeDriver(Options);
        driver.get(url);

        return driver;

    }
}
