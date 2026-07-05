package com.cydeo.tests.day01_selenium_intro;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicNavigations {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        // Maximize the browser
        driver.manage().window().maximize();
        driver.manage().window().fullscreen();

        // Go to tesla.com
        driver.get("https://www.tesla.com");

        // get the current URL
        System.out.println("Current URL: " + driver.getCurrentUrl());

        // Get the title of the page
        System.out.println("driver.getTitle:" + driver.getTitle());

        //use navigate back() to go back
        driver.navigate().back();

        // driver close method closes only the currently focused window/tab
        driver.close();

        // closes all-of-the opened browsers
//        driver.quit();


    }
}
