/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.adg;
import hackclient.rise.am;
import net.minecraft.network.aj;
import net.minecraft.network.play.server.az;
import net.minecraft.network.play.server.ba;
import net.minecraft.network.play.server.c;
import net.minecraft.network.play.server.o;
import rip.vantage.commons.util.time.a;
import rise.event.EventLink;
import rise.event.Listener;
import rise.event.impl.PacketReceiveEvent;
import rise.event.impl.PreMotionEvent;
import rise.event.impl.Render2DEvent;

public class aq
extends am {
    private boolean bI;
    private boolean bJ;
    private boolean bK;
    private int bL;
    private float bM;
    public final a bN = new a();
    @EventLink
    public final Listener<PreMotionEvent> bO = preMotionEvent -> {
        if (aq.aER.bgK.aRg % 100 == 0 || this.bK || aq.aER.aIY.chz.Re() != this.bI || aq.aER.aIY.bJS != this.bJ || aq.aER.bgK.aRg <= 10 || this.bL > 0) {
            adg.aCw = true;
            this.bI = aq.aER.aIY.chz.Re();
            this.bJ = aq.aER.aIY.bJS;
            this.bK = false;
        }
        if (this.bM != aq.aER.bgK.getHealth()) {
            this.bL = 3;
            this.bM = aq.aER.bgK.getHealth();
        }
        --this.bL;
    };
    @EventLink
    public final Listener<Render2DEvent> bP = render2DEvent -> {
        if (aq.aER.bgR != null) {
            this.bK = true;
            adg.aCw = true;
        }
    };
    @EventLink
    public final Listener<PacketReceiveEvent> bQ = packetReceiveEvent -> {
        aj<?> aj2 = packetReceiveEvent.dq();
        if (aj2 instanceof c || aj2 instanceof ba || aj2 instanceof az) {
            this.bN.aX();
            this.bK = true;
        }
        if (aj2 instanceof o) {
            this.bL = 5;
        }
    };
}

