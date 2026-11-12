/*
 * Decompiled with CFR 0.152.
 */
package net.optifine.shaders.config;

import java.util.Comparator;
import net.optifine.shaders.config.o;

class y
implements Comparator<o> {
    y() {
    }

    public int a(o o2, o o3) {
        return o2.getName().compareToIgnoreCase(o3.getName());
    }

    @Override
    public /* synthetic */ int compare(Object object, Object object2) {
        return this.a((o)object, (o)object2);
    }
}

