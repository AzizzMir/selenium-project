package com.cydeo.tests.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageLoginPage {

    public PageLoginPage() {

        PageFactory.initElements(Driver.getDriver(), this);

    }

    @FindBy(id = "email")
    public WebElement email;

    @FindBy(id = "password")
    public WebElement password;

    @FindBy(id = "submitLoginBtn")
    public WebElement submitBtn;

}
