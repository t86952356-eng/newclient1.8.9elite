/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Objects
 */
package net.minecraft.world.gen.structure;

import com.google.common.base.Objects;
import net.minecraft.nbt.u;
import net.minecraft.util.ao;
import net.minecraft.util.b;
import net.minecraft.util.db;

public class w {
    public int dQB;
    public int dQC;
    public int dQD;
    public int dQE;
    public int dQF;
    public int dQG;

    public w() {
    }

    public w(int[] nArray) {
        if (nArray.length == 6) {
            this.dQB = nArray[0];
            this.dQC = nArray[1];
            this.dQD = nArray[2];
            this.dQE = nArray[3];
            this.dQF = nArray[4];
            this.dQG = nArray[5];
        }
    }

    public static w ayJ() {
        return new w(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
    }

    public static w a(int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, int n10, ao ao2) {
        switch (ao2) {
            case dws: {
                return new w(n2 + n5, n3 + n6, n4 - n10 + 1 + n7, n2 + n8 - 1 + n5, n3 + n9 - 1 + n6, n4 + n7);
            }
            case dwt: {
                return new w(n2 + n5, n3 + n6, n4 + n7, n2 + n8 - 1 + n5, n3 + n9 - 1 + n6, n4 + n10 - 1 + n7);
            }
            case dwu: {
                return new w(n2 - n10 + 1 + n7, n3 + n6, n4 + n5, n2 + n7, n3 + n9 - 1 + n6, n4 + n8 - 1 + n5);
            }
            case dwv: {
                return new w(n2 + n7, n3 + n6, n4 + n5, n2 + n10 - 1 + n7, n3 + n9 - 1 + n6, n4 + n8 - 1 + n5);
            }
        }
        return new w(n2 + n5, n3 + n6, n4 + n7, n2 + n8 - 1 + n5, n3 + n9 - 1 + n6, n4 + n10 - 1 + n7);
    }

    public static w i(int n2, int n3, int n4, int n5, int n6, int n7) {
        return new w(Math.min(n2, n5), Math.min(n3, n6), Math.min(n4, n7), Math.max(n2, n5), Math.max(n3, n6), Math.max(n4, n7));
    }

    public w(w w2) {
        this.dQB = w2.dQB;
        this.dQC = w2.dQC;
        this.dQD = w2.dQD;
        this.dQE = w2.dQE;
        this.dQF = w2.dQF;
        this.dQG = w2.dQG;
    }

    public w(int n2, int n3, int n4, int n5, int n6, int n7) {
        this.dQB = n2;
        this.dQC = n3;
        this.dQD = n4;
        this.dQE = n5;
        this.dQF = n6;
        this.dQG = n7;
    }

    public w(db db2, db db3) {
        this.dQB = Math.min(db2.wt(), db3.wt());
        this.dQC = Math.min(db2.wu(), db3.wu());
        this.dQD = Math.min(db2.wx(), db3.wx());
        this.dQE = Math.max(db2.wt(), db3.wt());
        this.dQF = Math.max(db2.wu(), db3.wu());
        this.dQG = Math.max(db2.wx(), db3.wx());
    }

    public w(int n2, int n3, int n4, int n5) {
        this.dQB = n2;
        this.dQD = n3;
        this.dQE = n4;
        this.dQG = n5;
        this.dQC = 1;
        this.dQF = 512;
    }

    public boolean b(w w2) {
        return this.dQE >= w2.dQB && this.dQB <= w2.dQE && this.dQG >= w2.dQD && this.dQD <= w2.dQG && this.dQF >= w2.dQC && this.dQC <= w2.dQF;
    }

    public boolean G(int n2, int n3, int n4, int n5) {
        return this.dQE >= n2 && this.dQB <= n4 && this.dQG >= n3 && this.dQD <= n5;
    }

    public void c(w w2) {
        this.dQB = Math.min(this.dQB, w2.dQB);
        this.dQC = Math.min(this.dQC, w2.dQC);
        this.dQD = Math.min(this.dQD, w2.dQD);
        this.dQE = Math.max(this.dQE, w2.dQE);
        this.dQF = Math.max(this.dQF, w2.dQF);
        this.dQG = Math.max(this.dQG, w2.dQG);
    }

    public void ad(int n2, int n3, int n4) {
        this.dQB += n2;
        this.dQC += n3;
        this.dQD += n4;
        this.dQE += n2;
        this.dQF += n3;
        this.dQG += n4;
    }

    public boolean k(db db2) {
        return db2.wt() >= this.dQB && db2.wt() <= this.dQE && db2.wx() >= this.dQD && db2.wx() <= this.dQG && db2.wu() >= this.dQC && db2.wu() <= this.dQF;
    }

    public db ayK() {
        return new db(this.dQE - this.dQB, this.dQF - this.dQC, this.dQG - this.dQD);
    }

    public int ayL() {
        return this.dQE - this.dQB + 1;
    }

    public int ayM() {
        return this.dQF - this.dQC + 1;
    }

    public int ayN() {
        return this.dQG - this.dQD + 1;
    }

    public db ayO() {
        return new b(this.dQB + (this.dQE - this.dQB + 1) / 2, this.dQC + (this.dQF - this.dQC + 1) / 2, this.dQD + (this.dQG - this.dQD + 1) / 2);
    }

    public String toString() {
        return Objects.toStringHelper((Object)this).add("x0", this.dQB).add("y0", this.dQC).add("z0", this.dQD).add("x1", this.dQE).add("y1", this.dQF).add("z1", this.dQG).toString();
    }

    public u ayP() {
        return new u(new int[]{this.dQB, this.dQC, this.dQD, this.dQE, this.dQF, this.dQG});
    }
}

