/*
 * Decompiled with CFR 0.152.
 */
package rip.vantage.commons.util.time;

public class a {
    public long aGS;

    public a() {
        this.aX();
    }

    public boolean T(long l2) {
        return System.currentTimeMillis() - l2 >= this.aGS;
    }

    public void aX() {
        this.aGS = System.currentTimeMillis();
    }

    public long aKM() {
        return System.currentTimeMillis() - this.aGS;
    }

    public void i(long l2) {
        this.aGS = l2;
    }
}

