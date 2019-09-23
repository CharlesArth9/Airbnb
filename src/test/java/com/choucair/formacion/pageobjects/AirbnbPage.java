package com.choucair.formacion.pageobjects;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;


@DefaultUrl("https://www.airbnb.com.co/")
public class AirbnbPage extends PageObject {
    public void donde(String destino) {
        $("//button[@class='optanon-allow-all accept-cookies-button']").click();
        find(By.xpath("//input[@class=\"_1f8ev6q\"]")).sendKeys(destino);
        find(By.xpath("//div[@class=\"_26hc67j\"]")).click();
    }

    public void llegada(String llegada, String salida) {
        find(By.xpath("//input[@id=\"checkin_input\"]")).click();
        find(By.xpath("//div[@class='_1h5uiygl']")).click();
        JavascriptExecutor jse = (JavascriptExecutor) getDriver();
        jse.executeScript("window.scrollBy(0, 350)");
        getDriver().findElement(By.xpath("//div[@class='_1lds9wb']//tr[5]//*[text()='31']")).click();

        //find(By.xpath("//div[@class='_1lds9wb']//tr[5]//*[text()="+llegada+"]")).click();
        //find(By.xpath("//div[@class='_1h5uiygl']")).click();
        //find(By.xpath("//div[@class='_1lds9wb']//tr[2]//*[text()=" + salida + "]")).click();
    }

/*
    public void huespedes(String s, String s1, String s2) {
        find(By.xpath("//button[@class=\"_7ykwo4\"]")).click();
    }*/
}

