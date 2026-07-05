package com.cydeo.tests.day04_findElements_checkBoxes_radio;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class T2_FindElements {

    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://practice.cydeo.com/abtest");

        List<WebElement> links = driver.findElements(By.cssSelector("a[href]"));
        System.out.println(links.size());
        for (WebElement link : links) {
            System.out.println(link.getText());
            System.out.println(link.getAttribute("href"));
        }

        driver.close();





    }
}
