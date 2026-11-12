/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.block;

import net.minecraft.item.co;
import net.minecraft.item.d;
import net.minecraft.nbt.n;

public class BlockJukebox$TileEntityJukebox
extends net.minecraft.tileentity.d {
    private co aWu;

    @Override
    public void a(n n2) {
        super.a(n2);
        if (n2.C("RecordItem", 10)) {
            this.E(co.s(n2.eN("RecordItem")));
        } else if (n2.eG("Record") > 0) {
            this.E(new co(d.fT(n2.eG("Record")), 1, 0));
        }
    }

    @Override
    public void b(n n2) {
        super.b(n2);
        if (this.yw() != null) {
            n2.b("RecordItem", this.yw().t(new n()));
        }
    }

    public co yw() {
        return this.aWu;
    }

    public void E(co co2) {
        this.aWu = co2;
        this.Lw();
    }
}

