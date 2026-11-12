/*
 * Decompiled with CFR 0.152.
 */
package rise.module.impl.ghost;

import hackclient.rise.aei;
import hackclient.rise.ahj;
import hackclient.rise.akj;
import hackclient.rise.bs;
import hackclient.rise.ea;
import hackclient.rise.fr;
import net.minecraft.entity.r;
import net.minecraft.util.ce;
import net.minecraft.util.cf;
import rise.event.EventLink;
import rise.event.Listener;
import rise.event.impl.AttackEvent;
import rise.event.impl.PreMotionEvent;
import rise.module.Category;
import rise.module.Module;
import rise.module.ModuleInfo;
import rise.util.math.Vector2f;
import rise.value.BooleanValue;
import rise.value.NumberValue;

@ModuleInfo(aliases={"module.ghost.reach.name"}, description="module.ghost.reach.description", category=Category.GHOST)
public class Reach
extends Module {
    public final akj BQ = new akj("Range", this, (Number)3, (Number)4, (Number)3, (Number)6, (Number)0.01);
    private final NumberValue BR = new NumberValue("Buffer Decrease", this, (Number)1, (Number)0.1, (Number)10, (Number)0.1, () -> (Boolean)this.BT.wD() == false);
    private final NumberValue BS = new NumberValue("Max Buffer", this, (Number)5, (Number)1, (Number)200, (Number)1, () -> (Boolean)this.BT.wD() == false);
    private final BooleanValue BT = new BooleanValue("Buffer Abuse", (Module)this, (Boolean)false);
    private int BU;
    private int BV;
    private double BN;
    @EventLink
    public final Listener<PreMotionEvent> BW = preMotionEvent -> ++this.BV;
    @EventLink
    public final Listener<fr> BX = fr2 -> {
        double d2 = ahj.l(((Number)this.BQ.wD()).doubleValue(), this.BQ.wP().doubleValue());
        fr2.i(d2);
        if (this.gR()) {
            return;
        }
        ce ce2 = aei.a(bs.bH(), d2, fr2.dB(), Reach.aER.bgK, false);
        if (ce2 != null && ce2.dzu == cf.dzz) {
            fr2.a(ce2);
        }
    };
    @EventLink
    public final Listener<ea> BY = ea2 -> {
        Reach.aER.bhc = aei.c(bs.fk, 4.5);
    };
    @EventLink
    public final Listener<AttackEvent> BZ = attackEvent -> {
        r r2 = attackEvent.dc();
        if (((Boolean)this.BT.wD()).booleanValue()) {
            if (aei.c((Vector2f)bs.fk, (double)3.0).dzu != cf.dzz) {
                if ((this.BV > 9 || r2.getEntityId() != this.BU) && this.BN < (double)((Number)this.BS.wD()).intValue()) {
                    this.BN += 1.0;
                } else {
                    attackEvent.cF();
                }
            } else {
                this.BN = Math.max(0.0, this.BN - ((Number)this.BR.wD()).doubleValue());
            }
        } else {
            this.BN = 0.0;
        }
        this.BU = r2.getEntityId();
        this.BV = 0;
    };

    private boolean gR() {
        if (!Reach.aER.bhn || Reach.aER.bgR != null) {
            return false;
        }
        if (!Reach.aER.aIY.chu.Re() && !Reach.aER.aIY.chw.Re()) {
            return false;
        }
        ce ce2 = aei.a(new Vector2f(Reach.aER.bgK.pl, Reach.aER.bgK.pm), Reach.aER.bgu.Hr(), 0.0f, Reach.aER.bgK, false);
        return ce2 != null && ce2.dzu == cf.dzy;
    }
}

