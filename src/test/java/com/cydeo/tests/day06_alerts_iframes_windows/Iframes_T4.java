package com.cydeo.tests.day06_alerts_iframes_windows;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Iframes_T4 {

    @BeforeMethod
    public void setUp(){

        Driver.getDriver().get("https://www.qa-practice.com/elements/iframe/iframe_page");

    }

    @Test
    public void iframesTask4(){

        Driver.getDriver().switchTo().frame(0);
        WebElement paragraphText = Driver.getDriver().findElement(By.xpath("//h1[.='Album example']"));
        Assert.assertTrue(paragraphText.isDisplayed());

    }

    @Test
    public void iframesTask5(){

        Driver.getDriver().switchTo().defaultContent();
        WebElement h1 = Driver.getDriver().findElement(By.tagName("h1"));

        Assert.assertTrue(h1.isDisplayed());
    }


    @AfterMethod
    public void tearDown(){
        Driver.closeDriver();

    }


}
