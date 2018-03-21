package com.telesens.test.appmanager.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class BasePage {
    protected WebDriver driver;

    public BasePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    protected void type(WebElement inputField, String value) {
        inputField.click();
        inputField.clear();
        inputField.sendKeys(value);
    }

    protected void selectByValue(WebElement selectionElement, String value) {
        new Select(selectionElement)
                .selectByValue(value);
    }

//    protected void click(WebElement button) {
//        button.click();
//    }

}
