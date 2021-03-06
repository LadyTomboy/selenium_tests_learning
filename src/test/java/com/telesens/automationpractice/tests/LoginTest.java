package com.telesens.automationpractice.tests;


import com.telesens.automationpractice.appmanager.model.LoginExcelData;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest{

    @Test (dataProvider = "excelLoginData", enabled = false)
    public void LoginTest(String email, String pass, String errorMessage) {
        app.session().loginWithInvalidData(email, pass);
        app.session().checkErrorMessage(errorMessage);
    }

    @DataProvider(name = "excelLoginData")
    public Object[][] provideData() {
        LoginExcelData loginExcelData = new LoginExcelData();
        return loginExcelData.getCredentials();
      }

//    //TODO
//    @Test (dataProvider = "excel Name")
//    public void testLogin() {
//        driver.get(baseUrl + "/index.php");
//        String signOutText =
//                new HomePage(driver)
//                .goToLoginPage()
//                .inputEmail("1@i.ua")
//                .inputPassword("123456")
//                .submitLogin()
//                .getSignOutText();
//
////        LoginPage loginPage = homePage.goToLoginPage();
////        loginPage.inputEmail("oleg.kh81@gmail.com");
////        loginPage.inputPassword("vlrevlor");
////        AccountPage accountPage = loginPage.submitLogin();
////        String signOutText = accountPage.getSignOutText();
//        Assert.assertEquals(signOutText, "Sign out");
//
//    }
//
//    //TODO
//    @Test (groups = {"login", "negative"}, dataProvider ="provideCredentials", priority = 2)
//    public void testInvalidCredentialsLogin(String email, String pass, String message){
//        driver.get(baseUrl + "/index.php");
//        String errorMessageText =
//                new HomePage(driver)
//                .goToLoginPage()
//                .inputEmail(email)
//                .inputPassword(pass)
//                .submitLoginWithInvalidCredentials()
//                .getSignInErrorMessageText();
//        Assert.assertEquals(errorMessageText, message);
//    }
//    @DataProvider(name = "provideCredentials")
//    public Object[][] provideData() {
//
//        return new Object[][] {
//                { "1@i.ua", "12345", "Authentication failed." },
//                { "1@i", "12345", "Invalid email address." },
//                { "2@i.ua", "123456", "Authentication failed." },
//        };
//    }
//
//    //TODO
//    @Test (groups = {"sign out"}, priority = 1, dependsOnMethods = "testLogin")
//    public void testSignOut(){
//
//        String signInText =
//                new AccountPage(driver)
//                .signOut()
//                .getSigninText();
//        Assert.assertEquals(signInText, "Sign in");
//    }
}
