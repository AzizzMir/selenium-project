package com.cydeo.tests.day06_alerts_iframes_windows;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class Dropdowns_T6_T7_T8 {


    @Test
    public void dropdownTask6(){
        Driver.getDriver().get("https://store.steampowered.com/agecheck/sub/128345");
        Select selectYear = new Select(Driver.getDriver().findElement(By.cssSelector("select[id='ageYear']")));
        selectYear.selectByVisibleText("1933");
        Select selectMonth = new Select(Driver.getDriver().findElement(By.xpath("//select[@id='ageMonth']")));
        selectMonth.selectByValue("December");
        Select selectDay = new Select(Driver.getDriver().findElement(By.name("ageDay")));
        selectDay.selectByIndex(0);


        Assert.assertEquals(selectYear.getFirstSelectedOption().getText(), "1933");
        Assert.assertEquals(selectMonth.getFirstSelectedOption().getText(), "December");
        Assert.assertEquals(selectDay.getFirstSelectedOption().getText(), "1");


    }

    @Test
    public void dropdownTask7(){

        Driver.getDriver().get("https://qa-automation-practice.netlify.app/dropdowns");
        Select selectCountry = new Select(Driver.getDriver().findElement(By.xpath("//select[@id='dropdown-menu']")));
        selectCountry.selectByVisibleText("India");
        selectCountry.selectByValue("Belgium");
        selectCountry.selectByIndex(1);

        Assert.assertEquals(selectCountry.getFirstSelectedOption().getText(), "Afghanistan");

    }

    @Test
    public void dropdownTask8(){

        Driver.getDriver().get("https://qa-automation-practice.netlify.app/dropdowns");
        WebElement firstLevelDropdown = Driver.getDriver().findElement(By.id("multi-level-dropdown-btn"));
        firstLevelDropdown.click();
        WebElement secondLevelDropdown = Driver.getDriver().findElement(By.xpath("//a[.='Hover me for more options']"));
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(secondLevelDropdown).perform();
        WebElement thirdLevelDropdown = Driver.getDriver().findElement(By.xpath("//a[.='Even More..']"));
        actions.moveToElement(thirdLevelDropdown).perform();
        WebElement fourthLevelDropdown = Driver.getDriver().findElement(By.xpath("//a[.='another level']"));
        actions.moveToElement(fourthLevelDropdown).perform();
        WebElement desiredElement = Driver.getDriver().findElement(By.xpath("//a[.='4th level - 3']"));
        desiredElement.click();

        String currentURl = Driver.getDriver().getCurrentUrl();
        String expectedURL = "https://qa-automation-practice.netlify.app/dropdowns#4th-level-3";

        Assert.assertEquals(currentURl, expectedURL);


    }


    @AfterMethod
    public void tearDown(){
        Driver.closeDriver();
    }



}
