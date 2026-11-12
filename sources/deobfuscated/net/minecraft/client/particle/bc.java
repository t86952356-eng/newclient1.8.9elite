/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.particle;

import net.minecraft.client.Minecraft;
import net.minecraft.client.particle.ae;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.WorldRenderer;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.c;
import net.minecraft.src.a;
import net.minecraft.world.w;
import net.optifine.shaders.ah;
import net.optifine.shaders.s;

public class bc
extends ae {
    private final c bGT;
    private final c bGU;
    private int bGQ;
    private final int bGV;
    private final float bGW;
    private final RenderManager bGX = Minecraft.getMinecraft().BF();

    public bc(w w2, c c2, c c3, float f2) {
        super(w2, c2.gW, c2.gX, c2.gY, c2.ud, c2.ue, c2.uf);
        this.bGT = c2;
        this.bGU = c3;
        this.bGV = 3;
        this.bGW = f2;
    }

    @Override
    public void a(WorldRenderer worldRenderer, c c2, float f2, float f3, float f4, float f5, float f6, float f7) {
        s s2 = null;
        if (a.aoG()) {
            s2 = ah.eCE;
            ah.aK(this.bGT);
        }
        float f8 = ((float)this.bGQ + f2) / (float)this.bGV;
        f8 *= f8;
        double d2 = this.bGT.gW;
        double d3 = this.bGT.gX;
        double d4 = this.bGT.gY;
        double d5 = this.bGU.csh + (this.bGU.gW - this.bGU.csh) * (double)f2;
        double d6 = this.bGU.csi + (this.bGU.gX - this.bGU.csi) * (double)f2 + (double)this.bGW;
        double d7 = this.bGU.csj + (this.bGU.gY - this.bGU.csj) * (double)f2;
        double d8 = d2 + (d5 - d2) * (double)f8;
        double d9 = d3 + (d6 - d3) * (double)f8;
        double d10 = d4 + (d7 - d4) * (double)f8;
        int n2 = this.af(f2);
        int n3 = n2 % 65536;
        int n4 = n2 / 65536;
        OpenGlHelper.a(OpenGlHelper.bMJ, (float)n3 / 1.0f, (float)n4 / 1.0f);
        GlStateManager.e(1.0f, 1.0f, 1.0f, 1.0f);
        this.bGX.e(this.bGT, (float)(d8 -= bGl), (float)(d9 -= bGm), (float)(d10 -= bGn), this.bGT.pl, f2);
        if (a.aoG()) {
            ah.aL(null);
            ah.e(s2);
        }
    }

    @Override
    public void Dm() {
        ++this.bGQ;
        if (this.bGQ == this.bGV) {
            this.Tt();
        }
    }

    @Override
    public int Ir() {
        return 3;
    }
}

