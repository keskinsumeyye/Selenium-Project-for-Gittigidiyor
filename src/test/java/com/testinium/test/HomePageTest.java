package com.testinium.test;

import com.testinium.base.BaseTest;
import com.testinium.page.HomePage;
import org.junit.Before;
import org.junit.Test;

import java.util.concurrent.TimeUnit;


public class HomePageTest extends BaseTest {
    HomePage homePage ;

    @Before
    public void before(){
    homePage = new HomePage(driver);
    }

    @Test
    public void homePageTest() throws InterruptedException {
        homePage.homePageSteps();

    }
}
