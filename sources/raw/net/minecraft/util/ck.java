/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 *  org.apache.commons.lang3.Validate
 */
package net.minecraft.util;

import com.google.common.collect.Maps;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import net.minecraft.util.bf;
import org.apache.commons.lang3.Validate;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ck<K, V>
implements bf<K, V> {
    private static final Logger dzH = LogManager.getLogger();
    protected final Map<K, V> dzI = this.CX();

    protected Map<K, V> CX() {
        return Maps.newHashMap();
    }

    @Override
    public V w(K k2) {
        return this.dzI.get(k2);
    }

    @Override
    public void b(K k2, V v2) {
        Validate.notNull(k2);
        Validate.notNull(v2);
        if (this.dzI.containsKey(k2)) {
            dzH.debug("Adding duplicate key '" + String.valueOf(k2) + "' to registry");
        }
        this.dzI.put(k2, v2);
    }

    public Set<K> aty() {
        return Collections.unmodifiableSet(this.dzI.keySet());
    }

    public boolean containsKey(K k2) {
        return this.dzI.containsKey(k2);
    }

    @Override
    public Iterator<V> iterator() {
        return this.dzI.values().iterator();
    }
}

