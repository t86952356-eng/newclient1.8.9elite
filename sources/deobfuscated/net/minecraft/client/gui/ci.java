/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.gui;

import net.minecraft.client.gui.c;
import net.minecraft.client.gui.f;
import net.minecraft.client.network.h;
import net.minecraft.client.resources.I18n;
import net.minecraft.network.play.client.n;
import net.minecraft.network.play.client.o;

public class ci
extends f {
    @Override
    public void initGui() {
        super.initGui();
        this.buttonList.add(new c(1, this.width / 2 - 100, this.height - 40, I18n.a("multiplayer.stopSleeping", new Object[0])));
    }

    @Override
    protected void keyTyped(char c2, int n2) {
        if (n2 == 1) {
            this.FR();
        } else if (n2 != 28 && n2 != 156) {
            super.keyTyped(c2, n2);
        } else {
            String string = this.bkX.getText().trim();
            if (!string.isEmpty()) {
                ci.aER.bgK.sendChatMessage(string);
            }
            this.bkX.bX("");
            ci.aER.bha.Ey().EU();
        }
    }

    @Override
    protected void actionPerformed(c c2) {
        if (c2.id == 1) {
            this.FR();
        } else {
            super.actionPerformed(c2);
        }
    }

    private void FR() {
        h h2 = ci.aER.bgK.bkd;
        h2.u(new n(ci.aER.bgK, o.dbr));
    }
}

