/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 */
package net.minecraft.item;

import com.google.common.collect.Maps;
import java.util.Map;
import net.minecraft.item.bc;
import net.minecraft.item.co;

public final class bd
extends Enum<bd> {
    public static final /* enum */ bd cWe = new bd(0, "cod", 2, 0.1f, 5, 0.6f);
    public static final /* enum */ bd cWf = new bd(1, "salmon", 2, 0.1f, 6, 0.8f);
    public static final /* enum */ bd cWg = new bd(2, "clownfish", 1, 0.1f);
    public static final /* enum */ bd cWh = new bd(3, "pufferfish", 1, 0.1f);
    private static final Map<Integer, bd> cWi;
    private final int cWj;
    private final String cWk;
    private final int cWl;
    private final float cWm;
    private final int cWn;
    private final float cWo;
    private boolean cWp = false;
    private static final /* synthetic */ bd[] cWq;

    public static bd[] values() {
        return (bd[])cWq.clone();
    }

    public static bd valueOf(String string) {
        return Enum.valueOf(bd.class, string);
    }

    private bd(int n3, String string2, int n4, float f2, int n5, float f3) {
        this.cWj = n3;
        this.cWk = string2;
        this.cWl = n4;
        this.cWm = f2;
        this.cWn = n5;
        this.cWo = f3;
        this.cWp = true;
    }

    private bd(int n3, String string2, int n4, float f2) {
        this.cWj = n3;
        this.cWk = string2;
        this.cWl = n4;
        this.cWm = f2;
        this.cWn = 0;
        this.cWo = 0.0f;
        this.cWp = false;
    }

    public int yc() {
        return this.cWj;
    }

    public String xB() {
        return this.cWk;
    }

    public int adP() {
        return this.cWl;
    }

    public float adQ() {
        return this.cWm;
    }

    public int adR() {
        return this.cWn;
    }

    public float adS() {
        return this.cWo;
    }

    public boolean adT() {
        return this.cWp;
    }

    public static bd fZ(int n2) {
        bd bd2 = cWi.get(n2);
        return bd2 == null ? cWe : bd2;
    }

    public static bd aG(co co2) {
        return co2.bP() instanceof bc ? bd.fZ(co2.yc()) : cWe;
    }

    private static /* synthetic */ bd[] adU() {
        return new bd[]{cWe, cWf, cWg, cWh};
    }

    static {
        cWq = bd.adU();
        cWi = Maps.newHashMap();
        for (bd bd2 : bd.values()) {
            cWi.put(bd2.yc(), bd2);
        }
    }
}

