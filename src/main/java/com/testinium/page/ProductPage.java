package com.testinium.page;

import com.testinium.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductPage extends BasePage {
    public ProductPage(WebDriver driver) {
        super(driver);
    }

    public ProductPage productPageSteps(){
        getLoginPage().loginPageSteps();
        sendKeys(By.cssSelector("div[class='sc-4995aq-4 dNPmGY']>input[type='text']"),"Bilgisayar");
        clickElement(By.cssSelector("div>button[data-cy='search-find-button']"));
        javascriptclicker(By.xpath("//a[contains(text(),'2')]"));
        randomClick(By.cssSelector("li[product-id]"));
        javascriptclicker(By.id("add-to-basket"));
        return this;
    }
}
