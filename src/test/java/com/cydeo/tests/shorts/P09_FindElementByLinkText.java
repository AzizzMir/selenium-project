package com.cydeo.tests.shorts;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class P09_FindElementByLinkText {

    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://www.google.com");
        driver.manage().window().maximize();


        WebElement byLinkText = driver.findElement(By.linkText("Gmail"));
        WebElement byPartialLinkText = driver.findElement(By.partialLinkText("Gmai")); // Locate the element by partial link text
        byLinkText.click();

    }

}
