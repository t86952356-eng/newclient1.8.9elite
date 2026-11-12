/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.gui;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.aj;
import net.minecraft.client.gui.cl;

public abstract class ai
extends cl {
    public ai(Minecraft minecraft, int n2, int n3, int n4, int n5, int n6) {
        super(minecraft, n2, n3, n4, n5, n6);
    }

    @Override
    protected void elementClicked(int n2, boolean bl2, int n3, int n4) {
    }

    @Override
    protected boolean isSelected(int n2) {
        return false;
    }

    @Override
    protected void drawBackground() {
    }

    @Override
    protected void drawSlot(int n2, int n3, int n4, int n5, int n6, int n7) {
        this.bB(n2).a(n2, n3, n4, this.getListWidth(), n5, n6, n7, this.getSlotIndexFromScreenCoords(n6, n7) == n2);
    }

    @Override
    protected void func_178040_a(int n2, int n3, int n4) {
        this.bB(n2).o(n2, n3, n4);
    }

    public boolean mouseClicked(int n2, int n3, int n4) {
        int n5;
        if (this.isMouseYWithinSlotBounds(n3) && (n5 = this.getSlotIndexFromScreenCoords(n2, n3)) >= 0) {
            int n6 = this.left + this.width / 2 - this.getListWidth() / 2 + 2;
            int n7 = this.top + 4 - this.getAmountScrolled() + n5 * this.slotHeight + this.headerPadding;
            int n8 = n2 - n6;
            int n9 = n3 - n7;
            if (this.bB(n5).a(n5, n2, n3, n4, n8, n9)) {
                this.setEnabled(false);
                return true;
            }
        }
        return false;
    }

    public boolean p(int n2, int n3, int n4) {
        for (int i2 = 0; i2 < this.getSize(); ++i2) {
            int n5 = this.left + this.width / 2 - this.getListWidth() / 2 + 2;
            int n6 = this.top + 4 - this.getAmountScrolled() + i2 * this.slotHeight + this.headerPadding;
            int n7 = n2 - n5;
            int n8 = n3 - n6;
            this.bB(i2).b(i2, n2, n3, n4, n7, n8);
        }
        this.setEnabled(true);
        return false;
    }

    public abstract aj bB(int var1);
}

