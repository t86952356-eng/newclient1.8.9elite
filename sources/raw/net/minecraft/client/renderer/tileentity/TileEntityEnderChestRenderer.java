/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.renderer.tileentity;

import net.minecraft.client.model.k;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.d;
import net.minecraft.tileentity.w;
import net.minecraft.util.cm;

public class TileEntityEnderChestRenderer
extends TileEntitySpecialRenderer<w> {
    private static final cm caL = new cm("textures/entity/chest/ender.png");
    private final k caM = new k();

    @Override
    public void a(w w2, double d2, double d3, double d4, float f2, int n2) {
        int n3 = 0;
        if (w2.apO()) {
            n3 = w2.zg();
        }
        if (n2 >= 0) {
            this.a(cbs[n2]);
            GlStateManager.cR(5890);
            GlStateManager.JV();
            GlStateManager.i(4.0f, 4.0f, 1.0f);
            GlStateManager.j(0.0625f, 0.0625f, 0.0625f);
            GlStateManager.cR(5888);
        } else {
            this.a(caL);
        }
        GlStateManager.JV();
        GlStateManager.JS();
        GlStateManager.e(1.0f, 1.0f, 1.0f, 1.0f);
        GlStateManager.j((float)d2, (float)d3 + 1.0f, (float)d4 + 1.0f);
        GlStateManager.i(1.0f, -1.0f, -1.0f);
        GlStateManager.j(0.5f, 0.5f, 0.5f);
        int n4 = 0;
        if (n3 == 2) {
            n4 = 180;
        }
        if (n3 == 3) {
            n4 = 0;
        }
        if (n3 == 4) {
            n4 = 90;
        }
        if (n3 == 5) {
            n4 = -90;
        }
        GlStateManager.d(n4, 0.0f, 1.0f, 0.0f);
        GlStateManager.j(-0.5f, -0.5f, -0.5f);
        float f3 = w2.dsD + (w2.dsC - w2.dsD) * f2;
        f3 = 1.0f - f3;
        f3 = 1.0f - f3 * f3 * f3;
        this.caM.bzd.bBF = -(f3 * (float)Math.PI / 2.0f);
        this.caM.GZ();
        GlStateManager.JT();
        GlStateManager.JW();
        GlStateManager.e(1.0f, 1.0f, 1.0f, 1.0f);
        if (n2 >= 0) {
            GlStateManager.cR(5890);
            GlStateManager.JW();
            GlStateManager.cR(5888);
        }
    }

    @Override
    public void b(w w2, double d2, double d3, double d4, float f2, int n2) {
    }

    @Override
    public /* synthetic */ void a(d d2, double d3, double d4, double d5, float f2, int n2) {
        this.b((w)d2, d3, d4, d5, f2, n2);
    }

    @Override
    public /* synthetic */ void b(d d2, double d3, double d4, double d5, float f2, int n2) {
        this.a((w)d2, d3, d4, d5, f2, n2);
    }
}

