package com.cydeo.tests.day02_locators_getText_getAttiribute;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T4_Library_Practice {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://library2.cybertekschool.com/login.html");

        WebElement usernameBox = driver.findElement(By.className("form-control"));
        usernameBox.sendKeys("incorrect@email.com");

        WebElement passwordBox = driver.findElement(By.id("inputPassword"));
        passwordBox.sendKeys("anything");

        WebElement signInButton = driver.findElement(By.tagName("button"));
        signInButton.click();





    }
}
