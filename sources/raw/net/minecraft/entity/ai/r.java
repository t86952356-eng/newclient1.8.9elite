/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.entity.ai;

import java.util.List;
import net.minecraft.entity.ai.e;
import net.minecraft.entity.c;
import net.minecraft.entity.monster.w;
import net.minecraft.entity.passive.z;

public class r
extends e {
    private final z cxN;
    private w cxO;
    private int cxP;
    private boolean cxQ;

    public r(z z2) {
        this.cxN = z2;
        this.eO(3);
    }

    @Override
    public boolean WC() {
        if (this.cxN.Ux() >= 0) {
            return false;
        }
        if (!this.cxN.baU.avr()) {
            return false;
        }
        List<w> list = this.cxN.baU.a(w.class, this.cxN.Us().ad(6.0, 2.0, 6.0));
        if (list.isEmpty()) {
            return false;
        }
        for (w w2 : list) {
            if (w2.Zu() <= 0) continue;
            this.cxO = w2;
            break;
        }
        return this.cxO != null;
    }

    @Override
    public boolean WD() {
        return this.cxO.Zu() > 0;
    }

    @Override
    public void WG() {
        this.cxP = this.cxN.VB().nextInt(320);
        this.cxQ = false;
        this.cxO.UU().aiL();
    }

    @Override
    public void WE() {
        this.cxO = null;
        this.cxN.UU().aiL();
    }

    @Override
    public void WF() {
        this.cxN.UR().b(this.cxO, 30.0f, 30.0f);
        if (this.cxO.Zu() == this.cxP) {
            this.cxN.UU().e(this.cxO, 0.5);
            this.cxQ = true;
        }
        if (this.cxQ && this.cxN.T((c)this.cxO) < 4.0) {
            this.cxO.bf(false);
            this.cxN.UU().aiL();
        }
    }
}

