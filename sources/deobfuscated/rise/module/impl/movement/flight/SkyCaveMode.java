/*
 * Decompiled with CFR 0.152.
 */
package rise.module.impl.movement.flight;

import hackclient.rise.aii;
import rise.event.EventLink;
import rise.event.Listener;
import rise.event.impl.MoveEvent;
import rise.module.Mode;
import rise.module.impl.movement.Flight;
import rise.value.NumberValue;

public final class SkyCaveMode
extends Mode<Flight> {
    private final NumberValue HR = new NumberValue("Speed", this, (Number)1.2, (Number)0.8, (Number)10, (Number)0.05);
    private final NumberValue HS = new NumberValue("Damage Speed", this, (Number)5, (Number)0.8, (Number)10, (Number)0.05);
    private double xv;
    private int FX;
    @EventLink(cH=4)
    private final Listener<MoveEvent> HT = moveEvent -> {
        if (!aii.isMoving() || SkyCaveMode.aER.bgK.crR) {
            this.FX = -1;
        }
        if (SkyCaveMode.aER.bgK.ae == 1) {
            this.xv = ((Number)this.HS.wD()).doubleValue();
        }
        switch (this.FX) {
            case -1: {
                SkyCaveMode.aER.bgK.ue = 0.0;
                moveEvent.setPosY(-1.0E-5);
                break;
            }
            case 0: {
                this.xv = 0.3;
                break;
            }
            case 1: {
                if (!SkyCaveMode.aER.bgK.aO) break;
                SkyCaveMode.aER.bgK.ue = 0.3999;
                moveEvent.setPosY(0.3999);
                this.xv *= 2.14;
                break;
            }
            case 2: {
                this.xv = ((Number)this.HR.wD()).doubleValue();
                break;
            }
            default: {
                this.xv -= this.xv / 109.0;
                SkyCaveMode.aER.bgK.ue = 0.0;
                moveEvent.setPosY(-1.0E-5);
            }
        }
        if (SkyCaveMode.aER.bgK.aRg % 20 == 0) {
            moveEvent.setPosY(-0.035);
        }
        if (this.FX != -1) {
            SkyCaveMode.aER.bgK.cuI = 0.0f;
            aii.a(moveEvent, Math.max(this.xv, aii.getAllowedHorizontalDistance()));
            ++this.FX;
        }
    };

    public SkyCaveMode(String string, Flight flight) {
        super(string, flight);
    }

    @Override
    public void onEnable() {
        this.xv = 0.0;
        this.FX = SkyCaveMode.aER.bgK.aO ? 0 : -1;
    }
}

