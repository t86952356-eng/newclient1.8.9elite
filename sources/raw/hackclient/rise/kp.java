/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.ahn;
import hackclient.rise.aii;
import hackclient.rise.akg;
import hackclient.rise.aki;
import hackclient.rise.bm;
import hackclient.rise.cg;
import hackclient.rise.dk;
import hackclient.rise.dm;
import hackclient.rise.eh;
import hackclient.rise.ei;
import hackclient.rise.fh;
import hackclient.rise.fi;
import hackclient.rise.jg;
import hackclient.rise.lw;
import hackclient.rise.mh;
import net.minecraft.network.aj;
import net.minecraft.network.play.client.n;
import net.minecraft.network.play.client.o;
import net.minecraft.network.play.server.i;

public class kp
extends akg<jg> {
    private final aki zk = new aki("Movement", (akg<?>)this, (Boolean)false);
    private final aki zl = new aki("Sprint", (akg<?>)this, (Boolean)false);
    private lw zm = null;
    private mh uS = null;
    private int zn;
    @dm
    public final dk<ei> zo = ei2 -> {
        if (((Boolean)this.zl.wD()).booleanValue() && aii.isMoving() && kp.aER.bgK.aRg > 50 && kp.aER.bgK.aRg % 5 == 0) {
            if (kp.aER.bgK.aRg % 10 == 0) {
                ahn.n(new n(kp.aER.bgK, o.dbs));
            } else {
                ahn.n(new n(kp.aER.bgK, o.dbt));
            }
        }
    };
    @dm
    public final dk<fh> zp = fh2 -> {
        aj<?> aj2 = fh2.dq();
        if (aj2 instanceof i) {
            i i2 = (i)aj2;
            this.zn = -20;
        }
    };
    @dm
    public final dk<eh> zq = eh2 -> {
        if (((Boolean)this.zk.wD()).booleanValue()) {
            int n2 = 9;
            ++this.zn;
            if (kp.aER.bgK.aRg > n2 * 20 && this.zn > 0) {
                bm.a(n2 * 1000, true, false, true, false);
            }
            if (kp.aER.bgK.css > 20 * n2 || this.zn <= 0 || kp.aER.bgK.aRg <= n2 * 2 * 20) {
                if (this.uS == null) {
                    this.uS = this.e(mh.class);
                }
                if (this.uS.isEnabled()) {
                    this.uS.toggle();
                    aii.stop();
                    cg.a("Auto Toggle", "Automatically disabled Speed to prevent flags", 1000);
                }
            }
            if (kp.aER.bgK.css > 20 * (n2 / 2) || this.zn <= 0 || kp.aER.bgK.aRg <= n2 * 2 * 20) {
                if (this.zm == null) {
                    this.zm = this.e(lw.class);
                }
                if (this.zm.isEnabled()) {
                    this.zm.toggle();
                    cg.a("Auto Toggle", "Automatically disabled Flight to prevent flags", 1000);
                }
            }
        }
    };
    @dm
    public final dk<fi> zr = fi2 -> {
        n n2;
        aj<?> aj2 = fi2.dq();
        if (((Boolean)this.zl.wD()).booleanValue() && aj2 instanceof n && ((n2 = (n)aj2).agb() == o.dbs || n2.agb() == o.dbt)) {
            fi2.cF();
        }
    };

    public kp(String string, jg jg2) {
        super(string, jg2);
    }
}

