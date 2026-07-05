package com.cydeo.tests.shorts;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import javax.swing.*;

public class P26_HoverPractice {

    @Test
    public void hoverTest(){

        Driver.getDriver().get("https://qa-automation-practice.netlify.app/mouse-hover");
        WebElement hoverBtn = Driver.getDriver().findElement(By.xpath("//button[@id='button-hover-over']"));

        Actions actions = new Actions(Driver.getDriver());

        actions.moveToElement(hoverBtn).perform();


    }

}
