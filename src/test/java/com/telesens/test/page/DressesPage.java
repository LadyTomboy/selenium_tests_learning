package com.telesens.test.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class DressesPage extends BasePage{

    @FindBy (id = "layered_id_attribute_group_1")
    private WebElement sizeSCheckbox;
    @FindBy (id = "selectProductSort")
    private WebElement sortByDropdown;
    @FindBy (css = "li.ajax_block_product:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(3) > span:nth-child(1)")
    private WebElement firstProductPrice;
    @FindBy (css = "#center_column > ul > li:nth-child(2) > div > div.right-block > div.content_price > span")
    private WebElement secondProductPrice;
    @FindBy (css = "#center_column > ul > li.ajax_block_product.col-xs-12.col-sm-6.col-md-4.last-in-line.first-item-of-tablet-line.last-item-of-mobile-line > div > div.right-block > div.content_price > span.price.product-price")
    private WebElement thirdProductPrice;
    @FindBy (css = "#center_column > ul > li.ajax_block_product.col-xs-12.col-sm-6.col-md-4.first-in-line.last-line.last-item-of-tablet-line.first-item-of-mobile-line.last-mobile-line > div > div.right-block > div.content_price > span")
    private WebElement fourthProductPrice;
    @FindBy (css = "#center_column > ul > li.ajax_block_product.col-xs-12.col-sm-6.col-md-4.last-line.first-item-of-tablet-line.last-mobile-line > div > div.right-block > div.content_price > span")
    private WebElement fifthProductPrice;


    public DressesPage(WebDriver driver){
        super(driver);
    }

    public DressesPage checkSizeSCheckbox(){
        sizeSCheckbox.click();
        return this;
    }

    public String getFirstProductPriceText() {
        return firstProductPrice.getText().trim();
    }
    public String getSecondProductPriceText() {
        return secondProductPrice.getText().trim();
    }
    public String getThirdProductPriceText() {
        return thirdProductPrice.getText().trim();
    }
    public String getFourthProductPriceText() {
        return fourthProductPrice.getText().trim();
    }
    public String getFifthProductPriceText() {
        return fifthProductPrice.getText().trim();
    }

    public DressesPage selectSortByLowestFirst(){
        Select selectSort= new Select(sortByDropdown);
        selectSort.selectByValue("price:asc");
        return this;
    }

}
