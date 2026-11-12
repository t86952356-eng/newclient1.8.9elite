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
import net.minecraft.world.biome.aj;
import net.minecraft.world.biome.j;
import net.minecraft.world.gen.structure.di;
import net.minecraft.world.gen.structure.dn;
import net.minecraft.world.gen.structure.y;

public class dk
extends dn {
    public aj dSL;
    public boolean dSM;
    public int dQx;
    public di dSN;
    public List<di> dSO;
    public List<y> dSP = Lists.newArrayList();
    public List<y> dSQ = Lists.newArrayList();

    public dk() {
    }

    public dk(aj aj2, int n2, Random random, int n3, int n4, List<di> list, int n5) {
        super(null, 0, random, n3, n4);
        this.dSL = aj2;
        this.dSO = list;
        this.dQx = n5;
        j j2 = aj2.b(new b(n3, 0, n4), j.dGT);
        this.dSM = j2 == j.dGh || j2 == j.dGw;
        this.cE(this.dSM);
    }

    public aj avp() {
        return this.dSL;
    }
}

