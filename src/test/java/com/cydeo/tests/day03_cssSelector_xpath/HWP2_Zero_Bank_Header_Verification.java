package com.cydeo.tests.day03_cssSelector_xpath;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HWP2_Zero_Bank_Header_Verification {

    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        driver.get("https://zero.webappsecurity.com/login.html");

        //xpath
//        WebElement headerText = driver.findElement(By.xpath("//h3"));

        //css selector
        WebElement headerText = driver.findElement(By.cssSelector("h3"));

        String expectedPageHeader = "Log in to ZeroBank";
        String actualPageHeader = headerText.getText();

        if (actualPageHeader.equals(expectedPageHeader)) {
            System.out.println("Passed!");
        }else{
            System.out.println("Failed!");
        }

        driver.close();

    }




}
