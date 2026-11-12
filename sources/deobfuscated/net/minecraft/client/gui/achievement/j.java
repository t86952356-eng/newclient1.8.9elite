/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
package net.minecraft.client.gui.achievement;

import com.google.common.collect.Lists;
import hackclient.rise.agg;
import java.util.List;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.achievement.c;
import net.minecraft.client.gui.cl;
import net.minecraft.client.resources.I18n;
import net.minecraft.entity.n;
import net.minecraft.entity.o;

class j
extends cl {
    private final List<o> bvH;
    final /* synthetic */ c bvI;

    public j(c c2, Minecraft minecraft) {
        this.bvI = c2;
        int n2 = c2.width;
        int n3 = c2.height;
        int n4 = c2.height - 64;
        c.l(c2);
        super(minecraft, n2, n3, 32, n4, agg.aIF * 4);
        this.bvH = Lists.newArrayList();
        this.setShowSelectionBox(false);
        for (o o2 : n.ctF.values()) {
            if (c2.bvq.c(o2.ctJ) <= 0 && c2.bvq.c(o2.ctK) <= 0) continue;
            this.bvH.add(o2);
        }
    }

    @Override
    protected int getSize() {
        return this.bvH.size();
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
        int n2 = this.getSize();
        c.m(this.bvI);
        return n2 * agg.aIF * 4;
    }

    @Override
    protected void drawBackground() {
        this.bvI.drawDefaultBackground();
    }

    @Override
    protected void drawSlot(int n2, int n3, int n4, int n5, int n6, int n7) {
        o o2 = this.bvH.get(n2);
        String string = I18n.a("entity." + n.eF(o2.ctG) + ".name", new Object[0]);
        int n8 = this.bvI.bvq.c(o2.ctJ);
        int n9 = this.bvI.bvq.c(o2.ctK);
        String string2 = I18n.a("stat.entityKills", n8, string);
        String string3 = I18n.a("stat.entityKilledBy", string, n9);
        if (n8 == 0) {
            string2 = I18n.a("stat.entityKills.none", string);
        }
        if (n9 == 0) {
            string3 = I18n.a("stat.entityKilledBy.none", string);
        }
        this.bvI.drawString(c.n(this.bvI), string, n3 + 2 - 10, n4 + 1, 0xFFFFFF);
        agg agg2 = c.o(this.bvI);
        c.p(this.bvI);
        this.bvI.drawString(agg2, string2, n3 + 2, n4 + 1 + agg.aIF, n8 == 0 ? 0x606060 : 0x909090);
        agg agg3 = c.q(this.bvI);
        c.r(this.bvI);
        this.bvI.drawString(agg3, string3, n3 + 2, n4 + 1 + agg.aIF * 2, n9 == 0 ? 0x606060 : 0x909090);
    }
}

