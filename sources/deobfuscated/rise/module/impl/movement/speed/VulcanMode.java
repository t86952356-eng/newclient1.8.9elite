/*
 * Decompiled with CFR 0.152.
 */
package rise.module.impl.movement.speed;

import hackclient.rise.afl;
import hackclient.rise.ahn;
import hackclient.rise.aii;
import hackclient.rise.aik;
import hackclient.rise.ain;
import hackclient.rise.aks;
import hackclient.rise.bb;
import hackclient.rise.bu;
import hackclient.rise.eh;
import hackclient.rise.fc;
import net.minecraft.block.BlockAir;
import net.minecraft.network.play.client.k;
import net.minecraft.potion.a;
import net.minecraft.util.ao;
import net.minecraft.util.b;
import rise.event.EventLink;
import rise.event.Listener;
import rise.event.impl.JumpEvent;
import rise.event.impl.MoveInputEvent;
import rise.event.impl.PreMotionEvent;
import rise.event.impl.StrafeEvent;
import rise.event.impl.TickEvent;
import rise.module.Mode;
import rise.module.impl.combat.Velocity;
import rise.module.impl.movement.Speed;
import rise.value.ModeValue;
import rise.value.NumberValue;

public final class VulcanMode
extends Mode<Speed> {
    private final NumberValue Rj = new NumberValue("Speed", this, (Number)2, (Number)1, (Number)10, (Number)1);
    ModeValue lI = new ModeValue("Mode", this).a(new Mode[]{new aks("BHop")}).a(new Mode[]{new aks("Lowhop")}).a(new Mode[]{new aks("Funny")}).a(new Mode[]{new aks("Use Disabler")}).a(new Mode[]{new aks("Ground")}).a(new Mode[]{new aks("Yport")}).co("Yport");
    private int Rb;
    private int FX;
    private double xv;
    private int PR = 0;
    private double az = 0.0;
    private double aB = 0.0;
    private boolean zL = false;
    @EventLink
    public final Listener<JumpEvent> Rk = jumpEvent -> ++this.PR;
    @EventLink
    public final Listener<fc> Rl = fc2 -> {
        switch (((Mode)this.lI.wD()).getName()) {
            case "BHop": {
                aii.strafe(0.22);
            }
        }
    };
    @EventLink
    public final Listener<PreMotionEvent> Rm = preMotionEvent -> {
        if (VulcanMode.aER.bgK.ae < 2) {
            VulcanMode.aER.bgK.ud *= 1.4;
            VulcanMode.aER.bgK.uf *= 1.4;
            if (aii.isMoving()) {
                aii.strafe();
            } else {
                VulcanMode.aER.bgK.ud *= -1.0;
                VulcanMode.aER.bgK.uf *= -1.0;
            }
            if (VulcanMode.aER.bgK.ae == 2) {
                VulcanMode.aER.bgK.ud *= 1.3;
                VulcanMode.aER.bgK.uf *= 1.3;
            }
        }
        if (((Mode)this.lI.wD()).getName().equals("BHop")) {
            if (VulcanMode.aER.bgK.tR == 0) {
                aii.strafe();
            }
            if (VulcanMode.aER.bgK.tR == 1) {
                aii.strafe();
            }
            if (VulcanMode.aER.bgK.tR == 2) {
                aii.strafe();
            }
            if (VulcanMode.aER.bgK.tR == 3) {
                // empty if block
            }
            if (VulcanMode.aER.bgK.tR == 4) {
                aii.strafe();
            }
            if (VulcanMode.aER.bgK.tR == 5) {
                VulcanMode.aER.bgK.aO = true;
                aii.strafe();
                preMotionEvent.setOnGround(true);
            }
        }
        if (((Mode)this.lI.wD()).getName().equals("Ground")) {
            if (VulcanMode.aER.bgK.cuU) {
                VulcanMode.aER.bgK.ud *= 0.75;
                VulcanMode.aER.bgK.uf *= 0.75;
            }
            if (VulcanMode.aER.bgK.aO && aii.isMoving()) {
                double d2 = Math.hypot(VulcanMode.aER.bgK.ud, VulcanMode.aER.bgK.uf);
                boolean bl2 = (VulcanMode.aER.bgK.a(a.dgw) ? VulcanMode.aER.bgK.b((a)a.dgw).dhk + 1 : 0) >= 2;
                switch (this.FX) {
                    case 1: {
                        this.xv = 0.58f;
                        d2 = bl2 ? d2 + 0.2 : 0.487;
                        preMotionEvent.setOnGround(true);
                        VulcanMode.aER.bgK.aO = true;
                        break;
                    }
                    case 2: {
                        d2 = bl2 ? d2 * 0.71 : 0.197;
                        this.xv -= (double)0.0784f;
                        preMotionEvent.setOnGround(false);
                        VulcanMode.aER.bgK.aO = true;
                        break;
                    }
                    default: {
                        this.FX = 0;
                        d2 /= bl2 ? 0.64 : 0.58;
                        preMotionEvent.setOnGround(true);
                        VulcanMode.aER.bgK.aO = true;
                    }
                }
                aii.strafe(d2);
                ++this.FX;
                preMotionEvent.setPosY(preMotionEvent.getPosY() + this.xv);
                aii.preventDiagonalSpeed();
            } else {
                aii.strafe();
                this.FX = 0;
            }
        }
    };
    @EventLink
    public final Listener<eh> Rn = eh2 -> {
        if (((Mode)this.lI.wD()).getName().equals("Use Disabler")) {
            if (VulcanMode.aER.bgK.aO) {
                VulcanMode.aER.bgK.ue = 0.42f;
            }
            int n2 = VulcanMode.aER.bgK.a(a.dgw) ? VulcanMode.aER.bgK.b((a)a.dgw).dhk + 1 : 0;
            boolean bl2 = VulcanMode.aER.bgK.tR == 11;
            boolean bl3 = VulcanMode.aER.bgK.aO;
            switch (n2) {
                case 0: {
                    aii.strafe(bl2 ? 0.3225 : (bl3 ? 0.6505 : 0.36));
                    break;
                }
                case 1: {
                    aii.strafe(bl2 ? 0.3975 : (bl3 ? 0.7255 : 0.4275));
                    break;
                }
                default: {
                    aii.strafe(bl2 ? 0.4725 : (bl3 ? 0.8005 : 0.495));
                }
            }
        }
    };
    @EventLink
    public final Listener<MoveInputEvent> Ro = moveInputEvent -> {
        if (((Mode)this.lI.wD()).getName().equals("BHop")) {
            moveInputEvent.setJump(false);
        }
    };
    @EventLink
    public final Listener<StrafeEvent> Rp = strafeEvent -> {
        double d2 = Math.sqrt(VulcanMode.aER.bgK.ud * VulcanMode.aER.bgK.ud + VulcanMode.aER.bgK.uf * VulcanMode.aER.bgK.uf);
        if (!aii.isMoving()) {
            return;
        }
        block6 : switch (((Mode)this.lI.wD()).getName()) {
            case "Yport": {
                double d3;
                aii.strafe();
                if (aii.speed() < 0.22) {
                    // empty if block
                }
                if (VulcanMode.aER.bgK.tR == 1) {
                    VulcanMode.aER.bgK.ue = -0.15;
                }
                if (VulcanMode.aER.bgK.tR == 2) {
                    VulcanMode.aER.bgK.ue = -0.3;
                }
                if (VulcanMode.aER.bgK.aO) {
                    // empty if block
                }
                if ((d3 = Math.hypot(VulcanMode.aER.bgK.ud - (VulcanMode.aER.bgK.csh - VulcanMode.aER.bgK.csk), VulcanMode.aER.bgK.uf - (VulcanMode.aER.bgK.csj - VulcanMode.aER.bgK.csm))) < 0.022) {
                    // empty if block
                }
                if (VulcanMode.aER.bgK.cus <= 0 && VulcanMode.aER.bgK.ae >= 40 || ((Mode)this.e(Velocity.class).qP.wD()).getName() == "Vulcan") {
                    // empty if block
                }
                if (VulcanMode.aER.bgK.aO) {
                    VulcanMode.aER.bgK.jump();
                    if (VulcanMode.aER.bgK.a(a.dgw) && VulcanMode.aER.bgK.ae > 11 || VulcanMode.aER.bgK.ae > 11) {
                        // empty if block
                    }
                }
                if (VulcanMode.aER.bgK.tR == 1) {
                    if (VulcanMode.aER.bgK.a(a.dgw) && VulcanMode.aER.bgK.ae > 11) {
                        aii.strafe(0.05 * (double)(1 + VulcanMode.aER.bgK.b(a.dgw).ajf()) + 0.308);
                    } else if (VulcanMode.aER.bgK.ae > 11) {
                        aii.strafe(0.3035);
                    } else {
                        aii.strafe();
                    }
                }
                if (!(VulcanMode.aER.bgK.tR != 2 || VulcanMode.aER.bgK.a(a.dgw) && VulcanMode.aER.bgK.ae > 11)) {
                    if (VulcanMode.aER.bgK.ae > 11) {
                        aii.strafe();
                    } else {
                        aii.strafe();
                    }
                }
                aii.preventDiagonalSpeed();
                break;
            }
            case "Lowhop": {
                if ((VulcanMode.aER.bgK.cus > 0 || VulcanMode.aER.bgK.ae < 40) && ((Mode)this.e(Velocity.class).qP.wD()).getName() == "Vulcan") {
                    aii.strafe();
                }
                if (aii.speed() < 0.22) {
                    aii.strafe(0.22);
                }
                double d4 = aii.vs() / 2.29;
                double d5 = Math.hypot(VulcanMode.aER.bgK.ud - (VulcanMode.aER.bgK.csh - VulcanMode.aER.bgK.csk), VulcanMode.aER.bgK.uf - (VulcanMode.aER.bgK.csj - VulcanMode.aER.bgK.csm));
                if (d5 < 0.022) {
                    aii.strafe();
                }
                switch (VulcanMode.aER.bgK.tR) {
                    case 5: {
                        if (this.PR % 4 != 1) break;
                        aii.strafe();
                        break;
                    }
                    case 0: {
                        VulcanMode.aER.bgK.jump();
                        if (VulcanMode.aER.bgK.a(a.dgw) && VulcanMode.aER.bgK.ae > 11) {
                            aii.strafe(0.06 * (double)(1 + VulcanMode.aER.bgK.b(a.dgw).ajf()) + 0.485);
                            break;
                        }
                        if (VulcanMode.aER.bgK.ae > 11) {
                            aii.strafe(0.485);
                            break;
                        }
                        aii.strafe();
                        break;
                    }
                    case 9: {
                        break;
                    }
                    case 8: {
                        aii.strafe();
                        break;
                    }
                    case 2: {
                        if (this.PR % 4 == 1 || VulcanMode.aER.bgK.crW) break;
                        VulcanMode.aER.bgK.ue = aii.predictedMotion(VulcanMode.aER.bgK.ue, 2);
                        break;
                    }
                    case 1: {
                        aii.strafe();
                        break;
                    }
                    case 4: {
                        if (this.PR % 4 != 1 && !VulcanMode.aER.bgK.crW) break;
                        VulcanMode.aER.bgK.ue = aii.predictedMotion(VulcanMode.aER.bgK.ue, 4);
                    }
                }
                if (!(aik.p(0.0, VulcanMode.aER.bgK.ue, 0.0) instanceof BlockAir)) {
                    aii.strafe();
                }
                this.a(VulcanMode.aER.bgK.gY, VulcanMode.aER.bgK.gW, VulcanMode.aER.bgK.isSprinting(), VulcanMode.aER.bgK.csQ, VulcanMode.aER.bgK.tR);
                break;
            }
            case "BHop": {
                double d6;
                if (VulcanMode.aER.bgK.ae == 1) {
                    // empty if block
                }
                if (aii.speed() < 0.22) {
                    aii.strafe(0.22);
                }
                if (VulcanMode.aER.bgK.cus <= 0 && VulcanMode.aER.bgK.css >= 50 || ((Mode)this.e(Velocity.class).qP.wD()).getName() == "Vulcan") {
                    // empty if block
                }
                if ((d6 = Math.hypot(VulcanMode.aER.bgK.ud - (VulcanMode.aER.bgK.csh - VulcanMode.aER.bgK.csk), VulcanMode.aER.bgK.uf - (VulcanMode.aER.bgK.csj - VulcanMode.aER.bgK.csm))) < 0.022) {
                    aii.strafe();
                }
                if (aii.speed() < 0.22) {
                    aii.strafe(0.22);
                }
                switch (VulcanMode.aER.bgK.tR) {
                    case 0: {
                        if (!VulcanMode.aER.bgK.a(a.dgw) && VulcanMode.aER.bgK.ae > 30) {
                            VulcanMode.aER.bgK.ud *= 0.985;
                            VulcanMode.aER.bgK.uf *= 0.985;
                        }
                        if (!(aik.p(0.0, VulcanMode.aER.bgK.ue, 0.0) instanceof BlockAir)) {
                            VulcanMode.aER.bgK.jump();
                        }
                        if (aii.speed() < 487.0 && VulcanMode.aER.bgK.ae > 10) {
                            aii.strafe(0.487);
                            break;
                        }
                        aii.strafe();
                        break;
                    }
                    case 11: {
                        break;
                    }
                    case 1: {
                        if (aii.speed() < 0.3355 && VulcanMode.aER.bgK.ae > 10) {
                            aii.strafe(0.3355);
                        } else {
                            aii.strafe();
                        }
                        if (VulcanMode.aER.bgK.a(a.dgw) && VulcanMode.aER.bgK.b((a)a.dgw).dhk + 1 >= 2 && aii.speed() < 0.06 * (double)(1 + VulcanMode.aER.bgK.b(a.dgw).ajf()) + 0.487) break;
                        if (VulcanMode.aER.bgK.a(a.dgw) && VulcanMode.aER.bgK.b((a)a.dgw).dhk + 1 == 1 && aii.speed() < 0.06 * (double)(1 + VulcanMode.aER.bgK.b(a.dgw).ajf()) + 0.41) {
                            aii.strafe();
                            break;
                        }
                        aii.strafe();
                        if (!(aii.speed() < 0.3355)) break;
                        break;
                    }
                    case 5: {
                        if (VulcanMode.aER.bgK.ae > 10) {
                            aii.strafe(0.27);
                        }
                        if (aik.p(0.0, 1.0, 0.0) instanceof BlockAir) break;
                        VulcanMode.aER.bgK.ue = 0.003;
                        break;
                    }
                    case 9: {
                        if (!(aik.p(0.0, VulcanMode.aER.bgK.ue, 0.0) instanceof BlockAir)) {
                            aii.strafe();
                        }
                        if (!(VulcanMode.aER.bgK.a(a.dgw) && VulcanMode.aER.bgK.b((a)a.dgw).dhk + 1 >= 2 && aii.speed() < 0.06 * (double)(1 + VulcanMode.aER.bgK.b(a.dgw).ajf()) + 0.46 || VulcanMode.aER.bgK.a(a.dgw) && VulcanMode.aER.bgK.b((a)a.dgw).dhk + 1 == 1 && aii.speed() < 0.06 * (double)(1 + VulcanMode.aER.bgK.b(a.dgw).ajf()) + 0.385)) {
                            if (aii.speed() < 0.299) {
                                aii.strafe(0.299);
                            } else {
                                aii.strafe();
                            }
                        }
                        VulcanMode.aER.bgK.ue = -0.8;
                        break;
                    }
                    case 10: {
                        VulcanMode.aER.bgK.ue = -10.0;
                    }
                }
                this.a(VulcanMode.aER.bgK.gY, VulcanMode.aER.bgK.gW, VulcanMode.aER.bgK.isSprinting(), VulcanMode.aER.bgK.csQ, VulcanMode.aER.bgK.tR);
                aii.useDiagonalSpeed();
                break;
            }
            case "Funny": {
                int n2;
                int n3 = ain.vM();
                if (n3 == -1) {
                    afl.b("This speed requires a block to be in your HotBar.", new Object[0]);
                    return;
                }
                if (!bb.a(false, true, false, false, false)) {
                    this.d(bu.class);
                    bu.setSlot(n3);
                }
                int n4 = n2 = VulcanMode.aER.bgK.a(a.dgw) ? VulcanMode.aER.bgK.b((a)a.dgw).dhk + 1 : 0;
                if (!bb.a(false, true, false, false, false) && this.Rb < VulcanMode.aER.bgK.aRg) {
                    this.Rb = VulcanMode.aER.bgK.aRg + 2;
                    b b2 = new b(VulcanMode.aER.bgK).aqY();
                    int n5 = ao.dwr.OY();
                    this.d(bu.class);
                    ahn.m(new k(b2, n5, bu.bO(), 0.0f, 1.0f, 0.0f));
                }
                switch (VulcanMode.aER.bgK.tR) {
                    case 0: {
                        switch (n2) {
                            case 0: {
                                aii.strafe(0.55);
                                break;
                            }
                            case 1: {
                                aii.strafe(0.54);
                                break;
                            }
                            default: {
                                aii.strafe(0.6699999999999999);
                            }
                        }
                        VulcanMode.aER.bgK.ue = 0.2f;
                        break block6;
                    }
                    case 1: {
                        VulcanMode.aER.bgK.ue = -0.0784000015258789;
                        switch (n2) {
                            case 0: {
                                aii.strafe(0.43);
                                break block6;
                            }
                            case 1: {
                                aii.strafe(0.49);
                                break block6;
                            }
                        }
                        aii.strafe(0.5700000000000001);
                        break block6;
                    }
                    case 2: {
                        switch (n2) {
                            case 0: {
                                aii.strafe(0.37);
                                break block6;
                            }
                            case 1: {
                                aii.strafe(0.44000000000000006);
                                break block6;
                            }
                        }
                        aii.strafe(0.47000000000000003);
                    }
                }
            }
        }
    };
    @EventLink
    public final Listener<TickEvent> Rq = tickEvent -> {
        switch (((Mode)this.lI.wD()).getName()) {
            case "Yport": {
                if (VulcanMode.aER.bgK.tR == 0) {
                    aii.strafe();
                }
                if (VulcanMode.aER.bgK.tR == 2) {
                    aii.strafe();
                }
                if (VulcanMode.aER.bgK.tR == 3) {
                    aii.strafe();
                }
                this.a(VulcanMode.aER.bgK.gY, VulcanMode.aER.bgK.gW, VulcanMode.aER.bgK.isSprinting(), VulcanMode.aER.bgK.csQ, VulcanMode.aER.bgK.tR);
            }
        }
    };

    public VulcanMode(String string, Speed speed) {
        super(string, speed);
    }

    @Override
    public void onDisable() {
        if (((Mode)this.lI.wD()).getName().equals("Ground")) {
            aii.strafe(aii.getAllowedHorizontalDistance() * 0.6 - 0.02);
        }
    }

    public void a(double d2, double d3, boolean bl2, int n2, int n3) {
        boolean bl3;
        double d4 = (VulcanMode.aER.bgK.csh - VulcanMode.aER.bgK.csk) * (double)0.91f;
        double d5 = (VulcanMode.aER.bgK.csh - VulcanMode.aER.bgK.csk) * (double)0.91f;
        double d6 = 1000000.0;
        double d7 = d2 * d6;
        double d8 = d3 * d6;
        double d9 = d7 - d4;
        double d10 = d8 - d5;
        double d11 = Math.hypot(d9, d10);
        d11 /= this.zL ? 1.3 : 1.3;
        d11 -= bl2 || n2 < 2 ? 0.026 : 0.026;
        if (VulcanMode.aER.bgK.aRg % 2 == 0) {
            // empty if block
        }
        boolean bl4 = bl3 = d11 > 0.0075 && Math.hypot(d7, d8) > 0.25 && n3 > 2;
        if (!bl3) {
            aii.strafe();
        }
        this.az = d7;
        this.aB = d8;
        this.zL = bl2;
    }
}

