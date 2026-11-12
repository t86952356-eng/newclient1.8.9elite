/*
 * Decompiled with CFR 0.152.
 */
package rise.module.impl.movement.step;

import hackclient.rise.ahn;
import hackclient.rise.aik;
import hackclient.rise.fc;
import net.minecraft.block.BlockAir;
import net.minecraft.network.play.client.f;
import rise.event.EventLink;
import rise.event.Listener;
import rise.event.impl.PreMotionEvent;
import rise.module.Mode;
import rise.module.impl.movement.Step;
import rise.value.BooleanValue;
import rise.value.NumberValue;

public class NCPMode
extends Mode<Step> {
    private final NumberValue Sm = new NumberValue("Height", this, (Number)1, (Number)1, (Number)2.5, (Number)0.1);
    private final NumberValue Sn = new NumberValue("Timer", this, (Number)0.5, (Number)0.1, (Number)1, (Number)0.1);
    private final BooleanValue So = new BooleanValue("Reverse", (Mode<?>)this, (Boolean)false);
    @EventLink
    public final Listener<PreMotionEvent> Sp = preMotionEvent -> {
        NCPMode.aER.bgK.cso = NCPMode.aER.bgK.aO && !aik.vy() ? ((Number)this.Sm.wD()).floatValue() : 0.6f;
        if (!((Boolean)this.So.wD()).booleanValue() || aik.p(0.0, -(((Number)this.Sm.wD()).intValue() + 1), 0.0) instanceof BlockAir || aik.vy()) {
            return;
        }
        for (int i2 = 1; i2 < ((Number)this.Sm.wD()).intValue() + 1; ++i2) {
            NCPMode.aER.bgK.ue -= (double)i2;
        }
    };
    @EventLink
    public final Listener<fc> Sq = fc2 -> {
        if (!NCPMode.aER.bgK.aO || aik.vy()) {
            return;
        }
        double d2 = fc2.da();
        if (d2 <= 0.6) {
            return;
        }
        double[] dArray = d2 > 2.019 ? new double[]{0.425, 0.821, 0.699, 0.599, 1.022, 1.372, 1.652, 1.869, 2.019, 1.919} : (d2 > 1.869 ? new double[]{0.425, 0.821, 0.699, 0.599, 1.022, 1.372, 1.652, 1.869} : (d2 > 1.5 ? new double[]{0.425, 0.821, 0.699, 0.599, 1.022, 1.372, 1.652} : (d2 > 1.015 ? new double[]{0.42, 0.7532, 1.01, 1.093, 1.015} : (d2 > 0.875 ? new double[]{0.42, 0.7532} : new double[]{0.39, 0.6938}))));
        NCPMode.aER.bgC.dAp = ((Number)this.Sn.wD()).floatValue();
        for (double d3 : dArray) {
            ahn.m(new f(NCPMode.aER.bgK.gW, NCPMode.aER.bgK.gX + (d3 + Math.random() / 2000.0), NCPMode.aER.bgK.gY, false));
        }
    };

    public NCPMode(String string, Step step) {
        super(string, step);
    }

    @Override
    public void onDisable() {
        NCPMode.aER.bgK.cso = 0.6f;
    }
}

