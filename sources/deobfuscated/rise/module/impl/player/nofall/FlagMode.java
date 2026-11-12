/*
 * Decompiled with CFR 0.152.
 */
package rise.module.impl.player.nofall;

import hackclient.rise.bd;
import hackclient.rise.fd;
import net.minecraft.network.play.client.h;
import rise.event.EventLink;
import rise.event.Listener;
import rise.event.impl.PreMotionEvent;
import rise.module.Mode;
import rise.module.impl.player.NoFall;

public class FlagMode
extends Mode<NoFall> {
    @EventLink
    public final Listener<PreMotionEvent> aje = preMotionEvent -> {
        float f2 = bd.cY;
        if (f2 > 3.0f) {
            f2 = -999.0f;
            preMotionEvent.setPosY(preMotionEvent.getPosY() + Math.random());
        }
        bd.cY = f2;
    };
    @EventLink
    public final Listener<fd> ajf = fd2 -> {
        bd.cY = 0.0f;
        fd2.a(new h(fd2.getPosX(), fd2.getPosY(), fd2.getPosZ(), fd2.getYaw(), fd2.getPitch(), true));
    };

    public FlagMode(String string, NoFall noFall) {
        super(string, noFall);
    }
}

