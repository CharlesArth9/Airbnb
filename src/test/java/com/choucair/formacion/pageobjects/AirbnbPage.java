package com.choucair.formacion.pageobjects;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;


@DefaultUrl("https://cutt.ly/JwZ2rzv")
public class AirbnbPage extends PageObject {

    public void ubicarMapa() {
        /*JavascriptExecutor jse = (JavascriptExecutor) getDriver();
        jse.executeScript("window.scrollBy(0, 463)");
        $("//button[contains(text(),'Ubicación')]").click();*/
        $("//button[@class='optanon-allow-all accept-cookies-button']").click();
        $("//a[@class]//div[@class='_czm8crp'][contains(text(),'Pris')]").click();
    }

    public void zoomMapa()
    {
        for(int i=0; i<2; i++){
            getDriver().findElement(By.tagName("html")).sendKeys(Keys.chord(Keys.CONTROL, Keys.ADD));
        }
    }

}
