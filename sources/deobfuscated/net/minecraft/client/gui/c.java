/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.gui;

import hackclient.rise.agg;
import net.minecraft.client.Minecraft;
import net.minecraft.client.audio.PositionedSoundRecord;
import net.minecraft.client.audio.SoundHandler;
import net.minecraft.client.gui.b;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.util.cm;

public class c
extends b {
    protected static final cm buttonTextures = new cm("textures/gui/widgets.png");
    protected int buttonWidth;
    protected int height;
    public int xPosition;
    public int yPosition;
    public String displayString;
    public int id;
    public boolean enabled = true;
    public boolean visible = true;
    protected boolean mouseOver;

    public c(int n2, int n3, int n4, String string) {
        this(n2, n3, n4, 200, 20, string);
    }

    public c(int n2, int n3, int n4, int n5, int n6, String string) {
        this.id = n2;
        this.xPosition = n3;
        this.yPosition = n4;
        this.buttonWidth = n5;
        this.height = n6;
        this.displayString = string;
    }

    protected int getHoverState(boolean bl2) {
        int n2 = 1;
        if (!this.enabled) {
            n2 = 0;
        } else if (bl2) {
            n2 = 2;
        }
        return n2;
    }

    public void drawButton(Minecraft minecraft, int n2, int n3) {
        if (this.visible) {
            agg agg2 = minecraft.fontRendererObj;
            minecraft.Bq().a(buttonTextures);
            GlStateManager.e(1.0f, 1.0f, 1.0f, 1.0f);
            this.mouseOver = n2 >= this.xPosition && n3 >= this.yPosition && n2 < this.xPosition + this.buttonWidth && n3 < this.yPosition + this.height;
            int n4 = this.getHoverState(this.mouseOver);
            GlStateManager.tQ();
            GlStateManager.h(770, 771, 1, 0);
            GlStateManager.P(770, 771);
            this.drawTexturedModalRect((float)this.xPosition, this.yPosition, 0, 46 + n4 * 20, this.buttonWidth / 2, this.height);
            this.drawTexturedModalRect((float)(this.xPosition + this.buttonWidth / 2), this.yPosition, 200 - this.buttonWidth / 2, 46 + n4 * 20, this.buttonWidth / 2, this.height);
            this.mouseDragged(minecraft, n2, n3);
            int n5 = 0xE0E0E0;
            if (!this.enabled) {
                n5 = 0xA0A0A0;
            } else if (this.mouseOver) {
                n5 = 0xFFFFA0;
            }
            this.drawCenteredString(agg2, this.displayString, this.xPosition + this.buttonWidth / 2, this.yPosition + (this.height - 6) / 2, n5);
        }
    }

    protected void mouseDragged(Minecraft minecraft, int n2, int n3) {
    }

    public void mouseReleased(int n2, int n3) {
    }

    public boolean mousePressed(Minecraft minecraft, int n2, int n3) {
        return this.enabled && this.visible && n2 >= this.xPosition && n3 >= this.yPosition && n2 < this.xPosition + this.buttonWidth && n3 < this.yPosition + this.height;
    }

    public boolean isMouseOver() {
        return this.mouseOver;
    }

    public void drawButtonForegroundLayer(int n2, int n3) {
    }

    public void playPressSound(SoundHandler soundHandler) {
        soundHandler.a(PositionedSoundRecord.a(new cm("gui.button.press"), 1.0f));
    }

    public int getButtonWidth() {
        return this.buttonWidth;
    }

    public void setWidth(int n2) {
        this.buttonWidth = n2;
    }
}

