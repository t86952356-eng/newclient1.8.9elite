/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.akg;
import hackclient.rise.aki;
import hackclient.rise.akq;
import hackclient.rise.dk;
import hackclient.rise.dm;
import hackclient.rise.ei;
import hackclient.rise.fd;
import hackclient.rise.fh;
import hackclient.rise.hf;
import hackclient.rise.mh;
import net.minecraft.network.aj;
import net.minecraft.network.play.server.ar;
import net.minecraft.network.play.server.t;

public final class iv
extends akg<hf> {
    public Boolean uQ = false;
    private Integer uR = 0;
    private mh uS = null;
    private String fH = null;
    private int sG;
    private final akq uT = new akq("Horizontal", this, (Number)0, (Number)0, (Number)100, (Number)1);
    private final akq uU = new akq("Vertical", this, (Number)0, (Number)0, (Number)100, (Number)1);
    private final aki uV = new aki("Explosion Ignore", (akg<?>)this, (Boolean)false);
    @dm(cH=0)
    public final dk<fh> uW = fh2 -> {
        if (((Boolean)((hf)this.wy()).qQ.wD()).booleanValue() && !iv.aER.bgK.cup || fh2.isCancelled()) {
            return;
        }
        aj<?> aj2 = fh2.dq();
        double d2 = ((Number)this.uT.wD()).doubleValue();
        double d3 = ((Number)this.uU.wD()).doubleValue();
        boolean bl2 = (Boolean)this.uV.wD();
        if (aj2 instanceof t) {
            t t2 = (t)aj2;
            if (t2.getEntityID() == iv.aER.bgK.getEntityId()) {
                if (d2 == 0.0) {
                    if (d3 != 0.0 && !fh2.isCancelled()) {
                        iv.aER.bgK.ue = (double)t2.agO() / 8000.0;
                    }
                    fh2.cF();
                    return;
                }
                t2.dcR = (int)((double)t2.dcR * (d2 / 100.0));
                t2.dcS = (int)((double)t2.dcS * (d3 / 100.0));
                t2.dcT = (int)((double)t2.dcT * (d2 / 100.0));
                fh2.e(t2);
            }
        } else if (aj2 instanceof ar) {
            ar ar2 = (ar)aj2;
            if (bl2) {
                fh2.cF();
                return;
            }
            ar2.gW *= d2 / 100.0;
            ar2.gX *= d3 / 100.0;
            ar2.gY *= d2 / 100.0;
            fh2.e(ar2);
        }
    };
    @dm
    public final dk<ei> uX = ei2 -> {
        if (this.uS == null) {
            this.uS = this.e(mh.class);
        }
    };
    @dm
    public final dk<fd> uY = fd2 -> {
        if (fd2.getPosY() < iv.aER.bgK.gX - 2.0) {
            // empty if block
        }
    };

    @Override
    public void onEnable() {
        this.uR = 0;
        this.a(false);
    }

    public iv(String string, hf hf2) {
        super(string, hf2);
    }

    public Boolean gB() {
        return this.uQ;
    }

    public void a(Boolean bl2) {
        this.uQ = bl2;
    }
}

