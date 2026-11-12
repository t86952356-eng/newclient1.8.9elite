/*
 * Decompiled with CFR 0.152.
 */
package rise.module.impl.render.interface;

import hackclient.rise.agf;
import hackclient.rise.ais;
import hackclient.rise.ait;
import hackclient.rise.gb;
import hackclient.rise.gd;
import hackclient.rise.zf;
import java.awt.Color;
import net.minecraft.util.cm;
import rise.Client;
import rise.event.EventLink;
import rise.event.Listener;
import rise.event.impl.Render2DEvent;
import rise.event.impl.TickEvent;
import rise.module.Mode;
import rise.module.impl.render.Interface;
import rise.util.Language;

public class ZdMode
extends Mode<Interface> {
    private agf ky;
    private final cm atL = new cm("rise/logo/wurst.png");
    @EventLink
    public final Listener<Render2DEvent> atM = render2DEvent -> {
        if (aER == null || ZdMode.aER.aIY.bJS || ZdMode.aER.bgF == null || ZdMode.aER.bgK == null) {
            return;
        }
        ((Interface)this.wy()).n(this.ky.tF() + 1.0f);
        ((Interface)this.wy()).a(this.ky);
        ((Interface)this.wy()).o(4.0f);
        for (zf zf2 : ((Interface)this.wy()).mc()) {
            if (zf2.atQ == 0.0f) continue;
            double d2 = zf2.nH().getX();
            double d3 = zf2.nH().getY();
            Color color = Color.WHITE;
            this.ky.b(zf2.nN(), d2, d3, color.getRGB());
        }
        ait.d(0.0, 10.0, 185.0, 12.0, ais.d(Color.WHITE, 100));
        ait.a(this.atL, 2.0, 5.5, 89.17646789550781, 22.58823585510254);
        this.ky.a("v6 MC 1.8.9", 95.0, 14.0, Color.BLACK.getRGB());
    };
    @EventLink
    public final Listener<TickEvent> atN = tickEvent -> aNC.execute(() -> {
        for (zf zf2 : ((Interface)this.wy()).mc()) {
            if (zf2.atQ == 0.0f) continue;
            String string = zf2.nN();
            zf2.t(this.ky.bQ(string));
            zf2.u(0.0f);
            zf2.an("");
        }
    });

    public ZdMode(String string, Interface interface_) {
        super(string, interface_);
        this.ky = Client.a.d() == Language.aNJ ? gb.ks.a(18, gd.kG) : ZdMode.aER.fontRendererObj;
    }
}

