package com.testinium.base;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class BaseTest {
public WebDriver driver;
//public ChromeOptions options;
DesiredCapabilities capabilities = new DesiredCapabilities();

@Before
    public void setup(){

    System.setProperty("webdriver.chrome.driver","src/test/java/driver/chromedriver.exe");
    ChromeOptions options = new ChromeOptions();
   // options.addArguments("--kiosk");
     options.addArguments("--disable-notifications");
    options.addArguments("start-maximized");
    driver = new ChromeDriver(options);
    driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
    driver.get("https://www.gittigidiyor.com");
}

@After
    public void tearDown()  {
    driver.quit();
    System.out.println("Calisti");
}
}
