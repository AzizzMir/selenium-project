package com.cydeo.tests.day03_cssSelector_xpath;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HWP4_Cydeo_xpath_Locator_Practice {

    public static void main(String[] args) {


        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        driver.get("https://practice.cydeo.com/inputs");

        //xpath
        //WebElement homeLink = driver.findElement(By.xpath("//a[@class='nav-link']"));

        //css selector
        WebElement homeLink = driver.findElement(By.cssSelector("a.nav-link]"));
        homeLink.click();

        WebElement aTtag = driver.findElement(By.cssSelector("a[href='https://tesla.com']"));
        WebElement divTtag1 = driver.findElement(By.cssSelector("div[for='randomV12']"));
        WebElement divTtag2 = driver.findElement(By.cssSelector("div[name='kgl33']"));
        WebElement divTtag3 = driver.findElement(By.cssSelector("div[id='55k']"));
        WebElement divTtag4 = driver.findElement(By.cssSelector("div#55k"));


        String expectedTitle = "Practice";
        String actualTitle = driver.getTitle();

        if (actualTitle.equals(expectedTitle)) {
            System.out.println("Title verification passed!");
        }else {
            System.out.println("Title verification failed!");
        }

        driver.close();

    }

}
