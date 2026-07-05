package com.cydeo.tests.day02_locators_getText_getAttiribute;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HWP3_GmailGoogleTitleVerification {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.google.com");
        WebElement gmailButton = driver.findElement(By.className("gb_X"));
        gmailButton.click();

        String gmailTitle = driver.getTitle();
        if (gmailTitle.contains("Gmail")){
            System.out.println("Gmail title verification passed!");
        }else {
            System.out.println("Gmail title verification failed!");
        }

        driver.navigate().back();

        String expectedTitle = "Google";
        String actualTitle = driver.getTitle();

        if (actualTitle.equals(expectedTitle)){
            System.out.println("Google title verification passed!");
        }else {
            System.out.println("Google title verification failed!");
        }

        driver.close();
    }
}
