package com.banggood.tasks;


import com.banggood.userInterface.BanggoodUI;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class Categorias implements Task {
    BanggoodUI banggoodUI = new BanggoodUI();


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(

                Click.on(banggoodUI.BTN_BACKHOME),
                Click.on(banggoodUI.BTN_BACKHOME),
                Click.on(banggoodUI.BTN_CATEGORY),
                Click.on(banggoodUI.BTN_CATEGORY_FAVORITE)

        );
    }
    public static Performable on(){
        return Instrumented.instanceOf(Categorias.class).withProperties();
    }
}
