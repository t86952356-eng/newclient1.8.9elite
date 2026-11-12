/*
 * Decompiled with CFR 0.152.
 */
package net.optifine.util;

import java.util.Collections;
import java.util.Enumeration;
import java.util.LinkedHashSet;
import java.util.Properties;
import java.util.Set;

public class af
extends Properties {
    private final Set<Object> eNo = new LinkedHashSet<Object>();

    @Override
    public synchronized Object put(Object object, Object object2) {
        this.eNo.add(object);
        return super.put(object, object2);
    }

    @Override
    public Set<Object> keySet() {
        Set<Object> set = super.keySet();
        this.eNo.retainAll(set);
        return Collections.unmodifiableSet(this.eNo);
    }

    @Override
    public synchronized Enumeration<Object> keys() {
        return Collections.enumeration(this.keySet());
    }
}

