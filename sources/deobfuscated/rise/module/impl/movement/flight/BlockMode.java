/*
 * Decompiled with CFR 0.152.
 */
package rise.module.impl.movement.flight;

import hackclient.rise.afl;
import hackclient.rise.ahn;
import hackclient.rise.aii;
import hackclient.rise.aik;
import hackclient.rise.ain;
import hackclient.rise.bu;
import net.minecraft.block.BlockAir;
import net.minecraft.item.af;
import net.minecraft.network.play.client.m;
import net.minecraft.util.ao;
import net.minecraft.util.b;
import net.minecraft.util.da;
import rise.event.EventLink;
import rise.event.Listener;
import rise.event.impl.PreMotionEvent;
import rise.event.impl.PreUpdateEvent;
import rise.module.Mode;
import rise.module.impl.movement.Flight;

public class BlockMode
extends Mode<Flight> {
    @EventLink
    public final Listener<PreUpdateEvent> FC = preUpdateEvent -> {
        this.d(bu.class);
        bu.setSlot(ain.vM());
    };
    @EventLink
    public final Listener<PreMotionEvent> FD = preMotionEvent -> {
        if (BlockMode.aER.aIY.chq.Re() && aik.ay(3) && BlockMode.aER.bgK.ae > 15) {
            if (Math.abs(aii.predictedMotion(0.42f) - BlockMode.aER.bgK.ue) < 1.0E-4) {
                preMotionEvent.setOnGround(true);
            } else {
                afl.b("Not Set", new Object[0]);
                BlockMode.aER.bgK.ue = 0.42f;
            }
            BlockMode.aER.bgK.ue = 0.42f;
        }
        this.d(bu.class);
        if (bu.bO() != null) {
            this.d(bu.class);
            if (bu.bO().bP() instanceof af && aik.p(0.0, -1.0, 0.0) instanceof BlockAir) {
                ahn.m(new m());
                BlockMode.aER.bgu.a(BlockMode.aER.bgK, BlockMode.aER.bgF, BlockMode.aER.bgK.abO(), new b(BlockMode.aER.bgK.gW, Math.floor(BlockMode.aER.bgK.gX) - 1.0, BlockMode.aER.bgK.gY), ao.dwr, new da(BlockMode.aER.bgK.gW, Math.floor(BlockMode.aER.bgK.gX) - 1.0, BlockMode.aER.bgK.gY));
            }
        }
    };

    public BlockMode(String string, Flight flight) {
        super(string, flight);
    }
}

