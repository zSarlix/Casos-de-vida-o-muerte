package com.google.gm.userInterface;

import net.serenitybdd.screenplay.targets.Target;

public class GmUI {
    public static final Target BTN_REU = Target.the("Boton que abre la seccion de videollamadas").locatedBy("//android.widget.FrameLayout[@content-desc=\"Reunirse\"]/android.widget.FrameLayout/android.widget.ImageView");
    public static final Target BTN_MENU = Target.the("Boton que abre el menu lateral").locatedBy("//android.widget.ImageButton[@content-desc=\"Menú de navegación\"]");
    public static final Target BTN_CONFIG = Target.the("Boton que abre el apartado de configuraciones").locatedBy("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.FrameLayout[2]/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.support.v7.widget.RecyclerView/android.view.ViewGroup[8]/android.widget.ImageView");
    public static final Target BTN_CONFIG_GRAL = Target.the("Boton que abre la configuracion general de la app").locatedBy("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ListView/android.widget.LinearLayout[1]/android.widget.TextView");
    public static final Target BTN_ACCION_DESLIZAR = Target.the("Boton que abre la configuracion de gestos al deslizar un mail").locatedBy("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[5]/android.widget.RelativeLayout/android.widget.TextView[1]");
    public static final Target BTN_DESLIZAR_DERECHA = Target.the("Boton que cambia la configuracion del gesto deslizar hacia la derecha").locatedBy("//android.widget.LinearLayout[@content-desc=\"Deslizar a la der., Archivar, , cambiar, botón\"]/android.widget.LinearLayout/android.widget.TextView");
    public static final Target BTN_MARCAR_LEIDO = Target.the("Boton para seleccionar la opción marcar como leido en la configuracion del gesto deslizar hacia la derecha").locatedBy("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[3]");





}
