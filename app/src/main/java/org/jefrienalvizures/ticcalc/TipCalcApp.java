package org.jefrienalvizures.ticcalc;

import android.app.Application;

/**
 * Created by Jefrien Alvizures on 13/06/2016.
 */
public class TipCalcApp extends Application {
    private final static String ABOUT_URL = "http://m.facebook.com/armando1262013";

    public String getAboutUrl() {
        return ABOUT_URL;
    }
}
