package com.testinium.base;

import com.testinium.page.HomePage;
import com.testinium.page.LoginPage;
import com.testinium.page.ProductPage;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import sun.rmi.runtime.Log;

import java.util.List;
import java.util.Random;
import java.util.Set;

public class BasePage {
    WebDriver driver;
    WebDriverWait wait;
    JavascriptExecutor executor;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(this.driver, 30, 500);
    }

    public WebElement findElement(By by) {
        return wait.until(ExpectedConditions.presenceOfElementLocated(by));
    }

    public List<WebElement> findElements(By by){
        return  wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(by));
    }

    public Actions getActions() {
        return new Actions(driver);
    }

    public void hoverElements(By by) {
        wait.until(ExpectedConditions.presenceOfElementLocated(by));
        getActions().moveToElement(findElement(by)).build().perform();
    }

    public void clickElement(By by){
        WebElement element = findElement(by);
        wait.until(ExpectedConditions.elementToBeClickable(element)).click();
    }

    public void scrollPageClick(By by){
        WebElement element = findElement(by);
        getExecutor().executeScript("arguments[0].scrollIntoView(true)",element);
        wait.until(ExpectedConditions.elementToBeClickable(element)).click();
    }

    public WebElement visibleElement(By by){
       return wait.until(ExpectedConditions.visibilityOfElementLocated(by));
    }

    public void clickVisibleElement(By by){
        visibleElement(by).click();
    }


    public void sendKeys(By by, CharSequence text){
        wait.until(ExpectedConditions.presenceOfElementLocated(by));
        findElement(by).sendKeys(text);
    }

    public HomePage getHomePage(){
        return new HomePage(driver);
    }

    public LoginPage getLoginPage(){
        return new LoginPage(driver);
    }

    public ProductPage getProductPage(){
        return new ProductPage(driver);
    }

    public JavascriptExecutor getExecutor(){
        executor = (JavascriptExecutor)driver;
        return  executor;
    }

    public void javascriptclicker(By by) {
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        WebElement element = findElement(by);
        executor.executeScript("arguments[0].click();", element);
    }

    public void randomClick(By by){
        List<WebElement> elements = findElements(by);
        int maxProducts = elements.size();
        Random random = new Random();
        int index = random.nextInt(maxProducts);
        elements.get(index).click();
    }

    public void selectDropDown(By by, String text){
        WebElement element = findElement(by);
        Select selected = new Select(element);
        selected.selectByVisibleText(text);
    }

    public void switchToWindows(){
    String parentWindow = driver.getWindowHandle();
    Set<String> windows = driver.getWindowHandles();
        for(String window : windows){
            if(!parentWindow.equals(window)){
                driver.switchTo().window(window);
            }
        }
    }


}

