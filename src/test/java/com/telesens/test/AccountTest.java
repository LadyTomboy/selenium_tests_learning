package com.telesens.test;

import com.telesens.test.page.AccountPage;
import com.telesens.test.page.HomePage;
import com.telesens.test.page.MyAddressPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AccountTest extends BaseTest{

    @Test (groups = {"positive", "account"}, priority = 1)
    public void testAddNewAddress(){
        String title = (new MyAddressPage(driver)).getTestAddressTitle();
        driver.get(baseUrl + "/index.php");

// How can I use testLogin() method of other class???????????????????
        AccountPage accountPage=
                 new HomePage(driver)
                .goToLoginPage()
                .inputLogin("1@i.ua")
                .inputPassword("123456")
                .submitLogin()
                .goToAccountPage();

        String newAddressName =
                new AccountPage(driver)
                .goToMyAddressesPage()
                .addNewAddress()
                .inputFirstName("TestFirstName")
                .inputLastName("TestLastName")
                .inputAddress("address")
                .inputCity("City")
                .selectState("4")
                .inputPostcode("66666")
                .inputPhoneNumber("46454654")
                .inputAddressTitle(title)
                .submitAddingAddress()
                .getNewAddressTitleText();
        Assert.assertEquals(newAddressName, title);
    }
}
