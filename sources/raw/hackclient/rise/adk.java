/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.adj;
import hackclient.rise.aee;
import hackclient.rise.afj;
import hackclient.rise.afk;

public class adk
extends adj {
    private final Runnable aCH;
    private final afj aCI = new afj(afk.aHh, 500L);
    private final afj aCJ = new afj(afk.aHk, 250L);

    public adk(double d2, double d3, double d4, double d5, Runnable runnable) {
        super(d2, d3, d4, d5);
        this.aCH = runnable;
    }

    public void c(int n2, int n3, float f2) {
        this.aCJ.Q(aee.a(this.getX(), this.getY(), this.pc(), this.da(), n2, n3) ? 100.0 : 45.0);
    }

    public void rC() {
        this.aCH.run();
    }

    public afj mS() {
        return this.aCI;
    }

    public afj pb() {
        return this.aCJ;
    }
}

