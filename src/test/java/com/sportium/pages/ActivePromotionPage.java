package com.sportium.pages;

import com.sportium.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ActivePromotionPage extends LoginPage {

    private By menuPromotionsLink = By.xpath("//a[normalize-space()='Promociones']");

    private By menuBetsLink = By.xpath("//a[@class='tt1 mn_promociones']");
    //(//a[@class='tt1 mn_casino'])[1]

    private By productClubSportium = By.xpath("//a[@href='https://www.sportium.es/club-sportium'][normalize-space()='ENTRAR']");


    public ActivePromotionPage (WebDriver driver) {
        super(driver);
        this.driver = driver;

    }

    public ActivePromotionPage clickMenuPromotions(){
        driver.findElement(menuPromotionsLink).click();
        return this;
    }

    /*public String getTitle(){
        return driver.findElement(menuBetText).getText();
    }
*/
    public ActivePromotionPage clickMenuBets(){
        driver.findElement(menuBetsLink).click();
        return this;
    }

    public ActivePromotionPage clickProductClubSportium(){
        driver.findElement(productClubSportium).click();
        return this;
    }




}
