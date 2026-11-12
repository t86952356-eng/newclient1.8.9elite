/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.lang3.Validate
 */
package net.minecraft.util;

import net.minecraft.util.ci;
import org.apache.commons.lang3.Validate;

public class cj<K, V>
extends ci<K, V> {
    private final K dzG;
    private V aRB;

    public cj(K k2) {
        this.dzG = k2;
    }

    @Override
    public void a(int n2, K k2, V v2) {
        if (this.dzG.equals(k2)) {
            this.aRB = v2;
        }
        super.a(n2, k2, v2);
    }

    public void atx() {
        Validate.notNull(this.dzG);
    }

    @Override
    public V w(K k2) {
        Object v2 = super.w(k2);
        return v2 == null ? this.aRB : v2;
    }

    @Override
    public V hT(int n2) {
        Object v2 = super.hT(n2);
        return v2 == null ? this.aRB : v2;
    }
}

