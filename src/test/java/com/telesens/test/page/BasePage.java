package com.telesens.test.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
    protected WebDriver driver;

    @FindBy(css = "#block_top_menu > ul > li:nth-child(1) > a")
    protected WebElement womenCategoryLink;

    @FindBy(css = "#block_top_menu > ul > li:nth-child(2) > a")
    protected WebElement dressesCategoryLink;

    @FindBy(css = "#block_top_menu > ul > li:nth-child(3) > a")
    protected WebElement tshirtsCategoryLink;

    @FindBy(css = "#header > div.nav > div > div > nav > div:nth-child(1) > a")
    protected WebElement accountLink;

    @FindBy(linkText = "Sign in")
    private WebElement signInLink;

    public BasePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public LoginPage goToLoginPage() {
        signInLink.click();
        return new LoginPage(driver);
    }

    public WomenPage goToWomenPage(){
        womenCategoryLink.click();
        return new WomenPage(driver);
    }

    public DressesPage goToDressesPage(){
        dressesCategoryLink.click();
        return new DressesPage(driver);
    }

    public AccountPage goToAccountPage(){
        accountLink.click();
        return new AccountPage(driver);
    }

    public String getSigninText(){
        return signInLink.getText();
    }
}
