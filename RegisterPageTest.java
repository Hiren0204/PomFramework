package com.demo.nopcomerce.test;

import com.demo.nopcomerce.base.BasePage;
import Pages.RegisterPage;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.Properties;

public class RegisterPageTest {
    BasePage basePage;
    Properties prop;
    WebDriver driver;
    RegisterPage registerPage;

    @BeforeTest
    public void openRegisterPage() {

        basePage = new BasePage();
        prop = basePage.initialiseProperties();
        String webEngine = prop.getProperty("browser");
        driver = basePage.initialiseDriver(webEngine);
        driver.get(prop.getProperty("url"));
        registerPage = new RegisterPage(driver);
    }

    @Test(priority = 1)
    public void verifyregisterPageTitle() throws InterruptedException {
        Assert.assertEquals(registerPage.getPageTitle(), "nopCommerce demo store", "Registration Title Mismatch");
    }

    @Test(priority = 2)
    public void RegisterPageTest() throws InterruptedException {
        registerPage.doRegister(prop.getProperty("FirstName"), prop.getProperty("LastName"), prop.getProperty("day"), prop.getProperty("month"),
                prop.getProperty("year"), prop.getProperty("email"), prop.getProperty("Company"), prop.getProperty("pwd"), prop.getProperty("ConfirmPassword"));


    }

    @AfterTest
    public void tearDown() {
        driver.quit();
    }
}
