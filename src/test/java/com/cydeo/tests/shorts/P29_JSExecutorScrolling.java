package com.cydeo.tests.shorts;

import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class P29_JSExecutorScrolling {

    @Test
    public void jsExecutorScrollingTest() {

        Driver.getDriver().get("https://practice.expandtesting.com/scrollbars");

        WebElement hidingBtn = Driver.getDriver().findElement(By.id("hidingButton"));

        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();

        BrowserUtils.sleep(3);
        js.executeScript("arguments[0].scrollIntoView(true);", hidingBtn);
        System.out.println("hidingBtn.isDisplayed() = " + hidingBtn.isDisplayed());
        BrowserUtils.sleep(3);

        Driver.closeDriver();


    }


}
