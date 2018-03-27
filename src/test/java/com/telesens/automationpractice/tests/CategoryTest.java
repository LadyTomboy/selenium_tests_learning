package com.telesens.automationpractice.tests;

import org.testng.annotations.Test;

public class CategoryTest extends BaseTest{

    @Test (enabled = false)
    public void womenCategoryLinkTest(){
        app.category().goToWomenCategoryPage();
        app.category().checkWomenCategoryTitle("WOMEN ");
    }

    @Test (enabled = false)
    public void DressesCategorySizeFilterTest(){
        app.category().goToDressesCategoryPage();
        app.category().selectSizeSProducts();
        app.category().checkFirstProductPrice("$26.00");

    }

//    //TODO
//    @Test(groups = {"positive", "dresses", "filters"})
//    public void testDressesCategorySizeFilter(){
//        driver.get(baseUrl + "/index.php");
//        String firstProductPrice =
//                new HomePage(driver)
//                .goToDressesPage()
//                .checkSizeSCheckbox()
//                .getFirstProductPriceText();
//    Assert.assertEquals(firstProductPrice, "$26.00");
//    }
//
//    //TODO
//    @Test(groups = {"positive", "filters", "dresses", "sort"})
//    public void testDressesLowestFirstFilter(){
//        driver.get(baseUrl + "/index.php");
//
//        DressesPage dressesPage =
//                new HomePage(driver)
//                .goToDressesPage()
//                .selectSortByLowestFirst();
//
//        Assert.assertEquals(dressesPage.getFirstProductPriceText(), "$16.40");
//        Assert.assertEquals(dressesPage.getSecondProductPriceText(), "$26.00");
//        Assert.assertEquals(dressesPage.getThirdProductPriceText(), "$28.98");
//        Assert.assertEquals(dressesPage.getFourthProductPriceText(), "$30.50");
//        Assert.assertEquals(dressesPage.getFifthProductPriceText(), "$50.99");
//    }
}
