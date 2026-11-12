/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.gui;

import net.minecraft.client.d;
import net.minecraft.client.gui.c;
import net.minecraft.realms.f;

public class e
extends c {
    private final f bkQ;

    public e(f f2, int n2, int n3, int n4, String string) {
        super(n2, n3, n4, string);
        this.bkQ = f2;
    }

    public e(f f2, int n2, int n3, int n4, String string, int n5, int n6) {
        super(n2, n3, n4, n5, n6, string);
        this.bkQ = f2;
    }

    public int getId() {
        return this.id;
    }

    public boolean getEnabled() {
        return this.enabled;
    }

    public void setEnabled(boolean bl2) {
        this.enabled = bl2;
    }

    public void bX(String string) {
        this.displayString = string;
    }

    @Override
    public int getButtonWidth() {
        return super.getButtonWidth();
    }

    public int DR() {
        return this.yPosition;
    }

    @Override
    public boolean mousePressed(d d2, int n2, int n3) {
        if (super.mousePressed(d2, n2, n3)) {
            this.bkQ.clicked(n2, n3);
        }
        return super.mousePressed(d2, n2, n3);
    }

    @Override
    public void mouseReleased(int n2, int n3) {
        this.bkQ.released(n2, n3);
    }

    @Override
    public void mouseDragged(d d2, int n2, int n3) {
        this.bkQ.renderBg(n2, n3);
    }

    public f DS() {
        return this.bkQ;
    }

    @Override
    public int getHoverState(boolean bl2) {
        return this.bkQ.getYImage(bl2);
    }

    public int W(boolean bl2) {
        return super.getHoverState(bl2);
    }

    public int DT() {
        return this.height;
    }
}

