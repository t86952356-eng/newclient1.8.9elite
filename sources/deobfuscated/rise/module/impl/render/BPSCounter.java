/*
 * Decompiled with CFR 0.152.
 */
package rise.module.impl.render;

import hackclient.rise.ady;
import hackclient.rise.ahj;
import hackclient.rise.ait;
import hackclient.rise.akd;
import hackclient.rise.akn;
import hackclient.rise.eh;
import hackclient.rise.gb;
import hackclient.rise.gd;
import hackclient.rise.gg;
import java.awt.Color;
import rise.event.EventLink;
import rise.event.Listener;
import rise.event.impl.Render2DEvent;
import rise.module.Category;
import rise.module.Module;
import rise.module.ModuleInfo;
import rise.util.math.Vector2d;
import rise.util.math.Vector2f;
import rise.value.BooleanValue;

@ModuleInfo(aliases={"module.render.bpscounter.name"}, description="module.render.bpscounter.description", category=Category.RENDER)
public final class BPSCounter
extends Module {
    private final BooleanValue alO = new BooleanValue("Title", (Module)this, (Boolean)false);
    private final akn alP = new akn("Position", (Module)this, new Vector2d(200.0, 200.0));
    private final Vector2f alQ = new Vector2f(22.0f, 22.0f);
    private akd alR = new akd(0.0, 0.0, 0.0);
    private String alS = "";
    @EventLink
    public final Listener<eh> alT = eh2 -> {
        this.alS = String.valueOf(ahj.a(new akd(BPSCounter.aER.bgK.gW, 0.0, BPSCounter.aER.bgK.gY).g(this.alR) * 20.0 * (double)BPSCounter.aER.bgC.dAp, 2));
        this.alR = new akd(BPSCounter.aER.bgK.gW, 0.0, BPSCounter.aER.bgK.gY);
    };
    @EventLink
    public final Listener<Render2DEvent> alU = render2DEvent -> {
        Vector2d vector2d = this.alP.aqy;
        String string = (Boolean)this.alO.wD() != false ? "BPS " : "";
        String string2 = this.alS;
        float f2 = gb.ks.a(20, gd.kH).bQ(string);
        this.alQ.x = f2 + (float)gb.ks.a(20, gd.kG).bQ(string2);
        this.b(gg.kV, 1).c(() -> {
            double d2 = vector2d.x;
            double d3 = vector2d.y;
            double d4 = this.alQ.x + 6.0f;
            double d5 = this.alQ.y - 1.0f;
            double d6 = this.rP().pB();
            this.rP();
            ait.c(d2, d3, d4, d5, d6, ady.sa());
            this.alP.n(new Vector2d(this.alQ.x + 6.0f, this.alQ.y - 1.0f));
            double d7 = vector2d.x + 3.0;
            double d8 = vector2d.y + (double)(this.alQ.y / 2.05f) - (double)(gb.ks.a(20, gd.kG).tF() / 4.0f);
            gb.ks.a(20, gd.kH).b(string, d7, d8, this.rP().rQ().getRGB());
            gb.ks.a(20, gd.kG).b(string2, d7 + (double)f2, d8, Color.WHITE.getRGB());
        });
        this.b(gg.kU).c(() -> ait.c(vector2d.x, vector2d.y, (double)(this.alQ.x + 6.0f), (double)(this.alQ.y - 1.0f), this.rP().pB(), Color.BLACK));
        this.b(gg.kT).c(() -> ait.c(vector2d.x + 0.5, vector2d.y + 0.5, (double)(this.alQ.x + 6.0f - 1.0f), (double)(this.alQ.y - 2.0f), this.rP().pB() + 1, this.rP().rU()));
    };
}

