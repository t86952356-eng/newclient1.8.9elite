/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
package net.minecraft.world.gen.structure;

import com.google.common.collect.Lists;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Random;
import net.minecraft.entity.monster.at;
import net.minecraft.util.b;
import net.minecraft.util.bt;
import net.minecraft.world.biome.j;
import net.minecraft.world.biome.m;
import net.minecraft.world.gen.structure.cb;
import net.minecraft.world.gen.structure.g;
import net.minecraft.world.gen.structure.l;
import net.minecraft.world.gen.structure.o;
import net.minecraft.world.gen.structure.y;

public class k
extends o {
    private static final List<j> dQa = Arrays.asList(j.dGh, j.dGw, j.dGA, j.dGB, j.dGl);
    private final List<m> dQb = Lists.newArrayList();
    private int dQc = 32;
    private final int dQd;

    public k() {
        this.dQd = 8;
        this.dQb.add(new m(at.class, 1, 1, 1));
    }

    public k(Map<String, String> map) {
        this();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (!entry.getKey().equals("distance")) continue;
            this.dQc = bt.j(entry.getValue(), this.dQc, this.dQd + 1);
        }
    }

    @Override
    public String ayE() {
        return "Temple";
    }

    @Override
    protected boolean bk(int n2, int n3) {
        int n4 = n2;
        int n5 = n3;
        if (n2 < 0) {
            n2 -= this.dQc - 1;
        }
        if (n3 < 0) {
            n3 -= this.dQc - 1;
        }
        int n6 = n2 / this.dQc;
        int n7 = n3 / this.dQc;
        Random random = this.baU.K(n6, n7, 14357617);
        n6 *= this.dQc;
        n7 *= this.dQc;
        if (n4 == (n6 += random.nextInt(this.dQc - this.dQd)) && n5 == (n7 += random.nextInt(this.dQc - this.dQd))) {
            j j2 = this.baU.avp().bl(new b(n4 * 16 + 8, 0, n5 * 16 + 8));
            if (j2 == null) {
                return false;
            }
            for (j j3 : dQa) {
                if (j2 != j3) continue;
                return true;
            }
        }
        return false;
    }

    @Override
    protected cb bl(int n2, int n3) {
        return new l(this.baU, this.ta, n2, n3);
    }

    public boolean bu(b b2) {
        cb cb2 = this.bw(b2);
        if (cb2 != null && cb2 instanceof l && !cb2.dRQ.isEmpty()) {
            y y2 = cb2.dRQ.getFirst();
            return y2 instanceof g;
        }
        return false;
    }

    public List<m> ayG() {
        return this.dQb;
    }
}

