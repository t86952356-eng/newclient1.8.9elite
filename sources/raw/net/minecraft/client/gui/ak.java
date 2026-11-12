/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.gui;

import net.minecraft.client.d;
import net.minecraft.client.gui.al;
import net.minecraft.client.gui.c;
import net.minecraft.client.renderer.GlStateManager;

public class ak
extends c {
    private boolean boJ = false;

    public ak(int n2, int n3, int n4) {
        super(n2, n3, n4, 20, 20, "");
    }

    public boolean EG() {
        return this.boJ;
    }

    public void ab(boolean bl2) {
        this.boJ = bl2;
    }

    @Override
    public void drawButton(d d2, int n2, int n3) {
        if (this.visible) {
            boolean bl2;
            d2.Bq().a(c.buttonTextures);
            GlStateManager.e(1.0f, 1.0f, 1.0f, 1.0f);
            boolean bl3 = bl2 = n2 >= this.xPosition && n3 >= this.yPosition && n2 < this.xPosition + this.width && n3 < this.yPosition + this.height;
            al al2 = this.boJ ? (!this.enabled ? al.boM : (bl2 ? al.boL : al.boK)) : (!this.enabled ? al.boP : (bl2 ? al.boO : al.boN));
            this.drawTexturedModalRect((float)this.xPosition, this.yPosition, al2.EH(), al2.EI(), this.width, this.height);
        }
    }
}

