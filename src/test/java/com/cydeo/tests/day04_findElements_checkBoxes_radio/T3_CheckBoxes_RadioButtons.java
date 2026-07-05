package com.cydeo.tests.day04_findElements_checkBoxes_radio;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.time.Duration;

public class T3_CheckBoxes_RadioButtons {

    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://practice.cydeo.com/checkboxes");

        WebElement checkBox1 = driver.findElement(By.name("checkbox1"));
        System.out.println(checkBox1.isSelected());

        WebElement checkBox2 = driver.findElement(By.name("checkbox2"));
        System.out.println(checkBox2.isSelected());

        checkBox1.click();
        checkBox2.click();

        System.out.println(checkBox1.isSelected());
        System.out.println(checkBox2.isSelected());

        driver.close();


    }
}
