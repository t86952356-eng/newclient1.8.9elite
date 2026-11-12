/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.akg;
import hackclient.rise.dk;
import hackclient.rise.dm;
import hackclient.rise.es;
import hackclient.rise.hf;
import net.minecraft.block.BlockAir;
import net.minecraft.util.a;

public final class ir
extends akg<hf> {
    @dm
    public final dk<es> uB = es2 -> {
        if (((Boolean)((hf)this.wy()).qQ.wD()).booleanValue() && !ir.aER.bgK.cup) {
            return;
        }
        if (es2.df() instanceof BlockAir && ir.aER.bgK.cus > 0 && ir.aER.bgK.ae <= 9) {
            double d2 = es2.dg().wt();
            double d3 = es2.dg().wu();
            double d4 = es2.dg().wx();
            if (d3 == Math.floor(ir.aER.bgK.gX) + 1.0) {
                es2.a(a.h(0.0, 0.0, 0.0, 1.0, 0.0, 1.0).ae(d2, d3, d4));
            }
        }
    };

    public ir(String string, hf hf2) {
        super(string, hf2);
    }
}

