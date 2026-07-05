package com.cydeo.tests.day05_testNG_intro_dropdowns;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T1_Stale_element_refrence {

    public static void main(String[] args) {


        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://practice.cydeo.com/add_remove_elements/");
        driver.manage().window().maximize();

        WebElement addElementButton = driver.findElement(By.xpath("//button[.='Add Element']"));
        addElementButton.click();

        WebElement deleteButton = driver.findElement(By.xpath("//button[.='Delete']"));
        System.out.println("deleteButton.isDisplayed() = " + deleteButton.isDisplayed());

        deleteButton.click();

        try{
            System.out.println("deleteButton.isDisplayed() = " + deleteButton.isDisplayed());
        }catch (StaleElementReferenceException e){
            System.out.println("StaleElementReferenceException happened on the web element!");
            System.out.println("test case passed!");
            System.out.println("deleteButton.isDisplayed() = false");
        }


        driver.close();


    }

}
