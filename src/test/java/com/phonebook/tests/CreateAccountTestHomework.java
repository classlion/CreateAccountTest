package com.phonebook.tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateAccountTestHomework extends TestBaseHomework {

    @Test
    public void newUserRegistrationPositiveTest(){
        //click on Login Link

        click(By.cssSelector("[href='/register']"));
        fillRagesterLoginForm(new NewUserHomework()
                .setFirstName("Oliver")
                .setLastName("Smith")
                .setEmail("1234EWRWRE@gmail.com")
                .setPassword("something")
                .setConfirmPassword("something"));
        click(By.id("register-button"));
        Assert.assertTrue(isElementPresent(By.xpath("//h1[.='Register']")));
    }

    @Test
    public void newUserRegistrationNegativeTest(){
        //click on Login Link
        int i=(int)(System.currentTimeMillis()/1000)%3600;
        click(By.cssSelector("[href='/register']"));
        fillRagesterLoginForm(new NewUserHomework()
                        .setFirstName("Oliver")
                        .setLastName("Smith")
                        .setEmail("1234@gmail.com")
                        .setPassword("something")
                        .setConfirmPassword("ELSE"));
        click(By.id("register-button"));
        Assert.assertFalse(isElementPresent(By.xpath("field-validation-error")));

    }


}
