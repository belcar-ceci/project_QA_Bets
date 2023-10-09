package com.sportium.testCases;

import com.sportium.base.BaseTest;
import com.sportium.factory.DriverManager;
import com.sportium.pages.LoginPage;
import com.sportium.pages.RegisterPage;
import com.sportium.testData.RegisterData;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class RegisterCases extends BaseTest {

    @Test
    public void registerUserPortalAdmin() throws InterruptedException{

        String firstName = RegisterData.generarNombreAleatorio();
        System.out.println("Name Random: " + firstName);
        String firstSurname = RegisterData.generarPrimerApellidoAleatorio();
        System.out.println("FirstSurName Random: " + firstSurname);
        String secondSurname = RegisterData.generarSegundoApellidoAleatorio();
        System.out.println("SecondSurName Random: " + secondSurname);
        String address = RegisterData.generateRandomAddress();
        System.out.println("Address Random: " + address);
        String addressLine = RegisterData.generateLineRandomAddress();
        System.out.println("AddressLine Random: " + addressLine);
        String postalCode = RegisterData.generateRandomPostalCode();
        System.out.println("PostalCode Random: " + postalCode);
        String phone = RegisterData.generateRandomTelephone();
        System.out.println("Phone Random: " + phone);
        String userName = RegisterData.generateRandomUserName();
        System.out.println("UserName Random: " + userName);
        String userPassword = RegisterData.generateRandomPassword();
        System.out.println("UserPassword Random: " + userPassword);



        DriverManager driverManager = new DriverManager();
        WebDriver driver = driverManager.initializeDriver(); // Inicializa el objeto driver
        RegisterPage registerPage = new RegisterPage(driver); // Pasa el objeto driver al constructor de RegisterPage
        String dniAleatory = RegisterData.generarDNI();

        registerPage.load();
        registerPage.clickRegisterButton()
                    .selectCitizenship("España")
                    .enterFirstName(firstName)
                    .enterFirstSurname(firstSurname)
                    .enterSecondSurname(secondSurname)
                  /*.enterFirstName("Juan")
                    .enterFirstSurname("Lopez")
                    .enterSecondSurname("Perez")*/
                    .selectBirthDate("4", "Febrero", "1990")
                    .enterPersonalId(dniAleatory)
                  //.enterPersonalId("25543575M")
                    .enterEmail("test@playtech.com")
                    .selectTaxResidenceRegion("Cataluña")
                    .enterAddress(address)
                    .enterAddressLine(addressLine)
                    .enterPostalCode(postalCode)
                    .enterPhone(phone)
                    .enterUserName(userName)
                    //.enterAddress("Lerida")
                    //.enterAddressLine("Alcalde Porqueres")
                    //.enterPostalCode("25008")
                    //.enterPhone("663309456")
                    //.enterUserName("VipMiss.4")
                    .enterUserPassword(userPassword)
                    //.enterUserPassword("QA.test24")
                    .clickSubscription()
                    .clickSubscriptionCheckbox();
        //registerPage.clickRegisterNow();



    }
}
