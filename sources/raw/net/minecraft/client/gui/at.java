/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.gui;

import net.minecraft.client.d;
import net.minecraft.client.gui.c;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.util.bt;

public class at
extends c {
    private float sliderValue = 1.0f;
    public boolean dragging;
    private final net.minecraft.client.settings.c bqd;
    private final float bqe;
    private final float bqf;

    public at(int n2, int n3, int n4, net.minecraft.client.settings.c c2) {
        this(n2, n3, n4, c2, 0.0f, 1.0f);
    }

    public at(int n2, int n3, int n4, net.minecraft.client.settings.c c2, float f2, float f3) {
        super(n2, n3, n4, 150, 20, "");
        this.bqd = c2;
        this.bqe = f2;
        this.bqf = f3;
        d d2 = d.AZ();
        this.sliderValue = c2.aI(d2.aIY.a(c2));
        this.displayString = d2.aIY.c(c2);
    }

    @Override
    protected int getHoverState(boolean bl2) {
        return 0;
    }

    @Override
    protected void mouseDragged(d d2, int n2, int n3) {
        if (this.visible) {
            if (this.dragging) {
                this.sliderValue = (float)(n2 - (this.xPosition + 4)) / (float)(this.width - 8);
                this.sliderValue = bt.I(this.sliderValue, 0.0f, 1.0f);
                float f2 = this.bqd.aJ(this.sliderValue);
                d2.aIY.a(this.bqd, f2);
                this.sliderValue = this.bqd.aI(f2);
                this.displayString = d2.aIY.c(this.bqd);
            }
            d2.Bq().a(buttonTextures);
            GlStateManager.e(1.0f, 1.0f, 1.0f, 1.0f);
            this.drawTexturedModalRect((float)(this.xPosition + (int)(this.sliderValue * (float)(this.width - 8))), this.yPosition, 0, 66, 4, 20);
            this.drawTexturedModalRect((float)(this.xPosition + (int)(this.sliderValue * (float)(this.width - 8)) + 4), this.yPosition, 196, 66, 4, 20);
        }
    }

    @Override
    public boolean mousePressed(d d2, int n2, int n3) {
        if (super.mousePressed(d2, n2, n3)) {
            this.sliderValue = (float)(n2 - (this.xPosition + 4)) / (float)(this.width - 8);
            this.sliderValue = bt.I(this.sliderValue, 0.0f, 1.0f);
            d2.aIY.a(this.bqd, this.bqd.aJ(this.sliderValue));
            this.displayString = d2.aIY.c(this.bqd);
            this.dragging = true;
            return true;
        }
        return false;
    }

    @Override
    public void mouseReleased(int n2, int n3) {
        this.dragging = false;
    }
}

