package com.advantageonlineshopping.question;

import com.advantageonlineshopping.UserInterface.RegisterUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class RegisterValidationQuestion implements Question {

    @Override
    public Boolean answeredBy(Actor actor) {
        return RegisterUI.LBL_USER_REGISTER.resolveFor(actor).isVisible();
    }

    public static Question validar(){
        return new RegisterValidationQuestion();
    }
}
