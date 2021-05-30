package com.testinium.page;

import com.testinium.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BasketPage extends BasePage {
    public BasketPage(WebDriver driver) {
        super(driver);
    }

    public BasketPage basketPageSteps()  {
        getProductPage().productPageSteps();
        clickElement(By.cssSelector("a[class='gg-ui-btn-default padding-none']"));
        selectDropDown(By.cssSelector("select[class='amount']"),"2");
        clickElement(By.cssSelector("a[class='btn-delete btn-update-item']"));
        return this;
    }
}
