package com.cydeo.tests.day04_findElements_checkBoxes_radio;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T1_xpath_cssSelector_Practices {

    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://practice.cydeo.com/forgot_password");

        //cssSelector only
//        WebElement homeLink = driver.findElement(By.cssSelector("a.nav-link"));
//        System.out.println(homeLink.getText());
//        WebElement forgetPasswordHeader = driver.findElement(By.cssSelector("div.example"));
//        System.out.println(forgetPasswordHeader.getText());
//        WebElement emailText = driver.findElement(By.cssSelector("label[for='email']"));
//        System.out.println(emailText.getText());
//        WebElement emailInputBox = driver.findElement(By.cssSelector("input[type='text']"));
//        System.out.println(emailInputBox.isDisplayed());
//        WebElement retrievePasswordButton = driver.findElement(By.cssSelector("button#form_submit"));
//        System.out.println(retrievePasswordButton.isDisplayed());
//        WebElement poweredByText  = driver.findElement(By.cssSelector("div[style='text-align: center;']"));
//        System.out.println(poweredByText.getText());

        //xpath only
        WebElement homeLink1 = driver.findElement(By.xpath("//a[@class='nav-link']"));
        System.out.println(homeLink1.getText());
        WebElement forgetPasswordHeader1 = driver.findElement(By.xpath("//div[@class='example']"));
        System.out.println(forgetPasswordHeader1.getText());
        WebElement emailText1 = driver.findElement(By.xpath("//label[@for='email']"));
        System.out.println(emailText1.getText());
        WebElement emailInputBox1 = driver.findElement(By.xpath("//input[@type='text']"));
        System.out.println(emailInputBox1.isDisplayed());
        WebElement retrievePasswordButton1 = driver.findElement(By.xpath("//button[@id='form_submit']"));
        System.out.println(retrievePasswordButton1.isDisplayed());
        WebElement poweredByText1 = driver.findElement(By.xpath("//div[@style='text-align: center;']"));
        System.out.println(poweredByText1.getText());

        driver.close();


    }
}
