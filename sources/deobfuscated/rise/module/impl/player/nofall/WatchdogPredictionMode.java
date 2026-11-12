/*
 * Decompiled with CFR 0.152.
 */
package rise.module.impl.player.nofall;

import hackclient.rise.ahn;
import hackclient.rise.aik;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.network.play.client.f;
import net.minecraft.util.b;
import net.minecraft.util.ce;
import net.minecraft.util.cf;
import net.minecraft.util.da;
import net.minecraft.world.w;
import rise.event.EventLink;
import rise.event.Listener;
import rise.event.impl.PreUpdateEvent;
import rise.module.Mode;
import rise.module.impl.movement.Flight;
import rise.module.impl.player.NoFall;

public class WatchdogPredictionMode
extends Mode<NoFall> {
    private boolean Tw;
    @EventLink(cH=0)
    public final Listener<PreUpdateEvent> aic = preUpdateEvent -> {
        Object object;
        Object object2;
        boolean bl2 = false;
        if (this.e(Flight.class).isEnabled()) {
            return;
        }
        for (int i2 = 0; i2 <= 200; ++i2) {
            object2 = aik.aER.bgF;
            object = new b(WatchdogPredictionMode.aER.bgK.gW, WatchdogPredictionMode.aER.bgK.gX - (double)i2, WatchdogPredictionMode.aER.bgK.gY);
            Block block = ((w)object2).L((b)object).df();
            if (block != Blocks.cLc || WatchdogPredictionMode.aER.bgK.aO) {
                bl2 = false;
                break;
            }
            bl2 = true;
        }
        if (WatchdogPredictionMode.aER.bgK.csf > 3.0f && !bl2) {
            WatchdogPredictionMode.aER.bgC.dAp = 0.5f;
            da da2 = WatchdogPredictionMode.aER.bgK.aQ(1.0f);
            object = WatchdogPredictionMode.aER.bgF.a(da2, (da)(object2 = new da(da2.dAG, 0.0, da2.dAI)), false, false, false);
            if (object != null && ((ce)object).dzu == cf.dzy && ((ce)object).daS != null) {
                ahn.m(new f(WatchdogPredictionMode.aER.bgK.gW, ((ce)object).daS.dAH, WatchdogPredictionMode.aER.bgK.gY, true));
                WatchdogPredictionMode.aER.bgK.csf = 0.0f;
            }
        }
    };

    public WatchdogPredictionMode(String string, NoFall noFall) {
        super(string, noFall);
    }
}

