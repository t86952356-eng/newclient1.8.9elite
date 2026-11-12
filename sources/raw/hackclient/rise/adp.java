/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package hackclient.rise;

import hackclient.rise.adk;
import hackclient.rise.agf;
import hackclient.rise.ais;
import hackclient.rise.ait;
import hackclient.rise.gb;
import hackclient.rise.gd;
import hackclient.rise.gg;
import java.awt.Color;
import lombok.Generated;

public class adp
extends adk {
    private agf lq = gb.ks.a(24, gd.kH);
    public String gK;
    private float aCS = 5.0f;
    private int aCT = 32;

    public adp(double d2, double d3, double d4, double d5, Runnable runnable, String string) {
        super(d2, d3, d4, d5, runnable);
        this.gK = string;
    }

    @Override
    public void c(int n2, int n3, float f2) {
        super.c(n2, n3, f2);
        double d2 = this.getY();
        Color color = ais.d(Color.BLACK, 150);
        Color color2 = ais.d(aCE, (int)(150.0 + this.pb().sV()));
        this.b(gg.kU).c(() -> ait.c(this.getX(), this.getY(), this.pc(), this.da(), this.aCS, Color.WHITE));
        this.b(gg.kT).c(() -> ait.c(this.getX() + 0.5, d2 + 0.5, this.pc() - 1.0, this.da() - 1.0, this.aCS + 1.0f, color));
        this.b(gg.kV).c(() -> {
            ait.c(this.getX(), d2, this.pc(), this.da(), this.aCS, ais.d(aCG, (int)this.pb().sV() - 15));
            ait.a(this.getX(), d2, this.pc(), this.da(), (double)this.aCS, 1.0, ais.d(aCA, this.aCT), ais.d(aCz, this.aCT));
            this.lq.c(this.gK, (float)(this.getX() + this.pc() / 2.0), (float)(d2 + this.da() / 2.0 - 4.0), color2.getRGB());
        });
    }

    @Generated
    public void c(agf agf2) {
        this.lq = agf2;
    }

    @Generated
    public void x(float f2) {
        this.aCS = f2;
    }

    @Generated
    public void ah(int n2) {
        this.aCT = n2;
    }
}

