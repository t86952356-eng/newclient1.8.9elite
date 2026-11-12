/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.aei;
import hackclient.rise.aix;
import hackclient.rise.akb;
import hackclient.rise.akg;
import hackclient.rise.aki;
import hackclient.rise.akp;
import hackclient.rise.akq;
import hackclient.rise.aks;
import hackclient.rise.bs;
import hackclient.rise.bu;
import hackclient.rise.bv;
import hackclient.rise.cb;
import hackclient.rise.dk;
import hackclient.rise.dm;
import hackclient.rise.ej;
import hackclient.rise.gi;
import hackclient.rise.gj;
import hackclient.rise.gl;
import hackclient.rise.gz;
import hackclient.rise.lc;
import hackclient.rise.lh;
import java.util.List;
import net.minecraft.entity.c;
import net.minecraft.entity.r;
import net.minecraft.item.cp;
import net.minecraft.util.a;
import net.minecraft.util.bt;
import net.minecraft.util.ce;
import net.minecraft.util.cf;

@gl(aliases={"module.ghost.aimassist.name"}, description="module.ghost.aimassist.description", category=gj.GHOST)
public final class kv
extends gi {
    private final akp Ak = new akp("Mode", this).a(new akg[]{new aks("Legit")}).a(new akg[]{new aks("Blatant")}).co("Legit");
    private final akq Al = new akq("Speed", this, (Number)2, (Number)1, (Number)180, (Number)1);
    private final aki Am = new aki("Silent", (gi)this, (Boolean)false);
    private final aki An = new aki("Require Swinging", (gi)this, (Boolean)true);
    private final aki Ao = new aki("Sticky", (gi)this, (Boolean)false);
    private final aki Ap = new aki("Require Mouse Movement", (gi)this, (Boolean)false);
    private final aki Aq = new aki("Limit Items", (gi)this, (Boolean)false);
    private final aki Ar = new aki("Aim Whilst on Target", (gi)this, (Boolean)false);
    private final akq As = new akq("FOV", this, (Number)90, (Number)0, (Number)360, (Number)1);
    private final aki At = new aki("Targets", (gi)this, (Boolean)false);
    public final aki Au = new aki("Player", (gi)this, (Boolean)true, () -> (Boolean)this.At.wD() == false);
    public final aki Av = new aki("Invisibles", (gi)this, (Boolean)false, () -> (Boolean)this.At.wD() == false);
    public final aki Aw = new aki("Animals", (gi)this, (Boolean)false, () -> (Boolean)this.At.wD() == false);
    public final aki Ax = new aki("Mobs", (gi)this, (Boolean)false, () -> (Boolean)this.At.wD() == false);
    public final aki Ay = new aki("Player Teammates", (gi)this, (Boolean)true, () -> (Boolean)this.At.wD() == false);
    r jE;
    @dm
    public final dk<ej> Az = ej2 -> {
        float f2;
        akb akb2;
        akb akb3;
        boolean bl2;
        block9: {
            block10: {
                double d2 = this.n(4.0);
                akb akb4 = new akb(kv.aER.bgK.pl, kv.aER.bgK.pm);
                if (this.d(akb4)) {
                    this.e(akb4);
                    return;
                }
                List<r> list = bv.a(d2, (boolean)((Boolean)this.Au.wD()), (boolean)((Boolean)this.Av.wD()), (boolean)((Boolean)this.Aw.wD()), (boolean)((Boolean)this.Ax.wD()), (Boolean)this.Ay.wD());
                if (list.isEmpty()) {
                    this.jE = null;
                    return;
                }
                this.jE = list.get(0);
                if (this.jE == null) {
                    return;
                }
                bl2 = this.gO();
                akb3 = this.gN();
                akb2 = this.b(this.jE, d2, bl2);
                f2 = Math.abs(bt.bN(aix.y(this.jE).getX() - akb4.getX()));
                if (!bl2 && !aix.a(akb2, this.jE, d2, false, this.gP() ? this.gr() : 0.0f)) {
                    return;
                }
                if (f2 > (float)((Number)this.As.wD()).intValue()) {
                    return;
                }
                if (!((Boolean)this.Aq.wD()).booleanValue()) break block9;
                this.d(bu.class);
                if (bu.bO() == null) break block10;
                this.d(bu.class);
                if (bu.bO().bP() instanceof cp) break block9;
            }
            return;
        }
        double d3 = this.i(f2);
        if (!this.s(bl2)) {
            return;
        }
        akb akb5 = this.a(akb3, akb2, bl2);
        bs.d(false);
        bs.a(akb5, d3 / 36.0, cb.gH, null, (Boolean)this.Am.wD(), (Boolean)this.Am.wD() == false);
    };

    private boolean d(akb akb2) {
        if (!kv.aER.bhn || kv.aER.bgR != null) {
            return false;
        }
        if (!kv.aER.aIY.chu.Re() && !kv.aER.aIY.chw.Re()) {
            return false;
        }
        ce ce2 = aei.a(akb2, kv.aER.bgu.Hr(), 0.0f, kv.aER.bgK, false);
        return ce2 != null && ce2.dzu == cf.dzy;
    }

    private void e(akb akb2) {
        this.jE = null;
        bs.d(false);
        bs.a(akb2, 10.0, cb.gH, null, true, false);
    }

    private boolean s(boolean bl2) {
        if (((Boolean)this.Ap.wD()).booleanValue() && kv.aER.bhe.dzp == 0 && kv.aER.bhe.dzq == 0) {
            return false;
        }
        if (((Boolean)this.An.wD()).booleanValue() && !kv.aER.bgK.cup) {
            return false;
        }
        if (!((Boolean)this.Ar.wD()).booleanValue()) {
            ce ce2 = aei.a(new akb(kv.aER.bgK.pl, kv.aER.bgK.pm), 3.0, 0.0f, kv.aER.bgK, false);
            return ce2 == null || ce2.dzu != cf.dzz;
        }
        return true;
    }

    private akb gN() {
        return (Boolean)this.Am.wD() != false ? bs.bH() : new akb(kv.aER.bgK.pl, kv.aER.bgK.pm);
    }

    private double i(float f2) {
        double d2 = ((Number)this.Al.wD()).doubleValue() * (double)((Boolean)this.Ao.wD() != false ? 10 : 1);
        double d3 = Math.min(1.0, (double)f2 / 45.0);
        return Math.max(0.05, d2 * (0.35 + d3 * 0.65));
    }

    private akb a(akb akb2, akb akb3, boolean bl2) {
        return new akb(akb3.getX(), this.gP() || bl2 ? akb3.getY() : akb2.getY());
    }

    private akb b(r r2, double d2, boolean bl2) {
        if (!this.gP() && !bl2) {
            return aix.y(r2);
        }
        a a2 = r2.Us();
        float f2 = this.gr();
        if (a2 == null || a2.aqW()) {
            return aix.y(r2);
        }
        if (f2 > 0.0f) {
            a2 = a2.ad(f2, f2, f2);
        }
        return aix.a((c)r2, a2, true, d2, bl2, f2);
    }

    private double n(double d2) {
        gz gz2 = this.e(gz.class);
        if (gz2 != null && gz2.isEnabled()) {
            return Math.max(d2, gz2.gq());
        }
        lh lh2 = this.e(lh.class);
        if (lh2 == null || !lh2.isEnabled()) {
            return d2;
        }
        return Math.max(d2, lh2.BQ.wP().doubleValue());
    }

    private float gr() {
        gz gz2 = this.e(gz.class);
        if (gz2 != null && gz2.isEnabled()) {
            return gz2.gr();
        }
        lc lc2 = this.e(lc.class);
        if (lc2 == null || !lc2.isEnabled()) {
            return 0.0f;
        }
        return ((Number)lc2.Bj.wD()).floatValue();
    }

    private boolean gO() {
        gz gz2 = this.e(gz.class);
        return gz2 != null && gz2.isEnabled();
    }

    private boolean gP() {
        return ((akg)this.Ak.wD()).getName().equals("Blatant");
    }
}

