package pageObjects;

import org.openqa.selenium.By;

public class AvPrincipalIdayVuelta {

    private static By txtDesde_IdaYVuelta = By.xpath("//div[contains(@id,'ida_regreso_1')]//input[contains(@id,'pbOrigen')]");
    private static By txtHacia_IdaYVuelta = By.xpath("//div[contains(@id,'ida_regreso_1')]//input[contains(@id,'pbDestino')]");
    private static By ddlPasajero_IdaYVuelta = By.xpath("//div[contains(@id,'ida_regreso_1')]//input[contains(@id,'pbPasajeros')]");
    private static By btnBuscarVuelo_IdaYVuelta = By.xpath("//div[contains(@id,'ida_regreso_1')]//button[contains(text(),'Buscar vuelos')]");
    private static By btnPjrAdulto_IdaYVuelta = By.xpath("//div[contains(@id,'ida_regreso_1')]//div[contains(@class,'controls')]//div[contains(@class,'plus') and @data-property='adults']");
    private static By btnPjrNino_IdaYVuelta = By.xpath("//div[contains(@id,'ida_regreso_1')]//div[contains(@class,'controls')]//div[contains(@class,'plus') and @data-property='child']");
    private static By btnPjrBebe_IdaYVuelta = By.xpath("//div[contains(@id,'ida_regreso_1')]//div[contains(@class,'controls')]//div[contains(@class,'plus') and @data-property='infant']");
    private static By fechaIda_IdaYVuelta = By.xpath("//div[contains(@id,'ida_regreso_1')]//input[contains(@id,'pbFechas_1')]");
    private static By fechaVuelta_IdaYVuelta = By.xpath("//div[contains(@id,'ida_regreso_1')]//input[contains(@id,'pbFechas_2')]");
    private static By btnContinuarPjr_IdaYVuelta = By.xpath("//div[contains(@id,'ida_regreso_1')]//button[@class='btn btn-secondary secondary close-me hidden-xs']");
    private static By selecFecha_IdaYVuelta;

    public static By getTxtDesde_IdaYVuelta() {
        return txtDesde_IdaYVuelta;
    }
    public static By getTxtHacia_IdaYVuelta() {
        return txtHacia_IdaYVuelta;
    }
    public static By getDdlPasajero_IdaYVuelta() {
        return ddlPasajero_IdaYVuelta;
    }
    public static By getBtnBuscarVuelo_IdaYVuelta() {
        return btnBuscarVuelo_IdaYVuelta;
    }
    public static By getBtnPjrAdulto_IdaYVuelta() {
        return btnPjrAdulto_IdaYVuelta;
    }
    public static By getBtnPjrNino_IdaYVuelta() {
        return btnPjrNino_IdaYVuelta;
    }
    public static By getBtnPjrBebe_IdaYVuelta() {
        return btnPjrBebe_IdaYVuelta;
    }
    public static By getFechaIda_IdaYVuelta() {
        return fechaIda_IdaYVuelta;
    }
    public static By getFechaVuelta_IdaYVuelta() {
        return fechaVuelta_IdaYVuelta;
    }
    public static By getBtnContinuarPjr_IdaYVuelta() {
        return btnContinuarPjr_IdaYVuelta;
    }
    public static By getSelecFecha_IdaYVuelta() {
        return selecFecha_IdaYVuelta;
    }

    public static void setSelecFecha_IdaYVuelta(String dia, String mes, String year) {
        AvPrincipalIdayVuelta.selecFecha_IdaYVuelta = By.xpath("//div[contains(@id,'ida_regreso_1')]//div[contains(@data-month,'"+year+"."+mes+"')]//div[@class='month']//div[text()='"+dia+"']");
        System.out.println("//div[contains(@id,'ida_regreso_1')]//div[contains(@data-month,'"+year+"."+mes+"')]//div[@class='month']//div[text()='"+dia+"']");
                            //div[contains(@id,'ida_regreso_1')]//div[@data-month='"+year+"."+mes+"']//div[text()='"+dia+"']
    }
}