package com.telesens.test.appmanager.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WomenPage extends BasePage {

    @FindBy(css = "#center_column > h1 > span.cat-name")
    private WebElement womenCategoryName;

    public WomenPage(WebDriver driver) {
        super(driver);
    }

    public String getWomenCategoryNameText() {
        return womenCategoryName.getText();
    }


}
