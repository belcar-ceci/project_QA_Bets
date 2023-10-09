package com.sportium.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


import java.time.Instant;

public class BasePage {

    protected WebDriver driver;


    public BasePage(WebDriver driver){
        this.driver = driver;
    }

    public void load(){
        //driver.get("https://portal-admin.sportium.es/apuestas" );
        driver.get("https://portal-admin.sportium.es/test/dev/club-sportium" );
        driver.findElement(By.xpath("//*[@id=\"application\"]/div[3]/div[1]/div[1]/div/article/p[2]/button[1]")).click();
        //driver.findElement(By.xpath("//*[@id=\"application\"]/div[3]/div[1]/div[1]/div/article/p[2]/button[3]")).click();

    }
}
