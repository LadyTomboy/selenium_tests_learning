package com.telesens.test.tests;

import com.telesens.test.appmanager.model.AddressData;
import com.telesens.test.appmanager.model.LoginData;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;

public class AddressTest extends BaseTest {
//    private static Logger LOG = LogManager.getLogger(AddressTest.class.getName());

    @Test (enabled = false)
    public void addNewAddressTest() {
        app.getSessionHelper().login(new LoginData("1@i.ua", "123456"));
        app.getAddressHelper().goToMyAccountPage();
        app.getAddressHelper().goToMyAddressesPage();
        app.getAddressHelper().initCreationAddress();
        app.getAddressHelper().fillAddressForm(new AddressData("TestFirstName", "TestLastName", "Test Address", "NY", "5", "66666", "635241", "TEST ADDRESS "));
        app.getAddressHelper().initAddressSaving();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
