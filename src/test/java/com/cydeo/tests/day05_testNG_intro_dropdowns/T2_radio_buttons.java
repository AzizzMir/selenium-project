package com.cydeo.tests.day05_testNG_intro_dropdowns;

import com.cydeo.utilities.ClickAndVerifyRadioButton;
import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T2_radio_buttons {

    public static void main(String[] args) {



        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://practice.cydeo.com/radio_buttons");
        driver.manage().window().maximize();

        ClickAndVerifyRadioButton.clickAndVerifyRadioButton(driver, "sport", "hockey");

        WebElement hockeyRadioBtn = driver.findElement(By.xpath("//input[@id='hockey']"));
        hockeyRadioBtn.click();

        if(hockeyRadioBtn.isSelected()) {
            System.out.println("Passed!");
        }else {
            System.out.println("Failed!");
        }

        driver.close();

    }

}
