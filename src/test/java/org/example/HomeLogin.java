package org.example;

        import org.openqa.selenium.By;
        import org.openqa.selenium.WebDriver;

        import static org.junit.Assert.assertEquals;

        import org.openqa.selenium.support.ui.ExpectedConditions;
        import org.openqa.selenium.support.ui.WebDriverWait;

        import java.time.Duration;

// Класс главной страницы
class HomeLogin {
    private WebDriver driver;
    private By personal_account = By.xpath("//a[@class='AppHeader_header__link__3D_hX' and @href='/account']");
    private By email = By.xpath("//label[text()='Email']/following-sibling::input");
    private By password = By.xpath("//input[@type='password']");
    private By input = By.xpath(".//button [text()='Войти']");
    private By buttonInputOnMainPage = By.className("button_button__33qZ0");

    public HomeLogin(WebDriver driver) {
        this.driver = driver;
    }
    public void setPersonal_account() {
        new WebDriverWait(driver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(personal_account));
        driver.findElement(personal_account).click();
    }

    public void setEmailPassword(String useremail, String userpassword){
        driver.findElement(email).sendKeys(useremail);
        driver.findElement(password).sendKeys(userpassword);
    }
    public void setInput(){
        new WebDriverWait(driver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(input));
        driver.findElement(input).click();
    }
    public void setButtonInputOnMainPage() {
        new WebDriverWait(driver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(buttonInputOnMainPage));
        driver.findElement(buttonInputOnMainPage).click();
    }
}
