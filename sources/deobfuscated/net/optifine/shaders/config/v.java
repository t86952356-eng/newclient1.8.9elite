/*
 * Decompiled with CFR 0.152.
 */
package net.optifine.shaders.config;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import net.minecraft.src.a;
import net.optifine.shaders.ah;
import net.optifine.shaders.config.o;
import net.optifine.util.aj;

public class v
extends o {
    private static final Pattern eHJ = Pattern.compile("^\\s*#define\\s+(\\w+)\\s+(-?[0-9\\.Ff]+|\\w+)\\s*(//.*)?$");

    public v(String string, String string2, String string3, String[] stringArray, String string4) {
        super(string, string2, string3, stringArray, string3, string4);
        this.M(this.aIj().length > 1);
    }

    @Override
    public String aHV() {
        return "#define " + this.getName() + " " + this.SN() + " // Shader option " + this.SN();
    }

    @Override
    public String js(String string) {
        String string2 = ah.ak("prefix." + this.getName(), "");
        String string3 = super.js(string);
        String string4 = ah.ak("suffix." + this.getName(), "");
        String string5 = string2 + string3 + string4;
        return string5;
    }

    @Override
    public String jt(String string) {
        String string2 = string.toLowerCase();
        return !string2.equals("false") && !string2.equals("off") ? "\u00a7a" : "\u00a7c";
    }

    @Override
    public boolean ju(String string) {
        Matcher matcher = eHJ.matcher(string);
        if (!matcher.matches()) {
            return false;
        }
        String string2 = matcher.group(1);
        return string2.matches(this.getName());
    }

    public static o ao(String string, String string2) {
        Matcher matcher = eHJ.matcher(string);
        if (!matcher.matches()) {
            return null;
        }
        String string3 = matcher.group(1);
        String string4 = matcher.group(2);
        String string5 = matcher.group(3);
        String string6 = aj.k(string5, "[", "]");
        if (string6 != null && string6.length() > 0) {
            string5 = string5.replace(string6, "").trim();
        }
        String[] stringArray = v.ap(string4, string6);
        if (string3 != null && string3.length() > 0) {
            string2 = aj.ax(string2, "/shaders/");
            v v2 = new v(string3, string5, string4, stringArray, string2);
            return v2;
        }
        return null;
    }

    public static String[] ap(String string, String string2) {
        String[] stringArray = new String[]{string};
        if (string2 == null) {
            return stringArray;
        }
        string2 = string2.trim();
        string2 = aj.ax(string2, "[");
        string2 = aj.ay(string2, "]");
        if ((string2 = string2.trim()).length() <= 0) {
            return stringArray;
        }
        Object[] objectArray = a.V(string2, " ");
        if (objectArray.length <= 0) {
            return stringArray;
        }
        if (!Arrays.asList(objectArray).contains(string)) {
            objectArray = (String[])a.a(objectArray, string, 0);
        }
        return objectArray;
    }
}

