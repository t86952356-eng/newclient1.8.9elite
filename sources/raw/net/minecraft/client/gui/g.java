/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.input.Mouse
 */
package net.minecraft.client.gui;

import net.minecraft.client.d;
import net.minecraft.client.gui.cl;
import net.minecraft.realms.y;
import org.lwjgl.input.Mouse;

public class g
extends cl {
    private final net.minecraft.realms.g bla;

    public g(net.minecraft.realms.g g2, int n2, int n3, int n4, int n5, int n6) {
        super(d.AZ(), n2, n3, n4, n5, n6);
        this.bla = g2;
    }

    @Override
    protected int getSize() {
        return this.bla.getItemCount();
    }

    @Override
    protected void elementClicked(int n2, boolean bl2, int n3, int n4) {
        this.bla.selectItem(n2, bl2, n3, n4);
    }

    @Override
    protected boolean isSelected(int n2) {
        return this.bla.isSelectedItem(n2);
    }

    @Override
    protected void drawBackground() {
        this.bla.renderBackground();
    }

    @Override
    protected void drawSlot(int n2, int n3, int n4, int n5, int n6, int n7) {
        this.bla.renderItem(n2, n3, n4, n5, n6, n7);
    }

    public int DV() {
        return this.width;
    }

    public int DW() {
        return this.mouseY;
    }

    public int DX() {
        return this.mouseX;
    }

    @Override
    protected int getContentHeight() {
        return this.bla.getMaxPosition();
    }

    @Override
    protected int getScrollBarX() {
        return this.bla.getScrollbarPosition();
    }

    @Override
    public void handleMouseInput() {
        super.handleMouseInput();
        if (this.scrollMultiplier > 0.0f && Mouse.getEventButtonState()) {
            this.bla.customMouseEvent(this.top, this.bottom, this.headerPadding, this.amountScrolled, this.slotHeight);
        }
    }

    public void a(int n2, int n3, int n4, y y2) {
        this.bla.renderSelected(n2, n3, n4, y2);
    }

    @Override
    protected void drawSelectionBox(int n2, int n3, int n4, int n5) {
        int n6 = this.getSize();
        for (int i2 = 0; i2 < n6; ++i2) {
            int n7 = n3 + i2 * this.slotHeight + this.headerPadding;
            int n8 = this.slotHeight - 4;
            if (n7 > this.bottom || n7 + n8 < this.top) {
                this.func_178040_a(i2, n2, n7);
            }
            if (this.showSelectionBox && this.isSelected(i2)) {
                this.a(this.width, n7, n8, y.djn);
            }
            this.drawSlot(i2, n2, n7, n8, n4, n5);
        }
    }
}

