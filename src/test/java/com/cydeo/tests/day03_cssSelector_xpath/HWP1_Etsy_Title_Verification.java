package com.cydeo.tests.day03_cssSelector_xpath;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HWP1_Etsy_Title_Verification {

    public static void main(String[] args) {


        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        driver.get("https://www.etsy.com/");
        //CSS selector
        WebElement searchBox = driver.findElement(By.cssSelector("input#global-enhancements-search-query"));
        //xpath selector
//        WebElement searchBox = driver.findElement(By.xpath("//input[@name='search_query']"));
        searchBox.sendKeys("wooden spoon" + Keys.ENTER);

        String expectedTitle = "Wooden spoon - Etsy";
        String actualTitle = driver.getTitle();

        if(actualTitle.equals(expectedTitle)){
            System.out.println("passed!");
        }else{
            System.out.println(expectedTitle);
            System.out.println(actualTitle);
            System.out.println("failed!");
        }

        driver.close();



    }

}
