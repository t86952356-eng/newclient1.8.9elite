/*
 * Decompiled with CFR 0.152.
 */
package rise.module.impl.movement.speed;

import hackclient.rise.ahn;
import hackclient.rise.aii;
import hackclient.rise.ain;
import hackclient.rise.aks;
import hackclient.rise.bb;
import hackclient.rise.bs;
import hackclient.rise.cb;
import java.util.Random;
import net.minecraft.init.Items;
import net.minecraft.item.co;
import net.minecraft.network.play.client.k;
import net.minecraft.potion.a;
import net.minecraft.util.ao;
import net.minecraft.util.b;
import rise.event.EventLink;
import rise.event.Listener;
import rise.event.impl.AttackEvent;
import rise.event.impl.MoveEvent;
import rise.event.impl.MoveInputEvent;
import rise.event.impl.PreMotionEvent;
import rise.event.impl.PreUpdateEvent;
import rise.event.impl.StrafeEvent;
import rise.module.Mode;
import rise.module.impl.movement.Speed;
import rise.module.impl.player.Scaffold;
import rise.util.math.Vector2f;
import rise.value.ModeValue;

public class VerusMode
extends Mode<Speed> {
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
    private final ModeValue Rd = new ModeValue("Sub-Mode", this).a(new Mode[]{new aks("Hop")}).a(new Mode[]{new aks("yPort")}).a(new Mode[]{new aks("Fast")}).a(new Mode[]{new aks("LowHop")}).co("Hop");
    @EventLink
    public final Listener<PreMotionEvent> Re = preMotionEvent -> {
        if (!aii.isMoving()) {
            return;
        }
        switch (((Mode)this.Rd.wD()).getName()) {
            case "Fast": {
                if (!(VerusMode.aER.bgK.cuW > 0.0f)) {
                    this.Ra = true;
                    return;
                }
                if (VerusMode.aER.bgK.aO) {
                    if (aii.speed() > 0.3) {
                        this.Ra = false;
                    }
                    preMotionEvent.setOnGround(true);
                    aii.strafe(0.41);
                    VerusMode.aER.bgK.ue = 0.42f;
                    VerusMode.aER.bgC.dAp = 2.1f;
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
                VerusMode.aER.bgK.ue = 0.0;
                VerusMode.aER.bgC.dAp = 0.9f;
                preMotionEvent.setOnGround(true);
                VerusMode.aER.bgK.aO = true;
            }
        }
        ++this.hV;
    };
    @EventLink
    public final Listener<StrafeEvent> Rf = strafeEvent -> {
        switch (((Mode)this.Rd.wD()).getName()) {
            case "Hop": {
                double d2 = aii.getAllowedHorizontalDistance();
                if (aii.isMoving()) {
                    switch (VerusMode.aER.bgK.tR) {
                        case 0: {
                            float f2 = 0.39f;
                            float f3 = VerusMode.aER.bgK.crR ? 0.42f : (f2 == 0.4f ? f2 : 0.42f);
                            VerusMode.aER.bgK.ue = aii.jumpBoostMotion(f3);
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
                    VerusMode.aER.bgC.dAp = 1.0f;
                    this.LK = false;
                } else if (!this.LK) {
                    this.LL = aii.getAllowedHorizontalDistance();
                    VerusMode.aER.bgC.dAp = 1.0f;
                    this.LK = true;
                }
                strafeEvent.setSpeed(Math.max(this.LL, d2), Math.random() / 2000.0);
                if (VerusMode.aER.bgK.css <= 20) {
                    strafeEvent.setSpeed(this.LL * 2.0);
                }
                if (VerusMode.aER.bgK.isInWater()) {
                    strafeEvent.setSpeed(0.4);
                }
                if (!VerusMode.aER.bgK.a(a.dgw)) break;
                strafeEvent.setSpeed(0.93 * Math.max(this.LL, d2), 1.0);
                if (VerusMode.aER.bgK.crR) {
                    this.LL = aii.getAllowedHorizontalDistance();
                }
                if (VerusMode.aER.bgK.css > 20) break;
                strafeEvent.setSpeed(this.LL * 2.0);
            }
        }
        if (((Mode)this.Rd.wD()).getName().equals("yPort")) {
            aii.preventDiagonalSpeed();
            if (this.Rc > 0) {
                --this.Rc;
            } else {
                this.cJ = false;
            }
            if (VerusMode.aER.aIY.chq.Re() && VerusMode.aER.bgK.aO) {
                VerusMode.aER.bgK.ue = 0.42f;
            }
            if (!VerusMode.aER.aIY.chq.Re() && VerusMode.aER.bgK.tR < 2) {
                int n2 = ain.vM();
                if (n2 == -1) {
                    // empty if block
                }
                if (!bb.a(false, true, false, false, false) && !this.e(Scaffold.class).isEnabled()) {
                    Random random = new Random();
                    float f4 = random.nextFloat();
                    float f5 = random.nextFloat();
                    ahn.m(new k(new b(VerusMode.aER.bgK.gW, VerusMode.aER.bgK.gX, VerusMode.aER.bgK.gY), ao.dwr.OY(), new co(Items.cQB), f4, 1.0f, f5));
                }
                if (this.GQ) {
                    this.GQ = false;
                }
                if (VerusMode.aER.bgK.a(a.dgw)) {
                    aii.strafe(0.179 * (double)(1 + VerusMode.aER.bgK.b(a.dgw).ajf()) + 0.46);
                } else {
                    aii.strafe(0.4645);
                }
                if (!bb.a(false, true, true, false, false)) {
                    // empty if block
                }
                if (!bb.a(false, true, false, false, false) & this.cJ) {
                    this.Rb = VerusMode.aER.bgK.aRg + 2;
                }
                if (!bb.a(false, true, false, false, false) & VerusMode.aER.bgK.aRg % 10 == 1) {
                    this.Rb = VerusMode.aER.bgK.aRg + 2;
                }
                if (VerusMode.aER.bgK.aO) {
                    VerusMode.aER.bgK.ue = 0.0;
                    if (VerusMode.aER.bgK.a(a.dgw)) {
                        aii.strafe(0.092 * (double)(1 + VerusMode.aER.bgK.b(a.dgw).ajf()) + 0.55);
                    } else {
                        aii.strafe(0.558);
                    }
                }
                aii.preventDiagonalSpeed();
            } else {
                this.GQ = true;
                if (VerusMode.aER.bgK.a(a.dgw)) {
                    aii.strafe(0.04 * (double)(1 + VerusMode.aER.bgK.b(a.dgw).ajf()) + 0.41);
                } else {
                    strafeEvent.setSpeed(0.41);
                }
            }
            aii.preventDiagonalSpeed();
        }
    };
    @EventLink
    public final Listener<MoveEvent> Rg = moveEvent -> {
        if (!aii.isMoving()) {
            return;
        }
        if (((Mode)this.Rd.wD()).getName().equals("LowHop")) {
            if (VerusMode.aER.bgK.aO) {
                moveEvent.setPosY(0.42f);
                aii.strafe((double)0.69f + aii.speedPotionAmp(0.1));
                VerusMode.aER.bgK.ue = 0.0;
            } else {
                aii.strafe((double)0.41f + aii.speedPotionAmp(0.055));
            }
            if (VerusMode.aER.bgK.css <= 20) {
                aii.strafe(1.0 + aii.speedPotionAmp(0.055));
            }
            VerusMode.aER.bgK.setSprinting(true);
            VerusMode.aER.bgK.bkD = true;
        }
    };
    @EventLink
    public final Listener<MoveInputEvent> Rh = moveInputEvent -> {
        moveInputEvent.setJump(false);
        moveInputEvent.setSneak(false);
        this.jp = moveInputEvent.getForward();
        this.jq = moveInputEvent.getStrafe();
    };
    @EventLink
    public final Listener<AttackEvent> Ri = attackEvent -> {
        this.cJ = true;
        this.Rc = 10;
    };
    @EventLink(cH=1)
    Listener<PreUpdateEvent> dq = preUpdateEvent -> {
        if (((Mode)this.Rd.wD()).getName().equals("Hop")) {
            bs.a(new Vector2f((float)Math.toDegrees(aii.g(this.jp, this.jq)), VerusMode.aER.bgK.pm), 2.0, cb.gJ);
        }
    };

    public VerusMode(String string, Speed speed) {
        super(string, speed);
    }

    @Override
    public void onEnable() {
        this.GQ = true;
        if (((Mode)this.Rd.wD()).getName().equals("yPort") && !bb.a(true, true, true, true, true) && !this.e(Scaffold.class).isEnabled()) {
            Random random = new Random();
            float f2 = random.nextFloat();
            float f3 = random.nextFloat();
            ahn.m(new k(new b(VerusMode.aER.bgK.gW, VerusMode.aER.bgK.gX, VerusMode.aER.bgK.gY), ao.dwr.OY(), new co(Items.cQB), f2, 1.0f, f3));
        }
        this.Ra = false;
        this.QZ = false;
        this.hV = 0;
    }

    @Override
    public void onDisable() {
        if (((Mode)this.Rd.wD()).getName().equals("yPort") && !bb.a(true, true, true, true, true) && !this.e(Scaffold.class).isEnabled()) {
            Random random = new Random();
            float f2 = random.nextFloat();
            float f3 = random.nextFloat();
            ahn.m(new k(new b(VerusMode.aER.bgK.gW, VerusMode.aER.bgK.gX, VerusMode.aER.bgK.gY), ao.dwr.OY(), new co(Items.cQB), f2, 1.0f, f3));
        }
    }
}

