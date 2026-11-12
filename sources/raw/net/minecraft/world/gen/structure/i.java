/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
package net.minecraft.world.gen.structure;

import com.google.common.collect.Lists;
import java.util.List;
import net.minecraft.entity.monster.a;
import net.minecraft.entity.monster.ab;
import net.minecraft.entity.monster.ah;
import net.minecraft.entity.monster.z;
import net.minecraft.world.biome.m;
import net.minecraft.world.gen.structure.cb;
import net.minecraft.world.gen.structure.j;
import net.minecraft.world.gen.structure.o;

public class i
extends o {
    private final List<m> dPZ = Lists.newArrayList();

    public i() {
        this.dPZ.add(new m(a.class, 10, 2, 3));
        this.dPZ.add(new m(ab.class, 5, 4, 4));
        this.dPZ.add(new m(ah.class, 10, 4, 4));
        this.dPZ.add(new m(z.class, 3, 4, 4));
    }

    @Override
    public String ayE() {
        return "Fortress";
    }

    public List<m> ayF() {
        return this.dPZ;
    }

    @Override
    protected boolean bk(int n2, int n3) {
        int n4 = n2 >> 4;
        int n5 = n3 >> 4;
        this.ta.setSeed((long)(n4 ^ n5 << 4) ^ this.baU.avD());
        this.ta.nextInt();
        return this.ta.nextInt(3) == 0 && n2 == (n4 << 4) + 4 + this.ta.nextInt(8) && n3 == (n5 << 4) + 4 + this.ta.nextInt(8);
    }

    @Override
    protected cb bl(int n2, int n3) {
        return new j(this.baU, this.ta, n2, n3);
    }
}

