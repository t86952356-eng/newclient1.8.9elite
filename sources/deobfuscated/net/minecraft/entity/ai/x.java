/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.entity.ai;

import net.minecraft.entity.ai.be;
import net.minecraft.entity.passive.z;
import net.minecraft.entity.player.a;

public class x
extends be {
    private final z cyl;

    public x(z z2) {
        super(z2, a.class, 8.0f);
        this.cyl = z2;
    }

    @Override
    public boolean WC() {
        if (this.cyl.abt()) {
            this.cAj = this.cyl.WB();
            return true;
        }
        return false;
    }
}

