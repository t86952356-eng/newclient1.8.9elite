/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.afl;
import hackclient.rise.ahj;
import hackclient.rise.aii;
import hackclient.rise.aik;
import hackclient.rise.akg;
import hackclient.rise.dk;
import hackclient.rise.dm;
import hackclient.rise.dz;
import hackclient.rise.ed;
import hackclient.rise.eh;
import hackclient.rise.ei;
import hackclient.rise.ej;
import hackclient.rise.eo;
import hackclient.rise.ez;
import hackclient.rise.fh;
import hackclient.rise.mh;
import java.lang.runtime.SwitchBootstraps;
import java.util.Objects;
import net.minecraft.block.Block;
import net.minecraft.block.BlockStairs;
import net.minecraft.client.d;
import net.minecraft.client.multiplayer.j;
import net.minecraft.entity.c;
import net.minecraft.init.Blocks;
import net.minecraft.network.aj;
import net.minecraft.util.a;
import net.minecraft.util.b;
import net.minecraft.util.bt;
import net.minecraft.util.da;

public class qp
extends akg<mh> {
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
    @dm
    public final dk<fh> Rt = fh2 -> {
        aj<?> aj2 = fh2.dq();
        Objects.requireNonNull(aj2);
        aj<?> aj3 = aj2;
        int n2 = 0;
        switch (SwitchBootstraps.typeSwitch("typeSwitch", new Object[]{}, aj3, n2)) {
            default: 
        }
    };
    @dm
    public final dk<dz> Ru = dz2 -> {
        if (hQ < 23 && hQ > 7) {
            dz2.setJump(false);
        }
    };
    @dm
    public final dk<ez> Rv = ez2 -> {
        if (hQ < 23 && hQ > 7) {
            ez2.setPosZ(0.0);
            ez2.setPosX(0.0);
        }
    };
    @dm
    public final dk<eo> Rw = eo2 -> {
        double d2;
        double d3;
        if (qp.aER.bgK.aO) {
            this.Rs = false;
        }
        a a2 = qp.aER.bgK.Us();
        j j2 = qp.aER.bgF;
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
        d2 = bt.aJ(Math.toDegrees(Math.atan2(qp.aER.bgK.uf, qp.aER.bgK.ud)) - 90.0);
        if (qp.aER.bgK.cus == 9 && hQ < 23) {
            hQ = 23;
        }
        if (hQ > 24 && !this.Rs && qp.aER.bgK.csW > 5) {
            if (qp.aER.bgK.tR == 0) {
                if (hQ > 48 || !qp.aER.bgK.a(net.minecraft.potion.a.dgw) && hQ > 66) {
                    aii.strafe(aii.getAllowedHorizontalDistance());
                } else {
                    aii.strafe(aii.getAllowedHorizontalDistance() - 0.01);
                }
                if (qp.aER.bgK.aO) {
                    qp.aER.bgK.jump();
                }
            }
            if (qp.aER.bgK.tR == 1) {
                if (qp.aER.bgK.a(net.minecraft.potion.a.dgw) && qp.aER.bgK.b((net.minecraft.potion.a)net.minecraft.potion.a.dgw).dhk + 1 >= 2) {
                    aii.strafe(0.48);
                } else if (qp.aER.bgK.a(net.minecraft.potion.a.dgw) && qp.aER.bgK.b((net.minecraft.potion.a)net.minecraft.potion.a.dgw).dhk + 1 >= 2) {
                    aii.strafe(0.4);
                } else if (qp.aER.bgK.a(net.minecraft.potion.a.dgw) && qp.aER.bgK.b((net.minecraft.potion.a)net.minecraft.potion.a.dgw).dhk + 1 == 1) {
                    aii.strafe(0.405);
                } else {
                    aii.strafe(0.33);
                }
                qp.aER.bgK.ue = 0.31;
            }
            if (qp.aER.bgK.tR == 2) {
                if (qp.aER.bgK.a(net.minecraft.potion.a.dgw)) {
                    qp.aER.bgK.ud *= 1.005;
                    qp.aER.bgK.uf *= 1.005;
                }
                qp.aER.bgK.ue -= 0.11;
            }
            if (qp.aER.bgK.tR == 3) {
                qp.aER.bgK.ue -= 0.22;
            }
            if (qp.aER.bgK.tR == 4) {
                if (qp.aER.bgK.a(net.minecraft.potion.a.dgw)) {
                    if (hQ > 66) {
                        qp.aER.bgK.ud *= 1.01;
                        qp.aER.bgK.uf *= 1.01;
                    }
                } else {
                    qp.aER.bgK.ud *= 1.005;
                    qp.aER.bgK.uf *= 1.005;
                }
            }
            if (qp.aER.bgK.tR == 5 && aik.ae(qp.aER.bgK.ue * 2.0)) {
                qp.aER.bgK.ue += 0.085;
                if (qp.aER.bgK.a(net.minecraft.potion.a.dgw)) {
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
            if (aik.p(0.0, qp.aER.bgK.ue, 0.0) != Blocks.cLc) {
                if (qp.aER.bgK.a(net.minecraft.potion.a.dgw)) {
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
            qp.aER.bgK.cso = 0.2f;
            if (qp.aER.bgK.tR == 1) {
                // empty if block
            }
            if (aii.speed() < 0.125) {
                aii.strafe(0.125);
            }
            if (ahj.n(d3, d2) > 40.0 && qp.aER.bgK.a(net.minecraft.potion.a.dgw)) {
                qp.aER.bgK.ud *= 0.74;
                qp.aER.bgK.uf *= 0.74;
            }
        }
        if (hQ < 8 || this.Rs || qp.aER.bgK.csW < 6) {
            if (qp.aER.bgK.aO) {
                qp.aER.bgK.jump();
            }
            if (qp.aER.bgK.aO && !qp.aER.bgK.a(net.minecraft.potion.a.dgw)) {
                aii.strafe(aii.getAllowedHorizontalDistance() - 0.01);
            } else if (qp.aER.bgK.aO) {
                aii.strafe(0.26);
            }
            if (aii.speed() < 0.125) {
                aii.strafe(0.125);
            }
            if (qp.aER.bgK.tR == 1) {
                aii.strafe();
                qp.aER.bgK.ue += (double)0.057f;
            }
            if (qp.aER.bgK.tR == 3) {
                qp.aER.bgK.ue -= (double)0.1309f;
            }
            if (qp.aER.bgK.tR == 4) {
                qp.aER.bgK.ue -= 0.2;
            }
            if (qp.aER.bgK.tR == 5) {
                // empty if block
            }
        }
        if (hQ == 24) {
            aii.strafe(0.125);
        }
    };
    @dm
    public final dk<ej> Rx = ej2 -> {
        if (hQ <= 44 || hQ < 47) {
            // empty if block
        }
    };
    @dm
    public final dk<ei> Ry = ei2 -> {
        boolean bl2 = false;
        a a2 = qp.aER.bgK.Us();
        j j2 = qp.aER.bgF;
        if (++hQ < 23) {
            if (qp.aER.bgK.aO && hQ > 3) {
                ei2.setPosY(ei2.getPosY() + (hQ % 2 != 0 ? 0.296875 : 0.001));
                ei2.setOnGround(false);
            }
        } else if (qp.aER.bgK.aO) {
            ei2.setPosY(ei2.getPosY() + 0.001);
        }
    };
    @dm
    public final dk<ed> Rz = ed2 -> {
        if (hQ < 23 || hQ < 8 || this.Rs || qp.aER.bgK.csW < 6) {
            ed2.setJumpMotion(0.42f);
        } else {
            ed2.setJumpMotion(0.4f);
        }
    };
    @dm
    public final dk<eh> RA = eh2 -> {
        double d2;
        double d3 = bt.aJ(Math.toDegrees(aii.direction()));
        if (ahj.n(d3, d2 = bt.aJ(Math.toDegrees(Math.atan2(qp.aER.bgK.uf, qp.aER.bgK.ud)) - 90.0)) > 90.0) {
            if (qp.aER.bgK.a(net.minecraft.potion.a.dgw)) {
                aii.a(aii.speed(), (float)d2 - 180.0f);
            } else {
                aii.a(aii.speed(), (float)d2 - 180.0f);
            }
        }
    };

    public qp(String string, mh mh2) {
        super(string, mh2);
    }

    @Override
    public void onEnable() {
        this.Mu = qp.aER.bgK.pl;
        this.Mv = qp.aER.bgK.pm;
        hQ = 0;
        qp.aER.bgK.pl = (float)this.Mu;
        if (qp.aER.bgK.aO) {
            qp.aER.bgK.jump();
        } else {
            afl.b("start on the ground", new Object[0]);
            ((mh)this.wy()).setEnabled(false);
        }
        this.Mr = qp.aER.bgK.gW;
        this.Ms = qp.aER.bgK.gX;
        this.Mt = qp.aER.bgK.gY;
        this.jy = qp.aER.bgK.gX;
        Ml = true;
        Mk = false;
    }

    @Override
    public void onDisable() {
        double d2 = qp.aER.bgK.gW - this.Mr;
        double d3 = qp.aER.bgK.gX - this.Ms;
        double d4 = qp.aER.bgK.gY - this.Mt;
        double d5 = Math.sqrt(d2 * d2 + d3 * d3 + d4 * d4);
        Mk = false;
        this.Mm = false;
        afl.b(qp.aER.bgK.ae, new Object[0]);
        afl.c("Distance traveled: " + d5, new Object[0]);
        if (qp.aER.bgK.aO) {
            aii.stop();
        }
        qp.aER.bgK.cso = 0.6f;
    }

    private boolean a(da da2, da da3) {
        j j2 = d.AZ().bgF;
        net.minecraft.client.entity.c c2 = d.AZ().bgK;
        a a2 = c2.Us().ae(da3.dAG, da3.dAH, da3.dAI);
        return !j2.a((c)c2, a2).isEmpty();
    }
}

