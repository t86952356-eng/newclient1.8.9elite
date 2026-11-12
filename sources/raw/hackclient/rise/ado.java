/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.adp;
import hackclient.rise.agf;
import hackclient.rise.ais;
import hackclient.rise.ait;
import hackclient.rise.gb;
import hackclient.rise.gd;
import java.awt.Color;

public class ado
extends adp {
    private static final agf aCP = gb.ks.a(14, gd.kE);
    private static final Color aCQ = ais.d(Color.WHITE, 150);
    private final Color aCR;

    public ado(double d2, double d3, double d4, double d5, Runnable runnable, String string, Color color) {
        super(d2, d3, d4, d5, runnable, string);
        this.aCR = ais.d(color, 150);
    }

    @Override
    public void c(int n2, int n3, float f2) {
        ait.c(this.getX(), this.getY(), this.pc(), this.da(), 2.0, this.aCR);
        aCP.a(this.gK, this.getX() + this.pc() / 2.0 - (double)((float)aCP.bQ(this.gK) / 2.0f), this.getY() + this.da() / 2.0 - (double)(aCP.tF() / 4.0f) + 0.5, aCQ.getRGB());
    }
}

