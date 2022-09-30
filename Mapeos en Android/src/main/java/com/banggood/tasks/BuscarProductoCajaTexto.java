package com.banggood.tasks;

import com.banggood.userInterface.BanggoodUI;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class BuscarProductoCajaTexto implements Task {
    BanggoodUI banggoodUI = new BanggoodUI();
    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Click.on(banggoodUI.BTN_BACKHOME),
                Click.on(banggoodUI.BTN_BACKHOME),
                Click.on(banggoodUI.BTN_HOME),
                WaitUntil.the(banggoodUI.TXT_BUSCAR, isVisible()).forNoMoreThan(5).seconds(),
                Click.on(banggoodUI.TXT_BUSCAR),
                Enter.keyValues("tableta").into(banggoodUI.TXT_BUSCAR2),
                Click.on(banggoodUI.BTN_BUSCAR)
                );

    }
    public static Performable on(){
        return Instrumented.instanceOf(BuscarProductoCajaTexto.class).withProperties();
    }

}
