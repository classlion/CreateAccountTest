package com.phonebook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTests extends TestBase {
    //
    @Test
    public void loginPositiveTest() {
        //click on Login Link
        clickOnLoginLink();

        //enter Email to email field
        //click, ochishenie, dannie
        fillRegisterLoginForm(new User().setEmail("classlion1@gmail.com").setPassword("Aa12345$"));

        //click Login button
        clickOnLoginButton();

        //verify SingOut Link is displayed
        Assert.assertTrue(isSignOutButtonPresent());
    }

    @Test
    public void loginNegativeWithoutEmailTest() {
        //click on Login Link
        clickOnLoginLink();

        //enter Email to email field
        //click, clear, dannie
        fillRegisterLoginForm(new User().setPassword("Aa12345$"));

        //click Login button
        clickOnLoginButton();

        //verify SingOut Link is displayed
        Assert.assertTrue(isAlertDisplayed());
    }

}
