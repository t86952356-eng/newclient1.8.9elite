/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.protocol.version.ProtocolVersion
 */
package hackclient.rise;

import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import de.florianmichael.vialoadingbase.ViaLoadingBase;
import hackclient.rise.am;
import rise.event.EventLink;
import rise.event.Listener;
import rise.event.impl.PreUpdateEvent;

public final class cx
extends am {
    @EventLink(cH=4)
    public final Listener<PreUpdateEvent> ik = preUpdateEvent -> {
        if (ViaLoadingBase.getInstance().getTargetVersion().newerThan(ProtocolVersion.v1_8)) {
            // empty if block
        }
    };
}

