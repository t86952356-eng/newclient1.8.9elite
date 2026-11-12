/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.network.play.server;

import net.minecraft.item.co;
import net.minecraft.network.aj;
import net.minecraft.network.ak;
import net.minecraft.network.play.a;

public class az
implements aj<a> {
    private int cSL;
    private int dl;
    private co deh;

    public az() {
    }

    public az(int n2, int n3, co co2) {
        this.cSL = n2;
        this.dl = n3;
        this.deh = co2 == null ? null : co2.aeg();
    }

    @Override
    public void a(a a2) {
        a2.a(this);
    }

    @Override
    public void a(ak ak2) {
        this.cSL = ak2.readByte();
        this.dl = ak2.readShort();
        this.deh = ak2.afA();
    }

    @Override
    public void b(ak ak2) {
        ak2.writeByte(this.cSL);
        ak2.writeShort(this.dl);
        ak2.aO(this.deh);
    }

    public int ahC() {
        return this.cSL;
    }

    public int ahD() {
        return this.dl;
    }

    public co ahE() {
        return this.deh;
    }
}

