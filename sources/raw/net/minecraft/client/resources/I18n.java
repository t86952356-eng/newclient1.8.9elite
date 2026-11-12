/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.resources;

import java.util.Map;
import net.minecraft.client.resources.Locale;

public class I18n {
    private static Locale ccT;

    static void a(Locale locale) {
        ccT = locale;
    }

    public static String a(String string, Object ... objectArray) {
        return ccT.b(string, objectArray);
    }

    public static Map Pj() {
        return I18n.ccT.cdf;
    }
}

