/*
 * Decompiled with CFR 0.152.
 */
package net.optifine;

import java.util.UUID;
import net.minecraft.entity.c;
import net.minecraft.entity.p;
import net.minecraft.util.b;
import net.minecraft.world.biome.j;
import net.optifine.at;

public class be
implements at {
    private c jM;

    @Override
    public int getId() {
        UUID uUID = this.jM.Ul();
        long l2 = uUID.getLeastSignificantBits();
        int n2 = (int)(l2 & Integer.MAX_VALUE);
        return n2;
    }

    @Override
    public b aBt() {
        return this.jM.Tp().crp;
    }

    @Override
    public j aBu() {
        return this.jM.Tp().cro;
    }

    @Override
    public String getName() {
        return this.jM.xV() ? this.jM.Un() : null;
    }

    @Override
    public int aBv() {
        if (!(this.jM instanceof p)) {
            return 0;
        }
        p p2 = (p)this.jM;
        return (int)p2.getHealth();
    }

    @Override
    public int aBw() {
        if (!(this.jM instanceof p)) {
            return 0;
        }
        p p2 = (p)this.jM;
        return (int)p2.getMaxHealth();
    }

    public c dk() {
        return this.jM;
    }

    public void aH(c c2) {
        this.jM = c2;
    }
}

