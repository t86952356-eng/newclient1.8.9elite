/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.akg;
import hackclient.rise.dk;
import hackclient.rise.dm;
import hackclient.rise.ej;
import hackclient.rise.gi;
import hackclient.rise.gj;
import hackclient.rise.gl;
import hackclient.rise.tn;

@gl(aliases={"module.movement.nojumpdelay.name"}, description="module.movement.nojumpdelay.description", category=gj.MOVEMENT)
public class mb
extends gi {
    @dm
    public final dk<ej> DM = ej2 -> {
        tn tn2 = this.e(tn.class);
        if (tn2.isEnabled() && ((akg)tn2.ags.wD()).getName().equals("Telly") && mb.aER.aIY.chq.Re() && tn2.kw()) {
            return;
        }
        mb.aER.bgK.cvk = 0;
    };
}

