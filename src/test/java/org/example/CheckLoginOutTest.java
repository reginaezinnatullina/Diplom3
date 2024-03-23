package org.example;

import io.qameta.allure.junit4.DisplayName;
import org.junit.Test;

public class CheckLoginOutTest extends BaseTest{
    @Test
    @DisplayName("Тест вsхода через кнопку «Выйти» в личном кабинете")
    public void testCheckLoginOut() {
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
}
