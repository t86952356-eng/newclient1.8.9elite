/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.akg;
import hackclient.rise.dk;
import hackclient.rise.dm;
import hackclient.rise.es;
import hackclient.rise.lw;
import net.minecraft.block.BlockAir;
import net.minecraft.util.a;

public final class ms
extends akg<lw> {
    @dm
    public final dk<es> Fp = es2 -> {
        if (es2.df() instanceof BlockAir && !ms.aER.bgK.isSneaking() && ms.aER.bgK.Zz > 2) {
            double d2 = es2.dg().wt();
            double d3 = es2.dg().wu();
            double d4 = es2.dg().wx();
            if (d3 < ms.aER.bgK.gX) {
                es2.a(a.h(-15.0, -1.0, -15.0, 15.0, 1.0, 15.0).ae(d2, d3, d4));
            }
        }
    };

    public ms(String string, lw lw2) {
        super(string, lw2);
    }
}

