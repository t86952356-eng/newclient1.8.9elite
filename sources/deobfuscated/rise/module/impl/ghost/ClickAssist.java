/*
 * Decompiled with CFR 0.152.
 */
package rise.module.impl.ghost;

import hackclient.rise.bb;
import rise.event.EventLink;
import rise.event.Listener;
import rise.event.impl.PreMotionEvent;
import rise.module.Category;
import rise.module.Module;
import rise.module.ModuleInfo;
import rise.value.NumberValue;

@ModuleInfo(aliases={"module.ghost.clickassist.name"}, description="module.ghost.clickassist.description", category=Category.GHOST)
public class ClickAssist
extends Module {
    public final NumberValue AN = new NumberValue("Extra Left Clicks", this, (Number)1, (Number)0, (Number)3, (Number)1);
    public final NumberValue AO = new NumberValue("Extra Right Clicks", this, (Number)1, (Number)0, (Number)3, (Number)1);
    public int AP;
    public int AQ;
    private boolean AR;
    private boolean AS;
    @EventLink
    public final Listener<PreMotionEvent> AT = preMotionEvent -> {
        if (ClickAssist.aER.aIY.chw.Re()) {
            if (!this.AR) {
                this.AP = ((Number)this.AN.wD()).intValue();
            }
            this.AR = true;
        } else {
            this.AR = false;
        }
        if (ClickAssist.aER.aIY.chu.Re()) {
            if (!this.AS) {
                this.AQ = ((Number)this.AO.wD()).intValue();
            }
            this.AS = true;
        } else {
            this.AS = false;
        }
        if (this.AP > 0 && Math.random() > 0.2) {
            --this.AP;
            if (!ClickAssist.aER.bgK.isUsingItem() && !bb.aW()) {
                aER.AN();
            }
        } else if (this.AQ > 0 && Math.random() > 0.2) {
            --this.AQ;
            if (!ClickAssist.aER.bgK.isUsingItem() && !bb.aW()) {
                aER.AO();
            }
        }
    };
}

