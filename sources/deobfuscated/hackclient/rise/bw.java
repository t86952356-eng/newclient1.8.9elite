/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.am;
import hackclient.rise.cc;
import hackclient.rise.cd;
import java.util.HashMap;
import java.util.Map;
import net.minecraft.network.aj;
import rise.event.EventLink;
import rise.event.Listener;
import rise.event.impl.PacketReceiveEvent;

public class bw
extends am {
    private Map<Integer, cd> gk = new HashMap<Integer, cd>();
    private final Map<Class<? extends aj<?>>, cc> gl = new HashMap();
    @EventLink
    public final Listener<PacketReceiveEvent> gm = packetReceiveEvent -> {
        Map<Integer, cd> map;
        if (packetReceiveEvent.isCancelled()) {
            return;
        }
        aj<?> aj2 = packetReceiveEvent.dq();
        cc cc2 = this.gl.get(aj2.getClass());
        if (cc2 != null && (map = cc2.a(aj2, this.gk)) != null) {
            this.gk = map;
        }
    };

    @Override
    public void aT() {
        for (cc cc2 : cc.values()) {
            this.gl.put(cc2.ce(), cc2);
        }
    }

    public cd i(int n2) {
        return this.gk.get(n2);
    }
}

