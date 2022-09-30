package pageObjects;

import org.openqa.selenium.By;

public class GooglePO {

    //Xpath relativo
    private static By txtBarra = By.xpath("//input[@class='gLFyf gsfi']");

    //Xpath absoluto
    private static By txtBarraAbolsuta = By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input");

    private static By txtBarraId = By.id("");
    private static By txtBarraClass = By.className("");

    public static By getTxtBarra() {
        return txtBarra;
    }

    public static By getTxtBarraAbolsuta() {
        return txtBarraAbolsuta;
    }
}
