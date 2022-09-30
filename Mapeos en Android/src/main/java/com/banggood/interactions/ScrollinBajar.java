package com.banggood.interactions;

import io.appium.java_client.MobileBy;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;

import static com.banggood.driver.AppiumAndroidDriver.driver;

public class ScrollinBajar implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor) {

        driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(1)"));

    }
    public static Performable on(){
        return Instrumented.instanceOf(ScrollinBajar.class).withProperties();
    }
}
