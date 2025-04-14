package com.phonebook.tests;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AddContactsTest extends TestBase{
    //login
    @BeforeMethod

    public void precondition(){
        click(By.cssSelector("[href='/login']"));
        type(By.name("email"), "classlion1@gmail.com");
        type(By.name("password"), "Aa123456$");
        click(By.name("login"));
    }

    @Test
    public void addContactPositiveTest(){

        int i=(int)(System.currentTimeMillis()/1000)%3600;

        click(By.cssSelector("[href='/add']"));

        type(By.cssSelector("input:nth-child(1)"), "Oliver");

        type(By.cssSelector("input:nth-child(2)"), "Jackson");

        type(By.cssSelector("input:nth-child(3)"), "1234567890");

        type(By.cssSelector("input:nth-child(4)"), "test"+i+"@test.com");

        type(By.cssSelector("input:nth-child(5)"), "Willow street 15");

        type(By.cssSelector("input:nth-child(6)"), "something");

        //save

        click(By.cssSelector(".add_form__2rsm2 button"));
    }

    //type(By.name("email"), "test"+i+"@test.com");




    //click on Add link

    //enter name
    //enter lastname
    //enter phone
    //enter email
    //enter address
    //enter description
    //click on save button

    //verify contact is Added

}
