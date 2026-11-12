/*
 * Decompiled with CFR 0.152.
 */
package net.optifine;

import net.minecraft.src.a;
import net.minecraft.tileentity.d;
import net.minecraft.util.b;
import net.minecraft.world.biome.j;
import net.optifine.at;
import net.optifine.util.an;

public class bh
implements at {
    private d bfG;

    @Override
    public int getId() {
        return a.d(this.bfG.Ab(), this.bfG.zg());
    }

    @Override
    public b aBt() {
        return this.bfG.Ab();
    }

    @Override
    public String getName() {
        String string = an.l(this.bfG);
        return string;
    }

    @Override
    public j aBu() {
        return this.bfG.de().aF(this.bfG.Ab());
    }

    @Override
    public int aBv() {
        return -1;
    }

    @Override
    public int aBw() {
        return -1;
    }

    public d Aa() {
        return this.bfG;
    }

    public void h(d d2) {
        this.bfG = d2;
    }
}

