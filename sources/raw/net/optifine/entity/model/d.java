/*
 * Decompiled with CFR 0.152.
 */
package net.optifine.entity.model;

import net.minecraft.util.cm;
import net.optifine.entity.model.f;

public class d {
    private String gK = null;
    private String bZI = null;
    private cm bCa = null;
    private f[] egg = null;
    private float bUm = 0.0f;

    public d(String string, String string2, cm cm2, f[] fArray, float f2) {
        this.gK = string;
        this.bZI = string2;
        this.bCa = cm2;
        this.egg = fArray;
        this.bUm = f2;
    }

    public String getName() {
        return this.gK;
    }

    public String Ov() {
        return this.bZI;
    }

    public cm Hg() {
        return this.bCa;
    }

    public f[] aCf() {
        return this.egg;
    }

    public float aCg() {
        return this.bUm;
    }
}

