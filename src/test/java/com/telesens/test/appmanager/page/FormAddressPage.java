package com.telesens.test.appmanager.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FormAddressPage extends BasePage {

    @FindBy(id = "firstname")
    private WebElement firstNameInput;
    @FindBy(id = "lastname")
    private WebElement lastNameInput;
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

    private String title;
    private long uniqueID = System.currentTimeMillis();

    public FormAddressPage(WebDriver driver) {
        super(driver);
    }

    public FormAddressPage inputFirstName(String firstName) {
        type(firstNameInput, firstName);
        return new FormAddressPage(driver);
    }

    public FormAddressPage inputLastName(String lastName) {
        type(lastNameInput, lastName);
        return new FormAddressPage(driver);
    }

    public FormAddressPage inputAddress(String address) {
        type(addressField, address);
        return new FormAddressPage(driver);
    }

    public FormAddressPage inputCity(String city) {
        type(cityField, city);
        return new FormAddressPage(driver);
    }

    public FormAddressPage selectState(String stateValue) {
        selectByValue(stateDropdown, stateValue);
        return new FormAddressPage(driver);
    }

    public FormAddressPage inputPostcode(String zip) {
        type(postcodeField, zip);
        return new FormAddressPage(driver);
    }

    public FormAddressPage inputPhone(String phone) {
        type(phoneField, phone);
        return new FormAddressPage(driver);
    }

    public FormAddressPage inputAddressTitle(String addressTitle) {
        title = addressTitle + uniqueID;
        type(addressTitleField, title);
        return new FormAddressPage(driver);
    }

    public MyAddressPage clickBySaveButton() {
        saveButton.click();
        return new MyAddressPage(driver);
    }

    public String getTitle() {
        return title;
    }

}
