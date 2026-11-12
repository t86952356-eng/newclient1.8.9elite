/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.model;

import net.minecraft.client.model.ag;
import net.minecraft.client.model.av;
import net.minecraft.entity.c;
import net.minecraft.entity.monster.ah;
import net.minecraft.entity.r;

public class al
extends av {
    public al() {
        this(0.0f, false);
    }

    public al(float f2, boolean bl2) {
        super(f2, 0.0f, 64, 32);
        if (!bl2) {
            this.byD = new ag(this, 40, 16);
            this.byD.a(-1.0f, -2.0f, -1.0f, 2, 12, 2, f2);
            this.byD.g(-5.0f, 2.0f, 0.0f);
            this.byE = new ag(this, 40, 16);
            this.byE.bBK = true;
            this.byE.a(-1.0f, -2.0f, -1.0f, 2, 12, 2, f2);
            this.byE.g(5.0f, 2.0f, 0.0f);
            this.byF = new ag(this, 0, 16);
            this.byF.a(-1.0f, 0.0f, -1.0f, 2, 12, 2, f2);
            this.byF.g(-2.0f, 12.0f, 0.0f);
            this.byG = new ag(this, 0, 16);
            this.byG.bBK = true;
            this.byG.a(-1.0f, 0.0f, -1.0f, 2, 12, 2, f2);
            this.byG.g(2.0f, 12.0f, 0.0f);
        }
    }

    @Override
    public void a(r r2, float f2, float f3, float f4) {
        this.byJ = ((ah)r2).ZI() == 1;
        super.a(r2, f2, f3, f4);
    }

    @Override
    public void a(float f2, float f3, float f4, float f5, float f6, float f7, c c2) {
        super.a(f2, f3, f4, f5, f6, f7, c2);
    }
}

