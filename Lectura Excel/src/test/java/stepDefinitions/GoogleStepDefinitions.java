package stepDefinitions;

import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import driver.Selenium;
import net.thucydides.core.annotations.Steps;
import steps.GoogleSteps;

public class GoogleStepDefinitions {
    @Steps
    GoogleSteps googleSteps = new GoogleSteps();

    @Dado("^que me encuentro en el sitio web http://www\\.google\\.com$")
    public void queMeEncuentroEnElSitioWebHttpWwwGoogleCom() {
        Selenium.chromeDrive("https://www.google.com/");
    }
    @Cuando("^ingreso un termino de busqueda en la barra$")
    public void ingresoUnTerminoDeBusquedaEnLaBarra() {
        googleSteps.buscar();
    }
    @Entonces("^obtengo resultados de la busqueda$")
    public void obtengoResultadosDeLaBusqueda() {
        Selenium.driver.quit();
    }
}
