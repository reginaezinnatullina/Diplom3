package org.example;

import io.qameta.allure.junit4.DisplayName;
import org.junit.Test;

// Класс с автотестом
public class RegistrationTest extends BaseTest{

    @Test
    @DisplayName("Тест успешной регистрации")
    public void testCheckGoodRegistration() {
        // создай объект класса главной страницы приложения
        HomeLogin objHomePageOne = new HomeLogin(driver);
        HomeRegistration objHomePageTwo = new HomeRegistration(driver);
        // кликни на кнопку "личный кабинет"
        objHomePageOne.setPersonal_account();
        //кликни на кнопку "регистрация"
        objHomePageTwo.setNewButtonRegistation();
        // выполни авторизацию
        objHomePageTwo.setEmailPasswordRegistation("Anna","12323@mail.ru", "3435345");
        objHomePageTwo.setButtonRegistation();
    }

    @Test
    @DisplayName("Тест неуспешной регистрации")
    public void testCheckBadRegistration() {
        // создай объект класса главной страницы приложения
        HomeLogin objHomePageOne = new HomeLogin(driver);
        HomeRegistration objHomePageTwo = new HomeRegistration(driver);
        // кликни на кнопку "личный кабинет"
        objHomePageOne.setPersonal_account();
        //кликни на кнопку "регистрация"
        objHomePageTwo.setNewButtonRegistation();
        // выполни авторизацию
        objHomePageTwo.setEmailPasswordRegistation("Anna","12323@mail.ru", "3435");
        objHomePageTwo.setButtonRegistation();
    }

}