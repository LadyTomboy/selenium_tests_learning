package com.telesens.test.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountPage extends BasePage {

    @FindBy(linkText = "Sign out")
    private WebElement signOutLink;
    @FindBy(css = "div.col-sm-6:nth-child(1) > ul:nth-child(1) > li:nth-child(3) > a:nth-child(1)")
    private WebElement myAddressesButton;

    public AccountPage(WebDriver driver) {
        super(driver);
    }

    public String getSignOutText() {
        return signOutLink.getText();
    }

    public BasePage signOut(){
       signOutLink.click();
       return new BasePage(driver);
    }

    public MyAddressPage goToMyAddressesPage(){
        myAddressesButton.click();
        return new MyAddressPage(driver);
    }

    public AccountPage goToAccauntPage(){
        accountLink.click();
        return new AccountPage(driver);
    }


}
