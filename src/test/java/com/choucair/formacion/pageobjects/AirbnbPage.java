package com.choucair.formacion.pageobjects;

import com.google.maps.GeoApiContext;
import com.google.maps.GeocodingApi;
import com.google.maps.GeocodingApiRequest;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;


@DefaultUrl("https://cutt.ly/JwZ2rzv")
public class AirbnbPage extends PageObject {

    public void ubicarMapa() {
        $("//button[@class='optanon-allow-all accept-cookies-button']").click();
        JavascriptExecutor jse = (JavascriptExecutor) getDriver();
        jse.executeScript("window.scrollBy(0, 463)");
        $("//button[contains(text(),'Ubicación')]").click();
        getDriver().findElement(By.tagName("html")).sendKeys(Keys.chord(Keys.CONTROL, Keys.ADD));
//        $("//a[@class]//div[@class='_czm8crp'][contains(text(),'Pris')]").click();
        waitFor(5).second();
        getDriver().get("https://www.google.com/maps/@42.6613213,21.1656307,16z?hl=es");
        waitFor(5).second();
    }
public void prueba() {


    }


    public void zoomMapa()
    {
        for(int i=1; i<2; i++){
            JavascriptExecutor jse = (JavascriptExecutor) getDriver();
            jse.executeScript("document.body.style.zoom='zoom %'");
//            getDriver().findElement(By.tagName("html")).sendKeys(Keys.chord(Keys.CONTROL, Keys.ADD));
        }
    }

}
