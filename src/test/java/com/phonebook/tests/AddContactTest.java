package com.phonebook.tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AddContactTest extends TestBase {
    //login
    @BeforeMethod
    public void precondition() {
        // precondition -> login
        // berem is class LoginTest
        clickOnLoginLink();
        fillRegisterLoginForm(new User().setEmail("classlion1@gmail.com").setPassword("Aa12345$"));
        clickOnLoginButton();
    }

    @Test
    public void addContactPositiveTest() {
        //click on Add link
        clickOnAdd();
        //enter name
        fillContactForm(new Contact()
                .setName("John")
                .setLastname("Doe")
                .setPhone("1234567890")
                .setEmail("jk@kl.com")
                .setAddress("123 Main St, New York, NY 10001")
                .setDescription("test"));
        //click on Save button
        clickOnSaveButton();
        //verify contact is added
        Assert.assertTrue(isContaktAdded("John"));
    }

    @AfterMethod
    public void postCondition() {
        deleteContact();
    }
}