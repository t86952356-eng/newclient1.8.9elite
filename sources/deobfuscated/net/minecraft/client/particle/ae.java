/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.particle;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.WorldRenderer;
import net.minecraft.client.renderer.texture.TextureAtlasSprite;
import net.minecraft.entity.c;
import net.minecraft.nbt.n;
import net.minecraft.util.bt;
import net.minecraft.world.w;

public class ae
extends c {
    protected int bFY;
    protected int bFZ;
    protected float bGa;
    protected float bGb;
    protected int bGc;
    protected int bGd;
    protected float bGe;
    protected float bGf;
    protected float bGg;
    protected float bGh;
    protected float bGi;
    protected float bGj = 1.0f;
    protected TextureAtlasSprite bGk;
    public static double bGl;
    public static double bGm;
    public static double bGn;

    protected ae(w w2, double d2, double d3, double d4) {
        super(w2);
        this.o(0.2f, 0.2f);
        this.setPosition(d2, d3, d4);
        this.csh = this.crF = d2;
        this.csi = this.crG = d3;
        this.csj = this.crH = d4;
        this.bGi = 1.0f;
        this.bGh = 1.0f;
        this.bGg = 1.0f;
        this.bGa = this.ta.nextFloat() * 3.0f;
        this.bGb = this.ta.nextFloat() * 3.0f;
        this.bGe = (this.ta.nextFloat() * 0.5f + 0.5f) * 2.0f;
        this.bGd = (int)(4.0f / (this.ta.nextFloat() * 0.9f + 0.1f));
        this.bGc = 0;
    }

    public ae(w w2, double d2, double d3, double d4, double d5, double d6, double d7) {
        this(w2, d2, d3, d4);
        this.ud = d5 + (Math.random() * 2.0 - 1.0) * (double)0.4f;
        this.ue = d6 + (Math.random() * 2.0 - 1.0) * (double)0.4f;
        this.uf = d7 + (Math.random() * 2.0 - 1.0) * (double)0.4f;
        float f2 = (float)(Math.random() + Math.random() + 1.0) * 0.15f;
        float f3 = bt.aD(this.ud * this.ud + this.ue * this.ue + this.uf * this.uf);
        this.ud = this.ud / (double)f3 * (double)f2 * (double)0.4f;
        this.ue = this.ue / (double)f3 * (double)f2 * (double)0.4f + (double)0.1f;
        this.uf = this.uf / (double)f3 * (double)f2 * (double)0.4f;
    }

    public ae ah(float f2) {
        this.ud *= (double)f2;
        this.ue = (this.ue - (double)0.1f) * (double)f2 + (double)0.1f;
        this.uf *= (double)f2;
        return this;
    }

    public ae ai(float f2) {
        this.o(0.2f * f2, 0.2f * f2);
        this.bGe *= f2;
        return this;
    }

    public void h(float f2, float f3, float f4) {
        this.bGg = f2;
        this.bGh = f3;
        this.bGi = f4;
    }

    public void aj(float f2) {
        if (this.bGj == 1.0f && f2 < 1.0f) {
            Minecraft.getMinecraft().bgN.c(this);
        } else if (this.bGj < 1.0f && f2 == 1.0f) {
            Minecraft.getMinecraft().bgN.d(this);
        }
        this.bGj = f2;
    }

    public float Iw() {
        return this.bGg;
    }

    public float Ix() {
        return this.bGh;
    }

    public float Iy() {
        return this.bGi;
    }

    public float mt() {
        return this.bGj;
    }

    @Override
    protected boolean Iz() {
        return false;
    }

    @Override
    protected void IA() {
    }

    @Override
    public void Dm() {
        this.crF = this.gW;
        this.crG = this.gX;
        this.crH = this.gY;
        if (this.bGc++ >= this.bGd) {
            this.Tt();
        }
        this.ue -= 0.04 * (double)this.bGf;
        this.y(this.ud, this.ue, this.uf);
        this.ud *= (double)0.98f;
        this.ue *= (double)0.98f;
        this.uf *= (double)0.98f;
        if (this.aO) {
            this.ud *= (double)0.7f;
            this.uf *= (double)0.7f;
        }
    }

    public void a(WorldRenderer worldRenderer, c c2, float f2, float f3, float f4, float f5, float f6, float f7) {
        float f8 = (float)this.bFY / 16.0f;
        float f9 = f8 + 0.0624375f;
        float f10 = (float)this.bFZ / 16.0f;
        float f11 = f10 + 0.0624375f;
        float f12 = 0.1f * this.bGe;
        if (this.bGk != null) {
            f8 = this.bGk.NY();
            f9 = this.bGk.NZ();
            f10 = this.bGk.Oa();
            f11 = this.bGk.Ob();
        }
        float f13 = (float)(this.crF + (this.gW - this.crF) * (double)f2 - bGl);
        float f14 = (float)(this.crG + (this.gX - this.crG) * (double)f2 - bGm);
        float f15 = (float)(this.crH + (this.gY - this.crH) * (double)f2 - bGn);
        int n2 = this.af(f2);
        int n3 = n2 >> 16 & 0xFFFF;
        int n4 = n2 & 0xFFFF;
        worldRenderer.F(f13 - f3 * f12 - f6 * f12, f14 - f4 * f12, f15 - f5 * f12 - f7 * f12).r(f9, f11).g(this.bGg, this.bGh, this.bGi, this.bGj).aa(n3, n4).Lx();
        worldRenderer.F(f13 - f3 * f12 + f6 * f12, f14 + f4 * f12, f15 - f5 * f12 + f7 * f12).r(f9, f10).g(this.bGg, this.bGh, this.bGi, this.bGj).aa(n3, n4).Lx();
        worldRenderer.F(f13 + f3 * f12 + f6 * f12, f14 + f4 * f12, f15 + f5 * f12 + f7 * f12).r(f8, f10).g(this.bGg, this.bGh, this.bGi, this.bGj).aa(n3, n4).Lx();
        worldRenderer.F(f13 + f3 * f12 - f6 * f12, f14 - f4 * f12, f15 + f5 * f12 - f7 * f12).r(f8, f11).g(this.bGg, this.bGh, this.bGi, this.bGj).aa(n3, n4).Lx();
    }

    public int Ir() {
        return 0;
    }

    @Override
    public void d(n n2) {
    }

    @Override
    public void e(n n2) {
    }

    public void a(TextureAtlasSprite textureAtlasSprite) {
        int n2 = this.Ir();
        if (n2 != 1) {
            throw new RuntimeException("Invalid call to Particle.setTex, use coordinate methods");
        }
        this.bGk = textureAtlasSprite;
    }

    public void ct(int n2) {
        if (this.Ir() != 0) {
            throw new RuntimeException("Invalid call to Particle.setMiscTex");
        }
        this.bFY = n2 % 16;
        this.bFZ = n2 / 16;
    }

    public void IB() {
        ++this.bFY;
    }

    @Override
    public boolean IC() {
        return false;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + ", Pos (" + this.gW + "," + this.gX + "," + this.gY + "), RGBA (" + this.bGg + "," + this.bGh + "," + this.bGi + "," + this.bGj + "), Age " + this.bGc;
    }
}

