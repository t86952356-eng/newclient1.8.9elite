/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.gui;

import net.minecraft.client.d;
import net.minecraft.client.gui.cl;
import net.minecraft.realms.o;

public class cm
extends cl {
    private final o bsX;

    public cm(o o2, int n2, int n3, int n4, int n5, int n6) {
        super(d.AZ(), n2, n3, n4, n5, n6);
        this.bsX = o2;
    }

    @Override
    protected int getSize() {
        return this.bsX.getItemCount();
    }

    @Override
    protected void elementClicked(int n2, boolean bl2, int n3, int n4) {
        this.bsX.selectItem(n2, bl2, n3, n4);
    }

    @Override
    protected boolean isSelected(int n2) {
        return this.bsX.isSelectedItem(n2);
    }

    @Override
    protected void drawBackground() {
        this.bsX.renderBackground();
    }

    @Override
    protected void drawSlot(int n2, int n3, int n4, int n5, int n6, int n7) {
        this.bsX.renderItem(n2, n3, n4, n5, n6, n7);
    }

    public int FV() {
        return this.width;
    }

    public int FW() {
        return this.mouseY;
    }

    public int FX() {
        return this.mouseX;
    }

    @Override
    protected int getContentHeight() {
        return this.bsX.getMaxPosition();
    }

    @Override
    protected int getScrollBarX() {
        return this.bsX.getScrollbarPosition();
    }

    @Override
    public void handleMouseInput() {
        super.handleMouseInput();
    }
}

