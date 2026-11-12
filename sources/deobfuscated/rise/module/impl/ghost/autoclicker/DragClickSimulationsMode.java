/*
 * Decompiled with CFR 0.152.
 */
package rise.module.impl.ghost.autoclicker;

import hackclient.rise.aik;
import hackclient.rise.akj;
import rise.event.EventLink;
import rise.event.Listener;
import rise.event.impl.TickEvent;
import rise.module.Mode;
import rise.module.impl.ghost.AutoClicker;

public class DragClickSimulationsMode
extends Mode<AutoClicker> {
    private final akj Cf = new akj("Drag Click Length", this, (Number)17, (Number)18, (Number)1, (Number)50, (Number)1);
    private final akj Cg = new akj("Delay Between Dragging", this, (Number)6, (Number)6, (Number)1, (Number)20, (Number)1);
    private int Ch;
    private int Ci;
    @EventLink
    public final Listener<TickEvent> Cj = tickEvent -> {
        if (DragClickSimulationsMode.aER.aIY.chw.Re()) {
            if (this.Ch < 0) {
                --this.Ci;
                if (this.Ci < 0) {
                    this.Ci = this.Cg.wK().intValue();
                    this.Ch = this.Cf.wK().intValue();
                }
            } else if (Math.random() < 0.95) {
                --this.Ch;
                aik.h(0, true);
            }
        }
    };

    public DragClickSimulationsMode(String string, AutoClicker autoClicker) {
        super(string, autoClicker);
    }
}

