package com.sportium.pages;

import com.sportium.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class LoginPage extends BasePage {

    public WebDriver driver;
    private By PortalAdminInitBtn = By.xpath("//a[normalize-space()='Iniciar Sesión']");
    private By PortalAdminUserName = By.xpath("//*[@id=\"LAYER_13000\"]/div[2]/div/div[2]/div[1]/form/div[2]/div[1]/div/input");
    private By PortalAdminPassword = By.xpath("//*[@id=\"LAYER_13000\"]/div[2]/div/div[2]/div[1]/form/div[2]/div[2]/div/input");
    //public By PortalAdminPopUpLogin = By.cssSelector(".LoginPopup__loginPopupContainer--3Lg");
    private By PortalAdminSubmitLoginBtn = By.xpath("//button[normalize-space()='Acceder']");

    private By PortalAdminAccessBtn = By.xpath("//button[normalize-space()='Aceptar']");

    public LoginPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    public LoginPage PortalAdminInitBtn(){
        driver.findElement(PortalAdminInitBtn).click();
        return this;
    }

    public LoginPage enterUserName (String username){
        if (driver != null) {
            driver.findElement(PortalAdminUserName).sendKeys(username);
        } else {
            System.out.println("El objeto driver es null.");
        }

        /**
        return this;
        driver.findElement(PortalAdminUserName).sendKeys(username);*/
        return null;
    }

    public LoginPage enterPassword(String password){
        driver.findElement(PortalAdminPassword).sendKeys(password);
        return this;
    }

    public LoginPage clickLoginBtn(){
        driver.findElement(PortalAdminSubmitLoginBtn).click();
        return this;
    }

    public LoginPage clickWelcomeAccept(){
        driver.findElement(PortalAdminAccessBtn).click();
        return this;
    }

    public LoginPage logged(String username, String password){
        return enterUserName(username).enterPassword(password).clickLoginBtn();
    }





}
