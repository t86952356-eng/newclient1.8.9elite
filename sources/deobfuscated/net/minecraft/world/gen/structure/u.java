/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.world.gen.structure;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Random;
import net.minecraft.util.bt;
import net.minecraft.world.biome.j;
import net.minecraft.world.gen.structure.cb;
import net.minecraft.world.gen.structure.o;
import net.minecraft.world.gen.structure.v;

public class u
extends o {
    public static final List<j> dQw = Arrays.asList(j.dGg, j.dGh, j.dGO);
    private int dQx;
    private int dQy = 32;
    private final int dQz;

    public u() {
        this.dQz = 8;
    }

    public u(Map<String, String> map) {
        this();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (entry.getKey().equals("size")) {
                this.dQx = bt.j(entry.getValue(), this.dQx, 0);
                continue;
            }
            if (!entry.getKey().equals("distance")) continue;
            this.dQy = bt.j(entry.getValue(), this.dQy, this.dQz + 1);
        }
    }

    @Override
    public String ayE() {
        return "Village";
    }

    @Override
    protected boolean bk(int n2, int n3) {
        int n4 = n2;
        int n5 = n3;
        if (n2 < 0) {
            n2 -= this.dQy - 1;
        }
        if (n3 < 0) {
            n3 -= this.dQy - 1;
        }
        int n6 = n2 / this.dQy;
        int n7 = n3 / this.dQy;
        Random random = this.baU.K(n6, n7, 10387312);
        n6 *= this.dQy;
        n7 *= this.dQy;
        if (n4 == (n6 += random.nextInt(this.dQy - this.dQz)) && n5 == (n7 += random.nextInt(this.dQy - this.dQz))) {
            boolean bl2 = this.baU.avp().a(n4 * 16 + 8, n5 * 16 + 8, 0, dQw);
            return bl2;
        }
        return false;
    }

    @Override
    protected cb bl(int n2, int n3) {
        return new v(this.baU, this.ta, n2, n3, this.dQx);
    }
}

