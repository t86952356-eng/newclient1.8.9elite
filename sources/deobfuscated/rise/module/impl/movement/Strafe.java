/*
 * Decompiled with CFR 0.152.
 */
package rise.module.impl.movement;

import hackclient.rise.ahj;
import hackclient.rise.aii;
import hackclient.rise.eh;
import net.minecraft.util.bt;
import rise.event.EventLink;
import rise.event.Listener;
import rise.event.impl.StrafeEvent;
import rise.module.Category;
import rise.module.Module;
import rise.module.ModuleInfo;
import rise.value.BooleanValue;
import rise.value.NumberValue;

@ModuleInfo(aliases={"module.movement.strafe.name"}, description="module.movement.strafe.description", category=Category.MOVEMENT)
public class Strafe
extends Module {
    private NumberValue Ey = new NumberValue("Strength", this, (Number)100, (Number)1, (Number)100, (Number)1);
    public final BooleanValue Ez = new BooleanValue("Hypixel Fly Disabler", (Module)this, (Boolean)false);
    @EventLink
    public final Listener<StrafeEvent> EA = strafeEvent -> {
        if (!((Boolean)this.Ez.wD()).booleanValue()) {
            aii.partialStrafePercent(((Number)this.Ey.wD()).floatValue());
        }
    };
    @EventLink
    public final Listener<eh> EB = eh2 -> {
        double d2 = bt.aJ(Math.toDegrees(aii.direction()));
        double d3 = bt.aJ(Math.toDegrees(Math.atan2(Strafe.aER.bgK.uf, Strafe.aER.bgK.ud)) - 90.0);
        if (((Boolean)this.Ez.wD()).booleanValue()) {
            if (Strafe.aER.bgK.aO || Strafe.aER.bgK.tR == 1 || Strafe.aER.bgK.ae < 20) {
                aii.strafe();
            } else if (Strafe.aER.bgK.ae > 1 && ahj.n(d2, d3) > 90.0) {
                if (ahj.n(d2, d3) > 90.0) {
                    aii.a(aii.speed(), (float)d3 - 180.0f);
                }
            } else {
                double d4 = Strafe.aER.bgK.ud;
                double d5 = Strafe.aER.bgK.uf;
                aii.strafe();
                Strafe.aER.bgK.uf = (Strafe.aER.bgK.uf * 2.1 + d5 * 1.0) / 3.1;
                Strafe.aER.bgK.ud = (Strafe.aER.bgK.ud * 2.1 + d4 * 1.0) / 3.1;
            }
        }
    };

    @Override
    public void onDisable() {
        Strafe.aER.bgC.dAp = 1.0f;
    }
}

