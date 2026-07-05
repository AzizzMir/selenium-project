package com.cydeo.tests.shorts;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class P28_RightClickPractice {

    @Test
    public void rightClickTest(){

        Driver.getDriver().get("https://qa-automation-practice.netlify.app/tab");
        WebElement link = Driver.getDriver().findElement(By.xpath("//a[.='Home']"));

        Actions actions = new Actions(Driver.getDriver());
        actions.contextClick(link).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();



    }



}
