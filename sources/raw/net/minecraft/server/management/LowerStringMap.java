/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 */
package net.minecraft.server.management;

import com.google.common.collect.Maps;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

public class LowerStringMap<V>
implements Map<String, V> {
    private final Map<String, V> dlT = Maps.newLinkedHashMap();

    @Override
    public int size() {
        return this.dlT.size();
    }

    @Override
    public boolean isEmpty() {
        return this.dlT.isEmpty();
    }

    @Override
    public boolean containsKey(Object object) {
        return this.dlT.containsKey(object.toString().toLowerCase());
    }

    @Override
    public boolean containsValue(Object object) {
        return this.dlT.containsKey(object);
    }

    @Override
    public V get(Object object) {
        return this.dlT.get(object.toString().toLowerCase());
    }

    public V e(String string, V v2) {
        return this.dlT.put(string.toLowerCase(), v2);
    }

    @Override
    public V remove(Object object) {
        return this.dlT.remove(object.toString().toLowerCase());
    }

    @Override
    public void putAll(Map<? extends String, ? extends V> map) {
        for (Map.Entry<String, V> entry : map.entrySet()) {
            this.e(entry.getKey(), entry.getValue());
        }
    }

    @Override
    public void clear() {
        this.dlT.clear();
    }

    @Override
    public Set<String> keySet() {
        return this.dlT.keySet();
    }

    @Override
    public Collection<V> values() {
        return this.dlT.values();
    }

    @Override
    public Set<Map.Entry<String, V>> entrySet() {
        return this.dlT.entrySet();
    }

    @Override
    public /* synthetic */ Object put(Object object, Object object2) {
        return this.e((String)object, object2);
    }
}

