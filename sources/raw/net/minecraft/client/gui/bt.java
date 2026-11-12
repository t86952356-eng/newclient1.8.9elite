/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.gui;

import net.minecraft.client.d;
import net.minecraft.client.gui.bs;
import net.minecraft.client.gui.c;
import net.minecraft.client.renderer.GlStateManager;

class bt
extends c {
    private final boolean brG;

    public bt(int n2, int n3, int n4, boolean bl2) {
        super(n2, n3, n4, 23, 13, "");
        this.brG = bl2;
    }

    @Override
    public void drawButton(d d2, int n2, int n3) {
        if (this.visible) {
            boolean bl2 = n2 >= this.xPosition && n3 >= this.yPosition && n2 < this.xPosition + this.width && n3 < this.yPosition + this.height;
            GlStateManager.e(1.0f, 1.0f, 1.0f, 1.0f);
            d2.Bq().a(bs.brl);
            int n4 = 0;
            int n5 = 192;
            if (bl2) {
                n4 += 23;
            }
            if (!this.brG) {
                n5 += 13;
            }
            this.drawTexturedModalRect((float)this.xPosition, this.yPosition, n4, n5, 23, 13);
        }
    }
}

