package com.cydeo.tests.shorts;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class P08_FindElementByTagName {

    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://www.google.com");
        driver.manage().window().maximize();

        WebElement header = driver.findElement(By.className("ktLKi"));
        System.out.println("header.getText() = " + header.getText());


    }

}
