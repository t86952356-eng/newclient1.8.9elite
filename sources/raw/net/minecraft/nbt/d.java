/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
package net.minecraft.nbt;

import com.google.common.collect.Lists;
import java.util.List;
import net.minecraft.nbt.c;
import net.minecraft.nbt.g;
import net.minecraft.nbt.n;

class d
extends c {
    protected List<c> cXN = Lists.newArrayList();

    public d(String string) {
        this.cXM = string;
    }

    @Override
    public g aeE() {
        n n2 = new n();
        for (c c2 : this.cXN) {
            n2.b(c2.cXM, c2.aeE());
        }
        return n2;
    }
}

