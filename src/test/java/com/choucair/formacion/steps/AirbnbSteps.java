package com.choucair.formacion.steps;

import com.choucair.formacion.pageobjects.AirbnbPage;
import net.thucydides.core.annotations.Step;

public class AirbnbSteps {
    AirbnbPage airbnbPage;

    @Step
    public void entrar(){
        airbnbPage.open();
        airbnbPage.ubicarMapa();
        airbnbPage.zoomMapa();
    }



}
