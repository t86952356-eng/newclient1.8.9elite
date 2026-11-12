/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.aki;
import hackclient.rise.akq;
import hackclient.rise.dk;
import hackclient.rise.dm;
import hackclient.rise.eq;
import hackclient.rise.gi;
import hackclient.rise.gj;
import hackclient.rise.gl;
import net.minecraft.entity.r;
import net.minecraft.util.as;

@gl(aliases={"module.render.particles.name"}, description="module.render.particles.description", category=gj.RENDER)
public final class xu
extends gi {
    private final akq apP = new akq("Multiplier", this, (Number)1, (Number)1, (Number)10, (Number)1);
    private final aki apQ = new aki("Always Crit", (gi)this, (Boolean)true);
    private final aki apR = new aki("Always Sharpness", (gi)this, (Boolean)true);
    @dm
    public final dk<eq> apS = eq2 -> {
        r r2 = eq2.dc();
        if (xu.aER.bgK.csf > 0.0f || ((Boolean)this.apQ.wD()).booleanValue() || ((Boolean)this.apR.wD()).booleanValue()) {
            for (int i2 = 0; i2 <= ((Number)this.apP.wD()).intValue(); ++i2) {
                if (((Boolean)this.apQ.wD()).booleanValue()) {
                    xu.aER.bgK.E(r2);
                }
                if (!((Boolean)this.apR.wD()).booleanValue()) continue;
                xu.aER.bgN.a(r2, as.dxg);
            }
        }
    };
}

