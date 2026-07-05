package com.cydeo.tests.day03_cssSelector_xpath;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T1_locators_getText {

    public static void main(String[] args) {

//        WebDriverManager.chromedriver().setup();
//        WebDriver driver = new ChromeDriver();

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        driver.get("https://login1.nextbasecrm.com/");
        WebElement usernameInput = driver.findElement(By.name("USER_LOGIN"));
        usernameInput.sendKeys("incorrect");

        WebElement passwordInput = driver.findElement(By.name("USER_PASSWORD"));
        passwordInput.sendKeys("incorrect");

        WebElement submitButton = driver.findElement(By.className("login-btn"));
        submitButton.click();

        WebElement errorText = driver.findElement(By.className("errortext"));

        String expectedErrorMessage = "Incorrect login or password";
        String actualErrorMessage = errorText.getText();

        if (actualErrorMessage.equals(expectedErrorMessage)) {
            System.out.println("Error message verification passed!");
        }else {
            System.out.println("Error message verification failed!");
        }

        driver.close();





    }
}
