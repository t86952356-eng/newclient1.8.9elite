/*
 * Decompiled with CFR 0.152.
 */
package rise.module.impl.movement.jesus;

import hackclient.rise.aii;
import net.minecraft.potion.a;
import rise.event.EventLink;
import rise.event.Listener;
import rise.event.impl.PreMotionEvent;
import rise.event.impl.StrafeEvent;
import rise.module.Mode;
import rise.module.impl.movement.Jesus;

public class VulcanDolphinMode
extends Mode<Jesus> {
    private int KA = 0;
    @EventLink
    public final Listener<PreMotionEvent> KH = preMotionEvent -> {
        if (VulcanDolphinMode.aER.bgK.isInWater()) {
            this.KA = 0;
            aii.strafe(0.335 - Math.random() / 1000.0);
            if (VulcanDolphinMode.aER.bgK.a(a.dgw)) {
                aii.strafe(0.033 * (double)(1 + VulcanDolphinMode.aER.bgK.b(a.dgw).ajf()) + 0.34 - Math.random() / 1000.0);
            }
            ++this.KA;
        }
        ++this.KA;
    };
    @EventLink
    public final Listener<StrafeEvent> KI = strafeEvent -> {
        if (VulcanDolphinMode.aER.bgK.isInWater() && this.KA < 10) {
            VulcanDolphinMode.aER.bgK.ue = 0.01 - Math.random() / 1000.0;
            ++this.KA;
        }
    };

    public VulcanDolphinMode(String string, Jesus jesus) {
        super(string, jesus);
    }
}

