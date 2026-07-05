package com.cydeo.tests.shorts;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class P21_JSAlertsPractice {

    WebDriver driver;

    @BeforeMethod
    public void setUpMethod(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @Test
    public void jsAlertsTest(){
        driver.get("https://qa-automation-practice.netlify.app/alerts");
        WebElement jsAlertBtn = driver.findElement(By.xpath("//button[@id='alert-btn']"));
        jsAlertBtn.click();

        Alert alert = driver.switchTo().alert();
        alert.accept();

    }

    @AfterMethod
    public void tearDownMethod(){
        driver.close();
    }

}
