/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.protocol.version.ProtocolVersion
 */
package hackclient.rise;

import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import de.florianmichael.vialoadingbase.ViaLoadingBase;
import hackclient.rise.aii;
import hackclient.rise.akg;
import hackclient.rise.dk;
import hackclient.rise.dm;
import hackclient.rise.ei;
import hackclient.rise.tn;

public class wc
extends akg<tn> {
    @dm
    public final dk<ei> akT = ei2 -> {
        if (!wc.aER.aIY.chq.Re()) {
            return;
        }
        if (wc.aER.bgK.aO && !aii.enoughMovementForSprinting()) {
            wc.aER.bgK.jump();
        }
        if (ViaLoadingBase.getInstance().getTargetVersion().olderThan(ProtocolVersion.v1_18)) {
            if (wc.aER.bgK.tR == 4 && aii.speed() == 0.0) {
                wc.aER.bgK.ue -= 0.03;
            }
            if (wc.aER.bgK.tR == 5 && aii.speed() == 0.0) {
                wc.aER.bgK.ue -= 0.5;
            }
        }
    };

    public wc(String string, tn tn2) {
        super(string, tn2);
    }
}

