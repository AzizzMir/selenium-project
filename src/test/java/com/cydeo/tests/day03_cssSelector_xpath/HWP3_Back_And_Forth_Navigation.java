package com.cydeo.tests.day03_cssSelector_xpath;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HWP3_Back_And_Forth_Navigation {

    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        driver.get("https://www.google.com");
        //xpath
        //WebElement gmailButton = driver.findElement(By.xpath("//a[@class='gb_X']"));
        //css selector
        WebElement gmailButton = driver.findElement(By.cssSelector("a[href='https://mail.google.com/mail/&ogbl']"));
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
