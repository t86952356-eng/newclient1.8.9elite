/*
 * Decompiled with CFR 0.152.
 */
package rise.module.impl.movement.phase;

import hackclient.rise.ek;
import hackclient.rise.es;
import net.minecraft.block.BlockLiquid;
import rise.event.EventLink;
import rise.event.Listener;
import rise.event.impl.StrafeEvent;
import rise.event.impl.TickEvent;
import rise.module.Mode;
import rise.module.impl.movement.Phase;

public class BlocksMCMode
extends Mode<Phase> {
    private int Od = 1;
    @EventLink
    public final Listener<TickEvent> Oe = tickEvent -> {
        if (BlocksMCMode.aER.bgK == null || BlocksMCMode.aER.bgF == null) {
            return;
        }
        switch (this.Od) {
            case 1: {
                if (BlocksMCMode.aER.aIY.chq.Re() && !BlocksMCMode.aER.bgF.aG(BlocksMCMode.aER.bgK.yl())) {
                    BlocksMCMode.aER.bgK.ue = 0.42;
                    ++this.Od;
                }
                BlocksMCMode.aER.bgK.aO = true;
                break;
            }
            case 2: {
                BlocksMCMode.aER.bgK.ue = 0.33;
                ++this.Od;
                break;
            }
            case 3: {
                BlocksMCMode.aER.bgK.ue = 0.25;
                ++this.Od;
                break;
            }
        }
        if (this.Od > 3 || this.Od == 0) {
            this.Od = 1;
        }
        BlocksMCMode.aER.bgK.csp = true;
    };
    @EventLink
    public final Listener<StrafeEvent> Of = strafeEvent -> {
        if (BlocksMCMode.aER.bgK == null) {
            return;
        }
        if (BlocksMCMode.aER.bgK.isSneaking()) {
            strafeEvent.setSpeed(0.179);
        }
    };
    @EventLink
    public final Listener<es> Og = es2 -> {
        if (BlocksMCMode.aER.bgK == null) {
            return;
        }
        if (es2.df() instanceof BlockLiquid) {
            return;
        }
        if ((double)es2.dg().wu() >= BlocksMCMode.aER.bgK.gX) {
            es2.a(null);
        }
    };
    @EventLink
    public final Listener<ek> Oh = ek2 -> ek2.cF();

    public BlocksMCMode(String string, Phase phase) {
        super(string, phase);
    }

    @Override
    public void onEnable() {
        this.Od = 1;
        if (BlocksMCMode.aER.bgK != null) {
            BlocksMCMode.aER.bgK.ue = 0.0;
        }
    }

    @Override
    public void onDisable() {
        if (BlocksMCMode.aER.bgK != null) {
            BlocksMCMode.aER.bgK.csp = false;
        }
        this.Od = 1;
    }
}

