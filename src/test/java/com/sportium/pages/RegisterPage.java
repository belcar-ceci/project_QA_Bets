package com.sportium.pages;

import com.sportium.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegisterPage extends BasePage {

    private By PortalAdminRegisterBtn = By.xpath("//a[normalize-space()='Registro']");
    private By citizenshipDropdown = By.id("citizenship");
    private By countrycodeDropdown  = By.id("countrycode");
    private By fullFirstnameInput = By.id("fullFirstname");
    private By fullFirstSurnameInput = By.id("fullFirstSurname");
    private By fullSecondSurnameInput = By.id("fullSecondSurname");
    private By dayDatePicker = By.id("day_datePicker1");
    private By monthDatePicker = By.id("month_datePicker1");
    private By yearDatePicker = By.id("year_datePicker1");
    private By personalIdInput = By.id("personalId");
    private By emailInput = By.id("text1070");
    private By taxResidenceRegionDropdown = By.id("taxResidenceRegion");
    private By addressInput = By.id("text1783");
    private By addressLineInput = By.id("text1997");
    private By postalCodeInput = By.id("text2956");
    private By phoneInput = By.id("phone1");
    private By userNameInput = By.id("userName");
    private By passwordInput = By.id("password");

    private By subscription = By.id("subscription");
    private By subscriptionCheckbox = By.id("checkbox1");

    private By registerNowBtn = By.xpath("//button[normalize-space()='Registrate ahora']");

    private int citizenshipCounter = 0;
    public RegisterPage(WebDriver driver) {
        super(driver);
    }

    public RegisterPage clickRegisterButton(){
        driver.findElement(PortalAdminRegisterBtn).click();
        return this;
    }

    public RegisterPage selectCitizenship(String citizenship) {
        WebElement dropdown = driver.findElement(citizenshipDropdown);
        dropdown.click();
        dropdown.findElement(By.xpath("//option[. = '" + citizenship + "']")).click();

        return this;
    }






    public RegisterPage selectCountryCode(String countryCode) {
        driver.findElement(countrycodeDropdown).click();
        driver.findElement(By.xpath("//option[normalize-space()='" + countryCode + "']")).click();
        return this;
    }
    public RegisterPage enterFirstName(String firstName) {
        driver.findElement(fullFirstnameInput).sendKeys(firstName);
        return this;
    }

    public RegisterPage enterFirstSurname(String firstSurname) {
        driver.findElement(fullFirstSurnameInput).sendKeys(firstSurname);
        return this;
    }

    public RegisterPage enterSecondSurname(String secondSurname) {
        driver.findElement(fullSecondSurnameInput).sendKeys(secondSurname);
        return this;
    }



    public RegisterPage selectBirthDate(String day, String month, String year) {
        selectDay(day);
        selectMonth(month);
        selectYear(year);
        return this;
    }

    private RegisterPage selectDay(String day) {
        driver.findElement(dayDatePicker).click();
        driver.findElement(By.xpath("//option[normalize-space()='" + day + "']")).click();
        return this;
    }

    private RegisterPage selectMonth(String month) {
        driver.findElement(monthDatePicker).click();
        driver.findElement(By.xpath("//option[normalize-space()='" + month + "']")).click();
        return this;
    }

    private RegisterPage selectYear(String year) {
        driver.findElement(yearDatePicker).click();
        driver.findElement(By.xpath("//option[normalize-space()='" + year + "']")).click();
        return this;
    }

    public RegisterPage enterPersonalId(String personalId) {
        driver.findElement(personalIdInput).sendKeys(personalId);
        return this;
    }

    public RegisterPage enterEmail(String email) {
        driver.findElement(emailInput).sendKeys(email);
        return this;
    }

    public RegisterPage selectTaxResidenceRegion(String region) {
        WebElement dropdown = driver.findElement(taxResidenceRegionDropdown);
        dropdown.click();
        dropdown.findElement(By.xpath("//option[normalize-space()='" + region + "']")).click();
        return this;
        /*
        *  WebElement dropdown = driver.findElement(citizenshipDropdown);
        dropdown.click();
        dropdown.findElement(By.xpath("//option[. = '" + citizenship + "']")).click();

        return this;
        * */


    }

    public RegisterPage enterAddress(String address) {
        driver.findElement(addressInput).sendKeys(address);
        return this;
    }

    public RegisterPage enterAddressLine(String addressLine) {
        driver.findElement(addressLineInput).sendKeys(addressLine);
        return this;
    }

    public RegisterPage enterPostalCode(String postalCode) {
        driver.findElement(postalCodeInput).sendKeys(postalCode);
        return this;
    }

    public RegisterPage enterPhone(String phone) {
        driver.findElement(phoneInput).sendKeys(phone);
        return this;
    }

    public RegisterPage enterUserName(String username) {
        driver.findElement(userNameInput).sendKeys(username);
        return this;
    }

    public RegisterPage enterUserPassword(String password) {
        driver.findElement(passwordInput).sendKeys(password);
        return this;
    }

    public RegisterPage clickSubscription(){
        driver.findElement(subscription).click();
        return this;
    }

    public RegisterPage clickSubscriptionCheckbox() {
        driver.findElement(subscriptionCheckbox).click();
        return this;
    }

    public RegisterPage clickRegisterNow(){
        driver.findElement(registerNowBtn).click();
        return this;
    }
}
