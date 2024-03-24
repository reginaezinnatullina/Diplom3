package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomeRegistration {
    private WebDriver driver;
    private By buttonNewRegistation = By.xpath("//a[@class='Auth_link__1fOlj' and @href='/register']");
    private By name = By.xpath(".//input[@name='name']");
    private By email = By.xpath("//label[text()='Email']/following-sibling::input");
    private By password = By.xpath("//input[@type='password']");
    private By buttonRegistation = By.className("button_button__33qZ0");
    private By buttonInput = By.xpath("//a[@class='Auth_link__1fOlj' and @href='/login']");
    private By forgotPassword = By.xpath("//a[@class='Auth_link__1fOlj' and @href='/forgot-password']");
    private By buttonInputForgotPassword = By.className("button_button__33qZ0");
    private By buttonLogo = By.className("AppHeader_header__logo__2D0X2");
    private By buttonConstractor = By.className("AppHeader_header__link__3D_hX");
    private By buttonOut = By.className("Account_button__14Yp3");


    public HomeRegistration(WebDriver driver) {
        this.driver = driver;
    }
    public void setNewButtonRegistation() {
        new WebDriverWait(driver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(buttonNewRegistation));
        driver.findElement(buttonNewRegistation).click();
    }

    public void setEmailPasswordRegistation(String username, String useremail, String userpassword){
        driver.findElement(name).sendKeys(username);
        driver.findElement(email).sendKeys(useremail);
        driver.findElement(password).sendKeys(userpassword);
    }
    public void setButtonRegistation() {
        driver.findElement(buttonRegistation).click();
    }
    public void setButtonInput() {
        driver.findElement(buttonInput).click();
    }
    public void setForgotPassword() {
        driver.findElement(forgotPassword).click();
    }
    public void setButtonInputForgotPassword(){
        driver.findElement(buttonInputForgotPassword).click();
    }
    public void setButtonLogo(){
        driver.findElement(buttonLogo).click();
    }
    public void setButtonConstractor(){
        driver.findElement(buttonConstractor).click();
    }
    public void setButtonOut(){
        new WebDriverWait(driver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(buttonOut));
        driver.findElement(buttonOut).click();
    }
}
