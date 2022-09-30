package pageObjects;

import org.openqa.selenium.By;

public class AvVuelos {
    private static By btnSegundoVuelo = By.xpath("//button[@class='select-cabin-button']");
    private static By lblEscogerPrecio = By.xpath("//span[@class='ff-name ff-name-branded-fare']");
    private static By btnEscogerPrecio = By.xpath("//button[@class='ff-price-container']");
    private static By btnHome = By.xpath("//img[@alt='Avianca logo']//ancestor::a");
    private static By btnCerrarPopup = By.xpath("//button[@aria-label='Cerrar ventana']");

    public static By getBtnSegundoVuelo() {
        return btnSegundoVuelo;
    }
    public static By getLblEscogerPrecio() {
        return lblEscogerPrecio;
    }
    public static By getBtnEscogerPrecio() {
        return btnEscogerPrecio;
    }
    public static By getBtnHome() {
        return btnHome;
    }
    public static By getBtnCerrarPopup() {
        return btnCerrarPopup;
    }
}
