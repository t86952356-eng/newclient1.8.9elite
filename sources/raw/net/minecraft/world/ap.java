/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.world;

public class ap {
    public static final ap[] dEC = new ap[16];
    public static final ap dED = new ap(0, "default", 1).awN();
    public static final ap dEE = new ap(1, "flat");
    public static final ap dEF = new ap(2, "largeBiomes");
    public static final ap dEG = new ap(3, "amplified").awR();
    public static final ap dEH = new ap(4, "customized");
    public static final ap dEI = new ap(5, "debug_all_block_states");
    public static final ap dEJ = new ap(8, "default_1_1", 0).cv(false);
    private final int dEK;
    private final String dEL;
    private final int dEM;
    private boolean dEN;
    private boolean dEO;
    private boolean dEP;

    private ap(int n2, String string) {
        this(n2, string, 0);
    }

    private ap(int n2, String string, int n3) {
        this.dEL = string;
        this.dEM = n3;
        this.dEN = true;
        this.dEK = n2;
        ap.dEC[n2] = this;
    }

    public String awI() {
        return this.dEL;
    }

    public String awJ() {
        return "generator." + this.dEL;
    }

    public String awK() {
        return this.awJ() + ".info";
    }

    public int awL() {
        return this.dEM;
    }

    public ap ij(int n2) {
        return this == dED && n2 == 0 ? dEJ : this;
    }

    private ap cv(boolean bl2) {
        this.dEN = bl2;
        return this;
    }

    public boolean awM() {
        return this.dEN;
    }

    private ap awN() {
        this.dEO = true;
        return this;
    }

    public boolean awO() {
        return this.dEO;
    }

    public static ap gD(String string) {
        for (int i2 = 0; i2 < dEC.length; ++i2) {
            if (dEC[i2] == null || !ap.dEC[i2].dEL.equalsIgnoreCase(string)) continue;
            return dEC[i2];
        }
        return null;
    }

    public int awP() {
        return this.dEK;
    }

    public boolean awQ() {
        return this.dEP;
    }

    private ap awR() {
        this.dEP = true;
        return this;
    }
}

