/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.network.play.client;

import java.util.UUID;
import net.minecraft.entity.c;
import net.minecraft.network.aj;
import net.minecraft.network.ak;
import net.minecraft.network.play.b;
import net.minecraft.world.ai;

public class ac
implements aj<b> {
    private UUID cAC;

    public ac() {
    }

    public ac(UUID uUID) {
        this.cAC = uUID;
    }

    @Override
    public void a(ak ak2) {
        this.cAC = ak2.afy();
    }

    @Override
    public void b(ak ak2) {
        ak2.i(this.cAC);
    }

    @Override
    public void a(b b2) {
        b2.a(this);
    }

    public c a(ai ai2) {
        return ai2.j(this.cAC);
    }
}

