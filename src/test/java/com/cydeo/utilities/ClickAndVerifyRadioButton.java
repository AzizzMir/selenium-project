package com.cydeo.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ClickAndVerifyRadioButton {


    public static void clickAndVerifyRadioButton(WebDriver driver, String name, String id) {

        List<WebElement> radioButtons = driver.findElements(By.name(name));

        for (WebElement radioButton : radioButtons) {
            String actualID = radioButton.getAttribute("id");
            System.out.println(actualID);
            if (actualID.equals(id)) {
                radioButton.click();
                System.out.println(actualID + " is selected!" + radioButton.isSelected());
                break;
            }
        }

    }
}
