/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.entity.monster;

import net.minecraft.entity.ab;
import net.minecraft.entity.aj;
import net.minecraft.entity.monster.ap;
import net.minecraft.entity.r;
import net.minecraft.potion.a;
import net.minecraft.potion.d;
import net.minecraft.world.e;
import net.minecraft.world.f;
import net.minecraft.world.w;

public class c
extends ap {
    public c(w w2) {
        super(w2);
        this.o(0.7f, 0.5f);
    }

    @Override
    protected void UQ() {
        super.UQ();
        this.a(aj.cwm).ap(12.0);
    }

    @Override
    public boolean ag(net.minecraft.entity.c c2) {
        if (super.ag(c2)) {
            if (c2 instanceof r) {
                int n2 = 0;
                if (this.baU.agm() == f.dBT) {
                    n2 = 7;
                } else if (this.baU.agm() == f.dBU) {
                    n2 = 15;
                }
                if (n2 > 0) {
                    ((r)c2).b(new d(a.dgO.dhb, n2 * 20, 0));
                }
            }
            return true;
        }
        return false;
    }

    @Override
    public ab a(e e2, ab ab2) {
        return ab2;
    }

    @Override
    public float getEyeHeight() {
        return 0.45f;
    }
}

