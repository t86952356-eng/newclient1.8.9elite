/*
 * Decompiled with CFR 0.152.
 */
package net.optifine.shaders.gui;

import net.minecraft.client.gui.bp;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.util.bt;
import net.optifine.shaders.config.o;
import net.optifine.shaders.gui.d;
import net.optifine.shaders.gui.e;

public class h
extends d {
    private float sliderValue = 1.0f;
    public boolean dragging;
    private o eIg = null;

    public h(int n2, int n3, int n4, int n5, int n6, o o2, String string) {
        super(n2, n3, n4, n5, n6, o2, string);
        this.eIg = o2;
        this.sliderValue = o2.aIk();
        this.displayString = e.b(o2, this.width);
    }

    @Override
    protected int getHoverState(boolean bl2) {
        return 0;
    }

    @Override
    protected void mouseDragged(net.minecraft.client.d d2, int n2, int n3) {
        if (this.visible) {
            if (this.dragging && !bp.isShiftKeyDown()) {
                this.sliderValue = (float)(n2 - (this.xPosition + 4)) / (float)(this.width - 8);
                this.sliderValue = bt.I(this.sliderValue, 0.0f, 1.0f);
                this.eIg.ck(this.sliderValue);
                this.sliderValue = this.eIg.aIk();
                this.displayString = e.b(this.eIg, this.width);
            }
            d2.Bq().a(buttonTextures);
            GlStateManager.e(1.0f, 1.0f, 1.0f, 1.0f);
            this.drawTexturedModalRect((float)(this.xPosition + (int)(this.sliderValue * (float)(this.width - 8))), this.yPosition, 0, 66, 4, 20);
            this.drawTexturedModalRect((float)(this.xPosition + (int)(this.sliderValue * (float)(this.width - 8)) + 4), this.yPosition, 196, 66, 4, 20);
        }
    }

    @Override
    public boolean mousePressed(net.minecraft.client.d d2, int n2, int n3) {
        if (super.mousePressed(d2, n2, n3)) {
            this.sliderValue = (float)(n2 - (this.xPosition + 4)) / (float)(this.width - 8);
            this.sliderValue = bt.I(this.sliderValue, 0.0f, 1.0f);
            this.eIg.ck(this.sliderValue);
            this.displayString = e.b(this.eIg, this.width);
            this.dragging = true;
            return true;
        }
        return false;
    }

    @Override
    public void mouseReleased(int n2, int n3) {
        this.dragging = false;
    }

    @Override
    public void aIv() {
        this.sliderValue = this.eIg.aIk();
    }

    @Override
    public boolean aIw() {
        return false;
    }
}

