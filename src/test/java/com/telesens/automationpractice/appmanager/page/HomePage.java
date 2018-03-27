package com.telesens.automationpractice.appmanager.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

    @FindBy(linkText = "Sign in")
    private WebElement signInLink;
    @FindBy(css = "#block_top_menu > ul > li:nth-child(1) > a")
    private WebElement womenCategoryLink;
    @FindBy(css = "#block_top_menu > ul > li:nth-child(2) > a")
    private WebElement dressesCategoryLink;
    @FindBy(css = "#block_top_menu > ul > li:nth-child(3) > a")
    private WebElement tshirtsCategoryLink;
    @FindBy(css = "#header > div.nav > div > div > nav > div:nth-child(1) > a")
    private WebElement accountLink;


    public HomePage(WebDriver driver) {
        super(driver);
    }

    public LoginPage clickBySignInButton() {
        signInLink.click();
        return new LoginPage(driver);
    }

    public WomenPage clickByWomenCategoryButton() {
        womenCategoryLink.click();
        return new WomenPage(driver);
    }

    public DressesPage clickByDressesCategoryButton() {
        dressesCategoryLink.click();
        return new DressesPage(driver);
    }



////////////////////////////////check


    public AccountPage goToAccountPage() {
        accountLink.click();
        return new AccountPage(driver);
    }

    public String getSigninText() {
        return signInLink.getText();
    }
}
