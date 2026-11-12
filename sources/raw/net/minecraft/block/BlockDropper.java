/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.block;

import net.minecraft.block.BlockDispenser;
import net.minecraft.block.BlockSourceImpl;
import net.minecraft.dispenser.a;
import net.minecraft.dispenser.c;
import net.minecraft.inventory.ab;
import net.minecraft.item.co;
import net.minecraft.tileentity.d;
import net.minecraft.tileentity.s;
import net.minecraft.tileentity.t;
import net.minecraft.tileentity.z;
import net.minecraft.util.ao;
import net.minecraft.util.b;
import net.minecraft.world.w;

public class BlockDropper
extends BlockDispenser {
    private final c aUs = new a();

    @Override
    protected c D(co co2) {
        return this.aUs;
    }

    @Override
    public d a(w w2, int n2) {
        return new t();
    }

    @Override
    protected void x(w w2, b b2) {
        BlockSourceImpl blockSourceImpl = new BlockSourceImpl(w2, b2);
        s s2 = (s)blockSourceImpl.zh();
        if (s2 != null) {
            int n2 = s2.aqw();
            if (n2 < 0) {
                w2.e(1001, b2, 0);
            } else {
                co co2 = s2.fi(n2);
                if (co2 != null) {
                    co co3;
                    ao ao2 = w2.L(b2).b(aTN);
                    b b3 = b2.x(ao2);
                    ab ab2 = z.b(w2, b3.wt(), (double)b3.wu(), b3.wx());
                    if (ab2 == null) {
                        co3 = this.aUs.a(blockSourceImpl, co2);
                        if (co3 != null && co3.cWZ <= 0) {
                            co3 = null;
                        }
                    } else {
                        co3 = z.a(ab2, co2.aeg().ge(1), ao2.asC());
                        if (co3 == null) {
                            co3 = co2.aeg();
                            if (--co3.cWZ <= 0) {
                                co3 = null;
                            }
                        } else {
                            co3 = co2.aeg();
                        }
                    }
                    s2.g(n2, co3);
                }
            }
        }
    }
}

