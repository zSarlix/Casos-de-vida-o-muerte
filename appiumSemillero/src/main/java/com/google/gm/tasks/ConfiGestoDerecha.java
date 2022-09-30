package com.google.gm.tasks;

import com.google.gm.userInterface.GmUI;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class ConfiGestoDerecha implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(GmUI.BTN_REU),
                Click.on(GmUI.BTN_MENU),
                Click.on(GmUI.BTN_CONFIG),
                Click.on(GmUI.BTN_CONFIG_GRAL),
                Click.on(GmUI.BTN_ACCION_DESLIZAR),
                Click.on(GmUI.BTN_DESLIZAR_DERECHA),
                Click.on(GmUI.BTN_MARCAR_LEIDO)
        );
    }
    public static ConfiGestoDerecha on(){
        return Instrumented.instanceOf(ConfiGestoDerecha.class).withProperties();
    }

}
