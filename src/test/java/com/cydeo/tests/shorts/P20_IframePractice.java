package com.cydeo.tests.shorts;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class P20_IframePractice {

    WebDriver driver;

    @BeforeMethod
    public void setUpMethod(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @Test
    public void iframeTest(){

        driver.get("https://qa-automation-practice.netlify.app/iframe");
        driver.switchTo().frame(0);
        WebElement iframeText = driver.findElement(By.xpath("//h1[@class='display-4']"));
        Assert.assertTrue(iframeText.isDisplayed());

//        driver.switchTo().parentFrame(); // Switch to parent iframe
        driver.switchTo().defaultContent(); // Switch to main HTML
        WebElement pageText = driver.findElement(By.tagName("h2"));
        Assert.assertTrue(pageText.isDisplayed());
    }

}
