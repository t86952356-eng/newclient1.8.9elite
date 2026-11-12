/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package hackclient.rise;

import hackclient.rise.aea;
import hackclient.rise.aka;
import hackclient.rise.akh;
import lombok.Generated;

public abstract class abo
implements aea {
    public double jy = 14.0;
    public aka aqy;
    public akh<?> azn;
    public int azo = 255;

    public abo(akh<?> akh2) {
        this.azn = akh2;
    }

    public abstract void a(aka var1, int var2, int var3, float var4);

    public abstract boolean e(int var1, int var2, int var3);

    public abstract void pP();

    public abstract void ci();

    public abstract void b(char var1, int var2);

    @Generated
    public double da() {
        return this.jy;
    }

    @Generated
    public aka nH() {
        return this.aqy;
    }

    @Generated
    public akh<?> qi() {
        return this.azn;
    }

    @Generated
    public int qj() {
        return this.azo;
    }

    @Generated
    public void U(int n2) {
        this.azo = n2;
    }
}

