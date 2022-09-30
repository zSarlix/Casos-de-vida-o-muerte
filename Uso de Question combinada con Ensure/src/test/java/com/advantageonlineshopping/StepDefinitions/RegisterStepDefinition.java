package com.advantageonlineshopping.StepDefinitions;

import com.advantageonlineshopping.Driver.DriverSP;
import com.advantageonlineshopping.Task.HomeTask;
import com.advantageonlineshopping.Task.RegisterTask;
import com.advantageonlineshopping.question.RegisterValidationQuestion;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.junit.Assert;
import org.hamcrest.Matchers;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

import java.io.IOException;

public class RegisterStepDefinition {

    @Before
    public void bf()throws IOException{
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^que me encuentro en la pagina principal de AdvantageDemo (.*)$")
    public void queMeEncuentroEnLaPaginaDeDeRegistroDeAdvantageDemoHttpsWwwAdvantageonlineshoppingCom(String url) {
     OnStage.theActorCalled("actor").can(BrowseTheWeb.with(DriverSP.chromeDriver(url)));
    }

    @When("^registro un usuario$")
    public void ingresoLosDatosSolicitados() {
        OnStage.theActorInTheSpotlight().attemptsTo(HomeTask.inHomeTask());
        OnStage.theActorInTheSpotlight().attemptsTo(RegisterTask.inRegisterTask());
    }

    @Then("^Valido que el usuario sea creado exitosamente$")
    public void validoQueElUsuarioSeaCreado() {
        OnStage.theActorInTheSpotlight().should(seeThat("el actor puede visualizar el nombre del usuario registrado",
                RegisterValidationQuestion.validar(), Matchers.equalTo(true)));
    }
}
