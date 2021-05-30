package com.testinium.page;

import com.testinium.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.*;

public class LoginPage extends BasePage {
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public LoginPage loginPageSteps() {
        getHomePage().homePageSteps();
        sendKeys(By.id("L-UserNameField"),"sumeyyekeskin9@gmail.com");
        sendKeys(By.id("L-PasswordField"),"Tokyo126.");
        clickElement(By.id("gg-login-enter"));
        //TimeUnit.SECONDS.sleep(1000);
        return this;
    }
    public LoginPage LoginWithFaceBook(){
        getHomePage().homePageSteps();
        javascriptclicker(By.cssSelector("div[class='faux-fb-btn']"));
        switchToWindows();
        sendKeys(By.id("email"),"sumeyyekou@gmail.com");
        sendKeys(By.id("pass"),"Misha12.");
        clickElement(By.name("login"));
       // switchToWindows();
       // clickElement(By.id("termsofuse"));
        //clickElement(By.id("Facebook_User_Agreement_Approve"));

        //javascriptclicker(By.name("__CONFIRM__"));
        return this;
    }
    public LoginPage loginWitHGoogle(){
        getHomePage().homePageSteps();
        clickElement(By.id("customGoogleLoginBtn"));
        switchToWindows();
        sendKeys(By.id("identifierId"),"sumeyyekeskin9@gmail.com");
        clickElement(By.cssSelector("button[class*='AjY5Oe']"));
        return this;
    }

}
