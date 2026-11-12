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
import net.minecraft.network.aj;
import net.minecraft.network.play.b;
import net.minecraft.network.play.client.aa;
import net.minecraft.network.play.client.c;
import net.minecraft.network.play.client.d;
import net.minecraft.network.play.client.e;
import net.minecraft.network.play.client.i;
import net.minecraft.network.play.client.j;
import net.minecraft.network.play.client.q;
import net.minecraft.network.play.client.r;
import net.minecraft.network.play.client.z;
import rise.event.EventLink;
import rise.event.Listener;
import rise.event.impl.PacketSendEvent;
import rise.event.impl.PreUpdateEvent;
import rise.module.Mode;
import rise.module.impl.combat.KillAura;
import rise.module.impl.movement.LongJump;
import rise.module.impl.movement.TerrainSpeed;
import rise.module.impl.player.Breaker;

public final class cy
extends am {
    public static double il = 0.0;
    private boolean im;
    @EventLink(cH=0)
    public final Listener<PacketSendEvent> in = packetSendEvent -> {
        aj<b> aj2;
        aj<?> aj3;
        TerrainSpeed terrainSpeed = this.e(TerrainSpeed.class);
        if (cy.aER.bgK.aRg < 2) {
            il = 0.0;
        }
        if ((ViaLoadingBase.getInstance().getTargetVersion().newerThan(ProtocolVersion.v1_8) || "Bloxd".equals(((Mode)terrainSpeed.Fe.wD()).getName()) && terrainSpeed.isEnabled() && !this.e(LongJump.class).isEnabled()) && (aj3 = packetSendEvent.dq()) instanceof e) {
            aj2 = (e)aj3;
            if ("Bloxd".equals(((Mode)terrainSpeed.Fe.wD()).getName()) && terrainSpeed.isEnabled() && !this.e(LongJump.class).isEnabled() && !((e)aj2).isMoving() && cy.aER.bgK.Zz > 2) {
                il += 1.0;
                packetSendEvent.cF();
            }
            il -= (double)cy.aER.bgC.dAp - 1.6;
            if (!((e)aj2).isMoving() && !((e)aj2).isRotating() && ((e)aj2).onGround == this.im) {
                packetSendEvent.cF();
            }
            this.im = ((e)aj2).onGround;
        }
        if (ViaLoadingBase.getInstance().getTargetVersion().newerThan(ProtocolVersion.v1_8)) {
            aj3 = packetSendEvent.dq();
            if (!(aj3 instanceof i) || ((i)(aj2 = (i)aj3)).afW() != j.dba && ((i)aj2).afW() != j.daZ && ((i)aj2).afW() != j.dbb && ((i)aj2).afW() != j.dbe || Breaker.acw != null) {
                // empty if block
            }
            if (Breaker.acw == null || !((Boolean)this.e(Breaker.class).acp.wD()).booleanValue()) {
                // empty if block
            }
            if (aj3 instanceof r || aj3 instanceof z && ((z)aj3).agh() == aa.dbR || aj3 instanceof q) {
                // empty if block
            }
            if (!(aj3 instanceof c) || ((c)(aj2 = (c)aj3)).afQ() != d.daU || il < 10.0 && !this.e(KillAura.class).isEnabled() || !(il < 1.0) || this.e(KillAura.class).isEnabled()) {
                // empty if block
            }
        }
    };
    @EventLink
    public final Listener<PreUpdateEvent> io = preUpdateEvent -> {
        if (!this.e(KillAura.class).isEnabled() ? il < 10.0 : il < 1.0) {
            // empty if block
        }
    };
}

