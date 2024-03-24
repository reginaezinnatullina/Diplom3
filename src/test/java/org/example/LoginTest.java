package org.example;

import io.qameta.allure.junit4.DisplayName;
import org.junit.Test;

// Класс с автотестом
public class LoginTest extends BaseTest{

    @Test
    @DisplayName("Тест входа по кнопке Войти в аккаунт на главной")
    public void testCheckLoginOnMainPage() {
        HomeLogin objHomePageOne = new HomeLogin(driver);
        // кликни на кнопку "заказать"
        objHomePageOne.setButtonInputOnMainPage();
        // выполни авторизацию
        objHomePageOne.setEmailPassword("12323@mail.ru", "3435345");
        objHomePageOne.setInput();
    }


    @Test
    @DisplayName("Тест входа через кнопку «Личный кабинет»")
    public void testCheckLoginThrowButtonPersonalAccount() {//
        HomeLogin objHomePageOne = new HomeLogin(driver);
        // кликни на кнопку "заказать"
        objHomePageOne.setPersonal_account();
        // выполни авторизацию
        objHomePageOne.setEmailPassword("12323@mail.ru", "3435345");
        objHomePageOne.setInput();
    }
    @Test
    @DisplayName("Тест входа через кнопку в форме регистрации")
    public void testCheckLoginThrowButtonRegistration() {
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

    @Test
    @DisplayName("Тест входа через кнопку в форме восстановления пароля")
    public void testCheckLoginThrowButtonRPassword() {
        HomeLogin objHomePageOne = new HomeLogin(driver);
        HomeRegistration objHomePageTwo = new HomeRegistration(driver);
        // кликни на кнопку "заказать"
        objHomePageOne.setPersonal_account();
        objHomePageTwo.setForgotPassword();
        objHomePageTwo.setButtonInput();
        objHomePageOne.setEmailPassword("12323@mail.ru", "3435345");
        objHomePageTwo.setButtonInputForgotPassword();
    }
}