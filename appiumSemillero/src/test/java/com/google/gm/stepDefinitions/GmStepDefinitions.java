package com.google.gm.stepDefinitions;

import com.google.gm.driver.AppiumAndroidDriver;
import com.google.gm.tasks.ConfiGestoDerecha;
import cucumber.api.java.Before;
import cucumber.api.java.en.*;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.io.IOException;

public class GmStepDefinitions {
    @Before
    public void before() throws IOException {
        OnStage.setTheStage(new OnlineCast());
    }
    @Given("^estoy en la app gmail$")
    public void estoyEnLaAppGmail() {
        OnStage.theActorCalled("").can(BrowseTheWeb.with(AppiumAndroidDriver.appium().on()));
    }
    @When("^quiero marcar como leido un mensaje$")
    public void quieroMarcarComoLeidoUnMensaje() {
        OnStage.theActorInTheSpotlight().attemptsTo(ConfiGestoDerecha.on());
    }

    @Then("^cambio el gesto en las configuraciones$")
    public void cambioElGestoEnLasConfiguraciones() {

    }

}
