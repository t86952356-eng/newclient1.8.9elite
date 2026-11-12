/*
 * Decompiled with CFR 0.152.
 */
package rise.module.impl.movement.longjump;

import hackclient.rise.afl;
import hackclient.rise.ahn;
import hackclient.rise.aii;
import net.minecraft.init.Items;
import net.minecraft.item.az;
import net.minecraft.item.co;
import net.minecraft.network.aj;
import net.minecraft.network.play.client.k;
import net.minecraft.network.play.server.t;
import rip.vantage.commons.util.time.a;
import rise.event.EventLink;
import rise.event.Listener;
import rise.event.impl.PacketReceiveEvent;
import rise.event.impl.PacketSendEvent;
import rise.event.impl.PreMotionEvent;
import rise.event.impl.StrafeEvent;
import rise.module.Mode;
import rise.module.impl.movement.LongJump;
import rise.value.BooleanValue;

public class WatchdogFireBall2Mode
extends Mode<LongJump> {
    public final BooleanValue MO = new BooleanValue("Boost", (Mode<?>)this, (Boolean)true);
    private int qI = -1;
    private int hV = -1;
    private boolean Jb;
    public static boolean Jc;
    private boolean Jd;
    private int Je;
    private boolean Jf;
    private boolean MH;
    a bN = new a();
    @EventLink
    public final Listener<PacketSendEvent> MP = packetSendEvent -> {
        aj<?> aj2 = packetSendEvent.dq();
        if (aj2 instanceof k && ((k)packetSendEvent.dq()).ls() != null && ((k)packetSendEvent.dq()).ls().bP() instanceof az) {
            this.Jf = true;
            if (WatchdogFireBall2Mode.aER.bgK.aO) {
                WatchdogFireBall2Mode.aER.bgK.jump();
            }
        }
    };
    @EventLink
    public final Listener<PacketReceiveEvent> MQ = packetReceiveEvent -> {
        if (WatchdogFireBall2Mode.aER.bgK == null || WatchdogFireBall2Mode.aER.bgF == null) {
            return;
        }
        aj<?> aj2 = packetReceiveEvent.dq();
        if (aj2 instanceof t) {
            if (((t)packetReceiveEvent.dq()).getEntityID() != WatchdogFireBall2Mode.aER.bgK.getEntityId()) {
                return;
            }
            if (this.Jf) {
                this.hV = 0;
                this.Jb = true;
                this.Jf = false;
                Jc = true;
            }
        }
    };
    @EventLink(cH=0)
    public final Listener<PreMotionEvent> MR = preMotionEvent -> {
        if (WatchdogFireBall2Mode.aER.bgK == null || WatchdogFireBall2Mode.aER.bgF == null) {
            return;
        }
        if (WatchdogFireBall2Mode.aER.bgK.cus == 10) {
            WatchdogFireBall2Mode.aER.bgK.ue = 1.1f;
        }
        if (WatchdogFireBall2Mode.aER.bgK.ae <= 80 && WatchdogFireBall2Mode.aER.bgK.ae >= 1 && (WatchdogFireBall2Mode.aER.bgK.ae % 1 == 0 || WatchdogFireBall2Mode.aER.bgK.ae <= 15)) {
            WatchdogFireBall2Mode.aER.bgK.ue += (double)0.028f;
        }
        if (WatchdogFireBall2Mode.aER.bgK.ae == 28) {
            if (((Boolean)this.MO.wD()).booleanValue()) {
                // empty if block
            }
            WatchdogFireBall2Mode.aER.bgK.ue = 0.16f;
        }
        if (WatchdogFireBall2Mode.aER.bgK.ae == 33) {
            WatchdogFireBall2Mode.aER.bgK.ue = -0.082f;
        }
        if (WatchdogFireBall2Mode.aER.bgK.ae == 27) {
            // empty if block
        }
        if (WatchdogFireBall2Mode.aER.bgK.ae == 22) {
            // empty if block
        }
        if (WatchdogFireBall2Mode.aER.bgK.ae >= 35 && WatchdogFireBall2Mode.aER.bgK.ae <= 50) {
            aii.strafe();
        }
        if (WatchdogFireBall2Mode.aER.bgK.ae >= 3 && WatchdogFireBall2Mode.aER.bgK.ae <= 50) {
            aii.strafe();
        }
        if (this.Je == 0) {
            preMotionEvent.setYaw(WatchdogFireBall2Mode.aER.bgK.pl - 180.0f);
            preMotionEvent.setPitch(89.0f);
            int n2 = this.hx();
            if (n2 != -1 && n2 != WatchdogFireBall2Mode.aER.bgK.cHV.cJE) {
                this.qI = WatchdogFireBall2Mode.aER.bgK.cHV.cJE;
                if (WatchdogFireBall2Mode.aER.bgK.crx > 1) {
                    WatchdogFireBall2Mode.aER.bgK.cHV.cJE = n2;
                }
            }
        }
        if (this.Je == 1) {
            if (!this.Jd) {
                ahn.m(new k(WatchdogFireBall2Mode.aER.bgK.Vk()));
                this.Jd = true;
            }
        } else if (this.Je == 2 && this.qI != -1) {
            WatchdogFireBall2Mode.aER.bgK.cHV.cJE = this.qI;
            this.qI = -1;
        }
        if (this.hV > 1) {
            this.toggle();
            return;
        }
        if (this.Jb) {
            Jc = true;
            this.hy();
            ++this.hV;
        }
        if (this.Je < 3) {
            ++this.Je;
        }
        if (this.Jb) {
            if (this.hV > 1) {
                this.Jb = false;
                Jc = false;
                this.hV = 0;
                return;
            }
            Jc = true;
            ++this.hV;
            this.hy();
        }
    };
    @EventLink
    public final Listener<StrafeEvent> MS = strafeEvent -> {
        if (WatchdogFireBall2Mode.aER.bgK.ae <= 70 && WatchdogFireBall2Mode.aER.bgK.ae >= 1 && (WatchdogFireBall2Mode.aER.bgK.ae % 1 == 0 || WatchdogFireBall2Mode.aER.bgK.ae <= 15)) {
            WatchdogFireBall2Mode.aER.bgK.ud *= 1.0003;
            WatchdogFireBall2Mode.aER.bgK.uf *= 1.0003;
        }
        if (WatchdogFireBall2Mode.aER.bgK.cus == 10) {
            // empty if block
        }
        if (WatchdogFireBall2Mode.aER.bgK.ae == 1) {
            WatchdogFireBall2Mode.aER.bgK.ud *= 1.15;
            WatchdogFireBall2Mode.aER.bgK.uf *= 1.15;
            WatchdogFireBall2Mode.aER.bgK.ue = 1.33;
        }
        if (WatchdogFireBall2Mode.aER.bgK.ae == 15) {
            WatchdogFireBall2Mode.aER.bgK.ue = 0.39;
        }
        if (WatchdogFireBall2Mode.aER.bgK.ae == 22) {
            WatchdogFireBall2Mode.aER.bgK.ue = 0.05;
        }
        if (WatchdogFireBall2Mode.aER.bgK.ae == 23) {
            WatchdogFireBall2Mode.aER.bgK.ue = 0.005;
        }
        if (WatchdogFireBall2Mode.aER.bgK.ae == 24) {
            WatchdogFireBall2Mode.aER.bgK.ue += 0.01;
            afl.c(WatchdogFireBall2Mode.aER.bgK.ue, new Object[0]);
        }
        if (WatchdogFireBall2Mode.aER.bgK.ae == 25) {
            WatchdogFireBall2Mode.aER.bgK.ue += 0.015;
            afl.c(WatchdogFireBall2Mode.aER.bgK.ue, new Object[0]);
        }
        if (WatchdogFireBall2Mode.aER.bgK.ae == 26) {
            WatchdogFireBall2Mode.aER.bgK.ue += 0.015;
            afl.c(WatchdogFireBall2Mode.aER.bgK.ue, new Object[0]);
        }
        if (WatchdogFireBall2Mode.aER.bgK.ae == 33) {
            WatchdogFireBall2Mode.aER.bgK.ue += 0.015;
        }
        if (WatchdogFireBall2Mode.aER.bgK.ae == 35) {
            WatchdogFireBall2Mode.aER.bgK.ue += 0.015;
            afl.c(WatchdogFireBall2Mode.aER.bgK.ue, new Object[0]);
        }
        if (WatchdogFireBall2Mode.aER.bgK.ae == 38) {
            WatchdogFireBall2Mode.aER.bgK.ue += 0.03;
            afl.c(WatchdogFireBall2Mode.aER.bgK.ue, new Object[0]);
        }
        if (WatchdogFireBall2Mode.aER.bgK.cus == 8) {
            WatchdogFireBall2Mode.aER.bgK.ud *= 1.02;
            WatchdogFireBall2Mode.aER.bgK.uf *= 1.02;
        }
        if (WatchdogFireBall2Mode.aER.bgK.cus == 7) {
            WatchdogFireBall2Mode.aER.bgK.ud *= 1.0004;
            WatchdogFireBall2Mode.aER.bgK.uf *= 1.0004;
        }
        if (WatchdogFireBall2Mode.aER.bgK.cus == 6) {
            WatchdogFireBall2Mode.aER.bgK.ud *= 1.0004;
            WatchdogFireBall2Mode.aER.bgK.uf *= 1.0004;
        }
        if (WatchdogFireBall2Mode.aER.bgK.cus == 5) {
            WatchdogFireBall2Mode.aER.bgK.ud *= 1.0004;
            WatchdogFireBall2Mode.aER.bgK.uf *= 1.0004;
        }
        if (WatchdogFireBall2Mode.aER.bgK.cus <= 4 && WatchdogFireBall2Mode.aER.bgK.cus != 0) {
            WatchdogFireBall2Mode.aER.bgK.ud *= 1.0004;
            WatchdogFireBall2Mode.aER.bgK.uf *= 1.0004;
        }
    };

    public WatchdogFireBall2Mode(String string, LongJump longJump) {
        super(string, longJump);
    }

    @Override
    public void onDisable() {
        if (WatchdogFireBall2Mode.aER.bgK.aO) {
            aii.stop();
        }
        if (this.qI != -1) {
            WatchdogFireBall2Mode.aER.bgK.cHV.cJE = this.qI;
        }
        this.qI = -1;
        this.hV = -1;
        this.Jd = false;
        Jc = false;
        this.Jb = false;
        this.Je = 0;
    }

    @Override
    public void onEnable() {
        if (this.hx() == -1) {
            afl.b("Could not find Fireball", new Object[0]);
            this.toggle();
            return;
        }
        Jc = true;
        this.Je = 0;
    }

    private void hy() {
        aii.strafe(1.768f);
    }

    private int hx() {
        int n2 = -1;
        for (int i2 = 0; i2 < 9; ++i2) {
            co co2 = WatchdogFireBall2Mode.aER.bgK.cHV.fi(i2);
            if (co2 == null || co2.bP() != Items.cRP) continue;
            n2 = i2;
            break;
        }
        return n2;
    }
}

