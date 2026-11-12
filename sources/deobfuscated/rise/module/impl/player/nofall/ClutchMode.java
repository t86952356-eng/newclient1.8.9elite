/*
 * Decompiled with CFR 0.152.
 */
package rise.module.impl.player.nofall;

import hackclient.rise.afl;
import hackclient.rise.ain;
import hackclient.rise.aix;
import hackclient.rise.bs;
import hackclient.rise.bu;
import hackclient.rise.cb;
import hackclient.rise.ur;
import java.util.List;
import net.minecraft.entity.c;
import net.minecraft.init.Items;
import net.minecraft.util.b;
import net.minecraft.util.bt;
import net.minecraft.util.da;
import rip.vantage.commons.util.time.a;
import rise.event.EventLink;
import rise.event.Listener;
import rise.event.impl.PacketSendEvent;
import rise.event.impl.PreMotionEvent;
import rise.event.impl.PreUpdateEvent;
import rise.module.Mode;
import rise.module.impl.player.NoFall;
import rise.util.math.Vector2f;

public class ClutchMode
extends Mode<NoFall> {
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
    private Vector2f aiT = null;
    @EventLink(cH=2)
    public final Listener<PreUpdateEvent> aiU = preUpdateEvent -> {
        switch (this.aiL.ordinal()) {
            case 0: {
                if (ClutchMode.aER.bgK.aO || ClutchMode.aER.bgK.ue >= 0.0 || ClutchMode.aER.bgK.csf < 2.0f) {
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
                double d2 = ClutchMode.aER.bgK.gX - (double)this.aiM.wu();
                float f2 = ClutchMode.aER.bgK.csf;
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
                bs.a(new Vector2f(ClutchMode.aER.bgK.pl, 90.0f), 5.0, cb.gH);
                if (!(Math.abs(ClutchMode.aER.bgK.pm - 90.0f) < 15.0f) && !this.aiN.T(200L)) break;
                this.aiR = true;
                this.aiT = new Vector2f(ClutchMode.aER.bgK.pl, 90.0f);
                this.aiL = ur.aja;
                this.aiN.aX();
                break;
            }
            case 3: {
                this.aiR = true;
                break;
            }
            case 4: {
                if (!ClutchMode.aER.bgK.aO && !this.aiN.T(3000L)) break;
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
                double d4 = ClutchMode.aER.bgK.getDistance((double)this.CG.wt() + 0.5, (double)this.CG.wu() + 0.5, (double)this.CG.wx() + 0.5);
                if (d4 < 5.0) {
                    this.d(bu.class);
                    bu.setSlot(this.aiP);
                    ClutchMode.aER.bgK.cHV.cJE = this.aiP;
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
    @EventLink(cH=4)
    public final Listener<PreMotionEvent> aiV = preMotionEvent -> {
        if (this.aiL == ur.aja && this.aiR) {
            bs.a(this.aiT, 10.0, cb.gH);
            float f2 = ClutchMode.aER.bgK.pl;
            float f3 = ClutchMode.aER.bgK.pm;
            ClutchMode.aER.bgK.pl = this.aiT.x;
            ClutchMode.aER.bgK.pm = this.aiT.y;
            ClutchMode.aER.bgT.al(1.0f);
            this.d(bu.class);
            bu.setSlot(this.CF);
            ClutchMode.aER.bhl = 0;
            aER.AO();
            ClutchMode.aER.bgK.pm = f3;
            this.CG = new b(ClutchMode.aER.bgK.gW, ClutchMode.aER.bgK.gX - 1.0, ClutchMode.aER.bgK.gY);
            this.aiQ = true;
            this.aiO.aX();
            afl.b("MLG water placed at distance: " + (ClutchMode.aER.bgK.gX - (double)this.aiM.wu()), new Object[0]);
            this.aiL = ur.ajb;
            this.aiN.aX();
            this.aiR = false;
        } else if (this.aiL == ur.ajc && this.aiS) {
            float f4 = ClutchMode.aER.bgK.pl;
            float f5 = ClutchMode.aER.bgK.pm;
            ClutchMode.aER.bgT.al(1.0f);
            ClutchMode.aER.bhl = 0;
            afl.b("Picked up water MLG", new Object[0]);
            this.kP();
            this.aiS = false;
        }
    };
    @EventLink
    public final Listener<PacketSendEvent> aiW = packetSendEvent -> {
        if (this.aiL == ur.aja && this.aiR) {
            packetSendEvent.setCancelled(true);
            this.aiR = false;
        } else if (this.aiL == ur.ajc && this.aiS) {
            packetSendEvent.setCancelled(true);
            this.aiS = false;
        }
    };

    public ClutchMode(String string, NoFall noFall) {
        super(string, noFall);
    }

    private b kO() {
        double d2 = ClutchMode.aER.bgK.gW;
        double d3 = ClutchMode.aER.bgK.gX;
        double d4 = ClutchMode.aER.bgK.gY;
        double d5 = ClutchMode.aER.bgK.ud;
        double d6 = ClutchMode.aER.bgK.ue;
        double d7 = ClutchMode.aER.bgK.uf;
        net.minecraft.util.a a2 = ClutchMode.aER.bgK.Us();
        int n2 = 0;
        while (d3 > 0.0 && n2++ < 200) {
            float f2 = ClutchMode.aER.bgK.bkr.dzs;
            float f3 = ClutchMode.aER.bgK.bkr.cuW;
            float f4 = ClutchMode.aER.bgK.pl;
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
            List<net.minecraft.util.a> list = ClutchMode.aER.bgF.a((c)ClutchMode.aER.bgK, a3);
            for (net.minecraft.util.a a4 : list) {
                d8 = a4.a(a2, d8);
            }
            a2 = a2.ae(d8, 0.0, 0.0);
            d2 += d8;
            double d11 = d9;
            net.minecraft.util.a a5 = a2.ac(0.0, d9, 0.0);
            List<net.minecraft.util.a> list2 = ClutchMode.aER.bgF.a((c)ClutchMode.aER.bgK, a5);
            for (net.minecraft.util.a a4 : list2) {
                d9 = a4.b(a2, d9);
            }
            a2 = a2.ae(0.0, d9, 0.0);
            d3 += d9;
            net.minecraft.util.a a6 = a2.ac(0.0, 0.0, d10);
            List<net.minecraft.util.a> object2 = ClutchMode.aER.bgF.a((c)ClutchMode.aER.bgK, a6);
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

