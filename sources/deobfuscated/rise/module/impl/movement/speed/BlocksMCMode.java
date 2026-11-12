/*
 * Decompiled with CFR 0.152.
 */
package rise.module.impl.movement.speed;

import hackclient.rise.aii;
import hackclient.rise.fd;
import net.minecraft.network.play.client.n;
import net.minecraft.potion.a;
import rise.event.EventLink;
import rise.event.Listener;
import rise.event.impl.PacketSendEvent;
import rise.event.impl.PreMotionEvent;
import rise.event.impl.StrafeEvent;
import rise.module.Mode;
import rise.module.impl.movement.Speed;

public class BlocksMCMode
extends Mode<Speed> {
    private boolean LK;
    private double LL;
    @EventLink
    public final Listener<StrafeEvent> Pm = strafeEvent -> {
        double d2 = aii.getAllowedHorizontalDistance();
        boolean bl2 = BlocksMCMode.aER.bgK.a(a.dgw);
        if (aii.isMoving()) {
            switch (BlocksMCMode.aER.bgK.tR) {
                case 0: {
                    BlocksMCMode.aER.bgK.ue = aii.jumpBoostMotion(0.42f);
                    this.LL = d2 * (bl2 ? 1.4 : 2.15);
                    break;
                }
                case 1: {
                    this.LL -= 0.8 * (this.LL - d2);
                    break;
                }
                default: {
                    this.LL -= this.LL / (double)159.9f;
                }
            }
            this.LK = false;
        } else if (!this.LK) {
            this.LL = 0.0;
            this.LK = true;
            this.LL = aii.getAllowedHorizontalDistance();
        }
        if (BlocksMCMode.aER.bgK.crR) {
            this.LL = aii.getAllowedHorizontalDistance();
        }
        strafeEvent.setSpeed(Math.max(this.LL, d2), Math.random() / 2000.0);
    };
    @EventLink
    public final Listener<fd> Pn = fd2 -> {
        this.LL = 0.0;
    };
    @EventLink
    public final Listener<PreMotionEvent> Po = preMotionEvent -> {
        if (!aii.isMoving()) {
            preMotionEvent.setPosX(preMotionEvent.getPosX() + (Math.random() - 0.5) / 3.0);
            preMotionEvent.setPosZ(preMotionEvent.getPosZ() + (Math.random() - 0.5) / 3.0);
        }
    };
    @EventLink
    public final Listener<PacketSendEvent> Pp = packetSendEvent -> {
        if (packetSendEvent.dq() instanceof n) {
            // empty if block
        }
    };

    public BlocksMCMode(String string, Speed speed) {
        super(string, speed);
    }

    @Override
    public void onDisable() {
        this.LL = 0.0;
    }
}

