/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.aki;
import hackclient.rise.bu;
import hackclient.rise.dk;
import hackclient.rise.dm;
import hackclient.rise.ej;
import hackclient.rise.gi;
import hackclient.rise.gj;
import hackclient.rise.gl;
import net.minecraft.item.af;

@gl(aliases={"module.ghost.safewalk.name"}, description="module.ghost.safewalk.description", category=gj.GHOST)
public class lj
extends gi {
    private final aki Ca = new aki("Blocks Only", (gi)this, (Boolean)false);
    private final aki Cb = new aki("Backwards Only", (gi)this, (Boolean)false);
    @dm
    public final dk<ej> Cc = this::b;

    /*
     * Unable to fully structure code
     */
    private /* synthetic */ void b(ej var1_1) {
        block2: {
            v0 = lj.aER.bgK;
            if (!lj.aER.bgK.aO || lj.aER.aIY.chm.Re() && ((Boolean)this.Cb.wD()).booleanValue()) ** GOTO lbl-1000
            this.d(bu.class);
            if (bu.bO() == null) break block2;
            this.d(bu.class);
            if (bu.bO().bP() instanceof af) ** GOTO lbl-1000
        }
        if (!((Boolean)this.Ca.wD()).booleanValue()) lbl-1000:
        // 2 sources

        {
            v1 = true;
        } else lbl-1000:
        // 2 sources

        {
            v1 = false;
        }
        v0.crP = v1;
    }
}

