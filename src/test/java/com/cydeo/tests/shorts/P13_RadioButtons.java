package com.cydeo.tests.shorts;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class P13_RadioButtons {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://qa-automation-practice.netlify.app/radiobuttons.html");
        driver.manage().window().maximize();


        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        WebElement radioBtn = driver.findElement(By.xpath("//input[@id='radio-button1']"));

        System.out.println("radioBtn.isSelected() = " + radioBtn.isSelected());

        WebElement radioBtn2 = driver.findElement(By.xpath("//input[@id='radio-button4']"));

        System.out.println("radioBtn2.isEnabled() = " + radioBtn2.isEnabled());


    }

}
