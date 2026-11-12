/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.ady;
import hackclient.rise.aec;
import hackclient.rise.ait;
import hackclient.rise.aka;
import hackclient.rise.akb;
import hackclient.rise.aki;
import hackclient.rise.akn;
import hackclient.rise.dk;
import hackclient.rise.dm;
import hackclient.rise.dr;
import hackclient.rise.ei;
import hackclient.rise.fs;
import hackclient.rise.gb;
import hackclient.rise.gd;
import hackclient.rise.gg;
import hackclient.rise.gi;
import hackclient.rise.gj;
import hackclient.rise.gl;
import java.awt.Color;

@gl(aliases={"module.render.cpscounter.name"}, description="module.render.cpscounter.description", category=gj.RENDER)
public final class ww
extends gi {
    private final aki anC = new aki("Title", (gi)this, (Boolean)false);
    private final akn anD = new akn("Position", (gi)this, new aka(200.0, 200.0));
    private final akb anE = new akb(22.0f, 22.0f);
    private final aec<Boolean> anF = new aec(20);
    private boolean anG;
    private int anH;
    @dm
    public final dk<fs> anI = fs2 -> {
        aka aka2 = this.anD.aqy;
        String string = (Boolean)this.anC.wD() != false ? "CPS " : "";
        String string2 = "" + this.anH;
        float f2 = gb.ks.a(20, gd.kH).bQ(string);
        this.anE.x = f2 + (float)gb.ks.a(20, gd.kG).bQ(string2);
        this.b(gg.kV, 1).c(() -> {
            double d2 = aka2.x;
            double d3 = aka2.y;
            double d4 = this.anE.x + 6.0f;
            double d5 = this.anE.y - 1.0f;
            double d6 = this.rP().pB();
            this.rP();
            ait.c(d2, d3, d4, d5, d6, ady.sa());
            this.anD.n(new aka(this.anE.x + 6.0f, this.anE.y - 1.0f));
            double d7 = aka2.x + 3.0;
            double d8 = aka2.y + (double)(this.anE.y / 2.0f) - (double)(gb.ks.a(20, gd.kG).tF() / 4.0f);
            gb.ks.a(20, gd.kH).b(string, d7, d8, this.rP().rQ().getRGB());
            gb.ks.a(20, gd.kG).b(string2, d7 + (double)f2, d8, Color.WHITE.getRGB());
        });
        this.b(gg.kU).c(() -> ait.c(aka2.x, aka2.y, (double)(this.anE.x + 6.0f), (double)(this.anE.y - 1.0f), this.rP().pB(), Color.BLACK));
        this.b(gg.kT).c(() -> ait.c(aka2.x + 0.5, aka2.y + 0.5, (double)(this.anE.x + 6.0f - 1.0f), (double)(this.anE.y - 2.0f), this.rP().pB() + 1, this.rP().rU()));
    };
    @dm
    public final dk<dr> anJ = dr2 -> {
        this.anG = true;
    };
    @dm
    public final dk<ei> anK = ei2 -> {
        this.anH = 0;
        this.anF.add(this.anG);
        this.anF.forEach(bl2 -> {
            if (bl2.booleanValue()) {
                ++this.anH;
            }
        });
        this.anG = false;
    };
}

