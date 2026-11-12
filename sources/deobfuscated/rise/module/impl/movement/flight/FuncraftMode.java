/*
 * Decompiled with CFR 0.152.
 */
package rise.module.impl.movement.flight;

import hackclient.rise.ahn;
import hackclient.rise.aii;
import net.minecraft.network.play.client.f;
import rise.event.EventLink;
import rise.event.Listener;
import rise.event.impl.MoveEvent;
import rise.event.impl.PreMotionEvent;
import rise.module.Mode;
import rise.module.impl.movement.Flight;
import rise.value.BooleanValue;
import rise.value.NumberValue;

public final class FuncraftMode
extends Mode<Flight> {
    private final NumberValue FV = new NumberValue("Speed", this, (Number)1.2, (Number)0.8, (Number)2, (Number)0.05);
    private final BooleanValue FW = new BooleanValue("Vanilla Kick Bypass", (Mode<?>)this, (Boolean)true);
    private double xv;
    private int FX;
    private int hV;
    @EventLink
    private final Listener<PreMotionEvent> FY = preMotionEvent -> preMotionEvent.setOnGround(true);
    @EventLink(cH=4)
    private final Listener<MoveEvent> FZ = moveEvent -> {
        if (!aii.isMoving() || FuncraftMode.aER.bgK.crR) {
            this.FX = -1;
        }
        if (((Boolean)this.FW.wD()).booleanValue() && this.hV > 125) {
            this.FX = -1;
            this.hV = 0;
            ahn.n(new f(FuncraftMode.aER.bgK.gW + 5.0, FuncraftMode.aER.bgK.gX + 1.0, FuncraftMode.aER.bgK.gY + 5.0, true));
            return;
        }
        switch (this.FX) {
            case -1: {
                FuncraftMode.aER.bgK.ue = 0.0;
                moveEvent.setPosY(-1.0E-5);
                return;
            }
            case 0: {
                this.xv = 0.3;
                break;
            }
            case 1: {
                if (!FuncraftMode.aER.bgK.aO) break;
                FuncraftMode.aER.bgK.ue = 0.3999;
                moveEvent.setPosY(0.3999);
                this.xv *= 2.14;
                break;
            }
            case 2: {
                this.xv = ((Number)this.FV.wD()).doubleValue();
                break;
            }
            default: {
                this.xv -= this.xv / 109.0;
                FuncraftMode.aER.bgK.ue = 0.0;
                moveEvent.setPosY(-1.0E-5);
            }
        }
        FuncraftMode.aER.bgK.cuI = 0.0f;
        aii.a(moveEvent, Math.max(this.xv, aii.getAllowedHorizontalDistance()));
        ++this.FX;
    };

    public FuncraftMode(String string, Flight flight) {
        super(string, flight);
    }

    @Override
    public void onEnable() {
        this.xv = 0.0;
        this.FX = FuncraftMode.aER.bgK.aO ? 0 : -1;
        this.hV = 0;
    }
}

