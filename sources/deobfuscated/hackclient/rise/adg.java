/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
package hackclient.rise;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.b;
import net.minecraft.client.gui.cz;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.WorldRenderer;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.client.shader.a;
import org.lwjgl.opengl.GL11;
import rise.util.InstanceAccess;

public class adg
implements InstanceAccess {
    private static final Minecraft aCu = Minecraft.getMinecraft();
    private static a aCv;
    public static boolean aCw;
    private static cz jY;
    private static final Tessellator aCx;
    private static final WorldRenderer aCy;

    public static void w(float f2) {
        if (jY.getScaledWidth() != adg.aER.bgz || jY.getScaledHeight() != adg.aER.bgA) {
            jY = new cz(aER);
        }
        if (!OpenGlHelper.Ky()) {
            // empty if block
        }
        int n2 = adg.aCu.bgz;
        int n3 = adg.aCu.bgA;
        GlStateManager.tQ();
        GlStateManager.e(1.0f, 1.0f, 1.0f, 1.0f);
        aER.Bq().a(b.icons);
        GlStateManager.tQ();
        if (adg.aER.bha.Ev()) {
            GlStateManager.h(775, 769, 1, 0);
            GlStateManager.tL();
            adg.aER.bha.drawTexturedModalRect((float)jY.getScaledWidth() / 2.0f - 7.0f, jY.getScaledHeight() / 2 - 7, 0, 0, 16, 16);
        }
        if (aCv != null) {
            GlStateManager.tQ();
            GlStateManager.tL();
            GlStateManager.h(1, 771, 1, 771);
            GlStateManager.e(1.0f, 1.0f, 1.0f, 1.0f);
            aCv.Rm();
            adg.a(0.0f, 0.0f, jY.getScaledWidth(), jY.getScaledHeight(), 0.0f, 1.0f, 1.0f, 0.0f, 9728);
            GlStateManager.h(770, 771, 1, 0);
        }
        if (aCw) {
            aCv = adg.a(aCv, n2, n3);
            aCv.Rp();
            aCv.az(false);
            GlStateManager.tR();
            GlStateManager.h(770, 771, 1, 771);
            GlStateManager.e(1.0f, 1.0f, 1.0f, 1.0f);
            GlStateManager.JA();
            GlStateManager.JG();
            GlStateManager.bKX = true;
            adg.aCu.bha.w(f2);
            GlStateManager.bKX = false;
            aCu.Aw().az(false);
            GlStateManager.tQ();
            aCw = false;
        }
    }

    public static void k(int n2, int n3) {
        aCu.Bq().a(b.icons);
        GlStateManager.tQ();
        GlStateManager.h(775, 769, 1, 0);
        GlStateManager.tL();
        aCy.a(7, DefaultVertexFormats.cbG);
        aCy.F(n2, n3 + 16, 100.0).r(0.0, 0.0625).Lx();
        aCy.F(n2 + 16, n3 + 16, 100.0).r(0.0625, 0.0625).Lx();
        aCy.F(n2 + 16, n3, 100.0).r(0.0625, 0.0).Lx();
        aCy.F(n2, n3, 100.0).r(0.0, 0.0).Lx();
        aCx.pZ();
    }

    public static void a(float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, int n2) {
        GlStateManager.JN();
        GL11.glTexParameteri((int)3553, (int)10241, (int)n2);
        GL11.glTexParameteri((int)3553, (int)10240, (int)n2);
        aCy.a(7, DefaultVertexFormats.cbG);
        aCy.F(f2, f3 + f5, 0.0).r(f6, f9).Lx();
        aCy.F(f2 + f4, f3 + f5, 0.0).r(f7, f9).Lx();
        aCy.F(f2 + f4, f3, 0.0).r(f7, f8).Lx();
        aCy.F(f2, f3, 0.0).r(f6, f8).Lx();
        aCx.pZ();
        GL11.glTexParameteri((int)3553, (int)10241, (int)9728);
        GL11.glTexParameteri((int)3553, (int)10240, (int)9728);
    }

    public static a a(a a2, int n2, int n3) {
        if (a2 == null) {
            a2 = new a(n2, n3, true);
            a2.ec(9728);
            a2.cmi[0] = 0.0f;
            a2.cmi[1] = 0.0f;
            a2.cmi[2] = 0.0f;
        } else if (a2.cmc != n2 || a2.cmd != n3) {
            a2.ai(n2, n3);
            a2.ec(9728);
        }
        aCv = a2;
        return a2;
    }

    static {
        jY = new cz(aER);
        aCx = Tessellator.Li();
        aCy = aCx.Lj();
    }
}

