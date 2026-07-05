package com.cydeo.tests.shorts;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class P12_FindElements {

    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://www.google.com");
        driver.manage().window().maximize();

        List<WebElement> linkElements = driver.findElements(By.xpath("//a[@class='gb_5']"));
        System.out.println(linkElements.size());

        for (WebElement linkElement : linkElements) {
            System.out.println(linkElement.getText());
        }

        driver.close();

    }

}
