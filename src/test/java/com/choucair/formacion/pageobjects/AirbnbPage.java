package com.choucair.formacion.pageobjects;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.JavascriptExecutor;


@DefaultUrl("https://cutt.ly/JwZ2rzv")
public class AirbnbPage extends PageObject {

    public void ubicarMapa() {
        JavascriptExecutor jse = (JavascriptExecutor) getDriver();
        jse.executeScript("window.scrollBy(0, 463)");
        $("//button[contains(text(),'Ubicación')]").click();
    }

}
