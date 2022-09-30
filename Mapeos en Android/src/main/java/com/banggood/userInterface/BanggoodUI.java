package com.banggood.userInterface;

import net.serenitybdd.screenplay.targets.Target;

public class BanggoodUI {

    public final Target BTN_PRODUCTO1 = Target.the("Localizar el primer producto recomendado").locatedBy("(//*[@class='android.view.View'])[3]");
    public final Target BTN_PRODUCTO2 = Target.the("Localizar el segundo producto recomendado").locatedBy("(//*[@class='android.view.View'])[15]");
    public final Target BTN_ADDPRODUCTO = Target.the("Oprimir añadir al carrito").locatedBy("(//*[@class='android.widget.Button'])");
    public final Target BTN_BACKHOME = Target.the("Volver al home").locatedBy("(//*[@class='android.widget.ImageButton'])");
    public final Target BTN_CATEGORY = Target.the("Ir a categorias").locatedBy("(//*[@class='android.view.ViewGroup'])[22]");
    public final Target BTN_CATEGORY_FAVORITE = Target.the("Ir a categoria favorita").locatedBy("(//*[@class='android.widget.LinearLayout'])[11]");
    public final Target BTN_CATEGORY_PRODUCT = Target.the("Ir a elegir producto de la categoria").locatedBy("(//*[@class='android.widget.ImageView'])[15]");
    public final Target BTN_CATEGORY_SELECT_PRODUCT = Target.the("Seleccionar el producto de la categoria").locatedBy("(//*[@class='android.widget.ImageView'])[5]");
    public final Target BTN_CATEGORY_ADD = Target.the("Añadirlo al carrito").locatedBy("(//*[@class='android.widget.Button'])[2]");
    public final Target BTN_HOME = Target.the("Va al Home").locatedBy("(//*[@class='android.view.ViewGroup'])[2]");
    public final Target TXT_BUSCAR = Target.the("Hace click en la barra de busqueda").locatedBy("(//*[@class='android.widget.TextView'])[1]");
    public final Target TXT_BUSCAR2 = Target.the("Escribe en la abrra de busqueda").locatedBy("(//*[@class='android.widget.EditText'])");
    public final Target BTN_BUSCAR = Target.the("Busca en la barra de busqueda").locatedBy("(//*[@class='android.widget.TextView'])[3]");
    public final Target BTN_PRODUCTO_BUSCAR = Target.the("Elige el producto que bsucamos").locatedBy("(//*[@class='android.widget.ImageView'])[5]");
    public final Target BTN_CARRITO = Target.the("Vamos al carrito").locatedBy("(//*[@class='android.view.ViewGroup'])[21]");
    public final Target BTN_BORRAR = Target.the("Borramos el carrito").locatedBy("(//*[@class='android.widget.ImageButton'])[2]");
    public final Target BTN_BORRAR_CONFIRMATION = Target.the("Confirmamos la borrada del carrito").locatedBy("(//*[@class='android.widget.Button'])[2]");


}
