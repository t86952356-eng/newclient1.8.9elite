/*
 * Decompiled with CFR 0.152.
 */
package rise.module.impl.player.nofall;

import hackclient.rise.ahn;
import hackclient.rise.bd;
import net.minecraft.network.play.client.e;
import rise.event.EventLink;
import rise.event.Listener;
import rise.event.impl.PreMotionEvent;
import rise.module.Mode;
import rise.module.impl.player.NoFall;

public class PacketMode
extends Mode<NoFall> {
    @EventLink
    public final Listener<PreMotionEvent> ajA = preMotionEvent -> {
        float f2 = bd.cY;
        if ((double)bd.cY > 3.1 + PacketMode.aER.bgK.ue) {
            ahn.m(new e(true));
            f2 = 0.0f;
        }
        bd.cY = f2;
    };

    public PacketMode(String string, NoFall noFall) {
        super(string, noFall);
    }
}

