package com.telesens.test;

import com.telesens.test.page.*;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CategoryTest extends BaseTest{

    @Test(groups = {"women", "positive"})
    public void testCategoryLink(){
        driver.get(baseUrl + "/index.php");
        String womenCategoryNameText =
                new HomePage(driver)
                .goToWomenPage()
                .getWomenCategoryNameText();
        Assert.assertEquals(womenCategoryNameText, "WOMEN ");
    }

    @Test(groups = {"positive", "dresses", "filters"})
    public void testDressesCategorySizeFilter(){
        driver.get(baseUrl + "/index.php");
        String firstProductPrice =
                new HomePage(driver)
                .goToDressesPage()
                .checkSizeSCheckbox()
                .getFirstProductPriceText();
    Assert.assertEquals(firstProductPrice, "$26.00");
    }

    @Test(groups = {"positive", "filters", "dresses", "sort"})
    public void testDressesLowestFirstFilter(){
        driver.get(baseUrl + "/index.php");

        DressesPage dressesPage =
                new HomePage(driver)
                .goToDressesPage()
                .selectSortByLowestFirst();

        Assert.assertEquals(dressesPage.getFirstProductPriceText(), "$16.40");
        Assert.assertEquals(dressesPage.getSecondProductPriceText(), "$26.00");
        Assert.assertEquals(dressesPage.getThirdProductPriceText(), "$28.98");
        Assert.assertEquals(dressesPage.getFourthProductPriceText(), "$30.50");
        Assert.assertEquals(dressesPage.getFifthProductPriceText(), "$50.99");
    }
}
