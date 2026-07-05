package com.cydeo.tests.day03_cssSelector_xpath;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T4_xpath {


    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        driver.get("https://login1.nextbasecrm.com");

        String expectedLoginText = "Log In";

        WebElement loginButton = driver.findElement(By.xpath("//input[@class='login-btn']"));

        String actualLoginText = loginButton.getAttribute("value");
        if (actualLoginText.equals(expectedLoginText)){
            System.out.println("passed!");if (actualLoginText.equals(expectedLoginText)){
                System.out.println("passed!");
            }else{
                System.out.println("failed!");
            }
        }else{
            System.out.println("failed!");
        }

        driver.close();

    }

}
