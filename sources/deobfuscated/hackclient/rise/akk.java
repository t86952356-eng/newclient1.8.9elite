/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.akj;

class akk
extends Number {
    final /* synthetic */ long aRI;
    final /* synthetic */ akj aRJ;

    akk(akj akj2, long l2) {
        this.aRJ = akj2;
        this.aRI = l2;
    }

    @Override
    public int intValue() {
        return Math.round(this.aRI);
    }

    @Override
    public long longValue() {
        return this.aRI;
    }

    @Override
    public float floatValue() {
        return this.aRI;
    }

    @Override
    public double doubleValue() {
        return this.aRI;
    }
}

