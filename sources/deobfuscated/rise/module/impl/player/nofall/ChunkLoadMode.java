/*
 * Decompiled with CFR 0.152.
 */
package rise.module.impl.player.nofall;

import hackclient.rise.aik;
import hackclient.rise.bd;
import hackclient.rise.fd;
import net.minecraft.block.Block;
import net.minecraft.util.b;
import rise.event.EventLink;
import rise.event.Listener;
import rise.event.impl.PreMotionEvent;
import rise.module.Mode;
import rise.module.impl.player.NoFall;

public class ChunkLoadMode
extends Mode<NoFall> {
    private boolean aiI;
    @EventLink
    public final Listener<PreMotionEvent> aiJ = preMotionEvent -> {
        if (this.aiI) {
            ChunkLoadMode.aER.bgK.ue = 0.0;
            preMotionEvent.setOnGround(false);
            preMotionEvent.setPosY(preMotionEvent.getPosY() - (double)0.098f);
            ChunkLoadMode.aER.bgK.Q(ChunkLoadMode.aER.bgK.gW, preMotionEvent.getPosY(), ChunkLoadMode.aER.bgK.gY);
            return;
        }
        if (ChunkLoadMode.aER.bgK.ue > 0.0 || bd.cY <= 3.0f) {
            return;
        }
        Block block = aik.u(new b(preMotionEvent.getPosX(), preMotionEvent.getPosY() + ChunkLoadMode.aER.bgK.ue, preMotionEvent.getPosZ()));
        if (block.xb().zw()) {
            bd.cY = 0.0f;
            this.aiI = true;
        }
    };
    @EventLink
    public final Listener<fd> aiK = fd2 -> {
        this.aiI = false;
    };

    public ChunkLoadMode(String string, NoFall noFall) {
        super(string, noFall);
    }
}

