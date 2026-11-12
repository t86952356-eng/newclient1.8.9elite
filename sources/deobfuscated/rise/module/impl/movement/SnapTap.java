/*
 * Decompiled with CFR 0.152.
 */
package rise.module.impl.movement;

import rise.event.EventLink;
import rise.event.Listener;
import rise.event.impl.MoveInputEvent;
import rise.module.Category;
import rise.module.Module;
import rise.module.ModuleInfo;

@ModuleInfo(aliases={"module.movement.snaptap.name", "Null Move", "SOCD", "Null Binds"}, description="module.movement.snaptap.description", category=Category.MOVEMENT)
public class SnapTap
extends Module {
    private boolean DW;
    private boolean DX;
    private boolean DY;
    private boolean DZ;
    private long Ea;
    private long Eb;
    private long Ec;
    private long Ed;
    @EventLink
    public final Listener<MoveInputEvent> Ee = moveInputEvent -> {
        boolean bl2 = SnapTap.aER.aIY.chm.Re();
        boolean bl3 = SnapTap.aER.aIY.cho.Re();
        boolean bl4 = SnapTap.aER.aIY.chn.Re();
        boolean bl5 = SnapTap.aER.aIY.chp.Re();
        long l2 = System.currentTimeMillis();
        if (bl2 && !this.DW) {
            this.Ea = l2;
        }
        if (bl3 && !this.DX) {
            this.Eb = l2;
        }
        if (bl4 && !this.DY) {
            this.Ec = l2;
        }
        if (bl5 && !this.DZ) {
            this.Ed = l2;
        }
        if (bl2 && bl3) {
            if (this.Ea != this.Eb) {
                moveInputEvent.setForward(this.Ea > this.Eb ? 1.0f : -1.0f);
            } else {
                moveInputEvent.setForward(0.0f);
            }
        } else if (bl2) {
            moveInputEvent.setForward(1.0f);
        } else if (bl3) {
            moveInputEvent.setForward(-1.0f);
        }
        if (bl4 && bl5) {
            if (this.Ec != this.Ed) {
                moveInputEvent.setStrafe(this.Ec > this.Ed ? 1.0f : -1.0f);
            } else {
                moveInputEvent.setStrafe(0.0f);
            }
        } else if (bl4) {
            moveInputEvent.setStrafe(1.0f);
        } else if (bl5) {
            moveInputEvent.setStrafe(-1.0f);
        }
        this.DW = bl2;
        this.DX = bl3;
        this.DY = bl4;
        this.DZ = bl5;
    };

    @Override
    public void onDisable() {
        this.DW = false;
        this.DX = false;
        this.DY = false;
        this.DZ = false;
        this.Ea = 0L;
        this.Eb = 0L;
        this.Ec = 0L;
        this.Ed = 0L;
    }
}

