/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.protocol.version.ProtocolVersion
 */
package rise.module.impl.movement.wallclimb;

import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import de.florianmichael.vialoadingbase.ViaLoadingBase;
import hackclient.rise.afl;
import hackclient.rise.aii;
import hackclient.rise.bi;
import hackclient.rise.es;
import java.util.Objects;
import net.minecraft.block.Block;
import net.minecraft.block.BlockAir;
import net.minecraft.util.a;
import net.minecraft.util.b;
import rise.event.EventLink;
import rise.event.Listener;
import rise.event.impl.MoveInputEvent;
import rise.event.impl.PreMotionEvent;
import rise.event.impl.StrafeEvent;
import rise.module.Mode;
import rise.module.impl.movement.WallClimb;

public class WatchdogMode
extends Mode<WallClimb> {
    private double Tv = 0.42;
    private boolean Tw;
    @EventLink
    public final Listener<PreMotionEvent> Tx = preMotionEvent -> {
        if (WatchdogMode.aER.bgK == null) {
            return;
        }
        if (WatchdogMode.aER.bgK.ue < 0.0) {
            this.Tw = true;
        }
        if (this.Tw) {
            float f2;
            float f3 = WatchdogMode.aER.bgK.pl;
            float f4 = WatchdogMode.aER.bgK.bkr.cuW;
            if (f4 != 0.0f) {
                f3 += f4 < 0.0f ? 180.0f : 0.0f;
                float f5 = f4 = f4 < 0.0f ? -0.5f : 0.5f;
            }
            if ((f2 = WatchdogMode.aER.bgK.bkr.dzs) != 0.0f) {
                f3 += (f2 < 0.0f ? 90.0f : -90.0f) * f4;
            }
            double d2 = Math.toRadians(f3);
            double d3 = 1.0E-8;
            preMotionEvent.setYaw(f3);
            if (!Objects.equals(bi.dy, "35565") && !Objects.equals(bi.dx, "testnet.hypixel.net")) {
                preMotionEvent.setPosX(preMotionEvent.getPosX() - Math.sin(d2) * 1.0E-8);
                preMotionEvent.setPosZ(preMotionEvent.getPosZ() + Math.cos(d2) * 1.0E-8);
            }
            this.Tw = false;
        }
        if (WatchdogMode.aER.bgK.crR && WatchdogMode.aER.bgK.aO && !WatchdogMode.aER.aIY.chq.Re()) {
            WatchdogMode.aER.bgK.jump();
        }
    };
    @EventLink
    public final Listener<MoveInputEvent> Ty = moveInputEvent -> {
        if (WatchdogMode.aER.bgK.crR) {
            moveInputEvent.setStrafe(0.0f);
        }
    };
    @EventLink
    public final Listener<StrafeEvent> Tz = strafeEvent -> {
        if (WatchdogMode.aER.bgK == null) {
            return;
        }
        if (WatchdogMode.aER.bgK.tR != 5 || aii.speed() == 0.0) {
            // empty if block
        }
        if (WatchdogMode.aER.bgK.tR != 6 || aii.speed() == 0.0) {
            // empty if block
        }
        if (!WatchdogMode.aER.bgK.crR || !WatchdogMode.aER.aIY.chq.Re() || !(this.Tv > 0.42) || WatchdogMode.aER.bgK.aO) {
            // empty if block
        }
    };
    @EventLink
    public final Listener<es> TA = es2 -> {
        if (WatchdogMode.aER.bgK == null) {
            return;
        }
        b b2 = es2.dg();
        if (b2 == null) {
            return;
        }
        Block block = es2.df();
        if (!(block instanceof BlockAir)) {
            return;
        }
        if ((double)b2.wu() >= WatchdogMode.aER.bgK.gX) {
            return;
        }
        if (!WatchdogMode.aER.bgK.crR) {
            return;
        }
        if (WatchdogMode.aER.bgK.isOnLadder()) {
            return;
        }
        double d2 = (double)((int)WatchdogMode.aER.bgK.gX) - 1.0;
        a a2 = a.h(0.0, 0.0, 0.0, 1.0, 1.0, 1.0).ae(WatchdogMode.aER.bgK.gW, d2, WatchdogMode.aER.bgK.gY);
        double d3 = 1.0E-7;
        a2 = a2.ad(-1.0E-7, 0.0, -1.0E-7);
        es2.a(a2);
    };

    public WatchdogMode(String string, WallClimb wallClimb) {
        super(string, wallClimb);
    }

    @Override
    public void onEnable() {
        if (ViaLoadingBase.getInstance().getTargetVersion().newerThan(ProtocolVersion.v1_8) && bi.dx != null && bi.dx.contains("hypixel")) {
            afl.b("this will only work 1.8 on hypixel", new Object[0]);
        } else {
            afl.b("don't move horizontally while you spider and only spider on full blocks", new Object[0]);
        }
        this.Tw = false;
    }

    @Override
    public void onDisable() {
        WatchdogMode.aER.bgC.dAp = 1.0f;
        this.Tw = false;
    }
}

