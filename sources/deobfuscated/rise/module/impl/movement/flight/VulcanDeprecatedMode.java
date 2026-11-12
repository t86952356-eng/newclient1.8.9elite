/*
 * Decompiled with CFR 0.152.
 */
package rise.module.impl.movement.flight;

import hackclient.rise.akd;
import hackclient.rise.es;
import hackclient.rise.fd;
import net.minecraft.block.BlockAir;
import net.minecraft.util.a;
import rise.event.EventLink;
import rise.event.Listener;
import rise.event.impl.KeyboardInputEvent;
import rise.event.impl.StrafeEvent;
import rise.module.Mode;
import rise.module.impl.movement.Flight;
import rise.value.NumberValue;

public class VulcanDeprecatedMode
extends Mode<Flight> {
    private final NumberValue HH = new NumberValue("Speed", this, (Number)1, (Number)1, (Number)10, (Number)0.1);
    private akd HI;
    private boolean HJ;
    private int HK;
    @EventLink
    public final Listener<StrafeEvent> HL = strafeEvent -> {
        if (this.HK > 0 && !this.HJ) {
            --this.HK;
            VulcanDeprecatedMode.aER.bgC.dAp = ((Number)this.HH.wD()).floatValue();
        }
    };
    @EventLink
    public final Listener<es> HM = es2 -> {
        if (es2.df() instanceof BlockAir && !VulcanDeprecatedMode.aER.bgK.isSneaking()) {
            double d2 = es2.dg().wt();
            double d3 = es2.dg().wu();
            double d4 = es2.dg().wx();
            if (d3 < VulcanDeprecatedMode.aER.bgK.gX) {
                es2.a(a.h(-15.0, -1.0, -15.0, 15.0, 1.0, 15.0).ae(d2, d3, d4));
            }
        }
    };
    @EventLink
    public final Listener<fd> HN = fd2 -> {
        akd akd2 = new akd(fd2.getPosX(), fd2.getPosY(), fd2.getPosZ());
        if (this.HI == null) {
            this.HI = akd2;
            fd2.cF();
            this.HK += 2;
        } else if (!this.HI.equals(akd2)) {
            ((Flight)this.wy()).toggle();
        } else {
            fd2.cF();
            this.HK += 2;
        }
    };
    @EventLink
    public final Listener<KeyboardInputEvent> HO = keyboardInputEvent -> {
        if (keyboardInputEvent.cO() == ((Flight)this.wy()).getKey() && !this.HJ) {
            keyboardInputEvent.cF();
            VulcanDeprecatedMode.aER.bgK.jump();
            this.HJ = true;
        }
    };

    public VulcanDeprecatedMode(String string, Flight flight) {
        super(string, flight);
    }

    @Override
    public void onEnable() {
        this.HI = null;
        this.HJ = false;
        this.HK = 0;
    }
}

