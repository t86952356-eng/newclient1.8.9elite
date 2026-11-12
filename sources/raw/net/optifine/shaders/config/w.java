/*
 * Decompiled with CFR 0.152.
 */
package net.optifine.shaders.config;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import net.optifine.shaders.config.o;
import net.optifine.shaders.config.v;
import net.optifine.util.aj;

public class w
extends v {
    private String aAU = null;
    private static final Pattern eHK = Pattern.compile("^\\s*const\\s*(float|int)\\s*([A-Za-z0-9_]+)\\s*=\\s*(-?[0-9\\.]+f?F?)\\s*;\\s*(//.*)?$");

    public w(String string, String string2, String string3, String string4, String[] stringArray, String string5) {
        super(string, string3, string4, stringArray, string5);
        this.aAU = string2;
    }

    @Override
    public String aHV() {
        return "const " + this.aAU + " " + this.getName() + " = " + this.SN() + "; // Shader option " + this.SN();
    }

    @Override
    public boolean ju(String string) {
        Matcher matcher = eHK.matcher(string);
        if (!matcher.matches()) {
            return false;
        }
        String string2 = matcher.group(2);
        return string2.matches(this.getName());
    }

    public static o ao(String string, String string2) {
        Matcher matcher = eHK.matcher(string);
        if (!matcher.matches()) {
            return null;
        }
        String string3 = matcher.group(1);
        String string4 = matcher.group(2);
        String string5 = matcher.group(3);
        String string6 = matcher.group(4);
        String string7 = aj.k(string6, "[", "]");
        if (string7 != null && string7.length() > 0) {
            string6 = string6.replace(string7, "").trim();
        }
        String[] stringArray = w.ap(string5, string7);
        if (string4 != null && string4.length() > 0) {
            string2 = aj.ax(string2, "/shaders/");
            w w2 = new w(string4, string3, string6, string5, stringArray, string2);
            return w2;
        }
        return null;
    }
}

