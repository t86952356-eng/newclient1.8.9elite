/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
package net.optifine.render;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.GLAllocation;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.c;
import net.minecraft.util.da;
import org.lwjgl.opengl.GL11;

public class d {
    private final Minecraft etF;
    private boolean etG = false;
    private boolean etH = false;
    int bOa;
    private da etI;
    float jZ;
    private boolean etJ = false;
    private int etK = 0;
    private da etL = new da(-1.0, -1.0, -1.0);
    private double etM = 0.0;
    private double etN = 0.0;
    private double etO = 0.0;
    private int etP = -1;

    public d(Minecraft minecraft) {
        this.etF = minecraft;
        this.etP = GLAllocation.cC(1);
    }

    public void a(boolean bl2, int n2, float f2, da da2) {
        this.etH = bl2;
        this.bOa = n2;
        this.jZ = f2;
        this.etI = da2;
    }

    public boolean aDK() {
        if (!this.etG) {
            return true;
        }
        if (this.etH != this.etJ) {
            return true;
        }
        if (this.bOa >= this.etK + 20) {
            return true;
        }
        if (Math.abs(this.etI.dAG - this.etL.dAG) > 0.003) {
            return true;
        }
        if (Math.abs(this.etI.dAH - this.etL.dAH) > 0.003) {
            return true;
        }
        if (Math.abs(this.etI.dAI - this.etL.dAI) > 0.003) {
            return true;
        }
        c c2 = this.etF.BC();
        boolean bl2 = this.etN + (double)c2.getEyeHeight() < 128.0 + (double)(this.etF.aIY.cip * 128.0f);
        boolean bl3 = c2.crG + (double)c2.getEyeHeight() < 128.0 + (double)(this.etF.aIY.cip * 128.0f);
        return bl3 != bl2;
    }

    public void aDL() {
        GL11.glNewList((int)this.etP, (int)4864);
    }

    public void aDM() {
        GL11.glEndList();
        this.etJ = this.etH;
        this.etK = this.bOa;
        this.etL = this.etI;
        this.etM = this.etF.BC().crF;
        this.etN = this.etF.BC().crG;
        this.etO = this.etF.BC().crH;
        this.etG = true;
        GlStateManager.JX();
    }

    public void aDN() {
        c c2 = this.etF.BC();
        double d2 = c2.crF + (c2.gW - c2.crF) * (double)this.jZ;
        double d3 = c2.crG + (c2.gX - c2.crG) * (double)this.jZ;
        double d4 = c2.crH + (c2.gY - c2.crH) * (double)this.jZ;
        double d5 = (float)(this.bOa - this.etK) + this.jZ;
        float f2 = (float)(d2 - this.etM + d5 * 0.03);
        float f3 = (float)(d3 - this.etN);
        float f4 = (float)(d4 - this.etO);
        GlStateManager.JV();
        if (this.etH) {
            GlStateManager.j(-f2 / 12.0f, -f3, -f4 / 12.0f);
        } else {
            GlStateManager.j(-f2, -f3, -f4);
        }
        GlStateManager.cU(this.etP);
        GlStateManager.JW();
        GlStateManager.JX();
    }

    public void aX() {
        this.etG = false;
    }
}

