package com.testinium.test;

import com.testinium.base.BaseTest;
import com.testinium.page.LoginPage;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class LoginPageTest extends BaseTest {
    LoginPage loginPage;
    @Before
    public void before(){
        loginPage = new LoginPage(driver);
    }
    @Test
    public void loginPageTest() {
        loginPage.loginPageSteps();
        System.out.println("url" + driver.getCurrentUrl());
    }
    @Test
    public void loginWithFacebookTest(){
        loginPage.LoginWithFaceBook();
        System.out.println("url" + driver.getCurrentUrl());
    }

    @Test
    public  void loginWithGoogleTest(){
        loginPage.loginWitHGoogle();
    }

}