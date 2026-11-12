/*
 * Decompiled with CFR 0.152.
 */
package net.optifine.shaders.config;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import net.optifine.shaders.config.o;
import net.optifine.shaders.config.t;
import net.optifine.util.aj;

public class u
extends t {
    private static final Pattern eHI = Pattern.compile("^\\s*const\\s*bool\\s*([A-Za-z0-9_]+)\\s*=\\s*(true|false)\\s*;\\s*(//.*)?$");

    public u(String string, String string2, String string3, String string4) {
        super(string, string2, string3, string4);
    }

    @Override
    public String aHV() {
        return "const bool " + this.getName() + " = " + this.SN() + "; // Shader option " + this.SN();
    }

    public static o ao(String string, String string2) {
        Matcher matcher = eHI.matcher(string);
        if (!matcher.matches()) {
            return null;
        }
        String string3 = matcher.group(1);
        String string4 = matcher.group(2);
        String string5 = matcher.group(3);
        if (string3 != null && string3.length() > 0) {
            string2 = aj.ax(string2, "/shaders/");
            u u2 = new u(string3, string5, string4, string2);
            u2.M(false);
            return u2;
        }
        return null;
    }

    @Override
    public boolean ju(String string) {
        Matcher matcher = eHI.matcher(string);
        if (!matcher.matches()) {
            return false;
        }
        String string2 = matcher.group(1);
        return string2.matches(this.getName());
    }

    @Override
    public boolean aIi() {
        return false;
    }
}

