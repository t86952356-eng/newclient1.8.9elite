/*
 * Decompiled with CFR 0.152.
 */
package rise.module.impl.movement.jesus;

import hackclient.rise.es;
import net.minecraft.block.BlockLiquid;
import net.minecraft.util.a;
import rise.event.EventLink;
import rise.event.Listener;
import rise.module.Mode;
import rise.module.impl.movement.Jesus;

public class VanillaMode
extends Mode<Jesus> {
    @EventLink
    public final Listener<es> KG = es2 -> {
        if (es2.df() instanceof BlockLiquid && !VanillaMode.aER.aIY.chr.Re()) {
            int n2 = es2.dg().wt();
            int n3 = es2.dg().wu();
            int n4 = es2.dg().wx();
            es2.a(a.h(n2, n3, n4, n2 + 1, n3 + 1, n4 + 1));
        }
    };

    public VanillaMode(String string, Jesus jesus) {
        super(string, jesus);
    }
}

