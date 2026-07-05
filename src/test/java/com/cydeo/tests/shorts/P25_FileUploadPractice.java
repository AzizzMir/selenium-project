package com.cydeo.tests.shorts;

import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class P25_FileUploadPractice {

    @Test
    public void fileUploadTest(){

        Driver.getDriver().get(ConfigurationReader.getProperty("env"));

        WebElement fileBtn = Driver.getDriver().findElement(By.id("file_upload"));
        fileBtn.sendKeys("/Users/azizmir/Downloads/Quality Assurance Engineer..............Screening Interview...pdf");

        BrowserUtils.sleep(3);

        Driver.getDriver().findElement(By.xpath("//button[@type='submit']")).click();



    }

}
