package com.choucair.formacion.steps;

import com.choucair.formacion.pageobjects.AirbnbPage;
import net.thucydides.core.annotations.Step;

import java.awt.*;


public class AirbnbSteps {
    AirbnbPage airbnbPage;

    @Step
    public void entrar() throws AWTException {
        airbnbPage.open();
//        airbnbPage.excelente();
        airbnbPage.expresionR();
//        airbnbPage.ubicarMapa();
//        airbnbPage.moverMunequito();
//        airbnbPage.zoomMapa();
    }



}
