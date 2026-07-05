package com.cydeo.tests.shorts;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import java.util.Set;

public class P23_WindowHandling {

//    WebDriver driver;
//
//    @BeforeMethod
//    public void setUpMethod(){
//        driver = WebDriverFactory.getDriver("chrome");
//        driver.manage().window().maximize();
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//    }
    
    

    @Test
    public void windowHandling(){

        Driver.getDriver().get("https://qa-automation-practice.netlify.app/tab");
        String currnetWindowHandle = Driver.getDriver().getWindowHandle();
        System.out.println("currnetWindowHandle = " + currnetWindowHandle);

        Driver.getDriver().findElement(By.id("newTabBtn")).click();

        System.out.println("currnetWindowHandle = " + currnetWindowHandle);

        Set<String> allWindows = Driver.getDriver().getWindowHandles();
        System.out.println("allWindows = " + allWindows);

        for (String allWindow : allWindows) {
            Driver.getDriver().switchTo().window(allWindow);
            System.out.println("driver.getTitle() = " + Driver.getDriver().getTitle());

        }

    }

}
