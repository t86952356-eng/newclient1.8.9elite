/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.ahn;
import hackclient.rise.aki;
import hackclient.rise.dk;
import hackclient.rise.dm;
import hackclient.rise.ei;
import hackclient.rise.gi;
import hackclient.rise.gj;
import hackclient.rise.gl;
import net.minecraft.network.play.client.i;
import net.minecraft.network.play.client.j;
import net.minecraft.util.ao;
import net.minecraft.util.b;

@gl(aliases={"module.player.antisuffocate.name"}, description="module.player.antifsuffocate.description", category=gj.PLAYER)
public class ta
extends gi {
    private final aki abo = new aki("Swing", (gi)this, (Boolean)true);
    @dm
    public final dk<ei> abp = ei2 -> {
        if (ta.aER.bgK.TT()) {
            ahn.m(new i(j.daZ, new b(ta.aER.bgK).aqY(), ao.dwr));
            if (((Boolean)this.abo.wD()).booleanValue()) {
                ta.aER.bgK.swingItem();
            }
        }
    };
}

