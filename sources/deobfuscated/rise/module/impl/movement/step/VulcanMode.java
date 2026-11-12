/*
 * Decompiled with CFR 0.152.
 */
package rise.module.impl.movement.step;

import hackclient.rise.ahn;
import hackclient.rise.fc;
import net.minecraft.network.play.client.f;
import rise.event.EventLink;
import rise.event.Listener;
import rise.event.impl.PreMotionEvent;
import rise.module.Mode;
import rise.module.impl.movement.Step;

public class VulcanMode
extends Mode<Step> {
    @EventLink
    public final Listener<PreMotionEvent> SC = preMotionEvent -> {
        VulcanMode.aER.bgK.cso = VulcanMode.aER.bgK.cvl > 11 ? 1.0f : 0.6f;
    };
    @EventLink
    public final Listener<fc> SD = fc2 -> {
        if (fc2.da() > 0.6) {
            VulcanMode.aER.bgC.dAp = 0.5f;
            ahn.m(new f(VulcanMode.aER.bgK.gW, VulcanMode.aER.bgK.gX + 0.5, VulcanMode.aER.bgK.gY, true));
        }
    };

    public VulcanMode(String string, Step step) {
        super(string, step);
    }

    @Override
    public void onDisable() {
        VulcanMode.aER.bgK.cso = 0.6f;
    }
}

