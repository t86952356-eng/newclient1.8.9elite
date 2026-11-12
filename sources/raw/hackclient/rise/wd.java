/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.a;
import hackclient.rise.aii;
import hackclient.rise.aik;
import hackclient.rise.ain;
import hackclient.rise.aix;
import hackclient.rise.akb;
import hackclient.rise.akd;
import hackclient.rise.akg;
import hackclient.rise.bs;
import hackclient.rise.bu;
import hackclient.rise.cb;
import hackclient.rise.dk;
import hackclient.rise.dm;
import hackclient.rise.dx;
import hackclient.rise.dz;
import hackclient.rise.ed;
import hackclient.rise.eh;
import hackclient.rise.ei;
import hackclient.rise.eo;
import hackclient.rise.fe;
import hackclient.rise.fi;
import hackclient.rise.jg;
import hackclient.rise.mh;
import hackclient.rise.tn;
import net.minecraft.block.Block;
import net.minecraft.block.BlockAir;
import net.minecraft.init.Blocks;
import net.minecraft.item.d;
import net.minecraft.network.aj;
import net.minecraft.network.play.client.k;
import net.minecraft.util.bt;

public class wd
extends akg<tn> {
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
    @dm
    public final dk<ed> ale = ed2 -> {};
    @dm(cH=1)
    public dk<ei> Fr = ei2 -> {
        float f2;
        boolean bl2;
        double d2 = wd.aER.bgK.pl;
        double d3 = Math.toRadians(d2);
        double d4 = -Math.sin(d3);
        double d5 = Math.cos(d3);
        double d6 = d5 * 1.0;
        boolean bl3 = bl2 = d6 < 0.0;
        if (wd.aER.bgK.aRg % 3 == 0 && wd.aER.bgK.aO && wd.aER.bgK.crx > 2) {
            return;
        }
        if (!wd.aER.aIY.chq.Re() && aii.isMoving()) {
            ala = wd.aER.bgK.pl;
            hV = 0;
            qH = 0;
        } else if (!wd.aER.aIY.chq.Re()) {
            hV = 100;
            return;
        }
        if (aii.isMoving()) {
            ++qH;
        } else if (qH > 20) {
            --qH;
        }
        if (wd.aER.aIY.chq.Re()) {
            ++hV;
        }
        if (qH >= 23) {
            qH = 1;
            ala = wd.aER.bgK.pl;
            hV = 99;
        }
        if (wd.aER.bgK.aO) {
            hV = 0;
            this.rW = 0;
            ala = wd.aER.bgK.pl;
        } else if (hV == 100) {
            aii.strafe(0.0);
        }
        if (!aii.isMoving()) {
            double d7 = wd.aER.bgK.pl;
            double d8 = Math.toRadians(d7);
            double d9 = -Math.sin(d8);
            double d10 = Math.cos(d8);
            boolean bl4 = d10 * 1.0 < 0.0;
            ((tn)this.wy()).aho = 1;
            if (!this.akZ) {
                if (!bl4) {
                    this.alb = Math.floor(wd.aER.bgK.gY) + 0.999999999999;
                    this.alc = Double.NaN;
                } else {
                    this.alc = Math.floor(wd.aER.bgK.gW) + 0.999999999999;
                    this.alb = Double.NaN;
                }
                this.akZ = true;
            }
            ++this.rW;
            if (Math.abs((double)this.ald - wd.aER.bgK.gX) >= 1.0) {
                if (this.rW == 1) {
                    aii.stop();
                    if (!this.kV()) {
                        double d11;
                        double d12;
                        double d13;
                        if (!Double.isNaN(this.alc)) {
                            double d14 = wd.aER.bgK.gW + (this.alc - wd.aER.bgK.gW) / 3.0;
                            double d15 = wd.aER.bgK.gX;
                            double d16 = wd.aER.bgK.gY;
                            if (this.e(d14, d15, d16)) {
                                wd.aER.bgK.setPosition(d14, d15, d16);
                            }
                        } else if (!Double.isNaN(this.alb) && this.e(d13 = wd.aER.bgK.gW, d12 = wd.aER.bgK.gX, d11 = wd.aER.bgK.gY + (this.alb - wd.aER.bgK.gY) / 3.0)) {
                            wd.aER.bgK.setPosition(d13, d12, d11);
                        }
                    }
                } else if (this.rW == 2) {
                    aii.stop();
                    if (!this.kV()) {
                        double d17;
                        double d18;
                        double d19;
                        if (!Double.isNaN(this.alc)) {
                            double d20 = wd.aER.bgK.gW + 2.0 * (this.alc - wd.aER.bgK.gW) / 3.0;
                            double d21 = wd.aER.bgK.gX;
                            double d22 = wd.aER.bgK.gY;
                            if (this.e(d20, d21, d22)) {
                                wd.aER.bgK.setPosition(d20, d21, d22);
                            }
                        } else if (!Double.isNaN(this.alb) && this.e(d19 = wd.aER.bgK.gW, d18 = wd.aER.bgK.gX, d17 = wd.aER.bgK.gY + 2.0 * (this.alb - wd.aER.bgK.gY) / 3.0)) {
                            wd.aER.bgK.setPosition(d19, d18, d17);
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
                            d24 = wd.aER.bgK.gX;
                            d23 = wd.aER.bgK.gY;
                            if (this.e(d25, d24, d23)) {
                                wd.aER.bgK.setPosition(d25, d24, d23);
                                this.kU();
                            }
                        } else if (!Double.isNaN(this.alb) && this.e(d25 = wd.aER.bgK.gW, d24 = wd.aER.bgK.gX, d23 = this.alb)) {
                            wd.aER.bgK.setPosition(d25, d24, d23);
                        }
                        d25 = wd.aER.bgK.gW;
                        d24 = wd.aER.bgK.gX;
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
            wd.aER.aIY.chq.ay(true);
        }
        if (wd.aER.bgK.Zz < 1) {
            this.akZ = false;
        }
        if (wd.aER.aIY.chq.Re()) {
            this.gD = true;
        }
        qH = 0;
        if (wd.aER.bgK.ue < 0.3 && this.HJ && wd.aER.bgK.ue > 0.17) {
            ((tn)this.wy()).toggle();
            if (wd.aER.bgK.aO) {
                wd.aER.bgK.jump();
            }
            this.HJ = false;
        }
        if (this.gD && !wd.aER.aIY.chq.Re()) {
            if (!(wd.aER.bgK.ue < 0.3 && this.HJ && wd.aER.bgK.ue > 0.17)) {
                // empty if block
            }
            this.gD = false;
        }
        if (wd.aER.aIY.chq.Rg() || !wd.aER.aIY.chq.Re()) {
            // empty if block
        }
        float f3 = f2 = hV == 1 ? 90.0f : 0.0f;
        if (bt.bN(wd.aER.bgK.pl - ala) < f2) {
            ala = wd.aER.bgK.pl;
        } else if (bt.bN(wd.aER.bgK.pl - ala) < 0.0f) {
            ala -= f2;
        } else if (bt.bN(wd.aER.bgK.pl - ala) > 0.0f) {
            ala += f2;
        }
        if (qH < 20 && !a.a.g().c(mh.class).isEnabled()) {
            if (wd.aER.bgK.a(net.minecraft.potion.a.dgw)) {
                // empty if block
            }
            if (wd.aER.aIY.chq.Re()) {
                if (wd.aER.bgK.a(net.minecraft.potion.a.dgw)) {
                    // empty if block
                }
                switch (hV) {
                    case 0: {
                        aii.strafe();
                        if (wd.aER.bgK.a(net.minecraft.potion.a.dgw) && wd.aER.bgK.b((net.minecraft.potion.a)net.minecraft.potion.a.dgw).dhk + 1 >= 2) {
                            wd.aER.bgK.uf *= 1.045;
                            wd.aER.bgK.ud *= 1.045;
                        } else if (wd.aER.bgK.a(net.minecraft.potion.a.dgw)) {
                            wd.aER.bgK.uf *= 1.035;
                            wd.aER.bgK.ud *= 1.035;
                        }
                        if (((akg)a.a.g().c(tn.class).agx.wD()).getName().equals("Off")) {
                            // empty if block
                        }
                        if (aii.speed() < 0.24) {
                            // empty if block
                        }
                        wd.aER.bgK.ue = 0.42;
                        break;
                    }
                    case 1: {
                        aii.strafe();
                        if (aii.speed() < 0.24) {
                            // empty if block
                        }
                        if (!wd.aER.bgK.a(net.minecraft.potion.a.dgw) || wd.aER.bgK.b((net.minecraft.potion.a)net.minecraft.potion.a.dgw).dhk + 1 >= 2) {
                            // empty if block
                        }
                        wd.aER.bgK.ue = 0.33;
                        if (wd.aER.bgK.a(net.minecraft.potion.a.dgw) && wd.aER.bgK.b((net.minecraft.potion.a)net.minecraft.potion.a.dgw).dhk + 1 >= 2) {
                            wd.aER.bgK.uf *= 1.015;
                            wd.aER.bgK.ud *= 1.015;
                        } else if (wd.aER.bgK.a(net.minecraft.potion.a.dgw)) {
                            wd.aER.bgK.uf *= 1.005;
                            wd.aER.bgK.ud *= 1.005;
                        }
                        if (!((akg)a.a.g().c(tn.class).agx.wD()).getName().equals("Off")) break;
                        break;
                    }
                    case 2: {
                        if (wd.aER.bgK.a(net.minecraft.potion.a.dgw)) {
                            // empty if block
                        }
                        if (((Boolean)this.e(jg.class).wu.wD()).booleanValue() && this.e(jg.class).isEnabled()) {
                            aii.strafe();
                        }
                        wd.aER.bgK.ue = 1.0 - wd.aER.bgK.gX % 1.0;
                    }
                }
            }
        } else if (!wd.aER.bgK.aO) {
            // empty if block
        }
        if (!(wd.aER.bgK.ue > 0.0) || !wd.aER.aIY.chq.Re()) {
            // empty if block
        }
        if (qH == 20 || qH == 21) {
            this.akX = ala;
        } else if (qH > 20) {
            // empty if block
        }
        if (qH == 22 && !a.a.g().c(mh.class).isEnabled()) {
            if (wd.aER.bgK.crx != 0 || !wd.aER.bgK.a(net.minecraft.potion.a.dgw)) {
                // empty if block
            }
            if (wd.aER.bgK.crx == 1) {
                // empty if block
            }
            wd.aER.bgK.ue = wd.aER.bgK.ue < 0.2 && wd.aER.bgK.ue > 0.1 ? (wd.aER.bgK.ue -= 0.42) : -0.0784000015258789;
            if (wd.aER.bgK.a(net.minecraft.potion.a.dgw)) {
                // empty if block
            }
        }
        if (wd.aER.bgK.Zz == 1) {
            // empty if block
        }
        if (hV == 2) {
            hV = -1;
        }
        ((tn)this.wy()).aho = 1;
    };
    @dm
    public final dk<eh> alf = eh2 -> {
        if (hV == 2) {
            // empty if block
        }
    };
    @dm
    public final dk<dz> alg = dz2 -> {
        if (aii.isMoving() && wd.aER.aIY.chq.Re() && !this.e(mh.class).isEnabled()) {
            dz2.setForward(dz2.getForward() * 5.0f);
        }
    };
    @dm
    public final dk<eo> alh = eo2 -> {
        if (wd.aER.aIY.chq.Re() && (wd.aER.aIY.chp.Re() || wd.aER.aIY.chn.Re())) {
            aii.strafe(0.25);
        }
        if (aii.speed() < 0.19 && wd.aER.aIY.chq.Re() && wd.aER.bgK.Zz > 9) {
            aii.strafe(0.19);
        }
        if (qH < 16 || wd.aER.bgK.a(net.minecraft.potion.a.dgw)) {
            // empty if block
        }
    };
    @dm
    public final dk<dx> ali = dx2 -> {
        if (dx2.cO() == ((tn)this.wy()).getKey() && !this.HJ && wd.aER.aIY.chq.Re() && !a.a.g().c(mh.class).isEnabled()) {
            dx2.cF();
            this.HJ = true;
        }
    };
    @dm
    public final dk<fe> alj = fe2 -> {};
    @dm
    public final dk<fi> alk = fi2 -> {
        k k2;
        double d2 = wd.aER.bgK.pl;
        double d3 = Math.toRadians(d2);
        double d4 = -Math.sin(d3);
        double d5 = Math.cos(d3);
        double d6 = d5 * 1.0;
        boolean bl2 = d6 < 0.0;
        aj<?> aj2 = fi2.dq();
        if (aj2 instanceof k && (k2 = (k)aj2).getPlacedBlockDirection() == 1 && (k2.ls() == null || k2.ls().bP() != d.I(Blocks.cMK))) {
            this.akU = true;
            ++this.akV;
            if (this.akV >= 2) {
                // empty if block
            }
        } else {
            k k3;
            aj2 = fi2.dq();
            if (aj2 instanceof k && ((k3 = (k)aj2).ls() == null || k3.ls().bP() != d.I(Blocks.cMK))) {
                this.akV = 0;
                this.akU = false;
            }
        }
        if (!this.akU || this.e(mh.class).isEnabled() || this.akV < 2 || hV == 1) {
            // empty if block
        }
    };
    @dm
    public final dk<ed> all = ed2 -> {
        if (!this.e(mh.class).isEnabled() && wd.aER.aIY.chq.Re() && !wd.aER.bgK.a(net.minecraft.potion.a.dgw)) {
            aii.strafe(0.15);
        }
        if (this.HJ) {
            aii.strafe(0.0);
        }
    };

    public wd(String string, tn tn2) {
        super(string, tn2);
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
        ala = wd.aER.bgK.pl;
        this.akZ = false;
        hV = wd.aER.bgK.aO ? 0 : 100;
        if (((akg)a.a.g().c(tn.class).agx.wD()).getName().equals("Off") && !wd.aER.bgK.aO) {
            this.akY = true;
        }
        this.gD = false;
    }

    @Override
    public void onDisable() {
        this.akZ = false;
        this.akY = false;
        this.HJ = false;
        ala = wd.aER.bgK.pl;
        hV = 100;
        this.rW = 0;
        if (wd.aER.aIY.chq.Re()) {
            aii.strafe(0.23);
        }
    }

    public void kU() {
        akd akd2;
        boolean bl2;
        this.ald = (int)Math.floor(wd.aER.bgK.gX);
        double d2 = wd.aER.bgK.pl;
        double d3 = Math.toRadians(d2);
        double d4 = -Math.sin(d3);
        double d5 = Math.cos(d3);
        double d6 = d5 * 1.0;
        boolean bl3 = bl2 = d6 < 0.0;
        if (bl2) {
            bs.d(false);
            bs.a(new akb((float)((double)(wd.aER.bgK.pl - 164.0f) + (Math.random() - 0.5) * 3.0), 86.0f), 10.0, cb.gG);
            akd2 = new akd(1.0, 0.0, 0.0);
        } else {
            akd2 = new akd(0.0, 0.0, 1.0);
        }
        ((tn)this.wy()).ahh = akd2;
        akb akb2 = aix.d(akd2);
        if (!aii.isMoving() && !bl2) {
            bs.d(false);
            float f2 = (float)(d2 + 164.0 + (Math.random() - 0.5) * 3.0);
            float f3 = 86.0f;
            bs.d(false);
            bs.a(new akb(f2, f3), 10.0, cb.gG);
        }
    }

    private boolean kV() {
        Block[] blockArray;
        int n2 = (int)Math.floor(wd.aER.bgK.gW);
        int n3 = (int)Math.floor(wd.aER.bgK.gX);
        int n4 = (int)Math.floor(wd.aER.bgK.gY);
        for (Block block : blockArray = new Block[]{aik.o(n2 + 1, n3, n4), aik.o(n2 - 1, n3, n4), aik.o(n2, n3, n4 + 1), aik.o(n2, n3, n4 - 1)}) {
            if (!(block instanceof BlockAir)) continue;
            return false;
        }
        return true;
    }

    private boolean e(double d2, double d3, double d4) {
        float f2 = wd.aER.bgK.width / 2.0f;
        double d5 = d2 - (double)f2;
        double d6 = d3;
        double d7 = d4 - (double)f2;
        double d8 = d2 + (double)f2;
        double d9 = d3 + (double)wd.aER.bgK.height;
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

