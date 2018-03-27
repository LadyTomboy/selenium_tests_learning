package com.telesens.automationpractice.appmanager.page;

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
    private WebElement stateSelect;
    @FindBy(id = "postcode")
    private WebElement postcodeField;
    @FindBy(id="id_country")
    private WebElement countrySelect;
    @FindBy(id="phone")
    private WebElement homePhoneField;
    @FindBy(id="phone_mobile")
    private WebElement mobilePhoneField;
    @FindBy(id="submitAddress")
    private WebElement saveButton;
    @FindBy(id="alias")
    private WebElement addressAlias;

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

    public FormAddressPage inputState(String state) {
        selectByText(stateSelect, state);
        return new FormAddressPage(driver);
    }

    public FormAddressPage inputZipCode(String zip) {
        type(postcodeField, zip);
        return new FormAddressPage(driver);
    }

    public FormAddressPage inputCountry(String country) {
        selectByText(countrySelect, country);
        return new FormAddressPage(driver);
    }

    public FormAddressPage inputHomePhone(String homePhone) {
        type(homePhoneField, homePhone);
        return new FormAddressPage(driver);
    }

    public FormAddressPage inputMobilePhone(String mobilePhone) {
        type(mobilePhoneField, mobilePhone);
        return new FormAddressPage(driver);
    }

    public FormAddressPage inputAddressAlias(String alias) {
        type(addressAlias, alias);
        return new FormAddressPage(driver);
    }

    public MyAddressPage clickSaveButton() {
       click( saveButton);
        return new MyAddressPage(driver);
    }

}
