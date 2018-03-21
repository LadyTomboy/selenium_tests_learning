package com.telesens.test.appmanager.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class MyAddressPage extends BasePage {

    @FindBy(css = "#center_column > div.clearfix.main-page-indent > a")
    private WebElement addNewAddressButton;

    @FindBy(css = ".last_item > li:nth-child(1) > h3:nth-child(1)")
    private WebElement newAddressTitle;


    public MyAddressPage(WebDriver driver) {
        super(driver);
    }

    // TODO
    public MyAddressPage addNewAddress() {
        addNewAddressButton.click();
        return this;
    }

    // TODO
    public String getNewAddressTitleText() {
        return newAddressTitle.getText();
    }

    public FormAddressPage clickByAddNewAddress() {
        addNewAddressButton.click();
        return new FormAddressPage(driver);
    }

}
