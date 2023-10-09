package com.sportium.testCases;

import com.sportium.base.BaseTest;
import com.sportium.factory.DriverManager;
import com.sportium.pages.ActivePromotionPage;
import com.sportium.pages.LoginPage;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class ActivePromotionCases extends BaseTest {

    @Test
    public void checkPromotion() throws InterruptedException {

        DriverManager driverManager = new DriverManager();
        WebDriver driver = driverManager.initializeDriver();
        LoginPage loginPage = new LoginPage(driver);
        loginPage.load();
        loginPage.PortalAdminInitBtn();
        loginPage.enterUserName("Hibccb1");
        loginPage.enterPassword("QA.hiberus");
        loginPage.clickLoginBtn();
        loginPage.clickWelcomeAccept();

        ActivePromotionPage activePromotionPage = new ActivePromotionPage(driver);
        activePromotionPage.clickMenuPromotions();
        activePromotionPage.clickMenuBets();
        activePromotionPage.clickProductClubSportium();


    }

}
