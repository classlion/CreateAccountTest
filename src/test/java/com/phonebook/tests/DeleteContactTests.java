package com.phonebook.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DeleteContactTests extends TestBase {

    //precondition
    @BeforeMethod
    public void precondition() {
        //login
        clickOnLoginLink();
        fillRegisterLoginForm(new User().setEmail("classlion1@gmail.com").setPassword("Aa12345$"));
        clickOnLoginButton();
        clickOnAdd();
        //add contact
        fillContactForm(new Contact()
                .setName("John")
                .setLastname("Doe")
                .setPhone("1234567890")
                .setEmail("jk@kl.com")
                .setAddress("123 Main St, New York, NY 10001")
                .setDescription("test"));
        clickOnSaveButton();

    }
    //test
    @Test
    public void deleteContactTest(){
        int sizeBefore = sizeOfContacts();
        //click on the card
        //click on remove button
        deleteContact();
        //verify contact is deleted(by size)
        pause(1000);
        int sizeAfter = sizeOfContacts();
        Assert.assertEquals(sizeAfter, sizeBefore - 1);

    }

}