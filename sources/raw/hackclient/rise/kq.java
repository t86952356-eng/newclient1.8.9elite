/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.ahn;
import hackclient.rise.akg;
import hackclient.rise.aki;
import hackclient.rise.bb;
import hackclient.rise.bc;
import hackclient.rise.be;
import hackclient.rise.dk;
import hackclient.rise.dm;
import hackclient.rise.ei;
import hackclient.rise.fi;
import hackclient.rise.jg;
import hackclient.rise.lw;
import net.minecraft.network.play.client.i;
import net.minecraft.network.play.client.j;
import net.minecraft.network.play.client.n;
import net.minecraft.network.play.client.o;
import net.minecraft.util.ao;
import net.minecraft.util.b;

public class kq
extends akg<jg> {
    private final aki zs = new aki("Omni-Sprint", (akg<?>)this, (Boolean)true);
    private final aki zt = new aki("Auto Clicker", (akg<?>)this, (Boolean)true);
    private final aki zu = new aki("Reach (4.5 Block)", (akg<?>)this, (Boolean)true);
    private final aki zv = new aki("Strafe and Jump", (akg<?>)this, (Boolean)true);
    private final aki zw = new aki("Scaffold", (akg<?>)this, (Boolean)true);
    public final aki zx = new aki("Miscellaneous (Auto-Block, BadPackets)", (akg<?>)this, (Boolean)true);
    private final aki zy = new aki("Keep Sprint (To disable KeepSprint spoof 1.9)", (akg<?>)this, (Boolean)true);
    @dm
    public final dk<fi> zz = fi2 -> {};
    @dm
    public final dk<ei> zA = ei2 -> {
        if (!kq.aER.AU().bEQ) {
            return;
        }
        if (((Boolean)this.zs.wD()).booleanValue()) {
            ahn.m(new n(kq.aER.bgK, o.dbs));
            ahn.m(new n(kq.aER.bgK, o.dbt));
        }
        if (((Boolean)this.zv.wD()).booleanValue() && kq.aER.bgK.aRg % 5 == 0) {
            ahn.m(new i(j.dbb, new b(kq.aER.bgK), ao.dwr));
        }
        if (((Boolean)this.zt.wD()).booleanValue() && kq.aER.bgK.aRg % 100 == 0 && !bb.a(false, true, true, false, false) && !be.aY()) {
            ahn.m(new i(j.daZ, new b(kq.aER.bgK), ao.dwr));
        }
        if (((Boolean)this.zw.wD()).booleanValue()) {
            if (this.gL() && kq.aER.bgK.aRg % 9 == 0 && Math.random() <= 0.7) {
                ahn.m(new n(kq.aER.bgK, o.dbq));
            }
            if (kq.aER.bgK.aO && this.gM() && Math.random() <= 0.2) {
                ahn.m(new n(kq.aER.bgK, o.dbq));
            }
            if (kq.aER.bgK.aRg % 9 == 0 && kq.aER.bgK.aO && !this.gM()) {
                ahn.m(new n(kq.aER.bgK, o.dbq));
            }
        }
        if (((Boolean)this.zu.wD()).booleanValue() && !this.e(lw.class).isEnabled()) {
            bc.cR = true;
            if (kq.aER.bgK.aRg % 2 == 0) {
                bc.dispatch();
            }
        } else {
            bc.dispatch();
        }
    };

    public kq(String string, jg jg2) {
        super(string, jg2);
    }

    private boolean gL() {
        return !kq.aER.bgK.aO;
    }

    private boolean gM() {
        return kq.aER.aIY.chq.Re();
    }
}

