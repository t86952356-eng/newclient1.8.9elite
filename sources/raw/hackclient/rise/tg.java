/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.aei;
import hackclient.rise.aii;
import hackclient.rise.ain;
import hackclient.rise.aix;
import hackclient.rise.akb;
import hackclient.rise.aki;
import hackclient.rise.akj;
import hackclient.rise.bb;
import hackclient.rise.bs;
import hackclient.rise.bu;
import hackclient.rise.cb;
import hackclient.rise.dk;
import hackclient.rise.dm;
import hackclient.rise.dz;
import hackclient.rise.eg;
import hackclient.rise.ei;
import hackclient.rise.ej;
import hackclient.rise.eo;
import hackclient.rise.fg;
import hackclient.rise.gi;
import hackclient.rise.gj;
import hackclient.rise.gl;
import hackclient.rise.th;
import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.item.af;
import net.minecraft.item.co;
import net.minecraft.util.a;
import net.minecraft.util.ao;
import net.minecraft.util.ap;
import net.minecraft.util.b;
import net.minecraft.util.bt;
import net.minecraft.util.ce;
import net.minecraft.util.cf;
import net.minecraft.util.da;
import net.minecraft.world.w;

@gl(aliases={"Auto Block-In", "Auto Enclose", "Block In", "Self Trap", "Surround", "Instant Bunker"}, description="Builds a block enclosure around you.", category=gj.PLAYER)
public final class tg
extends gi {
    private static final double abK = 4.5;
    private static final int[][] abL = new int[][]{{0, 1}, {-1, 0}, {0, -1}, {1, 0}};
    private static final double[] abM = new double[]{0.5, 0.2, 0.8};
    private final akj abN = new akj("Rotation Speed", this, (Number)5, (Number)10, (Number)0, (Number)10, (Number)1);
    private final aki abO = new aki("Disable When Airborne", (gi)this, (Boolean)false);
    private int abP;
    private int abQ;
    private int abR = -1;
    private int abS = -1;
    private th abT;
    @dm
    private final dk<fg> abU = fg2 -> this.setEnabled(false);
    @dm(cH=1)
    private final dk<ej> abV = ej2 -> {
        this.clear();
        if (tg.aER.bgK == null || tg.aER.bgF == null || tg.aER.bgK.csb || ((Boolean)this.abO.wD()).booleanValue() && !tg.aER.bgK.aO) {
            this.setEnabled(false);
            return;
        }
        if (!this.jF() || tg.aER.bgK.cHV.cJG || this.jE()) {
            return;
        }
        this.abS = this.jC();
        if (this.abS < 0) {
            this.setEnabled(false);
            return;
        }
        this.abT = this.jB();
        if (this.abT == null && this.jD() && tg.aER.bgK.aO && Math.hypot(tg.aER.bgK.ud, tg.aER.bgK.uf) < 0.03) {
            this.setEnabled(false);
            return;
        }
        this.abR = tg.aER.bgK.aRg;
        if (this.abT != null) {
            bu.setSlot(this.abS);
            double d2 = this.abN.wK().doubleValue();
            if (d2 != 0.0) {
                bs.a(this.abT.acd, d2, cb.gI);
            }
        }
    };
    @dm(cH=-1)
    private final dk<eg> abW = eg2 -> {
        if (!this.jG() || this.abT == null || bu.bQ() != this.abS || !this.j(bu.bO()) || bb.a(false, true, true, true, true) || this.abQ != Integer.MIN_VALUE && tg.aER.bgK.aRg - this.abQ < 2) {
            return;
        }
        ce ce2 = aei.c(bs.fn, 4.5);
        if (!this.a(ce2, this.abT.acb, this.abT.acc) || !this.k(this.abT.aca)) {
            return;
        }
        if (tg.aER.bgu.a(tg.aER.bgK, tg.aER.bgF, bu.bO(), ce2.dg(), ce2.dzv, ce2.daS)) {
            tg.aER.bgK.swingItem();
            this.abQ = tg.aER.bgK.aRg;
        }
    };
    @dm(cH=-1)
    private final dk<dz> abX = dz2 -> {
        if (!this.jG()) {
            return;
        }
        dz2.setForward(0.0f);
        dz2.setStrafe(0.0f);
        if (this.jD()) {
            return;
        }
        double d2 = Math.floor(tg.aER.bgK.gW) + 0.5 - tg.aER.bgK.gW;
        double d3 = Math.floor(tg.aER.bgK.gY) + 0.5 - tg.aER.bgK.gY;
        double d4 = Math.toDegrees(Math.atan2(d3, d2)) - 90.0;
        float f2 = bs.bd() && bs.fk != null ? bs.fk.x : tg.aER.bgK.pl;
        double d5 = Double.POSITIVE_INFINITY;
        for (int i2 = -1; i2 <= 1; ++i2) {
            for (int i3 = -1; i3 <= 1; ++i3) {
                double d6;
                double d7;
                if (i2 == 0 && i3 == 0 || !((d7 = Math.abs(bt.aJ((d6 = Math.toDegrees(aii.direction(f2, i2, i3))) - d4))) < d5)) continue;
                d5 = d7;
                dz2.setForward(i2);
                dz2.setStrafe(i3);
            }
        }
    };
    @dm(cH=-1)
    private final dk<eo> abY = eo2 -> {
        if (this.jG()) {
            tg.aER.bgK.setSprinting(false);
        }
    };
    @dm(cH=-1)
    private final dk<ei> abZ = ei2 -> {
        if (this.jG()) {
            tg.aER.bgK.setSprinting(false);
            ei2.setSprinting(false);
        }
    };

    @Override
    public void onEnable() {
        this.clear();
        this.abQ = Integer.MIN_VALUE;
        if (tg.aER.bgK == null || tg.aER.bgF == null) {
            this.setEnabled(false);
            return;
        }
        this.abP = Math.floorMod(Math.round(tg.aER.bgK.pl / 90.0f), 4);
    }

    @Override
    public void onDisable() {
        this.clear();
    }

    private th jB() {
        b b2 = new b(tg.aER.bgK);
        b b3 = b2.hq(2);
        if (this.j(b3)) {
            th th2 = this.i(b3);
            if (th2 != null) {
                return th2;
            }
            for (int i2 = 0; i2 < 4; ++i2) {
                int[] nArray = abL[(this.abP + i2) % 4];
                th2 = this.i(b3.C(nArray[0], 0, nArray[1]));
                if (th2 == null) continue;
                return th2;
            }
        }
        for (int i3 = 0; i3 < 4; ++i3) {
            int[] nArray = abL[(this.abP + i3) % 4];
            for (int i4 = -1; i4 <= 1; ++i4) {
                th th3 = this.i(b2.C(nArray[0], i4, nArray[1]));
                if (th3 == null) continue;
                return th3;
            }
        }
        return null;
    }

    private th i(b b2) {
        if (!this.k(b2)) {
            return null;
        }
        th th2 = null;
        double d2 = Double.POSITIVE_INFINITY;
        da da2 = tg.aER.bgK.aQ(1.0f);
        for (ao ao2 : ao.values()) {
            Block block;
            b b3 = b2.x(ao2.asC());
            if (!tg.aER.bgF.aJ(b3) || !(block = tg.aER.bgF.L(b3).df()).xf() || block instanceof BlockContainer || ain.aPX.contains(block)) continue;
            for (double d3 : abM) {
                for (double d4 : abM) {
                    double d5;
                    double d6;
                    double d7 = ao2.asL() == ap.dwH ? (double)(ao2 == ao.dwv ? 1 : 0) : (d6 = d3);
                    double d8 = ao2.asL() == ap.dwI ? (double)(ao2 == ao.dwr ? 1 : 0) : (d5 = ao2.asL() == ap.dwH ? d3 : d4);
                    double d9 = ao2.asL() == ap.dwJ ? (double)(ao2 == ao.dwt ? 1 : 0) : d4;
                    da da3 = new da((double)b3.wt() + d6, (double)b3.wu() + d5, (double)b3.wx() + d9);
                    double d10 = da2.x(da3);
                    if (d10 > 4.5) continue;
                    akb akb2 = aix.h(da3);
                    double d11 = d10 + (double)Math.abs(bt.bN(akb2.x - tg.aER.bgK.pl)) * 0.01;
                    if (!(d11 < d2) || !this.a(aei.c(akb2, 4.5), b3, ao2)) continue;
                    th2 = new th(b2, b3, ao2, akb2);
                    d2 = d11;
                }
            }
        }
        return th2;
    }

    private boolean a(ce ce2, b b2, ao ao2) {
        return ce2 != null && ce2.dzu == cf.dzy && b2.equals(ce2.dg()) && ce2.dzv == ao2;
    }

    private boolean j(b b2) {
        return tg.aER.bgF.aJ(b2) && tg.aER.bgF.L(b2).df().a((w)tg.aER.bgF, b2);
    }

    private boolean k(b b2) {
        return this.j(b2) && tg.aER.bgF.Sv().bm(b2) && tg.aER.bgF.s(new a(b2, b2.C(1, 1, 1)));
    }

    private boolean j(co co2) {
        if (co2 == null || co2.cWZ <= 0 || !(co2.bP() instanceof af)) {
            return false;
        }
        Block block = ((af)co2.bP()).df();
        return block.xf() && !ain.aPW.contains(block);
    }

    private int jC() {
        int n2 = tg.aER.bgK.cHV.cJE;
        for (int i2 = 0; i2 < 9; ++i2) {
            int n3 = (n2 + i2) % 9;
            if (!this.j(tg.aER.bgK.cHV.fi(n3))) continue;
            return n3;
        }
        return -1;
    }

    private boolean jD() {
        double d2 = tg.aER.bgK.gW - Math.floor(tg.aER.bgK.gW);
        double d3 = tg.aER.bgK.gY - Math.floor(tg.aER.bgK.gY);
        return d2 >= 0.31 && d2 <= 0.69 && d3 >= 0.31 && d3 <= 0.69;
    }

    private boolean jE() {
        return bs.bd() && bs.bK();
    }

    private boolean jF() {
        return tg.aER.bgK != null && tg.aER.bgF != null && !tg.aER.bgK.csb && tg.aER.bgR == null && !tg.aER.bgK.isUsingItem() && !tg.aER.bgu.Hz() && !tg.aER.bgu.HB() && tg.aER.bgK.cHY == tg.aER.bgK.cHX;
    }

    private boolean jG() {
        return tg.aER.bgK != null && this.abR == tg.aER.bgK.aRg && this.jF();
    }

    private void clear() {
        this.abR = -1;
        this.abS = -1;
        this.abT = null;
    }
}

