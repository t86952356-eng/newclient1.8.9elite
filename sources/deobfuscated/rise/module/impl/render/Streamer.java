/*
 * Decompiled with CFR 0.152.
 */
package rise.module.impl.render;

import hackclient.rise.akr;
import net.minecraft.client.network.o;
import net.minecraft.network.aj;
import net.minecraft.network.play.server.c;
import net.minecraft.util.ba;
import net.minecraft.util.s;
import rise.event.EventLink;
import rise.event.Listener;
import rise.event.impl.PacketReceiveEvent;
import rise.event.impl.Render2DEvent;
import rise.module.Category;
import rise.module.Module;
import rise.module.ModuleInfo;
import rise.value.BooleanValue;

@ModuleInfo(aliases={"module.render.streamer.name"}, description="module.render.streamer.description", category=Category.RENDER)
public final class Streamer
extends Module {
    public final BooleanValue aqr = new BooleanValue("Name", (Module)this, (Boolean)true);
    public final akr aqs = new akr("Replacement", (Module)this, "You");
    @EventLink
    public final Listener<PacketReceiveEvent> aqt = packetReceiveEvent -> {
        aj<?> aj2 = packetReceiveEvent.dq();
        if (aj2 instanceof c && ((Boolean)this.aqr.wD()).booleanValue()) {
            c c2 = (c)aj2;
            ba ba2 = c2.DM();
            if (ba2 instanceof s) {
                String string = ba2.getFormattedText().replace(Streamer.aER.bgK.Ie().getName(), (CharSequence)this.aqs.wD());
                s s2 = new s(string);
                c2.l(s2);
            }
            packetReceiveEvent.e(c2);
        }
    };
    @EventLink(cH=4)
    public final Listener<Render2DEvent> aqu = render2DEvent -> {
        for (o o2 : aER.AU().Id()) {
            if (o2.Ie().getName().length() < 3 || o2.xW() == null) continue;
            o2.g(new s(o2.xW().getFormattedText().replaceFirst(Streamer.aER.bgK.Ie().getName(), (String)this.aqs.wD())));
        }
    };
}

