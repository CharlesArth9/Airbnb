package com.choucair.formacion.pageobjects;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import java.util.List;


//@DefaultUrl("https://www.airbnb.com.co/")
@DefaultUrl("https://www.airbnb.com.co/s/Kosovo-Polje/homes?query=Kosovo%20Polje&checkin=2019-10-31&checkout=2019-11-06&adults=1&children=0&infants=3&guests=1&toddlers=0&place_id=&refinement_paths%5B%5D=%2Ffor_you&source=mc_search_bar&search_type=unknown")
public class AirbnbPage extends PageObject {
    public void donde(String destino) {
        String xpath0 = "//button[@class='optanon-allow-all accept-cookies-button']";
        waitFor((WebElementFacade) $(xpath0)).waitUntilVisible().click();
        find(By.xpath("//input[@class=\"_1f8ev6q\"]")).sendKeys(destino);
        find(By.xpath("//div[@class=\"_26hc67j\"]")).click();    }

    public void fechas(String llegada, String salida) {
        find(By.xpath("//input[@id=\"checkin_input\"]")).click();
        find(By.xpath("//div[@class='_1h5uiygl']")).click();
        JavascriptExecutor jse = (JavascriptExecutor) getDriver();
        jse.executeScript("window.scrollBy(0, 350)");
        String xpath1 = "//div[@class='_1lds9wb']//tr[5]//*[text()=" + llegada + "]";
        String xpath2 = "//div[@class='_1lds9wb']//tr[2]//*[text()=" + salida + "]";
        waitFor((WebElementFacade) $(xpath1)).waitUntilVisible().click();
        find(By.xpath("//div[@class='_1h5uiygl']")).click();
        waitFor((WebElementFacade) $(xpath2)).waitUntilVisible().click();    }

    public void huespedes(String s, String s1, String s2) {
        find(By.xpath("//button[@class='_7ykwo4']")).click();
        String xpath4="//div[@class='_9cfq872']//div//div[1]//div[1]//div[1]//div[1]//div[2]//div[1]//div[3]//button[1]";
        String xpath5 = "//div[@class='_e296pg']//div[2]//div[1]//div[1]//div[1]//div[2]//div[1]//div[3]//button[1]";
        String xpath6 = "//div[@class='_slilk2']//div//div[3]//div[1]//div[1]//div[1]//div[2]//div[1]//div[3]//button[1]";
        int clicksBebes = Integer.parseInt(s);
        int clickNiños = Integer.parseInt(s1);
        int clickAdultos = Integer.parseInt(s2);
        for (int i=0; i<clicksBebes; i++){
            waitFor((WebElementFacade)$(xpath4)).waitUntilVisible().click();       }
        for (int i=0; i<clickNiños; i++){
            waitFor((WebElementFacade)$(xpath5)).waitUntilVisible().click();       }
        for (int i=0; i<clickAdultos; i++){
            waitFor((WebElementFacade)$(xpath6)).waitUntilVisible().click();       }
        find(By.xpath("//button[@class='_b0ybw8s']")).click();
        find(By.xpath("//button[@type='submit']")).click();
    }

    public void departamento(int valormaximo) {
        List<WebElement> divs = getDriver().findElements(By.xpath("//div[@class='_8ssblpx']"));
        int count = divs.size();
        for (int i = 1; i < count+1; i++) {
            //String xpath7 = $("//div[@class='_8ssblpx']//meta[@content=" + i + "]");
            String xpath8 = $("//span[@class='_krjbj']//ancestor::span[4][contains(text(),'noche')]").getText();
            System.out.println(xpath8);
        }
    }
}


