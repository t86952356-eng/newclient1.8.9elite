/*
 * Decompiled with CFR 0.152.
 */
package rise.module.impl.movement.terrainspeed;

import hackclient.rise.aii;
import hackclient.rise.aik;
import net.minecraft.block.BlockSlab;
import net.minecraft.block.BlockStairs;
import net.minecraft.potion.a;
import rise.event.EventLink;
import rise.event.Listener;
import rise.event.impl.MoveEvent;
import rise.event.impl.StrafeEvent;
import rise.module.Mode;
import rise.module.impl.combat.KillAura;
import rise.module.impl.movement.Speed;
import rise.module.impl.movement.TerrainSpeed;
import rise.module.impl.player.Scaffold;

public final class WatchdogMode
extends Mode<TerrainSpeed> {
    private int SS;
    private int ST;
    @EventLink
    public final Listener<StrafeEvent> To = strafeEvent -> {
        if (aik.o(WatchdogMode.aER.bgK.gW, WatchdogMode.aER.bgK.gX - 0.5, WatchdogMode.aER.bgK.gY) instanceof BlockSlab && WatchdogMode.aER.bgK.gX == Math.floor(WatchdogMode.aER.bgK.gX) + 0.5 && !this.e(Scaffold.class).isEnabled() && !this.e(Speed.class).isEnabled() && this.e(KillAura.class).jE == null && !WatchdogMode.aER.aIY.cho.Re()) {
            if (WatchdogMode.aER.bgK.a(a.dgw)) {
                double[] dArray = new double[]{0.276, 0.309, 0.349, 0.3967};
            }
            this.ST = 0;
        } else {
            ++this.ST;
            if (this.ST == 1) {
                strafeEvent.setFriction(strafeEvent.getFriction() * 0.9f);
            }
        }
        if (aik.o(WatchdogMode.aER.bgK.gW, WatchdogMode.aER.bgK.gX - 0.5, WatchdogMode.aER.bgK.gY) instanceof BlockStairs && !this.e(Scaffold.class).isEnabled() && !this.e(Speed.class).isEnabled() && this.e(KillAura.class).jE == null && WatchdogMode.aER.aIY.chm.Re()) {
            if (WatchdogMode.aER.bgK.gX == Math.floor(WatchdogMode.aER.bgK.gX) + 0.5 || this.SS == 0) {
                strafeEvent.setFriction((float)((double)strafeEvent.getFriction() * 3.98));
                this.SS = 0;
            }
        } else {
            ++this.SS;
            if (this.SS == 1) {
                aii.stop();
            }
        }
    };
    @EventLink
    public final Listener<MoveEvent> Tp = moveEvent -> {
        if (this.SS < 2) {
            moveEvent.setPosY(-0.0784);
            WatchdogMode.aER.aIY.chq.ay(false);
        }
    };

    public WatchdogMode(String string, TerrainSpeed terrainSpeed) {
        super(string, terrainSpeed);
    }
}

