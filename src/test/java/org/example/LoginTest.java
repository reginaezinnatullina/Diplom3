package org.example;

import org.junit.Test;

// Класс с автотестом
public class LoginTest extends BaseTest{
//    private WebDriver driver;
//    @Before
//    public void startUp() {
//        WebDriverManager.firefoxdriver().setup();
//        WebDriverManager.chromedriver().setup();
//    }
    //Тест входа по кнопке «Войти в аккаунт» на главной
    @Test
    public void testCheckLoginOnMainPage() {
        HomeLogin objHomePageOne = new HomeLogin(driver);
        // кликни на кнопку "заказать"
        objHomePageOne.setButtonInputOnMainPage();
        // выполни авторизацию
        objHomePageOne.setEmailPassword("12323@mail.ru", "3435345");
        objHomePageOne.setInput();
    }

    //Тест входа через кнопку «Личный кабинет»,
    @Test
    public void testCheckLoginThrowButtonPersonalAccount() {
//        // драйвер для браузера FireFox
//        WebDriver driver = new ChromeDriver();
//        // переход на страницу тестового приложения
//        driver.get("https://stellarburgers.nomoreparties.site/");
        // создай объект класса главной страницы приложения
        HomeLogin objHomePageOne = new HomeLogin(driver);
        // кликни на кнопку "заказать"
        objHomePageOne.setPersonal_account();
        // выполни авторизацию
        objHomePageOne.setEmailPassword("12323@mail.ru", "3435345");
        objHomePageOne.setInput();
    }
    //Тест входа через кнопку в форме регистрации,
    @Test
    public void testCheckLoginThrowButtonRegistration() {
//        // драйвер для браузера FireFox
//        WebDriver driver = new ChromeDriver();
//        // переход на страницу тестового приложения
//        driver.get("https://stellarburgers.nomoreparties.site/");
        // создай объект класса главной страницы приложения
        HomeLogin objHomePageOne = new HomeLogin(driver);
        HomeRegistration objHomePageTwo = new HomeRegistration(driver);
        // кликни на кнопку "заказать"
        objHomePageOne.setPersonal_account();
        objHomePageTwo.setNewButtonRegistation();
        objHomePageTwo.setButtonInput();
        // выполни авторизацию
        objHomePageOne.setEmailPassword("12323@mail.ru", "3435345");
        objHomePageOne.setInput();
    }
    //Тест входа через кнопку в форме восстановления пароля.
    @Test
    public void testCheckLoginThrowButtonRPassword() {
//        // драйвер для браузера FireFox
//        WebDriver driver = new ChromeDriver();
//        // переход на страницу тестового приложения
//        driver.get("https://stellarburgers.nomoreparties.site/");
        // создай объект класса главной страницы приложения
        HomeLogin objHomePageOne = new HomeLogin(driver);
        HomeRegistration objHomePageTwo = new HomeRegistration(driver);
        // кликни на кнопку "заказать"
        objHomePageOne.setPersonal_account();
        objHomePageTwo.setForgotPassword();
        objHomePageTwo.setButtonInput();
        objHomePageOne.setEmailPassword("12323@mail.ru", "3435345");
        objHomePageTwo.setButtonInputForgotPassword();
    }
    //Тест вsхода через кнопку «Выйти» в личном кабинете.
    @Test
    public void testCheckLoginOut() {
//        // драйвер для браузера FireFox
//        WebDriver driver = new ChromeDriver();
//        // переход на страницу тестового приложения
//        driver.get("https://stellarburgers.nomoreparties.site/");
        // создай объект класса главной страницы приложения
        HomeLogin objHomePageOne = new HomeLogin(driver);
        HomeRegistration objHomePageTwo = new HomeRegistration(driver);
        // кликни на кнопку "заказать"
        objHomePageOne.setPersonal_account();
        objHomePageTwo.setForgotPassword();
        objHomePageTwo.setButtonInput();
        objHomePageOne.setEmailPassword("12323@mail.ru", "3435345");
        objHomePageTwo.setButtonInputForgotPassword();
        objHomePageOne.setPersonal_account();
        objHomePageTwo.setButtonOut();

    }

    // Закрыть браузер
//    public void tearDown() {
//        if(driver != null){
//            driver.quit();
//        }
//    }
}