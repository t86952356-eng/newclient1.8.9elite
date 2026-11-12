/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.a;
import hackclient.rise.aec;
import hackclient.rise.aei;
import hackclient.rise.afl;
import hackclient.rise.akb;
import hackclient.rise.akq;
import hackclient.rise.dk;
import hackclient.rise.dm;
import hackclient.rise.ei;
import hackclient.rise.eq;
import hackclient.rise.fi;
import hackclient.rise.gi;
import hackclient.rise.gj;
import hackclient.rise.gl;
import hackclient.rise.lh;
import net.minecraft.entity.r;
import net.minecraft.network.aj;
import net.minecraft.network.play.client.m;
import net.minecraft.util.ce;
import net.minecraft.util.cf;

@gl(aliases={"module.ghost.aimbacktrack.name"}, description="module.ghost.aimbacktract.description", category=gj.GHOST)
public class kw
extends gi {
    private final akq AA = new akq("Rotation Backtrack Amount", this, (Number)1, (Number)1, (Number)20, (Number)1);
    private aec<akb> AB = new aec(1);
    private boolean pw;
    private int AC;
    @dm
    public final dk<ei> AD = ei2 -> {
        if (this.AC != ((Number)this.AA.wD()).intValue()) {
            this.AB = new aec(((Number)this.AA.wD()).intValue());
            this.AC = ((Number)this.AA.wD()).intValue();
        }
        this.AB.add(new akb(ei2.getYaw(), ei2.getPitch()));
        this.pw = false;
    };
    @dm
    public final dk<fi> AE = fi2 -> {
        aj<?> aj2 = fi2.dq();
        if (aj2 instanceof m && kw.aER.bhc.dzu == cf.dzx) {
            for (akb akb2 : this.AB) {
                lh lh2 = this.e(lh.class);
                ce ce2 = aei.c(akb2, lh2.isEnabled() ? 3.0 + ((Number)lh2.BQ.wD()).doubleValue() : 3.0);
                if (ce2.dzw == null || this.pw || !(ce2.dzw instanceof r)) continue;
                eq eq2 = new eq((r)ce2.dzw);
                a.a.e().d(eq2);
                if (eq2.isCancelled()) {
                    return;
                }
                kw.aER.bgu.a(kw.aER.bgK, ce2.dzw);
            }
        }
    };
    @dm
    public final dk<eq> AF = eq2 -> {
        if (this.pw) {
            eq2.cF();
        }
        this.pw = true;
    };

    @Override
    public void onEnable() {
        afl.b("this is a blatant module", new Object[0]);
    }
}

