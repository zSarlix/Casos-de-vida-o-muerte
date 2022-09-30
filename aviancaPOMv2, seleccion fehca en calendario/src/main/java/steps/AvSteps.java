package steps;

import driver.SeleniumWebDriver;
import org.openqa.selenium.By;

import java.io.IOException;
import java.util.*;
import java.util.concurrent.TimeUnit;

import pageObjects.AvPrincipalAmbos;
import pageObjects.AvPrincipalIdayVuelta;
import pageObjects.AvPrincipalSoloida;
import pageObjects.AvVuelos;
import utils.AvExcel;

import static org.junit.Assert.assertEquals;

public class AvSteps {
    private static ArrayList<Map<String, String>> lecturaExcel = new ArrayList<Map<String,String>>();
    private static String escrituraLog = "";
    private static String defaultContent;

    public void escrituraTexto(By elemento, String texto) {
        SeleniumWebDriver.driver.findElement(elemento).sendKeys(texto);
    }
    public void seleccionClick(By elemento) {
        SeleniumWebDriver.driver.findElement(elemento).click();
    }
    public String extraerTexto(By elemento) {
        String texto = "";
        texto = SeleniumWebDriver.driver.findElement(elemento).getText();
        return texto;
    }
    public void validadorTexto(By elemento, String texto) {
        boolean validar = false;
        if(extraerTexto(elemento).contains(texto)) {
            validar = true;
        }
        assertEquals(true, validar);
    }

    public void vueloIdaYVuelta(int index) {
        escrituraLog = escrituraLog + "\n";
        escrituraLog = escrituraLog + "\n";
        escrituraLog = escrituraLog + ">>>>>>>>>>>>>>>>>>>" + "\n";
        AvExcel.escribirLog(escrituraLog);
        AvPrincipalAmbos.setBtnOpcionVuelo(lecturaExcel.get(index).get("Opcion"));
        seleccionClick(AvPrincipalAmbos.getBtnOpcionVuelo());
        escrituraLog = escrituraLog + ">>>El vuelo es de tipo: " + lecturaExcel.get(index).get("Opcion")+ "\n";
        AvExcel.escribirLog(escrituraLog);
        seleccionClick(AvPrincipalIdayVuelta.getTxtDesde_IdaYVuelta());
        escrituraTexto(AvPrincipalIdayVuelta.getTxtDesde_IdaYVuelta(), lecturaExcel.get(index).get("Desde"));
        seleccionClick(AvPrincipalAmbos.getBtnCiudad_Desde());
        escrituraLog = escrituraLog + ">>>El origen del vuelo es: " + lecturaExcel.get(index).get("Desde")+ "\n";
        AvExcel.escribirLog(escrituraLog);
        seleccionClick(AvPrincipalIdayVuelta.getTxtHacia_IdaYVuelta());
        escrituraTexto(AvPrincipalIdayVuelta.getTxtHacia_IdaYVuelta(), lecturaExcel.get(index).get("Hacia"));
        seleccionClick(AvPrincipalAmbos.getBtnCiudad_Hacia());
        escrituraLog = escrituraLog + ">>>El destino del vuelo es: " + lecturaExcel.get(index).get("Hacia")+ "\n";
        AvExcel.escribirLog(escrituraLog);
        seleccionClick(AvPrincipalIdayVuelta.getFechaIda_IdaYVuelta());

        AvPrincipalIdayVuelta.setSelecFecha_IdaYVuelta(lecturaExcel.get(index).get("FechaIda").split("-")[0].replaceAll("01",
                "1").replaceAll("02", "2").replaceAll("03",
                "3").replaceAll("04", "4").replaceAll("05",
                "5").replaceAll("06", "6").replaceAll("07",
                "7").replaceAll("08", "8").replaceAll("09", "9"),
                lecturaExcel.get(index).get("FechaIda").split("-")[1].replaceAll("01", "1").replaceAll("02",
                        "2").replaceAll("03", "3").replaceAll("04",
                        "4").replaceAll("05", "5").replaceAll("06",
                        "6").replaceAll("07", "7").replaceAll("08",
                        "8").replaceAll("09", "9"), lecturaExcel.get(index).get("FechaIda").split("-")[2]);

        seleccionClick(AvPrincipalIdayVuelta.getSelecFecha_IdaYVuelta());
        escrituraLog = escrituraLog + ">>>La fecha de ida del vuelo es: " + lecturaExcel.get(index).get("FechaIda")+ "\n";
        AvExcel.escribirLog(escrituraLog);
        seleccionClick(AvPrincipalIdayVuelta.getFechaVuelta_IdaYVuelta());

        AvPrincipalIdayVuelta.setSelecFecha_IdaYVuelta(lecturaExcel.get(index).get("FechaVuelta").split("-")[0].replaceAll("01",
                "1").replaceAll("02", "2").replaceAll("03",
                "3").replaceAll("04", "4").replaceAll("05",
                "5").replaceAll("06", "6").replaceAll("07",
                "7").replaceAll("08", "8").replaceAll("09", "9"),
                lecturaExcel.get(index).get("FechaVuelta").split("-")[1].replaceAll("01", "1").replaceAll("02",
                        "2").replaceAll("03", "3").replaceAll("04",
                        "4").replaceAll("05", "5").replaceAll("06",
                        "6").replaceAll("07", "7").replaceAll("08",
                        "8").replaceAll("09", "9"), lecturaExcel.get(index).get("FechaVuelta").split("-")[2]);

        seleccionClick(AvPrincipalIdayVuelta.getSelecFecha_IdaYVuelta());
        escrituraLog = escrituraLog + ">>>La fecha de vuelta del vuelo es: " + lecturaExcel.get(index).get("FechaVuelta")+ "\n";
        AvExcel.escribirLog(escrituraLog);
        seleccionClick(AvPrincipalIdayVuelta.getDdlPasajero_IdaYVuelta());

        for (int i = 0; i < Integer.valueOf(lecturaExcel.get(index).get("Pasajero_niño")); i++) {
            seleccionClick(AvPrincipalIdayVuelta.getBtnPjrNino_IdaYVuelta());
        }

        for (int i = 0; i < Integer.valueOf(lecturaExcel.get(index).get("Pasajero_adulto")); i++) {
            if(Integer.valueOf(lecturaExcel.get(index).get("Pasajero_adulto"))>1) {
                seleccionClick(AvPrincipalIdayVuelta.getBtnPjrAdulto_IdaYVuelta());
            }
        }

        for (int i = 0; i < Integer.valueOf(lecturaExcel.get(index).get("Pasajero_bebe")); i++) {
            seleccionClick(AvPrincipalIdayVuelta.getBtnPjrBebe_IdaYVuelta());
        }
        seleccionClick(AvPrincipalIdayVuelta.getBtnContinuarPjr_IdaYVuelta());
        seleccionClick(AvPrincipalIdayVuelta.getBtnBuscarVuelo_IdaYVuelta());
        vuelo();
        seleccionClick(AvVuelos.getBtnHome());
    }
    public void vueloSoloIda(int index) {
        escrituraLog = escrituraLog + "\n";
        escrituraLog = escrituraLog + "\n";
        escrituraLog = escrituraLog + ">>>>>>>>>>>>>>>>>>>" + "\n" ;
        AvPrincipalAmbos.setBtnOpcionVuelo(lecturaExcel.get(index).get("Opcion"));
        seleccionClick(AvPrincipalAmbos.getBtnOpcionVuelo());
        escrituraLog = escrituraLog + ">>>El vuelo es de tipo: " + lecturaExcel.get(index).get("Opcion")+ "\n";
        AvExcel.escribirLog(escrituraLog);
        seleccionClick(AvPrincipalSoloida.getTxtDesde_SoloIda());
        escrituraTexto(AvPrincipalSoloida.getTxtDesde_SoloIda(), lecturaExcel.get(index).get("Desde"));
        seleccionClick(AvPrincipalAmbos.getBtnCiudad_Desde());
        escrituraLog = escrituraLog + ">>>El origen del vuelo es: " + lecturaExcel.get(index).get("Desde")+ "\n";
        AvExcel.escribirLog(escrituraLog);
        seleccionClick(AvPrincipalSoloida.getTxtHacia_SoloIda());
        escrituraTexto(AvPrincipalSoloida.getTxtHacia_SoloIda(), lecturaExcel.get(index).get("Hacia"));
        seleccionClick(AvPrincipalAmbos.getBtnCiudad_Desde());
        escrituraLog = escrituraLog + ">>>El destino del vuelo es: " + lecturaExcel.get(index).get("Hacia")+ "\n";
        AvExcel.escribirLog(escrituraLog);
        seleccionClick(AvPrincipalSoloida.getFechaIda_SoloIda());
        AvPrincipalSoloida.setSelecFecha_SoloIda(lecturaExcel.get(index).get("FechaIda").split("-")[0].replaceAll("01",
                "1").replaceAll("02", "2").replaceAll("03", "3").replaceAll("04",
                "4").replaceAll("05", "5").replaceAll("06", "6").replaceAll("07",
                "7").replaceAll("08", "8").replaceAll("09", "9"),
                lecturaExcel.get(index).get("FechaIda").split("-")[1].replaceAll("01", "1").replaceAll("02",
                        "2").replaceAll("03", "3").replaceAll("04",
                        "4").replaceAll("05", "5").replaceAll("06",
                        "6").replaceAll("07", "7").replaceAll("08",
                        "8").replaceAll("09", "9"), lecturaExcel.get(index).get("FechaIda").split("-")[2]);
        seleccionClick(AvPrincipalSoloida.getSelecFecha_SoloIda());
        escrituraLog = escrituraLog + ">>>La fecha de ida del vuelo es: " + lecturaExcel.get(index).get("FechaIda")+ "\n";
        AvExcel.escribirLog(escrituraLog);
        seleccionClick(AvPrincipalSoloida.getDdlPasajero_SoloIda());

        for (int i = 0; i < Integer.valueOf(lecturaExcel.get(index).get("Pasajero_niño")); i++) {
            seleccionClick(AvPrincipalSoloida.getBtnPjrNino_SoloIda());
        }

        for (int i = 0; i < Integer.valueOf(lecturaExcel.get(index).get("Pasajero_adulto")); i++) {
            if(Integer.valueOf(lecturaExcel.get(index).get("Pasajero_adulto"))>1) {
                seleccionClick(AvPrincipalSoloida.getBtnPjrAdulto_SoloIda());
            }
        }

        for (int i = 0; i < Integer.valueOf(lecturaExcel.get(index).get("Pasajero_bebe")); i++) {
            seleccionClick(AvPrincipalSoloida.getBtnPjrBebe_SoloIda());
        }
        seleccionClick(AvPrincipalSoloida.getBtnContinuarPjr_SoloIda());
        seleccionClick(AvPrincipalSoloida.getBtnBuscarVuelo_SoloIda());
        vuelo();
        seleccionClick(AvVuelos.getBtnHome());
    }
    public void vueloExcel() {
        try {
            lecturaExcel = AvExcel.readExcel("Avianca.xlsx", "Hoja1");
        } catch (IOException e) {
            e.printStackTrace();
        }

        for (int i = 0; i < lecturaExcel.size(); i++) {
            System.out.println(lecturaExcel.get(i).get("Opcion"));
            switch (lecturaExcel.get(i).get("Opcion")) {
                case "Ida y vuelta":
                    vueloIdaYVuelta(i);
                    break;
                case "Solo ida":
                    vueloSoloIda(i);
                    break;
            }
        }
    }
    public void vuelo() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        SeleniumWebDriver.driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        SeleniumWebDriver.driver.findElements(AvVuelos.getBtnSegundoVuelo()).get(2).click();
        Random random = new Random();
        int numeroAleatorio = random.nextInt(SeleniumWebDriver.driver.findElements(AvVuelos.getLblEscogerPrecio()).size());
        escrituraLog = escrituraLog + ">>>Se selecciono la categoria " + SeleniumWebDriver.driver.findElements(AvVuelos.getLblEscogerPrecio()).get(numeroAleatorio).getText() + " del vuelo"+ "\n";
        AvExcel.escribirLog(escrituraLog);
        SeleniumWebDriver.driver.findElements(AvVuelos.getBtnEscogerPrecio()).get(numeroAleatorio).click();
        cerrarPopup();
    }
    public void cerrarPopup() {
        defaultContent = SeleniumWebDriver.driver.getWindowHandle();
        Set<String> lista = SeleniumWebDriver.driver.getWindowHandles();
        Iterator<String> Il = lista.iterator();
        while(Il.hasNext()) {
            String child_windows = Il.next();
            if (!defaultContent.equals(child_windows)) {
                SeleniumWebDriver.driver.switchTo().window(child_windows);
            }
        }
        try {
            SeleniumWebDriver.driver.findElement(AvVuelos.getBtnCerrarPopup()).click();
        } catch (Exception e) {

        }
        SeleniumWebDriver.driver.switchTo().window(defaultContent);
    }
}