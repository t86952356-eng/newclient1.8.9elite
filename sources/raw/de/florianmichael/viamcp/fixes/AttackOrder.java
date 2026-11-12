/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.protocol.version.ProtocolVersion
 */
package de.florianmichael.viamcp.fixes;

import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import de.florianmichael.vialoadingbase.ViaLoadingBase;
import net.minecraft.client.d;
import net.minecraft.entity.c;
import net.minecraft.entity.player.a;
import net.minecraft.util.ce;
import net.minecraft.util.cf;

public class AttackOrder {
    private static final d mc = d.AZ();

    public static void sendConditionalSwing(ce ce2) {
        if (ce2 != null && ce2.dzu != cf.dzz) {
            AttackOrder.mc.bgK.swingItem();
        }
    }

    public static void sendFixedAttack(a a2, c c2) {
        if (ViaLoadingBase.getInstance().getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_8)) {
            AttackOrder.mc.bgK.swingItem();
            AttackOrder.mc.bgu.a(a2, c2);
        } else {
            AttackOrder.mc.bgu.a(a2, c2);
            AttackOrder.mc.bgK.swingItem();
        }
    }
}

