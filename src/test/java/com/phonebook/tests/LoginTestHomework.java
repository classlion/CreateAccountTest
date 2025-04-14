package com.phonebook.tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTestHomework extends TestBaseHomework {
    @Test(enabled = false)
    public void loginPositiveTest() {
        click(By.cssSelector("[href='/login']"));

        type(By.name("email"), "classlion1@gmail.com");

        type(By.name("password"), "Aa123456$");

        click(By.name("login"));

        Assert.assertTrue(isElementPresent(By.xpath("//button[.='Sign Out']")));
    }
}
