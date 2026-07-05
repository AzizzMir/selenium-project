package com.cydeo.tests.shorts;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class p10_FindElementByCssSelector {

    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://www.google.com");
        driver.manage().window().maximize();

        WebElement gmailLink = driver.findElement(By.cssSelector("span[class='ktLKi']"));

        if (gmailLink.getText().equals("Build, create, and do more with AI tools from Google")){
            System.out.println("Text verification passed!");
        } else {
            System.out.println("Text verification failed!");
        }




    }

}
