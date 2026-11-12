/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.network.play.server;

import java.util.List;
import net.minecraft.item.co;
import net.minecraft.network.aj;
import net.minecraft.network.ak;
import net.minecraft.network.play.a;

public class ba
implements aj<a> {
    private int cSL;
    private co[] dei;

    public ba() {
    }

    public ba(int n2, List<co> list) {
        this.cSL = n2;
        this.dei = new co[list.size()];
        for (int i2 = 0; i2 < this.dei.length; ++i2) {
            co co2 = list.get(i2);
            this.dei[i2] = co2 == null ? null : co2.aeg();
        }
    }

    @Override
    public void a(ak ak2) {
        this.cSL = ak2.readUnsignedByte();
        int n2 = ak2.readShort();
        this.dei = new co[n2];
        for (int i2 = 0; i2 < n2; ++i2) {
            this.dei[i2] = ak2.afA();
        }
    }

    @Override
    public void b(ak ak2) {
        ak2.writeByte(this.cSL);
        ak2.writeShort(this.dei.length);
        for (co co2 : this.dei) {
            ak2.aO(co2);
        }
    }

    @Override
    public void a(a a2) {
        a2.a(this);
    }

    public int ahF() {
        return this.cSL;
    }

    public co[] ahG() {
        return this.dei;
    }
}

