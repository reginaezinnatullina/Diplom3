package org.example;

import config.Browser;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;

public class BaseTest extends Browser {

     Browser browser;
     WebDriver driver;

    @Before
    public void startUp() {
        driver = browser.createWebDriver();
        driver.get("https://stellarburgers.nomoreparties.site/");
    }

    @After
    public void tearDown() {
        driver.quit();

    }
}