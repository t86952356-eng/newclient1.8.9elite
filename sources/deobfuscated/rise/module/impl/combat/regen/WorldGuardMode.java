/*
 * Decompiled with CFR 0.152.
 */
package rise.module.impl.combat.regen;

import hackclient.rise.ahn;
import net.minecraft.network.aj;
import net.minecraft.network.play.client.c;
import net.minecraft.network.play.client.d;
import net.minecraft.network.play.client.f;
import net.minecraft.network.play.server.ax;
import rise.event.EventLink;
import rise.event.Listener;
import rise.event.impl.MoveInputEvent;
import rise.event.impl.PacketReceiveEvent;
import rise.event.impl.PacketSendEvent;
import rise.event.impl.PreMotionEvent;
import rise.event.impl.StrafeEvent;
import rise.module.Mode;
import rise.module.impl.combat.Regen;
import rise.value.NumberValue;

public final class WorldGuardMode
extends Mode<Regen> {
    private final NumberValue sr = new NumberValue("Minimum Health", this, (Number)15, (Number)1, (Number)20, (Number)1);
    private int hV;
    private float gZ;
    private float ha;
    @EventLink
    public final Listener<PreMotionEvent> ss = preMotionEvent -> {
        if (WorldGuardMode.aER.bgK.aO && WorldGuardMode.aER.bgK.getHealth() < ((Number)this.sr.wD()).floatValue()) {
            if (this.hV <= 1) {
                preMotionEvent.setPosY(preMotionEvent.getPosY() - 0.05);
                preMotionEvent.setYaw(this.gZ);
                preMotionEvent.setPitch(this.ha);
                ++this.hV;
            }
        } else {
            this.gZ = preMotionEvent.getYaw();
            this.ha = preMotionEvent.getPitch();
            this.hV = 0;
        }
    };
    @EventLink
    public final Listener<PacketSendEvent> st = packetSendEvent -> {
        c c2;
        aj<?> aj2 = packetSendEvent.dq();
        if (aj2 instanceof c && WorldGuardMode.aER.bgK.aO && WorldGuardMode.aER.bgK.getHealth() < ((Number)this.sr.wD()).floatValue() && this.hV <= 1 && (c2 = (c)aj2).afQ().equals((Object)d.daU)) {
            packetSendEvent.cF();
            ahn.n(new f(WorldGuardMode.aER.bgK.gW, WorldGuardMode.aER.bgK.gX, WorldGuardMode.aER.bgK.gY, true));
            ahn.n(c2);
            ahn.n(new f(WorldGuardMode.aER.bgK.gW, WorldGuardMode.aER.bgK.gX - 0.05, WorldGuardMode.aER.bgK.gY, false));
        }
    };
    @EventLink
    public final Listener<PacketReceiveEvent> su = packetReceiveEvent -> {
        if (packetReceiveEvent.dq() instanceof ax && this.hV <= 1) {
            packetReceiveEvent.cF();
        }
    };
    @EventLink
    public final Listener<StrafeEvent> sv = strafeEvent -> {
        if (WorldGuardMode.aER.bgK.aO && WorldGuardMode.aER.bgK.getHealth() < ((Number)this.sr.wD()).floatValue() && this.hV <= 1) {
            strafeEvent.setSpeed(0.0);
        }
    };
    @EventLink
    public final Listener<MoveInputEvent> sw = moveInputEvent -> {
        if (WorldGuardMode.aER.bgK.aO && WorldGuardMode.aER.bgK.getHealth() < ((Number)this.sr.wD()).floatValue() && this.hV <= 1) {
            moveInputEvent.setJump(false);
        }
    };

    public WorldGuardMode(String string, Regen regen) {
        super(string, regen);
    }
}

