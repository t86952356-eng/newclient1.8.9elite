/*
 * Decompiled with CFR 0.152.
 */
package rise.module.impl.movement.step;

import hackclient.rise.ahn;
import hackclient.rise.aik;
import hackclient.rise.fc;
import net.minecraft.network.play.client.f;
import rise.event.EventLink;
import rise.event.Listener;
import rise.event.impl.PacketSendEvent;
import rise.event.impl.PreMotionEvent;
import rise.module.Mode;
import rise.module.impl.movement.Step;
import rise.value.NumberValue;

public class NewNCPMode
extends Mode<Step> {
    private final NumberValue Sr = new NumberValue("Height", this, (Number)1, (Number)1, (Number)1.5, (Number)0.1);
    private final NumberValue Ss = new NumberValue("Timer", this, (Number)0.5, (Number)0.1, (Number)1, (Number)0.1);
    private double St;
    @EventLink
    public final Listener<PreMotionEvent> Su = preMotionEvent -> {
        NewNCPMode.aER.bgK.cso = NewNCPMode.aER.bgK.aO && !aik.vy() ? ((Number)this.Sr.wD()).floatValue() : 0.6f;
    };
    @EventLink
    public final Listener<fc> Sv = fc2 -> {
        double d2;
        if (!NewNCPMode.aER.bgK.aO || aik.vy()) {
            return;
        }
        this.St = d2 = fc2.da();
        if (d2 <= (double)0.6f) {
            return;
        }
        double[] dArray = d2 > 1.015 ? new double[]{0.42f, 0.7532f, 1.0, 0.98f} : (d2 > 0.875 ? new double[]{0.42f, 0.7532f, 1.0} : new double[]{0.39f, 0.6938f});
        NewNCPMode.aER.bgC.dAp = ((Number)this.Ss.wD()).floatValue();
        for (double d3 : dArray) {
            ahn.n(new f(NewNCPMode.aER.bgK.gW, NewNCPMode.aER.bgK.gX + d3, NewNCPMode.aER.bgK.gY, false));
        }
    };
    @EventLink
    private final Listener<PacketSendEvent> Sw = packetSendEvent -> {
        double[] dArray = this.St > 1.015 ? new double[]{0.42f, 0.7532f, 1.0, 0.98f} : (this.St > 0.875 ? new double[]{0.42f, 0.7532f, 1.0} : new double[]{0.39f, 0.6938f});
        if (packetSendEvent.dq() instanceof f && aik.vv()) {
            for (double d2 : dArray) {
            }
        }
    };

    public NewNCPMode(String string, Step step) {
        super(string, step);
    }

    @Override
    public void onDisable() {
        NewNCPMode.aER.bgK.cso = 0.6f;
    }
}

