/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.protocol.version.ProtocolVersion
 */
package rise.module.impl.player.scaffold;

import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import de.florianmichael.vialoadingbase.ViaLoadingBase;
import hackclient.rise.aii;
import rise.event.EventLink;
import rise.event.Listener;
import rise.event.impl.PreMotionEvent;
import rise.module.Mode;
import rise.module.impl.player.Scaffold;

public class WcMode
extends Mode<Scaffold> {
    @EventLink
    public final Listener<PreMotionEvent> akT = preMotionEvent -> {
        if (!WcMode.aER.aIY.chq.Re()) {
            return;
        }
        if (WcMode.aER.bgK.aO && !aii.enoughMovementForSprinting()) {
            WcMode.aER.bgK.jump();
        }
        if (ViaLoadingBase.getInstance().getTargetVersion().olderThan(ProtocolVersion.v1_18)) {
            if (WcMode.aER.bgK.tR == 4 && aii.speed() == 0.0) {
                WcMode.aER.bgK.ue -= 0.03;
            }
            if (WcMode.aER.bgK.tR == 5 && aii.speed() == 0.0) {
                WcMode.aER.bgK.ue -= 0.5;
            }
        }
    };

    public WcMode(String string, Scaffold scaffold) {
        super(string, scaffold);
    }
}

