/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.aki;
import hackclient.rise.akq;
import hackclient.rise.dk;
import hackclient.rise.dm;
import hackclient.rise.ec;
import hackclient.rise.gi;
import hackclient.rise.gj;
import hackclient.rise.gl;

@gl(aliases={"module.ghost.keepsprint.name"}, description="module.ghost.keepsprint.description", category=gj.GHOST)
public class lf
extends gi {
    private final akq BE = new akq("Hit Slow Down During Velocity", this, (Number)0.6, (Number)0, (Number)1, (Number)0.05);
    private final akq BF = new akq("Hit Slow Down Normal", this, (Number)0.6, (Number)0, (Number)1, (Number)0.05);
    private final akq BG = new akq("Buffer Decrease", this, (Number)1, (Number)0.1, (Number)10, (Number)0.1, () -> (Boolean)this.BK.wD() == false);
    private final akq BH = new akq("Max Buffer", this, (Number)5, (Number)1, (Number)10, (Number)1, () -> (Boolean)this.BK.wD() == false);
    private final aki BI = new aki("Velocity Hit Sprint", (gi)this, (Boolean)false);
    private final aki BJ = new aki("Normal Hit Sprint", (gi)this, (Boolean)false);
    private final aki BK = new aki("Buffer Abuse", (gi)this, (Boolean)false);
    private final aki BL = new aki("Only In Air", (gi)this, (Boolean)false);
    private boolean BM;
    private double BN;
    @dm
    public final dk<ec> BO = ec2 -> {
        if (lf.aER.bgK.aO && ((Boolean)this.BL.wD()).booleanValue()) {
            return;
        }
        if (((Boolean)this.BK.wD()).booleanValue()) {
            if (this.BN < (double)((Number)this.BH.wD()).intValue() && !this.BM) {
                this.BN += 1.0;
            } else {
                if (this.BN > 0.0) {
                    this.BN = Math.max(0.0, this.BN - ((Number)this.BG.wD()).doubleValue());
                    this.BM = true;
                    return;
                }
                this.BM = false;
            }
        } else {
            this.BN = 0.0;
        }
        if (lf.aER.bgK.cus > 0) {
            ec2.setSlowDown(((Number)this.BE.wD()).doubleValue());
            ec2.setSprint((Boolean)this.BI.wD());
        } else {
            ec2.setSlowDown(((Number)this.BF.wD()).doubleValue());
            ec2.setSprint((Boolean)this.BJ.wD());
        }
    };
}

