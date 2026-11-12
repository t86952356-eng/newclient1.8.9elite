/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.util;

import net.minecraft.util.b;
import net.minecraft.util.db;

public final class g
extends b {
    private int alM;
    private int alN;
    private int aRr;

    public g() {
        this(0, 0, 0);
    }

    public g(int n2, int n3, int n4) {
        super(0, 0, 0);
        this.alM = n2;
        this.alN = n3;
        this.aRr = n4;
    }

    @Override
    public int wt() {
        return this.alM;
    }

    @Override
    public int wu() {
        return this.alN;
    }

    @Override
    public int wx() {
        return this.aRr;
    }

    public g E(int n2, int n3, int n4) {
        this.alM = n2;
        this.alN = n3;
        this.aRr = n4;
        return this;
    }

    @Override
    public /* synthetic */ db e(db db2) {
        return super.b(db2);
    }

    @Override
    public /* synthetic */ db D(int n2, int n3, int n4) {
        return super.C(n2, n3, n4);
    }

    @Override
    public /* synthetic */ db f(db db2) {
        return super.d(db2);
    }
}

