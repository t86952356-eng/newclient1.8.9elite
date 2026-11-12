/*
 * Decompiled with CFR 0.152.
 */
package net.optifine.config;

import net.minecraft.block.state.BlockStateBase;
import net.minecraft.client.renderer.texture.TextureAtlasSprite;
import net.optifine.config.j;

public class k {
    public static boolean a(BlockStateBase blockStateBase, j[] jArray) {
        if (jArray == null) {
            return true;
        }
        for (int i2 = 0; i2 < jArray.length; ++i2) {
            j j2 = jArray[i2];
            if (!j2.b(blockStateBase)) continue;
            return true;
        }
        return false;
    }

    public static boolean a(int n2, int n3, j[] jArray) {
        if (jArray == null) {
            return true;
        }
        for (int i2 = 0; i2 < jArray.length; ++i2) {
            j j2 = jArray[i2];
            if (!j2.bH(n2, n3)) continue;
            return true;
        }
        return false;
    }

    public static boolean a(int n2, j[] jArray) {
        if (jArray == null) {
            return true;
        }
        for (int i2 = 0; i2 < jArray.length; ++i2) {
            j j2 = jArray[i2];
            if (j2.zW() != n2) continue;
            return true;
        }
        return false;
    }

    public static boolean e(int n2, int[] nArray) {
        if (nArray == null) {
            return true;
        }
        for (int i2 = 0; i2 < nArray.length; ++i2) {
            if (nArray[i2] != n2) continue;
            return true;
        }
        return false;
    }

    public static boolean a(TextureAtlasSprite textureAtlasSprite, TextureAtlasSprite[] textureAtlasSpriteArray) {
        if (textureAtlasSpriteArray == null) {
            return true;
        }
        for (int i2 = 0; i2 < textureAtlasSpriteArray.length; ++i2) {
            if (textureAtlasSpriteArray[i2] != textureAtlasSprite) continue;
            return true;
        }
        return false;
    }

    public static boolean a(net.minecraft.world.biome.j j2, net.minecraft.world.biome.j[] jArray) {
        if (jArray == null) {
            return true;
        }
        for (int i2 = 0; i2 < jArray.length; ++i2) {
            if (jArray[i2] != j2) continue;
            return true;
        }
        return false;
    }
}

