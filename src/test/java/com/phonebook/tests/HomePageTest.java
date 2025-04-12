package com.phonebook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePageTest extends TestBase{

    @Test
    public void isHomeCopponentPresentTest(){
       //driver.findElement(By.cssSelector("div:nth-child(2)>div>div>h1")); ////div[2]/div/div/h1
        System.out.println("HomeComponent"+isHomeComponentPresent());
        Assert.assertTrue(isHomeComponentPresent());
    }


}

