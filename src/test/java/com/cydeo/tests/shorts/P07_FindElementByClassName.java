package com.cydeo.tests.shorts;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class P07_FindElementByClassName {


    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://www.google.com");
        driver.manage().window().maximize();

        WebElement searchBox = driver.findElement(By.className("gLFyf"));
        searchBox.sendKeys("Apple" + Keys.ENTER);


    }

}
