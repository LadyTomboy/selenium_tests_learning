// This file is deprecated

package com.telesens.test.tests;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.Select;

public class ShopTest extends BaseTest {
    public static Logger LOG = LogManager.getLogger(ShopTest.class.getName());

//
//    @Test (enabled = false)
//    public void testLogin() throws Exception {
//        driver.get(baseUrl + "/index.php");
//        driver.findElement(By.linkText("Sign in")).click();
//        driver.findElement(By.id("email")).click();
//        driver.findElement(By.id("email")).clear();
//        driver.findElement(By.id("email")).sendKeys("1@i.ua");
//        driver.findElement(By.id("passwd")).clear();
//        driver.findElement(By.id("passwd")).sendKeys("123456");
//        driver.findElement(By.id("SubmitLogin")).click();
//        driver.findElement(By.xpath("//div[@id='columns']/div[3]")).click();
//        try {
//            assertEquals(driver.findElement(By.linkText("Sign out")).getText(), "Sign out");
////            LOG.info("Login successful");
//        } catch (Error e) {
//            verificationErrors.append(e.toString());
//        }
//        driver.findElement(By.linkText("Sign out")).click();
//        try {
//            assertEquals(driver.findElement(By.linkText("Sign in")).getText(), "Sign in");
//        } catch (Error e) {
//            verificationErrors.append(e.toString());
//        }
//    }
//
//    @Test (enabled = false)
////1) Создать тест для сайта automationpractice.com:
////  - нажать sign in
////	- заполнить поля пароль логин - не корректными данными
////	=> убедиться в наличии сообщения об ошибке
//    public void invalidCredentionsTest(){
//        driver.get(baseUrl + "/index.php");
//        driver.findElement(By.linkText("Sign in")).click();
//        driver.findElement(By.id("email")).click();
//        driver.findElement(By.id("email")).clear();
//        driver.findElement(By.id("email")).sendKeys("1@i.ua");
//        driver.findElement(By.id("passwd")).clear();
//        driver.findElement(By.id("passwd")).sendKeys("12345");
//        driver.findElement(By.id("SubmitLogin")).click();
//        try {
//            assertEquals(driver.findElement(By.cssSelector("#center_column > div.alert.alert-danger > ol > li")).getText(),"Authentication failed.");
//        } catch (Error e) {
//            verificationErrors.append(e.toString());
//        }
//        try {
//            Thread.sleep(2000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//
//    }
//
//    @Test (enabled = false)
////2) Создать тест для сайта automationpractice.com:
////	- кликнуть в меню WOMEN
////	=> убедиться, что зашли в эту категорию
//    public void womenMenuTest(){
//        driver.get(baseUrl + "/index.php");
//        driver.findElement(By.linkText("Women")).click();
//
//        try {
//            assertEquals(driver.findElement(By.cssSelector("#center_column > h1 > span.cat-name")).getText(),"WOMEN ");
//        } catch (Error e) {
//            verificationErrors.append(e.toString());
//        }
//        try {
//            Thread.sleep(2000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//
//    }
//
//    @Test (enabled = false)
////3) Создать тест для сайта automationpractice.com:
////		- зайти в категорию DRESSES
////		- выбрать checkbox Size -> S1
////		- выбрать checkbox Composition -> Cotton (1)
////		=> убедиться, что высвечивается позиция Printed Dress по цене 26$
//    public void dressesCategoryTest(){
//        driver.get(baseUrl + "/index.php");
//        driver.findElement(By.cssSelector("#block_top_menu > ul > li:nth-child(2) > a")).click();
//        driver.findElement(By.id("layered_id_attribute_group_1")).click();
//        driver.findElement(By.id("uniform-layered_id_feature_5")).click();
//
//        assertEquals(driver.findElement(By.linkText("Printed Dress")).getText().trim(), "Printed Dress");
//        assertEquals(driver.findElement(By.cssSelector("#center_column > ul > li.ajax_block_product.col-xs-12.col-sm-6.col-md-4.first-in-line.first-item-of-tablet-line.first-item-of-mobile-line > div > div.right-block > div.content_price")).getText().trim(), "$26.00");
//
//        try {
//            Thread.sleep(2000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//    }
//
//    @Test (enabled = false)
////4) Создать тест для сайта automationpractice.com:
////		- зайти в категорию DRESSES
////		- отсортировать по Price: Lowest first
////		=> убедиться, что на странице присутствуют пять позиций с ценами: [$16.40, $26.00, $28.98, $30.50, $50.00]
//    public void sortByPriceDressesCategoryTest(){
//        driver.get(baseUrl + "/index.php");
//        driver.findElement(By.cssSelector("#block_top_menu > ul > li:nth-child(2) > a")).click();
//        Select selectSort= new Select(driver.findElement(By.id("selectProductSort")));
//        selectSort.selectByValue("price:asc");
//
//        try {
//            Thread.sleep(2000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        assertEquals(driver.findElement(By.cssSelector("#center_column > ul > li.ajax_block_product.col-xs-12.col-sm-6.col-md-4.first-in-line.first-item-of-tablet-line.first-item-of-mobile-line > div > div.right-block > div.content_price > span.price.product-price")).getText().trim(), "$16.40");
//        assertEquals(driver.findElement(By.cssSelector("#center_column > ul > li:nth-child(2) > div > div.right-block > div.content_price > span")).getText().trim(), "$26.00");
//        assertEquals(driver.findElement(By.cssSelector("#center_column > ul > li.ajax_block_product.col-xs-12.col-sm-6.col-md-4.last-in-line.first-item-of-tablet-line.last-item-of-mobile-line > div > div.right-block > div.content_price > span.price.product-price")).getText().trim(), "$28.98");
//        assertEquals(driver.findElement(By.cssSelector("#center_column > ul > li.ajax_block_product.col-xs-12.col-sm-6.col-md-4.first-in-line.last-line.last-item-of-tablet-line.first-item-of-mobile-line.last-mobile-line > div > div.right-block > div.content_price > span")).getText().trim(), "$30.50");
//        assertEquals(driver.findElement(By.cssSelector("#center_column > ul > li.ajax_block_product.col-xs-12.col-sm-6.col-md-4.last-line.first-item-of-tablet-line.last-mobile-line > div > div.right-block > div.content_price > span")).getText().trim(), "$50.99");
//
//        try {
//            Thread.sleep(2000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//
//    }
//
//    @Test (enabled = false)
////  5) Создать тест для сайта automationpractice.com:
////	- залогиниться
////	- нажать "My addresses"
////	- нажать "Add a new address"
////	- заполнить все поля
////	- нажать "Save >"
////	=> проверить, что введенные данные совпадают с видимыми на странице
//    public void addNewAddressTest(){
//        driver.get(baseUrl + "/index.php");
//        driver.findElement(By.linkText("Sign in")).click();
//        driver.findElement(By.id("email")).click();
//        driver.findElement(By.id("email")).clear();
//        driver.findElement(By.id("email")).sendKeys("1@i.ua");
//        driver.findElement(By.id("passwd")).clear();
//        driver.findElement(By.id("passwd")).sendKeys("123456");
//        driver.findElement(By.id("SubmitLogin")).click();
//        driver.findElement(By.xpath("//div[@id='columns']/div[3]")).click();
//        driver.findElement(By.cssSelector("#center_column > div > div:nth-child(1) > ul > li:nth-child(3) > a")).click();
//        driver.findElement(By.cssSelector("#center_column > div.clearfix.main-page-indent > a")).click();
//        WebElement firstNameField = driver.findElement(By.id("firstname"));
//        firstNameField.clear();
//        firstNameField.sendKeys("TestFirstName");
//        WebElement lastNameField = driver.findElement(By.id("lastname"));
//        lastNameField.clear();
//        lastNameField.sendKeys("TestLastName");
//        WebElement addressField = driver.findElement(By.id("address1"));
//        addressField.clear();
//        addressField.sendKeys("TestAddress");
//        WebElement cityField = driver.findElement(By.id("city"));
//        cityField.clear();
//        cityField.sendKeys("TestCity");
//        Select selectStateEl = new Select(driver.findElement(By.id("id_state")));
//        selectStateEl.selectByValue("4");
//        WebElement zipField = driver.findElement(By.id("postcode"));
//        zipField.clear();
//        zipField.sendKeys("60606");
//        WebElement phoneField = driver.findElement(By.id("phone"));
//        phoneField.clear();
//        phoneField.sendKeys("1234");
//        WebElement nameAddressField = driver.findElement(By.id("alias"));
//        nameAddressField.clear();
//        nameAddressField.sendKeys("MY ADDED TEST ADDRESS");
//        driver.findElement(By.id("submitAddress")).click();
//        try {
//            assertEquals(driver.findElement(By.cssSelector("#center_column > div.addresses > div > div:nth-child(2) > ul > li:nth-child(1) > h3")).getText(),"MY ADDED TEST ADDRESS");
//        } catch (Error e) {
//
//            verificationErrors.append(e.toString());
//        }
//        try {
//            Thread.sleep(2000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        driver.findElement(By.linkText("Sign out")).click();
//        try {
//            Thread.sleep(2000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//    }

}

