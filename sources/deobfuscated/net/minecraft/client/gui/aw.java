/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
package net.minecraft.client.gui;

import com.google.common.collect.Lists;
import java.util.List;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.ai;
import net.minecraft.client.gui.aj;
import net.minecraft.client.gui.as;
import net.minecraft.client.gui.at;
import net.minecraft.client.gui.ax;
import net.minecraft.client.gui.c;

public class aw
extends ai {
    private final List<ax> bqm = Lists.newArrayList();

    public aw(Minecraft minecraft, int n2, int n3, int n4, int n5, int n6, net.minecraft.client.settings.c ... cArray) {
        super(minecraft, n2, n3, n4, n5, n6);
        this.field_148163_i = false;
        for (int i2 = 0; i2 < cArray.length; i2 += 2) {
            net.minecraft.client.settings.c c2 = cArray[i2];
            net.minecraft.client.settings.c c3 = i2 < cArray.length - 1 ? cArray[i2 + 1] : null;
            c c4 = this.a(minecraft, n2 / 2 - 155, 0, c2);
            c c5 = this.a(minecraft, n2 / 2 - 155 + 160, 0, c3);
            this.bqm.add(new ax(c4, c5));
        }
    }

    private c a(Minecraft minecraft, int n2, int n3, net.minecraft.client.settings.c c2) {
        if (c2 == null) {
            return null;
        }
        int n4 = c2.QX();
        return c2.QV() ? new at(n4, n2, n3, c2) : new as(n4, n2, n3, c2, minecraft.aIY.c(c2));
    }

    public ax bG(int n2) {
        return this.bqm.get(n2);
    }

    @Override
    protected int getSize() {
        return this.bqm.size();
    }

    @Override
    public int getListWidth() {
        return 400;
    }

    @Override
    protected int getScrollBarX() {
        return super.getScrollBarX() + 32;
    }

    @Override
    public /* synthetic */ aj bB(int n2) {
        return this.bG(n2);
    }
}

