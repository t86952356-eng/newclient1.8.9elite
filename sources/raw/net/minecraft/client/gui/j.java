/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.gui;

import net.minecraft.client.d;
import net.minecraft.client.gui.ab;
import net.minecraft.client.gui.as;
import net.minecraft.client.gui.at;
import net.minecraft.client.gui.bp;
import net.minecraft.client.gui.c;
import net.minecraft.client.resources.I18n;
import net.minecraft.client.settings.a;

public class j
extends bp {
    private static final net.minecraft.client.settings.c[] blm = new net.minecraft.client.settings.c[]{net.minecraft.client.settings.c.cjJ, net.minecraft.client.settings.c.cjK, net.minecraft.client.settings.c.ckh};
    private final bp bln;
    protected String blo = "Controls";
    private final a blp;
    public net.minecraft.client.settings.d blq = null;
    public long sk;
    private ab blr;
    private c bls;

    public j(bp bp2, a a2) {
        this.bln = bp2;
        this.blp = a2;
    }

    @Override
    public void initGui() {
        this.blr = new ab(this, aER);
        this.buttonList.add(new c(200, this.width / 2 - 155, this.height - 29, 150, 20, I18n.a("gui.done", new Object[0])));
        this.bls = new c(201, this.width / 2 - 155 + 160, this.height - 29, 150, 20, I18n.a("controls.resetAll", new Object[0]));
        this.buttonList.add(this.bls);
        this.blo = I18n.a("controls.title", new Object[0]);
        int n2 = 0;
        for (net.minecraft.client.settings.c c2 : blm) {
            if (c2.QV()) {
                this.buttonList.add(new at(c2.QX(), this.width / 2 - 155 + n2 % 2 * 160, 18 + 24 * (n2 >> 1), c2));
            } else {
                this.buttonList.add(new as(c2.QX(), this.width / 2 - 155 + n2 % 2 * 160, 18 + 24 * (n2 >> 1), c2, this.blp.c(c2)));
            }
            ++n2;
        }
    }

    @Override
    public void handleMouseInput() {
        super.handleMouseInput();
        this.blr.handleMouseInput();
    }

    @Override
    protected void actionPerformed(c c2) {
        if (c2.id == 200) {
            aER.a(this.bln);
        } else if (c2.id == 201) {
            for (net.minecraft.client.settings.d d2 : j.aER.aIY.chL) {
                d2.eb(d2.Rj());
            }
            net.minecraft.client.settings.d.Rc();
        } else if (c2.id < 100 && c2 instanceof as) {
            this.blp.a(((as)c2).Fa(), 1);
            c2.displayString = this.blp.c(net.minecraft.client.settings.c.dZ(c2.id));
        }
    }

    @Override
    protected void mouseClicked(int n2, int n3, int n4) {
        if (this.blq != null) {
            this.blp.a(this.blq, -100 + n4);
            this.blq = null;
            net.minecraft.client.settings.d.Rc();
        } else if (n4 != 0 || !this.blr.mouseClicked(n2, n3, n4)) {
            super.mouseClicked(n2, n3, n4);
        }
    }

    @Override
    protected void mouseReleased(int n2, int n3, int n4) {
        if (n4 != 0 || !this.blr.p(n2, n3, n4)) {
            super.mouseReleased(n2, n3, n4);
        }
    }

    @Override
    protected void keyTyped(char c2, int n2) {
        if (this.blq != null) {
            if (n2 == 1) {
                this.blp.a(this.blq, 0);
            } else if (n2 != 0) {
                this.blp.a(this.blq, n2);
            } else if (c2 > '\u0000') {
                this.blp.a(this.blq, c2 + 256);
            }
            this.blq = null;
            this.sk = d.Bj();
            net.minecraft.client.settings.d.Rc();
        } else {
            super.keyTyped(c2, n2);
        }
    }

    @Override
    public void drawScreen(int n2, int n3, float f2) {
        this.drawDefaultBackground();
        this.blr.drawScreen(n2, n3, f2);
        this.drawCenteredString(this.fontRendererObj, this.blo, this.width / 2, 8, 0xFFFFFF);
        boolean bl2 = true;
        for (net.minecraft.client.settings.d d2 : this.blp.chL) {
            if (d2.cO() == d2.Rj()) continue;
            bl2 = false;
            break;
        }
        this.bls.enabled = !bl2;
        super.drawScreen(n2, n3, f2);
    }
}

