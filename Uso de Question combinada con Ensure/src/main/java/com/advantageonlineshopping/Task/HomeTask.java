package com.advantageonlineshopping.Task;

import com.advantageonlineshopping.UserInterface.HomeUI;
import com.advantageonlineshopping.interaction.CreateUserInteraction;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;


public class HomeTask implements Task {

    public static final String CREATE_NEW_ACCOUNT = "CREATE NEW ACCOUNT";

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(HomeUI.BTN_USER),
                CreateUserInteraction.inCreateUserInteraction(HomeUI.BTN_REGISTER_USER, CREATE_NEW_ACCOUNT)
        );
    }

    public static Performable inHomeTask() {
        return Instrumented.instanceOf(HomeTask.class).withProperties();
    }
}