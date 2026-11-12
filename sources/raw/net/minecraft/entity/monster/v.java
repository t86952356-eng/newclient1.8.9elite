/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 */
package net.minecraft.entity.monster;

import com.google.common.base.Predicate;
import net.minecraft.entity.c;
import net.minecraft.entity.passive.w;
import net.minecraft.entity.player.a;
import net.minecraft.entity.r;

class v
implements Predicate<r> {
    private final net.minecraft.entity.monster.r cED;

    public v(net.minecraft.entity.monster.r r2) {
        this.cED = r2;
    }

    public boolean W(r r2) {
        return (r2 instanceof a || r2 instanceof w) && r2.T((c)this.cED) > 9.0;
    }

    public /* synthetic */ boolean apply(Object object) {
        return this.W((r)object);
    }
}

