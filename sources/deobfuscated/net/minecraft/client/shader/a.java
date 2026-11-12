/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
package net.minecraft.client.shader;

import java.nio.ByteBuffer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.WorldRenderer;
import net.minecraft.client.renderer.texture.TextureUtil;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import org.lwjgl.opengl.GL11;

public class a {
    public int cma;
    public int cmb;
    public int cmc;
    public int cmd;
    public boolean cme;
    public int cmf;
    public int cmg;
    public int cmh;
    public float[] cmi;
    public int cmj;
    private int size = 1;

    public a(int n2, int n3, boolean bl2) {
        this.cme = bl2;
        this.cmf = -1;
        this.cmg = -1;
        this.cmh = -1;
        this.cmi = new float[4];
        this.cmi[0] = 1.0f;
        this.cmi[1] = 1.0f;
        this.cmi[2] = 1.0f;
        this.cmi[3] = 0.0f;
        this.ai(n2, n3);
    }

    public a(int n2, int n3, boolean bl2, int n4) {
        this(n2 / n4, n3 / n4, bl2);
        this.size = n4;
    }

    public boolean ah(int n2, int n3) {
        return n2 / this.size != this.cmc || n3 / this.size != this.cmd;
    }

    public void ai(int n2, int n3) {
        if (!OpenGlHelper.Ky()) {
            this.cmc = n2;
            this.cmd = n3;
        } else {
            GlStateManager.JE();
            if (this.cmf >= 0) {
                this.Rk();
            }
            this.aj(n2, n3);
            this.Rl();
            OpenGlHelper.X(OpenGlHelper.bMq, 0);
        }
    }

    public void Rk() {
        if (OpenGlHelper.Ky()) {
            this.Rn();
            this.Ro();
            if (this.cmh > -1) {
                OpenGlHelper.dc(this.cmh);
                this.cmh = -1;
            }
            if (this.cmg > -1) {
                TextureUtil.cO(this.cmg);
                this.cmg = -1;
            }
            if (this.cmf > -1) {
                OpenGlHelper.X(OpenGlHelper.bMq, 0);
                OpenGlHelper.dd(this.cmf);
                this.cmf = -1;
            }
        }
    }

    public void aj(int n2, int n3) {
        this.cmc = n2;
        this.cmd = n3;
        this.cma = n2;
        this.cmb = n3;
        if (!OpenGlHelper.Ky()) {
            this.Rp();
        } else {
            this.cmf = OpenGlHelper.Kw();
            this.cmg = TextureUtil.OC();
            if (this.cme) {
                this.cmh = OpenGlHelper.Kx();
            }
            this.ec(9728);
            GlStateManager.ap(this.cmg);
            GL11.glTexImage2D((int)3553, (int)0, (int)32856, (int)this.cma, (int)this.cmb, (int)0, (int)6408, (int)5121, (ByteBuffer)null);
            OpenGlHelper.X(OpenGlHelper.bMq, this.cmf);
            OpenGlHelper.a(OpenGlHelper.bMq, OpenGlHelper.bMs, 3553, this.cmg, 0);
            if (this.cme) {
                OpenGlHelper.Y(OpenGlHelper.bMr, this.cmh);
                OpenGlHelper.n(OpenGlHelper.bMr, 33190, this.cma, this.cmb);
                OpenGlHelper.o(OpenGlHelper.bMq, OpenGlHelper.bMt, OpenGlHelper.bMr, this.cmh);
            }
            this.Rp();
            this.Rn();
        }
    }

    public void ec(int n2) {
        if (OpenGlHelper.Ky()) {
            this.cmj = n2;
            GlStateManager.ap(this.cmg);
            GL11.glTexParameterf((int)3553, (int)10241, (float)n2);
            GL11.glTexParameterf((int)3553, (int)10240, (float)n2);
            GL11.glTexParameterf((int)3553, (int)10242, (float)10496.0f);
            GL11.glTexParameterf((int)3553, (int)10243, (float)10496.0f);
            GlStateManager.ap(0);
        }
    }

    public void Rl() {
        int n2 = OpenGlHelper.de(OpenGlHelper.bMq);
        if (n2 != OpenGlHelper.bMu) {
            if (n2 == OpenGlHelper.bMv) {
                throw new RuntimeException("GL_FRAMEBUFFER_INCOMPLETE_ATTACHMENT");
            }
            if (n2 == OpenGlHelper.bMw) {
                throw new RuntimeException("GL_FRAMEBUFFER_INCOMPLETE_MISSING_ATTACHMENT");
            }
            if (n2 == OpenGlHelper.bMx) {
                throw new RuntimeException("GL_FRAMEBUFFER_INCOMPLETE_DRAW_BUFFER");
            }
            if (n2 == OpenGlHelper.bMy) {
                throw new RuntimeException("GL_FRAMEBUFFER_INCOMPLETE_READ_BUFFER");
            }
            throw new RuntimeException("glCheckFramebufferStatus returned unknown status:" + n2);
        }
    }

    public void Rm() {
        if (OpenGlHelper.Ky()) {
            GlStateManager.ap(this.cmg);
        }
    }

    public void Rn() {
        if (OpenGlHelper.Ky()) {
            GlStateManager.ap(0);
        }
    }

    public void az(boolean bl2) {
        if (OpenGlHelper.Ky()) {
            OpenGlHelper.X(OpenGlHelper.bMq, this.cmf);
            if (bl2) {
                GlStateManager.i(0, 0, this.cmc, this.cmd);
            }
        }
    }

    public void Ro() {
        if (OpenGlHelper.Ky()) {
            OpenGlHelper.X(OpenGlHelper.bMq, 0);
        }
    }

    public void i(float f2, float f3, float f4, float f5) {
        this.cmi[0] = f2;
        this.cmi[1] = f3;
        this.cmi[2] = f4;
        this.cmi[3] = f5;
    }

    public void ak(int n2, int n3) {
        this.c(n2, n3, true);
    }

    public void c(int n2, int n3, boolean bl2) {
        if (OpenGlHelper.Ky()) {
            GlStateManager.a(true, true, true, false);
            GlStateManager.JD();
            GlStateManager.an(false);
            GlStateManager.cR(5889);
            GlStateManager.JU();
            GlStateManager.e(0.0, n2, n3, 0.0, 1000.0, 3000.0);
            GlStateManager.cR(5888);
            GlStateManager.JU();
            GlStateManager.j(0.0f, 0.0f, -2000.0f);
            GlStateManager.i(0, 0, n2, n3);
            GlStateManager.JN();
            GlStateManager.JA();
            GlStateManager.Jy();
            if (bl2) {
                GlStateManager.tR();
                GlStateManager.JB();
            }
            GlStateManager.e(1.0f, 1.0f, 1.0f, 1.0f);
            this.Rm();
            float f2 = n2;
            float f3 = n3;
            float f4 = (float)this.cmc / (float)this.cma;
            float f5 = (float)this.cmd / (float)this.cmb;
            Tessellator tessellator = Tessellator.Li();
            WorldRenderer worldRenderer = tessellator.Lj();
            worldRenderer.a(7, DefaultVertexFormats.cbI);
            worldRenderer.F(0.0, f3, 0.0).r(0.0, 0.0).s(255, 255, 255, 255).Lx();
            worldRenderer.F(f2, f3, 0.0).r(f4, 0.0).s(255, 255, 255, 255).Lx();
            worldRenderer.F(f2, 0.0, 0.0).r(f4, f5).s(255, 255, 255, 255).Lx();
            worldRenderer.F(0.0, 0.0, 0.0).r(0.0, f5).s(255, 255, 255, 255).Lx();
            tessellator.pZ();
            this.Rn();
            GlStateManager.an(true);
            GlStateManager.a(true, true, true, true);
        }
    }

    public void Rp() {
        this.az(true);
        GlStateManager.c(this.cmi[0], this.cmi[1], this.cmi[2], this.cmi[3]);
        int n2 = 16384;
        if (this.cme) {
            GlStateManager.ak(1.0);
            n2 |= 0x100;
        }
        GlStateManager.cQ(n2);
        this.Ro();
    }

    public int getSize() {
        return this.size;
    }
}

