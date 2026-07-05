package com.cydeo.tests.day04_findElements_checkBoxes_radio;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.time.Duration;

public class T4_StaleElementReferenceException {

    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://practice.cydeo.com/abtest");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        WebElement link = driver.findElement(By.xpath("//a[@target='_blank']"));
        System.out.println(link.isDisplayed());
        driver.navigate().refresh();
        System.out.println(link.isDisplayed());

        driver.close();

        WebElement link2 = driver.findElement(By.xpath("//div/div[@id='uh98']/div"));
        WebElement link3 = driver.findElement(By.xpath("(//div/div[@id='uh98']/div)[2]"));


    }
}
