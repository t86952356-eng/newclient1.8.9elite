/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.afl;
import hackclient.rise.ain;
import hackclient.rise.aix;
import hackclient.rise.akb;
import hackclient.rise.akg;
import hackclient.rise.bs;
import hackclient.rise.bu;
import hackclient.rise.cb;
import hackclient.rise.dk;
import hackclient.rise.dm;
import hackclient.rise.ei;
import hackclient.rise.ej;
import hackclient.rise.fi;
import hackclient.rise.ua;
import hackclient.rise.ur;
import java.util.List;
import net.minecraft.entity.c;
import net.minecraft.init.Items;
import net.minecraft.util.b;
import net.minecraft.util.bt;
import net.minecraft.util.da;
import rip.vantage.commons.util.time.a;

public class uq
extends akg<ua> {
    private ur aiL = ur.aiX;
    private b aiM = null;
    private b CG = null;
    private a aiN = new a();
    private a aiO = new a();
    private int CF = -1;
    private int aiP = -1;
    private boolean aiQ = false;
    private boolean aiR = false;
    private boolean aiS = false;
    private akb aiT = null;
    @dm(cH=2)
    public final dk<ej> aiU = ej2 -> {
        switch (this.aiL.ordinal()) {
            case 0: {
                if (uq.aER.bgK.aO || uq.aER.bgK.ue >= 0.0 || uq.aER.bgK.csf < 2.0f) {
                    return;
                }
                this.CF = ain.e(Items.cQB);
                if (this.CF == -1) {
                    return;
                }
                this.aiL = ur.aiY;
                this.aiN.aX();
                break;
            }
            case 1: {
                this.aiM = this.kO();
                if (this.aiM == null) {
                    return;
                }
                double d2 = uq.aER.bgK.gX - (double)this.aiM.wu();
                float f2 = uq.aER.bgK.csf;
                double d3 = 8.0;
                if (d2 < d3 && d2 > 3.0) {
                    this.aiL = ur.aiZ;
                    this.aiN.aX();
                    break;
                }
                if (!this.aiN.T(50L)) break;
                this.aiL = ur.aiX;
                break;
            }
            case 2: {
                this.d(bu.class);
                bu.setSlot(this.CF);
                bs.a(new akb(uq.aER.bgK.pl, 90.0f), 5.0, cb.gH);
                if (!(Math.abs(uq.aER.bgK.pm - 90.0f) < 15.0f) && !this.aiN.T(200L)) break;
                this.aiR = true;
                this.aiT = new akb(uq.aER.bgK.pl, 90.0f);
                this.aiL = ur.aja;
                this.aiN.aX();
                break;
            }
            case 3: {
                this.aiR = true;
                break;
            }
            case 4: {
                if (!uq.aER.bgK.aO && !this.aiN.T(3000L)) break;
                if (this.CG != null) {
                    this.aiP = ain.e(Items.cQA);
                    afl.b("S", new Object[0]);
                    if (this.aiP != -1) {
                        this.aiL = ur.ajc;
                        this.aiN.aX();
                        break;
                    }
                    this.kP();
                    break;
                }
                this.kP();
                break;
            }
            case 5: {
                if (this.CG == null) {
                    this.kP();
                    break;
                }
                double d4 = uq.aER.bgK.getDistance((double)this.CG.wt() + 0.5, (double)this.CG.wu() + 0.5, (double)this.CG.wx() + 0.5);
                if (d4 < 5.0) {
                    this.d(bu.class);
                    bu.setSlot(this.aiP);
                    uq.aER.bgK.cHV.cJE = this.aiP;
                    da da2 = new da((double)this.CG.wt() + 0.5, (double)this.CG.wu() + 0.5, (double)this.CG.wx() + 0.5);
                    this.aiT = aix.h(da2);
                    bs.a(this.aiT, 10.0, cb.gH);
                    this.aiS = true;
                    break;
                }
                this.kP();
            }
        }
    };
    @dm(cH=4)
    public final dk<ei> aiV = ei2 -> {
        if (this.aiL == ur.aja && this.aiR) {
            bs.a(this.aiT, 10.0, cb.gH);
            float f2 = uq.aER.bgK.pl;
            float f3 = uq.aER.bgK.pm;
            uq.aER.bgK.pl = this.aiT.x;
            uq.aER.bgK.pm = this.aiT.y;
            uq.aER.bgT.al(1.0f);
            this.d(bu.class);
            bu.setSlot(this.CF);
            uq.aER.bhl = 0;
            aER.AO();
            uq.aER.bgK.pm = f3;
            this.CG = new b(uq.aER.bgK.gW, uq.aER.bgK.gX - 1.0, uq.aER.bgK.gY);
            this.aiQ = true;
            this.aiO.aX();
            afl.b("MLG water placed at distance: " + (uq.aER.bgK.gX - (double)this.aiM.wu()), new Object[0]);
            this.aiL = ur.ajb;
            this.aiN.aX();
            this.aiR = false;
        } else if (this.aiL == ur.ajc && this.aiS) {
            float f4 = uq.aER.bgK.pl;
            float f5 = uq.aER.bgK.pm;
            uq.aER.bgT.al(1.0f);
            uq.aER.bhl = 0;
            afl.b("Picked up water MLG", new Object[0]);
            this.kP();
            this.aiS = false;
        }
    };
    @dm
    public final dk<fi> aiW = fi2 -> {
        if (this.aiL == ur.aja && this.aiR) {
            fi2.setCancelled(true);
            this.aiR = false;
        } else if (this.aiL == ur.ajc && this.aiS) {
            fi2.setCancelled(true);
            this.aiS = false;
        }
    };

    public uq(String string, ua ua2) {
        super(string, ua2);
    }

    private b kO() {
        double d2 = uq.aER.bgK.gW;
        double d3 = uq.aER.bgK.gX;
        double d4 = uq.aER.bgK.gY;
        double d5 = uq.aER.bgK.ud;
        double d6 = uq.aER.bgK.ue;
        double d7 = uq.aER.bgK.uf;
        net.minecraft.util.a a2 = uq.aER.bgK.Us();
        int n2 = 0;
        while (d3 > 0.0 && n2++ < 200) {
            float f2 = uq.aER.bgK.bkr.dzs;
            float f3 = uq.aER.bgK.bkr.cuW;
            float f4 = uq.aER.bgK.pl;
            float f5 = f2 * f2 + f3 * f3;
            if (f5 >= 1.0E-4f) {
                float f6 = bt.bK(f5);
                if (f6 < 1.0f) {
                    f6 = 1.0f;
                }
                f6 = 0.02f / f6;
                float f7 = f2 * f6;
                float f8 = f3 * f6;
                float f9 = bt.bx(f4 * (float)Math.PI / 180.0f);
                float f10 = bt.bB(f4 * (float)Math.PI / 180.0f);
                d5 += (double)(f7 * f10 - f8 * f9);
                d7 += (double)(f8 * f10 + f7 * f9);
            }
            d6 -= 0.08;
            double d8 = d5 *= (double)0.91f;
            double d9 = d6 *= (double)0.98f;
            double d10 = d7 *= (double)0.91f;
            net.minecraft.util.a a3 = a2.ac(d8, 0.0, 0.0);
            List<net.minecraft.util.a> list = uq.aER.bgF.a((c)uq.aER.bgK, a3);
            for (net.minecraft.util.a a4 : list) {
                d8 = a4.a(a2, d8);
            }
            a2 = a2.ae(d8, 0.0, 0.0);
            d2 += d8;
            double d11 = d9;
            net.minecraft.util.a a5 = a2.ac(0.0, d9, 0.0);
            List<net.minecraft.util.a> list2 = uq.aER.bgF.a((c)uq.aER.bgK, a5);
            for (net.minecraft.util.a a4 : list2) {
                d9 = a4.b(a2, d9);
            }
            a2 = a2.ae(0.0, d9, 0.0);
            d3 += d9;
            net.minecraft.util.a a6 = a2.ac(0.0, 0.0, d10);
            List<net.minecraft.util.a> object2 = uq.aER.bgF.a((c)uq.aER.bgK, a6);
            for (net.minecraft.util.a a7 : object2) {
                d10 = a7.c(a2, d10);
            }
            a2 = a2.ae(0.0, 0.0, d10);
            d4 += d10;
            if (d9 != d11 && d11 < 0.0) {
                return new b(d2, d3, d4);
            }
            if (Math.abs(d5) < 0.003) {
                d5 = 0.0;
            }
            if (Math.abs(d6) < 0.003) {
                d6 = 0.0;
            }
            if (Math.abs(d7) < 0.003) {
                d7 = 0.0;
            }
            d5 = d8;
            d6 = d9;
            d7 = d10;
        }
        return null;
    }

    private void kP() {
        this.aiL = ur.aiX;
        this.aiM = null;
        this.CG = null;
        this.CF = -1;
        this.aiP = -1;
        this.aiQ = false;
        this.aiN.aX();
        this.aiO.aX();
        this.aiR = false;
        this.aiS = false;
        this.aiT = null;
    }
}

