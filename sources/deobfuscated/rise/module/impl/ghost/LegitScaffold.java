/*
 * Decompiled with CFR 0.152.
 */
package rise.module.impl.ghost;

import hackclient.rise.aik;
import hackclient.rise.akj;
import hackclient.rise.bu;
import net.minecraft.block.BlockAir;
import net.minecraft.item.af;
import rise.event.EventLink;
import rise.event.Listener;
import rise.event.impl.MoveInputEvent;
import rise.event.impl.PreMotionEvent;
import rise.module.Category;
import rise.module.Module;
import rise.module.ModuleInfo;
import rise.value.BooleanValue;
import rise.value.NumberValue;

@ModuleInfo(aliases={"module.ghost.legitscaffold.name", "Eagle"}, description="module.ghost.eagle.description", category=Category.GHOST)
public class LegitScaffold
extends Module {
    private final akj AU = new akj("Length", this, (Number)1, (Number)1, (Number)1, (Number)4, (Number)1);
    private final NumberValue AV = new NumberValue("Sneak speed multiplier", this, (Number)0.3, (Number)0.2, (Number)1, (Number)0.05);
    private final BooleanValue AW = new BooleanValue("Only on ground", (Module)this, (Boolean)false);
    private final BooleanValue AX = new BooleanValue("Only when holding blocks", (Module)this, (Boolean)false);
    private final BooleanValue AY = new BooleanValue("Only when moving backwards", (Module)this, (Boolean)false);
    private final BooleanValue AZ = new BooleanValue("Only on Sneak", (Module)this, (Boolean)true);
    private boolean Ba;
    private int Bb;
    private int Bc;
    @EventLink
    public final Listener<PreMotionEvent> Bd = preMotionEvent -> {
        if (LegitScaffold.aER.bgK.Vk() != null && !(LegitScaffold.aER.bgK.Vk().bP() instanceof af) && ((Boolean)this.AX.wD()).booleanValue()) {
            if (this.Ba) {
                this.Ba = false;
            }
            return;
        }
        if (!(!LegitScaffold.aER.bgK.aO && ((Boolean)this.AW.wD()).booleanValue() || !(aik.p(0.0, -1.0, 0.0) instanceof BlockAir) || LegitScaffold.aER.aIY.chm.Re() && ((Boolean)this.AY.wD()).booleanValue())) {
            if (!this.Ba) {
                this.Ba = true;
            }
        } else if (this.Ba) {
            this.Ba = false;
        }
        if (this.Ba) {
            this.Bc = this.AU.wK().intValue();
            LegitScaffold.aER.aIY.chs.ay(false);
        }
        this.Bb = this.Ba ? ++this.Bb : 0;
    };
    @EventLink
    public final Listener<MoveInputEvent> Be = moveInputEvent -> {
        this.d(bu.class);
        if (bu.bO() != null) {
            this.d(bu.class);
            if (bu.bO().bP() instanceof af) {
                moveInputEvent.setSneak(this.Bc > 0 && (LegitScaffold.aER.aIY.chr.Re() || (Boolean)this.AZ.wD() == false) || LegitScaffold.aER.aIY.chr.Re() && (Boolean)this.AZ.wD() == false);
            }
        }
        --this.Bc;
        if (this.Bc > 0 && this.Bb <= 2) {
            moveInputEvent.setSneakSlowDownMultiplier(((Number)this.AV.wD()).doubleValue());
        }
    };

    @Override
    public void onDisable() {
        if (this.Ba) {
            this.Ba = false;
        }
    }
}

