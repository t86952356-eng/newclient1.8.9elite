/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ComparisonChain
 */
package net.minecraft.client.gui.spectator.categories;

import com.google.common.collect.ComparisonChain;
import java.util.Comparator;
import net.minecraft.client.network.o;

class c
implements Comparator<o> {
    c() {
    }

    public int a(o o2, o o3) {
        return ComparisonChain.start().compare((Comparable)o2.Ie().getId(), (Comparable)o3.Ie().getId()).result();
    }

    @Override
    public /* synthetic */ int compare(Object object, Object object2) {
        return this.a((o)object, (o)object2);
    }
}

