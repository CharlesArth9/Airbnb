package com.choucair.formacion.pageobjects;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.*;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.Locatable;
import org.openqa.selenium.interactions.Mouse;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.io.File;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;


@DefaultUrl("https://google.com.co")
public class AirbnbPage extends PageObject {

    WebElement munequito = $("//div[@class='gm-svpc']");

    /* public void ubicarMapa() {
             $("//button[@class='optanon-allow-all accept-cookies-button']").click();
             *//*JavascriptExecutor jse = (JavascriptExecutor) getDriver();
        jse.executeScript("window.scrollBy(0, 463)");
        $("//button[contains(text(),'Ubicación')]").click();*//*

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
    }*/
    public void expresionR(){
        getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);   //TIEMPO IMPLICITO
        $("//button[@title='Aceptar']").waitUntilClickable().click();
        String  totalhabitacion= $("//div[@class=\"_8ssblpx\"]//descendant-or-self::span[starts-with(text(),'Total')]").getText();
        System.out.println(totalhabitacion);
        String[] totalseparado = totalhabitacion.split("\n");


        if (Pattern.matches("[$][0-9]+[,][0-9]+\\s[A-Z]+", totalseparado[2].trim()))
        {
            String precio_total = totalseparado[2].trim();
            precio_total = precio_total.replaceAll("[[^a-zA-Z0-9\\s+]]", "");
            precio_total = precio_total.substring(0,5);
            int total = Integer.valueOf(precio_total);
            System.out.println(total);
        }

        }





    public void excelente() throws AWTException {

        WebDriverWait wait = new WebDriverWait(getDriver(),20); // TIEMPO EXPLICITO
        Actions action = new Actions(getDriver());
            //Serenity.takeScreenshot();
            WebElement btnopinion = $("//div[@class='block_header block_title']//div//child::a");
            //action.moveToElement(jjpp);
            //action.contextClick(jjpp).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.RETURN).build().perform();
            //action.contextClick(jjpp).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
            action.contextClick(btnopinion).build().perform();
            Robot robot = new Robot();
            robot.keyPress(KeyEvent.VK_DOWN);
            robot.keyPress(KeyEvent.VK_ENTER);
            ArrayList<String> pest = new ArrayList<>(getDriver().getWindowHandles());
            getDriver().switchTo().window(pest.get(1));
            waitForTextToAppear("Haz clic para calificar");

// SIN QUEMAR DATOS FUNCIONA
        /*int y = getDriver().findElement(By.xpath("//span[@id='bubble_rating']")).getLocation().getY();
        int x = getDriver().findElement(By.xpath("//span[@id='bubble_rating']")).getLocation().getX();
        System.out.println("coordenadas:"+x+","+y+"");
        new Actions(getDriver()).moveByOffset(x+145,y+32).click().build().perform();*/

        Point coor = getDriver().findElement(By.xpath("//span[@id='bubble_rating']")).getLocation();
        new Actions(getDriver()).moveByOffset(coor.x+145,coor.y+32).click().build().perform();
   /*     new Actions(getDriver()).moveByOffset(coor.x,coor.y).perform();
        coor.moveBy(342,351);
        new Actions(getDriver()).click().build().perform();

// ESTO FUNCIONA CON DATOS QUEMADOS
//        new Actions(getDriver()).moveByOffset(342,351).click().build().perform();

// ESTO FUNCIONA BUSCANDO EL ELEMENTO PERO LE DA CLICK A LA MITAD DE ELEMENTO
          /* Actions a = new Actions(getDriver());
        a.click(calificador).build().perform();*/

// ESTO TAMBIEN FUNCIONA
        /*WebElement algo = $("//img[@class='firstReviewExplorerBadge']");
        WebElement calificador = $("//span[@id='bubble_rating']");
        new Actions(getDriver()).dragAndDropBy(algo,310,351).build().perform();*/

    }

    // METODO DE ESPERA DE CUALQUIER ELEMENTO ------> EXPLICITO
    public WebElement capturarVisible(By munequito)
    {
        WebElement element = null;
        WebDriverWait waite = new WebDriverWait(getDriver(), 10);
        element = waite.until(ExpectedConditions.visibilityOfElementLocated(munequito));
        return element;
    }


    // OPCIONES DE CHROME
    public void opcionesChrome(){
        ChromeOptions options = new ChromeOptions();
        options.addExtensions(new File("/path/to/extension.crx"));
        ChromeDriver driver = new ChromeDriver(options);

    // USAR PROXY
        Proxy proxy = new Proxy();
        proxy.setHttpProxy("myhttpproxy:3337");
        options.setCapability("proxy", proxy);

    // USAR UN PERFIL DE CHROME ESPECIFICO
        options.addArguments("user-data-dir=/path/to/your/custom/profile");

    // CHROME INICIA MAXIMIZADO
        options.addArguments("start-maximized");
        options.addArguments("incognito");

    // UBICACION NO ESTANDAR
        options.setBinary("/path/to/other/chrome/binary");


    }


    public void pruebaCss(){
        {
            WebDriverWait myWaitVar = new WebDriverWait(getDriver(), 3);
            myWaitVar.until(ExpectedConditions.visibilityOfElementLocated(By.className("mailmunch-popover-iframe")));
            getDriver().switchTo().frame(getDriver().findElement(By.className("mailmunch-popover-iframe")));
            getDriver().findElement(By.xpath("//div[starts-with(@class,'theme')]//a")).click();
            getDriver().switchTo().defaultContent();
            $("//div[@id='js-cookie-notification']//button").click();
            $("div .banner-background a[data-banner-id='Banner_Position_5']").waitUntilClickable().click();

        }


    }
    public void googleTraductor() throws AWTException {
        $("//a[@class='gb_B gb_sc']").waitUntilClickable().click();
       // waitFor(3).seconds();
        WebDriverWait wait = new WebDriverWait(getDriver(),5); // TIEMPO EXPLICITO
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@id='gb']//div[@aria-label='Google apps']/ul//li[10])[1]/a"))).click();
        // waitForTextToAppear("Traductor");
       // $("a#gb51").waitUntilClickable().click();
        /*Robot robot = new Robot();

        for (int i=1; i<=9; i++) {
            robot.keyPress(KeyEvent.VK_TAB);
        }
        robot.keyPress(KeyEvent.VK_ENTER);
*/

    }

}
