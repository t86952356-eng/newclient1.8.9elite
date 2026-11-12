/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.gui.achievement;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.achievement.c;
import net.minecraft.client.gui.cl;
import net.minecraft.stats.f;
import net.minecraft.stats.n;

class g
extends cl {
    final /* synthetic */ c bvD;

    public g(c c2, Minecraft minecraft) {
        this.bvD = c2;
        super(minecraft, c2.width, c2.height, 32, c2.height - 64, 10);
        this.setShowSelectionBox(false);
    }

    @Override
    protected int getSize() {
        return n.dpD.size();
    }

    @Override
    protected void elementClicked(int n2, boolean bl2, int n3, int n4) {
    }

    @Override
    protected boolean isSelected(int n2) {
        return false;
    }

    @Override
    protected int getContentHeight() {
        return this.getSize() * 10;
    }

    @Override
    protected void drawBackground() {
        this.bvD.drawDefaultBackground();
    }

    @Override
    protected void drawSlot(int n2, int n3, int n4, int n5, int n6, int n7) {
        f f2 = n.dpD.get(n2);
        this.bvD.drawString(c.i(this.bvD), f2.app().arq(), n3 + 2, n4 + 1, n2 % 2 == 0 ? 0xFFFFFF : 0x909090);
        String string = f2.hj(this.bvD.bvq.c(f2));
        this.bvD.drawString(c.j(this.bvD), string, n3 + 2 + 213 - c.k(this.bvD).bQ(string), n4 + 1, n2 % 2 == 0 ? 0xFFFFFF : 0x909090);
    }
}

