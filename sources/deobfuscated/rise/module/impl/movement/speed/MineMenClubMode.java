/*
 * Decompiled with CFR 0.152.
 */
package rise.module.impl.movement.speed;

import hackclient.rise.ahj;
import hackclient.rise.aii;
import hackclient.rise.aik;
import hackclient.rise.bd;
import net.minecraft.init.Blocks;
import net.minecraft.network.aj;
import net.minecraft.network.play.server.t;
import net.minecraft.util.bt;
import rise.event.EventLink;
import rise.event.Listener;
import rise.event.impl.JumpEvent;
import rise.event.impl.MoveEvent;
import rise.event.impl.PacketReceiveEvent;
import rise.event.impl.PreMotionEvent;
import rise.event.impl.StrafeEvent;
import rise.module.Mode;
import rise.module.impl.movement.Speed;
import rise.value.BooleanValue;

public class MineMenClubMode
extends Mode<Speed> {
    private static float Qo = 0.0f;
    private static final float Qp = 45.0f;
    private int PR = 0;
    public final BooleanValue Qq = new BooleanValue("allow more strafing", (Mode<?>)this, (Boolean)true);
    @EventLink
    public final Listener<JumpEvent> Qr = jumpEvent -> ++this.PR;
    private double ue;
    private double ud;
    private double uf;
    @EventLink
    public final Listener<PacketReceiveEvent> Qs = packetReceiveEvent -> {
        t t2;
        aj<?> aj2 = packetReceiveEvent.dq();
        if (aj2 instanceof t && (t2 = (t)aj2).getEntityID() == MineMenClubMode.aER.bgK.getEntityId()) {
            this.ud = (double)t2.agN() / 8000.0;
            this.uf = (double)t2.agP() / 8000.0;
            this.ue = (double)t2.agP() / 8000.0;
        }
    };
    @EventLink
    public final Listener<MoveEvent> Qt = moveEvent -> {
        double d2 = bt.aJ(Math.toDegrees(aii.direction()));
        double d3 = bt.aJ(Math.toDegrees(Math.atan2(MineMenClubMode.aER.bgK.uf, MineMenClubMode.aER.bgK.ud)) - 90.0);
        double d4 = d2 / 1.4;
        if (MineMenClubMode.aER.bgK.ae > 8) {
            if (MineMenClubMode.aER.bgK.aO) {
                aii.strafe();
            }
            if (ahj.n(d2, d3) < 90.0) {
                aii.strafe();
            } else if (((Boolean)this.Qq.wD()).booleanValue()) {
                aii.strafe(aii.speed() * 0.7);
            }
        }
    };
    @EventLink
    public final Listener<StrafeEvent> Qu = strafeEvent -> {
        if (this.PR % 2 != 1 || MineMenClubMode.aER.bgK.aO) {
            // empty if block
        }
        if (MineMenClubMode.aER.bgK.tR == 10) {
            // empty if block
        }
        double d2 = Math.hypot(MineMenClubMode.aER.bgK.ud - (MineMenClubMode.aER.bgK.csh - MineMenClubMode.aER.bgK.csk), MineMenClubMode.aER.bgK.uf - (MineMenClubMode.aER.bgK.csj - MineMenClubMode.aER.bgK.csm));
        if (MineMenClubMode.aER.bgK.ae >= 8 && !MineMenClubMode.aER.bgK.aO && MineMenClubMode.aER.bgK.tR != 1 && (aik.p(0.0, MineMenClubMode.aER.bgK.ue, 0.0) == Blocks.cLc || MineMenClubMode.aER.bgK.tR <= 10) || !MineMenClubMode.aER.bgK.aO && MineMenClubMode.aER.bgK.tR != 1 && aik.p(0.0, MineMenClubMode.aER.bgK.ue, 0.0) == Blocks.cLc || MineMenClubMode.aER.bgK.ae >= 8) {
            // empty if block
        }
    };
    @EventLink
    public final Listener<PreMotionEvent> Qv = preMotionEvent -> {
        if (MineMenClubMode.aER.bgK.ae > 20) {
            // empty if block
        }
        double d2 = aii.roundToGround(preMotionEvent.getPosY());
        float f2 = bd.cY;
        if (MineMenClubMode.aER.bgK.aO) {
            MineMenClubMode.aER.bgK.jump();
        }
    };

    public MineMenClubMode(String string, Speed speed) {
        super(string, speed);
    }

    public static void a(MoveEvent moveEvent, double d2, float f2, float f3, float f4) {
        boolean bl2;
        if (f2 == 0.0f && f3 == 0.0f) {
            return;
        }
        float f5 = f4;
        boolean bl3 = bl2 = f2 < 0.0f;
        float f6 = 90.0f * (f2 > 0.0f ? 0.5f : (bl2 ? -0.5f : 1.0f));
        if (bl2) {
            f5 += 180.0f;
        }
        if (f3 > 0.0f) {
            f5 -= f6;
        } else if (f3 < 0.0f) {
            f5 += f6;
        }
        f5 = (f5 + 360.0f) % 360.0f;
        float f7 = f5 - Qo;
        f7 = (f7 + 180.0f) % 360.0f - 180.0f;
        Qo = Math.abs(f7) < 45.0f ? f5 : (Qo += Math.signum(f7) * 45.0f);
        Qo = (Qo + 360.0f) % 360.0f;
        double d3 = StrictMath.cos(Math.toRadians((double)Qo + 90.0));
        double d4 = StrictMath.cos(Math.toRadians(Qo));
        moveEvent.setPosX(d3 * d2);
        moveEvent.setPosZ(d4 * d2);
    }

    @Override
    public void onEnable() {
        this.ud = 0.0;
        this.uf = 0.0;
    }
}

