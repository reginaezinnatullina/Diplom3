package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class Constractor {
    private WebDriver driver;
    private By sause =  By.xpath("//span[text()='Соусы']/..");
    private By buns = By.xpath("//span[text()='Булки']/..");
    private By filling = By.xpath("//span[text()='Начинки']/..");
    // локаторы для начинки
    private final By ingredientFillingButton = By.xpath("//span[text()='Начинки']/..");

    public Constractor(WebDriver driver) {
        this.driver = driver;
    }
    public void setSause(){
        driver.findElement(sause).click();
    }


        public void setBuns(){
        driver.findElement(buns).click();
        }
    public void setFilling(){
        driver.findElement(filling).click();
    }


}
