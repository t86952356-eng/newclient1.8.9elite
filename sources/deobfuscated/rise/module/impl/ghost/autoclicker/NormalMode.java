/*
 * Decompiled with CFR 0.152.
 */
package rise.module.impl.ghost.autoclicker;

import hackclient.rise.aik;
import hackclient.rise.akj;
import net.minecraft.util.cf;
import rip.vantage.commons.util.time.a;
import rise.event.EventLink;
import rise.event.Listener;
import rise.event.impl.AttackEvent;
import rise.event.impl.TickEvent;
import rise.module.Mode;
import rise.module.impl.ghost.AutoClicker;
import rise.value.BooleanValue;

public class NormalMode
extends Mode<AutoClicker> {
    private final akj Ck = new akj("CPS", this, (Number)8, (Number)14, (Number)1, (Number)20, (Number)0.1);
    private final BooleanValue Cl = new BooleanValue("Right Click", (Mode<?>)this, (Boolean)false);
    private final BooleanValue Cm = new BooleanValue("Left Click", (Mode<?>)this, (Boolean)true);
    private final BooleanValue Cn = new BooleanValue("Hit Select", (Mode<?>)this, (Boolean)false);
    private final BooleanValue Co = new BooleanValue("Break Blocks", (Mode<?>)this, (Boolean)true);
    private final BooleanValue Cp = new BooleanValue("ButterFly", (Mode<?>)this, (Boolean)true);
    private final a Cq = new a();
    private int Cr;
    private int BV;
    private long nT;
    @EventLink
    public final Listener<TickEvent> Cs = tickEvent -> {
        ++this.BV;
        if (this.Cq.T(this.nT) && (!((Boolean)this.Cn.wD()).booleanValue() || this.BV >= 10 || NormalMode.aER.bgK.cus > 0 && this.Cq.T(this.nT)) && NormalMode.aER.bgR == null) {
            long l2 = (long)((double)this.Ck.wK().longValue() * 1.5);
            this.Cr = NormalMode.aER.aIY.chw.Re() ? ++this.Cr : 0;
            this.nT = this.nT >= 100L && (Boolean)this.Cp.wD() != false ? (long)(Math.random() * 100.0) : 1000L / l2;
            if (((Boolean)this.Cl.wD()).booleanValue() && NormalMode.aER.aIY.chu.Re() && !NormalMode.aER.aIY.chw.Re()) {
                aik.h(1, true);
                if (Math.random() > 0.9) {
                    aik.h(1, true);
                }
            }
            if (!(!((Boolean)this.Cm.wD()).booleanValue() || this.Cr <= 1 || NormalMode.aER.aIY.chu.Re() || ((Boolean)this.Co.wD()).booleanValue() && NormalMode.aER.bhc != null && NormalMode.aER.bhc.dzu == cf.dzy)) {
                aik.h(0, true);
            } else if (!((Boolean)this.Co.wD()).booleanValue()) {
                NormalMode.aER.bgu.bDx = 0.0f;
            }
            this.Cq.aX();
        }
    };
    @EventLink
    public final Listener<AttackEvent> Ct = attackEvent -> {
        this.BV = 0;
    };

    public NormalMode(String string, AutoClicker autoClicker) {
        super(string, autoClicker);
    }
}

