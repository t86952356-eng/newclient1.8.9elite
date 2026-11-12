/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
package hackclient.rise;

import hackclient.rise.ahj;
import hackclient.rise.ais;
import hackclient.rise.ait;
import hackclient.rise.aka;
import hackclient.rise.akg;
import hackclient.rise.bf;
import hackclient.rise.dk;
import hackclient.rise.dm;
import hackclient.rise.fs;
import hackclient.rise.to;
import hackclient.rise.xz;
import java.awt.Color;
import net.minecraft.client.entity.a;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.c;
import net.minecraft.entity.r;
import org.lwjgl.opengl.GL11;

public class aac
extends akg<xz> {
    private xz auR;
    @dm
    public final dk<fs> avl = fs2 -> {
        boolean bl2;
        if (this.auR == null) {
            this.auR = this.e(xz.class);
        }
        c c2 = this.auR.by;
        boolean bl3 = bl2 = !this.auR.aqz || this.auR.rG.T(1000L);
        if (c2 == null || bl2) {
            return;
        }
        String string = c2.xU();
        String string2 = bf.c(string, string);
        double d2 = this.auR.aqy.x;
        double d3 = this.auR.aqy.y;
        ait.d(d2, d3, 140.0, 50.0, new Color(0, 0, 0));
        ait.d(d2 + 0.5, d3 + 0.5, 139.0, 49.0, new Color(60, 60, 60));
        ait.d(d2 + 1.5, d3 + 1.5, 137.0, 47.0, new Color(0, 0, 0));
        ait.d(d2 + 2.0, d3 + 2.0, 136.0, 46.0, new Color(25, 25, 24));
        aac.aER.fontRendererObj.a(string2, d2 + 40.0, d3 + 6.0, Color.WHITE.getRGB());
        GlStateManager.JV();
        GlStateManager.B(0.7, 0.7, 0.7);
        a a2 = (a)c2;
        to to2 = this.e(to.class);
        float f2 = to2 != null && to2.isEnabled() ? to.B(a2) : a2.getHealth();
        aac.aER.fontRendererObj.a("HP: " + Math.round(f2) + " | Dist: " + Math.round(aac.aER.bgK.S(c2)), (d2 + 40.0) * 1.4285714285714286, (d3 + 17.0) * 1.4285714285714286, Color.WHITE.getRGB());
        GlStateManager.JW();
        this.auR.aqw.aHP = new aka(140.0, 50.0);
        double d4 = Math.min(!this.auR.aqz ? 0.0 : ahj.a(f2, 1), (double)a2.getMaxHealth());
        Color color = aac.c(f2, a2.getMaxHealth());
        double d5 = d2 + 40.0;
        ait.d(d5, d3 + 25.0, 91.0, 5.0, ais.d(color, 50));
        ait.d(d5, d3 + 25.0, 91.0 * (d4 / (double)a2.getMaxHealth()), 6.0, color);
        ait.d(d5, d3 + 25.0, 91.0, 1.0, Color.BLACK);
        ait.d(d5, d3 + 30.0, 91.0, 1.0, Color.BLACK);
        for (int i2 = 0; i2 < 10; ++i2) {
            ait.d(d5 + (double)(10 * i2), d3 + 25.0, 1.0, 6.0, Color.BLACK);
        }
        ait.a(d5, d3 + 31.0, -1, a2.Vk());
        ait.a(d5 + 15.0, d3 + 31.0, -1, a2.eG(4));
        ait.a(d5 + 30.0, d3 + 31.0, -1, a2.eG(3));
        ait.a(d5 + 45.0, d3 + 31.0, -1, a2.eG(2));
        ait.a(d5 + 60.0, d3 + 31.0, -1, a2.eG(1));
        GlStateManager.JV();
        GlStateManager.B(0.4, 0.4, 0.4);
        GlStateManager.C((d2 + 20.0) * 2.5, (d3 + 44.0) * 2.5, 100.0);
        aac.a(c2.pl, c2.pm, (r)c2);
        GlStateManager.JW();
    };

    public aac(String string, xz xz2) {
        super(string, xz2);
    }

    private static Color c(float f2, float f3) {
        Color color = new Color(0, 165, 0);
        if (f2 < f3 / 1.5f) {
            color = new Color(200, 200, 0);
        }
        if (f2 < f3 / 2.5f) {
            color = new Color(200, 155, 0);
        }
        if (f2 < f3 / 4.0f) {
            color = new Color(120, 0, 0);
        }
        return color;
    }

    public static void a(float f2, float f3, r r2) {
        GlStateManager.JX();
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        GlStateManager.JB();
        GlStateManager.JV();
        GlStateManager.j(0.0f, 0.0f, 50.0f);
        GlStateManager.i(-50.0f, 50.0f, 50.0f);
        GlStateManager.d(180.0f, 0.0f, 0.0f, 1.0f);
        float f4 = r2.cuF;
        float f5 = r2.pl;
        float f6 = r2.pm;
        float f7 = r2.cuH;
        float f8 = r2.pn;
        GlStateManager.d(135.0f, 0.0f, 1.0f, 0.0f);
        RenderHelper.Lg();
        GlStateManager.d(-135.0f, 0.0f, 1.0f, 0.0f);
        GlStateManager.d((float)(-Math.atan(f3 / 40.0f) * 20.0), 1.0f, 0.0f, 0.0f);
        r2.cuF = f2 - 0.4f;
        r2.pl = f2 - 0.2f;
        r2.pm = f3;
        r2.pn = r2.pl;
        r2.cuH = r2.pl;
        GlStateManager.j(0.0f, 0.0f, 0.0f);
        RenderManager renderManager = aER.BF();
        renderManager.aC(180.0f);
        renderManager.as(false);
        renderManager.e(r2, 0.0, 0.0, 0.0, 0.0f, 1.0f);
        renderManager.as(true);
        r2.cuF = f4;
        r2.pl = f5;
        r2.pm = f6;
        r2.cuH = f7;
        r2.pn = f8;
        GlStateManager.JW();
        RenderHelper.Lf();
        GlStateManager.JT();
        GlStateManager.cN(OpenGlHelper.bMJ);
        GlStateManager.JO();
        GlStateManager.cN(OpenGlHelper.bMI);
        GlStateManager.JX();
    }
}

