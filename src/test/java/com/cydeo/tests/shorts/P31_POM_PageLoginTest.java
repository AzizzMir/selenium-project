package com.cydeo.tests.shorts;

import com.cydeo.tests.pages.PageLoginPage;
import com.cydeo.utilities.Driver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class P31_POM_PageLoginTest {

    @Test
    public void pageLoginTestPOM() {

        Driver.getDriver().get("https://qa-automation-practice.netlify.app/auth_ecommerce");

        PageLoginPage pageLogin = new PageLoginPage();
        pageLogin.email.sendKeys("admin@admin.com");
        pageLogin.password.sendKeys("admin123");
        pageLogin.submitBtn.click();

        String actualTitle = Driver.getDriver().getTitle();
        String expectedTitle = "QA Practice | Learn with RV";

        Assert.assertEquals(actualTitle, expectedTitle, "Title verification failed");






    }


}
