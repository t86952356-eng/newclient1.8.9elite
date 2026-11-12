/*
 * Decompiled with CFR 0.152.
 */
package rise.module.impl.movement.flight;

import hackclient.rise.ahn;
import hackclient.rise.aii;
import hackclient.rise.ain;
import hackclient.rise.bm;
import hackclient.rise.bs;
import hackclient.rise.bu;
import hackclient.rise.cb;
import net.minecraft.init.Items;
import net.minecraft.network.play.client.h;
import rise.event.EventLink;
import rise.event.Listener;
import rise.event.impl.PreMotionEvent;
import rise.event.impl.PreUpdateEvent;
import rise.event.impl.StrafeEvent;
import rise.module.Mode;
import rise.module.impl.movement.Flight;
import rise.util.math.Vector2f;

public class MMCFireballMode
extends Mode<Flight> {
    private int hQ;
    private int hV;
    @EventLink
    public final Listener<PreUpdateEvent> Ju = preUpdateEvent -> {
        int n2 = ain.e(Items.cRP);
        if (this.hQ > 10) {
            bm.a(30000, true, true, false, false, false);
        }
        if (MMCFireballMode.aER.bgK.crx == 1) {
            aii.stop();
        }
        if (n2 == -1) {
            return;
        }
        ++this.hQ;
        if (this.hQ == 4) {
            ahn.m(new h(MMCFireballMode.aER.bgK.gW, MMCFireballMode.aER.bgK.gX - 8.0, MMCFireballMode.aER.bgK.gY, MMCFireballMode.aER.bgK.pl, MMCFireballMode.aER.bgK.pm, false));
        }
        this.d(bu.class);
        bu.setSlot(n2);
        if (this.hQ == 2) {
            aER.AO();
        }
        if (this.hQ < 100) {
            bs.a(new Vector2f(MMCFireballMode.aER.bgK.pl, 90.0f), 10.0, cb.gG);
        }
    };
    @EventLink
    public final Listener<PreMotionEvent> Jv = preMotionEvent -> {
        float f2 = 0.42f;
        MMCFireballMode.aER.bgK.ue = 0.0f + (MMCFireballMode.aER.aIY.chq.Re() ? 0.42f : 0.0f) - (MMCFireballMode.aER.aIY.chr.Re() ? 0.42f : 0.0f);
        if (MMCFireballMode.aER.bgK.getDistance(MMCFireballMode.aER.bgK.bkg, MMCFireballMode.aER.bgK.bkh, MMCFireballMode.aER.bgK.bki) <= (double)8.58f) {
            if (this.hQ > 4) {
                preMotionEvent.cF();
            }
        } else {
            ++this.hV;
            if (this.hV >= 8) {
                aii.stop();
                ((Flight)this.wy()).toggle();
            }
        }
    };
    @EventLink
    public final Listener<StrafeEvent> Jw = strafeEvent -> {
        float f2 = 2.0f;
        if (this.hQ > 4) {
            strafeEvent.setSpeed(2.0);
        }
    };

    public MMCFireballMode(String string, Flight flight) {
        super(string, flight);
    }

    @Override
    public void onEnable() {
        this.hQ = 0;
        this.hV = 0;
    }

    @Override
    public void onDisable() {
        aii.stop();
    }
}

