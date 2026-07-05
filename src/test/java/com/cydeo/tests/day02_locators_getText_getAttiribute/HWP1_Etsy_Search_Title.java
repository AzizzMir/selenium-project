package com.cydeo.tests.day02_locators_getText_getAttiribute;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HWP1_Etsy_Search_Title {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.etsy.com");
        WebElement etsySearchBox = driver.findElement(By.id("global-enhancements-search-query"));
        etsySearchBox.sendKeys("wooden spoon" + Keys.ENTER);

        String expectedTitle = "Wooden spoon - Etsy";
        String actualTitle = driver.getTitle();

        if (actualTitle.equals(expectedTitle)) {
            System.out.println("Title verification passed!");
        }else {
            System.out.println("Title verification failed!");
        }

        driver.close();




    }
}
