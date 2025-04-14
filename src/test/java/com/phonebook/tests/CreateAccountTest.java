package com.phonebook.tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateAccountTest  extends TestBase{

    @Test(enabled = false)
    public void newUserRegistrationPositiveTest(){
        //click on Login Link
        click(By.cssSelector("[href='/login']"));
        type(By.name("email"), "classlion1@gmail.com");

        type(By.name("password"), "Aa123456$");

        click(By.name("registration"));
        Assert.assertTrue(isElementPresent(By.xpath("//button[.='Sign Out']")));
    }

    @Test
    public void existedUserRegistrationNegativeTest(){
        //click on Login Link
        click(By.cssSelector("[href='/login']"));

        type(By.name("email"), "classlion1@gmail.com");

        type(By.name("password"), "Aa123456$");

        click(By.name("registration"));
        Assert.assertTrue(isAlleDisplayed());
    }


}
