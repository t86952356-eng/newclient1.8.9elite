/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package hackclient.rise;

import hackclient.rise.akd;
import lombok.Generated;

public class ake {
    public int alM;
    public int alN;
    public int aRr;

    public ake(int n2, int n3, int n4) {
        this.alM = n2;
        this.alN = n3;
        this.aRr = n4;
    }

    public ake l(int n2, int n3, int n4) {
        return new ake(this.alM + n2, this.alN + n3, this.aRr + n4);
    }

    public ake c(ake ake2) {
        return this.l(ake2.alM, ake2.alN, ake2.aRr);
    }

    public ake m(int n2, int n3, int n4) {
        return this.l(-n2, -n3, -n4);
    }

    public ake d(ake ake2) {
        return this.l(-ake2.alM, -ake2.alN, -ake2.aRr);
    }

    public double wv() {
        return Math.sqrt(this.alM * this.alM + this.alN * this.alN + this.aRr * this.aRr);
    }

    public int wt() {
        return this.alM;
    }

    public int wu() {
        return this.alN;
    }

    public int wx() {
        return this.aRr;
    }

    public akd ag(double d2) {
        return new akd((double)this.alM * d2, (double)this.alN * d2, (double)this.aRr * d2);
    }

    public double e(ake ake2) {
        return Math.sqrt(Math.pow(ake2.alM - this.alM, 2.0) + Math.pow(ake2.alN - this.alN, 2.0) + Math.pow(ake2.aRr - this.aRr, 2.0));
    }

    public boolean equals(Object object) {
        if (!(object instanceof akd)) {
            return false;
        }
        akd akd2 = (akd)object;
        return (double)this.alM == Math.floor(akd2.x) && (double)this.alN == Math.floor(akd2.y) && (double)this.aRr == Math.floor(akd2.z);
    }

    @Generated
    public void aG(int n2) {
        this.alM = n2;
    }

    @Generated
    public void aH(int n2) {
        this.alN = n2;
    }

    @Generated
    public void aI(int n2) {
        this.aRr = n2;
    }
}

