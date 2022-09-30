package com.advantageonlineshopping.interaction;

import com.advantageonlineshopping.Driver.DriverSP;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CreateUserInteraction implements Interaction {

    private Target target;
    private String text;

    public CreateUserInteraction(Target target, String text) {
        this.target = target;
        this.text = text;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        new WebDriverWait(DriverSP.driver, 20)
                .until(ExpectedConditions.textToBePresentInElement(target.resolveFor(actor),text));
        actor.attemptsTo(Click.on(target));
    }

    public static Performable inCreateUserInteraction(Target terget, String text){
        return Instrumented.instanceOf(CreateUserInteraction.class).withProperties(terget,text);
    }
}
