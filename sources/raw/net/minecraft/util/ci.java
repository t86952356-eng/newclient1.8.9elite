/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.BiMap
 *  com.google.common.collect.HashBiMap
 */
package net.minecraft.util;

import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;
import java.util.Iterator;
import java.util.Map;
import net.minecraft.util.bd;
import net.minecraft.util.cg;
import net.minecraft.util.ck;

public class ci<K, V>
extends ck<K, V>
implements bd<V> {
    protected final cg<V> dzE = new cg();
    protected final Map<V, K> dzF = ((BiMap)this.dzI).inverse();

    public void a(int n2, K k2, V v2) {
        this.dzE.a(v2, n2);
        this.b(k2, v2);
    }

    @Override
    protected Map<K, V> CX() {
        return HashBiMap.create();
    }

    @Override
    public V w(K k2) {
        return super.w(k2);
    }

    public K y(V v2) {
        return this.dzF.get(v2);
    }

    @Override
    public boolean containsKey(K k2) {
        return super.containsKey(k2);
    }

    public int z(V v2) {
        return this.dzE.x(v2);
    }

    public V hT(int n2) {
        return this.dzE.hS(n2);
    }

    @Override
    public Iterator<V> iterator() {
        return this.dzE.iterator();
    }
}

