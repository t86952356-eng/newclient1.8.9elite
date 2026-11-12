/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.gui;

import hackclient.rise.agg;
import net.minecraft.client.gui.cl;
import net.minecraft.client.gui.cn;

class co
extends cl {
    final /* synthetic */ cn btg;

    public co(cn cn2) {
        this.btg = cn2;
        agg cfr_ignored_0 = cn2.fontRendererObj;
        super(cn.aER, cn2.width, cn2.height, 80, cn2.height - 40, agg.aIF + 1);
    }

    @Override
    protected int getSize() {
        return this.btg.bta.size();
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
        this.btg.fontRendererObj.a(this.btg.bta.get(n2), 10.0, (double)n4, 0xFFFFFF);
        this.btg.fontRendererObj.a(this.btg.btb.get(n2), 230.0, (double)n4, 0xFFFFFF);
    }

    @Override
    protected int getScrollBarX() {
        return this.width - 10;
    }
}

