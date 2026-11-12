/*
 * Decompiled with CFR 0.152.
 */
package net.optifine;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Properties;
import java.util.Random;
import net.minecraft.src.a;
import net.minecraft.util.cm;
import net.optifine.ak;
import net.optifine.util.af;
import net.optifine.util.z;

public class aj {
    private static ak ebu = null;
    private static final Random ebv = new Random();

    public static ak aAS() {
        return ebu;
    }

    public static void jA() {
        ebu = null;
        String[] stringArray = aj.aAT();
        if (stringArray.length > 1) {
            ak ak2;
            Properties[] propertiesArray = aj.m(stringArray);
            int[] nArray = aj.a(propertiesArray);
            int n2 = aj.r(nArray);
            String string = stringArray[n2];
            Properties properties = propertiesArray[n2];
            if (properties == null) {
                properties = propertiesArray[0];
            }
            if (properties == null) {
                properties = new af();
            }
            ebu = ak2 = new ak(string, properties);
        }
    }

    private static String[] aAT() {
        ArrayList<Object> arrayList = new ArrayList<Object>();
        arrayList.add("textures/gui/title/background");
        for (int i2 = 0; i2 < 100; ++i2) {
            String string = "optifine/gui/background" + i2;
            String string2 = string + "/panorama_0.png";
            cm cm2 = new cm(string2);
            if (!a.F(cm2)) continue;
            arrayList.add(string);
        }
        String[] stringArray = arrayList.toArray(new String[arrayList.size()]);
        return stringArray;
    }

    private static Properties[] m(String[] stringArray) {
        Properties[] propertiesArray = new Properties[stringArray.length];
        for (int i2 = 0; i2 < stringArray.length; ++i2) {
            String string = stringArray[i2];
            if (i2 == 0) {
                string = "optifine/gui";
            } else {
                a.fN("CustomPanorama: " + string);
            }
            cm cm2 = new cm(string + "/background.properties");
            try {
                InputStream inputStream = a.u(cm2);
                if (inputStream == null) continue;
                af af2 = new af();
                af2.load(inputStream);
                a.fN("CustomPanorama: " + cm2.atA());
                propertiesArray[i2] = af2;
                inputStream.close();
                continue;
            }
            catch (IOException iOException) {
                // empty catch block
            }
        }
        return propertiesArray;
    }

    private static int[] a(Properties[] propertiesArray) {
        int[] nArray = new int[propertiesArray.length];
        for (int i2 = 0; i2 < nArray.length; ++i2) {
            Properties properties = propertiesArray[i2];
            if (properties == null) {
                properties = propertiesArray[0];
            }
            if (properties == null) {
                nArray[i2] = 1;
                continue;
            }
            String string = properties.getProperty("weight", null);
            nArray[i2] = a.x(string, 1);
        }
        return nArray;
    }

    private static int r(int[] nArray) {
        int n2 = z.v(nArray);
        int n3 = ebv.nextInt(n2);
        int n4 = 0;
        for (int i2 = 0; i2 < nArray.length; ++i2) {
            if ((n4 += nArray[i2]) <= n3) continue;
            return i2;
        }
        return nArray.length - 1;
    }
}

