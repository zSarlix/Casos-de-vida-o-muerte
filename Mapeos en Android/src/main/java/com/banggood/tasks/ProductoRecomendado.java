package com.banggood.tasks;

import com.banggood.interactions.ScrollinBajar;
import com.banggood.userInterface.BanggoodUI;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class ProductoRecomendado implements Task {

    BanggoodUI banggoodUI = new BanggoodUI();


    @Override
    public <T extends Actor> void performAs(T actor) {

        try {
            Thread.sleep(5000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }

        actor.attemptsTo(
                ScrollinBajar.on(),
                Click.on(banggoodUI.BTN_PRODUCTO1),
                Click.on(banggoodUI.BTN_PRODUCTO2),
                Click.on(banggoodUI.BTN_ADDPRODUCTO),
                Click.on(banggoodUI.BTN_ADDPRODUCTO)

        );

    }
    public static Performable on(){
        return Instrumented.instanceOf(ProductoRecomendado.class).withProperties();
    }
}
