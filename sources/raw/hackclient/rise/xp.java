/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.aka;
import hackclient.rise.aki;
import hackclient.rise.akn;
import hackclient.rise.dk;
import hackclient.rise.dm;
import hackclient.rise.fs;
import hackclient.rise.gg;
import hackclient.rise.gi;
import hackclient.rise.gj;
import hackclient.rise.gl;
import hackclient.rise.xq;
import hackclient.rise.zr;
import java.util.ArrayList;

@gl(aliases={"module.render.keystrokes.name"}, description="module.render.keystrokes.description", category=gj.RENDER)
public final class xp
extends gi {
    private final akn apu = new akn("Position", (gi)this, new aka(100.0, 100.0), false);
    private final aki apv = new aki("Space", (gi)this, (Boolean)true);
    private boolean apw;
    private final int apx = 3;
    private ArrayList<zr> apy = new ArrayList();
    @dm
    public final dk<fs> apz = fs2 -> {
        if (xp.aER.bgR != null) {
            if (this.apw != (Boolean)this.apv.wD()) {
                this.apy = new xq(this);
            }
            this.apw = (Boolean)this.apv.wD();
        }
        this.apu.n(new aka(72.0, 72.0));
        this.b(gg.kV).c(() -> this.apy.forEach(zr2 -> zr2.c(this.apu.aqy)));
        this.b(gg.kU).c(() -> this.apy.forEach(zr2 -> zr2.d(this.apu.aqy)));
        this.b(gg.kT).c(() -> this.apy.forEach(zr2 -> zr2.e(this.apu.aqy)));
    };
}

