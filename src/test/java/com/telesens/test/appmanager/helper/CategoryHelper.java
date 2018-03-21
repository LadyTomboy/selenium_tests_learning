package com.telesens.test.appmanager.helper;

import com.telesens.test.appmanager.page.DressesPage;
import com.telesens.test.appmanager.page.HomePage;
import com.telesens.test.appmanager.page.WomenPage;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class CategoryHelper {

    private WebDriver driver;

    public CategoryHelper(WebDriver driver) {
        this.driver = driver;
    }

    public void goToWomenCategoryPage(){
        new HomePage(driver)
                .clickByWomenCategoryButton();
    }

    public void goToDressesCategoryPage(){
        new HomePage(driver)
                .clickByDressesCategoryButton();
    }

    public void checkWomenCategoryTitle(String title){

        Assert.assertEquals(
                new WomenPage(driver)
                    .getWomenCategoryNameText(),
                title);
    }

    public void selectSizeSProducts(){
        new DressesPage(driver)
                .checkSizeSCheckbox();
    }

    public void checkFirstProductPrice(String title){

        Assert.assertEquals(
                new DressesPage(driver)
                        .getFirstProductPriceText(),
                title);
    }
}
