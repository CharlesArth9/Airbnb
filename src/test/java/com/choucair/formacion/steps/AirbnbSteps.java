package com.choucair.formacion.steps;

import com.choucair.formacion.pageobjects.AirbnbPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;

public class AirbnbSteps {
    @Steps
    AirbnbPage airbnbPage;


    @Given("^se debe realizar una busqueda de departamento$")
    public void se_debe_realizar_una_busqueda_de_departamento()  {
    }

    @When("^escojo las condiciones de departamento$")
    public void escojo_las_condiciones_de_departamento()  {
    }

    @Then("^busco en el mapa y hago el reporte$")
    public void busco_en_el_mapa_y_hago_el_reporte()  {
    }

}
