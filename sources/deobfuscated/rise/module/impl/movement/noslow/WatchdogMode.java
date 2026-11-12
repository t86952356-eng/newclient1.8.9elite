/*
 * Decompiled with CFR 0.152.
 */
package rise.module.impl.movement.noslow;

import hackclient.rise.afl;
import hackclient.rise.ahn;
import hackclient.rise.aik;
import hackclient.rise.bu;
import hackclient.rise.ea;
import net.minecraft.init.Blocks;
import net.minecraft.item.ai;
import net.minecraft.item.bg;
import net.minecraft.item.by;
import net.minecraft.item.cp;
import net.minecraft.network.aj;
import net.minecraft.network.play.client.l;
import rise.event.EventLink;
import rise.event.Listener;
import rise.event.impl.PacketSendEvent;
import rise.event.impl.PreMotionEvent;
import rise.event.impl.SlowDownEvent;
import rise.module.Mode;
import rise.module.impl.combat.KillAura;
import rise.module.impl.movement.NoSlow;
import rise.value.BooleanValue;

public class WatchdogMode
extends Mode<NoSlow> {
    private int tR;
    private boolean dk;
    private boolean vh;
    private aj<?> NW;
    private KillAura NX = null;
    public final BooleanValue NY = new BooleanValue("Slow down on Slabs", (Mode<?>)this, (Boolean)true);
    @EventLink
    public final Listener<PreMotionEvent> NZ = preMotionEvent -> {
        double d2;
        if (aik.p(0.0, WatchdogMode.aER.bgK.ue, 0.0) != Blocks.cLc && !WatchdogMode.aER.bgK.isUsingItem() && ((Boolean)this.NY.wD()).booleanValue()) {
            this.vh = false;
        }
        if (Math.abs((d2 = preMotionEvent.getPosY()) - (double)Math.round(d2)) > 0.03 && WatchdogMode.aER.bgK.aO) {
            this.vh = true;
        }
        if (WatchdogMode.aER.bgK.isUsingItem() && !(WatchdogMode.aER.bgK.Vk().bP() instanceof cp)) {
            this.tR = WatchdogMode.aER.bgK.aO ? 0 : ++this.tR;
            if (this.tR >= 2) {
                this.dk = false;
                this.NW = null;
            } else if (WatchdogMode.aER.bgK.aO && !this.vh) {
                preMotionEvent.setPosY(preMotionEvent.getPosY() + 0.001);
            }
        }
        if (this.vh && !WatchdogMode.aER.bgK.aO && WatchdogMode.aER.bgK.isUsingItem() && !(WatchdogMode.aER.bgK.Vk().bP() instanceof cp)) {
            WatchdogMode.aER.bgK.ud *= 0.1;
            WatchdogMode.aER.bgK.uf *= 0.1;
        }
    };
    @EventLink
    public final Listener<ea> Oa = ea2 -> {
        if (WatchdogMode.aER.bgK.Vk() == null) {
            return;
        }
        if (WatchdogMode.aER.bgK.isUsingItem() || WatchdogMode.aER.bgK.Vk().bP() instanceof by && !by.gb(WatchdogMode.aER.bgK.Vk().yc()) || WatchdogMode.aER.bgK.Vk().bP() instanceof bg || WatchdogMode.aER.bgK.Vk().bP() instanceof ai) {
            if (WatchdogMode.aER.bgK.tR < 2 && WatchdogMode.aER.bgK.tR != 0 && !this.vh) {
                afl.b("You must start eating while in the air even with potions", new Object[0]);
                ea2.cF();
            } else if (WatchdogMode.aER.bgK.aO) {
                WatchdogMode.aER.bgK.jump();
                ea2.cF();
            }
        }
    };
    @EventLink
    private final Listener<PacketSendEvent> Ob = packetSendEvent -> {
        if (this.NX == null) {
            this.NX = this.e(KillAura.class);
        }
    };
    @EventLink
    public final Listener<SlowDownEvent> Oc = slowDownEvent -> {
        if (!this.vh || WatchdogMode.aER.bgK.aO) {
            if (((Boolean)((NoSlow)this.wy()).DO.wD()).booleanValue() && WatchdogMode.aER.bgK.isUsingItem() && WatchdogMode.aER.bgK.Vk().bP() instanceof bg) {
                slowDownEvent.cF();
            }
            if (((Boolean)((NoSlow)this.wy()).DP.wD()).booleanValue() && WatchdogMode.aER.bgK.isUsingItem() && WatchdogMode.aER.bgK.Vk().bP() instanceof by && !by.gb(WatchdogMode.aER.bgK.Vk().yc())) {
                slowDownEvent.cF();
            }
            if (((Boolean)((NoSlow)this.wy()).DR.wD()).booleanValue() && WatchdogMode.aER.bgK.isUsingItem() && WatchdogMode.aER.bgK.Vk().bP() instanceof ai) {
                slowDownEvent.cF();
            }
        }
        if (((Boolean)((NoSlow)this.wy()).DQ.wD()).booleanValue() && WatchdogMode.aER.bgK.isUsingItem() && WatchdogMode.aER.bgK.Vk().bP() instanceof cp) {
            this.d(bu.class);
            ahn.m(new l(bu.bQ() % 7 + (int)(Math.random() * 2.0) + 1));
            this.d(bu.class);
            ahn.m(new l(bu.bQ()));
            slowDownEvent.cF();
        }
    };

    public WatchdogMode(String string, NoSlow noSlow) {
        super(string, noSlow);
    }
}

