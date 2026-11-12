/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.gui;

import net.minecraft.client.d;
import net.minecraft.client.gui.aj;
import net.minecraft.client.gui.as;
import net.minecraft.client.gui.c;

public class ax
implements aj {
    private final d bqn = d.AZ();
    private final c bqo;
    private final c bqp;

    public ax(c c2, c c3) {
        this.bqo = c2;
        this.bqp = c3;
    }

    @Override
    public void a(int n2, int n3, int n4, int n5, int n6, int n7, int n8, boolean bl2) {
        if (this.bqo != null) {
            this.bqo.yPosition = n4;
            this.bqo.drawButton(this.bqn, n7, n8);
        }
        if (this.bqp != null) {
            this.bqp.yPosition = n4;
            this.bqp.drawButton(this.bqn, n7, n8);
        }
    }

    @Override
    public boolean a(int n2, int n3, int n4, int n5, int n6, int n7) {
        if (this.bqo.mousePressed(this.bqn, n3, n4)) {
            if (this.bqo instanceof as) {
                this.bqn.aIY.a(((as)this.bqo).Fa(), 1);
                this.bqo.displayString = this.bqn.aIY.c(net.minecraft.client.settings.c.dZ(this.bqo.id));
            }
            return true;
        }
        if (this.bqp != null && this.bqp.mousePressed(this.bqn, n3, n4)) {
            if (this.bqp instanceof as) {
                this.bqn.aIY.a(((as)this.bqp).Fa(), 1);
                this.bqp.displayString = this.bqn.aIY.c(net.minecraft.client.settings.c.dZ(this.bqp.id));
            }
            return true;
        }
        return false;
    }

    @Override
    public void b(int n2, int n3, int n4, int n5, int n6, int n7) {
        if (this.bqo != null) {
            this.bqo.mouseReleased(n3, n4);
        }
        if (this.bqp != null) {
            this.bqp.mouseReleased(n3, n4);
        }
    }

    @Override
    public void o(int n2, int n3, int n4) {
    }
}

