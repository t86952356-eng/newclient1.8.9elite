/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.aki;
import hackclient.rise.akr;
import hackclient.rise.dk;
import hackclient.rise.dm;
import hackclient.rise.fh;
import hackclient.rise.fs;
import hackclient.rise.gi;
import hackclient.rise.gj;
import hackclient.rise.gl;
import net.minecraft.client.network.o;
import net.minecraft.network.aj;
import net.minecraft.network.play.server.c;
import net.minecraft.util.ba;
import net.minecraft.util.s;

@gl(aliases={"module.render.streamer.name"}, description="module.render.streamer.description", category=gj.RENDER)
public final class xy
extends gi {
    public final aki aqr = new aki("Name", (gi)this, (Boolean)true);
    public final akr aqs = new akr("Replacement", (gi)this, "You");
    @dm
    public final dk<fh> aqt = fh2 -> {
        aj<?> aj2 = fh2.dq();
        if (aj2 instanceof c && ((Boolean)this.aqr.wD()).booleanValue()) {
            c c2 = (c)aj2;
            ba ba2 = c2.DM();
            if (ba2 instanceof s) {
                String string = ba2.getFormattedText().replace(xy.aER.bgK.Ie().getName(), (CharSequence)this.aqs.wD());
                s s2 = new s(string);
                c2.l(s2);
            }
            fh2.e(c2);
        }
    };
    @dm(cH=4)
    public final dk<fs> aqu = fs2 -> {
        for (o o2 : aER.AU().Id()) {
            if (o2.Ie().getName().length() < 3 || o2.xW() == null) continue;
            o2.g(new s(o2.xW().getFormattedText().replaceFirst(xy.aER.bgK.Ie().getName(), (String)this.aqs.wD())));
        }
    };
}

