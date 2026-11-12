/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.gui;

import net.minecraft.client.d;
import net.minecraft.client.gui.ao;
import net.minecraft.client.gui.c;
import net.minecraft.client.renderer.GlStateManager;

class ap
extends c {
    private final boolean bpC;

    public ap(int n2, int n3, int n4, boolean bl2) {
        super(n2, n3, n4, 12, 19, "");
        this.bpC = bl2;
    }

    @Override
    public void drawButton(d d2, int n2, int n3) {
        if (this.visible) {
            d2.Bq().a(ao.bpw);
            GlStateManager.e(1.0f, 1.0f, 1.0f, 1.0f);
            boolean bl2 = n2 >= this.xPosition && n3 >= this.yPosition && n2 < this.xPosition + this.width && n3 < this.yPosition + this.height;
            int n4 = 0;
            int n5 = 176;
            if (!this.enabled) {
                n5 += this.width * 2;
            } else if (bl2) {
                n5 += this.width;
            }
            if (!this.bpC) {
                n4 += this.height;
            }
            this.drawTexturedModalRect((float)this.xPosition, this.yPosition, n5, n4, this.width, this.height);
        }
    }
}

