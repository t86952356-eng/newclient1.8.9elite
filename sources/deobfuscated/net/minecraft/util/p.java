/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Function
 *  com.google.common.collect.Iterators
 *  com.google.common.collect.Lists
 */
package net.minecraft.util;

import com.google.common.base.Function;
import com.google.common.collect.Iterators;
import com.google.common.collect.Lists;
import java.util.Iterator;
import java.util.List;
import net.minecraft.util.an;
import net.minecraft.util.ba;
import net.minecraft.util.q;
import net.minecraft.util.r;
import net.minecraft.util.s;
import net.minecraft.util.v;

public abstract class p
implements ba {
    protected List<ba> dun = Lists.newArrayList();
    private v duo;

    @Override
    public ba n(ba ba2) {
        ba2.arp().b(this.arp());
        this.dun.add(ba2);
        return this;
    }

    @Override
    public List<ba> aro() {
        return this.dun;
    }

    @Override
    public ba ga(String string) {
        return this.n(new s(string));
    }

    @Override
    public ba a(v v2) {
        this.duo = v2;
        for (ba ba2 : this.dun) {
            ba2.arp().b(this.arp());
        }
        return this;
    }

    @Override
    public v arp() {
        if (this.duo == null) {
            this.duo = new v();
            for (ba ba2 : this.dun) {
                ba2.arp().b(this.duo);
            }
        }
        return this.duo;
    }

    @Override
    public Iterator<ba> iterator() {
        return Iterators.concat((Iterator)Iterators.forArray((Object[])new p[]{this}), p.c(this.dun));
    }

    @Override
    public final String arq() {
        StringBuilder stringBuilder = new StringBuilder();
        for (ba ba2 : this) {
            stringBuilder.append(ba2.arj());
        }
        return stringBuilder.toString();
    }

    @Override
    public final String getFormattedText() {
        StringBuilder stringBuilder = new StringBuilder();
        for (ba ba2 : this) {
            stringBuilder.append(ba2.arp().arE());
            stringBuilder.append(ba2.arj());
            stringBuilder.append((Object)an.dwh);
        }
        return stringBuilder.toString();
    }

    public static Iterator<ba> c(Iterable<ba> iterable) {
        Iterator iterator = Iterators.concat((Iterator)Iterators.transform(iterable.iterator(), (Function)new q()));
        iterator = Iterators.transform((Iterator)iterator, (Function)new r());
        return iterator;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof p)) {
            return false;
        }
        p p2 = (p)object;
        return this.dun.equals(p2.dun) && this.arp().equals(p2.arp());
    }

    public int hashCode() {
        return 31 * this.duo.hashCode() + this.dun.hashCode();
    }

    public String toString() {
        return "BaseComponent{style=" + String.valueOf(this.duo) + ", siblings=" + String.valueOf(this.dun) + "}";
    }
}

