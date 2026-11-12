/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ComparisonChain
 */
package net.minecraft.client.gui;

import com.google.common.collect.ComparisonChain;
import java.util.Comparator;
import net.minecraft.client.network.o;
import net.minecraft.scoreboard.h;
import net.minecraft.world.ao;

class bj
implements Comparator<o> {
    private bj() {
    }

    public int a(o o2, o o3) {
        h h2 = o2.Ii();
        h h3 = o3.Ii();
        return ComparisonChain.start().compareTrueFirst(o2.If() != ao.dEA, o3.If() != ao.dEA).compare((Comparable)((Object)(h2 != null ? h2.akq() : "")), (Comparable)((Object)(h3 != null ? h3.akq() : ""))).compare((Comparable)((Object)o2.Ie().getName()), (Comparable)((Object)o3.Ie().getName())).result();
    }

    @Override
    public /* synthetic */ int compare(Object object, Object object2) {
        return this.a((o)object, (o)object2);
    }
}

