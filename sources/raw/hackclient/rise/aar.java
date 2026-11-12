/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.aam;
import hackclient.rise.aan;

public final class aar
extends aam {
    public aar() {
        super(aan.axz, false);
    }

    @Override
    public boolean on() {
        System.setProperty("http.ProxyHost", "");
        System.setProperty("https.ProxyHost", "");
        System.setProperty("http.ProxyPort", "");
        System.setProperty("https.ProxyPort", "");
        return false;
    }
}

