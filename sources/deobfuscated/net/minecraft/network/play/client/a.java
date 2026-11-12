/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.network.play.client;

import net.minecraft.network.aj;
import net.minecraft.network.ak;
import net.minecraft.network.play.b;

public class a
implements aj<b> {
    public int key;

    public a() {
    }

    public a(int n2) {
        this.key = n2;
    }

    @Override
    public void a(b b2) {
        b2.a(this);
    }

    @Override
    public void a(ak ak2) {
        this.key = ak2.afw();
    }

    @Override
    public void b(ak ak2) {
        ak2.gr(this.key);
    }

    public int getKey() {
        return this.key;
    }
}

