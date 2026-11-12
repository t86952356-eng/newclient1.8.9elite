/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.gui.spectator;

import net.minecraft.client.d;
import net.minecraft.client.gui.b;
import net.minecraft.client.gui.cp;
import net.minecraft.client.gui.spectator.f;
import net.minecraft.util.ba;
import net.minecraft.util.s;

class i
implements net.minecraft.client.gui.spectator.b {
    private final int bxz;
    private final boolean bxA;

    public i(int n2, boolean bl2) {
        this.bxz = n2;
        this.bxA = bl2;
    }

    @Override
    public void b(f f2) {
        f2.bxy = this.bxz;
    }

    @Override
    public ba GP() {
        return this.bxz < 0 ? new s("Previous Page") : new s("Next Page");
    }

    @Override
    public void a(float f2, int n2) {
        d.AZ().Bq().a(cp.bti);
        if (this.bxz < 0) {
            b.drawModalRectWithCustomSizedTexture(0.0f, 0.0f, 144.0f, 0.0f, 16.0f, 16.0f, 256.0f, 256.0f);
        } else {
            b.drawModalRectWithCustomSizedTexture(0.0f, 0.0f, 160.0f, 0.0f, 16.0f, 16.0f, 256.0f, 256.0f);
        }
    }

    @Override
    public boolean GQ() {
        return this.bxA;
    }
}

