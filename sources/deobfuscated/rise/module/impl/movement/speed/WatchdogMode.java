/*
 * Decompiled with CFR 0.152.
 */
package rise.module.impl.movement.speed;

import hackclient.rise.afl;
import hackclient.rise.ahj;
import hackclient.rise.aii;
import hackclient.rise.aik;
import hackclient.rise.aks;
import hackclient.rise.bb;
import hackclient.rise.bd;
import hackclient.rise.eh;
import hackclient.rise.es;
import java.util.Objects;
import java.util.Random;
import net.minecraft.block.BlockIce;
import net.minecraft.block.BlockPackedIce;
import net.minecraft.client.gui.inventory.h;
import net.minecraft.init.Blocks;
import net.minecraft.network.aj;
import net.minecraft.network.play.server.t;
import net.minecraft.potion.a;
import net.minecraft.util.bt;
import rise.Client;
import rise.event.EventLink;
import rise.event.Listener;
import rise.event.impl.JumpEvent;
import rise.event.impl.KeyboardInputEvent;
import rise.event.impl.MoveEvent;
import rise.event.impl.MoveInputEvent;
import rise.event.impl.PacketReceiveEvent;
import rise.event.impl.PreMotionEvent;
import rise.event.impl.StrafeEvent;
import rise.module.Mode;
import rise.module.impl.combat.Velocity;
import rise.module.impl.movement.InventoryMove;
import rise.module.impl.movement.Speed;
import rise.module.impl.player.Scaffold;
import rise.module.impl.player.scaffold.WdMode;
import rise.value.BooleanValue;
import rise.value.ModeValue;

public class WatchdogMode
extends Mode<Speed> {
    private final ModeValue RB = new ModeValue("Type", this).a(new Mode[]{new aks("Strafe")}).a(new Mode[]{new aks("Low Strafe")}).a(new Mode[]{new aks("NCP Strafe")}).co("Low Strafe");
    public final BooleanValue RC = new BooleanValue("Air Strafe", (Mode<?>)this, (Boolean)true);
    public final BooleanValue RD = new BooleanValue("Always Glide Strafe", (Mode<?>)this, (Boolean)true);
    public final BooleanValue RE = new BooleanValue("Friction Override", (Mode<?>)this, (Boolean)true);
    public final BooleanValue RF = new BooleanValue("Friction Full Disabler", (Mode<?>)this, (Boolean)true);
    public final BooleanValue RG = new BooleanValue("Damage Boost", (Mode<?>)this, (Boolean)false);
    public final BooleanValue RH = new BooleanValue("Damage Strafe (Hypixel Fly Disabler)", (Mode<?>)this, (Boolean)false);
    public final BooleanValue RI = new BooleanValue("UHC Mode", (Mode<?>)this, (Boolean)false);
    public final BooleanValue RJ = new BooleanValue("Alternate Motion", (Mode<?>)this, (Boolean)false);
    public static boolean RK = false;
    boolean RL = false;
    public static boolean RM = false;
    boolean RN = false;
    boolean RO = false;
    boolean RP = false;
    boolean RQ = false;
    private double LL;
    private int Px;
    private int sG;
    private boolean vh;
    private int RR;
    private boolean RS;
    public static boolean HJ;
    private boolean El;
    private boolean RT;
    private static float Qo;
    private static final float RU = 8.0f;
    @EventLink
    public final Listener<MoveInputEvent> RV = moveInputEvent -> moveInputEvent.setJump(false);
    @EventLink
    public final Listener<PacketReceiveEvent> RW = packetReceiveEvent -> {
        t t2;
        aj<?> aj2;
        if (!this.e(Velocity.class).isEnabled() && ((Mode)this.RB.wD()).getName() == "Low Strafe" && (aj2 = packetReceiveEvent.dq()) instanceof t && (t2 = (t)aj2).getEntityID() == WatchdogMode.aER.bgK.getEntityId() && (WatchdogMode.aER.bgK.tR == 1 || WatchdogMode.aER.bgK.tR == 2 || WatchdogMode.aER.bgK.tR == 3)) {
            packetReceiveEvent.cF();
        }
    };
    @EventLink(cH=3)
    public final Listener<PreMotionEvent> RX = preMotionEvent -> {
        double d2;
        RK = (Boolean)this.RG.wD();
        RM = (Boolean)this.RH.wD();
        if (aii.isMoving()) {
            if (WatchdogMode.aER.bgK.ae < 10 && ((Boolean)this.RH.wD()).booleanValue()) {
                aii.strafe();
            } else if (WatchdogMode.aER.bgK.ae == 1) {
                aii.strafe();
            }
        } else if (WatchdogMode.aER.bgK.ae == 1) {
            WatchdogMode.aER.bgK.ud *= -1.0;
            WatchdogMode.aER.bgK.uf *= -1.0;
        }
        if (WatchdogMode.aER.bgK.isInWater() && WatchdogMode.aER.bgK.crZ && WatchdogMode.aER.bgK.isInLava()) {
            this.vh = true;
            return;
        }
        if (this.e(Scaffold.class).isEnabled()) {
            this.RO = true;
        }
        if (WatchdogMode.aER.bgK.crR || WatchdogMode.aER.bgK.Zz < 2) {
            this.RT = true;
            this.Px = WatchdogMode.aER.bgK.aRg + 9;
        }
        if (!WatchdogMode.aER.bgK.crR && WatchdogMode.aER.bgK.aRg > this.Px) {
            this.RT = false;
            this.RS = false;
        }
        if (aik.p(0.0, -1.0, 0.0) == Blocks.cOD || aik.p(0.0, -1.0, 0.0) == Blocks.cMK) {
            this.RL = true;
        } else if (WatchdogMode.aER.bgK.tR > 1) {
            this.RL = false;
        }
        if (WatchdogMode.aER.bgK.aO) {
            this.RP = false;
        }
        if (aik.p(0.0, WatchdogMode.aER.bgK.ue, 0.0) != Blocks.cLc) {
            this.vh = false;
        }
        if (WatchdogMode.aER.bgK.crW && !WatchdogMode.aER.bgK.aO && ((Mode)this.RB.wD()).getName() == "Low Strafe" && aik.b(2.0, true)) {
            this.vh = true;
        }
        if (WatchdogMode.aER.bgK.csW <= 10) {
            // empty if block
        }
        if (Math.abs((d2 = preMotionEvent.getPosY()) - (double)Math.round(d2)) > 0.0325 && WatchdogMode.aER.bgK.aO) {
            this.RN = true;
        } else if (WatchdogMode.aER.bgK.aO) {
            this.RN = false;
        }
        if (!WatchdogMode.aER.bgK.aO || WatchdogMode.aER.bgK.crZ) {
            // empty if block
        }
        if (WatchdogMode.aER.bgK.crZ) {
            WatchdogMode.aER.bgK.ue = -0.0784000015258789;
            aii.strafe(aii.getAllowedHorizontalDistance() * 3.1);
        }
        if (WatchdogMode.aER.bgK.crZ && WatchdogMode.aER.bgK.a(a.dgw) && WatchdogMode.aER.bgK.b((a)a.dgw).dhk + 1 >= 1 && !WatchdogMode.aER.bgK.aO) {
            aii.strafe(aii.getAllowedHorizontalDistance() * 3.8);
        }
        if (WatchdogMode.aER.bgK.crZ && WatchdogMode.aER.bgK.a(a.dgw) && WatchdogMode.aER.bgK.b((a)a.dgw).dhk + 1 >= 2 && !WatchdogMode.aER.bgK.aO) {
            aii.strafe(aii.getAllowedHorizontalDistance() * 4.0);
        }
        if (aik.b(0.0, true)) {
            // empty if block
        }
        if ((double)bd.cY > 1.4) {
            // empty if block
        }
        if (!WatchdogMode.aER.bgK.aO || Math.abs(d2 - (double)Math.round(d2)) > 0.03 || !this.RO) {
            // empty if block
        }
        if (WatchdogMode.aER.bgK.tR == 5 && !this.RO) {
            this.RO = false;
        }
    };
    @EventLink
    public final Listener<MoveEvent> RY = moveEvent -> {
        if (WatchdogMode.aER.bgK.ue < 0.0) {
            // empty if block
        }
    };
    @EventLink(cH=3)
    public final Listener<StrafeEvent> RZ = strafeEvent -> {
        if (WatchdogMode.aER.bgK.crx > 1 && this.e(Scaffold.class).isEnabled() && WatchdogMode.aER.bgK.aRg % 3 == 1) {
            aii.stop();
            return;
        }
        if (WatchdogMode.aER.bgK.ae < 2 && ((Boolean)this.RH.wD()).booleanValue() && ((Mode)this.RB.wD()).getName() != "Strafe") {
            this.vh = true;
        }
        if (WatchdogMode.aER.bgK.ae < 20 && ((Boolean)this.RH.wD()).booleanValue()) {
            aii.partialStrafePercent(100.0);
        }
        if (WatchdogMode.aER.bgK.isInWater() && WatchdogMode.aER.bgK.crZ && WatchdogMode.aER.bgK.isInLava()) {
            this.vh = true;
            return;
        }
        if (this.e(Scaffold.class).isEnabled() && WatchdogMode.aER.bgK.a(a.dgw) && WatchdogMode.aER.aIY.chq.Re()) {
            this.RT = true;
            this.Px = WatchdogMode.aER.bgK.aRg + 8;
        }
        double d2 = bt.aJ(Math.toDegrees(aii.direction()));
        double d3 = bt.aJ(Math.toDegrees(Math.atan2(WatchdogMode.aER.bgK.uf, WatchdogMode.aER.bgK.ud)) - 90.0);
        if (WatchdogMode.aER.bgR instanceof h && ((Mode)this.RB.wD()).getName() != "Strafe" && this.e(InventoryMove.class).isEnabled() || rise.module.impl.movement.inventorymove.WatchdogMode.Kd) {
            HJ = true;
        } else if (WatchdogMode.aER.bgR instanceof h && this.e(InventoryMove.class).isEnabled() || rise.module.impl.movement.inventorymove.WatchdogMode.Kd) {
            return;
        }
        switch (((Mode)this.RB.wD()).getName()) {
            case "Strafe": {
                double d4;
                double d5;
                double d6;
                if (WatchdogMode.aER.bgK.aO && this.vh) {
                    WatchdogMode.aER.bgK.ue = 0.42;
                }
                WatchdogMode.aER.bgK.bkD = true;
                if (WatchdogMode.aER.bgK.aO && !WatchdogMode.aER.bgK.a(a.dgw) && aii.isMoving() && !this.RT) {
                    aii.strafe(aii.getAllowedHorizontalDistance());
                    WatchdogMode.aER.bgK.jump();
                } else if (WatchdogMode.aER.bgK.aO && aii.isMoving() && !this.RT) {
                    aii.strafe(aii.getAllowedHorizontalDistance());
                    WatchdogMode.aER.bgK.jump();
                } else if (WatchdogMode.aER.bgK.aO && aii.isMoving()) {
                    aii.strafe(aii.vs());
                    WatchdogMode.aER.bgK.jump();
                }
                if (WatchdogMode.aER.bgK.tR == 1 && WatchdogMode.aER.bgK.csl - WatchdogMode.aER.bgK.csi > -0.43 && !this.vh && !this.RT) {
                    if (WatchdogMode.aER.bgK.a(a.dgw) && WatchdogMode.aER.bgK.b((a)a.dgw).dhk + 1 >= 2) {
                        aii.strafe(0.48);
                    } else if (WatchdogMode.aER.bgK.a(a.dgw) && WatchdogMode.aER.bgK.b((a)a.dgw).dhk + 1 == 1) {
                        aii.strafe(0.4);
                    } else {
                        aii.strafe(0.33);
                    }
                    aii.strafe();
                }
                if (WatchdogMode.aER.bgK.tR == 2 && ((Boolean)this.RC.wD()).booleanValue() && !this.vh) {
                    d6 = WatchdogMode.aER.bgK.ud;
                    d5 = WatchdogMode.aER.bgK.uf;
                    WatchdogMode.aER.bgK.uf = (WatchdogMode.aER.bgK.uf * 1.0 + d5 * 2.0) / 3.0;
                    WatchdogMode.aER.bgK.ud = (WatchdogMode.aER.bgK.ud * 1.0 + d6 * 2.0) / 3.0;
                    double d7 = Math.sqrt(WatchdogMode.aER.bgK.ud * WatchdogMode.aER.bgK.ud + WatchdogMode.aER.bgK.uf * WatchdogMode.aER.bgK.uf);
                    if (!(d7 < aii.getAllowedHorizontalDistance() - 0.05) && WatchdogMode.aER.bgK.ud != 0.0 && WatchdogMode.aER.bgK.uf != 0.0 || !this.RT) {
                        // empty if block
                    }
                }
                if (WatchdogMode.aER.bgK.tR != 3 || WatchdogMode.aER.bgK.a(a.dgw)) {
                    // empty if block
                }
                if (this.RT || WatchdogMode.aER.bgK.tR != 2 && WatchdogMode.aER.bgK.tR != 3 && WatchdogMode.aER.bgK.tR != 4 && WatchdogMode.aER.bgK.tR != 5 && WatchdogMode.aER.bgK.tR != 6 && WatchdogMode.aER.bgK.tR != 7 && WatchdogMode.aER.bgK.tR != 8 || !((Boolean)this.RC.wD()).booleanValue() || !this.RT) {
                    // empty if block
                }
                if (WatchdogMode.aER.bgK.tR == 8 && aik.p(0.0, WatchdogMode.aER.bgK.ue * 4.7, 0.0) != Blocks.cLc) {
                    if (WatchdogMode.aER.bgK.a(a.dgw)) {
                        WatchdogMode.aER.bgK.uf *= 1.001;
                        WatchdogMode.aER.bgK.ud *= 1.001;
                    } else {
                        WatchdogMode.aER.bgK.uf *= 1.001;
                        WatchdogMode.aER.bgK.ud *= 1.001;
                    }
                }
                d6 = bt.aJ(Math.toDegrees(aii.direction()));
                d5 = bt.aJ(Math.toDegrees(Math.atan2(WatchdogMode.aER.bgK.uf, WatchdogMode.aER.bgK.ud)) - 90.0);
                double d8 = Math.abs(d6 - d5);
                double d9 = Math.hypot(WatchdogMode.aER.bgK.ud - (WatchdogMode.aER.bgK.csh - WatchdogMode.aER.bgK.csk), WatchdogMode.aER.bgK.uf - (WatchdogMode.aER.bgK.csj - WatchdogMode.aER.bgK.csm));
                boolean bl2 = !(d8 < 2.0 || ahj.n(d6, d5) > 90.0 || HJ || d9 < 0.0125);
                if (WatchdogMode.aER.bgK.tR == 9 && aik.p(0.0, WatchdogMode.aER.bgK.ue * 3.5, 0.0) != Blocks.cLc) {
                    if (!this.vh) {
                        if (WatchdogMode.aER.bgK.a(a.dgw)) {
                            WatchdogMode.aER.bgK.uf *= 1.003;
                            WatchdogMode.aER.bgK.ud *= 1.003;
                        } else if (!this.e(Scaffold.class).isEnabled()) {
                            WatchdogMode.aER.bgK.uf *= 1.003;
                            WatchdogMode.aER.bgK.ud *= 1.003;
                        }
                        if (((Boolean)this.RD.wD()).booleanValue() || bl2) {
                            WatchdogMode.aER.bgK.ue += 0.075;
                            aii.strafe();
                        }
                    }
                    if (!((Boolean)this.RD.wD()).booleanValue() || this.RT || !((d4 = Math.sqrt(WatchdogMode.aER.bgK.ud * WatchdogMode.aER.bgK.ud + WatchdogMode.aER.bgK.uf * WatchdogMode.aER.bgK.uf)) < aii.getAllowedHorizontalDistance() - 0.02) && WatchdogMode.aER.bgK.ud != 0.0 && WatchdogMode.aER.bgK.uf != 0.0 || this.vh || !this.RT) {
                        // empty if block
                    }
                }
                if (WatchdogMode.aER.bgK.tR == 10 && aik.p(0.0, WatchdogMode.aER.bgK.ue * 2.0, 0.0) != Blocks.cLc) {
                    if (!this.vh && !this.RT) {
                        if (WatchdogMode.aER.bgK.a(a.dgw)) {
                            WatchdogMode.aER.bgK.uf *= 1.005;
                            WatchdogMode.aER.bgK.ud *= 1.005;
                        } else {
                            WatchdogMode.aER.bgK.uf *= 1.005;
                            WatchdogMode.aER.bgK.ud *= 1.005;
                        }
                    }
                    if (((Boolean)this.RD.wD()).booleanValue() && !this.RT) {
                        d4 = Math.sqrt(WatchdogMode.aER.bgK.ud * WatchdogMode.aER.bgK.ud + WatchdogMode.aER.bgK.uf * WatchdogMode.aER.bgK.uf);
                        if (!(!(d4 < aii.getAllowedHorizontalDistance()) && WatchdogMode.aER.bgK.ud != 0.0 && WatchdogMode.aER.bgK.uf != 0.0 || this.vh || this.RT)) {
                            aii.strafe(aii.getAllowedHorizontalDistance());
                        }
                        aii.strafe();
                    }
                }
                if (aik.p(0.0, WatchdogMode.aER.bgK.ue, 0.0) != Blocks.cLc) {
                    aii.strafe();
                    if (WatchdogMode.aER.bgK.tR == 11) {
                        if (WatchdogMode.aER.bgK.a(a.dgw) && WatchdogMode.aER.bgK.b((a)a.dgw).dhk + 1 >= 2) {
                            aii.strafe(0.45);
                        } else if (WatchdogMode.aER.bgK.a(a.dgw) && WatchdogMode.aER.bgK.b((a)a.dgw).dhk + 1 == 1) {
                            aii.strafe(0.375);
                        } else {
                            aii.strafe(0.31);
                        }
                    }
                }
                d4 = aii.vs() / 2.29;
                this.LL = Math.hypot(WatchdogMode.aER.bgK.ud - (WatchdogMode.aER.bgK.csh - WatchdogMode.aER.bgK.csk), WatchdogMode.aER.bgK.uf - (WatchdogMode.aER.bgK.csj - WatchdogMode.aER.bgK.csm));
                if (this.LL < 0.0125 && ((Boolean)this.RE.wD()).booleanValue()) {
                    aii.strafe();
                }
                double d10 = WatchdogMode.aER.bgK.ud;
                double d11 = WatchdogMode.aER.bgK.uf;
                if (!(this.LL > 0.0125) || !(this.LL < aii.vs()) || ((Boolean)this.RE.wD()).booleanValue()) {
                    // empty if block
                }
                aii.useDiagonalSpeed();
                if (!(aii.speed() < 0.125)) break;
                aii.strafe(0.125);
                break;
            }
            case "Low Strafe": {
                double d12;
                double d13;
                double d14;
                aii.useDiagonalSpeed();
                if (aik.b(0.5, true)) {
                    // empty if block
                }
                if (!((Boolean)this.RH.wD()).booleanValue() || WatchdogMode.aER.bgK.ae > 20) {
                    // empty if block
                }
                if (WatchdogMode.aER.bgK.a(a.dgw) && WatchdogMode.aER.bgK.aO) {
                    if (!(this.e(Scaffold.class).isEnabled() && WatchdogMode.aER.aIY.chq.Re() || this.RT || !(aii.speed() < aii.getAllowedHorizontalDistance()) && WatchdogMode.aER.bgK.ae <= 5 && ((Boolean)this.RG.wD()).booleanValue())) {
                        aii.strafe((Boolean)this.RD.wD() != false ? aii.getAllowedHorizontalDistance() : aii.getAllowedHorizontalDistance());
                        WatchdogMode.aER.bgK.jump();
                    } else if (this.e(Scaffold.class).isEnabled() && !this.RT && (aii.speed() < 0.29 || WatchdogMode.aER.bgK.ae > 5 || !((Boolean)this.RG.wD()).booleanValue())) {
                        aii.strafe(0.29);
                        WatchdogMode.aER.bgK.jump();
                    } else if (aii.speed() < 0.29 && WatchdogMode.aER.bgK.ae < 5 && ((Boolean)this.RG.wD()).booleanValue() && !this.RT) {
                        WatchdogMode.aER.bgK.jump();
                        if (WatchdogMode.aER.bgK.ae > 1) {
                            aii.strafe();
                        }
                    } else {
                        aii.strafe(0.29);
                        WatchdogMode.aER.bgK.jump();
                    }
                } else if (WatchdogMode.aER.bgK.aO) {
                    if (!(this.RT || !(aii.speed() < aii.getAllowedHorizontalDistance()) && WatchdogMode.aER.bgK.ae <= 5 && ((Boolean)this.RG.wD()).booleanValue())) {
                        aii.strafe(aii.getAllowedHorizontalDistance());
                        WatchdogMode.aER.bgK.jump();
                    } else if (this.e(Scaffold.class).isEnabled()) {
                        aii.strafe(0.23);
                        WatchdogMode.aER.bgK.jump();
                    } else if (aii.speed() < aii.vs() || WatchdogMode.aER.bgK.ae > 5 || !((Boolean)this.RG.wD()).booleanValue()) {
                        aii.strafe(aii.vs());
                        WatchdogMode.aER.bgK.jump();
                    } else {
                        WatchdogMode.aER.bgK.jump();
                        if (WatchdogMode.aER.bgK.ae > 1) {
                            aii.strafe();
                        }
                    }
                }
                if (WatchdogMode.aER.bgK.tR == 1 && !this.vh) {
                    this.RQ = true;
                    WatchdogMode.aER.bgK.ue += (double)0.057f;
                    if (!(!WatchdogMode.aER.bgK.a(a.dgw) || this.e(Scaffold.class).isEnabled() && WatchdogMode.aER.aIY.chq.Re() || WatchdogMode.aER.bgK.b((a)a.dgw).dhk + 1 < 2 || this.vh || this.RT || !(aii.speed() < 0.48) && WatchdogMode.aER.bgK.ae <= 5 && ((Boolean)this.RG.wD()).booleanValue())) {
                        aii.strafe(0.4875);
                    } else if (WatchdogMode.aER.bgK.a(a.dgw) && WatchdogMode.aER.bgK.b((a)a.dgw).dhk + 1 >= 2 && (aii.speed() < 0.4 || WatchdogMode.aER.bgK.ae > 5 || !((Boolean)this.RG.wD()).booleanValue())) {
                        aii.strafe(0.4);
                    } else if (!this.RT && WatchdogMode.aER.bgK.a(a.dgw) && WatchdogMode.aER.bgK.b((a)a.dgw).dhk + 1 == 1 && (aii.speed() < 0.41 || WatchdogMode.aER.bgK.ae > 5 || !((Boolean)this.RG.wD()).booleanValue())) {
                        aii.strafe(0.41);
                    } else if (this.RT && WatchdogMode.aER.bgK.a(a.dgw) && WatchdogMode.aER.bgK.b((a)a.dgw).dhk + 1 == 1 && (aii.speed() < 0.41 || WatchdogMode.aER.bgK.ae > 5 || !((Boolean)this.RG.wD()).booleanValue())) {
                        aii.strafe(0.35);
                    } else if (aii.speed() < 0.33 || WatchdogMode.aER.bgK.ae > 3 || !((Boolean)this.RG.wD()).booleanValue()) {
                        aii.strafe(0.3325);
                    } else {
                        aii.strafe();
                    }
                }
                if (WatchdogMode.aER.bgK.tR == 2 && ((Boolean)this.RC.wD()).booleanValue()) {
                    d14 = WatchdogMode.aER.bgK.ud;
                    d13 = WatchdogMode.aER.bgK.uf;
                    WatchdogMode.aER.bgK.uf = (WatchdogMode.aER.bgK.uf * 1.0 + d13 * 2.0) / 3.0;
                    WatchdogMode.aER.bgK.ud = (WatchdogMode.aER.bgK.ud * 1.0 + d14 * 2.0) / 3.0;
                    if (WatchdogMode.aER.bgK.ae >= 3 || WatchdogMode.aER.bgK.ae != 1) {
                        // empty if block
                    }
                }
                if (WatchdogMode.aER.bgK.tR == 3 && !this.vh) {
                    WatchdogMode.aER.bgK.ue -= (double)0.1309f;
                }
                if (WatchdogMode.aER.bgK.tR == 4 && !this.vh) {
                    WatchdogMode.aER.bgK.ue -= 0.2;
                }
                if (WatchdogMode.aER.bgK.tR > 1 && WatchdogMode.aER.bgK.tR < 6 && WatchdogMode.aER.bgK.a(a.dgw) && ((Boolean)this.RC.wD()).booleanValue() || WatchdogMode.aER.bgK.tR <= 1 || WatchdogMode.aER.bgK.tR >= 6 || ((Boolean)this.RC.wD()).booleanValue()) {
                    // empty if block
                }
                d14 = bt.aJ(Math.toDegrees(aii.direction()));
                d13 = bt.aJ(Math.toDegrees(Math.atan2(WatchdogMode.aER.bgK.uf, WatchdogMode.aER.bgK.ud)) - 90.0);
                double d15 = Math.abs(d14 - d13);
                double d16 = Math.hypot(WatchdogMode.aER.bgK.ud - (WatchdogMode.aER.bgK.csh - WatchdogMode.aER.bgK.csk), WatchdogMode.aER.bgK.uf - (WatchdogMode.aER.bgK.csj - WatchdogMode.aER.bgK.csm));
                boolean bl3 = !(d15 < 5.0 || ahj.n(d14, d13) > 90.0 || HJ || d16 < 0.0125);
                if (!(d15 < 7.0) || !((Boolean)this.RD.wD()).booleanValue()) {
                    // empty if block
                }
                if (!(WatchdogMode.aER.bgK.tR != 6 || this.vh || !aik.ae(WatchdogMode.aER.bgK.ue * 3.0) || !((Boolean)this.RD.wD()).booleanValue() && !bl3 || !(aii.speed() < aii.getAllowedHorizontalDistance() * 0.994) && ((Boolean)this.RG.wD()).booleanValue() && WatchdogMode.aER.bgK.ae <= 5 || this.vh && ((Boolean)this.RH.wD()).booleanValue() || WatchdogMode.aER.bgK.ae <= 1)) {
                    WatchdogMode.aER.bgK.ue += 0.075;
                    aii.strafe(aii.speed());
                    d12 = Math.sqrt(WatchdogMode.aER.bgK.ud * WatchdogMode.aER.bgK.ud + WatchdogMode.aER.bgK.uf * WatchdogMode.aER.bgK.uf);
                    if (!(!(d12 < aii.getAllowedHorizontalDistance()) && WatchdogMode.aER.bgK.ud != 0.0 && WatchdogMode.aER.bgK.uf != 0.0 || this.vh || this.RT || !WatchdogMode.aER.bgK.a(a.dgw) || this.e(Scaffold.class).isEnabled())) {
                        aii.strafe(aii.getAllowedHorizontalDistance() * 0.994);
                    } else if (!(this.vh || this.e(Scaffold.class).isEnabled() || !(d12 < aii.getAllowedHorizontalDistance()) && WatchdogMode.aER.bgK.ud != 0.0 && WatchdogMode.aER.bgK.uf != 0.0)) {
                        aii.strafe(aii.getAllowedHorizontalDistance() - 0.05);
                    }
                }
                if (WatchdogMode.aER.bgK.tR < 7 && aik.p(0.0, WatchdogMode.aER.bgK.ue, 0.0) != Blocks.cLc && WatchdogMode.aER.bgK.a(a.dgw) && !this.RN) {
                    this.RS = true;
                    this.Px = WatchdogMode.aER.bgK.aRg + 9;
                    this.RT = true;
                }
                if (!(WatchdogMode.aER.bgK.tR != 7 || this.vh || !aik.ae(WatchdogMode.aER.bgK.ue * 2.0) || this.e(Scaffold.class).isEnabled() || !(aii.speed() < aii.getAllowedHorizontalDistance() * 1.1) && ((Boolean)this.RG.wD()).booleanValue() && WatchdogMode.aER.bgK.ae <= 5 || WatchdogMode.aER.bgK.ae <= 1)) {
                    aii.strafe((Boolean)this.RD.wD() != false ? aii.speed() : aii.getAllowedHorizontalDistance() * 1.1);
                }
                if (WatchdogMode.aER.bgK.tR == 9) {
                    // empty if block
                }
                if (aik.ae(WatchdogMode.aER.bgK.ue) && WatchdogMode.aER.bgK.ae > 1 && !this.vh && !((Boolean)this.RI.wD()).booleanValue() && (WatchdogMode.aER.bgK.tR > 6 && ((Boolean)this.RD.wD()).booleanValue() || WatchdogMode.aER.bgK.tR > 6 && !((Boolean)this.RD.wD()).booleanValue()) && !this.RP && (aii.speed() < aii.getAllowedHorizontalDistance() * 1.095 || !((Boolean)this.RG.wD()).booleanValue() || WatchdogMode.aER.bgK.ae > 5)) {
                    if (((Boolean)this.RD.wD()).booleanValue()) {
                        if (WatchdogMode.aER.bgK.a(a.dgw) && WatchdogMode.aER.bgK.b((a)a.dgw).dhk + 1 >= 2) {
                            aii.strafe(aii.getAllowedHorizontalDistance() * 1.093);
                        } else {
                            aii.strafe(aii.getAllowedHorizontalDistance() * 1.095);
                        }
                    } else if (WatchdogMode.aER.bgK.a(a.dgw) && WatchdogMode.aER.bgK.b((a)a.dgw).dhk + 1 >= 2) {
                        aii.strafe(aii.getAllowedHorizontalDistance() * 1.093);
                    } else {
                        aii.strafe(aii.getAllowedHorizontalDistance() * 1.095);
                    }
                    this.RP = true;
                } else if (aik.ae(WatchdogMode.aER.bgK.ue) && !this.vh && WatchdogMode.aER.bgK.ae > 1 && !((Boolean)this.RI.wD()).booleanValue() && WatchdogMode.aER.bgK.tR > 6 && ((Boolean)this.RD.wD()).booleanValue() || WatchdogMode.aER.bgK.tR > 6 && !((Boolean)this.RD.wD()).booleanValue() && !this.RP && (aii.speed() < aii.getAllowedHorizontalDistance() || !((Boolean)this.RG.wD()).booleanValue() || WatchdogMode.aER.bgK.ae > 5)) {
                    aii.strafe(aii.getAllowedHorizontalDistance());
                    this.RP = true;
                } else if (aik.ae(WatchdogMode.aER.bgK.ue) && WatchdogMode.aER.bgK.tR > 5 && !this.RP && WatchdogMode.aER.bgK.ae > 1 && (aii.speed() < aii.getAllowedHorizontalDistance() || !((Boolean)this.RG.wD()).booleanValue() || WatchdogMode.aER.bgK.ae > 5)) {
                    aii.strafe(aii.getAllowedHorizontalDistance());
                    this.RP = true;
                } else if (aik.ae(WatchdogMode.aER.bgK.ue) && WatchdogMode.aER.bgK.tR > 5 && !this.RP && WatchdogMode.aER.bgK.ae > 1 && ((Boolean)this.RG.wD()).booleanValue()) {
                    aii.strafe();
                }
                if (this.e(Scaffold.class).isEnabled() && WatchdogMode.aER.aIY.chq.Re()) {
                    if (WatchdogMode.aER.bgK.aO && HJ) {
                        ((Speed)this.wy()).toggle();
                        HJ = false;
                    }
                } else if ((this.vh || WatchdogMode.aER.bgK.tR > 3 || WatchdogMode.aER.bgK.aO) && HJ) {
                    ((Speed)this.wy()).toggle();
                    HJ = false;
                }
                if ((d12 = Math.hypot(WatchdogMode.aER.bgK.ud - (WatchdogMode.aER.bgK.csh - WatchdogMode.aER.bgK.csk), WatchdogMode.aER.bgK.uf - (WatchdogMode.aER.bgK.csj - WatchdogMode.aER.bgK.csm))) < 0.0125) {
                    aii.strafe();
                }
                if (WatchdogMode.aER.bgK.aO || WatchdogMode.aER.bgK.tR == 11 || WatchdogMode.aER.bgK.tR != 1) {
                    // empty if block
                }
                double d17 = WatchdogMode.aER.bgK.ud;
                double d18 = WatchdogMode.aER.bgK.uf;
                if (aii.speed() < 0.1245 && ((Boolean)this.RE.wD()).booleanValue()) {
                    aii.strafe(0.1245);
                }
                if (WatchdogMode.aER.bgK.tR <= 1 || WatchdogMode.aER.bgK.crR) break;
                aii.moveFlying(9.0E-4);
                break;
            }
            case "NCP Strafe": {
                double d19;
                double d20 = 0.075;
                if (!((Boolean)this.RH.wD()).booleanValue() || WatchdogMode.aER.bgK.ae > 20) {
                    // empty if block
                }
                if (WatchdogMode.aER.bgK.aO && aii.isMoving()) {
                    aii.strafe(aii.getAllowedHorizontalDistance());
                    WatchdogMode.aER.bgK.jump();
                }
                double d21 = WatchdogMode.aER.bgK.gX % 1.0;
                if (WatchdogMode.aER.bgK.tR == 1 && !this.vh) {
                    if (WatchdogMode.aER.bgK.a(a.dgw) && WatchdogMode.aER.bgK.b((a)a.dgw).dhk + 1 >= 2) {
                        aii.strafe(0.48);
                    } else if (WatchdogMode.aER.bgK.a(a.dgw) && WatchdogMode.aER.bgK.b((a)a.dgw).dhk + 1 == 1) {
                        aii.strafe(0.4);
                    } else {
                        aii.strafe(0.334);
                    }
                    WatchdogMode.aER.bgK.ue += (double)0.03f;
                    aii.preventDiagonalSpeed();
                }
                if (WatchdogMode.aER.bgK.tR == 2 && !this.vh) {
                    d19 = WatchdogMode.aER.bgK.ud;
                    double d22 = WatchdogMode.aER.bgK.uf;
                    aii.strafe();
                    WatchdogMode.aER.bgK.uf = (WatchdogMode.aER.bgK.uf * 1.0 + d22 * 3.0) / 4.0;
                    WatchdogMode.aER.bgK.ud = (WatchdogMode.aER.bgK.ud * 1.0 + d19 * 3.0) / 4.0;
                    aii.useDiagonalSpeed();
                    WatchdogMode.aER.bgK.ue -= (double)0.005f;
                }
                if (WatchdogMode.aER.bgK.tR == 3 && !this.vh) {
                    aii.useDiagonalSpeed();
                    WatchdogMode.aER.bgK.ue -= (double)0.04f;
                }
                if (WatchdogMode.aER.bgK.tR == 4 && (WatchdogMode.aER.bgK.ae > 1 || ((Boolean)this.RG.wD()).booleanValue()) && !this.vh) {
                    aii.useDiagonalSpeed();
                    WatchdogMode.aER.bgK.ue -= (double)0.05f;
                }
                if (WatchdogMode.aER.bgK.tR == 5 && !this.vh) {
                    aii.useDiagonalSpeed();
                }
                if (WatchdogMode.aER.bgK.tR == 6 && !this.vh && WatchdogMode.aER.bgK.ae > 10 && ((Boolean)this.RH.wD()).booleanValue()) {
                    aii.useDiagonalSpeed();
                    WatchdogMode.aER.bgK.uf *= 1.01;
                    WatchdogMode.aER.bgK.ud *= 1.01;
                }
                if (WatchdogMode.aER.bgK.tR == 7 && !this.vh && WatchdogMode.aER.bgK.ae > 10 && ((Boolean)this.RH.wD()).booleanValue()) {
                    aii.useDiagonalSpeed();
                    if (!WatchdogMode.aER.bgK.a(a.dgw)) {
                        WatchdogMode.aER.bgK.uf *= 1.01;
                        WatchdogMode.aER.bgK.ud *= 1.01;
                    } else {
                        WatchdogMode.aER.bgK.uf *= 1.008;
                        WatchdogMode.aER.bgK.ud *= 1.008;
                    }
                }
                if (WatchdogMode.aER.bgK.tR == 8 && aik.p(0.0, WatchdogMode.aER.bgK.ue * 3.0, 0.0) != Blocks.cLc) {
                    aii.useDiagonalSpeed();
                    if (((Boolean)this.RD.wD()).booleanValue()) {
                        WatchdogMode.aER.bgK.ue += (double)0.075f;
                        aii.strafe();
                    }
                }
                if (WatchdogMode.aER.bgK.tR == 9 && aik.p(0.0, WatchdogMode.aER.bgK.ue * 3.0, 0.0) != Blocks.cLc) {
                    aii.useDiagonalSpeed();
                    if (((Boolean)this.RD.wD()).booleanValue()) {
                        aii.strafe();
                    }
                }
                if (aik.p(0.0, WatchdogMode.aER.bgK.ue, 0.0) != Blocks.cLc) {
                    if (WatchdogMode.aER.bgK.a(a.dgw) && WatchdogMode.aER.bgK.b((a)a.dgw).dhk + 1 >= 2) {
                        aii.strafe(0.45);
                    } else if (WatchdogMode.aER.bgK.a(a.dgw) && WatchdogMode.aER.bgK.b((a)a.dgw).dhk + 1 == 1) {
                        aii.strafe(0.375);
                    } else {
                        aii.strafe(0.31);
                    }
                }
                if (this.e(Scaffold.class).isEnabled() && WatchdogMode.aER.aIY.chq.Re()) {
                    if (WatchdogMode.aER.bgK.aO && HJ) {
                        ((Speed)this.wy()).toggle();
                        HJ = false;
                    }
                } else if ((this.vh || WatchdogMode.aER.bgK.tR > 4 || WatchdogMode.aER.bgK.aO) && HJ) {
                    ((Speed)this.wy()).toggle();
                    HJ = false;
                }
                if (aii.speed() <= 0.125) {
                    aii.strafe(0.125);
                }
                if (!((d19 = Math.hypot(WatchdogMode.aER.bgK.ud - (WatchdogMode.aER.bgK.csh - WatchdogMode.aER.bgK.csk), WatchdogMode.aER.bgK.uf - (WatchdogMode.aER.bgK.csj - WatchdogMode.aER.bgK.csm))) <= 0.0125)) break;
                aii.strafe();
            }
        }
        if (aii.speed() < 0.45 || WatchdogMode.aER.bgK.a(a.dgw) && WatchdogMode.aER.bgK.b((a)a.dgw).dhk + 1 == 1 && aii.speed() < 0.55 || WatchdogMode.aER.bgK.a(a.dgw) && WatchdogMode.aER.bgK.b((a)a.dgw).dhk + 1 >= 2 && aii.speed() < 0.55) {
            if (this.RL && WatchdogMode.aER.bgK.aO && !this.vh) {
                WatchdogMode.aER.bgK.ud *= 1.45;
                WatchdogMode.aER.bgK.uf *= 1.45;
            }
            if (!(!this.RL || aik.p(0.0, WatchdogMode.aER.bgK.ue, 0.0) != Blocks.cMK && aik.p(0.0, WatchdogMode.aER.bgK.ue, 0.0) != Blocks.cOD || this.vh || this.vh)) {
                WatchdogMode.aER.bgK.ud *= 1.01;
                WatchdogMode.aER.bgK.uf *= 1.01;
            }
            if (this.RL && WatchdogMode.aER.bgK.tR == 1 && !this.vh) {
                WatchdogMode.aER.bgK.ud *= 1.15;
                WatchdogMode.aER.bgK.uf *= 1.15;
            }
            if (this.RL && WatchdogMode.aER.bgK.tR > 1 && !this.vh && ((Mode)this.RB.wD()).getName() == "Low Strafe") {
                WatchdogMode.aER.bgK.ud *= 1.015;
                WatchdogMode.aER.bgK.uf *= 1.015;
            }
        }
        if (ahj.n(d2, d3) < 5.0 && Objects.equals(((Mode)this.RB.wD()).getName(), "Low Strafe") && ((Boolean)this.RF.wD()).booleanValue() && (!this.RS || WatchdogMode.aER.bgK.tR > 2 && WatchdogMode.aER.bgK.tR < 6) && (!WatchdogMode.aER.aIY.chq.Re() || !this.e(Scaffold.class).isEnabled()) && WatchdogMode.aER.bgK.Zz > 10 && !this.vh && WatchdogMode.aER.bgK.ae > 1 && aii.speed() < aii.vs() - 0.0323 && WatchdogMode.aER.bgK.tR < 18) {
            afl.c(WatchdogMode.aER.bgK.tR, new Object[0]);
            if (WatchdogMode.aER.bgK.a(a.dgw)) {
                strafeEvent.setSpeed(aii.vs() - 0.003);
            } else {
                strafeEvent.setSpeed(aii.vs() - 0.001);
            }
        }
    };
    @EventLink
    public final Listener<JumpEvent> Sa = jumpEvent -> {
        if (WatchdogMode.aER.bgK.isInLava() || WatchdogMode.aER.bgK.crZ) {
            jumpEvent.cF();
        }
        if (!this.vh && ((Mode)this.RB.wD()).getName() == "Low Strafe" && ((Boolean)this.RJ.wD()).booleanValue()) {
            jumpEvent.setJumpMotion(0.42001f);
        } else if (((Mode)this.RB.wD()).getName() == "Low Strafe" && ((Boolean)this.RJ.wD()).booleanValue()) {
            jumpEvent.setJumpMotion(0.42001f);
        }
    };
    @EventLink
    public final Listener<eh> Sb = eh2 -> {
        if (WatchdogMode.aER.bgK.ae > 1 || !((Boolean)this.RG.wD()).booleanValue() && WatchdogMode.aER.bgK.tR < 12) {
            double d2 = bt.aJ(Math.toDegrees(aii.direction()));
            double d3 = bt.aJ(Math.toDegrees(Math.atan2(WatchdogMode.aER.bgK.uf, WatchdogMode.aER.bgK.ud)) - 90.0);
            if (((Boolean)this.RC.wD()).booleanValue() && ((Mode)this.RB.wD()).getName() == "Strafe") {
                if (ahj.n(d2, d3) > 90.0) {
                    if (WatchdogMode.aER.bgK.a(a.dgw)) {
                        aii.a(aii.speed(), (float)d3 - 180.0f);
                    } else {
                        aii.a(aii.speed(), (float)d3 - 180.0f);
                    }
                } else if (((Boolean)this.RH.wD()).booleanValue() && WatchdogMode.aER.bgK.ae > 20) {
                    double d4 = WatchdogMode.aER.bgK.ud;
                    double d5 = WatchdogMode.aER.bgK.uf;
                    aii.strafe();
                    WatchdogMode.aER.bgK.uf = (WatchdogMode.aER.bgK.uf * 3.0 + d5 * 1.0) / 4.0;
                    WatchdogMode.aER.bgK.ud = (WatchdogMode.aER.bgK.ud * 3.0 + d4 * 1.0) / 4.0;
                }
            } else if (((Boolean)this.RC.wD()).booleanValue()) {
                if (ahj.n(d2, d3) > 90.0) {
                    aii.a(aii.speed(), (float)d3 - 180.0f);
                } else {
                    double d6;
                    double d7;
                    if (((Boolean)this.RH.wD()).booleanValue() && WatchdogMode.aER.bgK.ae > 20) {
                        d7 = WatchdogMode.aER.bgK.ud;
                        d6 = WatchdogMode.aER.bgK.uf;
                        aii.strafe();
                        WatchdogMode.aER.bgK.uf = (WatchdogMode.aER.bgK.uf * 3.0 + d6 * 1.0) / 4.0;
                        WatchdogMode.aER.bgK.ud = (WatchdogMode.aER.bgK.ud * 3.0 + d7 * 1.0) / 4.0;
                    }
                    d7 = WatchdogMode.aER.bgK.ud;
                    d6 = WatchdogMode.aER.bgK.uf;
                }
            }
        }
    };
    @EventLink
    public final Listener<es> Sc = es2 -> {
        if (es2.df() instanceof BlockIce || es2.df() instanceof BlockPackedIce || WatchdogMode.aER.bgK.crx > 1) {
            // empty if block
        }
    };
    @EventLink
    public final Listener<KeyboardInputEvent> Sd = keyboardInputEvent -> {
        if (((Mode)this.RB.wD()).getName() != "Strafe" && keyboardInputEvent.cO() == ((Speed)this.wy()).getKey() && !HJ) {
            keyboardInputEvent.cF();
            HJ = true;
        }
    };

    public WatchdogMode(String string, Speed speed) {
        super(string, speed);
    }

    @Override
    public void onEnable() {
        HJ = false;
        if (!bb.a(true, true, false, true, true) && !this.e(Scaffold.class).isEnabled()) {
            Random random = new Random();
            float f2 = random.nextFloat();
            float f3 = random.nextFloat();
        }
        this.RN = false;
        this.RQ = false;
        if (Client.a.g().c(Scaffold.class).isEnabled()) {
            // empty if block
        }
        this.RP = false;
        if (((Mode)this.e(Scaffold.class).agx.wD()).getName().equals("On") && Client.a.g().c(Scaffold.class).isEnabled()) {
            aii.stop();
        }
        if (WatchdogMode.aER.bgK.aO) {
            // empty if block
        }
        HJ = false;
        if (WatchdogMode.aER.bgK.tR > 2) {
            this.vh = true;
        }
        this.RT = false;
    }

    @Override
    public void onDisable() {
        WdMode.hV = 0;
        WdMode.qH = 0;
        this.RL = false;
        afl.c(WatchdogMode.aER.bgK.tR + ": " + WatchdogMode.aER.bgK.ae, new Object[0]);
        this.RQ = false;
        if (Client.a.g().c(Scaffold.class).isEnabled()) {
            WatchdogMode.aER.bgK.ud *= 0.85;
            WatchdogMode.aER.bgK.uf *= 0.85;
        }
        if (this.e(Scaffold.class).isEnabled() && WatchdogMode.aER.aIY.chq.Re() && !WatchdogMode.aER.bgK.a(a.dgw)) {
            aii.strafe(0.355);
        }
        this.vh = false;
        WatchdogMode.aER.bgK.bkD = false;
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
        Qo = Math.abs(f7) < 8.0f ? f5 : (Qo += Math.signum(f7) * 8.0f);
        Qo = (Qo + 360.0f) % 360.0f;
        double d3 = StrictMath.cos(Math.toRadians((double)Qo + 90.0));
        double d4 = StrictMath.cos(Math.toRadians(Qo));
        moveEvent.setPosX(d3 * d2);
        moveEvent.setPosZ(d4 * d2);
    }

    static {
        Qo = 0.0f;
    }
}

