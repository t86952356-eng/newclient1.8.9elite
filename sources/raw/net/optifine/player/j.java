/*
 * Decompiled with CFR 0.152.
 */
package net.optifine.player;

import net.minecraft.client.model.ag;
import net.minecraft.client.model.f;
import net.optifine.player.h;

public class j {
    private int ena = 0;
    private ag egk = null;

    public j(int n2, ag ag2) {
        this.ena = n2;
        this.egk = ag2;
    }

    public ag aCj() {
        return this.egk;
    }

    public void a(f f2, float f3) {
        ag ag2 = h.b(f2, this.ena);
        if (ag2 != null) {
            ag2.ac(f3);
        }
        this.egk.aa(f3);
    }
}

