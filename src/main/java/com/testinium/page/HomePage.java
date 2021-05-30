package com.testinium.page;

import com.testinium.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {

        super(driver);
    }

    public HomePage homePageSteps()  {
        hoverElements(By.cssSelector("div[data-cy='header-user-menu']"));
        clickVisibleElement(By.cssSelector("a[data-cy='header-login-button']"));
        return this;
    }
}
