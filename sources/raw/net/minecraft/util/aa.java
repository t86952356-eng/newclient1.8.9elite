/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.util;

import net.minecraft.entity.r;
import net.minecraft.util.ad;
import net.minecraft.util.ba;

public class aa {
    private final ad duM;
    private final int duN;
    private final float duO;
    private final float duP;
    private final String duQ;
    private final float duR;

    public aa(ad ad2, int n2, float f2, float f3, String string, float f4) {
        this.duM = ad2;
        this.duN = n2;
        this.duO = f3;
        this.duP = f2;
        this.duQ = string;
        this.duR = f4;
    }

    public ad arI() {
        return this.duM;
    }

    public float arJ() {
        return this.duO;
    }

    public boolean arK() {
        return this.duM.dk() instanceof r;
    }

    public String arL() {
        return this.duQ;
    }

    public ba arM() {
        return this.arI().dk() == null ? null : this.arI().dk().xW();
    }

    public float arN() {
        return this.duM == ad.dvk ? Float.MAX_VALUE : this.duR;
    }
}

