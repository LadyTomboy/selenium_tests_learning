package com.telesens.test.tests;

import com.telesens.test.appmanager.ApplicationManager;
import org.testng.annotations.*;

public class BaseTest {

    protected final ApplicationManager app = new ApplicationManager();

    @Parameters("browser")
    @BeforeMethod
    public void init(String browser) throws Exception {
        app.init(browser);
    }

    @AfterMethod
    public void stop() throws Exception {
        app.stop();
    }

}
