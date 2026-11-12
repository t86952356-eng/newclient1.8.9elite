/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
package net.optifine.gui;

import com.google.common.collect.Lists;
import hackclient.rise.agg;
import java.util.List;
import net.minecraft.client.gui.as;
import net.minecraft.client.gui.bp;
import net.minecraft.client.gui.c;
import net.minecraft.client.resources.I18n;
import net.minecraft.src.a;

public class e
extends bp {
    private final bp ejI;
    private final String ejJ;
    private final String ejK;
    private final List ejL = Lists.newArrayList();
    protected String btR;
    private int btU;

    public e(bp bp2, String string, String string2) {
        this.ejI = bp2;
        this.ejJ = string;
        this.ejK = string2;
        this.btR = I18n.a("gui.done", new Object[0]);
    }

    @Override
    public void initGui() {
        this.buttonList.add(new as(0, this.width / 2 - 74, this.height / 6 + 96, this.btR));
        this.ejL.clear();
        this.ejL.addAll(this.fontRendererObj.m(this.ejK, this.width - 50));
    }

    @Override
    protected void actionPerformed(c c2) {
        a.AZ().a(this.ejI);
    }

    @Override
    public void drawScreen(int n2, int n3, float f2) {
        this.drawDefaultBackground();
        this.drawCenteredString(this.fontRendererObj, this.ejJ, this.width / 2, 70, 0xFFFFFF);
        int n4 = 90;
        for (Object e2 : this.ejL) {
            String string = (String)e2;
            this.drawCenteredString(this.fontRendererObj, string, this.width / 2, n4, 0xFFFFFF);
            n4 += agg.aIF;
        }
        super.drawScreen(n2, n3, f2);
    }

    public void bZ(int n2) {
        this.btU = n2;
        for (c c2 : this.buttonList) {
            c2.enabled = false;
        }
    }

    @Override
    public void updateScreen() {
        super.updateScreen();
        if (--this.btU == 0) {
            for (c c2 : this.buttonList) {
                c2.enabled = true;
            }
        }
    }
}

