/*
 * Decompiled with CFR 0.152.
 */
package net.optifine.player;

import net.minecraft.client.model.f;
import net.minecraft.src.a;
import net.optifine.player.h;

public class d {
    private h[] elW = new h[0];
    private boolean Mq = false;

    public void a(f f2, net.minecraft.client.entity.a a2, float f3, float f4) {
        if (this.Mq) {
            for (int i2 = 0; i2 < this.elW.length; ++i2) {
                h h2 = this.elW[i2];
                h2.b(f2, a2, f3, f4);
            }
        }
    }

    public boolean oy() {
        return this.Mq;
    }

    public void cN(boolean bl2) {
        this.Mq = bl2;
    }

    public h[] aDs() {
        return this.elW;
    }

    public void a(h h2) {
        this.elW = (h[])a.a((Object[])this.elW, (Object)h2);
    }
}

