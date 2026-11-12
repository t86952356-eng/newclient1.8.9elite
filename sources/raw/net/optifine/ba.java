/*
 * Decompiled with CFR 0.152.
 */
package net.optifine;

import java.util.IdentityHashMap;
import java.util.Map;
import net.minecraft.client.renderer.block.model.BakedQuad;
import net.minecraft.client.renderer.texture.TextureAtlasSprite;
import net.minecraft.src.a;
import net.minecraft.util.ao;
import net.minecraft.util.bt;

public class ba {
    public int bQz = 1;
    public boolean edF = false;
    private final Map[] edG = new Map[8];

    public ba(String string) {
        switch (string) {
            case "4": {
                this.bQz = 4;
                break;
            }
            case "2": {
                this.bQz = 2;
                break;
            }
            case "F": {
                this.edF = true;
                break;
            }
            case "4F": {
                this.bQz = 4;
                this.edF = true;
                break;
            }
            case "2F": {
                this.bQz = 2;
                this.edF = true;
                break;
            }
            default: {
                a.warn("NaturalTextures: Unknown type: " + string);
            }
        }
    }

    public boolean ln() {
        return this.bQz == 2 || this.bQz == 4 || this.edF;
    }

    public synchronized BakedQuad a(BakedQuad bakedQuad, int n2, boolean bl2) {
        int n3 = n2;
        if (bl2) {
            n3 = n2 | 4;
        }
        if (n3 > 0 && n3 < this.edG.length) {
            BakedQuad bakedQuad2;
            IdentityHashMap<BakedQuad, BakedQuad> identityHashMap = this.edG[n3];
            if (identityHashMap == null) {
                this.edG[n3] = identityHashMap = new IdentityHashMap<BakedQuad, BakedQuad>(1);
            }
            if ((bakedQuad2 = (BakedQuad)identityHashMap.get(bakedQuad)) == null) {
                bakedQuad2 = this.b(bakedQuad, n2, bl2);
                identityHashMap.put(bakedQuad, bakedQuad2);
            }
            return bakedQuad2;
        }
        return bakedQuad;
    }

    private BakedQuad b(BakedQuad bakedQuad, int n2, boolean bl2) {
        int[] nArray = bakedQuad.LP();
        int n3 = bakedQuad.LR();
        ao ao2 = bakedQuad.LS();
        TextureAtlasSprite textureAtlasSprite = bakedQuad.LO();
        if (!this.b(bakedQuad)) {
            n2 = 0;
        }
        nArray = this.a(nArray, n2, bl2);
        BakedQuad bakedQuad2 = new BakedQuad(nArray, n3, ao2, textureAtlasSprite);
        return bakedQuad2;
    }

    private int[] a(int[] nArray, int n2, boolean bl2) {
        int[] nArray2 = (int[])nArray.clone();
        int n3 = 4 - n2;
        if (bl2) {
            n3 += 3;
        }
        n3 %= 4;
        int n4 = nArray2.length / 4;
        for (int i2 = 0; i2 < 4; ++i2) {
            int n5 = i2 * n4;
            int n6 = n3 * n4;
            nArray2[n6 + 4] = nArray[n5 + 4];
            nArray2[n6 + 4 + 1] = nArray[n5 + 4 + 1];
            if (bl2) {
                if (--n3 >= 0) continue;
                n3 = 3;
                continue;
            }
            if (++n3 <= 3) continue;
            n3 = 0;
        }
        return nArray2;
    }

    private boolean b(BakedQuad bakedQuad) {
        TextureAtlasSprite textureAtlasSprite = bakedQuad.LO();
        float f2 = textureAtlasSprite.NY();
        float f3 = textureAtlasSprite.NZ();
        float f4 = f3 - f2;
        float f5 = f4 / 256.0f;
        float f6 = textureAtlasSprite.Oa();
        float f7 = textureAtlasSprite.Ob();
        float f8 = f7 - f6;
        float f9 = f8 / 256.0f;
        int[] nArray = bakedQuad.LP();
        int n2 = nArray.length / 4;
        for (int i2 = 0; i2 < 4; ++i2) {
            int n3 = i2 * n2;
            float f10 = Float.intBitsToFloat(nArray[n3 + 4]);
            float f11 = Float.intBitsToFloat(nArray[n3 + 4 + 1]);
            if (!this.L(f10, f2, f5) && !this.L(f10, f3, f5)) {
                return false;
            }
            if (this.L(f11, f6, f9) || this.L(f11, f7, f9)) continue;
            return false;
        }
        return true;
    }

    private boolean L(float f2, float f3, float f4) {
        float f5 = bt.bz(f2 - f3);
        return f5 < f4;
    }
}

