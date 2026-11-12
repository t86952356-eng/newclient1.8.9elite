/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.akg;
import hackclient.rise.dk;
import hackclient.rise.dm;
import hackclient.rise.fi;
import hackclient.rise.jg;
import net.minecraft.network.aj;
import net.minecraft.network.play.client.c;
import net.minecraft.network.play.client.e;
import net.minecraft.network.play.client.s;
import net.minecraft.network.play.server.h;

public class km
extends akg<jg> {
    private boolean yV;
    @dm
    public final dk<fi> yW = fi2 -> {
        aj<?> aj2 = fi2.dq();
        if (aj2 instanceof h) {
            this.yV = true;
        } else if (aj2 instanceof c) {
            this.yV = false;
        } else if (aj2 instanceof e && km.aER.bgK.aRg <= 10) {
            this.yV = true;
        } else if (aj2 instanceof s && this.yV && km.aER.bgK.aRg < 350) {
            ((s)fi2.dq()).setUid(km.aER.bgK.aRg % 2 == 0 ? (short)Short.MIN_VALUE : Short.MAX_VALUE);
        }
    };

    public km(String string, jg jg2) {
        super(string, jg2);
    }
}

