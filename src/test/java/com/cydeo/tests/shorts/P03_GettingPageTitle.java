package com.cydeo.tests.shorts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P03_GettingPageTitle {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.get("https://cydeo.com");

        if (driver.getTitle().equals("Cydeo")) {
            System.out.println("Page title is correct");
        }else
            System.out.println("Page title is incorrect");

        driver.close();

    }


}
