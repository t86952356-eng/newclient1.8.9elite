/*
 * Decompiled with CFR 0.152.
 */
package net.optifine.shaders.gui;

import net.minecraft.client.d;
import net.minecraft.client.gui.c;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.util.cm;

public class a
extends c {
    public a(int n2, int n3, int n4) {
        super(n2, n3, n4, 22, 20, "");
    }

    @Override
    public void drawButton(d d2, int n2, int n3) {
        if (this.visible) {
            super.drawButton(d2, n2, n3);
            cm cm2 = new cm("optifine/textures/icons.png");
            d2.Bq().a(cm2);
            GlStateManager.e(1.0f, 1.0f, 1.0f, 1.0f);
            this.drawTexturedModalRect((float)(this.xPosition + 3), this.yPosition + 2, 0, 0, 16, 16);
        }
    }
}

