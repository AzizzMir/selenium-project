package com.cydeo.tests.day06_alerts_iframes_windows;

import com.cydeo.utilities.Driver;
import io.cucumber.java.cs.Ale;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Alert_practices_T1_T2_T3 {

    @BeforeMethod
    public void setUpMethod() {

        Driver.getDriver().get("https://qa-automation-practice.netlify.app/alerts");

    }

    @Test
    public void alertPracticeT1(){

        WebElement alertBtn = Driver.getDriver().findElement(By.xpath("//button[@id='alert-btn']"));
        alertBtn.click();
        Alert alert = Driver.getDriver().switchTo().alert();
        alert.accept();

    }

    @Test
    public void alertPracticeT2(){

        WebElement confirmBtn = Driver.getDriver().findElement(By.xpath("//button[@id='confirm-btn']"));
        confirmBtn.click();
        Alert alert = Driver.getDriver().switchTo().alert();
        alert.dismiss();

    }

    @Test
    public void alertPracticeT3(){

        String inputText = "hello";
        Driver.getDriver().get("https://www.qa-practice.com/elements/alert/prompt");
        WebElement informationAlert = Driver.getDriver().findElement(By.xpath("//a[.='Click']"));
        informationAlert.click();
        Alert alert = Driver.getDriver().switchTo().alert();
        alert.sendKeys(inputText);
        alert.accept();
        WebElement resultText = Driver.getDriver().findElement(By.id("result-text"));

        Assert.assertEquals(resultText.getText(), inputText);


    }



    @AfterMethod
    public void tearDownMethod() {
        Driver.closeDriver();

    }




}
