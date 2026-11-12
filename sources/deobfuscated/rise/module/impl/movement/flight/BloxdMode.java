/*
 * Decompiled with CFR 0.152.
 */
package rise.module.impl.movement.flight;

import hackclient.rise.afl;
import hackclient.rise.ahn;
import hackclient.rise.bb;
import hackclient.rise.fd;
import java.util.Random;
import net.minecraft.init.Items;
import net.minecraft.item.co;
import net.minecraft.network.play.client.k;
import net.minecraft.util.ao;
import net.minecraft.util.b;
import rise.event.EventLink;
import rise.event.Listener;
import rise.event.impl.PreMotionEvent;
import rise.module.Mode;
import rise.module.impl.movement.Flight;
import rise.module.impl.player.Scaffold;

public class BloxdMode
extends Mode<Flight> {
    @EventLink
    private final Listener<fd> Fq = fd2 -> {};
    @EventLink
    private final Listener<PreMotionEvent> Fr = preMotionEvent -> {
        if (!bb.a(true, true, true, true, true) && !this.e(Scaffold.class).isEnabled()) {
            Random random = new Random();
            float f2 = random.nextFloat();
            float f3 = random.nextFloat();
            ahn.m(new k(new b(BloxdMode.aER.bgK.gW, BloxdMode.aER.bgK.gX, BloxdMode.aER.bgK.gY), ao.dwr.OY(), new co(Items.cQB), f2, 1.0f, f3));
        }
    };

    public BloxdMode(String string, Flight flight) {
        super(string, flight);
    }

    @Override
    public void onEnable() {
        afl.b("Collide with a block to fly and remember to collide into a wall in Bedwars to avoid fall damage when landing, press shift to fall faster", new Object[0]);
    }
}

