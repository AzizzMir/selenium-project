package com.cydeo.tests.day02_locators_getText_getAttiribute;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T2_LinkText_Practice {

    public static void main(String[] args) {


        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://practice.cydeo.com");
        driver.findElement(By.linkText("A/B Testing")).click();

        WebElement abTesting = driver.findElement(By.linkText("A/B Testing"));
        abTesting.click();


        String expectedTitle = "No A/B Test";
        String actualTitle = driver.getTitle();

        if (actualTitle.equals(expectedTitle)) {
            System.out.println("Title verification passed!");
        }else {
            System.out.println("Title verification failed!");
        }

        driver.navigate().back();

        expectedTitle = "Practice";
        actualTitle = driver.getTitle();

        if (actualTitle.equals(expectedTitle)) {
            System.out.println("Title verification passed!");
        }else {
            System.out.println("Title verification failed!");
        }

        driver.close();


    }
}
