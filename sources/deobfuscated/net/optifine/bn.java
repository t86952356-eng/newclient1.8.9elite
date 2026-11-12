/*
 * Decompiled with CFR 0.152.
 */
package net.optifine;

import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import net.minecraft.client.b;
import net.minecraft.src.a;

public class bn
extends Thread {
    public bn() {
        super("VersionCheck");
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void run() {
        HttpURLConnection httpURLConnection = null;
        try {
            a.fN("Checking for new version");
            URL uRL = new URL("http://optifine.net/version/1.8.9/HD_U.txt");
            httpURLConnection = (HttpURLConnection)uRL.openConnection();
            if (a.aoH().cgE) {
                httpURLConnection.setRequestProperty("OF-MC-Version", "1.8.9");
                httpURLConnection.setRequestProperty("OF-MC-Brand", b.An());
                httpURLConnection.setRequestProperty("OF-Edition", "HD_U");
                httpURLConnection.setRequestProperty("OF-Release", "L5");
                httpURLConnection.setRequestProperty("OF-Java-Version", System.getProperty("java.version"));
                httpURLConnection.setRequestProperty("OF-CpuCount", "" + a.aoJ());
                httpURLConnection.setRequestProperty("OF-OpenGL-Version", a.dnS);
                httpURLConnection.setRequestProperty("OF-OpenGL-Vendor", a.dnU);
            }
            httpURLConnection.setDoInput(true);
            httpURLConnection.setDoOutput(false);
            httpURLConnection.connect();
            try {
                InputStream inputStream = httpURLConnection.getInputStream();
                String string = a.h(inputStream);
                inputStream.close();
                String[] stringArray = a.V(string, "\n\r");
                if (stringArray.length >= 1) {
                    String string2 = stringArray[0].trim();
                    a.fN("Version found: " + string2);
                    if (a.W(string2, "L5") <= 0) {
                        return;
                    }
                    a.fQ(string2);
                    return;
                }
            }
            finally {
                if (httpURLConnection != null) {
                    httpURLConnection.disconnect();
                }
            }
        }
        catch (Exception exception) {
            a.fN(exception.getClass().getName() + ": " + exception.getMessage());
        }
    }
}

