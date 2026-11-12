/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.ahj;
import hackclient.rise.ais;
import hackclient.rise.ait;
import hackclient.rise.aka;
import hackclient.rise.akg;
import hackclient.rise.bf;
import hackclient.rise.dk;
import hackclient.rise.dm;
import hackclient.rise.fs;
import hackclient.rise.to;
import hackclient.rise.xz;
import java.awt.Color;
import net.minecraft.client.entity.a;
import net.minecraft.entity.c;

public class aai
extends akg<xz> {
    private xz auR;
    @dm
    public final dk<fs> avW = fs2 -> {
        boolean bl2;
        if (this.auR == null) {
            this.auR = this.e(xz.class);
        }
        c c2 = this.auR.by;
        boolean bl3 = bl2 = !this.auR.aqz || this.auR.rG.T(1000L);
        if (c2 == null || bl2) {
            return;
        }
        String string = c2.xU();
        String string2 = bf.c(string, string);
        double d2 = this.auR.aqy.x;
        double d3 = this.auR.aqy.y;
        ait.d(d2, d3, 185.0, 34.0, ais.d(Color.WHITE, 100));
        aai.aER.fontRendererObj.a("Name: " + string2, d2 + 4.0, d3 + 4.0, Color.BLACK.getRGB());
        this.auR.aqw.aHP = new aka(185.0, 50.0);
        a a2 = (a)c2;
        to to2 = this.e(to.class);
        float f2 = to2 != null && to2.isEnabled() ? to.B(a2) : a2.getHealth();
        double d4 = Math.min(!this.auR.aqz ? 0.0 : ahj.a(f2, 1), (double)a2.getMaxHealth());
        ait.d(d2 + 4.0, d3 + 16.0, 177.0 * (d4 / (double)a2.getMaxHealth()), 10.0, Color.ORANGE);
    };

    public aai(String string, xz xz2) {
        super(string, xz2);
    }
}

