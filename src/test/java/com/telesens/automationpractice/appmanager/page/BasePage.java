package com.telesens.automationpractice.appmanager.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

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

    protected void selectByText(WebElement selectionElement, String text) {
        new Select(selectionElement)
                .selectByVisibleText(text);
    }

    protected void click(WebElement button) {
        button.click();
    }
    protected void allertAccept() {
        driver.switchTo().alert().accept();
    }

    protected List<String> extractTextFromElements(List<WebElement> elements) {
        List<String> textList = new ArrayList<>(elements.size());
        for(WebElement el : elements)
            textList.add(el.getText().trim());

        return textList;
    }
}
