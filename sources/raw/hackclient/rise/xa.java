/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.ady;
import hackclient.rise.ait;
import hackclient.rise.aka;
import hackclient.rise.akb;
import hackclient.rise.aki;
import hackclient.rise.akn;
import hackclient.rise.dk;
import hackclient.rise.dm;
import hackclient.rise.fs;
import hackclient.rise.gb;
import hackclient.rise.gd;
import hackclient.rise.gg;
import hackclient.rise.gi;
import hackclient.rise.gj;
import hackclient.rise.gl;
import java.awt.Color;
import net.minecraft.client.d;

@gl(aliases={"module.render.fpscounter.name"}, description="module.render.fpscounter.description", category=gj.RENDER)
public final class xa
extends gi {
    private final aki anW = new aki("Title", (gi)this, (Boolean)false);
    private final akn anX = new akn("Position", (gi)this, new aka(200.0, 200.0));
    private final akb anY = new akb(22.0f, 22.0f);
    private int anZ;
    @dm
    public final dk<fs> aoa = fs2 -> {
        aka aka2 = this.anX.aqy;
        String string = (Boolean)this.anW.wD() != false ? "FPS " : "";
        String string2 = "" + d.BI();
        float f2 = gb.ks.a(20, gd.kH).bQ(string);
        if (d.BI() != this.anZ) {
            this.anY.x = f2 + (float)gb.ks.a(20, gd.kG).bQ(string2);
        }
        this.anZ = d.BI();
        this.b(gg.kV, 1).c(() -> {
            double d2 = aka2.x;
            double d3 = aka2.y;
            double d4 = this.anY.x + 6.0f;
            double d5 = this.anY.y - 1.0f;
            double d6 = this.rP().pB();
            this.rP();
            ait.c(d2, d3, d4, d5, d6, ady.sa());
            this.anX.n(new aka(this.anY.x + 6.0f, this.anY.y - 1.0f));
            double d7 = aka2.x + 3.0;
            double d8 = aka2.y + (double)(this.anY.y / 2.05f) - (double)(gb.ks.a(20, gd.kG).tF() / 4.0f);
            gb.ks.a(20, gd.kH).b(string, d7, d8, this.rP().rQ().getRGB());
            gb.ks.a(20, gd.kG).b(string2, d7 + (double)f2, d8, Color.WHITE.getRGB());
        });
        this.b(gg.kU).c(() -> ait.c(aka2.x, aka2.y, (double)(this.anY.x + 6.0f), (double)(this.anY.y - 1.0f), this.rP().pB() + 1, Color.BLACK));
        this.b(gg.kT).c(() -> ait.c(aka2.x + 0.5, aka2.y + 0.5, (double)(this.anY.x + 6.0f - 1.0f), (double)(this.anY.y - 2.0f), this.rP().pB() + 1, this.rP().rU()));
    };
}

