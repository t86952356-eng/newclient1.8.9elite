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
import net.minecraft.client.gui.aq;
import net.minecraft.client.gui.db;
import net.minecraft.client.gui.dc;
import net.minecraft.client.gui.dd;
import net.minecraft.client.multiplayer.h;
import net.minecraft.client.network.b;

public class df
extends ai {
    private final aq buF;
    private final List<dd> buG = Lists.newArrayList();
    private final List<db> buH = Lists.newArrayList();
    private final aj buI = new dc();
    private int buJ = -1;

    public df(aq aq2, Minecraft minecraft, int n2, int n3, int n4, int n5, int n6) {
        super(minecraft, n2, n3, n4, n5, n6);
        this.buF = aq2;
    }

    @Override
    public aj bB(int n2) {
        if (n2 < this.buG.size()) {
            return this.buG.get(n2);
        }
        if ((n2 -= this.buG.size()) == 0) {
            return this.buI;
        }
        return this.buH.get(--n2);
    }

    @Override
    protected int getSize() {
        return this.buG.size() + 1 + this.buH.size();
    }

    public void ca(int n2) {
        this.buJ = n2;
    }

    @Override
    protected boolean isSelected(int n2) {
        return n2 == this.buJ;
    }

    public int Gw() {
        return this.buJ;
    }

    public void a(h h2) {
        this.ca(-1);
        this.buG.clear();
        for (int i2 = 0; i2 < h2.HM(); ++i2) {
            this.buG.add(new dd(this.buF, h2.cl(i2)));
        }
    }

    public void q(List<b> list) {
        this.buH.clear();
        for (b b2 : list) {
            this.buH.add(new db(this.buF, b2));
        }
    }

    @Override
    protected int getScrollBarX() {
        return super.getScrollBarX() + 30;
    }

    @Override
    public int getListWidth() {
        return super.getListWidth() + 85;
    }
}

