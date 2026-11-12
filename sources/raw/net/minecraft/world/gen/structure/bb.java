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
import net.minecraft.entity.monster.r;
import net.minecraft.util.b;
import net.minecraft.util.bt;
import net.minecraft.world.biome.j;
import net.minecraft.world.biome.m;
import net.minecraft.world.gen.structure.bc;
import net.minecraft.world.gen.structure.cb;
import net.minecraft.world.gen.structure.o;

public class bb
extends o {
    private int dRn = 32;
    private int dRo = 5;
    public static final List<j> dRp = Arrays.asList(j.dGf, j.dGD, j.dGm, j.dGp, j.dGq);
    private static final List<m> dRq = Lists.newArrayList();

    public bb() {
    }

    public bb(Map<String, String> map) {
        this();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (entry.getKey().equals("spacing")) {
                this.dRn = bt.j(entry.getValue(), this.dRn, 1);
                continue;
            }
            if (!entry.getKey().equals("separation")) continue;
            this.dRo = bt.j(entry.getValue(), this.dRo, 1);
        }
    }

    @Override
    public String ayE() {
        return "Monument";
    }

    @Override
    protected boolean bk(int n2, int n3) {
        int n4 = n2;
        int n5 = n3;
        if (n2 < 0) {
            n2 -= this.dRn - 1;
        }
        if (n3 < 0) {
            n3 -= this.dRn - 1;
        }
        int n6 = n2 / this.dRn;
        int n7 = n3 / this.dRn;
        Random random = this.baU.K(n6, n7, 10387313);
        n6 *= this.dRn;
        n7 *= this.dRn;
        if (n4 == (n6 += (random.nextInt(this.dRn - this.dRo) + random.nextInt(this.dRn - this.dRo)) / 2) && n5 == (n7 += (random.nextInt(this.dRn - this.dRo) + random.nextInt(this.dRn - this.dRo)) / 2)) {
            if (this.baU.avp().b(new b(n4 * 16 + 8, 64, n5 * 16 + 8), null) != j.dGD) {
                return false;
            }
            boolean bl2 = this.baU.avp().a(n4 * 16 + 8, n5 * 16 + 8, 29, dRp);
            return bl2;
        }
        return false;
    }

    @Override
    protected cb bl(int n2, int n3) {
        return new bc(this.baU, this.ta, n2, n3);
    }

    public List<m> ayX() {
        return dRq;
    }

    static {
        dRq.add(new m(r.class, 1, 2, 4));
    }
}

