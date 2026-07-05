package com.cydeo.tests.shorts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P02_Close_Quit_Page {

    public static void main(String[] args) throws InterruptedException {


        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");

        Thread.sleep(3000);

        driver.close();

//        driver.quit();

    }

}
