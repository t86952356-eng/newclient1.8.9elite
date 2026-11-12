/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.gui;

import hackclient.rise.agg;
import java.util.List;
import net.minecraft.client.d;
import net.minecraft.client.gui.ai;
import net.minecraft.client.gui.aj;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.resources.ResourcePackListEntry;
import net.minecraft.util.an;

public abstract class bn
extends ai {
    protected final d brc;
    protected final List<ResourcePackListEntry> brd;

    public bn(d d2, int n2, int n3, List<ResourcePackListEntry> list) {
        super(d2, n2, n3, 32, n3 - 55 + 4, 36);
        this.brc = d2;
        this.brd = list;
        this.field_148163_i = false;
        agg cfr_ignored_0 = d2.fontRendererObj;
        this.setHasListHeader(true, (int)((float)agg.aIF * 1.5f));
    }

    @Override
    protected void drawListHeader(int n2, int n3, Tessellator tessellator) {
        String string = String.valueOf((Object)an.dwf) + String.valueOf((Object)an.dwd) + this.FA();
        this.brc.fontRendererObj.a(string, (double)(n2 + this.width / 2 - this.brc.fontRendererObj.bQ(string) / 2), (double)Math.min(this.top + 3, n3), 0xFFFFFF);
    }

    protected abstract String FA();

    public List<ResourcePackListEntry> FB() {
        return this.brd;
    }

    @Override
    protected int getSize() {
        return this.FB().size();
    }

    public ResourcePackListEntry bK(int n2) {
        return this.FB().get(n2);
    }

    @Override
    public int getListWidth() {
        return this.width;
    }

    @Override
    protected int getScrollBarX() {
        return this.right - 6;
    }

    @Override
    public /* synthetic */ aj bB(int n2) {
        return this.bK(n2);
    }
}

