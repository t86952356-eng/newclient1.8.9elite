/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
package net.minecraft.client.gui;

import com.google.common.collect.Lists;
import hackclient.rise.agg;
import java.util.List;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.b;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.resources.I18n;

public class ae
extends b {
    protected int boj = 200;
    protected int bok = 20;
    public int bol;
    public int bom;
    private final List<String> bon;
    public int boo;
    private boolean bop;
    public boolean visible = true;
    private final boolean boq;
    private final int bor;
    private final int bos;
    private final int bot;
    private final int bou;
    private final agg bov;
    private final int bow;

    public ae(agg agg2, int n2, int n3, int n4, int n5, int n6, int n7) {
        this.bov = agg2;
        this.boo = n2;
        this.bol = n3;
        this.bom = n4;
        this.boj = n5;
        this.bok = n6;
        this.bon = Lists.newArrayList();
        this.bop = false;
        this.boq = false;
        this.bor = n7;
        this.bos = -1;
        this.bot = -1;
        this.bou = -1;
        this.bow = 0;
    }

    public void cM(String string) {
        this.bon.add(I18n.a(string, new Object[0]));
    }

    public ae EE() {
        this.bop = true;
        return this;
    }

    public void a(Minecraft minecraft, int n2, int n3) {
        if (this.visible) {
            GlStateManager.tQ();
            GlStateManager.h(770, 771, 1, 0);
            this.b(minecraft, n2, n3);
            int n4 = this.bom + this.bok / 2 + this.bow / 2;
            int n5 = n4 - this.bon.size() * 10 / 2;
            for (int i2 = 0; i2 < this.bon.size(); ++i2) {
                if (this.bop) {
                    this.drawCenteredString(this.bov, this.bon.get(i2), this.bol + this.boj / 2, n5 + i2 * 10, this.bor);
                    continue;
                }
                this.drawString(this.bov, this.bon.get(i2), this.bol, n5 + i2 * 10, this.bor);
            }
        }
    }

    protected void b(Minecraft minecraft, int n2, int n3) {
        if (this.boq) {
            int n4 = this.boj + this.bow * 2;
            int n5 = this.bok + this.bow * 2;
            int n6 = this.bol - this.bow;
            int n7 = this.bom - this.bow;
            ae.drawRect(n6, n7, n6 + n4, n7 + n5, this.bos);
            this.drawHorizontalLine(n6, n6 + n4, n7, this.bot);
            this.drawHorizontalLine(n6, n6 + n4, n7 + n5, this.bou);
            this.drawVerticalLine(n6, n7, n7 + n5, this.bot);
            this.drawVerticalLine(n6 + n4, n7, n7 + n5, this.bou);
        }
    }
}

