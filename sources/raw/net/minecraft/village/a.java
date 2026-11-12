/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.village;

import net.minecraft.item.co;
import net.minecraft.item.d;
import net.minecraft.nbt.n;

public class a {
    private co dAY;
    private co dAZ;
    private co dBa;
    private int dBb;
    private int dBc;
    private boolean dBd;

    public a(n n2) {
        this.G(n2);
    }

    public a(co co2, co co3, co co4) {
        this(co2, co3, co4, 0, 7);
    }

    public a(co co2, co co3, co co4, int n2, int n3) {
        this.dAY = co2;
        this.dAZ = co3;
        this.dBa = co4;
        this.dBb = n2;
        this.dBc = n3;
        this.dBd = true;
    }

    public a(co co2, co co3) {
        this(co2, null, co3);
    }

    public a(co co2, d d2) {
        this(co2, new co(d2));
    }

    public co atY() {
        return this.dAY;
    }

    public co atZ() {
        return this.dAZ;
    }

    public boolean aua() {
        return this.dAZ != null;
    }

    public co aub() {
        return this.dBa;
    }

    public int auc() {
        return this.dBb;
    }

    public int aud() {
        return this.dBc;
    }

    public void aue() {
        ++this.dBb;
    }

    public void hW(int n2) {
        this.dBc += n2;
    }

    public boolean auf() {
        return this.dBb >= this.dBc;
    }

    public void aug() {
        this.dBb = this.dBc;
    }

    public boolean auh() {
        return this.dBd;
    }

    public void G(n n2) {
        n n3 = n2.eN("buy");
        this.dAY = co.s(n3);
        n n4 = n2.eN("sell");
        this.dBa = co.s(n4);
        if (n2.C("buyB", 10)) {
            this.dAZ = co.s(n2.eN("buyB"));
        }
        if (n2.C("uses", 99)) {
            this.dBb = n2.eG("uses");
        }
        this.dBc = n2.C("maxUses", 99) ? n2.eG("maxUses") : 7;
        this.dBd = n2.C("rewardExp", 1) ? n2.eO("rewardExp") : true;
    }

    public n aui() {
        n n2 = new n();
        n2.b("buy", this.dAY.t(new n()));
        n2.b("sell", this.dBa.t(new n()));
        if (this.dAZ != null) {
            n2.b("buyB", this.dAZ.t(new n()));
        }
        n2.B("uses", this.dBb);
        n2.B("maxUses", this.dBc);
        n2.o("rewardExp", this.dBd);
        return n2;
    }
}

