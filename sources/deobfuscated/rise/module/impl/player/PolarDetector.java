/*
 * Decompiled with CFR 0.152.
 */
package rise.module.impl.player;

import hackclient.rise.afl;
import hackclient.rise.cg;
import hackclient.rise.fg;
import net.minecraft.network.play.client.s;
import rise.event.EventLink;
import rise.event.Listener;
import rise.event.impl.PacketSendEvent;
import rise.event.impl.PreMotionEvent;
import rise.module.Category;
import rise.module.Module;
import rise.module.ModuleInfo;

@ModuleInfo(aliases={"module.player.polardetector.name"}, description="module.player.polardetector.description", category=Category.PLAYER)
public class PolarDetector
extends Module {
    boolean ago = false;
    @EventLink
    public final Listener<PreMotionEvent> agp = preMotionEvent -> {
        if (PolarDetector.aER.bgK.aRg == 30) {
            afl.b(this.ago ? "Polar is enabled" : "Polar is disabled", new Object[0]);
        }
    };
    @EventLink
    public final Listener<PacketSendEvent> agq = packetSendEvent -> {
        if (packetSendEvent.dq() instanceof s) {
            this.ago = true;
        }
    };
    @EventLink
    public final Listener<fg> agr = fg2 -> {
        this.ago = false;
    };

    @Override
    public void onEnable() {
        cg.e("Polar Detector", "Join a game and this module will notify you of polars status");
    }
}

