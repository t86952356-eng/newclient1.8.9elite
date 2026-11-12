/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.gui;

import net.minecraft.block.material.MapColor;
import net.minecraft.client.gui.cx;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.WorldRenderer;
import net.minecraft.client.renderer.texture.DynamicTexture;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.util.cm;
import net.minecraft.util.dc;
import net.minecraft.world.storage.f;

class cy {
    private final f btZ;
    private final DynamicTexture bua;
    private final cm bub;
    private final int[] buc;
    final /* synthetic */ cx bud;

    private cy(cx cx2, f f2) {
        this.bud = cx2;
        this.btZ = f2;
        this.bua = new DynamicTexture(128, 128);
        this.buc = this.bua.NM();
        this.bub = cx2.btX.a("map/" + f2.dDT, this.bua);
        for (int i2 = 0; i2 < this.buc.length; ++i2) {
            this.buc[i2] = 0;
        }
    }

    private void Gp() {
        for (int i2 = 0; i2 < 16384; ++i2) {
            int n2 = this.btZ.dTl[i2] & 0xFF;
            this.buc[i2] = n2 / 4 == 0 ? (i2 + i2 / 128 & 1) * 8 + 16 << 24 : MapColor.bdB[n2 / 4].bu(n2 & 3);
        }
        this.bua.NL();
    }

    private void ai(boolean bl2) {
        boolean bl3 = false;
        boolean bl4 = false;
        Tessellator tessellator = Tessellator.Li();
        WorldRenderer worldRenderer = tessellator.Lj();
        float f2 = 0.0f;
        this.bud.btX.a(this.bub);
        GlStateManager.tQ();
        GlStateManager.h(1, 771, 0, 1);
        GlStateManager.Jy();
        worldRenderer.a(7, DefaultVertexFormats.cbG);
        worldRenderer.F(0.0, 128.0, -0.01f).r(0.0, 1.0).Lx();
        worldRenderer.F(128.0, 128.0, -0.01f).r(1.0, 1.0).Lx();
        worldRenderer.F(128.0, 0.0, -0.01f).r(1.0, 0.0).Lx();
        worldRenderer.F(0.0, 0.0, -0.01f).r(0.0, 0.0).Lx();
        tessellator.pZ();
        GlStateManager.tL();
        GlStateManager.tR();
        this.bud.btX.a(cx.btW);
        int n2 = 0;
        for (dc dc2 : this.btZ.dTo.values()) {
            if (bl2 && dc2.atT() != 1) continue;
            GlStateManager.JV();
            GlStateManager.j(0.0f + (float)dc2.atU() / 2.0f + 64.0f, 0.0f + (float)dc2.atV() / 2.0f + 64.0f, -0.02f);
            GlStateManager.d((float)(dc2.atW() * 360) / 16.0f, 0.0f, 0.0f, 1.0f);
            GlStateManager.i(4.0f, 4.0f, 3.0f);
            GlStateManager.j(-0.125f, 0.125f, 0.0f);
            byte by2 = dc2.atT();
            float f3 = (float)(by2 % 4 + 0) / 4.0f;
            float f4 = (float)(by2 / 4 + 0) / 4.0f;
            float f5 = (float)(by2 % 4 + 1) / 4.0f;
            float f6 = (float)(by2 / 4 + 1) / 4.0f;
            worldRenderer.a(7, DefaultVertexFormats.cbG);
            float f7 = -0.001f;
            worldRenderer.F(-1.0, 1.0, (float)n2 * -0.001f).r(f3, f4).Lx();
            worldRenderer.F(1.0, 1.0, (float)n2 * -0.001f).r(f5, f4).Lx();
            worldRenderer.F(1.0, -1.0, (float)n2 * -0.001f).r(f5, f6).Lx();
            worldRenderer.F(-1.0, -1.0, (float)n2 * -0.001f).r(f3, f6).Lx();
            tessellator.pZ();
            GlStateManager.JW();
            ++n2;
        }
        GlStateManager.JV();
        GlStateManager.j(0.0f, 0.0f, -0.04f);
        GlStateManager.i(1.0f, 1.0f, 1.0f);
        GlStateManager.JW();
    }
}

