/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
package net.minecraft.world.gen.structure;

import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Random;
import net.minecraft.util.bt;
import net.minecraft.world.b;
import net.minecraft.world.biome.j;
import net.minecraft.world.gen.structure.cb;
import net.minecraft.world.gen.structure.cr;
import net.minecraft.world.gen.structure.n;
import net.minecraft.world.gen.structure.o;

public class m
extends o {
    private final List<j> dQe;
    private boolean dQf;
    private b[] dQg = new b[3];
    private double dQh = 32.0;
    private int dQi = 3;

    public m() {
        this.dQe = Lists.newArrayList();
        for (j j2 : j.axg()) {
            if (j2 == null || !(j2.dHc > 0.0f)) continue;
            this.dQe.add(j2);
        }
    }

    public m(Map<String, String> map) {
        this();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (entry.getKey().equals("distance")) {
                this.dQh = bt.c(entry.getValue(), this.dQh, 1.0);
                continue;
            }
            if (entry.getKey().equals("count")) {
                this.dQg = new b[bt.j(entry.getValue(), this.dQg.length, 1)];
                continue;
            }
            if (!entry.getKey().equals("spread")) continue;
            this.dQi = bt.j(entry.getValue(), this.dQi, 1);
        }
    }

    @Override
    public String ayE() {
        return "Stronghold";
    }

    @Override
    protected boolean bk(int n2, int n3) {
        if (!this.dQf) {
            Random random = new Random();
            random.setSeed(this.baU.avD());
            double d2 = random.nextDouble() * Math.PI * 2.0;
            int n4 = 1;
            for (int i2 = 0; i2 < this.dQg.length; ++i2) {
                double d3 = (1.25 * (double)n4 + random.nextDouble()) * this.dQh * (double)n4;
                int n5 = (int)Math.round(Math.cos(d2) * d3);
                int n6 = (int)Math.round(Math.sin(d2) * d3);
                net.minecraft.util.b b2 = this.baU.avp().a((n5 << 4) + 8, (n6 << 4) + 8, 112, this.dQe, random);
                if (b2 != null) {
                    n5 = b2.wt() >> 4;
                    n6 = b2.wx() >> 4;
                }
                this.dQg[i2] = new b(n5, n6);
                d2 += Math.PI * 2 * (double)n4 / (double)this.dQi;
                if (i2 != this.dQi) continue;
                n4 += 2 + random.nextInt(5);
                this.dQi += 1 + random.nextInt(2);
            }
            this.dQf = true;
        }
        for (b b3 : this.dQg) {
            if (n2 != b3.dBK || n3 != b3.dBL) continue;
            return true;
        }
        return false;
    }

    @Override
    protected List<net.minecraft.util.b> ayH() {
        ArrayList arrayList = Lists.newArrayList();
        for (b b2 : this.dQg) {
            if (b2 == null) continue;
            arrayList.add(b2.ia(64));
        }
        return arrayList;
    }

    @Override
    protected cb bl(int n2, int n3) {
        n n4 = new n(this.baU, this.ta, n2, n3);
        while (n4.azc().isEmpty() || ((cr)n4.azc().get((int)0)).dSp == null) {
            n4 = new n(this.baU, this.ta, n2, n3);
        }
        return n4;
    }
}

