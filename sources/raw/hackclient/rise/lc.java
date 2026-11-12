/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.aei;
import hackclient.rise.aki;
import hackclient.rise.akq;
import hackclient.rise.bs;
import hackclient.rise.dk;
import hackclient.rise.dm;
import hackclient.rise.ea;
import hackclient.rise.fr;
import hackclient.rise.gi;
import hackclient.rise.gj;
import hackclient.rise.gl;

@gl(aliases={"module.ghost.hitbox.name"}, description="module.ghost.hitbox.description", category=gj.GHOST)
public class lc
extends gi {
    public final akq Bj = new akq("Expand Amount", this, (Number)0, (Number)0, (Number)6, (Number)0.01);
    private final aki Bk = new aki("Effect range", (gi)this, (Boolean)true);
    @dm
    public final dk<fr> Bl = fr2 -> {
        fr2.c(((Number)this.Bj.wD()).floatValue());
        if (!((Boolean)this.Bk.wD()).booleanValue()) {
            fr2.i(fr2.dA() - ((Number)this.Bj.wD()).doubleValue());
        }
    };
    @dm
    public final dk<ea> Bm = ea2 -> {
        lc.aER.bhc = aei.c(bs.fk, 4.5);
    };
}

