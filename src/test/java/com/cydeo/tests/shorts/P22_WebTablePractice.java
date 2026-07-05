package com.cydeo.tests.shorts;

import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class P22_WebTablePractice {

    WebDriver driver;

    @BeforeMethod
    public void setUpMethod(){
//        driver = WebDriverFactory.getDriver("chrome");
        driver = WebDriverFactory.getDriver(ConfigurationReader.getProperty("browser"));
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @Test
    public void P22_WebTableTest(){
        driver.get("https://qa-automation-practice.netlify.app/web-table");
        WebElement tableElm = driver.findElement(By.xpath("//td[.='Jacob']"));
        System.out.println("tableElm.getText() = " + tableElm.getText());

        List<WebElement> row2 = driver.findElements(By.xpath("//table[@class='table']//tr[2]//td"));
        for (WebElement webElement : row2) {
            System.out.println("webElement.getText() = " + webElement.getText());
        }


    }

}
