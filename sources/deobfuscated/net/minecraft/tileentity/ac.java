/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.tileentity;

import net.minecraft.init.Blocks;
import net.minecraft.tileentity.ab;
import net.minecraft.tileentity.b;
import net.minecraft.tileentity.c;
import net.minecraft.world.w;

class ac
extends b {
    final /* synthetic */ ab dtm;

    ac(ab ab2) {
        this.dtm = ab2;
    }

    @Override
    public void eQ(int n2) {
        this.dtm.baU.c(this.dtm.aZf, Blocks.cMe, n2, 0);
    }

    @Override
    public w Xj() {
        return this.dtm.baU;
    }

    @Override
    public net.minecraft.util.b Xk() {
        return this.dtm.aZf;
    }

    @Override
    public void a(c c2) {
        super.a(c2);
        if (this.Xj() != null) {
            this.Xj().P(this.dtm.aZf);
        }
    }
}

