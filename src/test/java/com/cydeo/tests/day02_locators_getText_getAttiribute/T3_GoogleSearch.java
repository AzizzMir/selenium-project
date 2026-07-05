package com.cydeo.tests.day02_locators_getText_getAttiribute;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T3_GoogleSearch {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();


        driver.get("https://www.google.com");
        WebElement googleSearchBox = driver.findElement(By.name("q"));

        googleSearchBox.sendKeys("apple" + Keys.ENTER);

        Thread.sleep(3000);

        String expectedTitle = "apple - Google Search";
        String actualTitle = driver.getTitle();

        if (actualTitle.equals(expectedTitle)) {
            System.out.println("Title verification passed!");
        }else {
            System.out.println("Title verification failed!");
        }

        driver.close();









    }
}
