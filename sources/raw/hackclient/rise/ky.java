/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.akq;
import hackclient.rise.bb;
import hackclient.rise.dk;
import hackclient.rise.dm;
import hackclient.rise.ei;
import hackclient.rise.gi;
import hackclient.rise.gj;
import hackclient.rise.gl;

@gl(aliases={"module.ghost.clickassist.name"}, description="module.ghost.clickassist.description", category=gj.GHOST)
public class ky
extends gi {
    public final akq AN = new akq("Extra Left Clicks", this, (Number)1, (Number)0, (Number)3, (Number)1);
    public final akq AO = new akq("Extra Right Clicks", this, (Number)1, (Number)0, (Number)3, (Number)1);
    public int AP;
    public int AQ;
    private boolean AR;
    private boolean AS;
    @dm
    public final dk<ei> AT = ei2 -> {
        if (ky.aER.aIY.chw.Re()) {
            if (!this.AR) {
                this.AP = ((Number)this.AN.wD()).intValue();
            }
            this.AR = true;
        } else {
            this.AR = false;
        }
        if (ky.aER.aIY.chu.Re()) {
            if (!this.AS) {
                this.AQ = ((Number)this.AO.wD()).intValue();
            }
            this.AS = true;
        } else {
            this.AS = false;
        }
        if (this.AP > 0 && Math.random() > 0.2) {
            --this.AP;
            if (!ky.aER.bgK.isUsingItem() && !bb.aW()) {
                aER.AN();
            }
        } else if (this.AQ > 0 && Math.random() > 0.2) {
            --this.AQ;
            if (!ky.aER.bgK.isUsingItem() && !bb.aW()) {
                aER.AO();
            }
        }
    };
}

