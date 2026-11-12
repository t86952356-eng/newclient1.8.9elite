/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.model;

import net.minecraft.client.model.ag;
import net.minecraft.client.model.am;
import net.minecraft.entity.c;

public class v
extends am {
    private final ag bAG = new ag(this, 32, 0);

    public v() {
        super(0, 0, 64, 64);
        this.bAG.a(-4.0f, -8.0f, -4.0f, 8, 8, 8, 0.25f);
        this.bAG.g(0.0f, 0.0f, 0.0f);
    }

    @Override
    public void a(c c2, float f2, float f3, float f4, float f5, float f6, float f7) {
        super.a(c2, f2, f3, f4, f5, f6, f7);
        this.bAG.aa(f7);
    }

    @Override
    public void a(float f2, float f3, float f4, float f5, float f6, float f7, c c2) {
        super.a(f2, f3, f4, f5, f6, f7, c2);
        this.bAG.bBG = this.bCl.bBG;
        this.bAG.bBF = this.bCl.bBF;
    }
}

