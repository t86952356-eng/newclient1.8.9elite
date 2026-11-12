/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.renderer.texture;

import java.util.concurrent.Callable;

class TextureAtlasSprite$1
implements Callable<String> {
    final /* synthetic */ int[][] bZq;

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    TextureAtlasSprite$1() {
        void var2_-1;
        this.bZq = var2_-1;
    }

    public String HV() {
        StringBuilder stringBuilder = new StringBuilder();
        for (int[] nArray : this.bZq) {
            if (stringBuilder.length() > 0) {
                stringBuilder.append(", ");
            }
            stringBuilder.append(nArray == null ? "null" : Integer.valueOf(nArray.length));
        }
        return stringBuilder.toString();
    }

    @Override
    public /* synthetic */ Object call() {
        return this.HV();
    }
}

