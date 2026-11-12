/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
package hackclient.rise;

import hackclient.rise.ady;
import hackclient.rise.ais;
import hackclient.rise.ait;
import hackclient.rise.aka;
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
import hackclient.rise.wq;
import hackclient.rise.wr;
import hackclient.rise.ws;
import hackclient.rise.xi;
import java.awt.Color;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ThreadLocalRandom;
import net.minecraft.client.renderer.GlStateManager;
import org.lwjgl.opengl.GL11;

@gl(aliases={"module.render.blackholeorbit.name"}, description="module.render.blackholeorbit.description", category=gj.RENDER)
public final class wp
extends gi {
    private final akn amN = new akn("Position", (gi)this, new aka(260.0, 140.0), false);
    private xi amO;
    private static final double amP = 190.0;
    private static final double amQ = 135.0;
    private static final double amR = 120000.0;
    private static final double amS = 3.0;
    private static final double amT = 13.2;
    private static final double amU = 14.0;
    private static final double amV = 4.4;
    private static final double amW = 12.0;
    private static final double amX = 0.12;
    private static final double amY = 2.35;
    private static final double amZ = 4000.0;
    private static final int ana = 8;
    private final wq anb = new wq();
    private final wq anc = new wq();
    private final ws and = new ws(72);
    private final ws ane = new ws(72);
    private final ArrayList<wr> anf = new ArrayList();
    private long ang = -1L;
    @dm
    public final dk<fs> anh = fs2 -> {
        this.amN.n(new aka(190.0, 135.0));
        aka aka2 = this.amN.aqy;
        this.b(gg.kU).c(() -> this.d(aka2));
        this.b(gg.kT).c(() -> this.e(aka2));
        this.b(gg.kV).c(() -> this.c(aka2));
    };

    @Override
    public void onEnable() {
        this.ang = -1L;
        this.lB();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void c(aka aka2) {
        double d2 = this.lC();
        ait.c(aka2.x, aka2.y, 190.0, 135.0, d2, ais.d(ady.sa(), 140));
        String string = this.getName();
        gb.ks.a(18, gd.kH).b(string, aka2.x + 10.0, aka2.y + 11.0, this.rP().rQ().getRGB());
        double d3 = aka2.x + 10.0;
        double d4 = aka2.y + 28.0;
        double d5 = 170.0;
        double d6 = 97.0;
        ait.c(d3, d4, 170.0, 97.0, Math.max(3.0, d2 - 1.0), ais.d(Color.BLACK, 55));
        double d7 = d3 + 85.0;
        double d8 = d4 + 52.38;
        ait.g(d3, d4, 170.0, 97.0);
        try {
            this.b(d3, d4, 170.0, 97.0, d7, d8);
            this.lA();
            this.g(d7, d8);
            this.f(d7, d8);
        }
        finally {
            GL11.glDisable((int)3089);
        }
    }

    private void d(aka aka2) {
        ait.c(aka2.x, aka2.y, 190.0, 135.0, this.lC(), Color.BLACK);
    }

    private void e(aka aka2) {
        double d2 = this.lC();
        ait.c(aka2.x + 0.5, aka2.y + 0.5, 189.0, 134.0, d2, this.rP().rU());
        double d3 = aka2.x + 10.0;
        double d4 = aka2.y + 28.0;
        double d5 = 170.0;
        double d6 = 97.0;
        double d7 = d3 + 85.0;
        double d8 = d4 + 52.38;
        Color color = ais.d(this.rP().rQ(), 55);
        ait.c(d7, d8, 26.0, color);
    }

    private void f(double d2, double d3) {
        Color color = this.rP().rQ();
        Color color2 = this.rP().rR();
        ait.c(d2, d3, 22.0, ais.d(ais.a(color, color2, 0.5), 35));
        ait.c(d2, d3, 18.0, ais.d(ais.a(color2, color, 0.65), 28));
        ait.c(d2, d3, 15.5, ais.d(new Color(10, 10, 12), 255));
        ait.c(d2, d3, 13.0, ais.d(Color.BLACK, 255));
    }

    private void lA() {
        long l2 = System.nanoTime();
        if (this.ang < 0L) {
            this.ang = l2;
            return;
        }
        double d2 = (double)(l2 - this.ang) / 1.0E9;
        this.ang = l2;
        d2 = wp.c(d2, 0.004166666666666667, 0.05);
        this.a(this.anb, d2);
        this.a(this.anc, d2);
        if (this.anb.dj) {
            this.and.h(this.anb.x, this.anb.y);
        }
        if (this.anc.dj) {
            this.ane.h(this.anc.x, this.anc.y);
        }
        Iterator<wr> iterator = this.anf.iterator();
        while (iterator.hasNext()) {
            wr wr2 = iterator.next();
            wr2.ano += d2;
            double d3 = wr2.x * wr2.x + wr2.y * wr2.y + 9.0;
            double d4 = Math.sqrt(d3);
            if (wr2.ano >= wr2.anp || d4 <= 14.0) {
                iterator.remove();
                continue;
            }
            this.a(wr2, d2);
            wr2.anr.h(wr2.x, wr2.y);
        }
    }

    private void a(wq wq2, double d2) {
        if (!wq2.dj) {
            wq2.anm -= d2;
            if (wq2.anm <= 0.0) {
                wq2.dj = true;
                this.a(wq2, wq2.ank);
            }
            return;
        }
        double d3 = wq2.x * wq2.x + wq2.y * wq2.y + 9.0;
        double d4 = Math.sqrt(d3);
        if (d4 <= 14.0) {
            wq2.dj = false;
            wq2.anm = 0.65;
            return;
        }
        double d5 = 1.0 / (d3 * d4);
        double d6 = -120000.0 * wq2.x * d5;
        double d7 = -120000.0 * wq2.y * d5;
        double d8 = 12.0 / d3;
        double d9 = -d8 * wq2.ani;
        double d10 = -d8 * wq2.anj;
        wq2.ani += (d6 + d9) * d2;
        wq2.anj += (d7 + d10) * d2;
        wq2.x += wq2.ani * d2;
        wq2.y += wq2.anj * d2;
        double d11 = d3 * d4;
        double d12 = 240000.0 / d11;
        double d13 = 0.5 * d12 * 0.12 * 0.12;
        double d14 = wp.c(1.0 + d13, 1.0, 6.0);
        if (!wq2.anl && d14 >= 2.35) {
            wq2.anl = true;
            this.b(wq2, d14);
            wq2.dj = false;
            wq2.anm = 1.1;
        }
    }

    private void a(wr wr2, double d2) {
        double d3 = wr2.x * wr2.x + wr2.y * wr2.y + 9.0;
        double d4 = Math.sqrt(d3);
        double d5 = 1.0 / (d3 * d4);
        double d6 = -120000.0 * wr2.x * d5;
        double d7 = -120000.0 * wr2.y * d5;
        double d8 = 19.200000000000003 / d3;
        wr2.ani += (d6 - d8 * wr2.ani) * d2;
        wr2.anj += (d7 - d8 * wr2.anj) * d2;
        wr2.x += wr2.ani * d2;
        wr2.y += wr2.anj * d2;
    }

    private void g(double d2, double d3) {
        this.a(d2, d3, this.anb, this.and, this.rP().rQ());
        this.a(d2, d3, this.anc, this.ane, this.rP().rR());
        for (wr wr2 : this.anf) {
            this.a(d2, d3, wr2);
        }
        ait.c(d2, d3, 13.2, ais.d(Color.WHITE, 10));
    }

    private void a(double d2, double d3, wq wq2, ws ws2, Color color) {
        if (!wq2.dj) {
            return;
        }
        int n2 = ws2.lD();
        if (n2 > 1) {
            for (int i2 = 0; i2 < n2; ++i2) {
                double d4 = (double)i2 / (double)(n2 - 1);
                double d5 = 160.0 * (d4 * d4);
                double d6 = 1.2 + 1.2 * d4;
                double d7 = d2 + ws2.O(i2);
                double d8 = d3 + ws2.P(i2);
                ait.c(d7, d8, d6, ais.d(color, (int)d5));
            }
        }
        double d9 = wq2.x * wq2.x + wq2.y * wq2.y + 9.0;
        double d10 = Math.sqrt(d9);
        double d11 = d9 * d10;
        double d12 = 240000.0 / d11;
        double d13 = -120000.0 / d11;
        double d14 = 0.5 * d12 * 0.12 * 0.12;
        double d15 = 0.5 * d13 * 0.12 * 0.12;
        double d16 = wp.c(1.0 + d14, 1.0, 6.0);
        double d17 = wp.c(1.0 + d15, 0.12, 1.0);
        double d18 = wp.u((d10 - 13.2) / 6.0);
        int n3 = (int)(215.0 * d18);
        double d19 = Math.atan2(wq2.y, wq2.x);
        double d20 = d2 + wq2.x;
        double d21 = d3 + wq2.y;
        Color color2 = ais.d(color, n3);
        this.a(d20, d21, 4.4 * d16, 4.4 * d17, d19, color2);
        Color color3 = ais.d(Color.WHITE, (int)(110.0 * d18));
        this.a(d20 - 0.7, d21 - 0.7, Math.max(1.0, 2.4200000000000004), Math.max(0.8, 1.2320000000000002), d19, color3);
    }

    private void a(double d2, double d3, wr wr2) {
        int n2 = wr2.anr.lD();
        if (n2 > 1) {
            for (int i2 = 0; i2 < n2; ++i2) {
                double d4 = (double)i2 / (double)(n2 - 1);
                double d5 = 110.0 * (d4 * d4);
                double d6 = 0.8 + 0.9 * d4;
                ait.c(d2 + wr2.anr.O(i2), d3 + wr2.anr.P(i2), d6, ais.d(wr2.anq, (int)d5));
            }
        }
        double d7 = wr2.x * wr2.x + wr2.y * wr2.y + 9.0;
        double d8 = Math.sqrt(d7);
        double d9 = d7 * d8;
        double d10 = 240000.0 / d9;
        double d11 = -120000.0 / d9;
        double d12 = 0.5 * d10 * 0.12 * 0.12;
        double d13 = 0.5 * d11 * 0.12 * 0.12;
        double d14 = wp.c(1.0 + d12, 1.0, 5.0);
        double d15 = wp.c(1.0 + d13, 0.18, 1.0);
        double d16 = wp.u(1.0 - wr2.ano / wr2.anp);
        double d17 = wp.u((d8 - 13.2) / 5.0) * d16;
        int n3 = (int)(170.0 * d17);
        double d18 = Math.atan2(wr2.y, wr2.x);
        this.a(d2 + wr2.x, d3 + wr2.y, wr2.ann * d14, wr2.ann * d15, d18, ais.d(wr2.anq, n3));
    }

    private void b(double d2, double d3, double d4, double d5, double d6, double d7) {
        int n2 = (int)Math.ceil(d4 / 8.0);
        int n3 = (int)Math.ceil(d5 / 8.0);
        Color color = ais.d(Color.BLACK, 18);
        Color color2 = ais.d(Color.BLACK, 10);
        Color color3 = ais.d(this.rP().rQ(), 55);
        for (int i2 = 0; i2 < n3; ++i2) {
            for (int i3 = 0; i3 < n2; ++i3) {
                double d8 = d2 + (double)(i3 * 8);
                double d9 = d3 + (double)(i2 * 8);
                double d10 = d8 + 4.0;
                double d11 = d9 + 4.0;
                double d12 = d10 - d6;
                double d13 = d11 - d7;
                double d14 = d12 * d12 + d13 * d13 + 9.0;
                double d15 = 120000.0 / d14;
                if (this.anb.dj) {
                    d15 += 4000.0 / (wp.v(d10 - (d6 + this.anb.x)) + wp.v(d11 - (d7 + this.anb.y)) + 25.0);
                }
                if (this.anc.dj) {
                    d15 += 4000.0 / (wp.v(d10 - (d6 + this.anc.x)) + wp.v(d11 - (d7 + this.anc.y)) + 25.0);
                }
                for (wr wr2 : this.anf) {
                    d15 += 1400.0 / (wp.v(d10 - (d6 + wr2.x)) + wp.v(d11 - (d7 + wr2.y)) + 20.0);
                }
                double d16 = wp.u((d15 - 18.0) / 140.0);
                double d17 = 1.0 / Math.max(1.0, d14);
                double d18 = -120000.0 * d12 * d17 * d17;
                double d19 = -120000.0 * d13 * d17 * d17;
                double d20 = 8.0E-4;
                double d21 = wp.c(d18 * 8.0E-4, -1.6, 1.6);
                double d22 = wp.c(d19 * 8.0E-4, -1.6, 1.6);
                Color color4 = (i3 + i2 & 1) == 0 ? color : color2;
                Color color5 = ais.d(ais.a(color3, color4, d16), (int)(30.0 + 110.0 * d16));
                ait.d(d8 + d21, d9 + d22, 7.0, 7.0, color5);
            }
        }
    }

    private void b(wq wq2, double d2) {
        double d3 = Math.atan2(wq2.y, wq2.x);
        double d4 = Math.cos(d3);
        double d5 = Math.sin(d3);
        double d6 = -d5;
        double d7 = d4;
        int n2 = 9;
        double d8 = 1.6;
        double d9 = wp.c(d2, 1.0, 4.5);
        for (int i2 = 0; i2 < 9; ++i2) {
            double d10 = (double)i2 / 8.0 * 2.0 - 1.0;
            double d11 = d10 * (2.6 * d9);
            double d12 = ThreadLocalRandom.current().nextDouble(-0.8, 0.8);
            wr wr2 = new wr();
            wr2.x = wq2.x + d4 * d11 + d6 * d12;
            wr2.y = wq2.y + d5 * d11 + d7 * d12;
            double d13 = ThreadLocalRandom.current().nextDouble(6.0, 18.0);
            double d14 = ThreadLocalRandom.current().nextDouble(-14.0, 14.0);
            wr2.ani = wq2.ani + -d4 * d13 + d6 * d14 * 0.25;
            wr2.anj = wq2.anj + -d5 * d13 + d7 * d14 * 0.25;
            wr2.ann = ThreadLocalRandom.current().nextDouble(1.0, 1.8);
            wr2.anp = 1.6 + ThreadLocalRandom.current().nextDouble(0.0, 1.0);
            wr2.ano = 0.0;
            wr2.anq = ais.d(ais.a(this.rP().rQ(), this.rP().rR(), ThreadLocalRandom.current().nextDouble()), 255);
            wr2.anr = new ws(54);
            this.anf.add(wr2);
        }
    }

    private void a(double d2, double d3, double d4, double d5, double d6, Color color) {
        GlStateManager.JV();
        GlStateManager.C(d2, d3, 0.0);
        GlStateManager.d((float)Math.toDegrees(d6), 0.0f, 0.0f, 1.0f);
        ait.rJ();
        ais.d(color);
        GL11.glBegin((int)6);
        GL11.glVertex2d((double)0.0, (double)0.0);
        int n2 = 36;
        for (int i2 = 0; i2 <= 36; ++i2) {
            double d7 = (double)i2 / 36.0 * (Math.PI * 2);
            GL11.glVertex2d((double)(Math.cos(d7) * d4), (double)(Math.sin(d7) * d5));
        }
        GL11.glEnd();
        ait.stop();
        GlStateManager.JW();
    }

    private void lB() {
        this.anb.ank = 1;
        this.anc.ank = 2;
        this.a(this.anb, this.anb.ank);
        this.a(this.anc, this.anc.ank);
        this.and.clear();
        this.ane.clear();
        this.anf.clear();
    }

    private void a(wq wq2, int n2) {
        double d2 = n2 == 1 ? 52.0 : 44.0;
        double d3 = ThreadLocalRandom.current().nextDouble(0.0, Math.PI * 2);
        wq2.x = Math.cos(d3) * d2;
        wq2.y = Math.sin(d3) * d2;
        wq2.anl = false;
        wq2.dj = true;
        wq2.anm = 0.0;
        double d4 = Math.sqrt(120000.0 / d2);
        double d5 = -Math.sin(d3);
        double d6 = Math.cos(d3);
        double d7 = (n2 == 1 ? 1.0 : -1.0) * 0.06;
        wq2.ani = d5 * d4 * (1.0 + d7);
        wq2.anj = d6 * d4 * (1.0 + d7);
    }

    private double lC() {
        if (this.amO == null) {
            this.amO = this.e(xi.class);
        }
        return this.amO != null ? this.amO.lU() : 4.0;
    }

    private static double u(double d2) {
        return d2 < 0.0 ? 0.0 : (d2 > 1.0 ? 1.0 : d2);
    }

    private static double c(double d2, double d3, double d4) {
        return d2 < d3 ? d3 : (d2 > d4 ? d4 : d2);
    }

    private static double v(double d2) {
        return d2 * d2;
    }
}

