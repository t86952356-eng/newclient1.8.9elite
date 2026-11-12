/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.ahv;
import net.minecraft.util.db;

public class aht {
    private final int aOo;
    private final int aOp;
    private boolean[][][] aOq;
    public final db aOr;

    public aht(int n2, db db2) {
        this.aOo = n2;
        this.aOr = db2;
        this.aOp = this.aOo * 2 + 2;
        this.aX();
    }

    public void a(ahv ahv2) {
        this.h(ahv2.wt(), ahv2.wu(), ahv2.wx());
    }

    public void aX() {
        this.aOq = new boolean[this.aOp][this.aOp][this.aOp];
    }

    public void h(int n2, int n3, int n4) {
        this.k(n2 -= this.aOr.wt(), n3 -= this.aOr.wu(), n4 -= this.aOr.wx());
        this.aOq[n2 + this.aOo][n3 + this.aOo][n4 + this.aOo] = true;
    }

    public void i(int n2, int n3, int n4) {
        this.k(n2 -= this.aOr.wt(), n3 -= this.aOr.wu(), n4 -= this.aOr.wx());
        this.aOq[n2 + this.aOo][n3 + this.aOo][n4 + this.aOo] = false;
    }

    public boolean b(ahv ahv2) {
        return this.j(ahv2.wt(), ahv2.wu(), ahv2.wx());
    }

    public boolean j(int n2, int n3, int n4) {
        this.k(n2 -= this.aOr.wt(), n3 -= this.aOr.wu(), n4 -= this.aOr.wx());
        return this.aOq[n2 + this.aOo][n3 + this.aOo][n4 + this.aOo];
    }

    public void k(int n2, int n3, int n4) {
        if (Math.abs(n2) > this.aOo || Math.abs(n3) > this.aOo || Math.abs(n4) > this.aOo) {
            System.out.println("Outside of size, " + n2 + " " + n3 + " " + n4);
        }
    }
}

