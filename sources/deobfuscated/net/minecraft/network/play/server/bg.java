/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.network.play.server;

import net.minecraft.network.aj;
import net.minecraft.network.ak;
import net.minecraft.network.play.a;
import net.minecraft.util.b;

public class bg
implements aj<a> {
    private b deu;

    public bg() {
    }

    public bg(b b2) {
        this.deu = b2;
    }

    @Override
    public void a(a a2) {
        a2.a(this);
    }

    @Override
    public void a(ak ak2) {
        this.deu = ak2.afu();
    }

    @Override
    public void b(ak ak2) {
        ak2.ak(this.deu);
    }

    public b ahL() {
        return this.deu;
    }
}

