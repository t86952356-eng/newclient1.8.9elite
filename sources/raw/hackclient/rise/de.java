/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.protocol.version.ProtocolVersion
 */
package hackclient.rise;

import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import de.florianmichael.vialoadingbase.ViaLoadingBase;
import hackclient.rise.aik;
import hackclient.rise.am;
import hackclient.rise.dk;
import hackclient.rise.dm;
import hackclient.rise.eo;
import net.minecraft.init.Blocks;
import net.minecraft.potion.a;

public final class de
extends am {
    @dm(cH=1)
    public final dk<eo> iG = eo2 -> {
        if (ViaLoadingBase.getInstance().getTargetVersion().newerThanOrEqualTo(ProtocolVersion.v1_17)) {
            if (!de.aER.bgK.a(a.dgw)) {
                return;
            }
            if (aik.p(0.0, -1.0, 0.0) == Blocks.cOD || aik.p(0.0, -1.0, 0.0) == Blocks.cMK) {
                return;
            }
            float[][] fArrayArray = new float[][]{{0.11999998f, 0.15599997f}, {0.13999997f, 0.18199998f}};
            int n2 = Math.min(de.aER.bgK.b(a.dgw).ajf(), 1);
            boolean bl2 = de.aER.bgK.aO;
            boolean bl3 = de.aER.bgK.isSprinting();
        }
    };
}

