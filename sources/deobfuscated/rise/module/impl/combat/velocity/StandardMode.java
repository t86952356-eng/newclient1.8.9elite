/*
 * Decompiled with CFR 0.152.
 */
package rise.module.impl.combat.velocity;

import hackclient.rise.fd;
import net.minecraft.network.aj;
import net.minecraft.network.play.server.ar;
import net.minecraft.network.play.server.t;
import rise.event.EventLink;
import rise.event.Listener;
import rise.event.impl.PacketReceiveEvent;
import rise.event.impl.PreMotionEvent;
import rise.module.Mode;
import rise.module.impl.combat.Velocity;
import rise.module.impl.movement.Speed;
import rise.value.BooleanValue;
import rise.value.NumberValue;

public final class StandardMode
extends Mode<Velocity> {
    public Boolean uQ = false;
    private Integer uR = 0;
    private Speed uS = null;
    private String fH = null;
    private int sG;
    private final NumberValue uT = new NumberValue("Horizontal", this, (Number)0, (Number)0, (Number)100, (Number)1);
    private final NumberValue uU = new NumberValue("Vertical", this, (Number)0, (Number)0, (Number)100, (Number)1);
    private final BooleanValue uV = new BooleanValue("Explosion Ignore", (Mode<?>)this, (Boolean)false);
    @EventLink(cH=0)
    public final Listener<PacketReceiveEvent> uW = packetReceiveEvent -> {
        if (((Boolean)((Velocity)this.wy()).qQ.wD()).booleanValue() && !StandardMode.aER.bgK.cup || packetReceiveEvent.isCancelled()) {
            return;
        }
        aj<?> aj2 = packetReceiveEvent.dq();
        double d2 = ((Number)this.uT.wD()).doubleValue();
        double d3 = ((Number)this.uU.wD()).doubleValue();
        boolean bl2 = (Boolean)this.uV.wD();
        if (aj2 instanceof t) {
            t t2 = (t)aj2;
            if (t2.getEntityID() == StandardMode.aER.bgK.getEntityId()) {
                if (d2 == 0.0) {
                    if (d3 != 0.0 && !packetReceiveEvent.isCancelled()) {
                        StandardMode.aER.bgK.ue = (double)t2.agO() / 8000.0;
                    }
                    packetReceiveEvent.cF();
                    return;
                }
                t2.dcR = (int)((double)t2.dcR * (d2 / 100.0));
                t2.dcS = (int)((double)t2.dcS * (d3 / 100.0));
                t2.dcT = (int)((double)t2.dcT * (d2 / 100.0));
                packetReceiveEvent.e(t2);
            }
        } else if (aj2 instanceof ar) {
            ar ar2 = (ar)aj2;
            if (bl2) {
                packetReceiveEvent.cF();
                return;
            }
            ar2.x *= d2 / 100.0;
            ar2.y *= d3 / 100.0;
            ar2.z *= d2 / 100.0;
            packetReceiveEvent.e(ar2);
        }
    };
    @EventLink
    public final Listener<PreMotionEvent> uX = preMotionEvent -> {
        if (this.uS == null) {
            this.uS = this.e(Speed.class);
        }
    };
    @EventLink
    public final Listener<fd> uY = fd2 -> {
        if (fd2.getPosY() < StandardMode.aER.bgK.gX - 2.0) {
            // empty if block
        }
    };

    @Override
    public void onEnable() {
        this.uR = 0;
        this.a(false);
    }

    public StandardMode(String string, Velocity velocity) {
        super(string, velocity);
    }

    public Boolean gB() {
        return this.uQ;
    }

    public void a(Boolean bl2) {
        this.uQ = bl2;
    }
}

