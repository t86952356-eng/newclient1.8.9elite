/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.world;

import net.minecraft.server.MinecraftServer;
import net.minecraft.village.e;
import net.minecraft.world.ai;
import net.minecraft.world.am;
import net.minecraft.world.storage.a;
import net.minecraft.world.storage.d;
import net.minecraft.world.w;

public class al
extends ai {
    private final ai dEn;

    public al(MinecraftServer minecraftServer, d d2, int n2, ai ai2, net.minecraft.profiler.d d3) {
        super(minecraftServer, d2, new a(ai2.avH()), n2, d3);
        this.dEn = ai2;
        ai2.Sv().a(new am(this));
    }

    @Override
    protected void awr() {
    }

    @Override
    public w avo() {
        this.dDr = this.dEn.avL();
        this.dDv = this.dEn.SD();
        String string = e.a(this.dDl);
        e e2 = (e)this.dDr.e(e.class, string);
        if (e2 == null) {
            this.dDs = new e(this);
            this.dDr.b(string, this.dDs);
        } else {
            this.dDs = e2;
            this.dDs.o(this);
        }
        return this;
    }
}

