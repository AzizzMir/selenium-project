package com.cydeo.tests.day05_testNG_intro_dropdowns;

import com.cydeo.utilities.Driver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class T4_TestNG_Selenium_Intro {

    @BeforeMethod
    public void setUp() {

        Driver.getDriver().get("https://www.cydeo.com/");

    }

    @Test
    public void cydeo_title_verification() {

        String actualTitle = Driver.getDriver().getTitle();
        String expectedTitle = "CYDEO — Launch Your Tech Career in 6 Months | QA & Cybersecurity Training";
        Assert.assertEquals(actualTitle, expectedTitle);

    }

    @AfterMethod
    public void tearDown() {
        Driver.closeDriver();
    }

}
