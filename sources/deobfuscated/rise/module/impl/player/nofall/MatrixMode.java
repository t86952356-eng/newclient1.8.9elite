/*
 * Decompiled with CFR 0.152.
 */
package rise.module.impl.player.nofall;

import hackclient.rise.ahn;
import net.minecraft.network.aj;
import net.minecraft.network.play.client.e;
import rise.event.EventLink;
import rise.event.Listener;
import rise.event.impl.PacketSendEvent;
import rise.event.impl.PreUpdateEvent;
import rise.module.Mode;
import rise.module.impl.player.NoFall;

public class MatrixMode
extends Mode<NoFall> {
    private int aju = 0;
    private boolean ajv = false;
    private boolean ajw = false;
    @EventLink
    public final Listener<PreUpdateEvent> ajx = preUpdateEvent -> {
        if ((double)Math.round(MatrixMode.aER.bgK.csf) - MatrixMode.aER.bgK.ue > 3.0) {
            MatrixMode.aER.bgK.ue = 0.0;
            MatrixMode.aER.bgK.csf = 0.0f;
            MatrixMode.aER.bgK.ud *= 0.1;
            MatrixMode.aER.bgK.uf *= 0.1;
            this.ajw = true;
        }
        if (MatrixMode.aER.bgK.csf / 3.0f > (float)this.aju) {
            this.aju = Math.round(MatrixMode.aER.bgK.csf) / 3;
            this.ajv = true;
        }
        if (MatrixMode.aER.bgK.aO) {
            this.aju = 0;
        }
    };
    @EventLink
    public final Listener<PacketSendEvent> ajy = packetSendEvent -> {
        aj<?> aj2 = packetSendEvent.dq();
        if (aj2 instanceof e) {
            e e2 = (e)aj2;
            if (this.ajw) {
                MatrixMode.aER.bgC.dAp = 0.5f;
                e2.onGround = false;
                ahn.n(new e(true));
                this.ajw = false;
            }
        }
    };

    public MatrixMode(String string, NoFall noFall) {
        super(string, noFall);
    }

    @Override
    public void onEnable() {
        this.ajw = false;
        this.ajv = false;
        this.aju = 0;
    }
}

