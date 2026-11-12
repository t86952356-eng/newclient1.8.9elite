/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.akg;
import hackclient.rise.bd;
import hackclient.rise.dk;
import hackclient.rise.dm;
import hackclient.rise.ei;
import hackclient.rise.fd;
import hackclient.rise.ua;
import net.minecraft.network.play.client.h;

public class us
extends akg<ua> {
    @dm
    public final dk<ei> aje = ei2 -> {
        float f2 = bd.cY;
        if (f2 > 3.0f) {
            f2 = -999.0f;
            ei2.setPosY(ei2.getPosY() + Math.random());
        }
        bd.cY = f2;
    };
    @dm
    public final dk<fd> ajf = fd2 -> {
        bd.cY = 0.0f;
        fd2.a(new h(fd2.getPosX(), fd2.getPosY(), fd2.getPosZ(), fd2.getYaw(), fd2.getPitch(), true));
    };

    public us(String string, ua ua2) {
        super(string, ua2);
    }
}

