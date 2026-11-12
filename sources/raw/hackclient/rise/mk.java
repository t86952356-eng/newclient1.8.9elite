/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.ahj;
import hackclient.rise.aii;
import hackclient.rise.aki;
import hackclient.rise.akq;
import hackclient.rise.dk;
import hackclient.rise.dm;
import hackclient.rise.eh;
import hackclient.rise.eo;
import hackclient.rise.gi;
import hackclient.rise.gj;
import hackclient.rise.gl;
import net.minecraft.util.bt;

@gl(aliases={"module.movement.strafe.name"}, description="module.movement.strafe.description", category=gj.MOVEMENT)
public class mk
extends gi {
    private akq Ey = new akq("Strength", this, (Number)100, (Number)1, (Number)100, (Number)1);
    public final aki Ez = new aki("Hypixel Fly Disabler", (gi)this, (Boolean)false);
    @dm
    public final dk<eo> EA = eo2 -> {
        if (!((Boolean)this.Ez.wD()).booleanValue()) {
            aii.partialStrafePercent(((Number)this.Ey.wD()).floatValue());
        }
    };
    @dm
    public final dk<eh> EB = eh2 -> {
        double d2 = bt.aJ(Math.toDegrees(aii.direction()));
        double d3 = bt.aJ(Math.toDegrees(Math.atan2(mk.aER.bgK.uf, mk.aER.bgK.ud)) - 90.0);
        if (((Boolean)this.Ez.wD()).booleanValue()) {
            if (mk.aER.bgK.aO || mk.aER.bgK.tR == 1 || mk.aER.bgK.ae < 20) {
                aii.strafe();
            } else if (mk.aER.bgK.ae > 1 && ahj.n(d2, d3) > 90.0) {
                if (ahj.n(d2, d3) > 90.0) {
                    aii.a(aii.speed(), (float)d3 - 180.0f);
                }
            } else {
                double d4 = mk.aER.bgK.ud;
                double d5 = mk.aER.bgK.uf;
                aii.strafe();
                mk.aER.bgK.uf = (mk.aER.bgK.uf * 2.1 + d5 * 1.0) / 3.1;
                mk.aER.bgK.ud = (mk.aER.bgK.ud * 2.1 + d4 * 1.0) / 3.1;
            }
        }
    };

    @Override
    public void onDisable() {
        mk.aER.bgC.dAp = 1.0f;
    }
}

