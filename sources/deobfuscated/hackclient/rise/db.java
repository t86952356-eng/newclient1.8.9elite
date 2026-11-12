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
import hackclient.rise.es;
import net.minecraft.block.Block;
import rise.event.EventLink;
import rise.event.Listener;

public final class db
extends am {
    @EventLink
    public final Listener<es> iC = es2 -> {
        if (ViaLoadingBase.getInstance().getTargetVersion().newerThan(ProtocolVersion.v1_8)) {
            Block block = es2.df();
        }
    };
}

