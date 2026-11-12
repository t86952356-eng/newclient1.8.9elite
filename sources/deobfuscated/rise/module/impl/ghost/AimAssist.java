/*
 * Decompiled with CFR 0.152.
 */
package rise.module.impl.ghost;

import hackclient.rise.aei;
import hackclient.rise.aix;
import hackclient.rise.aks;
import hackclient.rise.bs;
import hackclient.rise.bu;
import hackclient.rise.bv;
import hackclient.rise.cb;
import java.util.List;
import net.minecraft.entity.c;
import net.minecraft.entity.r;
import net.minecraft.item.cp;
import net.minecraft.util.a;
import net.minecraft.util.bt;
import net.minecraft.util.ce;
import net.minecraft.util.cf;
import rise.event.EventLink;
import rise.event.Listener;
import rise.event.impl.PreUpdateEvent;
import rise.module.Category;
import rise.module.Mode;
import rise.module.Module;
import rise.module.ModuleInfo;
import rise.module.impl.combat.Peircing;
import rise.module.impl.ghost.Hitbox;
import rise.module.impl.ghost.Reach;
import rise.util.math.Vector2f;
import rise.value.BooleanValue;
import rise.value.ModeValue;
import rise.value.NumberValue;

@ModuleInfo(aliases={"module.ghost.aimassist.name"}, description="module.ghost.aimassist.description", category=Category.GHOST)
public final class AimAssist
extends Module {
    private final ModeValue Ak = new ModeValue("Mode", this).a(new Mode[]{new aks("Legit")}).a(new Mode[]{new aks("Blatant")}).co("Legit");
    private final NumberValue Al = new NumberValue("Speed", this, (Number)2, (Number)1, (Number)180, (Number)1);
    private final BooleanValue Am = new BooleanValue("Silent", (Module)this, (Boolean)false);
    private final BooleanValue An = new BooleanValue("Require Swinging", (Module)this, (Boolean)true);
    private final BooleanValue Ao = new BooleanValue("Sticky", (Module)this, (Boolean)false);
    private final BooleanValue Ap = new BooleanValue("Require Mouse Movement", (Module)this, (Boolean)false);
    private final BooleanValue Aq = new BooleanValue("Limit Items", (Module)this, (Boolean)false);
    private final BooleanValue Ar = new BooleanValue("Aim Whilst on Target", (Module)this, (Boolean)false);
    private final NumberValue As = new NumberValue("FOV", this, (Number)90, (Number)0, (Number)360, (Number)1);
    private final BooleanValue At = new BooleanValue("Targets", (Module)this, (Boolean)false);
    public final BooleanValue Au = new BooleanValue("Player", (Module)this, (Boolean)true, () -> (Boolean)this.At.wD() == false);
    public final BooleanValue Av = new BooleanValue("Invisibles", (Module)this, (Boolean)false, () -> (Boolean)this.At.wD() == false);
    public final BooleanValue Aw = new BooleanValue("Animals", (Module)this, (Boolean)false, () -> (Boolean)this.At.wD() == false);
    public final BooleanValue Ax = new BooleanValue("Mobs", (Module)this, (Boolean)false, () -> (Boolean)this.At.wD() == false);
    public final BooleanValue Ay = new BooleanValue("Player Teammates", (Module)this, (Boolean)true, () -> (Boolean)this.At.wD() == false);
    r jE;
    @EventLink
    public final Listener<PreUpdateEvent> Az = preUpdateEvent -> {
        float f2;
        Vector2f vector2f;
        Vector2f vector2f2;
        boolean bl2;
        block9: {
            block10: {
                double d2 = this.n(4.0);
                Vector2f vector2f3 = new Vector2f(AimAssist.aER.bgK.pl, AimAssist.aER.bgK.pm);
                if (this.d(vector2f3)) {
                    this.e(vector2f3);
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
                vector2f2 = this.gN();
                vector2f = this.b(this.jE, d2, bl2);
                f2 = Math.abs(bt.bN(aix.y(this.jE).getX() - vector2f3.getX()));
                if (!bl2 && !aix.a(vector2f, this.jE, d2, false, this.gP() ? this.gr() : 0.0f)) {
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
        Vector2f vector2f4 = this.a(vector2f2, vector2f, bl2);
        bs.d(false);
        bs.a(vector2f4, d3 / 36.0, cb.gH, null, (Boolean)this.Am.wD(), (Boolean)this.Am.wD() == false);
    };

    private boolean d(Vector2f vector2f) {
        if (!AimAssist.aER.bhn || AimAssist.aER.bgR != null) {
            return false;
        }
        if (!AimAssist.aER.aIY.chu.Re() && !AimAssist.aER.aIY.chw.Re()) {
            return false;
        }
        ce ce2 = aei.a(vector2f, AimAssist.aER.bgu.Hr(), 0.0f, AimAssist.aER.bgK, false);
        return ce2 != null && ce2.dzu == cf.dzy;
    }

    private void e(Vector2f vector2f) {
        this.jE = null;
        bs.d(false);
        bs.a(vector2f, 10.0, cb.gH, null, true, false);
    }

    private boolean s(boolean bl2) {
        if (((Boolean)this.Ap.wD()).booleanValue() && AimAssist.aER.bhe.dzp == 0 && AimAssist.aER.bhe.dzq == 0) {
            return false;
        }
        if (((Boolean)this.An.wD()).booleanValue() && !AimAssist.aER.bgK.cup) {
            return false;
        }
        if (!((Boolean)this.Ar.wD()).booleanValue()) {
            ce ce2 = aei.a(new Vector2f(AimAssist.aER.bgK.pl, AimAssist.aER.bgK.pm), 3.0, 0.0f, AimAssist.aER.bgK, false);
            return ce2 == null || ce2.dzu != cf.dzz;
        }
        return true;
    }

    private Vector2f gN() {
        return (Boolean)this.Am.wD() != false ? bs.bH() : new Vector2f(AimAssist.aER.bgK.pl, AimAssist.aER.bgK.pm);
    }

    private double i(float f2) {
        double d2 = ((Number)this.Al.wD()).doubleValue() * (double)((Boolean)this.Ao.wD() != false ? 10 : 1);
        double d3 = Math.min(1.0, (double)f2 / 45.0);
        return Math.max(0.05, d2 * (0.35 + d3 * 0.65));
    }

    private Vector2f a(Vector2f vector2f, Vector2f vector2f2, boolean bl2) {
        return new Vector2f(vector2f2.getX(), this.gP() || bl2 ? vector2f2.getY() : vector2f.getY());
    }

    private Vector2f b(r r2, double d2, boolean bl2) {
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
        Peircing peircing = this.e(Peircing.class);
        if (peircing != null && peircing.isEnabled()) {
            return Math.max(d2, peircing.gq());
        }
        Reach reach = this.e(Reach.class);
        if (reach == null || !reach.isEnabled()) {
            return d2;
        }
        return Math.max(d2, reach.BQ.wP().doubleValue());
    }

    private float gr() {
        Peircing peircing = this.e(Peircing.class);
        if (peircing != null && peircing.isEnabled()) {
            return peircing.gr();
        }
        Hitbox hitbox = this.e(Hitbox.class);
        if (hitbox == null || !hitbox.isEnabled()) {
            return 0.0f;
        }
        return ((Number)hitbox.Bj.wD()).floatValue();
    }

    private boolean gO() {
        Peircing peircing = this.e(Peircing.class);
        return peircing != null && peircing.isEnabled();
    }

    private boolean gP() {
        return ((Mode)this.Ak.wD()).getName().equals("Blatant");
    }
}

