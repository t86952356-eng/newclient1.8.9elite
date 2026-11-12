/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.tileentity;

import net.minecraft.command.ab;
import net.minecraft.command.server.e;
import net.minecraft.nbt.n;
import net.minecraft.network.aj;
import net.minecraft.network.play.server.bf;
import net.minecraft.tileentity.d;
import net.minecraft.tileentity.p;

public class o
extends d {
    private final e dsI = new p(this);

    @Override
    public void b(n n2) {
        super.b(n2);
        this.dsI.h(n2);
    }

    @Override
    public void a(n n2) {
        super.a(n2);
        this.dsI.i(n2);
    }

    @Override
    public aj apQ() {
        n n2 = new n();
        this.b(n2);
        return new bf(this.aZf, 2, n2);
    }

    @Override
    public boolean apV() {
        return true;
    }

    public e Wo() {
        return this.dsI;
    }

    public ab SC() {
        return this.dsI.SC();
    }
}

