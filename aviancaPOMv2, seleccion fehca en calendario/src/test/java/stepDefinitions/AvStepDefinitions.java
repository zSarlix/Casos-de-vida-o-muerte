package stepDefinitions;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import driver.SeleniumWebDriver;
import net.thucydides.core.annotations.Steps;
import steps.AvSteps;

public class AvStepDefinitions {
    @Steps
    AvSteps pasos = new AvSteps();
    @Dado("^que me encuentro en la pagina web https://www\\.avianca\\.com/co/es$")
    public void queMeEncuentroEnLaPaginaWebHttpsWwwAviancaComCoEs() {
        SeleniumWebDriver.chromeDriver("https://www.avianca.com/co/es");
    }

    @Cuando("^busco un vuelo y escojo una fecha$")
    public void buscoUnVueloYEscojoUnaFecha() {
        pasos.vueloExcel();
    }

    @Entonces("^selecciono un horario y plan de equipaje$")
    public void seleccionoUnHorarioYPlanDeEquipaje() {
        SeleniumWebDriver.driver.quit();
    }
}