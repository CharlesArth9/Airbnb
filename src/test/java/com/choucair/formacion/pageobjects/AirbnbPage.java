package com.choucair.formacion.pageobjects;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;



@DefaultUrl("https://cutt.ly/JwZ2rzv")
public class AirbnbPage extends PageObject {

    public void ubicarMapa() {
        $("//button[@class='optanon-allow-all accept-cookies-button']").click();
        /*JavascriptExecutor jse = (JavascriptExecutor) getDriver();
        jse.executeScript("window.scrollBy(0, 463)");
        $("//button[contains(text(),'Ubicación')]").click();*/

        $("//a[@href='#neighborhood']").click();
//        getDriver().get("https://www.google.com/maps/@42.6613213,21.1656307,16z?hl=es");
    }

    public void moverMunequito()  {
        $("//div[@class='_nh2jk8']//button[1]").click();
        WebElement munequito = $("//div[@class='gm-svpc']");
//        super.clickOn(munequito);


//        new Actions(getDriver()).dragAndDropBy(munequito,395,400).build().perform();
        new Actions(getDriver()).clickAndHold(munequito).moveByOffset(495,4786).build().perform();
        waitFor(3).second();
        new Actions(getDriver()).contextClick(munequito).release().perform();
//        new Actions(getDriver()).clickAndHold(munequito).moveToElement(munequito,395,400).build().perform();
//        Point coor = getDriver().findElement(By.xpath("//body[@class='with-new-header']/div/div/main[@id='site-content']/div/section/div[@id='room']/div[@class='_mwt4r90']/div/div[@class='_1k6i3d4']/div[@class='_mkyacvg']/div/div[@id='neighborhood']/div[@class='_1gw6tte']/div/div/div/div[@class='_e296pg']/section/div/div/div/div/div/div/div[@class='gm-style']/div/div[3]")).getLocation();
//        System.out.println(coor);
    }


}
