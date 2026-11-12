/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.ady;
import hackclient.rise.aec;
import hackclient.rise.afj;
import hackclient.rise.afk;
import hackclient.rise.agf;
import hackclient.rise.ais;
import hackclient.rise.ait;
import hackclient.rise.ajw;
import hackclient.rise.aka;
import hackclient.rise.am;
import hackclient.rise.dk;
import hackclient.rise.dm;
import hackclient.rise.ei;
import hackclient.rise.fs;
import hackclient.rise.gb;
import hackclient.rise.gd;
import hackclient.rise.gg;
import java.awt.Color;
import net.minecraft.client.renderer.GlStateManager;
import rip.vantage.commons.util.time.a;

public class cg
extends am {
    private static final aec<ajw<String, String, Integer>> hi = new aec(5);
    private static final a hj = new a();
    private static ajw<String, String, Integer> hk;
    private static final afj hl;
    private static final aka hm;
    private static final aka hn;
    private static final aka ho;
    private static final double hp;
    private static final agf hq;
    private static final agf hr;
    @dm(cH=4)
    public final dk<fs> hs = fs2 -> {
        if (hk == null) {
            return;
        }
        boolean bl2 = hj.T(hk.wk().intValue());
        hl.Q(bl2 ? 1.1 : 1.0);
        hl.h(500L);
        hl.a(afk.aHn);
        double d2 = hl.sV();
        double d3 = 1.0 - 10.0 * Math.abs(1.0 - hl.sV());
        if (hl.kM() && bl2) {
            return;
        }
        this.b(gg.kV, 1).c(() -> {
            GlStateManager.JV();
            GlStateManager.C((cg.ho.x + cg.hm.x / 2.0) * (1.0 - d2), (cg.ho.y + cg.hm.y / 2.0) * (1.0 - d2), 0.0);
            GlStateManager.B(d2, d2, 0.0);
            double d4 = cg.ho.x;
            double d5 = cg.ho.y;
            double d6 = cg.hm.x;
            double d7 = cg.hm.y;
            this.rP();
            Color color = ady.sa();
            this.rP();
            ait.c(d4, d5, d6, d7, 10.0, ais.d(color, (int)((double)ady.sa().getAlpha() * d3)));
            ait.c(cg.ho.x + hp, cg.ho.y + hp, cg.hn.x, cg.hn.y, 6.0, ais.d(Color.WHITE, (int)(255.0 * d3)));
            hq.b(hk.wi(), cg.ho.x + hp + cg.hn.x + hp, cg.ho.y + hp + 3.0, ais.d(this.rP().rQ(), (int)(255.0 * d3)).getRGB());
            hr.b(hk.wj(), cg.ho.x + hp + cg.hn.x + hp, cg.ho.y + hp + 0.5 + hp * 0.7 + (double)hq.tF(), ais.d(Color.WHITE, (int)(255.0 * d3)).getRGB());
            GlStateManager.JW();
        });
        this.b(gg.kT).c(() -> {
            GlStateManager.JV();
            GlStateManager.C((cg.ho.x + cg.hm.x / 2.0) * (1.0 - d2), (cg.ho.y + cg.hm.y / 2.0) * (1.0 - d2), 0.0);
            GlStateManager.B(d2, d2, 0.0);
            ait.c(cg.ho.x + 0.5, cg.ho.y + 0.5, cg.hm.x - 1.0, cg.hm.y - 1.0, 11.0, ais.d(this.rP().rU(), (int)((double)this.rP().rU().getAlpha() * d3)));
            GlStateManager.JW();
        });
        this.b(gg.kU).c(() -> {
            if (Math.abs(hl.sV() - 1.0) > 0.045) {
                return;
            }
            GlStateManager.JV();
            GlStateManager.C((cg.ho.x + cg.hm.x / 2.0) * (1.0 - d2), (cg.ho.y + cg.hm.y / 2.0) * (1.0 - d2), 0.0);
            GlStateManager.B(d2, d2, 0.0);
            ait.c(cg.ho.x, cg.ho.y, cg.hm.x, cg.hm.y, 10.0, ais.d(Color.BLACK, (int)(255.0 * d3)));
            GlStateManager.JW();
        });
    };
    @dm(cH=4)
    public final dk<ei> ht = ei2 -> {
        if (cg.aER.bgK.aRg % 5 != 0) {
            return;
        }
        if (!hi.isEmpty() && (hk == null || hj.T(hk.wk() + 200))) {
            if (hk != null) {
                hi.remove(hk);
            }
            if (!hi.isEmpty()) {
                hk = (ajw)hi.get(0);
                hj.aX();
            }
            cg.hm.x = Math.max(140.0, (double)hr.bQ(hk.wj()) + hp * 3.0 + cg.hn.x + 2.0);
        }
    };

    public static void e(String string, String string2) {
        cg.a(string, string2, 3000);
    }

    public static void a(String string, String string2, Integer n2) {
        hi.add(new ajw<String, String, Integer>(string, string2, n2));
    }

    static {
        hl = new afj(afk.aHn, 900L);
        hm = new aka(140.0, 30.0);
        hn = new aka(20.0, 20.0);
        ho = new aka(5.0, 126.0);
        hp = (cg.hm.y - cg.hn.y) / 2.0;
        hq = gb.ks.a(15, gd.kH);
        hr = gb.ks.a(15, gd.kE);
    }
}

