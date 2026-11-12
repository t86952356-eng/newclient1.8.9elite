/*
 * Decompiled with CFR 0.152.
 */
package net.optifine.util;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import net.minecraft.src.a;
import net.minecraft.util.cm;
import net.optifine.util.af;

public class l {
    public static Properties Q(cm cm2) {
        String string = cm2.atA();
        af af2 = new af();
        String string2 = ".png";
        if (!string.endsWith(".png")) {
            return af2;
        }
        String string3 = string.substring(0, string.length() - ".png".length()) + ".properties";
        try {
            cm cm3 = new cm(cm2.atB(), string3);
            InputStream inputStream = a.d(a.Br(), cm3);
            if (inputStream == null) {
                return af2;
            }
            a.fO("Loading " + string3);
            af2.load(inputStream);
        }
        catch (FileNotFoundException fileNotFoundException) {
        }
        catch (IOException iOException) {
            iOException.printStackTrace();
        }
        return af2;
    }

    public static void a(Properties properties, float[] fArray) {
        for (Object object : properties.keySet()) {
            String string;
            float f2;
            String string2;
            int n2;
            String string3 = (String)object;
            String string4 = "width.";
            if (!string3.startsWith("width.") || (n2 = a.x(string2 = string3.substring("width.".length()), -1)) < 0 || n2 >= fArray.length || !((f2 = a.b(string = properties.getProperty(string3), -1.0f)) >= 0.0f)) continue;
            fArray[n2] = f2;
        }
    }

    public static float a(Properties properties, String string, float f2) {
        String string2 = properties.getProperty(string);
        if (string2 == null) {
            return f2;
        }
        float f3 = a.b(string2, Float.MIN_VALUE);
        if (f3 == Float.MIN_VALUE) {
            a.warn("Invalid value for " + string + ": " + string2);
            return f2;
        }
        return f3;
    }

    public static boolean b(Properties properties, String string, boolean bl2) {
        String string2 = properties.getProperty(string);
        if (string2 == null) {
            return bl2;
        }
        String string3 = string2.toLowerCase().trim();
        if (!string3.equals("true") && !string3.equals("on")) {
            if (!string3.equals("false") && !string3.equals("off")) {
                a.warn("Invalid value for " + string + ": " + string2);
                return bl2;
            }
            return false;
        }
        return true;
    }

    public static cm R(cm cm2) {
        if (!a.aoy()) {
            return cm2;
        }
        if (cm2 == null) {
            return cm2;
        }
        if (!a.anb()) {
            return cm2;
        }
        Object object = cm2.atA();
        String string = "textures/";
        String string2 = "mcpatcher/";
        if (!((String)object).startsWith("textures/")) {
            return cm2;
        }
        object = ((String)object).substring("textures/".length());
        object = "mcpatcher/" + (String)object;
        cm cm3 = new cm(cm2.atB(), (String)object);
        return a.e(a.Br(), cm3) ? cm3 : cm2;
    }
}

