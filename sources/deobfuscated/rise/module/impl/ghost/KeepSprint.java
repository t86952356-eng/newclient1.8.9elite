/*
 * Decompiled with CFR 0.152.
 */
package rise.module.impl.ghost;

import rise.event.EventLink;
import rise.event.Listener;
import rise.event.impl.HitSlowDownEvent;
import rise.module.Category;
import rise.module.Module;
import rise.module.ModuleInfo;
import rise.value.BooleanValue;
import rise.value.NumberValue;

@ModuleInfo(aliases={"module.ghost.keepsprint.name"}, description="module.ghost.keepsprint.description", category=Category.GHOST)
public class KeepSprint
extends Module {
    private final NumberValue BE = new NumberValue("Hit Slow Down During Velocity", this, (Number)0.6, (Number)0, (Number)1, (Number)0.05);
    private final NumberValue BF = new NumberValue("Hit Slow Down Normal", this, (Number)0.6, (Number)0, (Number)1, (Number)0.05);
    private final NumberValue BG = new NumberValue("Buffer Decrease", this, (Number)1, (Number)0.1, (Number)10, (Number)0.1, () -> (Boolean)this.BK.wD() == false);
    private final NumberValue BH = new NumberValue("Max Buffer", this, (Number)5, (Number)1, (Number)10, (Number)1, () -> (Boolean)this.BK.wD() == false);
    private final BooleanValue BI = new BooleanValue("Velocity Hit Sprint", (Module)this, (Boolean)false);
    private final BooleanValue BJ = new BooleanValue("Normal Hit Sprint", (Module)this, (Boolean)false);
    private final BooleanValue BK = new BooleanValue("Buffer Abuse", (Module)this, (Boolean)false);
    private final BooleanValue BL = new BooleanValue("Only In Air", (Module)this, (Boolean)false);
    private boolean BM;
    private double BN;
    @EventLink
    public final Listener<HitSlowDownEvent> BO = hitSlowDownEvent -> {
        if (KeepSprint.aER.bgK.aO && ((Boolean)this.BL.wD()).booleanValue()) {
            return;
        }
        if (((Boolean)this.BK.wD()).booleanValue()) {
            if (this.BN < (double)((Number)this.BH.wD()).intValue() && !this.BM) {
                this.BN += 1.0;
            } else {
                if (this.BN > 0.0) {
                    this.BN = Math.max(0.0, this.BN - ((Number)this.BG.wD()).doubleValue());
                    this.BM = true;
                    return;
                }
                this.BM = false;
            }
        } else {
            this.BN = 0.0;
        }
        if (KeepSprint.aER.bgK.cus > 0) {
            hitSlowDownEvent.setSlowDown(((Number)this.BE.wD()).doubleValue());
            hitSlowDownEvent.setSprint((Boolean)this.BI.wD());
        } else {
            hitSlowDownEvent.setSlowDown(((Number)this.BF.wD()).doubleValue());
            hitSlowDownEvent.setSprint((Boolean)this.BJ.wD());
        }
    };
}

