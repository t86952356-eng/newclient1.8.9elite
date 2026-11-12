/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.model;

import net.minecraft.client.model.ag;
import net.minecraft.client.model.d;
import net.minecraft.entity.c;

public class an
extends d {
    ag bCm;
    ag bCn;
    ag bCo;
    ag bCp;

    public an(int n2) {
        this.bCm = new ag(this, 0, n2);
        this.bCm.a(-4.0f, 16.0f, -4.0f, 8, 8, 8);
        if (n2 > 0) {
            this.bCm = new ag(this, 0, n2);
            this.bCm.a(-3.0f, 17.0f, -3.0f, 6, 6, 6);
            this.bCn = new ag(this, 32, 0);
            this.bCn.a(-3.25f, 18.0f, -3.5f, 2, 2, 2);
            this.bCo = new ag(this, 32, 4);
            this.bCo.a(1.25f, 18.0f, -3.5f, 2, 2, 2);
            this.bCp = new ag(this, 32, 8);
            this.bCp.a(0.0f, 21.0f, -3.5f, 1, 1, 1);
        }
    }

    @Override
    public void a(c c2, float f2, float f3, float f4, float f5, float f6, float f7) {
        this.a(f2, f3, f4, f5, f6, f7, c2);
        this.bCm.aa(f7);
        if (this.bCn != null) {
            this.bCn.aa(f7);
            this.bCo.aa(f7);
            this.bCp.aa(f7);
        }
    }
}

