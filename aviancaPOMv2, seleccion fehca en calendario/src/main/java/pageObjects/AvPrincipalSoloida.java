package pageObjects;

import org.openqa.selenium.By;


public class AvPrincipalSoloida {
    private static By txtDesde_SoloIda = By.xpath("//div[contains(@id,'ida_1')]//input[contains(@id,'pbOrigen')]");
    private static By txtHacia_SoloIda = By.xpath("//div[contains(@id,'ida_1')]//input[contains(@id,'pbDestino')]");
    private static By ddlPasajero_SoloIda = By.xpath("//div[contains(@id,'ida_1')]//input[contains(@id,'pbPasajeros')]");
    private static By btnBuscarVuelo_SoloIda = By.xpath("//div[contains(@id,'ida_1')]//button[contains(text(),'Buscar vuelos')]");
    private static By btnPjrAdulto_SoloIda = By.xpath("//div[contains(@id,'ida_1')]//div[contains(@class,'controls')]//div[contains(@class,'plus') and @data-property='adults']");
    private static By btnPjrNino_SoloIda = By.xpath("//div[contains(@id,'ida_1')]//div[contains(@class,'controls')]//div[contains(@class,'plus') and @data-property='child']");
    private static By btnPjrBebe_SoloIda = By.xpath("//div[contains(@id,'ida_1')]//div[contains(@class,'controls')]//div[contains(@class,'plus') and @data-property='infant']");
    private static By fechaIda_SoloIda = By.xpath("//div[contains(@id,'ida_1')]//input[contains(@id,'pbFechaIda_2') and @type='text']");
    private static By btnContinuarPjr_SoloIda = By.xpath("//div[contains(@id,'ida_1')]//button[@class='btn btn-secondary secondary close-me hidden-xs']");
    private static By selecFecha_SoloIda;

    public static By getTxtDesde_SoloIda() {
        return txtDesde_SoloIda;
    }
    public static By getTxtHacia_SoloIda() {
        return txtHacia_SoloIda;
    }
    public static By getDdlPasajero_SoloIda() {
        return ddlPasajero_SoloIda;
    }
    public static By getBtnBuscarVuelo_SoloIda() {
        return btnBuscarVuelo_SoloIda;
    }
    public static By getBtnPjrAdulto_SoloIda() {
        return btnPjrAdulto_SoloIda;
    }
    public static By getBtnPjrNino_SoloIda() {
        return btnPjrNino_SoloIda;
    }
    public static By getBtnPjrBebe_SoloIda() {
        return btnPjrBebe_SoloIda;
    }
    public static By getFechaIda_SoloIda() {
        return fechaIda_SoloIda;
    }
    public static By getBtnContinuarPjr_SoloIda() {
        return btnContinuarPjr_SoloIda;
    }
    public static By getSelecFecha_SoloIda() {
        return selecFecha_SoloIda;
    }

    public static void setSelecFecha_SoloIda(String dia, String mes, String year) {
        AvPrincipalSoloida.selecFecha_SoloIda = By.xpath("//div[contains(@id,'ida_regreso_1')]//div[contains(@data-month,'"+ year + "."+ mes +"')]//div[@class='month']//div[text()='"+ dia +"']");
        System.out.println("//div[contains(@id,'ida_1')]//div[contains(@data-month,'"+ year +"."+ mes +"')]//div[@class='month']//div[text()='"+ dia +"']");
    }
}
