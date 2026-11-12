/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.network.play.server;

import java.util.EnumSet;
import java.util.Set;

public final class j
extends Enum<j> {
    public static final /* enum */ j dcn = new j(0);
    public static final /* enum */ j dco = new j(1);
    public static final /* enum */ j dcp = new j(2);
    public static final /* enum */ j dcq = new j(3);
    public static final /* enum */ j dcr = new j(4);
    private final int dcs;
    private static final /* synthetic */ j[] dct;

    public static j[] values() {
        return (j[])dct.clone();
    }

    public static j valueOf(String string) {
        return Enum.valueOf(j.class, string);
    }

    private j(int n3) {
        this.dcs = n3;
    }

    private int ags() {
        return 1 << this.dcs;
    }

    private boolean gu(int n2) {
        return (n2 & this.ags()) == this.ags();
    }

    public static Set<j> gv(int n2) {
        EnumSet<j> enumSet = EnumSet.noneOf(j.class);
        for (j j2 : j.values()) {
            if (!j2.gu(n2)) continue;
            enumSet.add(j2);
        }
        return enumSet;
    }

    public static int b(Set<j> set) {
        int n2 = 0;
        for (j j2 : set) {
            n2 |= j2.ags();
        }
        return n2;
    }

    private static /* synthetic */ j[] agt() {
        return new j[]{dcn, dco, dcp, dcq, dcr};
    }

    static {
        dct = j.agt();
    }
}

