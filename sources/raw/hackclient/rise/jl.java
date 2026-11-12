/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.ahj;
import hackclient.rise.aki;
import hackclient.rise.akj;
import hackclient.rise.bm;
import hackclient.rise.dk;
import hackclient.rise.dm;
import hackclient.rise.ej;
import hackclient.rise.gi;
import hackclient.rise.gj;
import hackclient.rise.gl;

@gl(aliases={"module.combat.pingspoof.name"}, description="module.exploit.pingspoof.description", category=gj.EXPLOIT)
public class jl
extends gi {
    private final akj xa = new akj("Delay", this, (Number)1000, (Number)1500, (Number)50, (Number)30000, (Number)1);
    private final aki xb = new aki("Delay Teleports", (gi)this, (Boolean)false);
    private final aki xc = new aki("Delay Velocity", (gi)this, (Boolean)false);
    private final aki xd = new aki("Delay Entity Movements", (gi)this, (Boolean)false);
    @dm
    public final dk<ej> xe = ej2 -> bm.a((int)ahj.l(((Number)this.xa.wD()).intValue(), this.xa.wP().intValue()), true, (Boolean)this.xc.wD(), (Boolean)this.xb.wD(), (Boolean)this.xd.wD());
}

