/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.model;

import net.minecraft.client.model.ax;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.WorldRenderer;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.src.a;
import net.minecraft.util.da;
import net.optifine.shaders.aa;

public class az {
    public ax[] byU;
    public int bDe;
    private boolean bDf;

    public az(ax[] axArray) {
        this.byU = axArray;
        this.bDe = axArray.length;
    }

    public az(ax[] axArray, int n2, int n3, int n4, int n5, float f2, float f3) {
        this(axArray);
        float f4 = 0.0f / f2;
        float f5 = 0.0f / f3;
        axArray[0] = axArray[0].j((float)n4 / f2 - f4, (float)n3 / f3 + f5);
        axArray[1] = axArray[1].j((float)n2 / f2 + f4, (float)n3 / f3 + f5);
        axArray[2] = axArray[2].j((float)n2 / f2 + f4, (float)n5 / f3 - f5);
        axArray[3] = axArray[3].j((float)n4 / f2 - f4, (float)n5 / f3 - f5);
    }

    public void Hi() {
        ax[] axArray = new ax[this.byU.length];
        for (int i2 = 0; i2 < this.byU.length; ++i2) {
            axArray[i2] = this.byU[this.byU.length - i2 - 1];
        }
        this.byU = axArray;
    }

    public void b(WorldRenderer worldRenderer, float f2) {
        da da2 = this.byU[1].bCZ.s(this.byU[0].bCZ);
        da da3 = this.byU[1].bCZ.s(this.byU[2].bCZ);
        da da4 = da3.u(da2).atR();
        float f3 = (float)da4.dAG;
        float f4 = (float)da4.dAH;
        float f5 = (float)da4.dAI;
        if (this.bDf) {
            f3 = -f3;
            f4 = -f4;
            f5 = -f5;
        }
        if (a.aoG()) {
            worldRenderer.a(7, aa.ewn);
        } else {
            worldRenderer.a(7, DefaultVertexFormats.cbC);
        }
        for (int i2 = 0; i2 < 4; ++i2) {
            ax ax2 = this.byU[i2];
            worldRenderer.F(ax2.bCZ.dAG * (double)f2, ax2.bCZ.dAH * (double)f2, ax2.bCZ.dAI * (double)f2).r(ax2.bDa, ax2.bDb).n(f3, f4, f5).Lx();
        }
        Tessellator.Li().pZ();
    }
}

