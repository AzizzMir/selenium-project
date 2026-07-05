package com.cydeo.tests.day02_locators_getText_getAttiribute;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class T1_CydeoVerifications {

    public static void main(String[] args) {


        WebDriver driver = new ChromeDriver();

        driver.get("https://practice.cydeo.com/");

        String expectedInUrl = "cydeo";
        String actualURL = driver.getCurrentUrl();

        if (actualURL.contains(expectedInUrl)) {
            System.out.println("Url verification passed!");
        }else {
            System.out.println("Url verification failed!");
        }

        String expectedTitle = "Practice";
        String actualTitle = driver.getTitle();

        if (actualTitle.equals(expectedTitle)) {
            System.out.println("Title verification passed!");
        }else {
            System.out.println("Title verification failed!");
        }

        driver.close();

    }

}
