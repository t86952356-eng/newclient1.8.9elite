/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.gui.inventory;

import net.minecraft.client.d;
import net.minecraft.client.gui.inventory.b;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.util.cm;

class c
extends net.minecraft.client.gui.c {
    private final cm bvP;
    private final int bvQ;
    private final int bvR;
    private boolean bvS;

    protected c(int n2, int n3, int n4, cm cm2, int n5, int n6) {
        super(n2, n3, n4, 22, 22, "");
        this.bvP = cm2;
        this.bvQ = n5;
        this.bvR = n6;
    }

    @Override
    public void drawButton(d d2, int n2, int n3) {
        if (this.visible) {
            d2.Bq().a(b.bvL);
            GlStateManager.e(1.0f, 1.0f, 1.0f, 1.0f);
            this.hovered = n2 >= this.xPosition && n3 >= this.yPosition && n2 < this.xPosition + this.width && n3 < this.yPosition + this.height;
            int n4 = 219;
            int n5 = 0;
            if (!this.enabled) {
                n5 += this.width * 2;
            } else if (this.bvS) {
                n5 += this.width * 1;
            } else if (this.hovered) {
                n5 += this.width * 3;
            }
            this.drawTexturedModalRect((float)this.xPosition, this.yPosition, n5, 219, this.width, this.height);
            if (!b.bvL.equals(this.bvP)) {
                d2.Bq().a(this.bvP);
            }
            this.drawTexturedModalRect((float)(this.xPosition + 2), this.yPosition + 2, this.bvQ, this.bvR, 18, 18);
        }
    }

    public boolean GC() {
        return this.bvS;
    }

    public void aj(boolean bl2) {
        this.bvS = bl2;
    }
}

