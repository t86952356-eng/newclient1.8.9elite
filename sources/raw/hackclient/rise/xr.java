/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.aju;
import hackclient.rise.aki;
import hackclient.rise.dk;
import hackclient.rise.dm;
import hackclient.rise.ei;
import hackclient.rise.eq;
import hackclient.rise.gi;
import hackclient.rise.gj;
import hackclient.rise.gl;
import net.minecraft.block.Block;
import net.minecraft.entity.c;
import net.minecraft.entity.effect.a;
import net.minecraft.entity.r;
import net.minecraft.init.Blocks;
import net.minecraft.util.as;

@gl(aliases={"module.render.killeffect.name"}, description="module.render.killeffect.description", category=gj.RENDER)
public final class xr
extends gi {
    private final aki apB = new aki("Lightning", (gi)this, (Boolean)true);
    private final aki apC = new aki("Blood Explosion", (gi)this, (Boolean)true);
    private final aki apD = new aki("Explosion", (gi)this, (Boolean)true);
    private r jE;
    @dm
    public final dk<ei> apE = ei2 -> {
        if (this.jE != null && !xr.aER.bgF.dCS.contains(this.jE)) {
            if (((Boolean)this.apB.wD()).booleanValue()) {
                a a2 = new a(xr.aER.bgF, this.jE.gW, this.jE.gX, this.jE.gY);
                xr.aER.bgF.a((int)(-Math.random() * 100000.0), (c)a2);
                String string = "ambient.weather.thunder";
                String string2 = "random.explode";
                aju.a(string, 10000.0f, 0.95f);
                aju.a(string2, 2.0f, 0.57f);
            }
            if (((Boolean)this.apD.wD()).booleanValue()) {
                for (int i2 = 0; i2 <= 8; ++i2) {
                    xr.aER.bgN.a(this.jE, as.dxw);
                }
                aju.cn("item.fireCharge.use");
            }
            if (((Boolean)this.apC.wD()).booleanValue()) {
                double d2 = this.jE.gX;
                double d3 = this.jE.gX + (double)this.jE.height + 0.4;
                double d4 = 0.4;
                for (int i3 = 0; i3 < 100; ++i3) {
                    for (double d5 = d2; d5 <= d3; d5 += d4) {
                        xr.aER.bgF.a(as.dxH, this.jE.gW, d5, this.jE.gY, 0.0, 0.0, 0.0, Block.a(Blocks.cOp.xM()));
                    }
                }
                for (double d6 = d2; d6 <= d3; d6 += d4) {
                    aju.cn("dig.stone");
                }
            }
            this.jE = null;
        }
    };
    @dm
    public final dk<eq> apF = eq2 -> {
        r r2 = eq2.dc();
        if (r2 instanceof r) {
            this.jE = r2;
        }
    };
}

