/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.gui;

import net.minecraft.client.Minecraft;
import net.minecraft.client.audio.PositionedSoundRecord;
import net.minecraft.client.audio.SoundCategory;
import net.minecraft.client.audio.SoundHandler;
import net.minecraft.client.gui.by;
import net.minecraft.client.gui.c;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.resources.I18n;
import net.minecraft.util.bt;
import net.minecraft.util.cm;

class bz
extends c {
    private final SoundCategory bsa;
    private final String bsb;
    public float bsc;
    public boolean bsd;
    final /* synthetic */ by bse;

    public bz(by by2, int n2, int n3, int n4, SoundCategory soundCategory, boolean bl2) {
        this.bse = by2;
        super(n2, n3, n4, bl2 ? 310 : 150, 20, "");
        this.bsc = 1.0f;
        this.bsa = soundCategory;
        this.bsb = I18n.a("soundCategory." + soundCategory.Ct(), new Object[0]);
        this.displayString = this.bsb + ": " + by2.c(soundCategory);
        this.bsc = by2.brX.d(soundCategory);
    }

    @Override
    protected int getHoverState(boolean bl2) {
        return 0;
    }

    @Override
    protected void mouseDragged(Minecraft minecraft, int n2, int n3) {
        if (this.visible) {
            if (this.bsd) {
                this.bsc = (float)(n2 - (this.xPosition + 4)) / (float)(this.buttonWidth - 8);
                this.bsc = bt.I(this.bsc, 0.0f, 1.0f);
                minecraft.aIY.a(this.bsa, this.bsc);
                minecraft.aIY.QK();
                this.displayString = this.bsb + ": " + this.bse.c(this.bsa);
            }
            GlStateManager.e(1.0f, 1.0f, 1.0f, 1.0f);
            this.drawTexturedModalRect((float)(this.xPosition + (int)(this.bsc * (float)(this.buttonWidth - 8))), this.yPosition, 0, 66, 4, 20);
            this.drawTexturedModalRect((float)(this.xPosition + (int)(this.bsc * (float)(this.buttonWidth - 8)) + 4), this.yPosition, 196, 66, 4, 20);
        }
    }

    @Override
    public boolean mousePressed(Minecraft minecraft, int n2, int n3) {
        if (super.mousePressed(minecraft, n2, n3)) {
            this.bsc = (float)(n2 - (this.xPosition + 4)) / (float)(this.buttonWidth - 8);
            this.bsc = bt.I(this.bsc, 0.0f, 1.0f);
            minecraft.aIY.a(this.bsa, this.bsc);
            minecraft.aIY.QK();
            this.displayString = this.bsb + ": " + this.bse.c(this.bsa);
            this.bsd = true;
            return true;
        }
        return false;
    }

    @Override
    public void playPressSound(SoundHandler soundHandler) {
    }

    @Override
    public void mouseReleased(int n2, int n3) {
        if (this.bsd) {
            if (this.bsa == SoundCategory.biH) {
                float f2 = 1.0f;
            } else {
                this.bse.brX.d(this.bsa);
            }
            by.aER.Bx().a(PositionedSoundRecord.a(new cm("gui.button.press"), 1.0f));
        }
        this.bsd = false;
    }
}

