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
import hackclient.rise.dk;
import hackclient.rise.dm;
import hackclient.rise.fi;
import net.minecraft.network.play.client.s;

public final class df
extends am {
    @dm(cH=0)
    public final dk<fi> iH = fi2 -> {
        if (fi2.isCancelled() || !ViaLoadingBase.getInstance().getTargetVersion().newerThanOrEqualTo(ProtocolVersion.v1_17) || fi2.dq() instanceof s) {
            // empty if block
        }
    };
}

