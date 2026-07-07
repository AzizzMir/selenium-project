package com.cydeo.tests.day06_alerts_iframes_windows;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Windows_practice_T5 {


    @BeforeMethod
    public void setUp(){

        Driver.getDriver().get("https://www.qa-practice.com/elements/new_tab/link");

    }

    @Test
    public void windowsPracticeT5(){

        String mainHandle = Driver.getDriver().getWindowHandle();
        Driver.getDriver().findElement(By.id("new-page-link")).click();

        for (String windowHandle : Driver.getDriver().getWindowHandles()) {

            Driver.getDriver().switchTo().window(windowHandle);
            System.out.println("Current Title: " + Driver.getDriver().getTitle());

        }

        Assert.assertEquals(Driver.getDriver().getTitle(), "New Tab | New Page | QA Practice");

        Driver.getDriver().switchTo().window(mainHandle);
        Assert.assertEquals(Driver.getDriver().getTitle(), "New Tab | New Tab Link | QA Practice");


    }

    @AfterMethod
    public void tearDown(){

        Driver.closeDriver();

    }

}
