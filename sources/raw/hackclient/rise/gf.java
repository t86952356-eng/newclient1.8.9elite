/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package hackclient.rise;

import hackclient.rise.a;
import hackclient.rise.adg;
import hackclient.rise.aja;
import hackclient.rise.ajc;
import hackclient.rise.dk;
import hackclient.rise.dm;
import hackclient.rise.ew;
import hackclient.rise.fs;
import hackclient.rise.ft;
import hackclient.rise.fu;
import hackclient.rise.ge;
import hackclient.rise.gg;
import hackclient.rise.xi;
import java.util.LinkedHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import lombok.Generated;
import net.minecraft.client.renderer.GlStateManager;

public class gf {
    private final LinkedHashMap<Integer, LinkedHashMap<gg, ge>> kM = new LinkedHashMap();
    private final int kN = 3;
    private boolean kO;
    @dm(cH=-1)
    public final dk<fu> kP = fu2 -> this.b(ajc.aQF);
    @dm(cH=-1)
    public final dk<fs> kQ = fs2 -> {
        adg.w(0.0f);
        this.b(ajc.aQF);
    };
    @dm
    public final dk<ew> kR = ew2 -> {
        this.kO = (Boolean)a.a.g().c(xi.class).aoL.wD();
    };
    @dm(cH=-1)
    public final dk<ft> kS = ft2 -> this.b(ajc.aQE);

    public gf() {
        for (int i2 = 0; i2 <= 3; ++i2) {
            this.kM.put(i2, new LinkedHashMap());
            for (gg gg2 : gg.values()) {
                this.kM.get(i2).put(gg2, new ge(gg2.dW().dY() == null ? null : (aja)gg2.dW().dY().newInstance()));
            }
        }
        a.a.e().b(this);
    }

    public ge a(gg gg2) {
        return this.a(gg2, 0);
    }

    public ge a(gg gg2, int n2) {
        return this.kM.get(n2).get((Object)gg2);
    }

    private void b(ajc ajc2) {
        try {
            this.kM.forEach((n2, linkedHashMap) -> linkedHashMap.values().forEach(ge2 -> {
                if (ge2.dU() == null || this.kO) {
                    ge2.a(ajc2);
                }
            }));
        }
        finally {
            this.kM.forEach((n2, linkedHashMap) -> linkedHashMap.forEach((gg2, ge2) -> ge2.clear()));
        }
        GlStateManager.e(1.0f, 1.0f, 1.0f, 1.0f);
        GlStateManager.JA();
        GlStateManager.tL();
    }

    @Generated
    public LinkedHashMap<Integer, LinkedHashMap<gg, ge>> dV() {
        return this.kM;
    }

    private static /* synthetic */ void a(AtomicInteger atomicInteger, Integer n2, LinkedHashMap linkedHashMap) {
        linkedHashMap.values().forEach(ge2 -> {
            if (ge2.dU() != null && !ge2.dT().isEmpty()) {
                atomicInteger.getAndIncrement();
            }
        });
    }
}

