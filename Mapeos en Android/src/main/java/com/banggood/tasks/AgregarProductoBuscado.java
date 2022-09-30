package com.banggood.tasks;

import com.banggood.userInterface.BanggoodUI;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class AgregarProductoBuscado implements Task {

    BanggoodUI banggoodUI = new BanggoodUI();
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(banggoodUI.BTN_PRODUCTO_BUSCAR),
                Click.on(banggoodUI.BTN_CATEGORY_ADD),
                Click.on(banggoodUI.BTN_ADDPRODUCTO)

        );
    }
    public static Performable on(){
        return Instrumented.instanceOf(AgregarProductoBuscado.class).withProperties();
    }

}
