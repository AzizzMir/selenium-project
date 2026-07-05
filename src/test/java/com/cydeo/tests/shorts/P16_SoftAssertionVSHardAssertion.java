package com.cydeo.tests.shorts;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class P16_SoftAssertionVSHardAssertion {

    @Test
    public void hardAssestionTest(){
        System.out.println("HARD assertion");
        Assert.assertEquals("apple", "orange");
        System.out.println("HARD assertion failed");
    }


    @Test
    public void softAssestionTest(){
        System.out.println("SOFT assertion");
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals("apple", "app");
        System.out.println("SOFT assertion failed");
        softAssert.assertAll();
    }
}
