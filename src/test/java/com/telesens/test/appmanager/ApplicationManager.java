package com.telesens.test.appmanager;

import com.telesens.test.appmanager.helper.AddressHelper;
import com.telesens.test.appmanager.helper.CategoryHelper;
import com.telesens.test.appmanager.helper.SessionHelper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.io.File;
import java.util.concurrent.TimeUnit;

public class ApplicationManager {

    private AddressHelper addressHelper;
    private SessionHelper sessionHelper;
    private CategoryHelper categoryHelper;
    protected WebDriver driver;
    private String baseUrl;

    public AddressHelper getAddressHelper() {
        return addressHelper;
    }

    public SessionHelper getSessionHelper() {
        return sessionHelper;
    }

    public CategoryHelper getCategoryHelper() {
        return categoryHelper;
    }

    public String getBaseUrl() {
        return baseUrl;
    }

    public void init(String browser) throws Exception {
        if (browser.equals("chrome")) {
            System.setProperty("webdriver.chrome.driver", "C:/Program Files/Selenium/chromedriver.exe");
            driver = new ChromeDriver();
        } else if (browser.equals("firefox")) {
            System.setProperty("webdriver.gecko.driver", "C:/Program Files/Selenium/geckodriver.exe");
            driver = new FirefoxDriver();
        } else if (browser.equals("IE")) {
            File ie = new File("d:/distribs/selenium/IEDriverServer.exe");
            System.setProperty("webdriver.ie.driver", ie.getAbsolutePath());
            driver = new InternetExplorerDriver();
        } else if (browser.equals("edge")) {
            System.setProperty("webdriver.edge.driver", "d:/distribs/selenium/MicrosoftWebDriver.exe");
            driver = new EdgeDriver();
        }

        baseUrl = "http://automationpractice.com/index.php";
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get(baseUrl);
        addressHelper = new AddressHelper(driver);
        sessionHelper = new SessionHelper(driver);
        categoryHelper = new CategoryHelper(driver);

    }


    public void stop() throws Exception {
        driver.quit();
    }

}
