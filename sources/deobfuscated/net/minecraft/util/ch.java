/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.util;

import net.minecraft.util.ck;

public class ch<K, V>
extends ck<K, V> {
    private final V dzD;

    public ch(V v2) {
        this.dzD = v2;
    }

    @Override
    public V w(K k2) {
        Object v2 = super.w(k2);
        return v2 == null ? this.dzD : v2;
    }
}

