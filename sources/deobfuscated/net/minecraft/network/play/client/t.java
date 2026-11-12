/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.network.play.client;

import net.minecraft.item.co;
import net.minecraft.network.aj;
import net.minecraft.network.ak;
import net.minecraft.network.play.b;

public class t
implements aj<b> {
    private int slotId;
    private co aeQ;

    public t() {
    }

    public t(int n2, co co2) {
        this.slotId = n2;
        this.aeQ = co2 != null ? co2.aeg() : null;
    }

    @Override
    public void a(b b2) {
        b2.a(this);
    }

    @Override
    public void a(ak ak2) {
        this.slotId = ak2.readShort();
        this.aeQ = ak2.afA();
    }

    @Override
    public void b(ak ak2) {
        ak2.writeShort(this.slotId);
        ak2.aO(this.aeQ);
    }

    public int getSlotId() {
        return this.slotId;
    }

    public co ls() {
        return this.aeQ;
    }
}

