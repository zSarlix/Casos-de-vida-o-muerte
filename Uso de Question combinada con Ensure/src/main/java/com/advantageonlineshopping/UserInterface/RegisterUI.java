package com.advantageonlineshopping.UserInterface;


import net.serenitybdd.screenplay.targets.Target;

public class RegisterUI {

    //ACCOUNT DETAILS
    public static final Target TXT_USERNAME = Target.the("Username").locatedBy("//input[@name='usernameRegisterPage']");
    public static final Target TXT_EMAIL = Target.the("Email").locatedBy("//input[@name='emailRegisterPage']");
    public static final Target TXT_PASSWORD = Target.the("Password").locatedBy("//input[@name='passwordRegisterPage']");
    public static final Target TXT_COMFIRM_PASSWORD = Target.the("ConfirmPassword").locatedBy("//input[@name='confirm_passwordRegisterPage']");

    //PERSONAL DETAILS
    public static final Target TXT_FIRSTNAME = Target.the("FirstName").locatedBy("//input[@name='first_nameRegisterPage']");
    public static final Target TXT_LASTNAME = Target.the("Lastname").locatedBy("//input[@name='last_nameRegisterPage']");
    public static final Target TXT_PHONENUMBER = Target.the("PhoneNumber").locatedBy("//input[@name='phone_numberRegisterPage']");

    //ADDRESS
    public static final Target SELECT_COUNTRY = Target.the("Country").locatedBy("//option[@label='Colombia']");
    public static final Target TXT_CITY = Target.the("City").locatedBy("//input[@name='cityRegisterPage']");
    public static final Target TXT_ADDRESS = Target.the("Address").locatedBy("//input[@name='addressRegisterPage']");
    public static final Target TXT_ESTATE = Target.the("Estate").locatedBy("//input[@name='state_/_province_/_regionRegisterPage']");
    public static final Target TXT_POSTALCODE = Target.the("PostalCode").locatedBy("//input[@name='postal_codeRegisterPage']");
    public static final Target BUTTON_IAGREE = Target.the("IAgree").locatedBy("//input[@name='i_agree']");
    public static final Target BUTTON_REGISTER = Target.the("Register").locatedBy("//button[@id='register_btnundefined']");

    public static final Target LBL_USER_REGISTER = Target.the("Register_user").locatedBy("//a[@id='menuUserLink']");


}
