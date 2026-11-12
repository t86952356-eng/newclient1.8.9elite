/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.renderer.block.model;

import java.util.Arrays;
import net.minecraft.client.renderer.block.model.BakedQuad;
import net.minecraft.client.renderer.block.model.FaceBakery;
import net.minecraft.client.renderer.texture.TextureAtlasSprite;

public class BreakingFour
extends BakedQuad {
    private final TextureAtlasSprite bQP;

    public BreakingFour(BakedQuad bakedQuad, TextureAtlasSprite textureAtlasSprite) {
        super(Arrays.copyOf(bakedQuad.LP(), bakedQuad.LP().length), bakedQuad.bQs, FaceBakery.g(bakedQuad.LP()));
        this.bQP = textureAtlasSprite;
        this.Me();
        this.LU();
    }

    private void Me() {
        for (int i2 = 0; i2 < 4; ++i2) {
            this.dr(i2);
        }
    }

    private void dr(int n2) {
        int n3 = this.bQr.length / 4;
        int n4 = n3 * n2;
        float f2 = Float.intBitsToFloat(this.bQr[n4]);
        float f3 = Float.intBitsToFloat(this.bQr[n4 + 1]);
        float f4 = Float.intBitsToFloat(this.bQr[n4 + 2]);
        float f5 = 0.0f;
        float f6 = 0.0f;
        switch (this.acc) {
            case dwq: {
                f5 = f2 * 16.0f;
                f6 = (1.0f - f4) * 16.0f;
                break;
            }
            case dwr: {
                f5 = f2 * 16.0f;
                f6 = f4 * 16.0f;
                break;
            }
            case dws: {
                f5 = (1.0f - f2) * 16.0f;
                f6 = (1.0f - f3) * 16.0f;
                break;
            }
            case dwt: {
                f5 = f2 * 16.0f;
                f6 = (1.0f - f3) * 16.0f;
                break;
            }
            case dwu: {
                f5 = f4 * 16.0f;
                f6 = (1.0f - f3) * 16.0f;
                break;
            }
            case dwv: {
                f5 = (1.0f - f4) * 16.0f;
                f6 = (1.0f - f3) * 16.0f;
            }
        }
        this.bQr[n4 + 4] = Float.floatToRawIntBits(this.bQP.al(f5));
        this.bQr[n4 + 4 + 1] = Float.floatToRawIntBits(this.bQP.am(f6));
    }
}

