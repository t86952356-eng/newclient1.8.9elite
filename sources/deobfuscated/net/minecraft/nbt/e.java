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
import net.minecraft.nbt.v;

class e
extends c {
    protected List<c> cXO = Lists.newArrayList();

    public e(String string) {
        this.cXM = string;
    }

    @Override
    public g aeE() {
        v v2 = new v();
        for (c c2 : this.cXO) {
            v2.a(c2.aeE());
        }
        return v2;
    }
}

