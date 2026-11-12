/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.renderer.tileentity;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.entity.c;
import net.minecraft.tileentity.ab;
import net.minecraft.tileentity.b;
import net.minecraft.tileentity.d;

public class TileEntityMobSpawnerRenderer
extends TileEntitySpecialRenderer<ab> {
    @Override
    public void a(ab ab2, double d2, double d3, double d4, float f2, int n2) {
        GlStateManager.JV();
        GlStateManager.j((float)d2 + 0.5f, (float)d3, (float)d4 + 0.5f);
        TileEntityMobSpawnerRenderer.a(ab2.aqI(), d2, d3, d4, f2);
        GlStateManager.JW();
    }

    @Override
    public void b(ab ab2, double d2, double d3, double d4, float f2, int n2) {
    }

    public static void a(b b2, double d2, double d3, double d4, float f2) {
        c c2 = b2.m(b2.Xj());
        if (c2 != null) {
            float f3 = 0.4375f;
            GlStateManager.j(0.0f, 0.4f, 0.0f);
            GlStateManager.d((float)(b2.apM() + (b2.apL() - b2.apM()) * (double)f2) * 10.0f, 0.0f, 1.0f, 0.0f);
            GlStateManager.d(-30.0f, 1.0f, 0.0f, 0.0f);
            GlStateManager.j(0.0f, -0.4f, 0.0f);
            GlStateManager.i(0.4375f, 0.4375f, 0.4375f);
            c2.b(d2, d3, d4, 0.0f, 0.0f);
            Minecraft.getMinecraft().BF().e(c2, 0.0, 0.0, 0.0, 0.0f, f2);
        }
    }

    @Override
    public /* synthetic */ void a(d d2, double d3, double d4, double d5, float f2, int n2) {
        this.b((ab)d2, d3, d4, d5, f2, n2);
    }

    @Override
    public /* synthetic */ void b(d d2, double d3, double d4, double d5, float f2, int n2) {
        this.a((ab)d2, d3, d4, d5, f2, n2);
    }
}

