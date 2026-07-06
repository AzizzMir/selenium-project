package com.cydeo.tests.day05_testNG_intro_dropdowns;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class T5_dropdown_intro {


    @BeforeMethod
    public void setUp(){

        Driver.getDriver().get("https://qa-automation-practice.netlify.app/dropdowns");

    }

    @Test
    public void dropdown_test(){

        Select simpleSelect = new Select(Driver.getDriver().findElement(By.xpath("//select[@id='dropdown-menu']")));
        Assert.assertEquals(simpleSelect.getFirstSelectedOption().getText(), "Select a country...");
        simpleSelect.selectByVisibleText("United States of America");

    }

    @AfterMethod
    public void tearDown(){
        Driver.closeDriver();
    }

}
