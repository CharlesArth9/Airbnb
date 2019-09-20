package com.choucair.formacion.definition;

import com.choucair.formacion.steps.AirbnbSteps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class airbnbDefinitions {
    @Steps
    AirbnbSteps airbnbSteps;

    @Given("^se debe realizar una busqueda de departamento$")
    public void se_debe_realizar_una_busqueda_de_departamento() throws Throwable {
    }

    @When("^escojo las condiciones de departamento$")
    public void escojo_las_condiciones_de_departamento() throws Throwable {

    }

    @Then("^busco en el mapa y hago el reporte$")
    public void busco_en_el_mapa_y_hago_el_reporte() throws Throwable {

    }
}
