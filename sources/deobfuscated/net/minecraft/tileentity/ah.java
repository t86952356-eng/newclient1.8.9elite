/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.tileentity;

import net.minecraft.command.ad;
import net.minecraft.command.aw;
import net.minecraft.entity.c;
import net.minecraft.tileentity.ag;
import net.minecraft.util.b;
import net.minecraft.util.ba;
import net.minecraft.util.da;
import net.minecraft.util.s;
import net.minecraft.world.w;

class ah
implements aw {
    final /* synthetic */ ag dtB;

    ah(ag ag2) {
        this.dtB = ag2;
    }

    @Override
    public String xU() {
        return "Sign";
    }

    @Override
    public ba xW() {
        return new s(this.xU());
    }

    @Override
    public void a(ba ba2) {
    }

    @Override
    public boolean c(int n2, String string) {
        return true;
    }

    @Override
    public b yl() {
        return this.dtB.aZf;
    }

    @Override
    public da Sd() {
        return new da((double)this.dtB.aZf.wt() + 0.5, (double)this.dtB.aZf.wu() + 0.5, (double)this.dtB.aZf.wx() + 0.5);
    }

    @Override
    public w Se() {
        return this.dtB.baU;
    }

    @Override
    public c Sf() {
        return null;
    }

    @Override
    public boolean Sg() {
        return false;
    }

    @Override
    public void a(ad ad2, int n2) {
    }
}

