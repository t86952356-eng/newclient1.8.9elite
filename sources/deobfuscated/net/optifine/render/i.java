/*
 * Decompiled with CFR 0.152.
 */
package net.optifine.render;

import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.VboRenderList;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.src.a;
import net.minecraft.util.av;
import net.optifine.render.h;
import net.optifine.util.t;

public class i {
    private av dWg = null;
    private int cbS = OpenGlHelper.Ku();
    private int dyI = 4096;
    private int eum = 0;
    private int eun;
    private final t<h> euo = new t();
    private h eup = null;
    private IntBuffer euq = a.cF(this.dyI);
    private IntBuffer eur = a.cF(this.dyI);
    private int bPX = 7;
    private final int eus = DefaultVertexFormats.cbv.OT();

    public i(av av2) {
        this.dWg = av2;
        this.OI();
        long l2 = this.jF(this.dyI);
        OpenGlHelper.a(OpenGlHelper.bNo, l2, OpenGlHelper.bNp);
        this.OJ();
    }

    public void a(ByteBuffer byteBuffer, h h2) {
        int n2 = h2.getPosition();
        int n3 = h2.getSize();
        int n4 = this.R(byteBuffer.limit());
        if (n4 <= 0) {
            if (n2 >= 0) {
                h2.setPosition(-1);
                h2.ip(0);
                this.euo.c(h2.aEi());
                this.eun -= n3;
            }
        } else {
            if (n4 > n3) {
                h2.setPosition(this.eum);
                h2.ip(n4);
                this.eum += n4;
                if (n2 >= 0) {
                    this.euo.c(h2.aEi());
                }
                this.euo.b(h2.aEi());
            }
            h2.ip(n4);
            this.eun += n4 - n3;
            this.jD(h2.aEh());
            long l2 = this.jF(h2.getPosition());
            this.OI();
            OpenGlHelper.a(OpenGlHelper.bNo, l2, byteBuffer);
            this.OJ();
            if (this.eum > this.eun * 11 / 10) {
                this.jC(1);
            }
        }
    }

    private void jC(int n2) {
        if (!this.euo.isEmpty()) {
            h h2 = this.eup;
            if (h2 == null || !this.euo.f(h2.aEi())) {
                h2 = this.euo.aJg().aJj();
            }
            int n3 = h2.getPosition();
            h h3 = h2.aEj();
            n3 = h3 == null ? 0 : h3.aEh();
            for (int i2 = 0; h2 != null && i2 < n2; ++i2) {
                if (h2.getPosition() == n3) {
                    n3 += h2.getSize();
                    h2 = h2.aEk();
                    continue;
                }
                int n4 = h2.getPosition() - n3;
                if (h2.getSize() <= n4) {
                    this.ak(h2.getPosition(), n3, h2.getSize());
                    h2.setPosition(n3);
                    n3 += h2.getSize();
                    h2 = h2.aEk();
                    continue;
                }
                this.jD(this.eum + h2.getSize());
                this.ak(h2.getPosition(), this.eum, h2.getSize());
                h2.setPosition(this.eum);
                this.eum += h2.getSize();
                h h4 = h2.aEk();
                this.euo.c(h2.aEi());
                this.euo.b(h2.aEi());
                h2 = h4;
            }
            if (h2 == null) {
                this.eum = this.euo.aJh().aJj().aEh();
            }
            this.eup = h2;
        }
    }

    private void aEl() {
        int n2 = 0;
        int n3 = 0;
        for (h h2 = this.euo.aJg().aJj(); h2 != null; h2 = h2.aEk()) {
            ++n2;
            n3 += h2.getSize();
            if (h2.getPosition() < 0 || h2.getSize() <= 0 || h2.aEh() > this.eum) {
                throw new RuntimeException("Invalid range: " + String.valueOf(h2));
            }
            h h3 = h2.aEj();
            if (h3 != null && h2.getPosition() < h3.aEh()) {
                throw new RuntimeException("Invalid range: " + String.valueOf(h2));
            }
            h h4 = h2.aEk();
            if (h4 == null || h2.aEh() <= h4.getPosition()) continue;
            throw new RuntimeException("Invalid range: " + String.valueOf(h2));
        }
        if (n2 != this.euo.getSize()) {
            throw new RuntimeException("Invalid count: " + n2 + " <> " + this.euo.getSize());
        }
        if (n3 != this.eun) {
            throw new RuntimeException("Invalid size: " + n3 + " <> " + this.eun);
        }
    }

    private void jD(int n2) {
        if (this.dyI < n2) {
            this.jE(n2);
        }
    }

    private void ak(int n2, int n3, int n4) {
        long l2 = this.jF(n2);
        long l3 = this.jF(n3);
        long l4 = this.jF(n4);
        OpenGlHelper.W(OpenGlHelper.bNu, this.cbS);
        OpenGlHelper.W(OpenGlHelper.bNv, this.cbS);
        OpenGlHelper.a(OpenGlHelper.bNu, OpenGlHelper.bNv, l2, l3, l4);
        a.fP("Copy VBO range");
        OpenGlHelper.W(OpenGlHelper.bNu, 0);
        OpenGlHelper.W(OpenGlHelper.bNv, 0);
    }

    private void jE(int n2) {
        int n3 = this.dyI * 6 / 4;
        while (n3 < n2) {
            n3 = n3 * 6 / 4;
        }
        long l2 = this.jF(this.dyI);
        long l3 = this.jF(n3);
        int n4 = OpenGlHelper.Ku();
        OpenGlHelper.W(OpenGlHelper.bNo, n4);
        OpenGlHelper.a(OpenGlHelper.bNo, l3, OpenGlHelper.bNp);
        a.fP("Expand VBO");
        OpenGlHelper.W(OpenGlHelper.bNo, 0);
        OpenGlHelper.W(OpenGlHelper.bNu, this.cbS);
        OpenGlHelper.W(OpenGlHelper.bNv, n4);
        OpenGlHelper.a(OpenGlHelper.bNu, OpenGlHelper.bNv, 0L, 0L, l2);
        a.fP("Copy VBO: " + l3);
        OpenGlHelper.W(OpenGlHelper.bNu, 0);
        OpenGlHelper.W(OpenGlHelper.bNv, 0);
        OpenGlHelper.db(this.cbS);
        this.euq = a.cF(n3);
        this.eur = a.cF(n3);
        this.cbS = n4;
        this.dyI = n3;
    }

    public void OI() {
        OpenGlHelper.W(OpenGlHelper.bNo, this.cbS);
    }

    public void a(int n2, h h2) {
        if (this.bPX != n2) {
            if (this.euq.position() > 0) {
                throw new IllegalArgumentException("Mixed region draw modes: " + this.bPX + " != " + n2);
            }
            this.bPX = n2;
        }
        this.euq.put(h2.getPosition());
        this.eur.put(h2.getSize());
    }

    public void a(VboRenderList vboRenderList) {
        this.OI();
        vboRenderList.Lr();
        this.euq.flip();
        this.eur.flip();
        GlStateManager.a(this.bPX, this.euq, this.eur);
        this.euq.limit(this.euq.capacity());
        this.eur.limit(this.eur.capacity());
        if (this.eum > this.eun * 11 / 10) {
            this.jC(1);
        }
    }

    public void OJ() {
        OpenGlHelper.W(OpenGlHelper.bNo, 0);
    }

    public void OK() {
        if (this.cbS >= 0) {
            OpenGlHelper.db(this.cbS);
            this.cbS = -1;
        }
    }

    private long jF(int n2) {
        return (long)n2 * (long)this.eus;
    }

    private int R(long l2) {
        return (int)(l2 / (long)this.eus);
    }

    public int aEm() {
        return this.eum;
    }
}

