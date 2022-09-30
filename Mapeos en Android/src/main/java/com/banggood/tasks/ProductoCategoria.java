package com.banggood.tasks;

import com.banggood.userInterface.BanggoodUI;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class ProductoCategoria implements Task {

    BanggoodUI banggoodUI = new BanggoodUI();



    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(

                Click.on(banggoodUI.BTN_CATEGORY_PRODUCT),
                WaitUntil.the(banggoodUI.BTN_CATEGORY_SELECT_PRODUCT, isVisible()).forNoMoreThan(5).seconds(),
                Click.on(banggoodUI.BTN_CATEGORY_SELECT_PRODUCT),
                Click.on(banggoodUI.BTN_CATEGORY_ADD),
                Click.on(banggoodUI.BTN_ADDPRODUCTO)

        );

    }
    public static Performable on(){
        return Instrumented.instanceOf(ProductoCategoria.class).withProperties();
    }
}
