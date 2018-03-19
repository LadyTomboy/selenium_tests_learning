package com.telesens.test.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class MyAddressPage extends BasePage{

    @FindBy(css = "#center_column > div.clearfix.main-page-indent > a")
    private WebElement addNewAddressButton;
    @FindBy(id = "firstname")
    private WebElement firstNameField;
    @FindBy(id = "lastname")
    private WebElement lastNameField;
    @FindBy(id = "address1")
    private WebElement addressField;
    @FindBy(id = "city")
    private WebElement cityField;
    @FindBy(id = "id_state")
    private WebElement stateDropdown;
    @FindBy(id = "postcode")
    private WebElement postcodeField;
    @FindBy(id = "phone")
    private WebElement phoneField;
    @FindBy(id = "alias")
    private WebElement addressTitleField;
    @FindBy(id = "submitAddress")
    private WebElement saveButton;
    @FindBy(css = ".last_item > li:nth-child(1) > h3:nth-child(1)")
    private WebElement newAddressTitle;


    public MyAddressPage (WebDriver driver) {
        super(driver);
    }

    public MyAddressPage addNewAddress(){
        addNewAddressButton.click();
        return this;
    }

    public MyAddressPage inputFirstName(String firstName) {
        firstNameField.clear();
        firstNameField.sendKeys(firstName);
        return this;
    }

    public MyAddressPage inputLastName(String lastName) {
        lastNameField.clear();
        lastNameField.sendKeys(lastName);
        return this;
    }

    public MyAddressPage inputAddress(String address) {
        addressField.clear();
        addressField.sendKeys(address);
        return this;
    }
    public MyAddressPage inputCity (String address) {
        cityField.clear();
        cityField.sendKeys(address);
        return this;
    }

    public MyAddressPage selectState (String value) {
        new Select(stateDropdown)
                .selectByValue(value);
        return this;
    }

    public MyAddressPage inputPostcode (String code) {
        postcodeField.clear();
        postcodeField.sendKeys(code);
        return this;
    }

    public MyAddressPage inputPhoneNumber (String phoneNumber) {
        phoneField.clear();
        phoneField.sendKeys(phoneNumber);
        return this;
    }

    public MyAddressPage inputAddressTitle (String title) {
        addressTitleField.clear();
        addressTitleField.sendKeys(title);
        return this;
    }

    public MyAddressPage submitAddingAddress () {
        saveButton.click();
        return this;
    }

    public String getNewAddressTitleText() {
        return newAddressTitle.getText();
    }

    public String getTestAddressTitle(){
        String title = ("TEST ADDRESS " + System.currentTimeMillis());
        return title;
    }

}
