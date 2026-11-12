/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.gui;

import net.minecraft.client.d;
import net.minecraft.client.gui.bg;
import net.minecraft.client.gui.c;
import net.minecraft.client.resources.I18n;

public class ah
extends c {
    private boolean boG;
    private final String boH;
    private final bg boI;

    public ah(bg bg2, int n2, int n3, int n4, String string, boolean bl2) {
        super(n2, n3, n4, 150, 20, "");
        this.boH = string;
        this.boG = bl2;
        this.displayString = this.EF();
        this.boI = bg2;
    }

    private String EF() {
        return I18n.a(this.boH, new Object[0]) + ": " + (this.boG ? I18n.a("gui.yes", new Object[0]) : I18n.a("gui.no", new Object[0]));
    }

    public void aa(boolean bl2) {
        this.boG = bl2;
        this.displayString = this.EF();
        this.boI.i(this.id, bl2);
    }

    @Override
    public boolean mousePressed(d d2, int n2, int n3) {
        if (super.mousePressed(d2, n2, n3)) {
            this.boG = !this.boG;
            this.displayString = this.EF();
            this.boI.i(this.id, this.boG);
            return true;
        }
        return false;
    }
}

