/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
package net.minecraft.world.gen.structure;

import com.google.common.collect.Lists;
import java.util.List;
import java.util.Random;
import net.minecraft.util.b;
import net.minecraft.world.gen.structure.cl;
import net.minecraft.world.gen.structure.cm;
import net.minecraft.world.gen.structure.cq;
import net.minecraft.world.gen.structure.y;

public class cr
extends cq {
    public cl dSo;
    public cm dSp;
    public List<y> dSq = Lists.newArrayList();

    public cr() {
    }

    public cr(int n2, Random random, int n3, int n4) {
        super(0, random, n3, n4);
    }

    @Override
    public b ayT() {
        return this.dSp != null ? this.dSp.ayT() : super.ayT();
    }
}

