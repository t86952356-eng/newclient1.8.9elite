/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.adp;
import hackclient.rise.aee;
import hackclient.rise.agf;
import hackclient.rise.ais;
import hackclient.rise.ait;
import hackclient.rise.gb;
import hackclient.rise.gd;
import hackclient.rise.gg;
import java.awt.Color;
import net.minecraft.util.cm;

public class adl
extends adp {
    private static final agf aCK = gb.ks.a(24, gd.kH);
    private final cm aCL;

    public adl(double d2, double d3, double d4, double d5, Runnable runnable, String string, cm cm2) {
        super(d2, d3, d4, d5, runnable, string);
        this.aCL = cm2;
    }

    @Override
    public void c(int n2, int n3, float f2) {
        this.pb().Q(aee.a(this.getX(), this.getY(), this.pc(), this.da(), n2, n3) ? 100.0 : 45.0);
        double d2 = this.getY();
        Color color = ais.d(Color.BLACK, 150);
        Color color2 = ais.d(Color.WHITE, (int)(150.0 + this.pb().sV()));
        this.b(gg.kU).c(() -> ait.c(this.getX(), this.getY(), this.pc(), this.da(), 5.0, Color.WHITE));
        this.b(gg.kT).c(() -> ait.c(this.getX() + 0.5, d2 + 0.5, this.pc() - 1.0, this.da() - 1.0, 6.0, color));
        this.b(gg.kV).c(() -> {
            ait.c(this.getX(), d2, this.pc(), this.da(), 5.0, ais.d(aCG, (int)this.pb().sV() - 15));
            ait.a(this.getX(), d2, this.pc(), this.da(), 5.0, 1.0, ais.d(aCA, 32), ais.d(aCz, 32));
            int n2 = 64;
            ait.a(this.aCL, this.getX() + this.pc() / 2.0 - (double)(n2 / 2), d2 + this.da() / 2.0 - (double)(n2 / 2), (double)n2, (double)n2, color2);
            agf agf2 = aCK;
            float f2 = (float)(this.pc() - 8.0);
            for (int i2 = 24; i2 > 11 && (float)agf2.bQ(this.gK) > f2; --i2) {
                agf2 = gb.ks.a(i2, gd.kH);
            }
            agf2.c(this.gK, (float)(this.getX() + this.pc() / 2.0), (float)(d2 + this.da() / 2.0 - (double)(n2 / 2) - 24.0), color2.getRGB());
        });
    }
}

