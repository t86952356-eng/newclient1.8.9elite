/*
 * Decompiled with CFR 0.152.
 */
package net.optifine.shaders.config;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import net.minecraft.src.a;
import net.optifine.aw;
import net.optifine.shaders.config.o;
import net.optifine.util.aj;

public class t
extends o {
    private static final Pattern eHG = Pattern.compile("^\\s*(//)?\\s*#define\\s+([A-Za-z0-9_]+)\\s*(//.*)?$");
    private static final Pattern eHH = Pattern.compile("^\\s*#if(n)?def\\s+([A-Za-z0-9_]+)(\\s*)?$");

    public t(String string, String string2, String string3, String string4) {
        super(string, string2, string3, new String[]{"false", "true"}, string3, string4);
    }

    @Override
    public String aHV() {
        return t.jy(this.SN()) ? "#define " + this.getName() + " // Shader option ON" : "//#define " + this.getName() + " // Shader option OFF";
    }

    @Override
    public String js(String string) {
        String string2 = super.js(string);
        return string2 != string ? string2 : (t.jy(string) ? aw.aBB() : aw.aBC());
    }

    @Override
    public String jt(String string) {
        return t.jy(string) ? "\u00a7a" : "\u00a7c";
    }

    public static o ao(String string, String string2) {
        Matcher matcher = eHG.matcher(string);
        if (!matcher.matches()) {
            return null;
        }
        String string3 = matcher.group(1);
        String string4 = matcher.group(2);
        String string5 = matcher.group(3);
        if (string4 != null && string4.length() > 0) {
            boolean bl2 = a.a((Object)string3, (Object)"//");
            boolean bl3 = !bl2;
            string2 = aj.ax(string2, "/shaders/");
            t t2 = new t(string4, string5, String.valueOf(bl3), string2);
            return t2;
        }
        return null;
    }

    @Override
    public boolean ju(String string) {
        Matcher matcher = eHG.matcher(string);
        if (!matcher.matches()) {
            return false;
        }
        String string2 = matcher.group(2);
        return string2.matches(this.getName());
    }

    @Override
    public boolean aIi() {
        return true;
    }

    @Override
    public boolean jv(String string) {
        Matcher matcher = eHH.matcher(string);
        if (matcher.matches()) {
            String string2 = matcher.group(2);
            return string2.equals(this.getName());
        }
        return false;
    }

    public static boolean jy(String string) {
        return Boolean.valueOf(string);
    }
}

