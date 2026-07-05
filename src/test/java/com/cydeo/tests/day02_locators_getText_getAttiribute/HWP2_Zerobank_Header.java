package com.cydeo.tests.day02_locators_getText_getAttiribute;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HWP2_Zerobank_Header {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://zero.webappsecurity.com/login.html");
        WebElement zeroBankHeader = driver.findElement(By.tagName("h3"));
        String expectedHeader = "Log in to ZeroBank";
        String actualHeader = zeroBankHeader.getText();

        if (actualHeader.equals(expectedHeader)) {
            System.out.println("Header verification passed!");
        }else {
            System.out.println("Header verification failed!");
        }







    }
}
