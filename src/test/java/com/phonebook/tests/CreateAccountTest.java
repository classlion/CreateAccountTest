package com.phonebook.tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CreateAccountTest  extends TestBase{

    @Test
    public void newUserRegistrationPositiveTest(){
        //click on Login Link
        driver.findElement(By.cssSelector("[href='/login']")).click();
        driver.findElement(By.name("email")).click();
        driver.findElement(By.name("email")).click();
        driver.findElement(By.name("email")).sendKeys("classlion1@gmail.com");

        driver.findElement(By.name("password")).click();
        driver.findElement(By.name("password")).click();
        driver.findElement(By.name("password")).sendKeys("Aa123456$");

        driver.findElement(By.name("registration")).click();
        Assert.assertTrue(isElementPresent(By.xpath("//button[.='Sign Out']")));

    }


}
