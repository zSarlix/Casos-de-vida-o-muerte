package pageObjects;

import org.openqa.selenium.By;

public class AvPrincipalAmbos {
    private static By btnCiudad_Desde = By.xpath("//div[contains(@data-source,'origin')]//ul[@role='list']//li");
    private static By btnCiudad_Hacia = By.xpath("");
    //div[contains(@data-source,'destination')]//ul[@role='list']//li
    private static By btnOpcionVuelo = By.xpath("//a[contains(text(),'Solo ida')]");

    public static By getBtnCiudad_Desde() {
        return btnCiudad_Desde;
    }
    public static By getBtnCiudad_Hacia() {
        return btnCiudad_Hacia;
    }
    public static By getBtnOpcionVuelo() {
        return btnOpcionVuelo;
    }

    public static void setBtnOpcionVuelo(String OpcionVuelo) {
        AvPrincipalAmbos.btnOpcionVuelo = By.xpath("//a[contains(text(),'"+OpcionVuelo+"')]");
    }
}
