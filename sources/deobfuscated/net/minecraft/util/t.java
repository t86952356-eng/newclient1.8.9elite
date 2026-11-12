/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Iterators
 *  com.google.common.collect.Lists
 */
package net.minecraft.util;

import com.google.common.collect.Iterators;
import com.google.common.collect.Lists;
import java.util.Arrays;
import java.util.IllegalFormatException;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import net.minecraft.util.ba;
import net.minecraft.util.cr;
import net.minecraft.util.p;
import net.minecraft.util.s;
import net.minecraft.util.u;
import net.minecraft.util.v;

public class t
extends p {
    private final String dup;
    private final Object[] duq;
    private final Object dur = new Object();
    private long dus = -1L;
    List<ba> cpm = Lists.newArrayList();
    public static final Pattern dut = Pattern.compile("%(?:(\\d+)\\$)?([A-Za-z%]|$)");

    public t(String string, Object ... objectArray) {
        this.dup = string;
        this.duq = objectArray;
        for (Object object : objectArray) {
            if (!(object instanceof ba)) continue;
            ((ba)object).arp().b(this.arp());
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    synchronized void uq() {
        Object object = this.dur;
        synchronized (object) {
            long l2 = cr.atH();
            if (l2 == this.dus) {
                return;
            }
            this.dus = l2;
            this.cpm.clear();
        }
        try {
            this.gb(cr.gm(this.dup));
        }
        catch (u u2) {
            this.cpm.clear();
            try {
                this.gb(cr.gn(this.dup));
            }
            catch (u u3) {
                throw u2;
            }
        }
    }

    protected void gb(String string) {
        boolean bl2 = false;
        Matcher matcher = dut.matcher(string);
        int n2 = 0;
        int n3 = 0;
        try {
            while (matcher.find(n3)) {
                Object object;
                int n4 = matcher.start();
                int n5 = matcher.end();
                if (n4 > n3) {
                    object = new s(String.format(string.substring(n3, n4), new Object[0]));
                    ((p)object).arp().b(this.arp());
                    this.cpm.add((ba)object);
                }
                object = matcher.group(2);
                String string2 = string.substring(n4, n5);
                if ("%".equals(object) && "%%".equals(string2)) {
                    var10_12 = new s("%");
                    ((p)var10_12).arp().b(this.arp());
                    this.cpm.add((ba)var10_12);
                } else {
                    int n6;
                    if (!"s".equals(object)) {
                        throw new u(this, "Unsupported format: '" + string2 + "'");
                    }
                    var10_12 = matcher.group(1);
                    int n7 = n6 = var10_12 != null ? Integer.parseInt((String)var10_12) - 1 : n2++;
                    if (n6 < this.duq.length) {
                        this.cpm.add(this.hw(n6));
                    }
                }
                n3 = n5;
            }
            if (n3 < string.length()) {
                s s2 = new s(String.format(string.substring(n3), new Object[0]));
                s2.arp().b(this.arp());
                this.cpm.add(s2);
            }
        }
        catch (IllegalFormatException illegalFormatException) {
            throw new u(this, (Throwable)illegalFormatException);
        }
    }

    private ba hw(int n2) {
        ba ba2;
        if (n2 >= this.duq.length) {
            throw new u(this, n2);
        }
        Object object = this.duq[n2];
        if (object instanceof ba) {
            ba2 = (ba)object;
        } else {
            ba2 = new s(object == null ? "null" : object.toString());
            ba2.arp().b(this.arp());
        }
        return ba2;
    }

    @Override
    public ba a(v v2) {
        super.a(v2);
        for (Object object : this.duq) {
            if (!(object instanceof ba)) continue;
            ((ba)object).arp().b(this.arp());
        }
        if (this.dus > -1L) {
            for (ba ba2 : this.cpm) {
                ba2.arp().b(v2);
            }
        }
        return this;
    }

    @Override
    public Iterator<ba> iterator() {
        this.uq();
        return Iterators.concat(t.c(this.cpm), t.c(this.dun));
    }

    @Override
    public String arj() {
        this.uq();
        StringBuilder stringBuilder = new StringBuilder();
        for (ba ba2 : this.cpm) {
            stringBuilder.append(ba2.arj());
        }
        return stringBuilder.toString();
    }

    public t art() {
        Object[] objectArray = new Object[this.duq.length];
        for (int i2 = 0; i2 < this.duq.length; ++i2) {
            objectArray[i2] = this.duq[i2] instanceof ba ? ((ba)this.duq[i2]).arl() : this.duq[i2];
        }
        t t2 = new t(this.dup, objectArray);
        t2.a(this.arp().arG());
        for (ba ba2 : this.aro()) {
            t2.n(ba2.arl());
        }
        return t2;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof t)) {
            return false;
        }
        t t2 = (t)object;
        return Arrays.equals(this.duq, t2.duq) && this.dup.equals(t2.dup) && super.equals(object);
    }

    @Override
    public int hashCode() {
        int n2 = super.hashCode();
        n2 = 31 * n2 + this.dup.hashCode();
        n2 = 31 * n2 + Arrays.hashCode(this.duq);
        return n2;
    }

    @Override
    public String toString() {
        return "TranslatableComponent{key='" + this.dup + "', args=" + Arrays.toString(this.duq) + ", siblings=" + String.valueOf(this.dun) + ", style=" + String.valueOf(this.arp()) + "}";
    }

    public String SM() {
        return this.dup;
    }

    public Object[] aru() {
        return this.duq;
    }

    @Override
    public /* synthetic */ ba arl() {
        return this.art();
    }
}

