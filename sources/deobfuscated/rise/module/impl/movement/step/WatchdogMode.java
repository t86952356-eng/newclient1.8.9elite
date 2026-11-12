/*
 * Decompiled with CFR 0.152.
 */
package rise.module.impl.movement.step;

import hackclient.rise.ahn;
import hackclient.rise.aii;
import hackclient.rise.aik;
import hackclient.rise.fc;
import net.minecraft.block.BlockSlab;
import net.minecraft.block.BlockStairs;
import net.minecraft.network.play.client.f;
import rise.event.EventLink;
import rise.event.Listener;
import rise.event.impl.PreMotionEvent;
import rise.event.impl.PreUpdateEvent;
import rise.event.impl.TickEvent;
import rise.module.Mode;
import rise.module.impl.movement.Speed;
import rise.module.impl.movement.Step;
import rise.module.impl.player.Scaffold;

public class WatchdogMode
extends Mode<Step> {
    private boolean Sk;
    @EventLink
    public final Listener<PreUpdateEvent> SE = preUpdateEvent -> {};
    @EventLink
    public final Listener<PreMotionEvent> SF = preMotionEvent -> {
        if (WatchdogMode.aER.bgK.aO) {
            // empty if block
        }
    };
    private double St;
    private int hV;
    private long SG;
    private boolean Ka = false;
    @EventLink
    public final Listener<PreMotionEvent> SH = preMotionEvent -> {
        if (this.e(Scaffold.class).isEnabled()) {
            return;
        }
        WatchdogMode.aER.bgK.cso = WatchdogMode.aER.bgK.aO && !aik.vy() && !WatchdogMode.aER.aIY.chq.Re() ? 1.0f : 0.6f;
    };
    @EventLink
    public final Listener<fc> SI = fc2 -> {
        double d2;
        aii.strafe(aii.vs());
        this.St = d2 = fc2.da();
        if (this.e(Speed.class).isEnabled() && d2 > (double)0.6f) {
            this.e(Speed.class).setEnabled(false);
            this.Ka = true;
        }
        if (this.e(Scaffold.class).isEnabled()) {
            return;
        }
        WatchdogMode.aER.bgK.cso = 1.0f;
        if (!WatchdogMode.aER.bgK.aO || aik.vy() || aik.o(WatchdogMode.aER.bgK.gW, WatchdogMode.aER.bgK.gX, WatchdogMode.aER.bgK.gY) instanceof BlockSlab || aik.o(WatchdogMode.aER.bgK.gW, WatchdogMode.aER.bgK.gX, WatchdogMode.aER.bgK.gY) instanceof BlockStairs) {
            return;
        }
        if (d2 <= (double)0.6f) {
            return;
        }
        double[] dArray = new double[]{};
        if (d2 == 1.0) {
            dArray = new double[]{0.42f, 0.75, 1.0};
        }
        this.SG = System.currentTimeMillis() + 300L;
        for (double d3 : dArray) {
            WatchdogMode.aER.bgC.dAp = 0.25f;
            ahn.m(new f(WatchdogMode.aER.bgK.gW, WatchdogMode.aER.bgK.gX + d3, WatchdogMode.aER.bgK.gY, false));
            this.hV = 0;
        }
    };
    @EventLink
    public final Listener<TickEvent> SJ = tickEvent -> {
        ++this.hV;
        if (this.hV == 1) {
            WatchdogMode.aER.bgC.dAp = 1.0f;
        }
        if (this.Ka && System.currentTimeMillis() > this.SG) {
            this.e(Speed.class).setEnabled(true);
            this.Ka = false;
            this.SG = 0L;
        }
    };

    public WatchdogMode(String string, Step step) {
        super(string, step);
    }

    @Override
    public void onDisable() {
        WatchdogMode.aER.bgK.cso = 0.6f;
        this.Ka = false;
        this.SG = 0L;
    }
}

