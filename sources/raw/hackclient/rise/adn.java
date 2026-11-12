/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.adk;
import hackclient.rise.ais;
import hackclient.rise.ait;
import hackclient.rise.gg;
import java.awt.Color;
import net.minecraft.util.cm;

public class adn
extends adk {
    private final cm aCO;

    public adn(double d2, double d3, double d4, double d5, Runnable runnable, cm cm2) {
        super(d2, d3, d4, d5, runnable);
        this.aCO = cm2;
    }

    @Override
    public void c(int n2, int n3, float f2) {
        super.c(n2, n3, f2);
        double d2 = this.getY();
        double d3 = d2 / this.getY();
        Color color = ais.d(Color.BLACK, (int)(d3 * 100.0));
        Color color2 = ais.d(Color.WHITE, (int)(d3 * (50.0 + this.pb().sV() * 2.0)));
        this.b(gg.kU).c(() -> ait.c(this.getX(), this.getY(), this.pc(), this.da(), 5.0, Color.WHITE));
        this.b(gg.kT).c(() -> ait.c(this.getX() + 0.5, d2 + 0.5, this.pc() - 1.0, this.da() - 1.0, 6.0, color));
        this.b(gg.kV).c(() -> {
            ait.c(this.getX(), d2, this.pc(), this.da(), 5.0, ais.d(Color.WHITE, (int)this.pb().sV() / 3));
            ait.a(this.getX(), d2, this.pc(), this.da(), 5.0, 0.5, ais.d(Color.WHITE, (int)this.pb().sV() / 3));
            ait.a(this.aCO, this.getX() + this.pc() / 2.0 - 8.0, d2 + this.da() / 2.0 - 8.0, 16.0, 16.0, color2);
        });
    }
}

