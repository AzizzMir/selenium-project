package com.cydeo.tests.shorts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P05_FindElementByID {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.google.com");
        WebElement feelingButton = driver.findElement(By.id("gbqfbb"));
        feelingButton.click();
        feelingButton.click();
        Thread.sleep(3000);
        driver.navigate().back();
        driver.close();


    }

}
