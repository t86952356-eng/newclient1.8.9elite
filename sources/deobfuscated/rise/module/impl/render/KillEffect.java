/*
 * Decompiled with CFR 0.152.
 */
package rise.module.impl.render;

import hackclient.rise.aju;
import net.minecraft.block.Block;
import net.minecraft.entity.c;
import net.minecraft.entity.effect.a;
import net.minecraft.entity.r;
import net.minecraft.init.Blocks;
import net.minecraft.util.as;
import rise.event.EventLink;
import rise.event.Listener;
import rise.event.impl.AttackEvent;
import rise.event.impl.PreMotionEvent;
import rise.module.Category;
import rise.module.Module;
import rise.module.ModuleInfo;
import rise.value.BooleanValue;

@ModuleInfo(aliases={"module.render.killeffect.name"}, description="module.render.killeffect.description", category=Category.RENDER)
public final class KillEffect
extends Module {
    private final BooleanValue apB = new BooleanValue("Lightning", (Module)this, (Boolean)true);
    private final BooleanValue apC = new BooleanValue("Blood Explosion", (Module)this, (Boolean)true);
    private final BooleanValue apD = new BooleanValue("Explosion", (Module)this, (Boolean)true);
    private r jE;
    @EventLink
    public final Listener<PreMotionEvent> apE = preMotionEvent -> {
        if (this.jE != null && !KillEffect.aER.bgF.dCS.contains(this.jE)) {
            if (((Boolean)this.apB.wD()).booleanValue()) {
                a a2 = new a(KillEffect.aER.bgF, this.jE.gW, this.jE.gX, this.jE.gY);
                KillEffect.aER.bgF.a((int)(-Math.random() * 100000.0), (c)a2);
                String string = "ambient.weather.thunder";
                String string2 = "random.explode";
                aju.a(string, 10000.0f, 0.95f);
                aju.a(string2, 2.0f, 0.57f);
            }
            if (((Boolean)this.apD.wD()).booleanValue()) {
                for (int i2 = 0; i2 <= 8; ++i2) {
                    KillEffect.aER.bgN.a(this.jE, as.dxw);
                }
                aju.cn("item.fireCharge.use");
            }
            if (((Boolean)this.apC.wD()).booleanValue()) {
                double d2 = this.jE.gX;
                double d3 = this.jE.gX + (double)this.jE.height + 0.4;
                double d4 = 0.4;
                for (int i3 = 0; i3 < 100; ++i3) {
                    for (double d5 = d2; d5 <= d3; d5 += d4) {
                        KillEffect.aER.bgF.a(as.dxH, this.jE.gW, d5, this.jE.gY, 0.0, 0.0, 0.0, Block.a(Blocks.cOp.xM()));
                    }
                }
                for (double d6 = d2; d6 <= d3; d6 += d4) {
                    aju.cn("dig.stone");
                }
            }
            this.jE = null;
        }
    };
    @EventLink
    public final Listener<AttackEvent> apF = attackEvent -> {
        r r2 = attackEvent.dc();
        if (r2 instanceof r) {
            this.jE = r2;
        }
    };
}

