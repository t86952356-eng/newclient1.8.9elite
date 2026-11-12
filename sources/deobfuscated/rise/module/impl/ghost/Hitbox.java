/*
 * Decompiled with CFR 0.152.
 */
package rise.module.impl.ghost;

import hackclient.rise.aei;
import hackclient.rise.bs;
import hackclient.rise.ea;
import hackclient.rise.fr;
import rise.event.EventLink;
import rise.event.Listener;
import rise.module.Category;
import rise.module.Module;
import rise.module.ModuleInfo;
import rise.value.BooleanValue;
import rise.value.NumberValue;

@ModuleInfo(aliases={"module.ghost.hitbox.name"}, description="module.ghost.hitbox.description", category=Category.GHOST)
public class Hitbox
extends Module {
    public final NumberValue Bj = new NumberValue("Expand Amount", this, (Number)0, (Number)0, (Number)6, (Number)0.01);
    private final BooleanValue Bk = new BooleanValue("Effect range", (Module)this, (Boolean)true);
    @EventLink
    public final Listener<fr> Bl = fr2 -> {
        fr2.c(((Number)this.Bj.wD()).floatValue());
        if (!((Boolean)this.Bk.wD()).booleanValue()) {
            fr2.i(fr2.dA() - ((Number)this.Bj.wD()).doubleValue());
        }
    };
    @EventLink
    public final Listener<ea> Bm = ea2 -> {
        Hitbox.aER.bhc = aei.c(bs.fk, 4.5);
    };
}

