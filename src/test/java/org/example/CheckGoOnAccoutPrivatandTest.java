package org.example;

import io.qameta.allure.junit4.DisplayName;
import org.junit.Test;

public class CheckGoOnAccoutPrivatandTest extends BaseTest{
    @Test
    @DisplayName("Тест перехода в личный кабинет и переход по клику на логотип Stellar Burgers")
    public void testCheckGoOnAccoutPrivatandThrowLogotype() {
        // создай объект класса главной страницы приложения
        HomeLogin objHomePageOne = new HomeLogin(driver);
        HomeRegistration objHomePageTwo = new HomeRegistration(driver);
        // кликни на кнопку "личный кабинет"
        objHomePageOne.setPersonal_account();
        objHomePageTwo.setButtonLogo();
    }

    @Test
    @DisplayName("Тест перехода в личный кабинет и переход по клику на «Конструктор»")
    public void testCheckGoOnAccoutPrivatandThrowConstractor() {
        // создай объект класса главной страницы приложения
        HomeLogin objHomePageOne = new HomeLogin(driver);
        HomeRegistration objHomePageTwo = new HomeRegistration(driver);
        // кликни на кнопку "личный кабинет"
        objHomePageOne.setPersonal_account();
        objHomePageTwo.setButtonConstractor();
    }

    @Test
    @DisplayName("Тест перехода по клику на «Конструктор» и на страницу соусы, начинки и булки")
    public void testCheckGoOnSause() {
        HomeRegistration objHomePageTwo = new HomeRegistration(driver);
        Constractor objHomePageThree = new Constractor(driver);
        objHomePageTwo.setButtonConstractor();
        objHomePageThree.setSause();
        objHomePageThree.setBuns();
        objHomePageThree.setFilling();
    }
}
