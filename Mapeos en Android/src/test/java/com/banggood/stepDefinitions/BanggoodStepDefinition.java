package com.banggood.stepDefinitions;

import com.banggood.driver.AppiumAndroidDriver;
import com.banggood.tasks.*;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.io.IOException;

public class BanggoodStepDefinition {

    @Before
    public void before() throws IOException {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^que el usuario se encuentra en la app banggod$")
    public void queElUsuarioSeEncuentraEnLaAppBanggod() {
        OnStage.theActorCalled("").can(BrowseTheWeb.with(AppiumAndroidDriver.appium().on()));

    }


    @When("^El usuario agrega productos$")
    public void elUsuarioAgregaProductos() {
        OnStage.theActorInTheSpotlight().attemptsTo(ProductoRecomendado.on());
        OnStage.theActorInTheSpotlight().attemptsTo(Categorias.on());
        OnStage.theActorInTheSpotlight().attemptsTo(ProductoCategoria.on());
        OnStage.theActorInTheSpotlight().attemptsTo(BuscarProductoCajaTexto.on());
        OnStage.theActorInTheSpotlight().attemptsTo(AgregarProductoBuscado.on());

    }

    @Then("^El usuario va carrito y vacia$")
    public void elUsuarioVaCarritoYVacia() {
        OnStage.theActorInTheSpotlight().attemptsTo(BorrarProductos.on());

    }

}
