/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.akg;
import hackclient.rise.dk;
import hackclient.rise.dm;
import hackclient.rise.es;
import hackclient.rise.ly;
import net.minecraft.block.BlockLiquid;
import net.minecraft.util.a;

public class oi
extends akg<ly> {
    @dm
    public final dk<es> KG = es2 -> {
        if (es2.df() instanceof BlockLiquid && !oi.aER.aIY.chr.Re()) {
            int n2 = es2.dg().wt();
            int n3 = es2.dg().wu();
            int n4 = es2.dg().wx();
            es2.a(a.h(n2, n3, n4, n2 + 1, n3 + 1, n4 + 1));
        }
    };

    public oi(String string, ly ly2) {
        super(string, ly2);
    }
}

