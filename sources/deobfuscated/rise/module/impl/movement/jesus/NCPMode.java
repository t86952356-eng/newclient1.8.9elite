/*
 * Decompiled with CFR 0.152.
 */
package rise.module.impl.movement.jesus;

import hackclient.rise.aik;
import hackclient.rise.es;
import net.minecraft.block.BlockLiquid;
import net.minecraft.util.a;
import rise.event.EventLink;
import rise.event.Listener;
import rise.event.impl.PreMotionEvent;
import rise.module.Mode;
import rise.module.impl.movement.Jesus;

public class NCPMode
extends Mode<Jesus> {
    @EventLink
    public final Listener<es> KE = es2 -> {
        if (es2.df() instanceof BlockLiquid && !NCPMode.aER.aIY.chr.Re()) {
            int n2 = es2.dg().wt();
            int n3 = es2.dg().wu();
            int n4 = es2.dg().wx();
            es2.a(a.h(n2, n3, n4, n2 + 1, n3 + 1, n4 + 1));
        }
    };
    @EventLink
    public final Listener<PreMotionEvent> KF = preMotionEvent -> {
        if (NCPMode.aER.bgK.aRg % 2 == 0 && aik.vA()) {
            preMotionEvent.setPosY(preMotionEvent.getPosY() - 0.015625);
        }
    };

    public NCPMode(String string, Jesus jesus) {
        super(string, jesus);
    }
}

