/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.akq;
import hackclient.rise.bu;
import hackclient.rise.dk;
import hackclient.rise.dm;
import hackclient.rise.ei;
import hackclient.rise.gi;
import hackclient.rise.gj;
import hackclient.rise.gl;
import net.minecraft.item.af;

@gl(aliases={"module.ghost.fastplace.name"}, description="module.ghost.fastplace.description", category=gj.GHOST)
public class la
extends gi {
    private final akq Bf = new akq("Delay", this, (Number)0, (Number)0, (Number)3, (Number)1);
    @dm
    public final dk<ei> Bg = ei2 -> {
        this.d(bu.class);
        if (bu.bO() != null) {
            this.d(bu.class);
            if (bu.bO().bP() instanceof af) {
                la.aER.bhl = Math.min(la.aER.bhl, ((Number)this.Bf.wD()).intValue());
            }
        }
    };
}

