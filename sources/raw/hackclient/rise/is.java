/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.protocol.version.ProtocolVersion
 */
package hackclient.rise;

import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import de.florianmichael.vialoadingbase.ViaLoadingBase;
import hackclient.rise.akg;
import hackclient.rise.aki;
import hackclient.rise.akq;
import hackclient.rise.dk;
import hackclient.rise.dm;
import hackclient.rise.dz;
import hackclient.rise.ei;
import hackclient.rise.fh;
import hackclient.rise.hf;
import net.minecraft.network.aj;
import net.minecraft.network.play.server.t;

public final class is
extends akg<hf> {
    public final akq uC = new akq("Chance", this, (Number)100, (Number)0, (Number)100, (Number)1);
    public final aki uD = new aki("Legit Timing", (akg<?>)this, (Boolean)false);
    private boolean gD;
    @dm
    public final dk<ei> uE = ei2 -> {
        this.gD = false;
    };
    @dm
    public final dk<dz> uF = dz2 -> {
        if (((Boolean)((hf)this.wy()).qQ.wD()).booleanValue() && !is.aER.bgK.cup) {
            return;
        }
        if (this.gD && Math.random() * 100.0 < ((Number)this.uC.wD()).doubleValue()) {
            dz2.setJump(true);
            if (ViaLoadingBase.getInstance().getTargetVersion().newerThanOrEqualTo(ProtocolVersion.v1_21_2)) {
                // empty if block
            }
        }
    };
    @dm
    public final dk<fh> uG = fh2 -> {
        t t2;
        if (((Boolean)((hf)this.wy()).qQ.wD()).booleanValue() && !is.aER.bgK.cup || fh2.isCancelled()) {
            return;
        }
        if (!is.aER.bgK.aO) {
            return;
        }
        aj<?> aj2 = fh2.dq();
        if (aj2 instanceof t && (t2 = (t)aj2).getEntityID() == is.aER.bgK.getEntityId() && t2.dcS > 0 && (!((Boolean)this.uD.wD()).booleanValue() || is.aER.bgK.ae <= 14 || is.aER.bgK.crx <= 1)) {
            this.gD = true;
        }
    };

    public is(String string, hf hf2) {
        super(string, hf2);
    }
}

