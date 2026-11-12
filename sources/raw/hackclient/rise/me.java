/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.akq;
import hackclient.rise.dk;
import hackclient.rise.dm;
import hackclient.rise.ei;
import hackclient.rise.gi;
import hackclient.rise.gj;
import hackclient.rise.gl;
import java.util.HashMap;
import net.minecraft.potion.d;
import rip.vantage.commons.util.time.a;

@gl(aliases={"module.movement.potionextender.name"}, description="module.movement.potionextender.description", category=gj.MOVEMENT)
public class me
extends gi {
    private final akq DT = new akq("Extend Duration", this, (Number)10, (Number)1, (Number)60, (Number)1);
    public final HashMap<d, a> DU = new HashMap();
    @dm
    public final dk<ei> DV = ei2 -> {
        for (d d2 : me.aER.bgK.VL()) {
            a a2;
            if (this.DU.containsKey(d2)) {
                a2 = this.DU.get(d2);
                if (!a2.T(((Number)this.DT.wD()).longValue() * 1000L)) continue;
                me.aER.bgK.eL(d2.aje());
                this.DU.remove(d2);
                continue;
            }
            if (d2.cGO != 1) continue;
            a2 = new a();
            a2.aX();
            this.DU.put(d2, a2);
        }
    };
}

