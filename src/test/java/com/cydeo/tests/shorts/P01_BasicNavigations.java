package com.cydeo.tests.shorts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P01_BasicNavigations {

    public static void main(String[] args) {


        WebDriver driver = new ChromeDriver();
        driver.get("https://www.etsy.com");

        driver.navigate().to("https://www.google.com");
        driver.navigate().back();
        driver.navigate().forward();



    }

}
