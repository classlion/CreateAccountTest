package com.phonebook.tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateAccountTestHomework extends TestBaseHomework {

    @Test
    public void newUserRegistrationPositiveTest(){
        //click on Login Link
        int i=(int)(System.currentTimeMillis()/1000)%3600;

        click(By.cssSelector("[href='/register']"));

        type(By.id("FirstName"), "Oliver");

        type(By.id("LastName"), "Jackson");

        type(By.id("Email"), "test"+i+"@test.com");

        type(By.id("Password"), "something");
        type(By.id("ConfirmPassword"), "something");

        click(By.id("register-button"));

        Assert.assertTrue(isElementPresent(By.xpath("//h1[.='Register']")));
    }

    @Test
    public void newUserRegistrationNegativeTest(){
        //click on Login Link
        int i=(int)(System.currentTimeMillis()/1000)%3600;

        click(By.cssSelector("[href='/register']"));

        type(By.id("FirstName"), "Oliver");

        type(By.id("LastName"), "Jackson");

        type(By.id("Email"), "test"+i+"@test.com");

        type(By.id("Password"), "something");
        type(By.id("ConfirmPassword"), "else");

        click(By.id("register-button"));

        Assert.assertFalse(isElementPresent(By.xpath("field-validation-error")));

    }


}
