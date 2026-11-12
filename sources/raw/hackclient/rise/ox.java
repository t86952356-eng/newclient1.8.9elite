/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
package hackclient.rise;

import hackclient.rise.afl;
import hackclient.rise.ahn;
import hackclient.rise.aii;
import hackclient.rise.ait;
import hackclient.rise.akg;
import hackclient.rise.aki;
import hackclient.rise.akq;
import hackclient.rise.bm;
import hackclient.rise.cg;
import hackclient.rise.ci;
import hackclient.rise.cl;
import hackclient.rise.dk;
import hackclient.rise.dm;
import hackclient.rise.dz;
import hackclient.rise.ed;
import hackclient.rise.ei;
import hackclient.rise.ej;
import hackclient.rise.eo;
import hackclient.rise.ez;
import hackclient.rise.fh;
import hackclient.rise.ft;
import hackclient.rise.gg;
import hackclient.rise.lz;
import java.lang.runtime.SwitchBootstraps;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import net.minecraft.block.Block;
import net.minecraft.block.BlockSlab;
import net.minecraft.block.BlockSnow;
import net.minecraft.block.BlockStairs;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.multiplayer.j;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.init.Blocks;
import net.minecraft.network.aj;
import net.minecraft.network.play.client.e;
import net.minecraft.network.play.server.t;
import net.minecraft.util.a;
import net.minecraft.util.b;
import org.lwjgl.opengl.GL11;

public class ox
extends akg<lz> {
    public final aki Mg = new aki("Timer", (akg<?>)this, (Boolean)false);
    private final aki Mh = new aki("Fly Mode", (akg<?>)this, (Boolean)false);
    private final aki Mi = new aki("Allow Damage Move", (akg<?>)this, (Boolean)false);
    private final akq Mj = new akq("Delay Boost (go further with less height)", this, (Number)2, (Number)0, (Number)8, (Number)1);
    public static boolean Mk;
    public static boolean Ml;
    public static int hQ;
    double jy;
    boolean Mm;
    public static int Mn;
    public static int Mo;
    private final List<b> Mp = new ArrayList<b>();
    private boolean Mq = false;
    private double Mr;
    private double Ms;
    private double Mt;
    private double Mu;
    private double Mv;
    public static double Mw;
    @dm
    public final dk<fh> Mx = fh2 -> {
        aj<?> aj2 = fh2.dq();
        Objects.requireNonNull(aj2);
        aj<?> aj3 = aj2;
        int n2 = 0;
        switch (SwitchBootstraps.typeSwitch("typeSwitch", new Object[]{t.class}, aj3, n2)) {
            case 0: {
                t t2 = (t)aj3;
                if (fh2.isCancelled() || t2.getEntityID() != ox.aER.bgK.getEntityId()) break;
                double d2 = (double)t2.agN() / 8000.0;
                double d3 = (double)t2.agP() / 8000.0;
                Mw = Math.hypot(d2, d3);
                if (hQ > Mn && Mw > 0.0 && (double)t2.agO() / 8000.0 > 0.4) {
                    afl.c(aii.speed(), new Object[0]);
                    aii.strafe(0.459999);
                    ox.aER.bgK.ue = (double)t2.agO() / 8000.0;
                    ox.aER.bgK.ae = 0;
                    Ml = false;
                    Mk = true;
                    afl.c(aii.speed(), new Object[0]);
                } else {
                    Mk = false;
                    cg.a("Watchdog Longjump", "Bad knockback detected from the server... Cancelling and trying to save you from the void", 5000);
                }
                fh2.cF();
                break;
            }
        }
    };
    @dm
    public final dk<dz> My = dz2 -> {
        if (hQ < Mo && hQ > 7) {
            dz2.setForward(100.0f);
            dz2.setJump(false);
        }
    };
    @dm
    public final dk<ez> Mz = ez2 -> {
        if (!(hQ >= Mo || hQ <= 7 && ((Boolean)this.Mi.wD()).booleanValue())) {
            ez2.setPosZ(0.0);
            ez2.setPosX(0.0);
        }
    };
    @dm
    public final dk<eo> MA = eo2 -> {
        if ((ox.aER.bgK.gX > this.jy || ox.aER.bgK.tR < 14) && ((Boolean)this.Mh.wD()).booleanValue()) {
            cl.cn();
        }
        if (ox.aER.bgK.tR == 1) {
            // empty if block
        }
        aii.useDiagonalSpeed();
        if (hQ < 8) {
            if (ox.aER.bgK.aO) {
                aii.strafe();
            }
            if (ox.aER.bgK.tR == 1) {
                aii.strafe();
                ox.aER.bgK.ue += (double)0.057f;
            }
            if (ox.aER.bgK.tR == 3) {
                ox.aER.bgK.ue -= (double)0.1309f;
            }
            if (ox.aER.bgK.tR == 4) {
                ox.aER.bgK.ue -= 0.2;
            }
        }
    };
    @dm
    public final dk<ej> MB = ej2 -> {
        if (hQ <= 44 || hQ < 47) {
            // empty if block
        }
    };
    @dm
    public final dk<ei> MD = ei2 -> {
        int n2;
        double d2;
        boolean bl2 = false;
        a a2 = ox.aER.bgK.Us();
        j j2 = ox.aER.bgF;
        for (d2 = a2.dtH; d2 < a2.dtK; d2 += 0.3) {
            for (double d3 = a2.dtJ; d3 < a2.dtM; d3 += 0.3) {
                b b2 = new b(d2, a2.dtI - 0.05, d3);
                Block block = j2.L(b2).df();
                if (!(block instanceof BlockStairs) && !(block instanceof BlockSnow) && (!(block instanceof BlockSlab) || Math.abs(ox.aER.bgK.gX - (double)Math.round(ox.aER.bgK.gX)) > 0.03)) continue;
                bl2 = true;
                break;
            }
            if (bl2) break;
        }
        if (bl2) {
            this.Mm = true;
            Mn = 35;
            Mo = 34;
        } else if (ox.aER.bgK.aO) {
            Mn = 67;
            Mo = 66;
        }
        if (ox.aER.bgK.tR > 10 && !aii.isMoving()) {
            aii.stop();
        }
        if (hQ < 7) {
            this.Mu = ox.aER.bgK.pl;
            this.Mv = ox.aER.bgK.pm;
        } else if (hQ > 8 && hQ <= Mn + ((Number)this.Mj.wD()).intValue()) {
            ox.aER.bgK.pl = (float)this.Mu;
        }
        ei2.setPitch((float)this.Mv);
        ei2.setYaw((float)this.Mu);
        if (hQ == 0) {
            // empty if block
        }
        if (ox.aER.bgK.aO && (hQ > 67 && !this.Mm || hQ > 40 && this.Mm) || ox.aER.bgK.Zz == 1) {
            aii.stop();
            ((lz)this.wy()).setEnabled(false);
        }
        if (((Boolean)this.Mh.wD()).booleanValue()) {
            ox.aER.bgK.cIc = 0.1f;
        }
        if (++hQ < Mn + ((Number)this.Mj.wD()).intValue()) {
            bm.a(500, true, true, true, true);
        }
        if (hQ < Mn) {
            if (ox.aER.bgK.aO) {
                d2 = this.Mm ? 34.0 : 66.0;
                ci.a((float)((double)hQ / d2));
            }
            if (ox.aER.bgK.aO && hQ > 3) {
                if (!this.Mm) {
                    ei2.setPosY(ei2.getPosY() + (hQ % 2 != 0 ? 0.0625 : Math.random() / 5000.0));
                } else {
                    ei2.setPosY(ei2.getPosY() + (hQ % 2 != 0 ? (double)0.145f : Math.random() / 5000.0));
                }
                ei2.setOnGround(false);
            }
            if (hQ == Mo) {
                if (!ox.aER.bgK.a(net.minecraft.potion.a.dgw)) {
                    aii.strafe(aii.getAllowedHorizontalDistance() - 0.01);
                } else if (ox.aER.bgK.b((net.minecraft.potion.a)net.minecraft.potion.a.dgw).dhk + 1 >= 2) {
                    aii.strafe(aii.getAllowedHorizontalDistance() - 0.01);
                } else {
                    aii.strafe(aii.getAllowedHorizontalDistance() - 0.045);
                }
                ox.aER.bgK.jump();
            }
        } else if (hQ == Mn) {
            ei2.setPosY(ei2.getPosY() + 1.0E-13);
            ahn.m(new e(true));
            if (((Boolean)this.Mg.wD()).booleanValue()) {
                ox.aER.bgC.dAp = 0.5f;
            }
            Mk = true;
        }
        if (((n2 = ox.aER.bgK.ae) > 3 && n2 < 38 || n2 > 37 && ox.aER.bgK.ue <= 0.0) && hQ > 40) {
            ox.aER.bgK.ue += 0.0283;
        }
        switch (n2) {
            case 1: {
                ox.aER.bgK.ud *= 2.1;
                ox.aER.bgK.uf *= 2.1;
                break;
            }
            case 2: {
                break;
            }
            case 6: {
                ox.aER.bgK.ue = 0.031;
                break;
            }
            case 7: {
                ox.aER.bgK.ud *= 1.02;
                ox.aER.bgK.uf *= 1.02;
                ox.aER.bgK.ue = 0.01;
                break;
            }
            case 8: {
                ox.aER.bgK.ud *= 1.01;
                ox.aER.bgK.uf *= 1.01;
                ox.aER.bgK.ue = 0.0;
                break;
            }
            case 9: {
                ox.aER.bgK.ue += 0.015;
                break;
            }
            case 10: {
                ox.aER.bgK.ud *= 1.12;
                ox.aER.bgK.uf *= 1.12;
                ox.aER.bgK.ue += 0.015;
                break;
            }
            case 11: {
                ox.aER.bgK.ue = 0.0;
                ox.aER.bgK.ud *= 1.04;
                ox.aER.bgK.uf *= 1.04;
                break;
            }
            case 12: {
                ox.aER.bgK.ue = 0.0;
                ox.aER.bgK.ud *= 1.04;
                ox.aER.bgK.uf *= 1.04;
                break;
            }
            case 13: {
                ox.aER.bgK.ue += 0.01;
                break;
            }
            case 14: {
                ox.aER.bgK.ue += 0.015;
                break;
            }
            case 15: {
                ox.aER.bgK.ue += 0.01;
                break;
            }
            case 18: {
                ox.aER.bgK.ue += 0.032;
            }
        }
    };
    @dm
    public final dk<ed> ME = ed2 -> {
        if (hQ > 45) {
            ed2.setJumpMotion(0.42f);
        }
    };
    @dm
    public final dk<ft> MF = ft2 -> {
        if (!this.Mq) {
            this.hE();
        }
        Runnable runnable = () -> {
            for (b b2 : this.Mp) {
                a a2 = new a(b2, b2.C(1, 1, 1));
                if (!ait.f(a2)) continue;
                GlStateManager.JV();
                GlStateManager.Jw();
                GlStateManager.tQ();
                GlStateManager.JO();
                GlStateManager.JA();
                GL11.glDepthMask((boolean)false);
                ait.e(this.rP().rQ());
                ait.g(a2);
                GlStateManager.JN();
                GlStateManager.Jz();
                GlStateManager.tR();
                GL11.glDepthMask((boolean)true);
                GlStateManager.Jx();
                GlStateManager.JW();
                GlStateManager.JX();
            }
        };
        this.b(gg.kT).c(runnable);
    };

    public ox(String string, lz lz2) {
        super(string, lz2);
    }

    @Override
    public void onEnable() {
        this.Mu = ox.aER.bgK.pl;
        this.Mv = ox.aER.bgK.pm;
        ox.aER.bgK.pl = (float)this.Mu;
        if (ox.aER.bgK.aO) {
            ox.aER.bgK.jump();
        } else {
            afl.b("start on the ground", new Object[0]);
            ((lz)this.wy()).setEnabled(false);
        }
        this.Mr = ox.aER.bgK.gW;
        this.Ms = ox.aER.bgK.gX;
        this.Mt = ox.aER.bgK.gY;
        this.jy = ox.aER.bgK.gX;
        Ml = true;
        Mk = false;
        hQ = 0;
    }

    @Override
    public void onDisable() {
        double d2 = ox.aER.bgK.gW - this.Mr;
        double d3 = ox.aER.bgK.gX - this.Ms;
        double d4 = ox.aER.bgK.gY - this.Mt;
        double d5 = Math.sqrt(d2 * d2 + d3 * d3 + d4 * d4);
        Mk = false;
        this.Mm = false;
        afl.b(ox.aER.bgK.ae, new Object[0]);
        afl.c("Distance traveled: " + d5, new Object[0]);
        if (ox.aER.bgK.aO) {
            aii.stop();
        }
        this.Mp.clear();
        this.Mq = false;
    }

    private void hE() {
        this.Mp.clear();
        int n2 = 30;
        for (int i2 = -n2; i2 < n2; ++i2) {
            for (int i3 = -n2; i3 < n2; ++i3) {
                for (int i4 = -n2; i4 < n2; ++i4) {
                    b b2 = new b(ox.aER.bgK.gW + (double)i2, ox.aER.bgK.gX + (double)i3, ox.aER.bgK.gY + (double)i4);
                    IBlockState iBlockState = ox.aER.bgF.L(b2);
                    Block block = iBlockState.df();
                    if (block == Blocks.cLc) continue;
                    boolean bl2 = false;
                    if (block instanceof BlockSlab) {
                        boolean bl3 = bl2 = !iBlockState.zV().containsKey(BlockSlab.baO);
                    }
                    if (!(block instanceof BlockStairs) && !(block instanceof BlockSnow) && !bl2) continue;
                    this.Mp.add(b2);
                }
            }
        }
        this.Mq = true;
    }
}

