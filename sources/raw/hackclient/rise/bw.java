/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.am;
import hackclient.rise.cc;
import hackclient.rise.cd;
import hackclient.rise.dk;
import hackclient.rise.dm;
import hackclient.rise.fh;
import java.util.HashMap;
import java.util.Map;
import net.minecraft.network.aj;

public class bw
extends am {
    private Map<Integer, cd> gk = new HashMap<Integer, cd>();
    private final Map<Class<? extends aj<?>>, cc> gl = new HashMap();
    @dm
    public final dk<fh> gm = fh2 -> {
        Map<Integer, cd> map;
        if (fh2.isCancelled()) {
            return;
        }
        aj<?> aj2 = fh2.dq();
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

