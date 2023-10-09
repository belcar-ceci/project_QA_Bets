package com.sportium.testCases;

import com.sportium.base.BaseTest;
import com.sportium.factory.DriverManager;
import com.sportium.pages.LoginPage;
import org.junit.Test;

import org.openqa.selenium.WebDriver;

public class LoginCases extends BaseTest {

    @Test
    public void loginUserPortalAdmin() throws InterruptedException {

        DriverManager driverManager = new DriverManager();
        WebDriver driver = driverManager.initializeDriver(); // Inicializa el objeto driver
        LoginPage loginPage = new LoginPage(driver); // Pasa el objeto driver al constructor de LoginPage

        loginPage.load();
        loginPage.PortalAdminInitBtn();
        loginPage.enterUserName("Hibccb1");
        loginPage.enterPassword("QA.hiberus");
        loginPage.clickLoginBtn();
        loginPage.clickWelcomeAccept();
    }
}
