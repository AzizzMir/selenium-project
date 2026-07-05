package com.cydeo.tests.shorts;


import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class P32_TestNG_DataProvider {

    @Test(dataProvider = "GoogleSearchData")
    public void googleSearchTest(String keyword, String expectedResult) {

        Driver.getDriver().get("http://www.google.com");
        WebElement searchBox = Driver.getDriver().findElement(By.name("q"));
        searchBox.sendKeys(keyword + Keys.ENTER);
        Assert.assertEquals(Driver.getDriver().getTitle(), expectedResult);
    }

    @DataProvider(name = "GoogleSearchData")
    public Object[][] testData(){

        return new Object[][]{

                {"selenium", "selenium - Google Search"},
                {"google", "google - Google Search"},
                {"java", "java - Google Search"},
                {"ruby", "ruby - Google Search"},

        };

    }

    @AfterMethod
    public void tearDownMethod(){
        Driver.closeDriver();
    }


}
