/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.ahn;
import hackclient.rise.akg;
import hackclient.rise.dk;
import hackclient.rise.dm;
import hackclient.rise.eo;
import hackclient.rise.jg;
import net.minecraft.entity.player.i;
import net.minecraft.network.play.client.w;

public class jr
extends akg<jg> {
    @dm
    public final dk<eo> xr = eo2 -> {
        if (!((Boolean)((jg)this.wy()).wJ.wD()).booleanValue()) {
            return;
        }
        if (jr.aER.bgK.aRg % 5 == 0) {
            i i2 = new i();
            i2.cJK = true;
            ahn.m(new w(i2));
        }
    };

    public jr(String string, jg jg2) {
        super(string, jg2);
    }
}

