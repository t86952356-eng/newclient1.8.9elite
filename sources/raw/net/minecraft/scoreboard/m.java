/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 */
package net.minecraft.scoreboard;

import com.google.common.collect.Maps;
import java.util.Map;

public final class m
extends Enum<m> {
    public static final /* enum */ m dkm = new m("always", 0);
    public static final /* enum */ m dkn = new m("never", 1);
    public static final /* enum */ m dko = new m("hideForOtherTeams", 2);
    public static final /* enum */ m dkp = new m("hideForOwnTeam", 3);
    private static final Map<String, m> dkq;
    public final String dkr;
    public final int dks;
    private static final /* synthetic */ m[] dkt;

    public static m[] values() {
        return (m[])dkt.clone();
    }

    public static m valueOf(String string) {
        return Enum.valueOf(m.class, string);
    }

    public static String[] akK() {
        return dkq.keySet().toArray(new String[0]);
    }

    public static m fv(String string) {
        return dkq.get(string);
    }

    private m(String string2, int n3) {
        this.dkr = string2;
        this.dks = n3;
    }

    private static /* synthetic */ m[] akL() {
        return new m[]{dkm, dkn, dko, dkp};
    }

    static {
        dkt = m.akL();
        dkq = Maps.newHashMap();
        for (m m2 : m.values()) {
            dkq.put(m2.dkr, m2);
        }
    }
}

