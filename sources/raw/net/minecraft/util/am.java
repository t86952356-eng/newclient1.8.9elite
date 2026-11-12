/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 */
package net.minecraft.util;

import com.google.common.base.Predicate;
import net.minecraft.entity.c;
import net.minecraft.entity.item.a;
import net.minecraft.entity.p;
import net.minecraft.entity.r;
import net.minecraft.item.co;

public class am
implements Predicate<c> {
    private final co dvK;

    public am(co co2) {
        this.dvK = co2;
    }

    public boolean B(c c2) {
        if (!c2.TS()) {
            return false;
        }
        if (!(c2 instanceof r)) {
            return false;
        }
        r r2 = (r)c2;
        return r2.eG(p.W(this.dvK)) == null && (r2 instanceof p ? ((p)r2).Vn() : r2 instanceof a || r2 instanceof net.minecraft.entity.player.a);
    }

    public /* synthetic */ boolean apply(Object object) {
        return this.B((c)object);
    }
}

