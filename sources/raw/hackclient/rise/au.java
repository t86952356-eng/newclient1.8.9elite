/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.abo;
import hackclient.rise.abp;
import hackclient.rise.abq;
import hackclient.rise.abr;
import hackclient.rise.abu;
import hackclient.rise.abv;
import hackclient.rise.abw;
import hackclient.rise.abx;
import hackclient.rise.aby;
import hackclient.rise.ady;
import hackclient.rise.aea;
import hackclient.rise.afj;
import hackclient.rise.afk;
import hackclient.rise.ais;
import hackclient.rise.ait;
import hackclient.rise.akh;
import hackclient.rise.aki;
import hackclient.rise.akj;
import hackclient.rise.akl;
import hackclient.rise.akn;
import hackclient.rise.ako;
import hackclient.rise.akp;
import hackclient.rise.akq;
import hackclient.rise.akr;
import hackclient.rise.gg;
import hackclient.rise.gi;
import java.awt.Color;
import java.util.ArrayList;
import net.minecraft.client.renderer.GlStateManager;

public class au
implements aea {
    public gi cg;
    public akn ch;
    public afj animation = new afj(afk.aHt, 300L);
    public boolean ci;
    public ArrayList<abo> cj = new ArrayList();

    public au(gi gi2, akn akn2) {
        this.cg = gi2;
        this.ch = akn2;
        for (akh<?> akh2 : gi2.getAllValues()) {
            if (akh2 instanceof akp) {
                this.cj.add(new abv(akh2));
                continue;
            }
            if (akh2 instanceof aki) {
                this.cj.add(new abp(akh2));
                continue;
            }
            if (akh2 instanceof akr) {
                this.cj.add(new aby(akh2));
                continue;
            }
            if (akh2 instanceof akq) {
                this.cj.add(new abw(akh2));
                continue;
            }
            if (akh2 instanceof akj) {
                this.cj.add(new abq(akh2));
                continue;
            }
            if (akh2 instanceof akn) {
                this.cj.add(new abx(akh2));
                continue;
            }
            if (akh2 instanceof ako) {
                this.cj.add(new abu(akh2));
                continue;
            }
            if (!(akh2 instanceof akl)) continue;
            this.cj.add(new abr(akh2));
        }
    }

    public void render(int n2, int n3, float f2) {
        double d2 = 100.0;
        double d3 = 100.0;
        this.animation.h(300L);
        this.animation.a(this.ci ? afk.aHm : afk.aHn);
        this.animation.Q(this.ci ? 0.0 : 1.0);
        double d4 = this.animation.sV();
        if (d4 <= 1.0E-4) {
            return;
        }
        this.b(gg.kV).c(() -> {
            GlStateManager.JV();
            GlStateManager.C(this.ch.aqy.x * (1.0 - d4), (this.ch.aqy.y + this.ch.aHP.y / 2.0) * (1.0 - d4), 0.0);
            GlStateManager.B(d4, d4, 1.0);
            double d5 = this.ch.aqy.x - d2 - 10.0;
            double d6 = this.ch.aqy.y + this.ch.aHP.y / 2.0 - d3 / 2.0;
            double d7 = this.rP().pB();
            this.rP();
            Color color = ady.sa();
            double d8 = this.animation.sV();
            this.rP();
            ait.c(d5, d6, d2, d3, d7, ais.d(color, (int)(d8 * (double)ady.sa().getAlpha())));
            for (abo abo2 : this.cj) {
                if (abo2.qi() != null && abo2.qi().wB() != null && !abo2.qi().wB().getAsBoolean()) continue;
            }
            GlStateManager.JW();
        });
        this.b(gg.kU).c(() -> {
            GlStateManager.JV();
            GlStateManager.C(this.ch.aqy.x * (1.0 - d4), (this.ch.aqy.y + this.ch.aHP.y / 2.0) * (1.0 - d4), 0.0);
            GlStateManager.B(d4, d4, 1.0);
            ait.c(this.ch.aqy.x - d2 - 10.0, this.ch.aqy.y + this.ch.aHP.y / 2.0 - d3 / 2.0, d2, d3, this.rP().pB(), Color.BLACK);
            GlStateManager.JW();
        });
    }

    public void close() {
        this.ci = true;
    }
}

