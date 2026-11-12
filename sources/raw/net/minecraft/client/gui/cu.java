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
import net.minecraft.client.gui.as;
import net.minecraft.client.gui.bp;
import net.minecraft.client.gui.c;
import net.minecraft.client.gui.cv;
import net.minecraft.client.resources.I18n;

public class cu
extends bp {
    protected cv btN;
    protected String btO;
    private final String btP;
    private final List<String> btQ = Lists.newArrayList();
    protected String btR;
    protected String btS;
    protected int btT;
    private int btU;

    public cu(cv cv2, String string, String string2, int n2) {
        this.btN = cv2;
        this.btO = string;
        this.btP = string2;
        this.btT = n2;
        this.btR = I18n.a("gui.yes", new Object[0]);
        this.btS = I18n.a("gui.no", new Object[0]);
    }

    public cu(cv cv2, String string, String string2, String string3, String string4, int n2) {
        this.btN = cv2;
        this.btO = string;
        this.btP = string2;
        this.btR = string3;
        this.btS = string4;
        this.btT = n2;
    }

    @Override
    public void initGui() {
        this.buttonList.add(new as(0, this.width / 2 - 155, this.height / 6 + 96, this.btR));
        this.buttonList.add(new as(1, this.width / 2 - 155 + 160, this.height / 6 + 96, this.btS));
        this.btQ.clear();
        this.btQ.addAll(this.fontRendererObj.m(this.btP, this.width - 50));
    }

    @Override
    protected void actionPerformed(c c2) {
        this.btN.confirmClicked(c2.id == 0, this.btT);
    }

    @Override
    public void drawScreen(int n2, int n3, float f2) {
        this.drawDefaultBackground();
        this.drawCenteredString(this.fontRendererObj, this.btO, this.width / 2, 70, 0xFFFFFF);
        int n4 = 90;
        for (String string : this.btQ) {
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

