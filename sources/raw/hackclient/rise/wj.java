/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.ady;
import hackclient.rise.ahj;
import hackclient.rise.ait;
import hackclient.rise.aka;
import hackclient.rise.akb;
import hackclient.rise.akd;
import hackclient.rise.aki;
import hackclient.rise.akn;
import hackclient.rise.dk;
import hackclient.rise.dm;
import hackclient.rise.eh;
import hackclient.rise.fs;
import hackclient.rise.gb;
import hackclient.rise.gd;
import hackclient.rise.gg;
import hackclient.rise.gi;
import hackclient.rise.gj;
import hackclient.rise.gl;
import java.awt.Color;

@gl(aliases={"module.render.bpscounter.name"}, description="module.render.bpscounter.description", category=gj.RENDER)
public final class wj
extends gi {
    private final aki alO = new aki("Title", (gi)this, (Boolean)false);
    private final akn alP = new akn("Position", (gi)this, new aka(200.0, 200.0));
    private final akb alQ = new akb(22.0f, 22.0f);
    private akd alR = new akd(0.0, 0.0, 0.0);
    private String alS = "";
    @dm
    public final dk<eh> alT = eh2 -> {
        this.alS = String.valueOf(ahj.a(new akd(wj.aER.bgK.gW, 0.0, wj.aER.bgK.gY).g(this.alR) * 20.0 * (double)wj.aER.bgC.dAp, 2));
        this.alR = new akd(wj.aER.bgK.gW, 0.0, wj.aER.bgK.gY);
    };
    @dm
    public final dk<fs> alU = fs2 -> {
        aka aka2 = this.alP.aqy;
        String string = (Boolean)this.alO.wD() != false ? "BPS " : "";
        String string2 = this.alS;
        float f2 = gb.ks.a(20, gd.kH).bQ(string);
        this.alQ.x = f2 + (float)gb.ks.a(20, gd.kG).bQ(string2);
        this.b(gg.kV, 1).c(() -> {
            double d2 = aka2.x;
            double d3 = aka2.y;
            double d4 = this.alQ.x + 6.0f;
            double d5 = this.alQ.y - 1.0f;
            double d6 = this.rP().pB();
            this.rP();
            ait.c(d2, d3, d4, d5, d6, ady.sa());
            this.alP.n(new aka(this.alQ.x + 6.0f, this.alQ.y - 1.0f));
            double d7 = aka2.x + 3.0;
            double d8 = aka2.y + (double)(this.alQ.y / 2.05f) - (double)(gb.ks.a(20, gd.kG).tF() / 4.0f);
            gb.ks.a(20, gd.kH).b(string, d7, d8, this.rP().rQ().getRGB());
            gb.ks.a(20, gd.kG).b(string2, d7 + (double)f2, d8, Color.WHITE.getRGB());
        });
        this.b(gg.kU).c(() -> ait.c(aka2.x, aka2.y, (double)(this.alQ.x + 6.0f), (double)(this.alQ.y - 1.0f), this.rP().pB(), Color.BLACK));
        this.b(gg.kT).c(() -> ait.c(aka2.x + 0.5, aka2.y + 0.5, (double)(this.alQ.x + 6.0f - 1.0f), (double)(this.alQ.y - 2.0f), this.rP().pB() + 1, this.rP().rU()));
    };
}

