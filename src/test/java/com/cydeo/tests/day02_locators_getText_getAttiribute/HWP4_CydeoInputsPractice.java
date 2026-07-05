package com.cydeo.tests.day02_locators_getText_getAttiribute;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HWP4_CydeoInputsPractice {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://practice.cydeo.com/inputs");
        WebElement homeLink = driver.findElement(By.className("nav-link"));
        homeLink.click();

        String expectedTitle = "Practice";
        String actualTitle = driver.getTitle();

        if (actualTitle.equals(expectedTitle)) {
            System.out.println("Title verification passed!");
        }else {
            System.out.println("Title verification failed!");
        }

        driver.close();

    }
}
