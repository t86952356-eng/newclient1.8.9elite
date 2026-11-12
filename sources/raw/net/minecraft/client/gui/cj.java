/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.gui;

import net.minecraft.client.d;
import net.minecraft.client.gui.bg;
import net.minecraft.client.gui.c;
import net.minecraft.client.gui.ck;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.resources.I18n;

public class cj
extends c {
    private float bsQ = 1.0f;
    public boolean bsR;
    private final String bsS;
    private final float bsT;
    private final float bsU;
    private final bg bsV;
    private final ck bsW;

    public cj(bg bg2, int n2, int n3, int n4, String string, float f2, float f3, float f4, ck ck2) {
        super(n2, n3, n4, 150, 20, "");
        this.bsS = string;
        this.bsT = f2;
        this.bsU = f3;
        this.bsQ = (f4 - f2) / (f3 - f2);
        this.bsW = ck2;
        this.bsV = bg2;
        this.displayString = this.FU();
    }

    public float FS() {
        return this.bsT + (this.bsU - this.bsT) * this.bsQ;
    }

    public void a(float f2, boolean bl2) {
        this.bsQ = (f2 - this.bsT) / (this.bsU - this.bsT);
        this.displayString = this.FU();
        if (bl2) {
            this.bsV.c(this.id, this.FS());
        }
    }

    public float FT() {
        return this.bsQ;
    }

    private String FU() {
        return this.bsW == null ? I18n.a(this.bsS, new Object[0]) + ": " + this.FS() : this.bsW.b(this.id, I18n.a(this.bsS, new Object[0]), this.FS());
    }

    @Override
    protected int getHoverState(boolean bl2) {
        return 0;
    }

    @Override
    protected void mouseDragged(d d2, int n2, int n3) {
        if (this.visible) {
            if (this.bsR) {
                this.bsQ = (float)(n2 - (this.xPosition + 4)) / (float)(this.width - 8);
                if (this.bsQ < 0.0f) {
                    this.bsQ = 0.0f;
                }
                if (this.bsQ > 1.0f) {
                    this.bsQ = 1.0f;
                }
                this.displayString = this.FU();
                this.bsV.c(this.id, this.FS());
            }
            GlStateManager.e(1.0f, 1.0f, 1.0f, 1.0f);
            this.drawTexturedModalRect((float)(this.xPosition + (int)(this.bsQ * (float)(this.width - 8))), this.yPosition, 0, 66, 4, 20);
            this.drawTexturedModalRect((float)(this.xPosition + (int)(this.bsQ * (float)(this.width - 8)) + 4), this.yPosition, 196, 66, 4, 20);
        }
    }

    public void V(float f2) {
        this.bsQ = f2;
        this.displayString = this.FU();
        this.bsV.c(this.id, this.FS());
    }

    @Override
    public boolean mousePressed(d d2, int n2, int n3) {
        if (super.mousePressed(d2, n2, n3)) {
            this.bsQ = (float)(n2 - (this.xPosition + 4)) / (float)(this.width - 8);
            if (this.bsQ < 0.0f) {
                this.bsQ = 0.0f;
            }
            if (this.bsQ > 1.0f) {
                this.bsQ = 1.0f;
            }
            this.displayString = this.FU();
            this.bsV.c(this.id, this.FS());
            this.bsR = true;
            return true;
        }
        return false;
    }

    @Override
    public void mouseReleased(int n2, int n3) {
        this.bsR = false;
    }
}

