/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.audio;

import net.minecraft.util.cm;

public class SoundPoolEntry {
    private final cm bjM;
    private final boolean bjN;
    private double aL;
    private double bjO;

    public SoundPoolEntry(cm cm2, double d2, double d3, boolean bl2) {
        this.bjM = cm2;
        this.aL = d2;
        this.bjO = d3;
        this.bjN = bl2;
    }

    public SoundPoolEntry(SoundPoolEntry soundPoolEntry) {
        this.bjM = soundPoolEntry.bjM;
        this.aL = soundPoolEntry.aL;
        this.bjO = soundPoolEntry.bjO;
        this.bjN = soundPoolEntry.bjN;
    }

    public cm CU() {
        return this.bjM;
    }

    public double ax() {
        return this.aL;
    }

    public void ah(double d2) {
        this.aL = d2;
    }

    public double CV() {
        return this.bjO;
    }

    public void ai(double d2) {
        this.bjO = d2;
    }

    public boolean CW() {
        return this.bjN;
    }
}

