package com.choucair.formacion.pageobjects;

import com.google.maps.model.LatLng;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.awt.*;

import static javax.swing.UIManager.getString;


@DefaultUrl("https://cutt.ly/JwZ2rzv")
public class AirbnbPage extends PageObject {

    public void ubicarMapa() {
        $("//button[@class='optanon-allow-all accept-cookies-button']").click();
        JavascriptExecutor jse = (JavascriptExecutor) getDriver();
        jse.executeScript("window.scrollBy(0, 463)");
        $("//button[contains(text(),'Ubicación')]").click();

//        getDriver().findElement(By.tagName("html")).sendKeys(Keys.chord(Keys.CONTROL, Keys.ADD));
//        $("//a[@class]//div[@class='_czm8crp'][contains(text(),'Pris')]").click();
//        waitFor(5).second();
//        getDriver().get("https://www.google.com/maps/@42.6613213,21.1656307,16z?hl=es");
//        waitFor(5).second();
    }

    public void moverMunequito() throws AWTException {
        WebElement munequito = $("//div[@class='gm-svpc']");
        super.clickOn(munequito);
        waitFor(5).second();
//        estoy probando nuevo alias para este commit
//        Point coor = getDriver().findElement(By.xpath("//body[@class='with-new-header']/div/div/main[@id='site-content']/div/section/div[@id='room']/div[@class='_mwt4r90']/div/div[@class='_1k6i3d4']/div[@class='_mkyacvg']/div/div[@id='neighborhood']/div[@class='_1gw6tte']/div/div/div/div[@class='_e296pg']/section/div/div/div/div/div/div/div[@class='gm-style']/div/div[3]")).getLocation();
//        System.out.println(coor);
//        Actions builder = new Actions(getDriver());
//        builder.moveByOffset( 454, 4664 );

        Robot robot = new Robot();
        robot.mouseMove(454,4664);
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
