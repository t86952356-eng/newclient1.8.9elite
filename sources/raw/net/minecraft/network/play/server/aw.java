/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.network.play.server;

import net.minecraft.entity.c;
import net.minecraft.network.aj;
import net.minecraft.network.ak;
import net.minecraft.network.play.a;
import net.minecraft.util.bt;

public class aw
implements aj<a> {
    private int crw;
    private int alM;
    private int alN;
    private int aRr;
    private int bif;

    public aw() {
    }

    public aw(c c2) {
        this.crw = c2.getEntityId();
        this.alM = bt.aF(c2.gW * 32.0);
        this.alN = bt.aF(c2.gX * 32.0);
        this.aRr = bt.aF(c2.gY * 32.0);
        if (c2 instanceof net.minecraft.entity.effect.a) {
            this.bif = 1;
        }
    }

    @Override
    public void a(ak ak2) {
        this.crw = ak2.afw();
        this.bif = ak2.readByte();
        this.alM = ak2.readInt();
        this.alN = ak2.readInt();
        this.aRr = ak2.readInt();
    }

    @Override
    public void b(ak ak2) {
        ak2.gr(this.crw);
        ak2.writeByte(this.bif);
        ak2.writeInt(this.alM);
        ak2.writeInt(this.alN);
        ak2.writeInt(this.aRr);
    }

    @Override
    public void a(a a2) {
        a2.a(this);
    }

    public int ahw() {
        return this.crw;
    }

    public int ahx() {
        return this.alM;
    }

    public int ahy() {
        return this.alN;
    }

    public int ahz() {
        return this.aRr;
    }

    public int ahA() {
        return this.bif;
    }
}

