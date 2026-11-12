/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.renderer.tileentity;

import net.minecraft.client.model.i;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.d;
import net.minecraft.tileentity.u;
import net.minecraft.util.bt;
import net.minecraft.util.cm;

public class TileEntityEnchantmentTableRenderer
extends TileEntitySpecialRenderer<u> {
    private static final cm caF = new cm("textures/entity/enchanting_table_book.png");
    private final i caG = new i();

    @Override
    public void a(u u2, double d2, double d3, double d4, float f2, int n2) {
        float f3;
        GlStateManager.JV();
        GlStateManager.j((float)d2 + 0.5f, (float)d3 + 0.75f, (float)d4 + 0.5f);
        float f4 = (float)u2.czL + f2;
        GlStateManager.j(0.0f, 0.1f + bt.bx(f4 * 0.1f) * 0.01f, 0.0f);
        for (f3 = u2.dsT - u2.dsU; f3 >= (float)Math.PI; f3 -= (float)Math.PI * 2) {
        }
        while (f3 < (float)(-Math.PI)) {
            f3 += (float)Math.PI * 2;
        }
        float f5 = u2.dsU + f3 * f2;
        GlStateManager.d(-f5 * 180.0f / (float)Math.PI, 0.0f, 1.0f, 0.0f);
        GlStateManager.d(80.0f, 0.0f, 0.0f, 1.0f);
        this.a(caF);
        float f6 = u2.dsO + (u2.dsN - u2.dsO) * f2 + 0.25f;
        float f7 = u2.dsO + (u2.dsN - u2.dsO) * f2 + 0.75f;
        f6 = (f6 - (float)bt.aE(f6)) * 1.6f - 0.3f;
        f7 = (f7 - (float)bt.aE(f7)) * 1.6f - 0.3f;
        if (f6 < 0.0f) {
            f6 = 0.0f;
        }
        if (f7 < 0.0f) {
            f7 = 0.0f;
        }
        if (f6 > 1.0f) {
            f6 = 1.0f;
        }
        if (f7 > 1.0f) {
            f7 = 1.0f;
        }
        float f8 = u2.dsS + (u2.dsR - u2.dsS) * f2;
        GlStateManager.JH();
        this.caG.a(null, f4, f6, f7, f8, 0.0f, 0.0625f);
        GlStateManager.JW();
    }

    @Override
    public void b(u u2, double d2, double d3, double d4, float f2, int n2) {
    }

    @Override
    public /* synthetic */ void a(d d2, double d3, double d4, double d5, float f2, int n2) {
        this.b((u)d2, d3, d4, d5, f2, n2);
    }

    @Override
    public /* synthetic */ void b(d d2, double d3, double d4, double d5, float f2, int n2) {
        this.a((u)d2, d3, d4, d5, f2, n2);
    }
}

