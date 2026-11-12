/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.lang3.StringUtils
 */
package net.minecraft.util;

import hackclient.rise.agf;
import java.util.regex.Pattern;
import org.apache.commons.lang3.StringUtils;

public class ct {
    private static final Pattern dAh = Pattern.compile("(?i)\\u00A7[0-9A-FK-OR]");

    public static String hU(int n2) {
        int n3 = n2 / 20;
        int n4 = n3 / 60;
        return (n3 %= 60) < 10 ? n4 + ":0" + n3 : n4 + ":" + n3;
    }

    public static String gs(String string) {
        return dAh.matcher(string).replaceAll("");
    }

    public static boolean cU(String string) {
        return StringUtils.isEmpty((CharSequence)string);
    }

    public static String b(agf agf2, String string, double d2) {
        String string2;
        double d3 = 0.0;
        StringBuilder stringBuilder = new StringBuilder();
        for (int i2 = 0; d3 < d2 && i2 < string.length(); d3 += (double)agf2.bQ(string2), ++i2) {
            string2 = String.valueOf(string.charAt(i2));
            stringBuilder.append(string2);
        }
        return stringBuilder.toString();
    }
}

