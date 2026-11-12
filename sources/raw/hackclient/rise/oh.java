/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.aik;
import hackclient.rise.akg;
import hackclient.rise.dk;
import hackclient.rise.dm;
import hackclient.rise.ei;
import hackclient.rise.es;
import hackclient.rise.ly;
import net.minecraft.block.BlockLiquid;
import net.minecraft.util.a;

public class oh
extends akg<ly> {
    @dm
    public final dk<es> KE = es2 -> {
        if (es2.df() instanceof BlockLiquid && !oh.aER.aIY.chr.Re()) {
            int n2 = es2.dg().wt();
            int n3 = es2.dg().wu();
            int n4 = es2.dg().wx();
            es2.a(a.h(n2, n3, n4, n2 + 1, n3 + 1, n4 + 1));
        }
    };
    @dm
    public final dk<ei> KF = ei2 -> {
        if (oh.aER.bgK.aRg % 2 == 0 && aik.vA()) {
            ei2.setPosY(ei2.getPosY() - 0.015625);
        }
    };

    public oh(String string, ly ly2) {
        super(string, ly2);
    }
}

