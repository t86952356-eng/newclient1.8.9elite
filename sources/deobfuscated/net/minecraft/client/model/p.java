/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.model;

import net.minecraft.client.model.ag;
import net.minecraft.client.model.d;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.c;

public class p
extends d {
    private final ag bzF;
    private final ag bzG = new ag(this, "glass");
    private ag bzH;

    public p(float f2, boolean bl2) {
        this.bzG.C(0, 0).a(-4.0f, -4.0f, -4.0f, 8, 8, 8);
        this.bzF = new ag(this, "cube");
        this.bzF.C(32, 0).a(-4.0f, -4.0f, -4.0f, 8, 8, 8);
        if (bl2) {
            this.bzH = new ag(this, "base");
            this.bzH.C(0, 16).a(-6.0f, 0.0f, -6.0f, 12, 4, 12);
        }
    }

    @Override
    public void a(c c2, float f2, float f3, float f4, float f5, float f6, float f7) {
        GlStateManager.JV();
        GlStateManager.i(2.0f, 2.0f, 2.0f);
        GlStateManager.j(0.0f, -0.5f, 0.0f);
        if (this.bzH != null) {
            this.bzH.aa(f7);
        }
        GlStateManager.d(f3, 0.0f, 1.0f, 0.0f);
        GlStateManager.j(0.0f, 0.8f + f4, 0.0f);
        GlStateManager.d(60.0f, 0.7071f, 0.0f, 0.7071f);
        this.bzG.aa(f7);
        float f8 = 0.875f;
        GlStateManager.i(0.875f, 0.875f, 0.875f);
        GlStateManager.d(60.0f, 0.7071f, 0.0f, 0.7071f);
        GlStateManager.d(f3, 0.0f, 1.0f, 0.0f);
        this.bzG.aa(f7);
        GlStateManager.i(0.875f, 0.875f, 0.875f);
        GlStateManager.d(60.0f, 0.7071f, 0.0f, 0.7071f);
        GlStateManager.d(f3, 0.0f, 1.0f, 0.0f);
        this.bzF.aa(f7);
        GlStateManager.JW();
    }
}

