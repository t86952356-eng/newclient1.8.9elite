/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.ahn;
import hackclient.rise.aii;
import hackclient.rise.ain;
import hackclient.rise.akb;
import hackclient.rise.akg;
import hackclient.rise.akp;
import hackclient.rise.aks;
import hackclient.rise.bb;
import hackclient.rise.bs;
import hackclient.rise.cb;
import hackclient.rise.dk;
import hackclient.rise.dm;
import hackclient.rise.dz;
import hackclient.rise.ei;
import hackclient.rise.ej;
import hackclient.rise.eo;
import hackclient.rise.eq;
import hackclient.rise.ez;
import hackclient.rise.mh;
import hackclient.rise.tn;
import java.util.Random;
import net.minecraft.init.Items;
import net.minecraft.item.co;
import net.minecraft.network.play.client.k;
import net.minecraft.potion.a;
import net.minecraft.util.ao;
import net.minecraft.util.b;

public class qn
extends akg<mh> {
    private int hV;
    private boolean QZ;
    private boolean Ra;
    private int Rb;
    private boolean LK;
    private double LL;
    private float jp;
    private float jq;
    private boolean GQ = true;
    private boolean cJ = false;
    private int Rc = 0;
    private final akp Rd = new akp("Sub-Mode", this).a(new akg[]{new aks("Hop")}).a(new akg[]{new aks("yPort")}).a(new akg[]{new aks("Fast")}).a(new akg[]{new aks("LowHop")}).co("Hop");
    @dm
    public final dk<ei> Re = ei2 -> {
        if (!aii.isMoving()) {
            return;
        }
        switch (((akg)this.Rd.wD()).getName()) {
            case "Fast": {
                if (!(qn.aER.bgK.cuW > 0.0f)) {
                    this.Ra = true;
                    return;
                }
                if (qn.aER.bgK.aO) {
                    if (aii.speed() > 0.3) {
                        this.Ra = false;
                    }
                    ei2.setOnGround(true);
                    aii.strafe(0.41);
                    qn.aER.bgK.ue = 0.42f;
                    qn.aER.bgC.dAp = 2.1f;
                    this.hV = 0;
                    break;
                }
                if (this.hV >= 10) {
                    this.QZ = true;
                    aii.strafe(0.35f);
                    return;
                }
                if (this.QZ) {
                    if (this.Ra) {
                        aii.strafe(0.2);
                    } else if (this.hV <= 1) {
                        aii.strafe(0.35f);
                    } else {
                        aii.strafe(0.69f - ((float)this.hV - 2.0f) * 0.019f);
                    }
                }
                qn.aER.bgK.ue = 0.0;
                qn.aER.bgC.dAp = 0.9f;
                ei2.setOnGround(true);
                qn.aER.bgK.aO = true;
            }
        }
        ++this.hV;
    };
    @dm
    public final dk<eo> Rf = eo2 -> {
        switch (((akg)this.Rd.wD()).getName()) {
            case "Hop": {
                double d2 = aii.getAllowedHorizontalDistance();
                if (aii.isMoving()) {
                    switch (qn.aER.bgK.tR) {
                        case 0: {
                            float f2 = 0.39f;
                            float f3 = qn.aER.bgK.crR ? 0.42f : (f2 == 0.4f ? f2 : 0.42f);
                            qn.aER.bgK.ue = aii.jumpBoostMotion(f3);
                            this.LL = d2 * 1.76;
                            break;
                        }
                        case 1: {
                            this.LL -= 0.439 * (this.LL - d2);
                            break;
                        }
                        default: {
                            this.LL -= this.LL / (double)159.9f;
                        }
                    }
                    qn.aER.bgC.dAp = 1.0f;
                    this.LK = false;
                } else if (!this.LK) {
                    this.LL = aii.getAllowedHorizontalDistance();
                    qn.aER.bgC.dAp = 1.0f;
                    this.LK = true;
                }
                eo2.setSpeed(Math.max(this.LL, d2), Math.random() / 2000.0);
                if (qn.aER.bgK.css <= 20) {
                    eo2.setSpeed(this.LL * 2.0);
                }
                if (qn.aER.bgK.isInWater()) {
                    eo2.setSpeed(0.4);
                }
                if (!qn.aER.bgK.a(a.dgw)) break;
                eo2.setSpeed(0.93 * Math.max(this.LL, d2), 1.0);
                if (qn.aER.bgK.crR) {
                    this.LL = aii.getAllowedHorizontalDistance();
                }
                if (qn.aER.bgK.css > 20) break;
                eo2.setSpeed(this.LL * 2.0);
            }
        }
        if (((akg)this.Rd.wD()).getName().equals("yPort")) {
            aii.preventDiagonalSpeed();
            if (this.Rc > 0) {
                --this.Rc;
            } else {
                this.cJ = false;
            }
            if (qn.aER.aIY.chq.Re() && qn.aER.bgK.aO) {
                qn.aER.bgK.ue = 0.42f;
            }
            if (!qn.aER.aIY.chq.Re() && qn.aER.bgK.tR < 2) {
                int n2 = ain.vM();
                if (n2 == -1) {
                    // empty if block
                }
                if (!bb.a(false, true, false, false, false) && !this.e(tn.class).isEnabled()) {
                    Random random = new Random();
                    float f4 = random.nextFloat();
                    float f5 = random.nextFloat();
                    ahn.m(new k(new b(qn.aER.bgK.gW, qn.aER.bgK.gX, qn.aER.bgK.gY), ao.dwr.OY(), new co(Items.cQB), f4, 1.0f, f5));
                }
                if (this.GQ) {
                    this.GQ = false;
                }
                if (qn.aER.bgK.a(a.dgw)) {
                    aii.strafe(0.179 * (double)(1 + qn.aER.bgK.b(a.dgw).ajf()) + 0.46);
                } else {
                    aii.strafe(0.4645);
                }
                if (!bb.a(false, true, true, false, false)) {
                    // empty if block
                }
                if (!bb.a(false, true, false, false, false) & this.cJ) {
                    this.Rb = qn.aER.bgK.aRg + 2;
                }
                if (!bb.a(false, true, false, false, false) & qn.aER.bgK.aRg % 10 == 1) {
                    this.Rb = qn.aER.bgK.aRg + 2;
                }
                if (qn.aER.bgK.aO) {
                    qn.aER.bgK.ue = 0.0;
                    if (qn.aER.bgK.a(a.dgw)) {
                        aii.strafe(0.092 * (double)(1 + qn.aER.bgK.b(a.dgw).ajf()) + 0.55);
                    } else {
                        aii.strafe(0.558);
                    }
                }
                aii.preventDiagonalSpeed();
            } else {
                this.GQ = true;
                if (qn.aER.bgK.a(a.dgw)) {
                    aii.strafe(0.04 * (double)(1 + qn.aER.bgK.b(a.dgw).ajf()) + 0.41);
                } else {
                    eo2.setSpeed(0.41);
                }
            }
            aii.preventDiagonalSpeed();
        }
    };
    @dm
    public final dk<ez> Rg = ez2 -> {
        if (!aii.isMoving()) {
            return;
        }
        if (((akg)this.Rd.wD()).getName().equals("LowHop")) {
            if (qn.aER.bgK.aO) {
                ez2.setPosY(0.42f);
                aii.strafe((double)0.69f + aii.speedPotionAmp(0.1));
                qn.aER.bgK.ue = 0.0;
            } else {
                aii.strafe((double)0.41f + aii.speedPotionAmp(0.055));
            }
            if (qn.aER.bgK.css <= 20) {
                aii.strafe(1.0 + aii.speedPotionAmp(0.055));
            }
            qn.aER.bgK.setSprinting(true);
            qn.aER.bgK.bkD = true;
        }
    };
    @dm
    public final dk<dz> Rh = dz2 -> {
        dz2.setJump(false);
        dz2.setSneak(false);
        this.jp = dz2.getForward();
        this.jq = dz2.getStrafe();
    };
    @dm
    public final dk<eq> Ri = eq2 -> {
        this.cJ = true;
        this.Rc = 10;
    };
    @dm(cH=1)
    dk<ej> dq = ej2 -> {
        if (((akg)this.Rd.wD()).getName().equals("Hop")) {
            bs.a(new akb((float)Math.toDegrees(aii.g(this.jp, this.jq)), qn.aER.bgK.pm), 2.0, cb.gJ);
        }
    };

    public qn(String string, mh mh2) {
        super(string, mh2);
    }

    @Override
    public void onEnable() {
        this.GQ = true;
        if (((akg)this.Rd.wD()).getName().equals("yPort") && !bb.a(true, true, true, true, true) && !this.e(tn.class).isEnabled()) {
            Random random = new Random();
            float f2 = random.nextFloat();
            float f3 = random.nextFloat();
            ahn.m(new k(new b(qn.aER.bgK.gW, qn.aER.bgK.gX, qn.aER.bgK.gY), ao.dwr.OY(), new co(Items.cQB), f2, 1.0f, f3));
        }
        this.Ra = false;
        this.QZ = false;
        this.hV = 0;
    }

    @Override
    public void onDisable() {
        if (((akg)this.Rd.wD()).getName().equals("yPort") && !bb.a(true, true, true, true, true) && !this.e(tn.class).isEnabled()) {
            Random random = new Random();
            float f2 = random.nextFloat();
            float f3 = random.nextFloat();
            ahn.m(new k(new b(qn.aER.bgK.gW, qn.aER.bgK.gX, qn.aER.bgK.gY), ao.dwr.OY(), new co(Items.cQB), f2, 1.0f, f3));
        }
    }
}

