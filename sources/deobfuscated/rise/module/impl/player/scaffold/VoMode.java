/*
 * Decompiled with CFR 0.152.
 */
package rise.module.impl.player.scaffold;

import hackclient.rise.aii;
import rise.event.EventLink;
import rise.event.Listener;
import rise.event.impl.JumpEvent;
import rise.event.impl.KeyboardInputEvent;
import rise.event.impl.PreMotionEvent;
import rise.event.impl.PreUpdateEvent;
import rise.module.Mode;
import rise.module.impl.player.Scaffold;

public class VoMode
extends Mode<Scaffold> {
    private boolean El;
    @EventLink(cH=3)
    private final Listener<PreUpdateEvent> akq = preUpdateEvent -> {
        if (VoMode.aER.bgK.aO && !VoMode.aER.aIY.chq.Re()) {
            VoMode.aER.bgC.dAp = 1.0029f;
            aii.preventDiagonalSpeed();
            VoMode.aER.bgK.uf *= 0.998;
            VoMode.aER.bgK.ud *= 0.998;
        }
        if (VoMode.aER.aIY.chq.Rg() && VoMode.aER.bgK.aO) {
            aii.stop();
            this.El = false;
        }
    };
    @EventLink(cH=3)
    private final Listener<PreMotionEvent> akr = preMotionEvent -> {
        if (VoMode.aER.bgK.aO) {
            preMotionEvent.setPosY(preMotionEvent.getPosY() + 1.0E-13);
        }
        if (VoMode.aER.bgK.aO && !this.El && !VoMode.aER.aIY.chq.Re()) {
            aii.stop();
            preMotionEvent.setPosY(preMotionEvent.getPosY() + 1.0E-13);
            this.El = true;
        }
    };
    @EventLink
    public final Listener<JumpEvent> aks = jumpEvent -> jumpEvent.setJumpMotion(0.42f);
    @EventLink(cH=4)
    public final Listener<KeyboardInputEvent> akt = keyboardInputEvent -> {
        if (keyboardInputEvent.cQ() != null || keyboardInputEvent.isCancelled()) {
            return;
        }
        if (keyboardInputEvent.cO() == 57) {
            keyboardInputEvent.cF();
        }
    };

    public VoMode(String string, Scaffold scaffold) {
        super(string, scaffold);
    }

    @Override
    public void onEnable() {
        this.El = true;
        if (!VoMode.aER.aIY.chq.Re()) {
            aii.stop();
        }
        if (VoMode.aER.bgK.crx > 10 && !VoMode.aER.aIY.chq.Re()) {
            VoMode.aER.bgK.ue = 0.42;
        }
    }

    @Override
    public void onDisable() {
        aii.stop();
    }
}

