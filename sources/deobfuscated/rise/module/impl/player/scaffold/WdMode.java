/*
 * Decompiled with CFR 0.152.
 */
package rise.module.impl.player.scaffold;

import hackclient.rise.aii;
import hackclient.rise.aik;
import hackclient.rise.ain;
import hackclient.rise.aix;
import hackclient.rise.akd;
import hackclient.rise.bs;
import hackclient.rise.bu;
import hackclient.rise.cb;
import hackclient.rise.eh;
import net.minecraft.block.Block;
import net.minecraft.block.BlockAir;
import net.minecraft.init.Blocks;
import net.minecraft.item.d;
import net.minecraft.network.aj;
import net.minecraft.network.play.client.k;
import net.minecraft.potion.a;
import net.minecraft.util.bt;
import rise.Client;
import rise.event.EventLink;
import rise.event.Listener;
import rise.event.impl.JumpEvent;
import rise.event.impl.KeyboardInputEvent;
import rise.event.impl.MoveInputEvent;
import rise.event.impl.PacketSendEvent;
import rise.event.impl.PreMotionEvent;
import rise.event.impl.StrafeEvent;
import rise.event.impl.TickEvent;
import rise.module.Mode;
import rise.module.impl.exploit.Disabler;
import rise.module.impl.movement.Speed;
import rise.module.impl.player.Scaffold;
import rise.util.math.Vector2f;

public class WdMode
extends Mode<Scaffold> {
    public static int qH;
    int dm;
    public static int hV;
    private boolean akU;
    private boolean HJ;
    private int akV = 0;
    private int akW = 0;
    float akX;
    boolean akY = true;
    boolean akZ = false;
    private int rW;
    public static float ala;
    double alb = Double.NaN;
    double alc = Double.NaN;
    private int ald;
    private boolean gD = false;
    @EventLink
    public final Listener<JumpEvent> ale = jumpEvent -> {};
    @EventLink(cH=1)
    public Listener<PreMotionEvent> Fr = preMotionEvent -> {
        float f2;
        boolean bl2;
        double d2 = WdMode.aER.bgK.pl;
        double d3 = Math.toRadians(d2);
        double d4 = -Math.sin(d3);
        double d5 = Math.cos(d3);
        double d6 = d5 * 1.0;
        boolean bl3 = bl2 = d6 < 0.0;
        if (WdMode.aER.bgK.aRg % 3 == 0 && WdMode.aER.bgK.aO && WdMode.aER.bgK.crx > 2) {
            return;
        }
        if (!WdMode.aER.aIY.chq.Re() && aii.isMoving()) {
            ala = WdMode.aER.bgK.pl;
            hV = 0;
            qH = 0;
        } else if (!WdMode.aER.aIY.chq.Re()) {
            hV = 100;
            return;
        }
        if (aii.isMoving()) {
            ++qH;
        } else if (qH > 20) {
            --qH;
        }
        if (WdMode.aER.aIY.chq.Re()) {
            ++hV;
        }
        if (qH >= 23) {
            qH = 1;
            ala = WdMode.aER.bgK.pl;
            hV = 99;
        }
        if (WdMode.aER.bgK.aO) {
            hV = 0;
            this.rW = 0;
            ala = WdMode.aER.bgK.pl;
        } else if (hV == 100) {
            aii.strafe(0.0);
        }
        if (!aii.isMoving()) {
            double d7 = WdMode.aER.bgK.pl;
            double d8 = Math.toRadians(d7);
            double d9 = -Math.sin(d8);
            double d10 = Math.cos(d8);
            boolean bl4 = d10 * 1.0 < 0.0;
            ((Scaffold)this.wy()).aho = 1;
            if (!this.akZ) {
                if (!bl4) {
                    this.alb = Math.floor(WdMode.aER.bgK.gY) + 0.999999999999;
                    this.alc = Double.NaN;
                } else {
                    this.alc = Math.floor(WdMode.aER.bgK.gW) + 0.999999999999;
                    this.alb = Double.NaN;
                }
                this.akZ = true;
            }
            ++this.rW;
            if (Math.abs((double)this.ald - WdMode.aER.bgK.gX) >= 1.0) {
                if (this.rW == 1) {
                    aii.stop();
                    if (!this.kV()) {
                        double d11;
                        double d12;
                        double d13;
                        if (!Double.isNaN(this.alc)) {
                            double d14 = WdMode.aER.bgK.gW + (this.alc - WdMode.aER.bgK.gW) / 3.0;
                            double d15 = WdMode.aER.bgK.gX;
                            double d16 = WdMode.aER.bgK.gY;
                            if (this.e(d14, d15, d16)) {
                                WdMode.aER.bgK.setPosition(d14, d15, d16);
                            }
                        } else if (!Double.isNaN(this.alb) && this.e(d13 = WdMode.aER.bgK.gW, d12 = WdMode.aER.bgK.gX, d11 = WdMode.aER.bgK.gY + (this.alb - WdMode.aER.bgK.gY) / 3.0)) {
                            WdMode.aER.bgK.setPosition(d13, d12, d11);
                        }
                    }
                } else if (this.rW == 2) {
                    aii.stop();
                    if (!this.kV()) {
                        double d17;
                        double d18;
                        double d19;
                        if (!Double.isNaN(this.alc)) {
                            double d20 = WdMode.aER.bgK.gW + 2.0 * (this.alc - WdMode.aER.bgK.gW) / 3.0;
                            double d21 = WdMode.aER.bgK.gX;
                            double d22 = WdMode.aER.bgK.gY;
                            if (this.e(d20, d21, d22)) {
                                WdMode.aER.bgK.setPosition(d20, d21, d22);
                            }
                        } else if (!Double.isNaN(this.alb) && this.e(d19 = WdMode.aER.bgK.gW, d18 = WdMode.aER.bgK.gX, d17 = WdMode.aER.bgK.gY + 2.0 * (this.alb - WdMode.aER.bgK.gY) / 3.0)) {
                            WdMode.aER.bgK.setPosition(d19, d18, d17);
                        }
                        this.kU();
                    } else {
                        this.kU();
                    }
                } else if (this.rW == 3) {
                    aii.stop();
                    if (!this.kV()) {
                        double d23;
                        double d24;
                        double d25;
                        if (!Double.isNaN(this.alc)) {
                            d25 = this.alc;
                            d24 = WdMode.aER.bgK.gX;
                            d23 = WdMode.aER.bgK.gY;
                            if (this.e(d25, d24, d23)) {
                                WdMode.aER.bgK.setPosition(d25, d24, d23);
                                this.kU();
                            }
                        } else if (!Double.isNaN(this.alb) && this.e(d25 = WdMode.aER.bgK.gW, d24 = WdMode.aER.bgK.gX, d23 = this.alb)) {
                            WdMode.aER.bgK.setPosition(d25, d24, d23);
                        }
                        d25 = WdMode.aER.bgK.gW;
                        d24 = WdMode.aER.bgK.gX;
                        d23 = this.alb;
                        if (this.e(d25, d24, d23)) {
                            // empty if block
                        }
                        this.kU();
                        this.rW = 0;
                        this.akZ = false;
                    } else {
                        this.kU();
                    }
                }
            } else {
                this.kU();
                this.rW = 0;
                this.akZ = false;
            }
        } else {
            this.akZ = false;
        }
        if (this.HJ && !aii.isMoving()) {
            WdMode.aER.aIY.chq.ay(true);
        }
        if (WdMode.aER.bgK.Zz < 1) {
            this.akZ = false;
        }
        if (WdMode.aER.aIY.chq.Re()) {
            this.gD = true;
        }
        qH = 0;
        if (WdMode.aER.bgK.ue < 0.3 && this.HJ && WdMode.aER.bgK.ue > 0.17) {
            ((Scaffold)this.wy()).toggle();
            if (WdMode.aER.bgK.aO) {
                WdMode.aER.bgK.jump();
            }
            this.HJ = false;
        }
        if (this.gD && !WdMode.aER.aIY.chq.Re()) {
            if (!(WdMode.aER.bgK.ue < 0.3 && this.HJ && WdMode.aER.bgK.ue > 0.17)) {
                // empty if block
            }
            this.gD = false;
        }
        if (WdMode.aER.aIY.chq.Rg() || !WdMode.aER.aIY.chq.Re()) {
            // empty if block
        }
        float f3 = f2 = hV == 1 ? 90.0f : 0.0f;
        if (bt.bN(WdMode.aER.bgK.pl - ala) < f2) {
            ala = WdMode.aER.bgK.pl;
        } else if (bt.bN(WdMode.aER.bgK.pl - ala) < 0.0f) {
            ala -= f2;
        } else if (bt.bN(WdMode.aER.bgK.pl - ala) > 0.0f) {
            ala += f2;
        }
        if (qH < 20 && !Client.a.g().c(Speed.class).isEnabled()) {
            if (WdMode.aER.bgK.a(a.dgw)) {
                // empty if block
            }
            if (WdMode.aER.aIY.chq.Re()) {
                if (WdMode.aER.bgK.a(a.dgw)) {
                    // empty if block
                }
                switch (hV) {
                    case 0: {
                        aii.strafe();
                        if (WdMode.aER.bgK.a(a.dgw) && WdMode.aER.bgK.b((a)a.dgw).dhk + 1 >= 2) {
                            WdMode.aER.bgK.uf *= 1.045;
                            WdMode.aER.bgK.ud *= 1.045;
                        } else if (WdMode.aER.bgK.a(a.dgw)) {
                            WdMode.aER.bgK.uf *= 1.035;
                            WdMode.aER.bgK.ud *= 1.035;
                        }
                        if (((Mode)Client.a.g().c(Scaffold.class).agx.wD()).getName().equals("Off")) {
                            // empty if block
                        }
                        if (aii.speed() < 0.24) {
                            // empty if block
                        }
                        WdMode.aER.bgK.ue = 0.42;
                        break;
                    }
                    case 1: {
                        aii.strafe();
                        if (aii.speed() < 0.24) {
                            // empty if block
                        }
                        if (!WdMode.aER.bgK.a(a.dgw) || WdMode.aER.bgK.b((a)a.dgw).dhk + 1 >= 2) {
                            // empty if block
                        }
                        WdMode.aER.bgK.ue = 0.33;
                        if (WdMode.aER.bgK.a(a.dgw) && WdMode.aER.bgK.b((a)a.dgw).dhk + 1 >= 2) {
                            WdMode.aER.bgK.uf *= 1.015;
                            WdMode.aER.bgK.ud *= 1.015;
                        } else if (WdMode.aER.bgK.a(a.dgw)) {
                            WdMode.aER.bgK.uf *= 1.005;
                            WdMode.aER.bgK.ud *= 1.005;
                        }
                        if (!((Mode)Client.a.g().c(Scaffold.class).agx.wD()).getName().equals("Off")) break;
                        break;
                    }
                    case 2: {
                        if (WdMode.aER.bgK.a(a.dgw)) {
                            // empty if block
                        }
                        if (((Boolean)this.e(Disabler.class).wu.wD()).booleanValue() && this.e(Disabler.class).isEnabled()) {
                            aii.strafe();
                        }
                        WdMode.aER.bgK.ue = 1.0 - WdMode.aER.bgK.gX % 1.0;
                    }
                }
            }
        } else if (!WdMode.aER.bgK.aO) {
            // empty if block
        }
        if (!(WdMode.aER.bgK.ue > 0.0) || !WdMode.aER.aIY.chq.Re()) {
            // empty if block
        }
        if (qH == 20 || qH == 21) {
            this.akX = ala;
        } else if (qH > 20) {
            // empty if block
        }
        if (qH == 22 && !Client.a.g().c(Speed.class).isEnabled()) {
            if (WdMode.aER.bgK.crx != 0 || !WdMode.aER.bgK.a(a.dgw)) {
                // empty if block
            }
            if (WdMode.aER.bgK.crx == 1) {
                // empty if block
            }
            WdMode.aER.bgK.ue = WdMode.aER.bgK.ue < 0.2 && WdMode.aER.bgK.ue > 0.1 ? (WdMode.aER.bgK.ue -= 0.42) : -0.0784000015258789;
            if (WdMode.aER.bgK.a(a.dgw)) {
                // empty if block
            }
        }
        if (WdMode.aER.bgK.Zz == 1) {
            // empty if block
        }
        if (hV == 2) {
            hV = -1;
        }
        ((Scaffold)this.wy()).aho = 1;
    };
    @EventLink
    public final Listener<eh> alf = eh2 -> {
        if (hV == 2) {
            // empty if block
        }
    };
    @EventLink
    public final Listener<MoveInputEvent> alg = moveInputEvent -> {
        if (aii.isMoving() && WdMode.aER.aIY.chq.Re() && !this.e(Speed.class).isEnabled()) {
            moveInputEvent.setForward(moveInputEvent.getForward() * 5.0f);
        }
    };
    @EventLink
    public final Listener<StrafeEvent> alh = strafeEvent -> {
        if (WdMode.aER.aIY.chq.Re() && (WdMode.aER.aIY.chp.Re() || WdMode.aER.aIY.chn.Re())) {
            aii.strafe(0.25);
        }
        if (aii.speed() < 0.19 && WdMode.aER.aIY.chq.Re() && WdMode.aER.bgK.Zz > 9) {
            aii.strafe(0.19);
        }
        if (qH < 16 || WdMode.aER.bgK.a(a.dgw)) {
            // empty if block
        }
    };
    @EventLink
    public final Listener<KeyboardInputEvent> ali = keyboardInputEvent -> {
        if (keyboardInputEvent.cO() == ((Scaffold)this.wy()).getKey() && !this.HJ && WdMode.aER.aIY.chq.Re() && !Client.a.g().c(Speed.class).isEnabled()) {
            keyboardInputEvent.cF();
            this.HJ = true;
        }
    };
    @EventLink
    public final Listener<TickEvent> alj = tickEvent -> {};
    @EventLink
    public final Listener<PacketSendEvent> alk = packetSendEvent -> {
        k k2;
        double d2 = WdMode.aER.bgK.pl;
        double d3 = Math.toRadians(d2);
        double d4 = -Math.sin(d3);
        double d5 = Math.cos(d3);
        double d6 = d5 * 1.0;
        boolean bl2 = d6 < 0.0;
        aj<?> aj2 = packetSendEvent.dq();
        if (aj2 instanceof k && (k2 = (k)aj2).getPlacedBlockDirection() == 1 && (k2.ls() == null || k2.ls().bP() != d.I(Blocks.cMK))) {
            this.akU = true;
            ++this.akV;
            if (this.akV >= 2) {
                // empty if block
            }
        } else {
            k k3;
            aj2 = packetSendEvent.dq();
            if (aj2 instanceof k && ((k3 = (k)aj2).ls() == null || k3.ls().bP() != d.I(Blocks.cMK))) {
                this.akV = 0;
                this.akU = false;
            }
        }
        if (!this.akU || this.e(Speed.class).isEnabled() || this.akV < 2 || hV == 1) {
            // empty if block
        }
    };
    @EventLink
    public final Listener<JumpEvent> all = jumpEvent -> {
        if (!this.e(Speed.class).isEnabled() && WdMode.aER.aIY.chq.Re() && !WdMode.aER.bgK.a(a.dgw)) {
            aii.strafe(0.15);
        }
        if (this.HJ) {
            aii.strafe(0.0);
        }
    };

    public WdMode(String string, Scaffold scaffold) {
        super(string, scaffold);
    }

    @Override
    public void onEnable() {
        this.akU = false;
        this.d(bu.class);
        bu.setSlot(ain.vM());
        this.akW = 0;
        this.HJ = false;
        this.alb = Double.NaN;
        qH = 0;
        this.rW = 0;
        ala = WdMode.aER.bgK.pl;
        this.akZ = false;
        hV = WdMode.aER.bgK.aO ? 0 : 100;
        if (((Mode)Client.a.g().c(Scaffold.class).agx.wD()).getName().equals("Off") && !WdMode.aER.bgK.aO) {
            this.akY = true;
        }
        this.gD = false;
    }

    @Override
    public void onDisable() {
        this.akZ = false;
        this.akY = false;
        this.HJ = false;
        ala = WdMode.aER.bgK.pl;
        hV = 100;
        this.rW = 0;
        if (WdMode.aER.aIY.chq.Re()) {
            aii.strafe(0.23);
        }
    }

    public void kU() {
        akd akd2;
        boolean bl2;
        this.ald = (int)Math.floor(WdMode.aER.bgK.gX);
        double d2 = WdMode.aER.bgK.pl;
        double d3 = Math.toRadians(d2);
        double d4 = -Math.sin(d3);
        double d5 = Math.cos(d3);
        double d6 = d5 * 1.0;
        boolean bl3 = bl2 = d6 < 0.0;
        if (bl2) {
            bs.d(false);
            bs.a(new Vector2f((float)((double)(WdMode.aER.bgK.pl - 164.0f) + (Math.random() - 0.5) * 3.0), 86.0f), 10.0, cb.gG);
            akd2 = new akd(1.0, 0.0, 0.0);
        } else {
            akd2 = new akd(0.0, 0.0, 1.0);
        }
        ((Scaffold)this.wy()).ahh = akd2;
        Vector2f vector2f = aix.d(akd2);
        if (!aii.isMoving() && !bl2) {
            bs.d(false);
            float f2 = (float)(d2 + 164.0 + (Math.random() - 0.5) * 3.0);
            float f3 = 86.0f;
            bs.d(false);
            bs.a(new Vector2f(f2, f3), 10.0, cb.gG);
        }
    }

    private boolean kV() {
        Block[] blockArray;
        int n2 = (int)Math.floor(WdMode.aER.bgK.gW);
        int n3 = (int)Math.floor(WdMode.aER.bgK.gX);
        int n4 = (int)Math.floor(WdMode.aER.bgK.gY);
        for (Block block : blockArray = new Block[]{aik.o(n2 + 1, n3, n4), aik.o(n2 - 1, n3, n4), aik.o(n2, n3, n4 + 1), aik.o(n2, n3, n4 - 1)}) {
            if (!(block instanceof BlockAir)) continue;
            return false;
        }
        return true;
    }

    private boolean e(double d2, double d3, double d4) {
        float f2 = WdMode.aER.bgK.width / 2.0f;
        double d5 = d2 - (double)f2;
        double d6 = d3;
        double d7 = d4 - (double)f2;
        double d8 = d2 + (double)f2;
        double d9 = d3 + (double)WdMode.aER.bgK.height;
        double d10 = d4 + (double)f2;
        for (int i2 = bt.aF(d5); i2 <= bt.aF(d8); ++i2) {
            for (int i3 = bt.aF(d6); i3 <= bt.aF(d9); ++i3) {
                for (int i4 = bt.aF(d7); i4 <= bt.aF(d10); ++i4) {
                    Block block = aik.o(i2, i3, i4);
                    if (block instanceof BlockAir) continue;
                    return false;
                }
            }
        }
        return true;
    }
}

