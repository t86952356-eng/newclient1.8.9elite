/*
 * Decompiled with CFR 0.152.
 */
package rise.module.impl.movement.longjump;

import hackclient.rise.aii;
import hackclient.rise.fd;
import rise.event.EventLink;
import rise.event.Listener;
import rise.event.impl.StrafeEvent;
import rise.module.Mode;
import rise.module.impl.movement.LongJump;
import rise.value.NumberValue;

public class NCPMode
extends Mode<LongJump> {
    private final NumberValue LF = new NumberValue("Bunny Friction", this, (Number)159, (Number)59, (Number)259, (Number)1);
    private final NumberValue LG = new NumberValue("Ground Speed", this, (Number)0.4, (Number)0.1, (Number)3, (Number)0.1);
    private final NumberValue LH = new NumberValue("Jump Speed", this, (Number)1.4, (Number)0, (Number)3, (Number)0.1);
    private final NumberValue LI = new NumberValue("Glide", this, (Number)0, (Number)0, (Number)3, (Number)0.5);
    private final NumberValue LJ = new NumberValue("Timer", this, (Number)1, (Number)0.1, (Number)10, (Number)0.1);
    private boolean LK;
    private double LL;
    @EventLink
    public final Listener<StrafeEvent> LM = strafeEvent -> {
        double d2 = aii.getAllowedHorizontalDistance();
        if (aii.isMoving()) {
            switch (NCPMode.aER.bgK.tR) {
                case 0: {
                    NCPMode.aER.bgK.ue = aii.jumpMotion() + 0.017;
                    this.LL = ((Number)this.LG.wD()).doubleValue();
                    break;
                }
                case 1: {
                    this.LL = ((Number)this.LH.wD()).doubleValue();
                    break;
                }
                default: {
                    this.LL -= this.LL / (double)159.9f;
                }
            }
            NCPMode.aER.bgC.dAp = ((Number)this.LJ.wD()).floatValue();
            this.LK = false;
        } else if (!this.LK) {
            this.LL = aii.getAllowedHorizontalDistance();
            NCPMode.aER.bgC.dAp = 1.0f;
            this.LK = true;
        }
        if (NCPMode.aER.bgK.csf > 0.0f) {
            NCPMode.aER.bgK.ue += (double)(((Number)this.LI.wD()).floatValue() / 100.0f);
        }
        if (NCPMode.aER.bgK.crR) {
            this.LL = aii.getAllowedHorizontalDistance();
        }
        strafeEvent.setSpeed(Math.max(this.LL, d2), Math.random() / 2000.0);
    };
    @EventLink
    public final Listener<fd> LN = fd2 -> {
        this.LL = 0.0;
    };

    public NCPMode(String string, LongJump longJump) {
        super(string, longJump);
    }

    @Override
    public void onDisable() {
        aii.stop();
        this.LL = 0.0;
    }
}

