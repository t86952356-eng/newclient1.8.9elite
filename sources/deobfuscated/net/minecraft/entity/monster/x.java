/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 */
package net.minecraft.entity.monster;

import com.google.common.base.Predicate;
import net.minecraft.entity.ai.ag;
import net.minecraft.entity.j;
import net.minecraft.entity.monster.y;
import net.minecraft.entity.r;

class x<T extends r>
extends ag<T> {
    public x(j j2, Class<T> clazz, int n2, boolean bl2, boolean bl3, Predicate<? super T> predicate) {
        super(j2, clazz, n2, bl2, bl3, predicate);
        this.cyW = new y(this, predicate, j2);
    }

    static /* synthetic */ double a(x x2) {
        return x2.WV();
    }

    static /* synthetic */ boolean a(x x2, r r2, boolean bl2) {
        return x2.a(r2, bl2);
    }
}

