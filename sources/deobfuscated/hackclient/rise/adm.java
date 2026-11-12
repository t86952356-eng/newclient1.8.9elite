/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.adp;
import hackclient.rise.aee;

public class adm
extends adp {
    public String aCM;
    public String aCN;

    public adm(double d2, double d3, double d4, double d5, Runnable runnable, String string, String string2) {
        super(d2, d3, d4, d5, runnable, string);
        this.aCM = string2;
        this.aCN = string;
    }

    @Override
    public void c(int n2, int n3, float f2) {
        super.c(n2, n3, f2);
        if (!aee.a(this.getX(), this.getY(), this.pc(), this.da(), n2, n3)) {
            this.gK = this.aCN;
        }
    }

    @Override
    public void rC() {
        super.rC();
        this.gK = this.aCM;
    }
}

