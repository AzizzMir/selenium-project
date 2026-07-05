package com.cydeo.tests.shorts;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class P30_ExplicitWaitPractice {

    @Test
    public void explicitWaitTest() {

        Driver.getDriver().get("https://qa-automation-practice.netlify.app/loader");

        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
        WebElement loadingBar = Driver.getDriver().findElement(By.id("loader"));

        wait.until(ExpectedConditions.invisibilityOf(loadingBar));
        WebElement header = Driver.getDriver().findElement(By.tagName("h2"));

        Assert.assertTrue(header.isDisplayed());


    }


}
