/*
 * Decompiled with CFR 0.152.
 */
package rise.module.impl.movement.longjump;

import hackclient.rise.afl;
import net.minecraft.network.aj;
import net.minecraft.network.play.server.i;
import rise.event.EventLink;
import rise.event.Listener;
import rise.event.impl.PacketReceiveEvent;
import rise.event.impl.PreMotionEvent;
import rise.module.Mode;
import rise.module.impl.movement.LongJump;

public final class VulcanMode
extends Mode<LongJump> {
    private boolean LV;
    private int hV;
    @EventLink
    public final Listener<PreMotionEvent> LW = preMotionEvent -> {
        ++this.hV;
        if (!(VulcanMode.aER.bgK.csf > 0.0f) || this.hV % 2 != 0 || (double)VulcanMode.aER.bgK.csf < 2.2) {
            // empty if block
        }
        switch (this.hV) {
            case 1: {
                VulcanMode.aER.bgK.jump();
                break;
            }
            case 2: {
                break;
            }
            case 3: {
                break;
            }
            case 4: {
                VulcanMode.aER.bgK.ud *= 1.3;
                VulcanMode.aER.bgK.uf *= 1.3;
                break;
            }
            case 5: {
                VulcanMode.aER.bgK.ud *= 1.05;
                VulcanMode.aER.bgK.uf *= 1.05;
                break;
            }
            case 10: {
                VulcanMode.aER.bgK.ue = 2.0;
                break;
            }
            case 11: {
                VulcanMode.aER.bgK.ue += 0.04;
                break;
            }
            case 40: {
                afl.b(VulcanMode.aER.bgK.ue, new Object[0]);
                VulcanMode.aER.bgK.ue = -0.09800000190735147;
                break;
            }
            case 62: {
                afl.b(VulcanMode.aER.bgK.ue, new Object[0]);
                preMotionEvent.setOnGround(true);
                VulcanMode.aER.bgK.aO = true;
                VulcanMode.aER.bgK.jump();
                break;
            }
            case 74: {
                break;
            }
        }
        if (VulcanMode.aER.bgK.ue < -1.53 && VulcanMode.aER.bgK.ue > -1.54) {
            preMotionEvent.setOnGround(true);
            VulcanMode.aER.bgK.aO = true;
            VulcanMode.aER.bgK.jump();
        }
        if (VulcanMode.aER.bgK.ue < -0.51 && VulcanMode.aER.bgK.ue > -0.52) {
            afl.b("if near void and the ghost block handler is on this may flag", new Object[0]);
            VulcanMode.aER.bgK.ue = 2.0;
        }
    };
    @EventLink
    public final Listener<PacketReceiveEvent> LX = packetReceiveEvent -> {
        aj<?> aj2 = packetReceiveEvent.dq();
        if (aj2 instanceof i && this.LV) {
            packetReceiveEvent.cF();
            this.LV = false;
        }
    };

    public VulcanMode(String string, LongJump longJump) {
        super(string, longJump);
    }

    @Override
    public void onDisable() {
    }

    @Override
    public void onEnable() {
        if (!VulcanMode.aER.bgK.aO) {
            this.toggle();
        }
        this.LV = false;
        this.hV = 0;
    }
}

