/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 *  org.lwjgl.opengl.GL11
 */
package hackclient.rise;

import hackclient.rise.ais;
import hackclient.rise.aiy;
import hackclient.rise.akd;
import java.awt.Color;
import lombok.Generated;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.b;
import net.minecraft.client.gui.cz;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.client.renderer.culling.Frustum;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.shader.a;
import net.minecraft.entity.c;
import net.minecraft.entity.r;
import net.minecraft.item.co;
import net.minecraft.util.cm;
import net.minecraft.util.da;
import org.lwjgl.opengl.GL11;
import rise.Client;
import rise.event.impl.AttackEvent;
import rise.util.InstanceAccess;

public final class ait
implements InstanceAccess {
    private static final Frustum aQe = new Frustum();
    private static final RenderManager aQf = aER.BF();
    public static final int aQg = 22;

    public static akd vW() {
        return new akd(-RenderManager.bVA, -RenderManager.bVB, -RenderManager.bVC);
    }

    public static void a(cm cm2, float f2, float f3, int n2, int n3, int n4, int n5, int n6, int n7, float f4, float f5) {
        Minecraft minecraft = Minecraft.getMinecraft();
        minecraft.Bq().a(cm2);
        GL11.glTexParameteri((int)3553, (int)10242, (int)33071);
        GL11.glTexParameteri((int)3553, (int)10243, (int)33071);
        GL11.glTexParameteri((int)3553, (int)10241, (int)9728);
        GL11.glTexParameteri((int)3553, (int)10240, (int)9728);
        GlStateManager.JD();
        GlStateManager.an(false);
        GlStateManager.tQ();
        GlStateManager.h(770, 771, 1, 0);
        GlStateManager.tL();
        GlStateManager.JS();
        GlStateManager.e(1.0f, 1.0f, 1.0f, 1.0f);
        float f6 = (float)n2 / (float)n6;
        float f7 = (float)n3 / (float)n7;
        float f8 = (float)(n2 + n4) / (float)n6;
        float f9 = (float)(n3 + n5) / (float)n7;
        GL11.glBegin((int)7);
        GL11.glTexCoord2f((float)f6, (float)f7);
        GL11.glVertex2f((float)f2, (float)f3);
        GL11.glTexCoord2f((float)f6, (float)f9);
        GL11.glVertex2f((float)f2, (float)(f3 + f5));
        GL11.glTexCoord2f((float)f8, (float)f9);
        GL11.glVertex2f((float)(f2 + f4), (float)(f3 + f5));
        GL11.glTexCoord2f((float)f8, (float)f7);
        GL11.glVertex2f((float)(f2 + f4), (float)f3);
        GL11.glEnd();
        GlStateManager.an(true);
        GlStateManager.JE();
    }

    public static void rJ() {
        GlStateManager.tQ();
        GlStateManager.P(770, 771);
        GlStateManager.JO();
        GlStateManager.JI();
        GlStateManager.Jy();
        GlStateManager.JD();
    }

    public static void stop() {
        GlStateManager.JE();
        GlStateManager.tL();
        GlStateManager.JH();
        GlStateManager.JN();
        GlStateManager.tR();
        GlStateManager.JX();
    }

    public static void d(double d2, double d3, double d4, double d5, Color color) {
        ait.rJ();
        if (color != null) {
            ais.d(color);
        }
        GL11.glBegin((int)7);
        GL11.glVertex2d((double)d2, (double)d3);
        GL11.glVertex2d((double)(d2 + d4), (double)d3);
        GL11.glVertex2d((double)(d2 + d4), (double)(d3 + d5));
        GL11.glVertex2d((double)d2, (double)(d3 + d5));
        GL11.glEnd();
        ait.stop();
    }

    public static void E(r r2) {
        Client.a.e().d(new AttackEvent(r2));
        if (!ait.aER.bgK.cup || ait.aER.bgK.cuq >= ait.aER.bgK.VU() / 2 || ait.aER.bgK.cuq < 0) {
            ait.aER.bgK.cuq = -1;
            ait.aER.bgK.cup = true;
        }
        if (ait.aER.bgK.csf > 0.0f) {
            ait.aER.bgK.E(r2);
        }
    }

    public static void rainbowRectangle(double d2, double d3, double d4, double d5) {
        ait.rJ();
        GL11.glBegin((int)7);
        for (double d6 = d2; d6 <= d2 + d4; d6 += 0.5) {
            ait.e(Color.getHSBColor((float)((d6 - d2) / d4), 1.0f, 1.0f));
            GL11.glVertex2d((double)d6, (double)d3);
            GL11.glVertex2d((double)(d6 + 0.5), (double)d3);
            GL11.glVertex2d((double)(d6 + 0.5), (double)(d3 + d5));
            GL11.glVertex2d((double)d6, (double)(d3 + d5));
        }
        GL11.glEnd();
        ait.stop();
    }

    public static void rectangle(double d2, double d3, double d4, double d5) {
        ait.d(d2, d3, d4, d5, null);
    }

    public static void e(double d2, double d3, double d4, double d5, Color color) {
        ait.d(d2 - d4 / 2.0, d3 - d5 / 2.0, d4, d5, color);
    }

    public static void centeredRectangle(double d2, double d3, double d4, double d5) {
        ait.d(d2 - d4 / 2.0, d3 - d5 / 2.0, d4, d5, null);
    }

    public static void a(double d2, double d3, double d4, double d5, Color color, Color color2) {
        ait.rJ();
        GlStateManager.e(516, 0.0f);
        GL11.glShadeModel((int)7425);
        GL11.glBegin((int)7);
        ais.d(color);
        GL11.glVertex2d((double)d2, (double)d3);
        GL11.glVertex2d((double)(d2 + d4), (double)d3);
        ais.d(color2);
        GL11.glVertex2d((double)(d2 + d4), (double)(d3 + d5));
        GL11.glVertex2d((double)d2, (double)(d3 + d5));
        GL11.glEnd();
        GL11.glShadeModel((int)7424);
        ait.stop();
    }

    public static void aC(int n2) {
        GL11.glBegin((int)n2);
    }

    public static void b(double d2, double d3, double d4, double d5, Color color, Color color2) {
        ait.a(d2 -= d4 / 2.0, d3 -= d5 / 2.0, d4, d5, color, color2);
    }

    public static void c(double d2, double d3, double d4, double d5, Color color, Color color2) {
        ait.rJ();
        GL11.glShadeModel((int)7425);
        GL11.glBegin((int)7);
        ais.d(color);
        GL11.glVertex2d((double)d2, (double)d3);
        GL11.glVertex2d((double)d2, (double)(d3 + d5));
        ais.d(color2);
        GL11.glVertex2d((double)(d2 + d4), (double)(d3 + d5));
        GL11.glVertex2d((double)(d2 + d4), (double)d3);
        GL11.glEnd();
        GL11.glShadeModel((int)7424);
        ait.stop();
    }

    public static void d(double d2, double d3, double d4, double d5, Color color, Color color2) {
        ait.c(d2 - d4 / 2.0, d3 - d5 / 2.0, d4, d5, color, color2);
    }

    public static void a(cm cm2, float f2, float f3, float f4, float f5, Color color) {
        GL11.glTexParameteri((int)3553, (int)10241, (int)9728);
        GL11.glTexParameteri((int)3553, (int)10240, (int)9728);
        GlStateManager.tQ();
        GlStateManager.tL();
        GlStateManager.e(516, 0.0f);
        ait.e(color);
        OpenGlHelper.p(770, 771, 1, 0);
        aER.Bq().a(cm2);
        b.drawModalRectWithCustomSizedTexture(f2, f3, 0.0f, 0.0f, f4, f5, f4, f5);
        GlStateManager.JX();
        GlStateManager.tR();
    }

    public static void a(int n2, float f2, float f3, float f4, float f5, Color color) {
        GL11.glTexParameteri((int)3553, (int)10241, (int)9728);
        GL11.glTexParameteri((int)3553, (int)10240, (int)9728);
        GlStateManager.tQ();
        GlStateManager.tL();
        GlStateManager.e(516, 0.0f);
        ait.e(color);
        OpenGlHelper.p(770, 771, 1, 0);
        aER.Bq().dz(n2);
        b.drawModalRectWithCustomSizedTexture(f2, f3, 0.0f, 0.0f, f4, f5, f4, f5);
        GlStateManager.JX();
        GlStateManager.tR();
    }

    public static void a(cm cm2, double d2, double d3, double d4, double d5, Color color) {
        ait.a(cm2, (float)d2, (float)d3, (float)d4, (float)d5, color);
    }

    public static void a(cm cm2, float f2, float f3, float f4, float f5) {
        ait.a(cm2, f2, f3, f4, f5, Color.WHITE);
    }

    public static void a(cm cm2, double d2, double d3, double d4, double d5) {
        ait.a(cm2, (float)d2, (float)d3, (float)d4, (float)d5);
    }

    public static void a(int n2, double d2, double d3, double d4, double d5, double d6, double d7) {
        GlStateManager.e(516, 0.0f);
        GlStateManager.tQ();
        GlStateManager.tL();
        for (float f2 = 0.0f; f2 <= (float)n2 / 2.0f; f2 += 0.5f) {
            ait.c(d2 - (double)(f2 / 2.0f), d3 - (double)(f2 / 2.0f), d4 + (double)f2, d5 + (double)f2, d7, new Color(0, 0, 0, (int)Math.max(0.5, (d6 - (double)f2 * 1.2) / 5.5)));
        }
    }

    public static void f(double d2, double d3, double d4, double d5) {
        GL11.glColor4d((double)d2, (double)d3, (double)d4, (double)d5);
    }

    public static void r(double d2, double d3, double d4) {
        ait.f(d2, d3, d4, 1.0);
    }

    public static void e(Color color) {
        if (color == null) {
            color = Color.white;
        }
        ait.f((float)color.getRed() / 255.0f, (float)color.getGreen() / 255.0f, (float)color.getBlue() / 255.0f, (float)color.getAlpha() / 255.0f);
    }

    public static void e(Color color, int n2) {
        if (color == null) {
            color = Color.white;
        }
        ait.f((float)color.getRed() / 255.0f, (float)color.getGreen() / 255.0f, (float)color.getBlue() / 255.0f, 0.5);
    }

    public static void a(double d2, double d3, double d4, double d5, boolean bl2, Color color) {
        d4 /= 2.0;
        ait.rJ();
        if (color != null) {
            ait.e(color);
        }
        if (!bl2) {
            GL11.glLineWidth((float)2.0f);
        }
        GL11.glEnable((int)2848);
        ait.aC(bl2 ? 6 : 3);
        for (double d6 = 0.0; d6 <= d5 / 4.0; d6 += 1.0) {
            double d7 = d6 * 4.0 * (Math.PI * 2) / 360.0;
            GL11.glVertex2d((double)(d2 + d4 * Math.cos(d7) + d4), (double)(d3 + d4 * Math.sin(d7) + d4));
        }
        ait.vX();
        GL11.glDisable((int)2848);
        ait.stop();
    }

    public static void a(double d2, double d3, double d4, int n2, boolean bl2) {
        ait.a(d2, d3, d4, (double)n2, bl2, null);
    }

    public static void a(double d2, double d3, double d4, int n2, Color color) {
        ait.a(d2, d3, d4, (double)n2, true, color);
    }

    public static void a(double d2, double d3, double d4, int n2) {
        ait.a(d2, d3, d4, (double)n2, true, null);
    }

    public static void a(double d2, double d3, double d4, int n2, boolean bl2, Color color) {
        ait.a(d2 -= d4 / 2.0, d3 -= d4 / 2.0, d4, (double)n2, bl2, color);
    }

    public static void b(double d2, double d3, double d4, int n2, boolean bl2) {
        ait.a(d2 -= d4 / 2.0, d3 -= d4 / 2.0, d4, (double)n2, bl2, null);
    }

    public static void b(double d2, double d3, double d4, int n2, Color color) {
        ait.a(d2 -= d4 / 2.0, d3 -= d4 / 2.0, d4, (double)n2, true, color);
    }

    public static void b(double d2, double d3, double d4, int n2) {
        ait.a(d2 -= d4 / 2.0, d3 -= d4 / 2.0, d4, (double)n2, true, null);
    }

    public static void a(double d2, double d3, double d4, boolean bl2, Color color) {
        ait.a(d2, d3, d4, 3.0, bl2, color);
    }

    public static void b(double d2, double d3, double d4, boolean bl2) {
        ait.a(d2, d3, d4, 3, bl2);
    }

    public static void a(double d2, double d3, double d4, Color color) {
        ait.a(d2, d3, d4, 3, color);
    }

    public static void s(double d2, double d3, double d4) {
        ait.a(d2, d3, d4, 3);
    }

    public static void b(double d2, double d3, double d4, boolean bl2, Color color) {
        ait.a(d2 -= d4 / 2.0, d3 -= d4 / 2.0, d4, 3.0, bl2, color);
    }

    public static void c(double d2, double d3, double d4, boolean bl2) {
        ait.a(d2 -= d4 / 2.0, d3 -= d4 / 2.0, d4, 3, bl2);
    }

    public static void b(double d2, double d3, double d4, Color color) {
        ait.a(d2 -= d4 / 2.0, d3 -= d4 / 2.0, d4, 3, color);
    }

    public static void t(double d2, double d3, double d4) {
        ait.a(d2 -= d4 / 2.0, d3 -= d4 / 2.0, d4, 3);
    }

    public static void a(double d2, double d3, int n2, co co2) {
        if (co2 != null) {
            GlStateManager.JV();
            GlStateManager.JS();
            GlStateManager.tQ();
            GlStateManager.h(770, 771, 1, 0);
            RenderHelper.Lh();
            aER.BG().b(co2, n2, d2, d3);
            GlStateManager.JT();
            GlStateManager.tR();
            RenderHelper.Lf();
            GlStateManager.JW();
        }
    }

    public static void a(double d2, double d3, double d4, double d5, double d6, Color color, Color color2, boolean bl2) {
        aiy.aQv.c(d2, d3, d4, d5, d6, color, color2, bl2);
    }

    public static void b(double d2, double d3, double d4, double d5, double d6, Color color, Color color2, boolean bl2) {
        aiy.aQA.c(d2, d3, d4, d5, d6, color, color2, bl2);
    }

    public static void a(double d2, double d3, double d4, double d5, double d6, Color color, Color color2, boolean bl2, boolean bl3, boolean bl4, boolean bl5, boolean bl6) {
        aiy.aQA.a((float)d2, (float)d3, (float)d4, (float)d5, (float)d6, color, color2, bl2, bl3, bl4, bl5, bl6);
    }

    public static void a(double d2, double d3, double d4, double d5, double d6, Color color, Color color2, Color color3, boolean bl2, boolean bl3, boolean bl4, boolean bl5, boolean bl6) {
        aiy.aQB.a((float)d2, (float)d3, (float)d4, (float)d5, (float)d6, color, color2, color3, bl2, bl3, bl4, bl5, bl6);
    }

    public static void b(double d2, double d3, double d4, double d5, double d6, Color color, Color color2, boolean bl2, boolean bl3, boolean bl4, boolean bl5, boolean bl6) {
        aiy.aQv.c(d2, d3, d4, d5, d6, color, color2, bl2, bl3, bl4, bl5, bl6);
    }

    public static void c(double d2, double d3, double d4, double d5, double d6, Color color) {
        aiy.aQu.d((float)d2, (float)d3, (float)d4, (float)d5, (float)d6, color);
    }

    public static void a(double d2, double d3, double d4, double d5, double d6, Color color, boolean bl2, boolean bl3, boolean bl4, boolean bl5) {
        aiy.aQu.a((float)d2, (float)d3, (float)d4, (float)d5, (float)d6, color, bl2, bl3, bl4, bl5);
    }

    public static void a(double d2, double d3, double d4, double d5, double d6, double d7, Color color) {
        aiy.aQw.b(d2, d3, d4, d5, d6, d7, color);
    }

    public static void a(double d2, double d3, double d4, double d5, double d6, double d7, Color color, Color color2) {
        aiy.aQx.b(d2, d3, d4, d5, d6, d7, color, color2);
    }

    public static void vX() {
        GL11.glEnd();
    }

    public static void c(double d2, double d3, double d4, Color color) {
        ait.c(d2 - d4, d3 - d4, d4 * 2.0, d4 * 2.0, d4, color);
    }

    public static void f(double d2, double d3, double d4, double d5, Color color) {
        ais.d(color);
        GL11.glBegin((int)7);
        GL11.glVertex2d((double)d2, (double)d3);
        GL11.glVertex2d((double)(d2 + d4), (double)d3);
        GL11.glVertex2d((double)(d2 + d4), (double)(d3 + d5));
        GL11.glVertex2d((double)d2, (double)(d3 + d5));
        GL11.glEnd();
    }

    public static void g(double d2, double d3, double d4, double d5) {
        cz cz2 = ait.aER.jY;
        double d6 = cz2.getScaleFactor();
        d3 = (double)cz2.getScaledHeight() - d3;
        GL11.glEnable((int)3089);
        GL11.glScissor((int)((int)(d2 *= d6)), (int)((int)((d3 *= d6) - (d5 *= d6))), (int)((int)(d4 *= d6)), (int)((int)d5));
    }

    public static void vY() {
        GL11.glDisable((int)3089);
    }

    public static void a(double d2, double d3, double d4, double d5, double d6, double d7, Color color, float f2) {
        aER.BF();
        d2 -= RenderManager.bVA;
        aER.BF();
        d5 -= RenderManager.bVA;
        aER.BF();
        d3 -= RenderManager.bVB;
        aER.BF();
        d6 -= RenderManager.bVB;
        aER.BF();
        d4 -= RenderManager.bVC;
        aER.BF();
        d7 -= RenderManager.bVC;
        GL11.glPushMatrix();
        GL11.glEnable((int)3042);
        GL11.glEnable((int)2848);
        GL11.glDisable((int)3553);
        GL11.glBlendFunc((int)770, (int)771);
        GL11.glEnable((int)3042);
        GL11.glLineWidth((float)f2);
        ait.e(color);
        GL11.glBegin((int)2);
        GL11.glVertex3d((double)d2, (double)d3, (double)d4);
        GL11.glVertex3d((double)d5, (double)d6, (double)d7);
        GL11.glEnd();
        GL11.glDisable((int)3042);
        GL11.glEnable((int)3553);
        GL11.glDisable((int)2848);
        GL11.glDisable((int)3042);
        GL11.glPopMatrix();
        ait.e(Color.WHITE);
    }

    public static boolean x(c c2) {
        return ait.f(c2.Us()) || c2.csK;
    }

    public static boolean f(net.minecraft.util.a a2) {
        c c2 = aER.BC();
        aQe.setPosition(c2.gW, c2.gX, c2.gY);
        return aQe.k(a2);
    }

    public static a a(a a2) {
        if (a2 == null || a2.cmc != ait.aER.bgz || a2.cmd != ait.aER.bgA) {
            if (a2 != null) {
                a2.Rk();
            }
            return new a(ait.aER.bgz, ait.aER.bgA, false);
        }
        return a2;
    }

    public static da u(double d2, double d3, double d4) {
        aER.BF();
        aER.BF();
        aER.BF();
        return new da(d2 -= RenderManager.bVA, d3 -= RenderManager.bVB, d4 -= RenderManager.bVC);
    }

    public static void g(da da2) {
        GL11.glVertex3d((double)da2.dAG, (double)da2.dAH, (double)da2.dAI);
    }

    public static void g(net.minecraft.util.a a2) {
        GL11.glBegin((int)7);
        ait.g(ait.u(a2.dtH, a2.dtI, a2.dtJ));
        ait.g(ait.u(a2.dtH, a2.dtL, a2.dtJ));
        ait.g(ait.u(a2.dtK, a2.dtI, a2.dtJ));
        ait.g(ait.u(a2.dtK, a2.dtL, a2.dtJ));
        ait.g(ait.u(a2.dtK, a2.dtI, a2.dtM));
        ait.g(ait.u(a2.dtK, a2.dtL, a2.dtM));
        ait.g(ait.u(a2.dtH, a2.dtI, a2.dtM));
        ait.g(ait.u(a2.dtH, a2.dtL, a2.dtM));
        ait.vX();
        GL11.glBegin((int)7);
        ait.g(ait.u(a2.dtK, a2.dtL, a2.dtJ));
        ait.g(ait.u(a2.dtK, a2.dtI, a2.dtJ));
        ait.g(ait.u(a2.dtH, a2.dtL, a2.dtJ));
        ait.g(ait.u(a2.dtH, a2.dtI, a2.dtJ));
        ait.g(ait.u(a2.dtH, a2.dtL, a2.dtM));
        ait.g(ait.u(a2.dtH, a2.dtI, a2.dtM));
        ait.g(ait.u(a2.dtK, a2.dtL, a2.dtM));
        ait.g(ait.u(a2.dtK, a2.dtI, a2.dtM));
        ait.vX();
        GL11.glBegin((int)7);
        ait.g(ait.u(a2.dtH, a2.dtL, a2.dtJ));
        ait.g(ait.u(a2.dtK, a2.dtL, a2.dtJ));
        ait.g(ait.u(a2.dtK, a2.dtL, a2.dtM));
        ait.g(ait.u(a2.dtH, a2.dtL, a2.dtM));
        ait.g(ait.u(a2.dtH, a2.dtL, a2.dtJ));
        ait.g(ait.u(a2.dtH, a2.dtL, a2.dtM));
        ait.g(ait.u(a2.dtK, a2.dtL, a2.dtM));
        ait.g(ait.u(a2.dtK, a2.dtL, a2.dtJ));
        ait.vX();
        GL11.glBegin((int)7);
        ait.g(ait.u(a2.dtH, a2.dtI, a2.dtJ));
        ait.g(ait.u(a2.dtK, a2.dtI, a2.dtJ));
        ait.g(ait.u(a2.dtK, a2.dtI, a2.dtM));
        ait.g(ait.u(a2.dtH, a2.dtI, a2.dtM));
        ait.g(ait.u(a2.dtH, a2.dtI, a2.dtJ));
        ait.g(ait.u(a2.dtH, a2.dtI, a2.dtM));
        ait.g(ait.u(a2.dtK, a2.dtI, a2.dtM));
        ait.g(ait.u(a2.dtK, a2.dtI, a2.dtJ));
        ait.vX();
        GL11.glBegin((int)7);
        ait.g(ait.u(a2.dtH, a2.dtI, a2.dtJ));
        ait.g(ait.u(a2.dtH, a2.dtL, a2.dtJ));
        ait.g(ait.u(a2.dtH, a2.dtI, a2.dtM));
        ait.g(ait.u(a2.dtH, a2.dtL, a2.dtM));
        ait.g(ait.u(a2.dtK, a2.dtI, a2.dtM));
        ait.g(ait.u(a2.dtK, a2.dtL, a2.dtM));
        ait.g(ait.u(a2.dtK, a2.dtI, a2.dtJ));
        ait.g(ait.u(a2.dtK, a2.dtL, a2.dtJ));
        ait.vX();
        GL11.glBegin((int)7);
        ait.g(ait.u(a2.dtH, a2.dtL, a2.dtM));
        ait.g(ait.u(a2.dtH, a2.dtI, a2.dtM));
        ait.g(ait.u(a2.dtH, a2.dtL, a2.dtJ));
        ait.g(ait.u(a2.dtH, a2.dtI, a2.dtJ));
        ait.g(ait.u(a2.dtK, a2.dtL, a2.dtJ));
        ait.g(ait.u(a2.dtK, a2.dtI, a2.dtJ));
        ait.g(ait.u(a2.dtK, a2.dtL, a2.dtM));
        ait.g(ait.u(a2.dtK, a2.dtI, a2.dtM));
        ait.vX();
    }

    @Generated
    private ait() {
        throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
    }
}

