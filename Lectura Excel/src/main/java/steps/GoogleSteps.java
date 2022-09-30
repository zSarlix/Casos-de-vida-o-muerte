package steps;

import driver.Selenium;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import pageObjects.GooglePO;
import utils.Excel;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;

public class GoogleSteps {
    private static ArrayList<Map<String, String>> leerExcel = new ArrayList<Map<String,String>>();

    public void escribir(By elemento, String texto){
        Selenium.driver.findElement(elemento).sendKeys(texto, Keys.ENTER);
    }
    public void limpiar(By elemento){
        Selenium.driver.findElement(elemento).clear();
    }

    @Step
    public void buscar(){
        escribir(GooglePO.getTxtBarra(),"Partidos de futbol");
        limpiar(GooglePO.getTxtBarra());

        try {
            leerExcel = Excel.readExcel("TerminosBusqueda.xlsx","Hoja1");
        }catch (IOException e){
            e.printStackTrace();
        }
        for (int i = 0; i < leerExcel.size(); i++){
            escribir(GooglePO.getTxtBarra(),leerExcel.get(i).get("Termino"));
            limpiar(GooglePO.getTxtBarra());
        }



    }
}
