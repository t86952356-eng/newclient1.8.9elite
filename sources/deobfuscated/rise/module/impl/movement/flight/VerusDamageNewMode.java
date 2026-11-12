/*
 * Decompiled with CFR 0.152.
 */
package rise.module.impl.movement.flight;

import hackclient.rise.afl;
import hackclient.rise.aic;
import hackclient.rise.aid;
import hackclient.rise.aii;
import hackclient.rise.es;
import hackclient.rise.fd;
import net.minecraft.block.BlockAir;
import net.minecraft.util.a;
import rise.event.EventLink;
import rise.event.Listener;
import rise.event.impl.PreMotionEvent;
import rise.event.impl.StrafeEvent;
import rise.module.Mode;
import rise.module.impl.movement.Flight;
import rise.value.NumberValue;

public class VerusDamageNewMode
extends Mode<Flight> {
    private int It;
    private int hV;
    private boolean El;
    private final NumberValue Iu = new NumberValue("Speed", this, (Number)1, (Number)0.1, (Number)9.5, (Number)0.1);
    private double y;
    @EventLink
    public final Listener<fd> Iv = fd2 -> {};
    @EventLink
    public final Listener<PreMotionEvent> Iw = preMotionEvent -> {
        if (!this.El && VerusDamageNewMode.aER.bgK.aO) {
            VerusDamageNewMode.aER.bgK.jump();
        }
        if (!this.El) {
            return;
        }
        float f2 = 1.0f;
        this.y = Math.floor(VerusDamageNewMode.aER.bgK.gX);
        VerusDamageNewMode.aER.bgK.ue = 0.0 + (VerusDamageNewMode.aER.aIY.chq.Re() ? 1.0 : 0.0) - (VerusDamageNewMode.aER.aIY.chr.Re() ? 1.0 : 0.0);
        if (VerusDamageNewMode.aER.bgK.getDistance(VerusDamageNewMode.aER.bgK.bkg, VerusDamageNewMode.aER.bgK.bkh, VerusDamageNewMode.aER.bgK.bki) <= 8.5) {
            preMotionEvent.cF();
        } else {
            ++this.hV;
            if (this.hV >= 20) {
                this.El = false;
                afl.b("s", new Object[0]);
                aii.stop();
            }
        }
    };
    @EventLink
    public final Listener<StrafeEvent> Ix = strafeEvent -> {
        if (!this.El) {
            return;
        }
        float f2 = ((Number)this.Iu.wD()).floatValue();
        strafeEvent.setSpeed(f2);
    };
    @EventLink
    public final Listener<es> Iy = es2 -> {
        if (es2.df() instanceof BlockAir && !VerusDamageNewMode.aER.aIY.chr.Re() && (VerusDamageNewMode.aER.bgK.gX < this.y + 1.0 || VerusDamageNewMode.aER.aIY.chq.Re())) {
            double d2 = es2.dg().wt();
            double d3 = es2.dg().wu();
            double d4 = es2.dg().wx();
            if (d3 < VerusDamageNewMode.aER.bgK.gX) {
                es2.a(a.h(-15.0, -1.0, -15.0, 15.0, 1.0, 15.0).ae(d2, d3, d4));
            }
        }
    };

    public VerusDamageNewMode(String string, Flight flight) {
        super(string, flight);
    }

    @Override
    public void onEnable() {
        aic.a(aid.aOJ, 3.42f, 1, false, false);
        this.hV = 0;
        this.It = 2;
        this.El = true;
    }

    @Override
    public void onDisable() {
        aii.stop();
    }
}

