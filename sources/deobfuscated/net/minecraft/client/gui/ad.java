/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.gui;

import hackclient.rise.agg;
import net.minecraft.client.gui.ab;
import net.minecraft.client.gui.aj;
import net.minecraft.client.gui.c;
import net.minecraft.client.resources.I18n;
import net.minecraft.client.settings.a;
import net.minecraft.client.settings.d;
import net.minecraft.util.an;

public class ad
implements aj {
    private final d boe;
    private final String bof;
    private final c bog;
    private final c boh;
    final /* synthetic */ ab boi;

    private ad(ab ab2, d d2) {
        this.boi = ab2;
        this.boe = d2;
        this.bof = I18n.a(d2.Ri(), new Object[0]);
        this.bog = new c(0, 0, 0, 75, 20, I18n.a(d2.Ri(), new Object[0]));
        this.boh = new c(0, 0, 0, 50, 20, I18n.a("controls.reset", new Object[0]));
    }

    @Override
    public void a(int n2, int n3, int n4, int n5, int n6, int n7, int n8, boolean bl2) {
        boolean bl3 = this.boi.bnX.blq == this.boe;
        this.boi.bnY.fontRendererObj.a(this.bof, (double)(n3 + 90 - this.boi.boa), (double)(n4 + n6 / 2 - agg.aIF / 2), 0xFFFFFF);
        this.boh.xPosition = n3 + 190;
        this.boh.yPosition = n4;
        this.boh.enabled = this.boe.cO() != this.boe.Rj();
        this.boh.drawButton(this.boi.bnY, n7, n8);
        this.bog.xPosition = n3 + 105;
        this.bog.yPosition = n4;
        this.bog.displayString = a.dY(this.boe.cO());
        boolean bl4 = false;
        if (this.boe.cO() != 0) {
            for (d d2 : this.boi.bnY.aIY.chL) {
                if (d2 == this.boe || d2.cO() != this.boe.cO()) continue;
                bl4 = true;
                break;
            }
        }
        if (bl3) {
            this.bog.displayString = String.valueOf((Object)an.dwa) + "> " + String.valueOf((Object)an.dvZ) + this.bog.displayString + String.valueOf((Object)an.dwa) + " <";
        } else if (bl4) {
            this.bog.displayString = String.valueOf((Object)an.dvX) + this.bog.displayString;
        }
        this.bog.drawButton(this.boi.bnY, n7, n8);
    }

    @Override
    public boolean a(int n2, int n3, int n4, int n5, int n6, int n7) {
        if (this.bog.mousePressed(this.boi.bnY, n3, n4)) {
            this.boi.bnX.blq = this.boe;
            return true;
        }
        if (this.boh.mousePressed(this.boi.bnY, n3, n4)) {
            this.boi.bnY.aIY.a(this.boe, this.boe.Rj());
            d.Rc();
            return true;
        }
        return false;
    }

    @Override
    public void b(int n2, int n3, int n4, int n5, int n6, int n7) {
        this.bog.mouseReleased(n3, n4);
        this.boh.mouseReleased(n3, n4);
    }

    @Override
    public void o(int n2, int n3, int n4) {
    }
}

