package com.cydeo.tests.shorts;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class P11_FindElementByXpath {

    public static void main(String[] args) {


        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://www.google.com");
        driver.manage().window().maximize();

        WebElement aiFooter = driver.findElement(By.xpath("//span[@class='ktLKi']"));
        aiFooter.click();
        WebElement aiPageHeader = driver.findElement(By.xpath("//h1[@class='cover__text--title cover__text--title--top']"));

        System.out.println("aiPageHeader.getAttribute(\"class\") = " + aiPageHeader.getAttribute("class"));
        if (aiPageHeader.getText().equals("Build, create, and do more with AI tools from Google")){
            System.out.println("Text verification passed!");
        }else{
            System.out.println("Text verification failed!");
        }

        driver.close();
    }

}
