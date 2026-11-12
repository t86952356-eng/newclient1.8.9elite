/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.item.crafting;

import java.util.Comparator;
import net.minecraft.item.crafting.a;
import net.minecraft.item.crafting.d;
import net.minecraft.item.crafting.u;
import net.minecraft.item.crafting.v;

class b
implements Comparator<d> {
    b(a a2) {
    }

    public int a(d d2, d d3) {
        return d2 instanceof v && d3 instanceof u ? 1 : (d3 instanceof v && d2 instanceof u ? -1 : (d3.aeC() < d2.aeC() ? -1 : (d3.aeC() > d2.aeC() ? 1 : 0)));
    }

    @Override
    public /* synthetic */ int compare(Object object, Object object2) {
        return this.a((d)object, (d)object2);
    }
}

