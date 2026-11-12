/*
 * Decompiled with CFR 0.152.
 */
package net.optifine;

import java.util.IdentityHashMap;
import java.util.Map;
import net.minecraft.client.renderer.block.model.BakedQuad;
import net.minecraft.client.renderer.texture.TextureAtlasSprite;
import net.optifine.i;
import net.optifine.j;
import net.optifine.m;
import net.optifine.render.g;

public class l {
    private static final int dXB = 0;
    private static final int dXC = 1;
    private static final int dXD = 2;
    private static final int dXE = 3;
    private static final int dXF = 4;

    public static BakedQuad[] a(int n2, i i2, int n3, BakedQuad bakedQuad, g g2) {
        int n4;
        if (i2.dVS != null && n2 >= 0 && n2 < i2.dVS.length && (n4 = i2.dVS[n2]) >= 0 && n4 <= i2.dWb.length) {
            return l.a(n4, i2.dWb, bakedQuad, g2);
        }
        switch (n2) {
            case 1: {
                return l.a(0, 3, i2.dWb, n3, bakedQuad, g2);
            }
            case 2: {
                return l.a(3, i2.dWb, bakedQuad, g2);
            }
            case 3: {
                return l.a(3, 0, i2.dWb, n3, bakedQuad, g2);
            }
            case 4: {
                return l.a(0, 3, 2, 4, i2.dWb, n3, bakedQuad, g2);
            }
            case 5: {
                return l.a(3, 0, 4, 2, i2.dWb, n3, bakedQuad, g2);
            }
            case 6: {
                return l.a(2, 4, 2, 4, i2.dWb, n3, bakedQuad, g2);
            }
            case 7: {
                return l.a(3, 3, 4, 4, i2.dWb, n3, bakedQuad, g2);
            }
            case 8: {
                return l.a(4, 1, 4, 4, i2.dWb, n3, bakedQuad, g2);
            }
            case 9: {
                return l.a(4, 4, 4, 1, i2.dWb, n3, bakedQuad, g2);
            }
            case 10: {
                return l.a(1, 4, 1, 4, i2.dWb, n3, bakedQuad, g2);
            }
            case 11: {
                return l.a(1, 1, 4, 4, i2.dWb, n3, bakedQuad, g2);
            }
            case 12: {
                return l.b(0, 2, i2.dWb, n3, bakedQuad, g2);
            }
            case 13: {
                return l.a(0, 3, 2, 1, i2.dWb, n3, bakedQuad, g2);
            }
            case 14: {
                return l.b(3, 1, i2.dWb, n3, bakedQuad, g2);
            }
            case 15: {
                return l.a(3, 0, 1, 2, i2.dWb, n3, bakedQuad, g2);
            }
            case 16: {
                return l.a(2, 4, 0, 3, i2.dWb, n3, bakedQuad, g2);
            }
            case 17: {
                return l.a(4, 2, 3, 0, i2.dWb, n3, bakedQuad, g2);
            }
            case 18: {
                return l.a(4, 4, 3, 3, i2.dWb, n3, bakedQuad, g2);
            }
            case 19: {
                return l.a(4, 2, 4, 2, i2.dWb, n3, bakedQuad, g2);
            }
            case 20: {
                return l.a(1, 4, 4, 4, i2.dWb, n3, bakedQuad, g2);
            }
            case 21: {
                return l.a(4, 4, 1, 4, i2.dWb, n3, bakedQuad, g2);
            }
            case 22: {
                return l.a(4, 4, 1, 1, i2.dWb, n3, bakedQuad, g2);
            }
            case 23: {
                return l.a(4, 1, 4, 1, i2.dWb, n3, bakedQuad, g2);
            }
            case 24: {
                return l.a(2, i2.dWb, bakedQuad, g2);
            }
            case 25: {
                return l.a(2, 1, i2.dWb, n3, bakedQuad, g2);
            }
            case 26: {
                return l.a(1, i2.dWb, bakedQuad, g2);
            }
            case 27: {
                return l.a(1, 2, i2.dWb, n3, bakedQuad, g2);
            }
            case 28: {
                return l.a(2, 4, 2, 1, i2.dWb, n3, bakedQuad, g2);
            }
            case 29: {
                return l.a(3, 3, 1, 4, i2.dWb, n3, bakedQuad, g2);
            }
            case 30: {
                return l.a(2, 1, 2, 4, i2.dWb, n3, bakedQuad, g2);
            }
            case 31: {
                return l.a(3, 3, 4, 1, i2.dWb, n3, bakedQuad, g2);
            }
            case 32: {
                return l.a(1, 1, 1, 4, i2.dWb, n3, bakedQuad, g2);
            }
            case 33: {
                return l.a(1, 1, 4, 1, i2.dWb, n3, bakedQuad, g2);
            }
            case 34: {
                return l.a(4, 1, 1, 4, i2.dWb, n3, bakedQuad, g2);
            }
            case 35: {
                return l.a(1, 4, 4, 1, i2.dWb, n3, bakedQuad, g2);
            }
            case 36: {
                return l.b(2, 0, i2.dWb, n3, bakedQuad, g2);
            }
            case 37: {
                return l.a(2, 1, 0, 3, i2.dWb, n3, bakedQuad, g2);
            }
            case 38: {
                return l.b(1, 3, i2.dWb, n3, bakedQuad, g2);
            }
            case 39: {
                return l.a(1, 2, 3, 0, i2.dWb, n3, bakedQuad, g2);
            }
            case 40: {
                return l.a(4, 1, 3, 3, i2.dWb, n3, bakedQuad, g2);
            }
            case 41: {
                return l.a(1, 2, 4, 2, i2.dWb, n3, bakedQuad, g2);
            }
            case 42: {
                return l.a(1, 4, 3, 3, i2.dWb, n3, bakedQuad, g2);
            }
            case 43: {
                return l.a(4, 2, 1, 2, i2.dWb, n3, bakedQuad, g2);
            }
            case 44: {
                return l.a(1, 4, 1, 1, i2.dWb, n3, bakedQuad, g2);
            }
            case 45: {
                return l.a(4, 1, 1, 1, i2.dWb, n3, bakedQuad, g2);
            }
            case 46: {
                return l.a(4, i2.dWb, bakedQuad, g2);
            }
        }
        return l.a(0, i2.dWb, bakedQuad, g2);
    }

    private static BakedQuad[] a(int n2, int n3, TextureAtlasSprite[] textureAtlasSpriteArray, int n4, BakedQuad bakedQuad, g g2) {
        return l.a(m.dXM, n2, m.dXI, n3, textureAtlasSpriteArray, n4, bakedQuad, g2);
    }

    private static BakedQuad[] b(int n2, int n3, TextureAtlasSprite[] textureAtlasSpriteArray, int n4, BakedQuad bakedQuad, g g2) {
        return l.a(m.dXG, n2, m.dXK, n3, textureAtlasSpriteArray, n4, bakedQuad, g2);
    }

    private static BakedQuad[] a(int n2, int n3, int n4, int n5, TextureAtlasSprite[] textureAtlasSpriteArray, int n6, BakedQuad bakedQuad, g g2) {
        return n2 == n3 ? (n4 == n5 ? l.a(m.dXG, n2, m.dXK, n4, textureAtlasSpriteArray, n6, bakedQuad, g2) : l.a(m.dXG, n2, m.dXL, n4, m.dXJ, n5, textureAtlasSpriteArray, n6, bakedQuad, g2)) : (n4 == n5 ? l.a(m.dXN, n2, m.dXH, n3, m.dXK, n4, textureAtlasSpriteArray, n6, bakedQuad, g2) : (n2 == n4 ? (n3 == n5 ? l.a(m.dXM, n2, m.dXI, n3, textureAtlasSpriteArray, n6, bakedQuad, g2) : l.a(m.dXM, n2, m.dXH, n3, m.dXJ, n5, textureAtlasSpriteArray, n6, bakedQuad, g2)) : (n3 == n5 ? l.a(m.dXN, n2, m.dXL, n4, m.dXI, n3, textureAtlasSpriteArray, n6, bakedQuad, g2) : l.a(m.dXN, n2, m.dXH, n3, m.dXL, n4, m.dXJ, n5, textureAtlasSpriteArray, n6, bakedQuad, g2))));
    }

    private static BakedQuad[] a(int n2, TextureAtlasSprite[] textureAtlasSpriteArray, BakedQuad bakedQuad, g g2) {
        TextureAtlasSprite textureAtlasSprite = textureAtlasSpriteArray[n2];
        return j.a(textureAtlasSprite, bakedQuad, g2);
    }

    private static BakedQuad[] a(m m2, int n2, m m3, int n3, TextureAtlasSprite[] textureAtlasSpriteArray, int n4, BakedQuad bakedQuad, g g2) {
        BakedQuad bakedQuad2 = l.a(textureAtlasSpriteArray[n2], m2, n4, bakedQuad, g2);
        BakedQuad bakedQuad3 = l.a(textureAtlasSpriteArray[n3], m3, n4, bakedQuad, g2);
        return g2.a(bakedQuad2, bakedQuad3);
    }

    private static BakedQuad[] a(m m2, int n2, m m3, int n3, m m4, int n4, TextureAtlasSprite[] textureAtlasSpriteArray, int n5, BakedQuad bakedQuad, g g2) {
        BakedQuad bakedQuad2 = l.a(textureAtlasSpriteArray[n2], m2, n5, bakedQuad, g2);
        BakedQuad bakedQuad3 = l.a(textureAtlasSpriteArray[n3], m3, n5, bakedQuad, g2);
        BakedQuad bakedQuad4 = l.a(textureAtlasSpriteArray[n4], m4, n5, bakedQuad, g2);
        return g2.a(bakedQuad2, bakedQuad3, bakedQuad4);
    }

    private static BakedQuad[] a(m m2, int n2, m m3, int n3, m m4, int n4, m m5, int n5, TextureAtlasSprite[] textureAtlasSpriteArray, int n6, BakedQuad bakedQuad, g g2) {
        BakedQuad bakedQuad2 = l.a(textureAtlasSpriteArray[n2], m2, n6, bakedQuad, g2);
        BakedQuad bakedQuad3 = l.a(textureAtlasSpriteArray[n3], m3, n6, bakedQuad, g2);
        BakedQuad bakedQuad4 = l.a(textureAtlasSpriteArray[n4], m4, n6, bakedQuad, g2);
        BakedQuad bakedQuad5 = l.a(textureAtlasSpriteArray[n5], m5, n6, bakedQuad, g2);
        return g2.a(bakedQuad2, bakedQuad3, bakedQuad4, bakedQuad5);
    }

    private static BakedQuad a(TextureAtlasSprite textureAtlasSprite, m m2, int n2, BakedQuad bakedQuad, g g2) {
        switch (m2.ordinal()) {
            case 0: {
                return l.a(textureAtlasSprite, m2, 0, 0, 16, 8, n2, bakedQuad, g2);
            }
            case 1: {
                return l.a(textureAtlasSprite, m2, 8, 0, 16, 8, n2, bakedQuad, g2);
            }
            case 2: {
                return l.a(textureAtlasSprite, m2, 8, 0, 16, 16, n2, bakedQuad, g2);
            }
            case 3: {
                return l.a(textureAtlasSprite, m2, 8, 8, 16, 16, n2, bakedQuad, g2);
            }
            case 4: {
                return l.a(textureAtlasSprite, m2, 0, 8, 16, 16, n2, bakedQuad, g2);
            }
            case 5: {
                return l.a(textureAtlasSprite, m2, 0, 8, 8, 16, n2, bakedQuad, g2);
            }
            case 6: {
                return l.a(textureAtlasSprite, m2, 0, 0, 8, 16, n2, bakedQuad, g2);
            }
            case 7: {
                return l.a(textureAtlasSprite, m2, 0, 0, 8, 8, n2, bakedQuad, g2);
            }
        }
        return bakedQuad;
    }

    private static BakedQuad a(TextureAtlasSprite textureAtlasSprite, m m2, int n2, int n3, int n4, int n5, int n6, BakedQuad bakedQuad, g g2) {
        Map[][] mapArray = j.aAp();
        if (mapArray == null) {
            return bakedQuad;
        }
        int n7 = textureAtlasSprite.Oj();
        if (n7 >= 0 && n7 < mapArray.length) {
            BakedQuad bakedQuad2;
            IdentityHashMap<BakedQuad, BakedQuad> identityHashMap;
            Map[] mapArray2 = mapArray[n7];
            if (mapArray2 == null) {
                mapArray2 = new Map[m.dXO.length];
                mapArray[n7] = mapArray2;
            }
            if ((identityHashMap = mapArray2[m2.ordinal()]) == null) {
                mapArray2[m2.ordinal()] = identityHashMap = new IdentityHashMap<BakedQuad, BakedQuad>(1);
            }
            if ((bakedQuad2 = (BakedQuad)identityHashMap.get(bakedQuad)) == null) {
                bakedQuad2 = l.a(bakedQuad, textureAtlasSprite, n6, n2, n3, n4, n5);
                identityHashMap.put(bakedQuad, bakedQuad2);
            }
            return bakedQuad2;
        }
        return bakedQuad;
    }

    private static BakedQuad a(BakedQuad bakedQuad, TextureAtlasSprite textureAtlasSprite, int n2, int n3, int n4, int n5, int n6) {
        int[] nArray = (int[])bakedQuad.LP().clone();
        TextureAtlasSprite textureAtlasSprite2 = bakedQuad.LO();
        for (int i2 = 0; i2 < 4; ++i2) {
            l.a(nArray, i2, textureAtlasSprite2, textureAtlasSprite, n2, n3, n4, n5, n6);
        }
        BakedQuad bakedQuad2 = new BakedQuad(nArray, bakedQuad.LR(), bakedQuad.LS(), textureAtlasSprite);
        return bakedQuad2;
    }

    private static void a(int[] nArray, int n2, TextureAtlasSprite textureAtlasSprite, TextureAtlasSprite textureAtlasSprite2, int n3, int n4, int n5, int n6, int n7) {
        float f2;
        float f3;
        int n8 = nArray.length / 4;
        int n9 = n8 * n2;
        float f4 = Float.intBitsToFloat(nArray[n9 + 4]);
        float f5 = Float.intBitsToFloat(nArray[n9 + 4 + 1]);
        double d2 = textureAtlasSprite.aD(f4);
        double d3 = textureAtlasSprite.aE(f5);
        float f6 = Float.intBitsToFloat(nArray[n9 + 0]);
        float f7 = Float.intBitsToFloat(nArray[n9 + 1]);
        float f8 = Float.intBitsToFloat(nArray[n9 + 2]);
        switch (n3) {
            case 0: {
                f3 = f6;
                f2 = 1.0f - f8;
                break;
            }
            case 1: {
                f3 = f6;
                f2 = f8;
                break;
            }
            case 2: {
                f3 = 1.0f - f6;
                f2 = 1.0f - f7;
                break;
            }
            case 3: {
                f3 = f6;
                f2 = 1.0f - f7;
                break;
            }
            case 4: {
                f3 = f8;
                f2 = 1.0f - f7;
                break;
            }
            case 5: {
                f3 = 1.0f - f8;
                f2 = 1.0f - f7;
                break;
            }
            default: {
                return;
            }
        }
        float f9 = 15.968f;
        float f10 = 15.968f;
        if (d2 < (double)n4) {
            f3 = (float)((double)f3 + ((double)n4 - d2) / (double)15.968f);
            d2 = n4;
        }
        if (d2 > (double)n6) {
            f3 = (float)((double)f3 - (d2 - (double)n6) / (double)15.968f);
            d2 = n6;
        }
        if (d3 < (double)n5) {
            f2 = (float)((double)f2 + ((double)n5 - d3) / (double)15.968f);
            d3 = n5;
        }
        if (d3 > (double)n7) {
            f2 = (float)((double)f2 - (d3 - (double)n7) / (double)15.968f);
            d3 = n7;
        }
        switch (n3) {
            case 0: {
                f6 = f3;
                f8 = 1.0f - f2;
                break;
            }
            case 1: {
                f6 = f3;
                f8 = f2;
                break;
            }
            case 2: {
                f6 = 1.0f - f3;
                f7 = 1.0f - f2;
                break;
            }
            case 3: {
                f6 = f3;
                f7 = 1.0f - f2;
                break;
            }
            case 4: {
                f8 = f3;
                f7 = 1.0f - f2;
                break;
            }
            case 5: {
                f8 = 1.0f - f3;
                f7 = 1.0f - f2;
                break;
            }
            default: {
                return;
            }
        }
        nArray[n9 + 4] = Float.floatToRawIntBits(textureAtlasSprite2.al(d2));
        nArray[n9 + 4 + 1] = Float.floatToRawIntBits(textureAtlasSprite2.am(d3));
        nArray[n9 + 0] = Float.floatToRawIntBits(f6);
        nArray[n9 + 1] = Float.floatToRawIntBits(f7);
        nArray[n9 + 2] = Float.floatToRawIntBits(f8);
    }
}

