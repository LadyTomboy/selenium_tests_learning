package com.telesens.test.appmanager.helper;

import com.telesens.test.appmanager.model.AddressData;
import com.telesens.test.appmanager.page.AccountPage;
import com.telesens.test.appmanager.page.FormAddressPage;
import com.telesens.test.appmanager.page.MyAddressPage;
import org.openqa.selenium.WebDriver;

public class AddressHelper {
    private WebDriver driver;

    public AddressHelper(WebDriver driver) {
        this.driver = driver;
    }

    public void initCreationAddress() {
        new MyAddressPage(driver)
                .clickByAddNewAddress();
    }

    public void goToMyAddressesPage() {
        new AccountPage(driver)
                .clickByMyAddress();
    }

    public void goToMyAccountPage() {
        new AccountPage(driver)
                .clickByAccountLink();
    }

    public void fillAddressForm(AddressData addressData) {
        new FormAddressPage(driver)
                .inputFirstName(addressData.getFirstName())
                .inputLastName(addressData.getLastName())
                .inputAddress(addressData.getAddress())
                .inputCity(addressData.getCity())
                .selectState(addressData.getStateValue())
                .inputPostcode(addressData.getPostcode())
                .inputPhone(addressData.getPhone())
                .inputAddressTitle(addressData.getAddressTitle());
    }

    public void initAddressSaving() {
        new FormAddressPage(driver)
                .clickBySaveButton();
    }
}
