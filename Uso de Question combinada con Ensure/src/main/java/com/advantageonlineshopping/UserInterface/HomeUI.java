package com.advantageonlineshopping.UserInterface;

import net.serenitybdd.screenplay.targets.Target;

public class HomeUI {

    public static final Target BTN_USER =Target.the("USER").locatedBy("//a[@id='hrefUserIcon']");
    public static final Target BTN_REGISTER_USER =Target.the("REGISTER_USER").locatedBy("//a[contains(@translate,'CREATE_NEW_ACCOUNT')]");
}
