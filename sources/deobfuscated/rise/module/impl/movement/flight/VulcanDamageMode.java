/*
 * Decompiled with CFR 0.152.
 */
package rise.module.impl.movement.flight;

import hackclient.rise.afl;
import hackclient.rise.ahn;
import hackclient.rise.aic;
import hackclient.rise.aid;
import hackclient.rise.aii;
import net.minecraft.network.play.client.h;
import rise.event.EventLink;
import rise.event.Listener;
import rise.event.impl.PreMotionEvent;
import rise.event.impl.StrafeEvent;
import rise.module.Mode;
import rise.module.impl.movement.Flight;
import rise.value.BooleanValue;

public class VulcanDamageMode
extends Mode<Flight> {
    private int hQ;
    private int hV;
    private boolean IJ;
    public final BooleanValue IK = new BooleanValue("Self Damage (May Flag More) if not fly will wait for fall damage", (Mode<?>)this, (Boolean)true);
    @EventLink
    public final Listener<PreMotionEvent> IL = preMotionEvent -> {
        if (((Boolean)this.IK.wD()).booleanValue()) {
            aii.stop();
        }
        if (VulcanDamageMode.aER.bgK.ae == 1) {
            ahn.m(new h(VulcanDamageMode.aER.bgK.gW, VulcanDamageMode.aER.bgK.gX - 2.0, VulcanDamageMode.aER.bgK.gY, VulcanDamageMode.aER.bgK.pl, VulcanDamageMode.aER.bgK.pm, false));
            this.IJ = true;
        }
        float f2 = 3.0f;
        if (!this.IJ) {
            return;
        }
        ++this.hQ;
        if (this.hQ < 10) {
            aii.stop();
        }
        VulcanDamageMode.aER.bgK.ue = 1.0E-10 + (VulcanDamageMode.aER.aIY.chq.Re() ? 0.0 : 0.0) - (VulcanDamageMode.aER.aIY.chr.Re() ? 0.0 : 0.0);
        if (VulcanDamageMode.aER.bgK.getDistance(VulcanDamageMode.aER.bgK.bkg, VulcanDamageMode.aER.bgK.bkh, VulcanDamageMode.aER.bgK.bki) <= 9.0) {
            preMotionEvent.cF();
        } else {
            ++this.hV;
            if (this.hV >= 3) {
                aii.stop();
                ((Flight)this.wy()).toggle();
            }
        }
    };
    @EventLink
    public final Listener<StrafeEvent> IM = strafeEvent -> {
        if (this.hQ < 10) {
            return;
        }
        if (!this.IJ) {
            return;
        }
        float f2 = 1.0f;
        strafeEvent.setSpeed(1.0);
    };

    public VulcanDamageMode(String string, Flight flight) {
        super(string, flight);
    }

    @Override
    public void onEnable() {
        this.hQ = 0;
        this.hV = 0;
        this.IJ = false;
        if (((Boolean)this.IK.wD()).booleanValue()) {
            aic.a(aid.aOJ, 3.42f, 1, false, false);
        } else {
            afl.b("take fall damage or turn on self damage", new Object[0]);
        }
    }

    @Override
    public void onDisable() {
        aii.stop();
    }
}

