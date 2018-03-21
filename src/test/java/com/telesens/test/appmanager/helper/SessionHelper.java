package com.telesens.test.appmanager.helper;

import com.telesens.test.appmanager.model.LoginData;
import com.telesens.test.appmanager.page.HomePage;
import org.openqa.selenium.WebDriver;

public class SessionHelper {
    private WebDriver driver;

    public SessionHelper(WebDriver driver) {
        this.driver = driver;
    }


    public void login(LoginData loginData) {
        new HomePage(driver)
                .clickBySignInButton()
                .inputLogin(loginData.getEmail())
                .inputPassword(loginData.getPassword())
                .submitLogin();
    }
}
