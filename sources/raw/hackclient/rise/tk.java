/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.aei;
import hackclient.rise.ahj;
import hackclient.rise.ahn;
import hackclient.rise.aie;
import hackclient.rise.aik;
import hackclient.rise.ain;
import hackclient.rise.aix;
import hackclient.rise.akb;
import hackclient.rise.akd;
import hackclient.rise.akj;
import hackclient.rise.bb;
import hackclient.rise.bs;
import hackclient.rise.bu;
import hackclient.rise.cb;
import hackclient.rise.dk;
import hackclient.rise.dm;
import hackclient.rise.ej;
import hackclient.rise.gi;
import hackclient.rise.gj;
import hackclient.rise.gl;
import hackclient.rise.tn;
import net.minecraft.client.entity.c;
import net.minecraft.client.multiplayer.d;
import net.minecraft.client.multiplayer.j;
import net.minecraft.item.co;
import net.minecraft.network.play.client.k;
import net.minecraft.network.play.client.m;
import net.minecraft.util.b;
import net.minecraft.util.ce;
import net.minecraft.util.da;
import net.minecraft.util.db;
import net.minecraft.world.w;

@gl(aliases={"module.player.clutch.name"}, description="module.player.clutch.description", category=gj.PLAYER)
public class tk
extends gi {
    private final akj acY = new akj("Rotation Speed", this, (Number)5, (Number)10, (Number)0, (Number)10, (Number)1);
    private final akj acZ = new akj("Place Delay", this, (Number)0, (Number)0, (Number)0, (Number)1, (Number)1);
    private da YK;
    private aie ada;
    private b YL;
    private float adb;
    private float adc;
    private int add;
    private int ade;
    @dm
    public final dk<ej> adf = ej2 -> {
        if (tk.aER.bgK.Zz <= 15 || tk.aER.bgK.aRg <= 50 || bb.aW() || this.e(tn.class).isEnabled() || !tk.aER.aIY.chr.Re()) {
            return;
        }
        if (tk.aER.bgK.tR > 3 && !aik.ad(10.0)) {
            this.ade = 10;
        }
        if (this.ade-- < 0) {
            return;
        }
        this.d(bu.class);
        bu.setSlot(ain.vM());
        db db2 = new db(0, 0, 0);
        this.add = aik.p(db2.wt(), -1 + db2.wu(), db2.wx()).a((w)tk.aER.bgF, new b(tk.aER.bgK).aqY()) ? ++this.add : 0;
        this.YK = aik.q(db2.wt(), db2.wu(), db2.wx());
        if (this.YK == null) {
            return;
        }
        this.ada = aik.e(this.YK);
        if (this.ada == null) {
            return;
        }
        b b2 = new b(this.YK.dAG, this.YK.dAH, this.YK.dAI);
        this.YL = b2.ag(this.ada.vq().dAG, this.ada.vq().dAH, this.ada.vq().dAI);
        if (this.YL == null || this.ada == null) {
            return;
        }
        this.jU();
        if (this.YK == null || this.ada == null || this.YL == null) {
            return;
        }
        int n2 = tk.aER.bgK.cHV.cJF;
        this.d(bu.class);
        if (n2 == bu.bQ()) {
            if (!bb.a(false, true, false, false, true) && (double)this.add > ahj.l(((Number)this.acZ.wD()).intValue(), this.acZ.wP().intValue()) && aei.a(this.ada.vp(), this.YL, true)) {
                da da2 = aei.c((akb)bs.fk, (double)((double)tk.aER.bgu.Hr())).daS;
                d d2 = tk.aER.bgu;
                c c2 = tk.aER.bgK;
                j j2 = tk.aER.bgF;
                this.d(bu.class);
                if (d2.a(c2, j2, bu.bO(), this.YL, this.ada.vp(), da2)) {
                    ahn.m(new m());
                }
                tk.aER.bhl = 0;
                this.add = 0;
                if (!adg) {
                    this.d(bu.class);
                    if (bu.bO() == null) {
                        throw new AssertionError();
                    }
                }
                this.d(bu.class);
                if (bu.bO() != null) {
                    this.d(bu.class);
                    if (bu.bO().cWZ == 0) {
                        co[] coArray = tk.aER.bgK.cHV.cJC;
                        this.d(bu.class);
                        coArray[bu.bQ()] = null;
                    }
                }
            } else if (Math.random() > 0.92 && tk.aER.bhl <= 0) {
                this.d(bu.class);
                ahn.m(new k(bu.bO()));
                tk.aER.bhl = 0;
            }
        }
    };

    @Override
    public void onEnable() {
        this.adb = tk.aER.bgK.pl - 180.0f;
        this.adc = 90.0f;
        this.YK = null;
    }

    public void jU() {
        double d2;
        double d3;
        float f2;
        if (this.add > 0 && !aei.a(bs.fk, this.ada.vp(), this.YL, true)) {
            this.D(0);
        }
        if ((f2 = (float)ahj.l(d3 = ((Number)this.acY.wD()).doubleValue(), d2 = this.acY.wP().doubleValue())) != 0.0f) {
            bs.a(new akb(this.adb, this.adc), f2, cb.gH);
        }
    }

    public void D(int n2) {
        c c2 = tk.aER.bgK;
        double d2 = c2.gX + (double)c2.getEyeHeight() - this.YK.dAH - 0.1 - Math.random() * 0.8;
        for (int i2 = -180 + n2; i2 <= 180; i2 += 45) {
            c2.setPosition(c2.gW, c2.gX - d2, c2.gY);
            ce ce2 = aei.c(new akb(c2.pl + (float)i2, 0.0f), 4.5);
            c2.setPosition(c2.gW, c2.gX + d2, c2.gY);
            if (ce2 == null || !new b(this.YL).equals(ce2.dg()) || this.ada.vp() != ce2.dzv) continue;
            akb akb2 = aix.h(ce2.daS);
            this.adb = akb2.x;
            this.adc = akb2.y;
            return;
        }
        akb akb3 = aix.a(new akd(this.YL.wt(), this.YL.wu(), this.YL.wx()), this.ada.vp());
        this.adb = akb3.x;
        this.adc = akb3.y;
    }
}

