/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Maps
 */
package net.minecraft.util;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import java.util.regex.Pattern;

public final class an
extends Enum<an> {
    public static final /* enum */ an dvL = new an("BLACK", '0', 0);
    public static final /* enum */ an dvM = new an("DARK_BLUE", '1', 1);
    public static final /* enum */ an dvN = new an("DARK_GREEN", '2', 2);
    public static final /* enum */ an dvO = new an("DARK_AQUA", '3', 3);
    public static final /* enum */ an dvP = new an("DARK_RED", '4', 4);
    public static final /* enum */ an dvQ = new an("DARK_PURPLE", '5', 5);
    public static final /* enum */ an dvR = new an("GOLD", '6', 6);
    public static final /* enum */ an dvS = new an("GRAY", '7', 7);
    public static final /* enum */ an dvT = new an("DARK_GRAY", '8', 8);
    public static final /* enum */ an dvU = new an("BLUE", '9', 9);
    public static final /* enum */ an dvV = new an("GREEN", 'a', 10);
    public static final /* enum */ an dvW = new an("AQUA", 'b', 11);
    public static final /* enum */ an dvX = new an("RED", 'c', 12);
    public static final /* enum */ an dvY = new an("LIGHT_PURPLE", 'd', 13);
    public static final /* enum */ an dvZ = new an("YELLOW", 'e', 14);
    public static final /* enum */ an dwa = new an("WHITE", 'f', 15);
    public static final /* enum */ an dwb = new an("NONE", 'r', -1);
    public static final /* enum */ an dwc = new an("OBFUSCATED", 'k', true);
    public static final /* enum */ an dwd = new an("BOLD", 'l', true);
    public static final /* enum */ an dwe = new an("STRIKETHROUGH", 'm', true);
    public static final /* enum */ an dwf = new an("UNDERLINE", 'n', true);
    public static final /* enum */ an dwg = new an("ITALIC", 'o', true);
    public static final /* enum */ an dwh = new an("RESET", 'r', -1);
    private static final Map<String, an> dwi;
    private static final Pattern dwj;
    private final String dwk;
    private final char dwl;
    private final boolean dwm;
    private final String dwn;
    private final int dwo;
    private static final /* synthetic */ an[] dwp;

    public static an[] values() {
        return (an[])dwp.clone();
    }

    public static an valueOf(String string) {
        return Enum.valueOf(an.class, string);
    }

    private static String gd(String string) {
        return string.toLowerCase().replaceAll("[^a-z]", "");
    }

    private an(String string2, char c2, int n3) {
        this(string2, c2, false, n3);
    }

    private an(String string2, char c2, boolean bl2) {
        this(string2, c2, bl2, -1);
    }

    private an(String string2, char c2, boolean bl2, int n3) {
        this.dwk = string2;
        this.dwl = c2;
        this.dwm = bl2;
        this.dwo = n3;
        this.dwn = "\u00a7" + c2;
    }

    public int asv() {
        return this.dwo;
    }

    public boolean asw() {
        return this.dwm;
    }

    public boolean asx() {
        return !this.dwm && this != dwh;
    }

    public String asy() {
        return this.name().toLowerCase();
    }

    public String toString() {
        return this.dwn;
    }

    public static String ge(String string) {
        return string == null ? null : dwj.matcher(string).replaceAll("");
    }

    public static an gf(String string) {
        return string == null ? null : dwi.get(an.gd(string));
    }

    public static an hx(int n2) {
        if (n2 < 0) {
            return dwh;
        }
        for (an an2 : an.values()) {
            if (an2.asv() != n2) continue;
            return an2;
        }
        return null;
    }

    public static Collection<String> i(boolean bl2, boolean bl3) {
        ArrayList arrayList = Lists.newArrayList();
        for (an an2 : an.values()) {
            if (an2.asx() && !bl2 || an2.asw() && !bl3) continue;
            arrayList.add(an2.asy());
        }
        return arrayList;
    }

    private static /* synthetic */ an[] asz() {
        return new an[]{dvL, dvM, dvN, dvO, dvP, dvQ, dvR, dvS, dvT, dvU, dvV, dvW, dvX, dvY, dvZ, dwa, dwb, dwc, dwd, dwe, dwf, dwg, dwh};
    }

    static {
        dwp = an.asz();
        dwi = Maps.newHashMap();
        dwj = Pattern.compile("(?i)\u00a7[0-9A-FK-OR]");
        for (an an2 : an.values()) {
            dwi.put(an.gd(an2.dwk), an2);
        }
    }
}

