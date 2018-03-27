package com.telesens.automationpractice.appmanager.helper;

import com.telesens.automationpractice.appmanager.page.HomePage;
import com.telesens.automationpractice.appmanager.page.LoginPage;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class SessionHelper {
    private WebDriver driver;

    public SessionHelper(WebDriver driver) {
        this.driver = driver;
    }


    public void login(String login, String password) {
        new HomePage(driver)
                .clickBySignInButton()
                .inputEmail(login)
                .inputPassword(password)
                .submitLogin();
    }

    public void loginWithInvalidData(String email, String pass) {
        new HomePage(driver)
                .clickBySignInButton()
                .inputEmail(email)
                .inputPassword(pass)
                .submitLogin();
    }

    public void checkErrorMessage(String message){
        Assert.assertEquals(new LoginPage(driver).getErrorMessageText(), message);
    }
}
