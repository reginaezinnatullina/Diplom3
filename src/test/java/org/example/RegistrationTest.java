package org.example;

import org.junit.Test;

// Класс с автотестом
public class RegistrationTest extends BaseTest{
//    private WebDriver driver;
//    @Before
//    public void startUp() {
//        WebDriverManager.chromedriver().setup();
//    }

    //Тест успешной регистрации
    @Test
    public void testCheckGoodRegistration() {
//        // драйвер для браузера ChromeDriver
//        WebDriver driver = new ChromeDriver();
//        // переход на страницу тестового приложения
//        driver.get("https://stellarburgers.nomoreparties.site/");
//        // создай объект класса главной страницы приложения
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
    //Тест неуспешной регистрации
    @Test
    public void testCheckBadRegistration() {
//        // драйвер для браузера ChromeDriver
//        WebDriver driver = new ChromeDriver();
//        // переход на страницу тестового приложения
//        driver.get("https://stellarburgers.nomoreparties.site/");
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
    //Тест перехода в личный кабинет и переход по клику на логотип Stellar Burgers.
    @Test
    public void testCheckGoOnAccoutPrivatandThrowLogotype() {
//        // драйвер для браузера ChromeDriver
//        WebDriver driver = new ChromeDriver();
//        // переход на страницу тестового приложения
//        driver.get("https://stellarburgers.nomoreparties.site/");
        // создай объект класса главной страницы приложения
        HomeLogin objHomePageOne = new HomeLogin(driver);
        HomeRegistration objHomePageTwo = new HomeRegistration(driver);
        // кликни на кнопку "личный кабинет"
        objHomePageOne.setPersonal_account();
        objHomePageTwo.setButtonLogo();
    }
    //Тест перехода в личный кабинет и переход по клику на «Конструктор».
    @Test
    public void testCheckGoOnAccoutPrivatandThrowConstractor() {
//        // драйвер для браузера ChromeDriver
//        WebDriver driver = new ChromeDriver();
//        // переход на страницу тестового приложения
//        driver.get("https://stellarburgers.nomoreparties.site/");
        // создай объект класса главной страницы приложения
        HomeLogin objHomePageOne = new HomeLogin(driver);
        HomeRegistration objHomePageTwo = new HomeRegistration(driver);
        // кликни на кнопку "личный кабинет"
        objHomePageOne.setPersonal_account();
        objHomePageTwo.setButtonConstractor();
    }
    //Тест перехода по клику на «Конструктор» и на страницу соусы, начинки и булки.
    @Test
    public void testCheckGoOnSause() {
//        // драйвер для браузера ChromeDriver
//        WebDriver driver = new ChromeDriver();
//        // переход на страницу тестового приложения
//        driver.get("https://stellarburgers.nomoreparties.site/");
        HomeRegistration objHomePageTwo = new HomeRegistration(driver);
        Constractor objHomePageThree = new Constractor(driver);
        objHomePageTwo.setButtonConstractor();
        objHomePageThree.setSause();
        objHomePageThree.setBuns();
        objHomePageThree.setFilling();


    }

//    @After
//    public void tearDown() {
//        if(driver != null){
//            driver.quit();
//        }
//    }
}