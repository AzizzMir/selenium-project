package com.cydeo.tests.day03_cssSelector_xpath;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T2_Locators_GetText_GetAttribute {

    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        driver.get("https://login1.nextbasecrm.com");

        String expectedRememberMeText = "Remember me on this computer";
        String actualRememberMeText = driver.findElement(By.className("login-item-checkbox-label")).getText();
        if (actualRememberMeText.equals(expectedRememberMeText)) {
            System.out.println("Remember me text verification passed!");
        }else{
            System.out.println("Remember me text verification failed!");
        }

        WebElement forgotPasswordText = driver.findElement(By.className("login-link-forgot-pass"));
        String expectedForgotPasswordText = "FORGOT YOUR PASSWORD?";
        String actualForgotPasswordText = forgotPasswordText.getText();
        if (actualForgotPasswordText.equals(expectedForgotPasswordText)) {
            System.out.println("Forgot your password verification passed!");
        }else {
            System.out.println("Forgot your password verification failed!");
        }


        String expectedForgotpasswordHref = "forgot_password=yes";
        String actualForgotpasswordHref = forgotPasswordText.getAttribute("href");
        if (actualForgotpasswordHref.contains(expectedForgotpasswordHref)){
            System.out.println("Forgot your password href verification passed!");
        }else {
            System.out.println("Forgot your password href verification failed!");
        }

        driver.close();


    }
}
