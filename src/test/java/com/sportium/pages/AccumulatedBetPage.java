package com.sportium.pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static org.junit.Assert.assertTrue;

public class AccumulatedBetPage extends LoginPage{
    private static By iframeElement = By.id("club-sportium");
    private static final By activeBtnAccumulatedBet = By.cssSelector("promotion.promotion-card:nth-child(2) > div:nth-child(2) > button:nth-child(2)");

    //promotion:nth-child(2) div:nth-child(2) button:nth-child(2) span:nth-child(1)
    private static final By moreInfoButtonInsideIframe = By.xpath("//*[@id=\"club\"]/ui-view/div/offered-promotions/div/promotion[2]/div[2]/button");
    private static final By popupButtonInsideIframe = By.cssSelector("div.close");

    public AccumulatedBetPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    ////////////

    public AccumulatedBetPage switchToIframe() {
        if (isIframePresent()) {
            WebElement iframeElement = driver.findElement(AccumulatedBetPage.iframeElement);
            driver.switchTo().frame(iframeElement);
            System.out.println("Changed to iframe correctly.");
        } else {
            System.out.println("The iframe is not present.");
        }
        return this;
    }

    public boolean isIframePresent() {
        try {
            driver.findElement(iframeElement);
            return true;
        } catch (org.openqa.selenium.NoSuchElementException e) {
            return false;
        }
    }

    public boolean isIframePresentAndPrintMessage() {
        boolean isPresent = isIframePresent();
        if (isPresent) {
            System.out.println("The iframe was found.");
        } else {
            System.out.println("Iframe not found.");
        }
        return isPresent;
    }

    /*public AccumulatedBetPage clickAndVerifyActivateBtnBet() {
        switchToIframe();
        WebElement activeBetBtn = driver.findElement(activeBtnAccumulatedBet);
        assertTrue("The activation button does not contain the text 'ACTIVAR'",
                activeBetBtn.getText().contains("ACTIVAR"));
        activeBetBtn.click();
        driver.switchTo().defaultContent();
        return this;
    }*/

    public AccumulatedBetPage clickMoreInfoBtnBetIframe() {
        switchToIframe();
        WebElement buttonInsideIframe = driver.findElement(moreInfoButtonInsideIframe);
        buttonInsideIframe.click();
        driver.switchTo().defaultContent();
        return this;
    }

    public AccumulatedBetPage clickPopupBtnBetIframe() {
        switchToIframe();
        WebElement popupButtonInsideIframeElement = driver.findElement(popupButtonInsideIframe);
        popupButtonInsideIframeElement.click();
        driver.switchTo().defaultContent();
        return this;
    }
}
