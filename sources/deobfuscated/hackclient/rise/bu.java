/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.ady;
import hackclient.rise.afj;
import hackclient.rise.afk;
import hackclient.rise.agf;
import hackclient.rise.ais;
import hackclient.rise.ait;
import hackclient.rise.am;
import hackclient.rise.eb;
import hackclient.rise.gb;
import hackclient.rise.gd;
import hackclient.rise.gg;
import java.awt.Color;
import net.minecraft.client.gui.cz;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.player.g;
import net.minecraft.item.af;
import net.minecraft.item.co;
import net.minecraft.item.d;
import rise.event.EventLink;
import rise.event.Listener;
import rise.event.impl.PreUpdateEvent;
import rise.event.impl.Render2DEvent;

public final class bu
extends am {
    private static final afj fW = new afj(afk.aHn, 900L);
    private static boolean fX = true;
    public static boolean fY = true;
    public static boolean dj;
    private static boolean fZ;
    private static co ga;
    private static boolean gb;
    private static String gc;
    private static double gd;
    private final agf ge = hackclient.rise.gb.ks.a(18, hackclient.rise.gd.kE);
    private final agf gf = hackclient.rise.gb.ks.a(18, hackclient.rise.gd.kF);
    @EventLink(cH=4)
    public final Listener<eb> gg = eb2 -> {
        g g2 = bu.aER.bgK.cHV;
        eb2.setSlot(g2.cJG ? g2.cJF : g2.cJE);
    };
    @EventLink(cH=4)
    public final Listener<PreUpdateEvent> gh = preUpdateEvent -> {
        g g2 = bu.aER.bgK.cHV;
        g2.cJG = false;
        g2.cJF = g2.cJE;
    };
    @EventLink(cH=4)
    public final Listener<Render2DEvent> gi = render2DEvent -> {
        boolean bl2;
        boolean bl3;
        if (fY || bu.aER.bgK == null || !fX) {
            return;
        }
        co co2 = bu.bO();
        co co3 = co2 != null && bu.aER.bgK.cHV.cJG ? co2 : null;
        boolean bl4 = bl3 = co3 != null && co3.cWZ > 0 && bu.aER.bgK.cHV.cJG && (bu.aER.bgK.cHV.cJF != bu.aER.bgK.cHV.cJE || bu.bO() == null || bu.bO() != null && bu.bO().bP() instanceof af) && bu.aER.bgR == null;
        if (bl3 != fZ) {
            fW.T(bl3 ? 1.1 : 1.0);
        }
        fZ = bl3;
        if (bl3 && co3 != null) {
            ga = co3;
            gb = co3.bP() instanceof af;
            gc = gb ? String.valueOf(bu.bN()) : String.valueOf(co3.cWZ);
            gd = this.a(gb, gc);
        }
        fW.h(900L);
        fW.Q(bl3 ? 1.0 : 1.1);
        double d2 = fW.sV();
        double d3 = 1.0 - 10.0 * Math.abs(1.0 - d2);
        d3 = Math.max(0.0, Math.min(1.0, d3));
        boolean bl5 = bl2 = bl3 ? co3.bP() instanceof af : gb;
        String string = bl3 ? (bl2 ? String.valueOf(bu.bN()) : String.valueOf(co3.cWZ)) : gc;
        co co4 = bl3 ? co3 : ga;
        double d4 = bl3 ? this.a(bl2, string) : gd;
        cz cz2 = render2DEvent.dx();
        int n2 = 3;
        double d5 = 22.0;
        double d6 = (double)cz2.getScaledWidth() / 2.0 - d4 / 2.0;
        double d7 = cz2.getScaledHeight() - 90;
        double d8 = d7 + 11.0 - (double)this.ge.tF() / 2.0 + 3.0;
        if (d3 > 0.01 && co4 != null) {
            if (d3 > 0.15) {
                this.b(hackclient.rise.gg.kU).c(() -> {
                    GlStateManager.JV();
                    GlStateManager.C((d6 + d4 * 0.5) * (1.0 - d2), (d7 + 11.0) * (1.0 - d2), 0.0);
                    GlStateManager.B(d2, d2, d2);
                    ait.c(d6, d7, d4, 22.0, this.rP().pB(), Color.BLACK);
                    GlStateManager.JW();
                });
            }
            double d9 = d3;
            this.b(hackclient.rise.gg.kV, 1).c(() -> {
                GlStateManager.JV();
                GlStateManager.C((d6 + d4 * 0.5) * (1.0 - d2), (d7 + 11.0) * (1.0 - d2), 0.0);
                GlStateManager.B(d2, d2, d2);
                double d8 = this.rP().pB();
                this.rP();
                Color color = ady.sa();
                this.rP();
                ait.c(d6, d7, d4, 22.0, d8, ais.d(color, (int)((double)ady.sa().getAlpha() * d9)));
                if (bl2) {
                    float f2 = this.ge.bQ("Amount:") + 2;
                    this.ge.b("Amount:", d6 + 6.0 + 16.0, d8, ais.d(Color.WHITE, (int)(255.0 * d9)).getRGB());
                    this.gf.b(string, d6 + 6.0 + 16.0 + (double)f2, d8, ais.d(this.rP().rQ(), (int)(255.0 * d9)).getRGB());
                }
                ait.a(d6 + 3.0, d7 + 3.0, ais.d(Color.WHITE, (int)(255.0 * d9)).getRGB(), co4);
                GlStateManager.JW();
            });
            double d10 = d3;
            this.b(hackclient.rise.gg.kT).c(() -> {
                GlStateManager.JV();
                GlStateManager.C((d6 + d4 * 0.5) * (1.0 - d2), (d7 + 11.0) * (1.0 - d2), 0.0);
                GlStateManager.B(d2, d2, 0.0);
                ait.c(d6 + 0.5, d7 + 0.5, d4 - 1.0, 21.0, this.rP().pB() + 1, ais.d(this.rP().rU(), (int)((double)this.rP().rU().getAlpha() * d10)));
                GlStateManager.JW();
            });
        }
        if (!bl3 && fW.kM() && d2 >= 1.099) {
            fY = true;
        }
    };

    public static void setSlot(int n2) {
        bu.b(n2, true);
    }

    public static void b(int n2, boolean bl2) {
        if (n2 < 0 || n2 >= 9) {
            return;
        }
        dj = true;
        g g2 = bu.aER.bgK.cHV;
        g2.cJF = n2;
        g2.cJG = true;
        fX = bl2;
        fY = false;
        fW.T(1.1);
        bu.aER.bgu.Ht();
        dj = false;
    }

    public static void c(int n2, boolean bl2) {
        bu.a(n2, bl2, true);
    }

    public static void a(int n2, boolean bl2, boolean bl3) {
        if (Math.random() * Math.random() > 0.25 || bl2) {
            bu.b(bu.aER.bgu.bDC, bl3);
        } else {
            bu.b(n2, bl3);
        }
    }

    private double a(boolean bl2, String string) {
        int n2 = 3;
        float f2 = this.ge.bQ("Amount:") + 2;
        return 22.0f + (bl2 ? f2 + (float)this.gf.bQ(string) + 2.0f + 3.0f : 0.0f);
    }

    private static int bN() {
        if (bu.aER.bgK == null) {
            return 0;
        }
        int n2 = 0;
        g g2 = bu.aER.bgK.cHV;
        for (int i2 = 0; i2 < 9; ++i2) {
            co co2 = g2.cJC[i2];
            if (co2 == null || !(co2.bP() instanceof af)) continue;
            n2 += co2.cWZ;
        }
        return n2;
    }

    public static co bO() {
        return bu.aER.bgK == null || bu.aER.bgK.cHX == null ? null : bu.aER.bgK.cHX.fM(bu.bQ() + 36).ls();
    }

    public static d bP() {
        co co2 = bu.bO();
        return co2 == null ? null : co2.bP();
    }

    public static int bQ() {
        g g2 = bu.aER.bgK.cHV;
        return g2.cJG ? g2.cJF : g2.cJE;
    }

    static {
        fZ = false;
        ga = null;
        gb = false;
        gc = "0";
        gd = 38.0;
    }
}

