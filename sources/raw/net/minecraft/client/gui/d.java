/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.gui;

import net.minecraft.client.gui.c;
import net.minecraft.client.renderer.GlStateManager;

public class d
extends c {
    public d(int n2, int n3, int n4) {
        super(n2, n3, n4, 20, 20, "");
    }

    @Override
    public void drawButton(net.minecraft.client.d d2, int n2, int n3) {
        if (this.visible) {
            d2.Bq().a(c.buttonTextures);
            GlStateManager.e(1.0f, 1.0f, 1.0f, 1.0f);
            boolean bl2 = n2 >= this.xPosition && n3 >= this.yPosition && n2 < this.xPosition + this.width && n3 < this.yPosition + this.height;
            int n4 = 106;
            if (bl2) {
                n4 += this.height;
            }
            this.drawTexturedModalRect((float)this.xPosition, this.yPosition, 0, n4, this.width, this.height);
        }
    }
}

