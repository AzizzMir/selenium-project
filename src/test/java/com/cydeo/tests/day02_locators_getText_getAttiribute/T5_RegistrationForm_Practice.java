package com.cydeo.tests.day02_locators_getText_getAttiribute;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T5_RegistrationForm_Practice {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://practice.cydeo.com/registration_form");

        WebElement headerText = driver.findElement(By.tagName("h2"));

        String expectedHeader = "Registration form";
        String actualHeader = headerText.getText();

        if (expectedHeader.equals(actualHeader)) {
            System.out.println("The header is correct");
        }else {
            System.out.println("The header is not correct");
        }

        WebElement fristNameInputBox = driver.findElement(By.className("form-control"));
        String expectedPlaceHolder = "first name";
        String actualPlaceHolder = fristNameInputBox.getAttribute("placeholder");
        if (actualPlaceHolder.equals(expectedPlaceHolder)) {
            System.out.println("passed!");
        }else {
            System.out.println("failed!");
        }








    }
}
