/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
package hackclient.rise;

import hackclient.rise.ahn;
import hackclient.rise.ahx;
import hackclient.rise.aib;
import hackclient.rise.ais;
import hackclient.rise.ait;
import hackclient.rise.akg;
import hackclient.rise.dh;
import hackclient.rise.dk;
import hackclient.rise.dm;
import hackclient.rise.ej;
import hackclient.rise.ek;
import hackclient.rise.es;
import hackclient.rise.fd;
import hackclient.rise.fs;
import hackclient.rise.ft;
import hackclient.rise.gb;
import hackclient.rise.gd;
import hackclient.rise.gk;
import hackclient.rise.mn;
import java.awt.Color;
import java.util.List;
import net.minecraft.block.BlockAir;
import net.minecraft.client.entity.c;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.network.play.client.f;
import org.lwjgl.opengl.GL11;

@gk
public final class ra
extends akg<mn> {
    private aib SL = new aib(0.0, 0.0, 0.0);
    @dm
    public final dk<fd> SM = fd2 -> this.toggle();
    @dm
    public final dk<ek> SN = dh::cF;
    @dm
    public final dk<fs> SO = fs2 -> gb.ks.a(17, gd.kE).c("hold sneak to teleport", (float)ra.aER.jY.getScaledWidth() / 2.0f, (float)ra.aER.jY.getScaledHeight() / 2.0f + 30.0f, this.rP().rQ().getRGB());
    @dm
    public final dk<ft> SP = ft2 -> {
        float f2 = ra.aER.bgC.bWY;
        c c2 = ra.aER.bgK;
        if (c2 == null) {
            return;
        }
        double d2 = Math.toRadians(c2.crM + (c2.pl - c2.crM) * f2);
        double d3 = (double)(ra.aER.bgK.pm + 2.0f) * 1.8;
        double d4 = c2.crF + (c2.gW - c2.crF) * (double)f2 - Math.sin(d2) * d3;
        double d5 = c2.crG + (c2.gX - c2.crG) * (double)f2;
        double d6 = c2.crH + (c2.gY - c2.crH) * (double)f2 + Math.cos(d2) * d3;
        this.SL = new aib(d4, d5, d6);
        Color color = ais.d(this.rP().rQ(), 100);
        if (color.getAlpha() <= 0) {
            return;
        }
        ait.e(color);
        GlStateManager.JV();
        GlStateManager.Jw();
        GlStateManager.tQ();
        GlStateManager.JO();
        GlStateManager.JA();
        GL11.glDepthMask((boolean)false);
        double d7 = 0.14;
        ait.g(c2.Us().ae(-c2.gW, -c2.gX, -c2.gY).ae(d4, d5, d6).ad(d7, d7, d7));
        GlStateManager.JN();
        GlStateManager.Jz();
        GlStateManager.tR();
        GL11.glDepthMask((boolean)true);
        GlStateManager.Jx();
        GlStateManager.JW();
        GlStateManager.JX();
        RenderHelper.Lf();
        ra.aER.bgT.Jj();
    };
    @dm
    public final dk<ej> SQ = ej2 -> {
        if (!ra.aER.aIY.chr.Re()) {
            return;
        }
        aib aib2 = new aib(ra.aER.bgK.gW, ra.aER.bgK.gX, ra.aER.bgK.gY);
        List<aib> list = ahx.a(aib2, this.SL, true);
        if (list == null || list.isEmpty()) {
            return;
        }
        if (ra.aER.bgK.aO) {
            ra.aER.bgK.setPosition(ra.aER.bgK.gW, ra.aER.bgK.gX - 1.0E-4, ra.aER.bgK.gY);
        }
        for (aib aib3 : list) {
            ahn.n(new f(aib3.getX(), aib3.getY(), aib3.getZ(), true));
        }
    };
    @dm
    public final dk<es> SR = es2 -> {
        if (es2.df() instanceof BlockAir) {
            double d2 = es2.dg().wt();
            double d3 = es2.dg().wu();
            double d4 = es2.dg().wx();
            if (d3 < ra.aER.bgK.gX) {
                // empty if block
            }
        }
    };

    public ra(String string, mn mn2) {
        super(string, mn2);
    }
}

