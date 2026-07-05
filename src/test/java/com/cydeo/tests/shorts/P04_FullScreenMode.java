package com.cydeo.tests.shorts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P04_FullScreenMode {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.navigate().to("https://www.google.com");
        driver.manage().window().fullscreen();

        Thread.sleep(3000);

        driver.close();

    }

}
