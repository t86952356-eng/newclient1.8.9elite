/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
package net.minecraft.client.renderer;

import org.lwjgl.opengl.GL11;

class GlStateManager$BooleanState {
    private final int bLh;
    private boolean bLi = false;

    public GlStateManager$BooleanState(int n2) {
        this.bLh = n2;
    }

    public void Kf() {
        this.ao(false);
    }

    public void Kg() {
        this.ao(true);
    }

    public void ao(boolean bl2) {
        if (bl2 != this.bLi) {
            this.bLi = bl2;
            if (bl2) {
                GL11.glEnable((int)this.bLh);
            } else {
                GL11.glDisable((int)this.bLh);
            }
        }
    }
}

