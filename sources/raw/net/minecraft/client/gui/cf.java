/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.lang3.StringUtils
 */
package net.minecraft.client.gui;

import java.util.Date;
import net.minecraft.client.d;
import net.minecraft.client.gui.ce;
import net.minecraft.client.gui.cl;
import net.minecraft.client.resources.I18n;
import net.minecraft.util.an;
import net.minecraft.world.storage.j;
import org.apache.commons.lang3.StringUtils;

class cf
extends cl {
    final /* synthetic */ ce bsJ;

    public cf(ce ce2, d d2) {
        this.bsJ = ce2;
        super(d2, ce2.width, ce2.height, 32, ce2.height - 64, 36);
    }

    @Override
    protected int getSize() {
        return this.bsJ.bsz.size();
    }

    @Override
    protected void elementClicked(int n2, boolean bl2, int n3, int n4) {
        boolean bl3;
        this.bsJ.bsy = n2;
        this.bsJ.bsG.enabled = bl3 = this.bsJ.bsy >= 0 && this.bsJ.bsy < this.getSize();
        this.bsJ.bsF.enabled = bl3;
        this.bsJ.bsH.enabled = bl3;
        this.bsJ.bsI.enabled = bl3;
        if (bl2 && bl3) {
            this.bsJ.bN(n2);
        }
    }

    @Override
    protected boolean isSelected(int n2) {
        return n2 == this.bsJ.bsy;
    }

    @Override
    protected int getContentHeight() {
        return this.bsJ.bsz.size() * 36;
    }

    @Override
    protected void drawBackground() {
        this.bsJ.drawDefaultBackground();
    }

    @Override
    protected void drawSlot(int n2, int n3, int n4, int n5, int n6, int n7) {
        j j2 = this.bsJ.bsz.get(n2);
        Object object = j2.getDisplayName();
        if (StringUtils.isEmpty((CharSequence)object)) {
            object = this.bsJ.bsB + " " + (n2 + 1);
        }
        Object object2 = j2.azD();
        object2 = (String)object2 + " (" + this.bsJ.bsv.format(new Date(j2.azs()));
        object2 = (String)object2 + ")";
        Object object3 = "";
        if (j2.azE()) {
            object3 = this.bsJ.bsC + " " + (String)object3;
        } else {
            object3 = this.bsJ.bsD[j2.azF().awE()];
            if (j2.azv()) {
                object3 = String.valueOf((Object)an.dvP) + I18n.a("gameMode.hardcore", new Object[0]) + String.valueOf((Object)an.dwh);
            }
            if (j2.azG()) {
                object3 = (String)object3 + ", " + I18n.a("selectWorld.cheats", new Object[0]);
            }
        }
        this.bsJ.drawString(this.bsJ.fontRendererObj, (String)object, n3 + 2, n4 + 1, 0xFFFFFF);
        this.bsJ.drawString(this.bsJ.fontRendererObj, (String)object2, n3 + 2, n4 + 12, 0x808080);
        this.bsJ.drawString(this.bsJ.fontRendererObj, (String)object3, n3 + 2, n4 + 12 + 10, 0x808080);
    }
}

