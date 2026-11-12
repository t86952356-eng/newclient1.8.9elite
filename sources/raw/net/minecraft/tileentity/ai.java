/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.tileentity;

import net.minecraft.command.ad;
import net.minecraft.command.aw;
import net.minecraft.entity.c;
import net.minecraft.entity.player.a;
import net.minecraft.tileentity.ag;
import net.minecraft.util.b;
import net.minecraft.util.ba;
import net.minecraft.util.da;
import net.minecraft.world.w;

class ai
implements aw {
    final /* synthetic */ a dtC;
    final /* synthetic */ ag dtD;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    ai(ag ag2, a a2) {
        this.dtD = ag2;
        this.dtC = a2;
    }

    @Override
    public String xU() {
        return this.dtC.xU();
    }

    @Override
    public ba xW() {
        return this.dtC.xW();
    }

    @Override
    public void a(ba ba2) {
    }

    @Override
    public boolean c(int n2, String string) {
        return n2 <= 2;
    }

    @Override
    public b yl() {
        return this.dtD.aZf;
    }

    @Override
    public da Sd() {
        return new da((double)this.dtD.aZf.wt() + 0.5, (double)this.dtD.aZf.wu() + 0.5, (double)this.dtD.aZf.wx() + 0.5);
    }

    @Override
    public w Se() {
        return this.dtC.Se();
    }

    @Override
    public c Sf() {
        return this.dtC;
    }

    @Override
    public boolean Sg() {
        return false;
    }

    @Override
    public void a(ad ad2, int n2) {
        this.dtD.dtA.a(this, ad2, n2);
    }
}

