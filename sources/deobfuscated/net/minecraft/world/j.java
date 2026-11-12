/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.world;

import net.minecraft.world.k;

class j {
    private String dCp;
    private boolean dCq;
    private int dCr;
    private double dCs;
    private final k dCt;

    public j(String string, k k2) {
        this.dCt = k2;
        this.cp(string);
    }

    public void cp(String string) {
        this.dCp = string;
        if (string != null) {
            if (string.equals("false")) {
                this.dCq = false;
                return;
            }
            if (string.equals("true")) {
                this.dCq = true;
                return;
            }
        }
        this.dCq = Boolean.parseBoolean(string);
        this.dCr = this.dCq ? 1 : 0;
        try {
            this.dCr = Integer.parseInt(string);
        }
        catch (NumberFormatException numberFormatException) {
            // empty catch block
        }
        try {
            this.dCs = Double.parseDouble(string);
        }
        catch (NumberFormatException numberFormatException) {
            // empty catch block
        }
    }

    public String avj() {
        return this.dCp;
    }

    public boolean avk() {
        return this.dCq;
    }

    public int aeK() {
        return this.dCr;
    }

    public k avl() {
        return this.dCt;
    }
}

