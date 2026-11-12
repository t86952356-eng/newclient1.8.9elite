/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.network.play.server;

import net.minecraft.network.aj;
import net.minecraft.network.ak;
import net.minecraft.network.play.a;
import net.minecraft.network.play.server.cb;
import net.minecraft.util.ba;

public class ca
implements aj<a> {
    private cb dfC;
    private ba bmC;
    private int dfD;
    private int dfE;
    private int dfF;

    public ca() {
    }

    public ca(cb cb2, ba ba2) {
        this(cb2, ba2, -1, -1, -1);
    }

    public ca(int n2, int n3, int n4) {
        this(cb.dfI, null, n2, n3, n4);
    }

    public ca(cb cb2, ba ba2, int n2, int n3, int n4) {
        this.dfC = cb2;
        this.bmC = ba2;
        this.dfD = n2;
        this.dfE = n3;
        this.dfF = n4;
    }

    @Override
    public void a(ak ak2) {
        this.dfC = ak2.k(cb.class);
        if (this.dfC == cb.dfG || this.dfC == cb.dfH) {
            this.bmC = ak2.afv();
        }
        if (this.dfC == cb.dfI) {
            this.dfD = ak2.readInt();
            this.dfE = ak2.readInt();
            this.dfF = ak2.readInt();
        }
    }

    @Override
    public void b(ak ak2) {
        ak2.b(this.dfC);
        if (this.dfC == cb.dfG || this.dfC == cb.dfH) {
            ak2.j(this.bmC);
        }
        if (this.dfC == cb.dfI) {
            ak2.writeInt(this.dfD);
            ak2.writeInt(this.dfE);
            ak2.writeInt(this.dfF);
        }
    }

    @Override
    public void a(a a2) {
        a2.a(this);
    }

    public cb aip() {
        return this.dfC;
    }

    public ba aiq() {
        return this.bmC;
    }

    public int getFadeInTime() {
        return this.dfD;
    }

    public int getDisplayTime() {
        return this.dfE;
    }

    public int getFadeOutTime() {
        return this.dfF;
    }
}

