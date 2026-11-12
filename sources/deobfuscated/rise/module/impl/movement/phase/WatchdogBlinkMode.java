/*
 * Decompiled with CFR 0.152.
 */
package rise.module.impl.movement.phase;

import hackclient.rise.bm;
import hackclient.rise.dh;
import hackclient.rise.ek;
import hackclient.rise.es;
import net.minecraft.block.BlockBarrier;
import net.minecraft.block.BlockGlass;
import net.minecraft.network.aj;
import net.minecraft.network.play.server.c;
import rip.vantage.commons.util.time.a;
import rise.event.EventLink;
import rise.event.Listener;
import rise.event.impl.PacketReceiveEvent;
import rise.event.impl.PreUpdateEvent;
import rise.module.Mode;
import rise.module.impl.movement.Phase;

public class WatchdogBlinkMode
extends Mode<Phase> {
    private boolean OD;
    private final a OE = new a();
    private final rise.module.impl.player.nofall.WatchdogBlinkMode OF = null;
    @EventLink
    public final Listener<PreUpdateEvent> OG = preUpdateEvent -> {
        if (this.OD && !this.OE.T(4000L)) {
            bm.blink();
        }
    };
    @EventLink
    public final Listener<es> OH = es2 -> {
        if (this.OD && bm.enabled && es2.df() instanceof BlockGlass) {
            es2.cF();
        }
        if (this.OD && bm.enabled && es2.df() instanceof BlockBarrier) {
            es2.cF();
        }
    };
    @EventLink
    public final Listener<PacketReceiveEvent> OI = packetReceiveEvent -> {
        aj<?> aj2 = packetReceiveEvent.dq();
        if (aj2 instanceof c) {
            String string;
            c c2 = (c)aj2;
            switch (string = c2.DM().arq()) {
                case "Cages opened! FIGHT!": 
                case "\u00a7r\u00a7r\u00a7r                               \u00a7r\u00a7f\u00a7lSkyWars Duel\u00a7r": 
                case "\u00a7r\u00a7eCages opened! \u00a7r\u00a7cFIGHT!\u00a7r": {
                    this.OD = false;
                    break;
                }
                case "The game starts in 3 seconds!": 
                case "\u00a7r\u00a7e\u00a7r\u00a7eThe game starts in \u00a7r\u00a7a\u00a7r\u00a7c3\u00a7r\u00a7e seconds!\u00a7r\u00a7e\u00a7r": 
                case "\u00a7r\u00a7eCages open in: \u00a7r\u00a7c3 \u00a7r\u00a7eseconds!\u00a7r": {
                    this.OD = true;
                    this.OE.aX();
                    break;
                }
                case "The games begin in 3 seconds!": {
                    this.OD = true;
                    this.OE.aX();
                }
            }
        }
    };
    @EventLink
    public final Listener<ek> OJ = dh::cF;

    public WatchdogBlinkMode(String string, Phase phase) {
        super(string, phase);
    }
}

