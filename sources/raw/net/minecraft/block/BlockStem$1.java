/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 */
package net.minecraft.block;

import com.google.common.base.Predicate;
import net.minecraft.util.ao;

class BlockStem$1
implements Predicate<ao> {
    BlockStem$1() {
    }

    public boolean b(ao ao2) {
        return ao2 != ao.dwq;
    }

    public /* synthetic */ boolean apply(Object object) {
        return this.b((ao)object);
    }
}

