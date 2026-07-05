package com.cydeo.utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverFactory {


    public static WebDriver getDriver(String browserType){

        if (browserType.equalsIgnoreCase("chrome")){
            return new ChromeDriver();
        }else if (browserType.equalsIgnoreCase("firefox")){
            return new FirefoxDriver();
        }else{
            System.out.println("Unsupported browser type!");
            return null;
        }


    }

}
