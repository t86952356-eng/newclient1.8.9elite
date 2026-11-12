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
import net.minecraft.nbt.n;
import net.minecraft.world.gen.structure.ai;
import net.minecraft.world.gen.structure.ar;
import net.minecraft.world.gen.structure.aw;
import net.minecraft.world.gen.structure.y;

public class ay
extends ar {
    public aw dRi;
    public List<aw> dRj;
    public List<aw> dRk;
    public List<y> dRl = Lists.newArrayList();

    public ay() {
    }

    public ay(Random random, int n2, int n3) {
        super(random, n2, n3);
        this.dRj = Lists.newArrayList();
        for (aw aw2 : ai.dQW) {
            aw2.dRf = 0;
            this.dRj.add(aw2);
        }
        this.dRk = Lists.newArrayList();
        for (aw aw2 : ai.dQX) {
            aw2.dRf = 0;
            this.dRk.add(aw2);
        }
    }

    @Override
    protected void O(n n2) {
        super.O(n2);
    }

    @Override
    protected void N(n n2) {
        super.N(n2);
    }
}

