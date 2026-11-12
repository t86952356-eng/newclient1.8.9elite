/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.renderer;

import net.minecraft.client.renderer.GlStateManager$BooleanState;

class GlStateManager$TexGenCoord {
    public GlStateManager$BooleanState bLP;
    public int bLQ;
    public int bLR = -1;

    public GlStateManager$TexGenCoord(int n2, int n3) {
        this.bLQ = n2;
        this.bLP = new GlStateManager$BooleanState(n3);
    }
}

