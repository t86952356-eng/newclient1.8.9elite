/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.a;
import hackclient.rise.afl;
import hackclient.rise.ahj;
import hackclient.rise.aii;
import hackclient.rise.aik;
import hackclient.rise.akg;
import hackclient.rise.aki;
import hackclient.rise.akp;
import hackclient.rise.aks;
import hackclient.rise.bb;
import hackclient.rise.bd;
import hackclient.rise.dk;
import hackclient.rise.dm;
import hackclient.rise.dx;
import hackclient.rise.dz;
import hackclient.rise.ed;
import hackclient.rise.eh;
import hackclient.rise.ei;
import hackclient.rise.eo;
import hackclient.rise.es;
import hackclient.rise.ez;
import hackclient.rise.fh;
import hackclient.rise.hf;
import hackclient.rise.lx;
import hackclient.rise.mh;
import hackclient.rise.oe;
import hackclient.rise.tn;
import hackclient.rise.wd;
import java.util.Objects;
import java.util.Random;
import net.minecraft.block.BlockIce;
import net.minecraft.block.BlockPackedIce;
import net.minecraft.client.gui.inventory.h;
import net.minecraft.init.Blocks;
import net.minecraft.network.aj;
import net.minecraft.network.play.server.t;
import net.minecraft.util.bt;

public class qq
extends akg<mh> {
    private final akp RB = new akp("Type", this).a(new akg[]{new aks("Strafe")}).a(new akg[]{new aks("Low Strafe")}).a(new akg[]{new aks("NCP Strafe")}).co("Low Strafe");
    public final aki RC = new aki("Air Strafe", (akg<?>)this, (Boolean)true);
    public final aki RD = new aki("Always Glide Strafe", (akg<?>)this, (Boolean)true);
    public final aki RE = new aki("Friction Override", (akg<?>)this, (Boolean)true);
    public final aki RF = new aki("Friction Full Disabler", (akg<?>)this, (Boolean)true);
    public final aki RG = new aki("Damage Boost", (akg<?>)this, (Boolean)false);
    public final aki RH = new aki("Damage Strafe (Hypixel Fly Disabler)", (akg<?>)this, (Boolean)false);
    public final aki RI = new aki("UHC Mode", (akg<?>)this, (Boolean)false);
    public final aki RJ = new aki("Alternate Motion", (akg<?>)this, (Boolean)false);
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
    @dm
    public final dk<dz> RV = dz2 -> dz2.setJump(false);
    @dm
    public final dk<fh> RW = fh2 -> {
        t t2;
        aj<?> aj2;
        if (!this.e(hf.class).isEnabled() && ((akg)this.RB.wD()).getName() == "Low Strafe" && (aj2 = fh2.dq()) instanceof t && (t2 = (t)aj2).getEntityID() == qq.aER.bgK.getEntityId() && (qq.aER.bgK.tR == 1 || qq.aER.bgK.tR == 2 || qq.aER.bgK.tR == 3)) {
            fh2.cF();
        }
    };
    @dm(cH=3)
    public final dk<ei> RX = ei2 -> {
        double d2;
        RK = (Boolean)this.RG.wD();
        RM = (Boolean)this.RH.wD();
        if (aii.isMoving()) {
            if (qq.aER.bgK.ae < 10 && ((Boolean)this.RH.wD()).booleanValue()) {
                aii.strafe();
            } else if (qq.aER.bgK.ae == 1) {
                aii.strafe();
            }
        } else if (qq.aER.bgK.ae == 1) {
            qq.aER.bgK.ud *= -1.0;
            qq.aER.bgK.uf *= -1.0;
        }
        if (qq.aER.bgK.isInWater() && qq.aER.bgK.crZ && qq.aER.bgK.isInLava()) {
            this.vh = true;
            return;
        }
        if (this.e(tn.class).isEnabled()) {
            this.RO = true;
        }
        if (qq.aER.bgK.crR || qq.aER.bgK.Zz < 2) {
            this.RT = true;
            this.Px = qq.aER.bgK.aRg + 9;
        }
        if (!qq.aER.bgK.crR && qq.aER.bgK.aRg > this.Px) {
            this.RT = false;
            this.RS = false;
        }
        if (aik.p(0.0, -1.0, 0.0) == Blocks.cOD || aik.p(0.0, -1.0, 0.0) == Blocks.cMK) {
            this.RL = true;
        } else if (qq.aER.bgK.tR > 1) {
            this.RL = false;
        }
        if (qq.aER.bgK.aO) {
            this.RP = false;
        }
        if (aik.p(0.0, qq.aER.bgK.ue, 0.0) != Blocks.cLc) {
            this.vh = false;
        }
        if (qq.aER.bgK.crW && !qq.aER.bgK.aO && ((akg)this.RB.wD()).getName() == "Low Strafe" && aik.b(2.0, true)) {
            this.vh = true;
        }
        if (qq.aER.bgK.csW <= 10) {
            // empty if block
        }
        if (Math.abs((d2 = ei2.getPosY()) - (double)Math.round(d2)) > 0.0325 && qq.aER.bgK.aO) {
            this.RN = true;
        } else if (qq.aER.bgK.aO) {
            this.RN = false;
        }
        if (!qq.aER.bgK.aO || qq.aER.bgK.crZ) {
            // empty if block
        }
        if (qq.aER.bgK.crZ) {
            qq.aER.bgK.ue = -0.0784000015258789;
            aii.strafe(aii.getAllowedHorizontalDistance() * 3.1);
        }
        if (qq.aER.bgK.crZ && qq.aER.bgK.a(net.minecraft.potion.a.dgw) && qq.aER.bgK.b((net.minecraft.potion.a)net.minecraft.potion.a.dgw).dhk + 1 >= 1 && !qq.aER.bgK.aO) {
            aii.strafe(aii.getAllowedHorizontalDistance() * 3.8);
        }
        if (qq.aER.bgK.crZ && qq.aER.bgK.a(net.minecraft.potion.a.dgw) && qq.aER.bgK.b((net.minecraft.potion.a)net.minecraft.potion.a.dgw).dhk + 1 >= 2 && !qq.aER.bgK.aO) {
            aii.strafe(aii.getAllowedHorizontalDistance() * 4.0);
        }
        if (aik.b(0.0, true)) {
            // empty if block
        }
        if ((double)bd.cY > 1.4) {
            // empty if block
        }
        if (!qq.aER.bgK.aO || Math.abs(d2 - (double)Math.round(d2)) > 0.03 || !this.RO) {
            // empty if block
        }
        if (qq.aER.bgK.tR == 5 && !this.RO) {
            this.RO = false;
        }
    };
    @dm
    public final dk<ez> RY = ez2 -> {
        if (qq.aER.bgK.ue < 0.0) {
            // empty if block
        }
    };
    @dm(cH=3)
    public final dk<eo> RZ = eo2 -> {
        if (qq.aER.bgK.crx > 1 && this.e(tn.class).isEnabled() && qq.aER.bgK.aRg % 3 == 1) {
            aii.stop();
            return;
        }
        if (qq.aER.bgK.ae < 2 && ((Boolean)this.RH.wD()).booleanValue() && ((akg)this.RB.wD()).getName() != "Strafe") {
            this.vh = true;
        }
        if (qq.aER.bgK.ae < 20 && ((Boolean)this.RH.wD()).booleanValue()) {
            aii.partialStrafePercent(100.0);
        }
        if (qq.aER.bgK.isInWater() && qq.aER.bgK.crZ && qq.aER.bgK.isInLava()) {
            this.vh = true;
            return;
        }
        if (this.e(tn.class).isEnabled() && qq.aER.bgK.a(net.minecraft.potion.a.dgw) && qq.aER.aIY.chq.Re()) {
            this.RT = true;
            this.Px = qq.aER.bgK.aRg + 8;
        }
        double d2 = bt.aJ(Math.toDegrees(aii.direction()));
        double d3 = bt.aJ(Math.toDegrees(Math.atan2(qq.aER.bgK.uf, qq.aER.bgK.ud)) - 90.0);
        if (qq.aER.bgR instanceof h && ((akg)this.RB.wD()).getName() != "Strafe" && this.e(lx.class).isEnabled() || oe.Kd) {
            HJ = true;
        } else if (qq.aER.bgR instanceof h && this.e(lx.class).isEnabled() || oe.Kd) {
            return;
        }
        switch (((akg)this.RB.wD()).getName()) {
            case "Strafe": {
                double d4;
                double d5;
                double d6;
                if (qq.aER.bgK.aO && this.vh) {
                    qq.aER.bgK.ue = 0.42;
                }
                qq.aER.bgK.bkD = true;
                if (qq.aER.bgK.aO && !qq.aER.bgK.a(net.minecraft.potion.a.dgw) && aii.isMoving() && !this.RT) {
                    aii.strafe(aii.getAllowedHorizontalDistance());
                    qq.aER.bgK.jump();
                } else if (qq.aER.bgK.aO && aii.isMoving() && !this.RT) {
                    aii.strafe(aii.getAllowedHorizontalDistance());
                    qq.aER.bgK.jump();
                } else if (qq.aER.bgK.aO && aii.isMoving()) {
                    aii.strafe(aii.vs());
                    qq.aER.bgK.jump();
                }
                if (qq.aER.bgK.tR == 1 && qq.aER.bgK.csl - qq.aER.bgK.csi > -0.43 && !this.vh && !this.RT) {
                    if (qq.aER.bgK.a(net.minecraft.potion.a.dgw) && qq.aER.bgK.b((net.minecraft.potion.a)net.minecraft.potion.a.dgw).dhk + 1 >= 2) {
                        aii.strafe(0.48);
                    } else if (qq.aER.bgK.a(net.minecraft.potion.a.dgw) && qq.aER.bgK.b((net.minecraft.potion.a)net.minecraft.potion.a.dgw).dhk + 1 == 1) {
                        aii.strafe(0.4);
                    } else {
                        aii.strafe(0.33);
                    }
                    aii.strafe();
                }
                if (qq.aER.bgK.tR == 2 && ((Boolean)this.RC.wD()).booleanValue() && !this.vh) {
                    d6 = qq.aER.bgK.ud;
                    d5 = qq.aER.bgK.uf;
                    qq.aER.bgK.uf = (qq.aER.bgK.uf * 1.0 + d5 * 2.0) / 3.0;
                    qq.aER.bgK.ud = (qq.aER.bgK.ud * 1.0 + d6 * 2.0) / 3.0;
                    double d7 = Math.sqrt(qq.aER.bgK.ud * qq.aER.bgK.ud + qq.aER.bgK.uf * qq.aER.bgK.uf);
                    if (!(d7 < aii.getAllowedHorizontalDistance() - 0.05) && qq.aER.bgK.ud != 0.0 && qq.aER.bgK.uf != 0.0 || !this.RT) {
                        // empty if block
                    }
                }
                if (qq.aER.bgK.tR != 3 || qq.aER.bgK.a(net.minecraft.potion.a.dgw)) {
                    // empty if block
                }
                if (this.RT || qq.aER.bgK.tR != 2 && qq.aER.bgK.tR != 3 && qq.aER.bgK.tR != 4 && qq.aER.bgK.tR != 5 && qq.aER.bgK.tR != 6 && qq.aER.bgK.tR != 7 && qq.aER.bgK.tR != 8 || !((Boolean)this.RC.wD()).booleanValue() || !this.RT) {
                    // empty if block
                }
                if (qq.aER.bgK.tR == 8 && aik.p(0.0, qq.aER.bgK.ue * 4.7, 0.0) != Blocks.cLc) {
                    if (qq.aER.bgK.a(net.minecraft.potion.a.dgw)) {
                        qq.aER.bgK.uf *= 1.001;
                        qq.aER.bgK.ud *= 1.001;
                    } else {
                        qq.aER.bgK.uf *= 1.001;
                        qq.aER.bgK.ud *= 1.001;
                    }
                }
                d6 = bt.aJ(Math.toDegrees(aii.direction()));
                d5 = bt.aJ(Math.toDegrees(Math.atan2(qq.aER.bgK.uf, qq.aER.bgK.ud)) - 90.0);
                double d8 = Math.abs(d6 - d5);
                double d9 = Math.hypot(qq.aER.bgK.ud - (qq.aER.bgK.csh - qq.aER.bgK.csk), qq.aER.bgK.uf - (qq.aER.bgK.csj - qq.aER.bgK.csm));
                boolean bl2 = !(d8 < 2.0 || ahj.n(d6, d5) > 90.0 || HJ || d9 < 0.0125);
                if (qq.aER.bgK.tR == 9 && aik.p(0.0, qq.aER.bgK.ue * 3.5, 0.0) != Blocks.cLc) {
                    if (!this.vh) {
                        if (qq.aER.bgK.a(net.minecraft.potion.a.dgw)) {
                            qq.aER.bgK.uf *= 1.003;
                            qq.aER.bgK.ud *= 1.003;
                        } else if (!this.e(tn.class).isEnabled()) {
                            qq.aER.bgK.uf *= 1.003;
                            qq.aER.bgK.ud *= 1.003;
                        }
                        if (((Boolean)this.RD.wD()).booleanValue() || bl2) {
                            qq.aER.bgK.ue += 0.075;
                            aii.strafe();
                        }
                    }
                    if (!((Boolean)this.RD.wD()).booleanValue() || this.RT || !((d4 = Math.sqrt(qq.aER.bgK.ud * qq.aER.bgK.ud + qq.aER.bgK.uf * qq.aER.bgK.uf)) < aii.getAllowedHorizontalDistance() - 0.02) && qq.aER.bgK.ud != 0.0 && qq.aER.bgK.uf != 0.0 || this.vh || !this.RT) {
                        // empty if block
                    }
                }
                if (qq.aER.bgK.tR == 10 && aik.p(0.0, qq.aER.bgK.ue * 2.0, 0.0) != Blocks.cLc) {
                    if (!this.vh && !this.RT) {
                        if (qq.aER.bgK.a(net.minecraft.potion.a.dgw)) {
                            qq.aER.bgK.uf *= 1.005;
                            qq.aER.bgK.ud *= 1.005;
                        } else {
                            qq.aER.bgK.uf *= 1.005;
                            qq.aER.bgK.ud *= 1.005;
                        }
                    }
                    if (((Boolean)this.RD.wD()).booleanValue() && !this.RT) {
                        d4 = Math.sqrt(qq.aER.bgK.ud * qq.aER.bgK.ud + qq.aER.bgK.uf * qq.aER.bgK.uf);
                        if (!(!(d4 < aii.getAllowedHorizontalDistance()) && qq.aER.bgK.ud != 0.0 && qq.aER.bgK.uf != 0.0 || this.vh || this.RT)) {
                            aii.strafe(aii.getAllowedHorizontalDistance());
                        }
                        aii.strafe();
                    }
                }
                if (aik.p(0.0, qq.aER.bgK.ue, 0.0) != Blocks.cLc) {
                    aii.strafe();
                    if (qq.aER.bgK.tR == 11) {
                        if (qq.aER.bgK.a(net.minecraft.potion.a.dgw) && qq.aER.bgK.b((net.minecraft.potion.a)net.minecraft.potion.a.dgw).dhk + 1 >= 2) {
                            aii.strafe(0.45);
                        } else if (qq.aER.bgK.a(net.minecraft.potion.a.dgw) && qq.aER.bgK.b((net.minecraft.potion.a)net.minecraft.potion.a.dgw).dhk + 1 == 1) {
                            aii.strafe(0.375);
                        } else {
                            aii.strafe(0.31);
                        }
                    }
                }
                d4 = aii.vs() / 2.29;
                this.LL = Math.hypot(qq.aER.bgK.ud - (qq.aER.bgK.csh - qq.aER.bgK.csk), qq.aER.bgK.uf - (qq.aER.bgK.csj - qq.aER.bgK.csm));
                if (this.LL < 0.0125 && ((Boolean)this.RE.wD()).booleanValue()) {
                    aii.strafe();
                }
                double d10 = qq.aER.bgK.ud;
                double d11 = qq.aER.bgK.uf;
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
                if (!((Boolean)this.RH.wD()).booleanValue() || qq.aER.bgK.ae > 20) {
                    // empty if block
                }
                if (qq.aER.bgK.a(net.minecraft.potion.a.dgw) && qq.aER.bgK.aO) {
                    if (!(this.e(tn.class).isEnabled() && qq.aER.aIY.chq.Re() || this.RT || !(aii.speed() < aii.getAllowedHorizontalDistance()) && qq.aER.bgK.ae <= 5 && ((Boolean)this.RG.wD()).booleanValue())) {
                        aii.strafe((Boolean)this.RD.wD() != false ? aii.getAllowedHorizontalDistance() : aii.getAllowedHorizontalDistance());
                        qq.aER.bgK.jump();
                    } else if (this.e(tn.class).isEnabled() && !this.RT && (aii.speed() < 0.29 || qq.aER.bgK.ae > 5 || !((Boolean)this.RG.wD()).booleanValue())) {
                        aii.strafe(0.29);
                        qq.aER.bgK.jump();
                    } else if (aii.speed() < 0.29 && qq.aER.bgK.ae < 5 && ((Boolean)this.RG.wD()).booleanValue() && !this.RT) {
                        qq.aER.bgK.jump();
                        if (qq.aER.bgK.ae > 1) {
                            aii.strafe();
                        }
                    } else {
                        aii.strafe(0.29);
                        qq.aER.bgK.jump();
                    }
                } else if (qq.aER.bgK.aO) {
                    if (!(this.RT || !(aii.speed() < aii.getAllowedHorizontalDistance()) && qq.aER.bgK.ae <= 5 && ((Boolean)this.RG.wD()).booleanValue())) {
                        aii.strafe(aii.getAllowedHorizontalDistance());
                        qq.aER.bgK.jump();
                    } else if (this.e(tn.class).isEnabled()) {
                        aii.strafe(0.23);
                        qq.aER.bgK.jump();
                    } else if (aii.speed() < aii.vs() || qq.aER.bgK.ae > 5 || !((Boolean)this.RG.wD()).booleanValue()) {
                        aii.strafe(aii.vs());
                        qq.aER.bgK.jump();
                    } else {
                        qq.aER.bgK.jump();
                        if (qq.aER.bgK.ae > 1) {
                            aii.strafe();
                        }
                    }
                }
                if (qq.aER.bgK.tR == 1 && !this.vh) {
                    this.RQ = true;
                    qq.aER.bgK.ue += (double)0.057f;
                    if (!(!qq.aER.bgK.a(net.minecraft.potion.a.dgw) || this.e(tn.class).isEnabled() && qq.aER.aIY.chq.Re() || qq.aER.bgK.b((net.minecraft.potion.a)net.minecraft.potion.a.dgw).dhk + 1 < 2 || this.vh || this.RT || !(aii.speed() < 0.48) && qq.aER.bgK.ae <= 5 && ((Boolean)this.RG.wD()).booleanValue())) {
                        aii.strafe(0.4875);
                    } else if (qq.aER.bgK.a(net.minecraft.potion.a.dgw) && qq.aER.bgK.b((net.minecraft.potion.a)net.minecraft.potion.a.dgw).dhk + 1 >= 2 && (aii.speed() < 0.4 || qq.aER.bgK.ae > 5 || !((Boolean)this.RG.wD()).booleanValue())) {
                        aii.strafe(0.4);
                    } else if (!this.RT && qq.aER.bgK.a(net.minecraft.potion.a.dgw) && qq.aER.bgK.b((net.minecraft.potion.a)net.minecraft.potion.a.dgw).dhk + 1 == 1 && (aii.speed() < 0.41 || qq.aER.bgK.ae > 5 || !((Boolean)this.RG.wD()).booleanValue())) {
                        aii.strafe(0.41);
                    } else if (this.RT && qq.aER.bgK.a(net.minecraft.potion.a.dgw) && qq.aER.bgK.b((net.minecraft.potion.a)net.minecraft.potion.a.dgw).dhk + 1 == 1 && (aii.speed() < 0.41 || qq.aER.bgK.ae > 5 || !((Boolean)this.RG.wD()).booleanValue())) {
                        aii.strafe(0.35);
                    } else if (aii.speed() < 0.33 || qq.aER.bgK.ae > 3 || !((Boolean)this.RG.wD()).booleanValue()) {
                        aii.strafe(0.3325);
                    } else {
                        aii.strafe();
                    }
                }
                if (qq.aER.bgK.tR == 2 && ((Boolean)this.RC.wD()).booleanValue()) {
                    d14 = qq.aER.bgK.ud;
                    d13 = qq.aER.bgK.uf;
                    qq.aER.bgK.uf = (qq.aER.bgK.uf * 1.0 + d13 * 2.0) / 3.0;
                    qq.aER.bgK.ud = (qq.aER.bgK.ud * 1.0 + d14 * 2.0) / 3.0;
                    if (qq.aER.bgK.ae >= 3 || qq.aER.bgK.ae != 1) {
                        // empty if block
                    }
                }
                if (qq.aER.bgK.tR == 3 && !this.vh) {
                    qq.aER.bgK.ue -= (double)0.1309f;
                }
                if (qq.aER.bgK.tR == 4 && !this.vh) {
                    qq.aER.bgK.ue -= 0.2;
                }
                if (qq.aER.bgK.tR > 1 && qq.aER.bgK.tR < 6 && qq.aER.bgK.a(net.minecraft.potion.a.dgw) && ((Boolean)this.RC.wD()).booleanValue() || qq.aER.bgK.tR <= 1 || qq.aER.bgK.tR >= 6 || ((Boolean)this.RC.wD()).booleanValue()) {
                    // empty if block
                }
                d14 = bt.aJ(Math.toDegrees(aii.direction()));
                d13 = bt.aJ(Math.toDegrees(Math.atan2(qq.aER.bgK.uf, qq.aER.bgK.ud)) - 90.0);
                double d15 = Math.abs(d14 - d13);
                double d16 = Math.hypot(qq.aER.bgK.ud - (qq.aER.bgK.csh - qq.aER.bgK.csk), qq.aER.bgK.uf - (qq.aER.bgK.csj - qq.aER.bgK.csm));
                boolean bl3 = !(d15 < 5.0 || ahj.n(d14, d13) > 90.0 || HJ || d16 < 0.0125);
                if (!(d15 < 7.0) || !((Boolean)this.RD.wD()).booleanValue()) {
                    // empty if block
                }
                if (!(qq.aER.bgK.tR != 6 || this.vh || !aik.ae(qq.aER.bgK.ue * 3.0) || !((Boolean)this.RD.wD()).booleanValue() && !bl3 || !(aii.speed() < aii.getAllowedHorizontalDistance() * 0.994) && ((Boolean)this.RG.wD()).booleanValue() && qq.aER.bgK.ae <= 5 || this.vh && ((Boolean)this.RH.wD()).booleanValue() || qq.aER.bgK.ae <= 1)) {
                    qq.aER.bgK.ue += 0.075;
                    aii.strafe(aii.speed());
                    d12 = Math.sqrt(qq.aER.bgK.ud * qq.aER.bgK.ud + qq.aER.bgK.uf * qq.aER.bgK.uf);
                    if (!(!(d12 < aii.getAllowedHorizontalDistance()) && qq.aER.bgK.ud != 0.0 && qq.aER.bgK.uf != 0.0 || this.vh || this.RT || !qq.aER.bgK.a(net.minecraft.potion.a.dgw) || this.e(tn.class).isEnabled())) {
                        aii.strafe(aii.getAllowedHorizontalDistance() * 0.994);
                    } else if (!(this.vh || this.e(tn.class).isEnabled() || !(d12 < aii.getAllowedHorizontalDistance()) && qq.aER.bgK.ud != 0.0 && qq.aER.bgK.uf != 0.0)) {
                        aii.strafe(aii.getAllowedHorizontalDistance() - 0.05);
                    }
                }
                if (qq.aER.bgK.tR < 7 && aik.p(0.0, qq.aER.bgK.ue, 0.0) != Blocks.cLc && qq.aER.bgK.a(net.minecraft.potion.a.dgw) && !this.RN) {
                    this.RS = true;
                    this.Px = qq.aER.bgK.aRg + 9;
                    this.RT = true;
                }
                if (!(qq.aER.bgK.tR != 7 || this.vh || !aik.ae(qq.aER.bgK.ue * 2.0) || this.e(tn.class).isEnabled() || !(aii.speed() < aii.getAllowedHorizontalDistance() * 1.1) && ((Boolean)this.RG.wD()).booleanValue() && qq.aER.bgK.ae <= 5 || qq.aER.bgK.ae <= 1)) {
                    aii.strafe((Boolean)this.RD.wD() != false ? aii.speed() : aii.getAllowedHorizontalDistance() * 1.1);
                }
                if (qq.aER.bgK.tR == 9) {
                    // empty if block
                }
                if (aik.ae(qq.aER.bgK.ue) && qq.aER.bgK.ae > 1 && !this.vh && !((Boolean)this.RI.wD()).booleanValue() && (qq.aER.bgK.tR > 6 && ((Boolean)this.RD.wD()).booleanValue() || qq.aER.bgK.tR > 6 && !((Boolean)this.RD.wD()).booleanValue()) && !this.RP && (aii.speed() < aii.getAllowedHorizontalDistance() * 1.095 || !((Boolean)this.RG.wD()).booleanValue() || qq.aER.bgK.ae > 5)) {
                    if (((Boolean)this.RD.wD()).booleanValue()) {
                        if (qq.aER.bgK.a(net.minecraft.potion.a.dgw) && qq.aER.bgK.b((net.minecraft.potion.a)net.minecraft.potion.a.dgw).dhk + 1 >= 2) {
                            aii.strafe(aii.getAllowedHorizontalDistance() * 1.093);
                        } else {
                            aii.strafe(aii.getAllowedHorizontalDistance() * 1.095);
                        }
                    } else if (qq.aER.bgK.a(net.minecraft.potion.a.dgw) && qq.aER.bgK.b((net.minecraft.potion.a)net.minecraft.potion.a.dgw).dhk + 1 >= 2) {
                        aii.strafe(aii.getAllowedHorizontalDistance() * 1.093);
                    } else {
                        aii.strafe(aii.getAllowedHorizontalDistance() * 1.095);
                    }
                    this.RP = true;
                } else if (aik.ae(qq.aER.bgK.ue) && !this.vh && qq.aER.bgK.ae > 1 && !((Boolean)this.RI.wD()).booleanValue() && qq.aER.bgK.tR > 6 && ((Boolean)this.RD.wD()).booleanValue() || qq.aER.bgK.tR > 6 && !((Boolean)this.RD.wD()).booleanValue() && !this.RP && (aii.speed() < aii.getAllowedHorizontalDistance() || !((Boolean)this.RG.wD()).booleanValue() || qq.aER.bgK.ae > 5)) {
                    aii.strafe(aii.getAllowedHorizontalDistance());
                    this.RP = true;
                } else if (aik.ae(qq.aER.bgK.ue) && qq.aER.bgK.tR > 5 && !this.RP && qq.aER.bgK.ae > 1 && (aii.speed() < aii.getAllowedHorizontalDistance() || !((Boolean)this.RG.wD()).booleanValue() || qq.aER.bgK.ae > 5)) {
                    aii.strafe(aii.getAllowedHorizontalDistance());
                    this.RP = true;
                } else if (aik.ae(qq.aER.bgK.ue) && qq.aER.bgK.tR > 5 && !this.RP && qq.aER.bgK.ae > 1 && ((Boolean)this.RG.wD()).booleanValue()) {
                    aii.strafe();
                }
                if (this.e(tn.class).isEnabled() && qq.aER.aIY.chq.Re()) {
                    if (qq.aER.bgK.aO && HJ) {
                        ((mh)this.wy()).toggle();
                        HJ = false;
                    }
                } else if ((this.vh || qq.aER.bgK.tR > 3 || qq.aER.bgK.aO) && HJ) {
                    ((mh)this.wy()).toggle();
                    HJ = false;
                }
                if ((d12 = Math.hypot(qq.aER.bgK.ud - (qq.aER.bgK.csh - qq.aER.bgK.csk), qq.aER.bgK.uf - (qq.aER.bgK.csj - qq.aER.bgK.csm))) < 0.0125) {
                    aii.strafe();
                }
                if (qq.aER.bgK.aO || qq.aER.bgK.tR == 11 || qq.aER.bgK.tR != 1) {
                    // empty if block
                }
                double d17 = qq.aER.bgK.ud;
                double d18 = qq.aER.bgK.uf;
                if (aii.speed() < 0.1245 && ((Boolean)this.RE.wD()).booleanValue()) {
                    aii.strafe(0.1245);
                }
                if (qq.aER.bgK.tR <= 1 || qq.aER.bgK.crR) break;
                aii.moveFlying(9.0E-4);
                break;
            }
            case "NCP Strafe": {
                double d19;
                double d20 = 0.075;
                if (!((Boolean)this.RH.wD()).booleanValue() || qq.aER.bgK.ae > 20) {
                    // empty if block
                }
                if (qq.aER.bgK.aO && aii.isMoving()) {
                    aii.strafe(aii.getAllowedHorizontalDistance());
                    qq.aER.bgK.jump();
                }
                double d21 = qq.aER.bgK.gX % 1.0;
                if (qq.aER.bgK.tR == 1 && !this.vh) {
                    if (qq.aER.bgK.a(net.minecraft.potion.a.dgw) && qq.aER.bgK.b((net.minecraft.potion.a)net.minecraft.potion.a.dgw).dhk + 1 >= 2) {
                        aii.strafe(0.48);
                    } else if (qq.aER.bgK.a(net.minecraft.potion.a.dgw) && qq.aER.bgK.b((net.minecraft.potion.a)net.minecraft.potion.a.dgw).dhk + 1 == 1) {
                        aii.strafe(0.4);
                    } else {
                        aii.strafe(0.334);
                    }
                    qq.aER.bgK.ue += (double)0.03f;
                    aii.preventDiagonalSpeed();
                }
                if (qq.aER.bgK.tR == 2 && !this.vh) {
                    d19 = qq.aER.bgK.ud;
                    double d22 = qq.aER.bgK.uf;
                    aii.strafe();
                    qq.aER.bgK.uf = (qq.aER.bgK.uf * 1.0 + d22 * 3.0) / 4.0;
                    qq.aER.bgK.ud = (qq.aER.bgK.ud * 1.0 + d19 * 3.0) / 4.0;
                    aii.useDiagonalSpeed();
                    qq.aER.bgK.ue -= (double)0.005f;
                }
                if (qq.aER.bgK.tR == 3 && !this.vh) {
                    aii.useDiagonalSpeed();
                    qq.aER.bgK.ue -= (double)0.04f;
                }
                if (qq.aER.bgK.tR == 4 && (qq.aER.bgK.ae > 1 || ((Boolean)this.RG.wD()).booleanValue()) && !this.vh) {
                    aii.useDiagonalSpeed();
                    qq.aER.bgK.ue -= (double)0.05f;
                }
                if (qq.aER.bgK.tR == 5 && !this.vh) {
                    aii.useDiagonalSpeed();
                }
                if (qq.aER.bgK.tR == 6 && !this.vh && qq.aER.bgK.ae > 10 && ((Boolean)this.RH.wD()).booleanValue()) {
                    aii.useDiagonalSpeed();
                    qq.aER.bgK.uf *= 1.01;
                    qq.aER.bgK.ud *= 1.01;
                }
                if (qq.aER.bgK.tR == 7 && !this.vh && qq.aER.bgK.ae > 10 && ((Boolean)this.RH.wD()).booleanValue()) {
                    aii.useDiagonalSpeed();
                    if (!qq.aER.bgK.a(net.minecraft.potion.a.dgw)) {
                        qq.aER.bgK.uf *= 1.01;
                        qq.aER.bgK.ud *= 1.01;
                    } else {
                        qq.aER.bgK.uf *= 1.008;
                        qq.aER.bgK.ud *= 1.008;
                    }
                }
                if (qq.aER.bgK.tR == 8 && aik.p(0.0, qq.aER.bgK.ue * 3.0, 0.0) != Blocks.cLc) {
                    aii.useDiagonalSpeed();
                    if (((Boolean)this.RD.wD()).booleanValue()) {
                        qq.aER.bgK.ue += (double)0.075f;
                        aii.strafe();
                    }
                }
                if (qq.aER.bgK.tR == 9 && aik.p(0.0, qq.aER.bgK.ue * 3.0, 0.0) != Blocks.cLc) {
                    aii.useDiagonalSpeed();
                    if (((Boolean)this.RD.wD()).booleanValue()) {
                        aii.strafe();
                    }
                }
                if (aik.p(0.0, qq.aER.bgK.ue, 0.0) != Blocks.cLc) {
                    if (qq.aER.bgK.a(net.minecraft.potion.a.dgw) && qq.aER.bgK.b((net.minecraft.potion.a)net.minecraft.potion.a.dgw).dhk + 1 >= 2) {
                        aii.strafe(0.45);
                    } else if (qq.aER.bgK.a(net.minecraft.potion.a.dgw) && qq.aER.bgK.b((net.minecraft.potion.a)net.minecraft.potion.a.dgw).dhk + 1 == 1) {
                        aii.strafe(0.375);
                    } else {
                        aii.strafe(0.31);
                    }
                }
                if (this.e(tn.class).isEnabled() && qq.aER.aIY.chq.Re()) {
                    if (qq.aER.bgK.aO && HJ) {
                        ((mh)this.wy()).toggle();
                        HJ = false;
                    }
                } else if ((this.vh || qq.aER.bgK.tR > 4 || qq.aER.bgK.aO) && HJ) {
                    ((mh)this.wy()).toggle();
                    HJ = false;
                }
                if (aii.speed() <= 0.125) {
                    aii.strafe(0.125);
                }
                if (!((d19 = Math.hypot(qq.aER.bgK.ud - (qq.aER.bgK.csh - qq.aER.bgK.csk), qq.aER.bgK.uf - (qq.aER.bgK.csj - qq.aER.bgK.csm))) <= 0.0125)) break;
                aii.strafe();
            }
        }
        if (aii.speed() < 0.45 || qq.aER.bgK.a(net.minecraft.potion.a.dgw) && qq.aER.bgK.b((net.minecraft.potion.a)net.minecraft.potion.a.dgw).dhk + 1 == 1 && aii.speed() < 0.55 || qq.aER.bgK.a(net.minecraft.potion.a.dgw) && qq.aER.bgK.b((net.minecraft.potion.a)net.minecraft.potion.a.dgw).dhk + 1 >= 2 && aii.speed() < 0.55) {
            if (this.RL && qq.aER.bgK.aO && !this.vh) {
                qq.aER.bgK.ud *= 1.45;
                qq.aER.bgK.uf *= 1.45;
            }
            if (!(!this.RL || aik.p(0.0, qq.aER.bgK.ue, 0.0) != Blocks.cMK && aik.p(0.0, qq.aER.bgK.ue, 0.0) != Blocks.cOD || this.vh || this.vh)) {
                qq.aER.bgK.ud *= 1.01;
                qq.aER.bgK.uf *= 1.01;
            }
            if (this.RL && qq.aER.bgK.tR == 1 && !this.vh) {
                qq.aER.bgK.ud *= 1.15;
                qq.aER.bgK.uf *= 1.15;
            }
            if (this.RL && qq.aER.bgK.tR > 1 && !this.vh && ((akg)this.RB.wD()).getName() == "Low Strafe") {
                qq.aER.bgK.ud *= 1.015;
                qq.aER.bgK.uf *= 1.015;
            }
        }
        if (ahj.n(d2, d3) < 5.0 && Objects.equals(((akg)this.RB.wD()).getName(), "Low Strafe") && ((Boolean)this.RF.wD()).booleanValue() && (!this.RS || qq.aER.bgK.tR > 2 && qq.aER.bgK.tR < 6) && (!qq.aER.aIY.chq.Re() || !this.e(tn.class).isEnabled()) && qq.aER.bgK.Zz > 10 && !this.vh && qq.aER.bgK.ae > 1 && aii.speed() < aii.vs() - 0.0323 && qq.aER.bgK.tR < 18) {
            afl.c(qq.aER.bgK.tR, new Object[0]);
            if (qq.aER.bgK.a(net.minecraft.potion.a.dgw)) {
                eo2.setSpeed(aii.vs() - 0.003);
            } else {
                eo2.setSpeed(aii.vs() - 0.001);
            }
        }
    };
    @dm
    public final dk<ed> Sa = ed2 -> {
        if (qq.aER.bgK.isInLava() || qq.aER.bgK.crZ) {
            ed2.cF();
        }
        if (!this.vh && ((akg)this.RB.wD()).getName() == "Low Strafe" && ((Boolean)this.RJ.wD()).booleanValue()) {
            ed2.setJumpMotion(0.42001f);
        } else if (((akg)this.RB.wD()).getName() == "Low Strafe" && ((Boolean)this.RJ.wD()).booleanValue()) {
            ed2.setJumpMotion(0.42001f);
        }
    };
    @dm
    public final dk<eh> Sb = eh2 -> {
        if (qq.aER.bgK.ae > 1 || !((Boolean)this.RG.wD()).booleanValue() && qq.aER.bgK.tR < 12) {
            double d2 = bt.aJ(Math.toDegrees(aii.direction()));
            double d3 = bt.aJ(Math.toDegrees(Math.atan2(qq.aER.bgK.uf, qq.aER.bgK.ud)) - 90.0);
            if (((Boolean)this.RC.wD()).booleanValue() && ((akg)this.RB.wD()).getName() == "Strafe") {
                if (ahj.n(d2, d3) > 90.0) {
                    if (qq.aER.bgK.a(net.minecraft.potion.a.dgw)) {
                        aii.a(aii.speed(), (float)d3 - 180.0f);
                    } else {
                        aii.a(aii.speed(), (float)d3 - 180.0f);
                    }
                } else if (((Boolean)this.RH.wD()).booleanValue() && qq.aER.bgK.ae > 20) {
                    double d4 = qq.aER.bgK.ud;
                    double d5 = qq.aER.bgK.uf;
                    aii.strafe();
                    qq.aER.bgK.uf = (qq.aER.bgK.uf * 3.0 + d5 * 1.0) / 4.0;
                    qq.aER.bgK.ud = (qq.aER.bgK.ud * 3.0 + d4 * 1.0) / 4.0;
                }
            } else if (((Boolean)this.RC.wD()).booleanValue()) {
                if (ahj.n(d2, d3) > 90.0) {
                    aii.a(aii.speed(), (float)d3 - 180.0f);
                } else {
                    double d6;
                    double d7;
                    if (((Boolean)this.RH.wD()).booleanValue() && qq.aER.bgK.ae > 20) {
                        d7 = qq.aER.bgK.ud;
                        d6 = qq.aER.bgK.uf;
                        aii.strafe();
                        qq.aER.bgK.uf = (qq.aER.bgK.uf * 3.0 + d6 * 1.0) / 4.0;
                        qq.aER.bgK.ud = (qq.aER.bgK.ud * 3.0 + d7 * 1.0) / 4.0;
                    }
                    d7 = qq.aER.bgK.ud;
                    d6 = qq.aER.bgK.uf;
                }
            }
        }
    };
    @dm
    public final dk<es> Sc = es2 -> {
        if (es2.df() instanceof BlockIce || es2.df() instanceof BlockPackedIce || qq.aER.bgK.crx > 1) {
            // empty if block
        }
    };
    @dm
    public final dk<dx> Sd = dx2 -> {
        if (((akg)this.RB.wD()).getName() != "Strafe" && dx2.cO() == ((mh)this.wy()).getKey() && !HJ) {
            dx2.cF();
            HJ = true;
        }
    };

    public qq(String string, mh mh2) {
        super(string, mh2);
    }

    @Override
    public void onEnable() {
        HJ = false;
        if (!bb.a(true, true, false, true, true) && !this.e(tn.class).isEnabled()) {
            Random random = new Random();
            float f2 = random.nextFloat();
            float f3 = random.nextFloat();
        }
        this.RN = false;
        this.RQ = false;
        if (a.a.g().c(tn.class).isEnabled()) {
            // empty if block
        }
        this.RP = false;
        if (((akg)this.e(tn.class).agx.wD()).getName().equals("On") && a.a.g().c(tn.class).isEnabled()) {
            aii.stop();
        }
        if (qq.aER.bgK.aO) {
            // empty if block
        }
        HJ = false;
        if (qq.aER.bgK.tR > 2) {
            this.vh = true;
        }
        this.RT = false;
    }

    @Override
    public void onDisable() {
        wd.hV = 0;
        wd.qH = 0;
        this.RL = false;
        afl.c(qq.aER.bgK.tR + ": " + qq.aER.bgK.ae, new Object[0]);
        this.RQ = false;
        if (a.a.g().c(tn.class).isEnabled()) {
            qq.aER.bgK.ud *= 0.85;
            qq.aER.bgK.uf *= 0.85;
        }
        if (this.e(tn.class).isEnabled() && qq.aER.aIY.chq.Re() && !qq.aER.bgK.a(net.minecraft.potion.a.dgw)) {
            aii.strafe(0.355);
        }
        this.vh = false;
        qq.aER.bgK.bkD = false;
    }

    public static void a(ez ez2, double d2, float f2, float f3, float f4) {
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
        ez2.setPosX(d3 * d2);
        ez2.setPosZ(d4 * d2);
    }

    static {
        Qo = 0.0f;
    }
}

