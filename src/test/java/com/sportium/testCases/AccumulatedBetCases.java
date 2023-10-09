package com.sportium.testCases;

import com.sportium.base.BaseTest;
import com.sportium.pages.AccumulatedBetPage;
import com.sportium.pages.LoginPage;
import org.junit.Test;

public class AccumulatedBetCases extends BaseTest {

    @Test
    public void activateAccumulatedBet() throws InterruptedException{

        LoginPage loginPage = new LoginPage(driver);
        loginPage.load();
        loginPage.PortalAdminInitBtn();
        //loginPage.logged();
        loginPage.enterUserName("Hibccb1");
        loginPage.enterPassword("QA.hiberus");
        loginPage.clickWelcomeAccept();

        AccumulatedBetPage activateAccumulatedBet = new AccumulatedBetPage(driver);
        //activateAccumulatedBet.clickAndVerifyActivateBtnBet();
        activateAccumulatedBet.clickMoreInfoBtnBetIframe();
        activateAccumulatedBet.clickPopupBtnBetIframe();


    }


}
