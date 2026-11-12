/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.renderer.block.model;

import net.minecraft.client.d;
import net.minecraft.client.renderer.block.model.BreakingFour;
import net.minecraft.client.renderer.block.model.FaceBakery;
import net.minecraft.client.renderer.texture.TextureAtlasSprite;
import net.minecraft.src.a;
import net.minecraft.util.ao;
import net.minecraftforge.client.model.pipeline.b;
import net.optifine.model.f;
import net.optifine.reflect.g;

public class BakedQuad
implements b {
    protected int[] bQr;
    protected final int bQs;
    protected ao acc;
    protected TextureAtlasSprite bQt;
    private int[] bQu = null;
    private f bQv;
    private boolean bQw;
    private BakedQuad bQx;

    public BakedQuad(int[] nArray, int n2, ao ao2, TextureAtlasSprite textureAtlasSprite) {
        this.bQr = nArray;
        this.bQs = n2;
        this.acc = ao2;
        this.bQt = textureAtlasSprite;
        this.LU();
    }

    public BakedQuad(int[] nArray, int n2, ao ao2) {
        this.bQr = nArray;
        this.bQs = n2;
        this.acc = ao2;
        this.LU();
    }

    public TextureAtlasSprite LO() {
        if (this.bQt == null) {
            this.bQt = BakedQuad.d(this.LP());
        }
        return this.bQt;
    }

    public int[] LP() {
        this.LU();
        return this.bQr;
    }

    public boolean LQ() {
        return this.bQs != -1;
    }

    public int LR() {
        return this.bQs;
    }

    public ao LS() {
        if (this.acc == null) {
            this.acc = FaceBakery.g(this.LP());
        }
        return this.acc;
    }

    public int[] LT() {
        if (this.bQu == null) {
            this.bQu = BakedQuad.a(this.LP(), this.LO());
        }
        return this.bQu;
    }

    private static int[] a(int[] nArray, TextureAtlasSprite textureAtlasSprite) {
        int[] nArray2 = (int[])nArray.clone();
        int n2 = textureAtlasSprite.bZe / textureAtlasSprite.NW();
        int n3 = textureAtlasSprite.bZf / textureAtlasSprite.NX();
        int n4 = nArray2.length / 4;
        for (int i2 = 0; i2 < 4; ++i2) {
            int n5 = i2 * n4;
            float f2 = Float.intBitsToFloat(nArray2[n5 + 4]);
            float f3 = Float.intBitsToFloat(nArray2[n5 + 4 + 1]);
            float f4 = textureAtlasSprite.aF(f2);
            float f5 = textureAtlasSprite.aG(f3);
            nArray2[n5 + 4] = Float.floatToRawIntBits(f4);
            nArray2[n5 + 4 + 1] = Float.floatToRawIntBits(f5);
        }
        return nArray2;
    }

    @Override
    public void a(net.minecraftforge.client.model.pipeline.a a2) {
        g.a(g.eqh, a2, this);
    }

    private static TextureAtlasSprite d(int[] nArray) {
        float f2 = 1.0f;
        float f3 = 1.0f;
        float f4 = 0.0f;
        float f5 = 0.0f;
        int n2 = nArray.length / 4;
        for (int i2 = 0; i2 < 4; ++i2) {
            int n3 = i2 * n2;
            float f6 = Float.intBitsToFloat(nArray[n3 + 4]);
            float f7 = Float.intBitsToFloat(nArray[n3 + 4 + 1]);
            f2 = Math.min(f2, f6);
            f3 = Math.min(f3, f7);
            f4 = Math.max(f4, f6);
            f5 = Math.max(f5, f7);
        }
        float f8 = (f2 + f4) / 2.0f;
        float f9 = (f3 + f5) / 2.0f;
        TextureAtlasSprite textureAtlasSprite = d.AZ().Bu().s(f8, f9);
        return textureAtlasSprite;
    }

    protected void LU() {
        if (a.aoG()) {
            if (this.bQr.length == 28) {
                this.bQr = BakedQuad.e(this.bQr);
            }
        } else if (this.bQr.length == 56) {
            this.bQr = BakedQuad.f(this.bQr);
        }
    }

    private static int[] e(int[] nArray) {
        int n2 = nArray.length / 4;
        int n3 = n2 * 2;
        int[] nArray2 = new int[n3 * 4];
        for (int i2 = 0; i2 < 4; ++i2) {
            System.arraycopy(nArray, i2 * n2, nArray2, i2 * n3, n2);
        }
        return nArray2;
    }

    private static int[] f(int[] nArray) {
        int n2 = nArray.length / 4;
        int n3 = n2 / 2;
        int[] nArray2 = new int[n3 * 4];
        for (int i2 = 0; i2 < 4; ++i2) {
            System.arraycopy(nArray, i2 * n2, nArray2, i2 * n3, n3);
        }
        return nArray2;
    }

    public f LV() {
        if (this.bQv == null) {
            this.bQv = new f(this.LP());
        }
        return this.bQv;
    }

    public float LW() {
        f f2 = this.LV();
        return (f2.aDk() + f2.aDh()) / 2.0f;
    }

    public double LX() {
        f f2 = this.LV();
        return (f2.aDl() + f2.aDi()) / 2.0f;
    }

    public double LY() {
        f f2 = this.LV();
        return (f2.aDm() + f2.aDj()) / 2.0f;
    }

    public boolean LZ() {
        f f2 = this.LV();
        return f2.C(this.acc);
    }

    public boolean Ma() {
        f f2 = this.LV();
        return f2.D(this.acc);
    }

    public boolean Mb() {
        return this.Ma() && this.LZ();
    }

    public BakedQuad Mc() {
        if (this.bQw) {
            return this.bQx;
        }
        if (this.bQx == null && this.bQt != null && this.bQt.bZn != null) {
            this.bQx = new BreakingFour(this, this.bQt.bZn);
        }
        this.bQw = true;
        return this.bQx;
    }

    public String toString() {
        return "vertex: " + this.bQr.length / 7 + ", tint: " + this.bQs + ", facing: " + String.valueOf(this.acc) + ", sprite: " + String.valueOf(this.bQt);
    }
}

