package com.choucair.formacion.pageobjects;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;

import java.awt.event.KeyEvent;


@DefaultUrl("https://cutt.ly/JwZ2rzv")
public class AirbnbPage extends PageObject {

    public void ubicarMapa() {
        /*JavascriptExecutor jse = (JavascriptExecutor) getDriver();
        jse.executeScript("window.scrollBy(0, 463)");
        $("//button[contains(text(),'Ubicación')]").click();*/
        $("//button[@class='optanon-allow-all accept-cookies-button']").click();
        $("//a[@class]//div[@class='_czm8crp'][contains(text(),'Pris')]").click();
        waitFor(5).second();
        getDriver().get("https://www.google.com/maps/@42.6613213,21.1656307,16z?hl=es");
        waitFor(5).second();
    }

    public void zoomMapa()
    {
        for(int i=0; i<5; i++){
            getDriver().findElement(By.tagName("html")).sendKeys(Keys.chord(Keys.CONTROL, Keys.chord("+")));
        }
    }

}
