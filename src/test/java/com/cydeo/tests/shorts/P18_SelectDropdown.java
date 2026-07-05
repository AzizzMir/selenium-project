package com.cydeo.tests.shorts;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class P18_SelectDropdown {

    WebDriver driver;

    @BeforeMethod
    public void setUpMethod(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @Test
    public void selectDropdown(){
        driver.get("https://qa-automation-practice.netlify.app/dropdowns");

        Select simpleSelect = new Select(driver.findElement(By.xpath("//select[@id='dropdown-menu']")));
        simpleSelect.selectByVisibleText("United States of America");
    }

    @AfterMethod
    public void tearDownMethod(){
        driver.quit();
    }

}
