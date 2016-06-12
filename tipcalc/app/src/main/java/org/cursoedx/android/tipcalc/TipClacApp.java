package org.cursoedx.android.tipcalc;

import android.app.Application;

/**
 * Created by TrexT on 12/06/2016.
 */
public class TipClacApp extends Application {
    private final static String ABOUT_URL = "https://about.me/";

    public String getAboutUrl() {
        return ABOUT_URL;
    }
}
