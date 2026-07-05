package com.cydeo.tests.shorts;

import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class P14_CheckBox {

    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://qa-automation-practice.netlify.app/checkboxes");
        driver.manage().window().maximize();

        WebElement checkbox = driver.findElement(By.id("checkbox1"));
        System.out.println("Before clicking checkbox.isSelected() = " + checkbox.isSelected());
        checkbox.click();

        System.out.println("After clicking checkbox.isSelected() = " + checkbox.isSelected());

        BrowserUtils.sleep(3);
        driver.close();


    }

}
