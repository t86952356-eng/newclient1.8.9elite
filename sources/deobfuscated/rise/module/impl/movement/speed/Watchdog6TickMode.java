/*
 * Decompiled with CFR 0.152.
 */
package rise.module.impl.movement.speed;

import hackclient.rise.afl;
import hackclient.rise.ahj;
import hackclient.rise.aii;
import hackclient.rise.aik;
import hackclient.rise.eh;
import java.lang.runtime.SwitchBootstraps;
import java.util.Objects;
import net.minecraft.block.Block;
import net.minecraft.block.BlockStairs;
import net.minecraft.client.Minecraft;
import net.minecraft.client.multiplayer.j;
import net.minecraft.entity.c;
import net.minecraft.init.Blocks;
import net.minecraft.network.aj;
import net.minecraft.util.a;
import net.minecraft.util.b;
import net.minecraft.util.bt;
import net.minecraft.util.da;
import rise.event.EventLink;
import rise.event.Listener;
import rise.event.impl.JumpEvent;
import rise.event.impl.MoveEvent;
import rise.event.impl.MoveInputEvent;
import rise.event.impl.PacketReceiveEvent;
import rise.event.impl.PreMotionEvent;
import rise.event.impl.PreUpdateEvent;
import rise.event.impl.StrafeEvent;
import rise.module.Mode;
import rise.module.impl.movement.Speed;

public class Watchdog6TickMode
extends Mode<Speed> {
    private static float Qo = 0.0f;
    private static float Qp = 42.5f;
    private c Rr = null;
    private int PR = 0;
    private boolean Rs = false;
    public static boolean Mk;
    public static boolean Ml;
    public static int hQ;
    double jy;
    boolean Mm;
    public static int Mn;
    public static int Mo;
    private double Mr;
    private double Ms;
    private double Mt;
    private double Mu;
    private double Mv;
    public static double Mw;
    @EventLink
    public final Listener<PacketReceiveEvent> Rt = packetReceiveEvent -> {
        aj<?> aj2 = packetReceiveEvent.dq();
        Objects.requireNonNull(aj2);
        aj<?> aj3 = aj2;
        int n2 = 0;
        switch (SwitchBootstraps.typeSwitch("typeSwitch", new Object[]{}, aj3, n2)) {
            default: 
        }
    };
    @EventLink
    public final Listener<MoveInputEvent> Ru = moveInputEvent -> {
        if (hQ < 23 && hQ > 7) {
            moveInputEvent.setJump(false);
        }
    };
    @EventLink
    public final Listener<MoveEvent> Rv = moveEvent -> {
        if (hQ < 23 && hQ > 7) {
            moveEvent.setPosZ(0.0);
            moveEvent.setPosX(0.0);
        }
    };
    @EventLink
    public final Listener<StrafeEvent> Rw = strafeEvent -> {
        double d2;
        double d3;
        if (Watchdog6TickMode.aER.bgK.aO) {
            this.Rs = false;
        }
        a a2 = Watchdog6TickMode.aER.bgK.Us();
        j j2 = Watchdog6TickMode.aER.bgF;
        for (d3 = a2.dtH; d3 < a2.dtK; d3 += 0.3) {
            for (d2 = a2.dtJ; d2 < a2.dtM; d2 += 0.3) {
                b b2 = new b(d3, a2.dtI - 0.05, d2);
                Block block = j2.L(b2).df();
                if (!(block instanceof BlockStairs)) continue;
                this.Rs = true;
                break;
            }
            if (this.Rs) break;
        }
        d3 = bt.aJ(Math.toDegrees(aii.direction()));
        d2 = bt.aJ(Math.toDegrees(Math.atan2(Watchdog6TickMode.aER.bgK.uf, Watchdog6TickMode.aER.bgK.ud)) - 90.0);
        if (Watchdog6TickMode.aER.bgK.cus == 9 && hQ < 23) {
            hQ = 23;
        }
        if (hQ > 24 && !this.Rs && Watchdog6TickMode.aER.bgK.csW > 5) {
            if (Watchdog6TickMode.aER.bgK.tR == 0) {
                if (hQ > 48 || !Watchdog6TickMode.aER.bgK.a(net.minecraft.potion.a.dgw) && hQ > 66) {
                    aii.strafe(aii.getAllowedHorizontalDistance());
                } else {
                    aii.strafe(aii.getAllowedHorizontalDistance() - 0.01);
                }
                if (Watchdog6TickMode.aER.bgK.aO) {
                    Watchdog6TickMode.aER.bgK.jump();
                }
            }
            if (Watchdog6TickMode.aER.bgK.tR == 1) {
                if (Watchdog6TickMode.aER.bgK.a(net.minecraft.potion.a.dgw) && Watchdog6TickMode.aER.bgK.b((net.minecraft.potion.a)net.minecraft.potion.a.dgw).dhk + 1 >= 2) {
                    aii.strafe(0.48);
                } else if (Watchdog6TickMode.aER.bgK.a(net.minecraft.potion.a.dgw) && Watchdog6TickMode.aER.bgK.b((net.minecraft.potion.a)net.minecraft.potion.a.dgw).dhk + 1 >= 2) {
                    aii.strafe(0.4);
                } else if (Watchdog6TickMode.aER.bgK.a(net.minecraft.potion.a.dgw) && Watchdog6TickMode.aER.bgK.b((net.minecraft.potion.a)net.minecraft.potion.a.dgw).dhk + 1 == 1) {
                    aii.strafe(0.405);
                } else {
                    aii.strafe(0.33);
                }
                Watchdog6TickMode.aER.bgK.ue = 0.31;
            }
            if (Watchdog6TickMode.aER.bgK.tR == 2) {
                if (Watchdog6TickMode.aER.bgK.a(net.minecraft.potion.a.dgw)) {
                    Watchdog6TickMode.aER.bgK.ud *= 1.005;
                    Watchdog6TickMode.aER.bgK.uf *= 1.005;
                }
                Watchdog6TickMode.aER.bgK.ue -= 0.11;
            }
            if (Watchdog6TickMode.aER.bgK.tR == 3) {
                Watchdog6TickMode.aER.bgK.ue -= 0.22;
            }
            if (Watchdog6TickMode.aER.bgK.tR == 4) {
                if (Watchdog6TickMode.aER.bgK.a(net.minecraft.potion.a.dgw)) {
                    if (hQ > 66) {
                        Watchdog6TickMode.aER.bgK.ud *= 1.01;
                        Watchdog6TickMode.aER.bgK.uf *= 1.01;
                    }
                } else {
                    Watchdog6TickMode.aER.bgK.ud *= 1.005;
                    Watchdog6TickMode.aER.bgK.uf *= 1.005;
                }
            }
            if (Watchdog6TickMode.aER.bgK.tR == 5 && aik.ae(Watchdog6TickMode.aER.bgK.ue * 2.0)) {
                Watchdog6TickMode.aER.bgK.ue += 0.085;
                if (Watchdog6TickMode.aER.bgK.a(net.minecraft.potion.a.dgw)) {
                    if (hQ > 66) {
                        aii.strafe(aii.getAllowedHorizontalDistance() * 1.069);
                    }
                } else {
                    aii.strafe();
                    if (hQ > 154) {
                        // empty if block
                    }
                }
            }
            if (aik.p(0.0, Watchdog6TickMode.aER.bgK.ue, 0.0) != Blocks.cLc) {
                if (Watchdog6TickMode.aER.bgK.a(net.minecraft.potion.a.dgw)) {
                    if (hQ > 66) {
                        aii.strafe(aii.getAllowedHorizontalDistance() * 1.059);
                    }
                } else {
                    aii.strafe();
                }
            }
            if (aik.vz()) {
                // empty if block
            }
            Watchdog6TickMode.aER.bgK.cso = 0.2f;
            if (Watchdog6TickMode.aER.bgK.tR == 1) {
                // empty if block
            }
            if (aii.speed() < 0.125) {
                aii.strafe(0.125);
            }
            if (ahj.n(d3, d2) > 40.0 && Watchdog6TickMode.aER.bgK.a(net.minecraft.potion.a.dgw)) {
                Watchdog6TickMode.aER.bgK.ud *= 0.74;
                Watchdog6TickMode.aER.bgK.uf *= 0.74;
            }
        }
        if (hQ < 8 || this.Rs || Watchdog6TickMode.aER.bgK.csW < 6) {
            if (Watchdog6TickMode.aER.bgK.aO) {
                Watchdog6TickMode.aER.bgK.jump();
            }
            if (Watchdog6TickMode.aER.bgK.aO && !Watchdog6TickMode.aER.bgK.a(net.minecraft.potion.a.dgw)) {
                aii.strafe(aii.getAllowedHorizontalDistance() - 0.01);
            } else if (Watchdog6TickMode.aER.bgK.aO) {
                aii.strafe(0.26);
            }
            if (aii.speed() < 0.125) {
                aii.strafe(0.125);
            }
            if (Watchdog6TickMode.aER.bgK.tR == 1) {
                aii.strafe();
                Watchdog6TickMode.aER.bgK.ue += (double)0.057f;
            }
            if (Watchdog6TickMode.aER.bgK.tR == 3) {
                Watchdog6TickMode.aER.bgK.ue -= (double)0.1309f;
            }
            if (Watchdog6TickMode.aER.bgK.tR == 4) {
                Watchdog6TickMode.aER.bgK.ue -= 0.2;
            }
            if (Watchdog6TickMode.aER.bgK.tR == 5) {
                // empty if block
            }
        }
        if (hQ == 24) {
            aii.strafe(0.125);
        }
    };
    @EventLink
    public final Listener<PreUpdateEvent> Rx = preUpdateEvent -> {
        if (hQ <= 44 || hQ < 47) {
            // empty if block
        }
    };
    @EventLink
    public final Listener<PreMotionEvent> Ry = preMotionEvent -> {
        boolean bl2 = false;
        a a2 = Watchdog6TickMode.aER.bgK.Us();
        j j2 = Watchdog6TickMode.aER.bgF;
        if (++hQ < 23) {
            if (Watchdog6TickMode.aER.bgK.aO && hQ > 3) {
                preMotionEvent.setPosY(preMotionEvent.getPosY() + (hQ % 2 != 0 ? 0.296875 : 0.001));
                preMotionEvent.setOnGround(false);
            }
        } else if (Watchdog6TickMode.aER.bgK.aO) {
            preMotionEvent.setPosY(preMotionEvent.getPosY() + 0.001);
        }
    };
    @EventLink
    public final Listener<JumpEvent> Rz = jumpEvent -> {
        if (hQ < 23 || hQ < 8 || this.Rs || Watchdog6TickMode.aER.bgK.csW < 6) {
            jumpEvent.setJumpMotion(0.42f);
        } else {
            jumpEvent.setJumpMotion(0.4f);
        }
    };
    @EventLink
    public final Listener<eh> RA = eh2 -> {
        double d2;
        double d3 = bt.aJ(Math.toDegrees(aii.direction()));
        if (ahj.n(d3, d2 = bt.aJ(Math.toDegrees(Math.atan2(Watchdog6TickMode.aER.bgK.uf, Watchdog6TickMode.aER.bgK.ud)) - 90.0)) > 90.0) {
            if (Watchdog6TickMode.aER.bgK.a(net.minecraft.potion.a.dgw)) {
                aii.a(aii.speed(), (float)d2 - 180.0f);
            } else {
                aii.a(aii.speed(), (float)d2 - 180.0f);
            }
        }
    };

    public Watchdog6TickMode(String string, Speed speed) {
        super(string, speed);
    }

    @Override
    public void onEnable() {
        this.Mu = Watchdog6TickMode.aER.bgK.pl;
        this.Mv = Watchdog6TickMode.aER.bgK.pm;
        hQ = 0;
        Watchdog6TickMode.aER.bgK.pl = (float)this.Mu;
        if (Watchdog6TickMode.aER.bgK.aO) {
            Watchdog6TickMode.aER.bgK.jump();
        } else {
            afl.b("start on the ground", new Object[0]);
            ((Speed)this.wy()).setEnabled(false);
        }
        this.Mr = Watchdog6TickMode.aER.bgK.gW;
        this.Ms = Watchdog6TickMode.aER.bgK.gX;
        this.Mt = Watchdog6TickMode.aER.bgK.gY;
        this.jy = Watchdog6TickMode.aER.bgK.gX;
        Ml = true;
        Mk = false;
    }

    @Override
    public void onDisable() {
        double d2 = Watchdog6TickMode.aER.bgK.gW - this.Mr;
        double d3 = Watchdog6TickMode.aER.bgK.gX - this.Ms;
        double d4 = Watchdog6TickMode.aER.bgK.gY - this.Mt;
        double d5 = Math.sqrt(d2 * d2 + d3 * d3 + d4 * d4);
        Mk = false;
        this.Mm = false;
        afl.b(Watchdog6TickMode.aER.bgK.ae, new Object[0]);
        afl.c("Distance traveled: " + d5, new Object[0]);
        if (Watchdog6TickMode.aER.bgK.aO) {
            aii.stop();
        }
        Watchdog6TickMode.aER.bgK.cso = 0.6f;
    }

    private boolean a(da da2, da da3) {
        j j2 = Minecraft.getMinecraft().bgF;
        net.minecraft.client.entity.c c2 = Minecraft.getMinecraft().bgK;
        a a2 = c2.Us().ae(da3.dAG, da3.dAH, da3.dAI);
        return !j2.a((c)c2, a2).isEmpty();
    }
}

