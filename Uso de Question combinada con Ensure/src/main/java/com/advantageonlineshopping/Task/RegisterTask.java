package com.advantageonlineshopping.Task;

import com.advantageonlineshopping.UserInterface.RegisterUI;
import com.advantageonlineshopping.interaction.MoveToElementInteraction;
import com.advantageonlineshopping.util.ExcelUtil;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.ArrayList;
import java.util.Map;

public class RegisterTask implements Task {

    private static ArrayList<Map<String, String>> leerExcel = new ArrayList<>();

    @Override
    public <T extends Actor> void performAs(T actor) {
        try {
            leerExcel = ExcelUtil.readExcel("datos_excel.xlsx", "RegisterInfo");
        } catch (Exception e) {
            e.printStackTrace();
        }

        actor.attemptsTo(
                //ACCOUNT DETAILS
                Enter.theValue(leerExcel.get(0).get("Username")).into(RegisterUI.TXT_USERNAME),
                Enter.theValue(leerExcel.get(0).get("Email")).into(RegisterUI.TXT_EMAIL),
                Enter.theValue(leerExcel.get(0).get("Password")).into(RegisterUI.TXT_PASSWORD),
                Enter.theValue(leerExcel.get(0).get("ConfirmPassword")).into(RegisterUI.TXT_COMFIRM_PASSWORD),

                MoveToElementInteraction.inMoveToElemente(RegisterUI.TXT_USERNAME, RegisterUI.TXT_PHONENUMBER),
                //PERSONAL DETAILS
                Enter.theValue(leerExcel.get(0).get("FirstName")).into(RegisterUI.TXT_FIRSTNAME),
                Enter.theValue(leerExcel.get(0).get("LastName")).into(RegisterUI.TXT_LASTNAME),
                Enter.theValue(leerExcel.get(0).get("PhoneNumber")).into(RegisterUI.TXT_PHONENUMBER),

                MoveToElementInteraction.inMoveToElemente(RegisterUI.TXT_CITY, RegisterUI.BUTTON_IAGREE),
                //ADDRESS
                Click.on(RegisterUI.SELECT_COUNTRY),
                Enter.theValue(leerExcel.get(0).get("City")).into(RegisterUI.TXT_CITY),
                Enter.theValue(leerExcel.get(0).get("Address")).into(RegisterUI.TXT_ADDRESS),
                Enter.theValue(leerExcel.get(0).get("State / Province / Region")).into(RegisterUI.TXT_ESTATE),
                Enter.theValue(leerExcel.get(0).get("PostalCode")).into(RegisterUI.TXT_POSTALCODE),

                //I AGREE AND REGISTER
                Click.on(RegisterUI.BUTTON_IAGREE),
                Click.on(RegisterUI.BUTTON_REGISTER)
        );

    }
    public static Performable inRegisterTask() {
        return Instrumented.instanceOf(RegisterTask.class).withProperties();
    }
}
