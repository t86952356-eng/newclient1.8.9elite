/*
 * Decompiled with CFR 0.152.
 */
package rise.module.impl.player.nofall;

import hackclient.rise.ahn;
import hackclient.rise.aik;
import hackclient.rise.bd;
import hackclient.rise.bm;
import net.minecraft.init.Items;
import net.minecraft.item.co;
import net.minecraft.network.play.client.e;
import net.minecraft.network.play.client.k;
import net.minecraft.util.b;
import rise.event.EventLink;
import rise.event.Listener;
import rise.event.impl.PreMotionEvent;
import rise.event.impl.Render2DEvent;
import rise.module.Mode;
import rise.module.impl.player.NoFall;
import rise.module.impl.player.Scaffold;
import rise.value.BooleanValue;

public final class WatchdogBlinkMode
extends Mode<NoFall> {
    public int ajG = 0;
    public boolean IJ;
    public final BooleanValue ajH = new BooleanValue("Packet", (Mode<?>)this, (Boolean)true);
    @EventLink
    public final Listener<PreMotionEvent> ajI = preMotionEvent -> {
        if (!aik.vw() || this.e(Scaffold.class).isEnabled()) {
            return;
        }
        if (WatchdogBlinkMode.aER.bgK.tR == 1 && WatchdogBlinkMode.aER.bgK.ue < 0.0 && aik.vw() && !aik.ad(3.0)) {
            this.IJ = true;
        }
        if (this.IJ) {
            bm.a(99999, true, false, false, false, true);
            preMotionEvent.setOnGround(true);
            ++this.ajG;
        }
        if (this.IJ && WatchdogBlinkMode.aER.bgK.aO) {
            bm.dispatch();
            this.IJ = false;
            this.ajG = 0;
        }
        if (this.ajG <= 0 && (double)bd.cY > 2.9 && !this.e(Scaffold.class).isEnabled()) {
            preMotionEvent.setPosY(preMotionEvent.getPosY() + 1.0E-13);
            ahn.m(new k(b.dtN, 0, new co(Items.cQB, 1), 0.5f, 0.5f, 0.5f));
            WatchdogBlinkMode.aER.bgC.dAp = 0.5f;
            ahn.m(new e(true));
            bd.cY = 0.0f;
        }
    };
    @EventLink
    public final Listener<Render2DEvent> ajJ = render2DEvent -> {
        if (this.ajG > 0) {
            WatchdogBlinkMode.aER.fontRendererObj.c("Blinking: " + this.ajG, (double)WatchdogBlinkMode.aER.jY.getScaledWidth() / 2.0, (double)WatchdogBlinkMode.aER.jY.getScaledHeight() / 2.0 + 20.0, -1);
        }
    };

    public WatchdogBlinkMode(String string, NoFall noFall) {
        super(string, noFall);
    }
}

