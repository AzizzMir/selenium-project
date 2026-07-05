package com.cydeo.tests.shorts;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class P17_HTML_Dropdown {

    WebDriver driver;

    @BeforeMethod
    public void setUpMethod(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @Test
    public void htmlDropdownTest(){
        driver.get("https://qa-automation-practice.netlify.app/dropdowns");
        driver.findElement(By.id("multi-level-dropdown-btn")).click();

        driver.findElement(By.linkText("Some action")).click();

    }



}
