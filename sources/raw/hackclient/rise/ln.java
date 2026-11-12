/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.aik;
import hackclient.rise.akg;
import hackclient.rise.aki;
import hackclient.rise.akj;
import hackclient.rise.dk;
import hackclient.rise.dm;
import hackclient.rise.eq;
import hackclient.rise.fe;
import hackclient.rise.kx;
import net.minecraft.util.cf;
import rip.vantage.commons.util.time.a;

public class ln
extends akg<kx> {
    private final akj Ck = new akj("CPS", this, (Number)8, (Number)14, (Number)1, (Number)20, (Number)0.1);
    private final aki Cl = new aki("Right Click", (akg<?>)this, (Boolean)false);
    private final aki Cm = new aki("Left Click", (akg<?>)this, (Boolean)true);
    private final aki Cn = new aki("Hit Select", (akg<?>)this, (Boolean)false);
    private final aki Co = new aki("Break Blocks", (akg<?>)this, (Boolean)true);
    private final aki Cp = new aki("ButterFly", (akg<?>)this, (Boolean)true);
    private final a Cq = new a();
    private int Cr;
    private int BV;
    private long nT;
    @dm
    public final dk<fe> Cs = fe2 -> {
        ++this.BV;
        if (this.Cq.T(this.nT) && (!((Boolean)this.Cn.wD()).booleanValue() || this.BV >= 10 || ln.aER.bgK.cus > 0 && this.Cq.T(this.nT)) && ln.aER.bgR == null) {
            long l2 = (long)((double)this.Ck.wK().longValue() * 1.5);
            this.Cr = ln.aER.aIY.chw.Re() ? ++this.Cr : 0;
            this.nT = this.nT >= 100L && (Boolean)this.Cp.wD() != false ? (long)(Math.random() * 100.0) : 1000L / l2;
            if (((Boolean)this.Cl.wD()).booleanValue() && ln.aER.aIY.chu.Re() && !ln.aER.aIY.chw.Re()) {
                aik.h(1, true);
                if (Math.random() > 0.9) {
                    aik.h(1, true);
                }
            }
            if (!(!((Boolean)this.Cm.wD()).booleanValue() || this.Cr <= 1 || ln.aER.aIY.chu.Re() || ((Boolean)this.Co.wD()).booleanValue() && ln.aER.bhc != null && ln.aER.bhc.dzu == cf.dzy)) {
                aik.h(0, true);
            } else if (!((Boolean)this.Co.wD()).booleanValue()) {
                ln.aER.bgu.bDx = 0.0f;
            }
            this.Cq.aX();
        }
    };
    @dm
    public final dk<eq> Ct = eq2 -> {
        this.BV = 0;
    };

    public ln(String string, kx kx2) {
        super(string, kx2);
    }
}

