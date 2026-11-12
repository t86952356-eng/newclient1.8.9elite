/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.ady;
import hackclient.rise.afj;
import hackclient.rise.afk;
import hackclient.rise.ahj;
import hackclient.rise.ais;
import hackclient.rise.ait;
import hackclient.rise.am;
import hackclient.rise.gb;
import hackclient.rise.gd;
import hackclient.rise.gg;
import java.awt.Color;
import net.minecraft.client.gui.cz;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.util.bt;
import rise.Client;
import rise.event.EventLink;
import rise.event.Listener;
import rise.event.impl.PreUpdateEvent;
import rise.event.impl.Render2DEvent;

public class ci
extends am {
    private static final float hy = 150.0f;
    private static final float hz = 10.0f;
    private static final afj hA = new afj(afk.aGW, 50L);
    private static final afj hB = new afj(afk.aHn, 900L);
    public static boolean dj;
    private static boolean fY;
    private static boolean hC;
    private static float hD;
    private static float hE;
    private static boolean hF;
    private static boolean hG;
    private static int hH;
    @EventLink(cH=4)
    public final Listener<PreUpdateEvent> hI = preUpdateEvent -> {
        hC = dj;
        dj = false;
        hH = 0;
    };
    @EventLink
    public final Listener<Render2DEvent> hJ = render2DEvent -> {
        if (fY) {
            return;
        }
        cz cz2 = render2DEvent.dx();
        float f2 = 150.0f * hE;
        float f3 = 10.0f * hE;
        float f4 = (float)cz2.getScaledWidth() * 0.5f - f2 * 0.5f;
        float f5 = (float)cz2.getScaledHeight() * 0.5f + 15.0f;
        hB.Q(!dj && hG ? 1.1 : 1.0);
        hB.h(900L);
        hB.a(afk.aHn);
        double d2 = hB.sV();
        double d3 = 1.0 - 10.0 * Math.abs(1.0 - hB.sV());
        hA.Q(hD);
        ady ady2 = Client.a.k().rP();
        this.b(gg.kV, 1).c(() -> {
            GlStateManager.JV();
            GlStateManager.C((double)(f4 + f2 * 0.5f) * (1.0 - d2), (double)(f5 + f3 * 0.5f) * (1.0 - d2), 0.0);
            GlStateManager.B(d2, d2, 0.0);
            ait.c((double)f4, (double)f5, (double)f2, (double)f3, ady2.pB(), ais.d(ady2.sa(), (int)((double)ady2.sa().getAlpha() * d3)));
            ait.a((double)f4, (double)f5, (double)f2 * hA.sV(), (double)f3, (double)ady2.pB(), ais.d(ady2.rQ(), (int)(255.0 * d3)), ais.d(ady2.rR(), (int)(255.0 * d3)), false);
            if (hF) {
                String string = ahj.a(hA.sV() * 100.0, 1) + "%";
                int n2 = Math.max(12, Math.round(16.0f * hE));
                gb.ks.a(n2, gd.kG).b(string, f4 + f2 - (float)gb.ks.a(n2, gd.kG).bQ(string) - 2.0f * hE, f5 + 3.0f * hE, ais.d(Color.WHITE, (int)(255.0 * d3)).getRGB());
            }
            GlStateManager.JW();
        });
        this.b(gg.kT).c(() -> {
            GlStateManager.JV();
            GlStateManager.C((double)(f4 + f2 * 0.5f) * (1.0 - d2), (double)(f5 + f3 * 0.5f) * (1.0 - d2), 0.0);
            GlStateManager.B(d2, d2, 0.0);
            ait.c((double)(f4 + 0.5f), (double)(f5 + 0.5f), (double)(f2 - 1.0f), (double)(f3 - 1.0f), ady2.pB() + 1, ais.d(this.rP().rU(), (int)((double)this.rP().rU().getAlpha() * d3)));
            GlStateManager.JW();
        });
        this.b(gg.kU).c(() -> {
            GlStateManager.JV();
            GlStateManager.C((double)(f4 + f2 * 0.5f) * (1.0 - d2), (double)(f5 + f3 * 0.5f) * (1.0 - d2), 0.0);
            GlStateManager.B(d2, d2, 0.0);
            ait.c((double)f4, (double)f5, (double)f2, (double)f3, ady2.pB(), ais.d(Color.BLACK, (int)(255.0 * d3)));
            GlStateManager.JW();
        });
        if (!dj && hB.kM()) {
            hA.T(0.0);
            fY = true;
        }
    };

    public static void a(float f2) {
        ci.a(f2, 1.0f, true, true);
    }

    public static void a(float f2, float f3) {
        ci.a(f2, f3, true, true);
    }

    public static void a(float f2, float f3, boolean bl2, boolean bl3) {
        ci.a(f2, f3, bl2, bl3, 0);
    }

    public static void cl() {
        hA.T(0.0);
        hA.R(0.0);
        hA.S(0.0);
        hA.j(System.currentTimeMillis());
    }

    public static void stop() {
        dj = false;
        hC = false;
        fY = true;
        hD = 0.0f;
        ci.cl();
    }

    public static void a(float f2, float f3, boolean bl2, boolean bl3, int n2) {
        if (n2 < hH) {
            return;
        }
        f2 = bt.I(f2, 0.0f, 1.0f);
        float f4 = bt.I(f3, 0.5f, 1.0f);
        boolean bl4 = !hC || fY || hE != f4 || hF != bl2 || hG != bl3;
        hD = f2;
        hE = f4;
        hF = bl2;
        hG = bl3;
        hH = n2;
        fY = false;
        dj = true;
        if (bl4) {
            hB.T(0.95);
            hB.R(0.95);
            hB.S(0.95);
            hA.T(0.0);
            hA.R(0.0);
            hA.S(0.0);
            hA.j(System.currentTimeMillis());
        }
    }

    static {
        fY = true;
        hE = 1.0f;
        hF = true;
        hG = true;
    }
}

