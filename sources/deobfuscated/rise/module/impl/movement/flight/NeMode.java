/*
 * Decompiled with CFR 0.152.
 */
package rise.module.impl.movement.flight;

import hackclient.rise.ahn;
import hackclient.rise.aii;
import hackclient.rise.aks;
import net.minecraft.network.aj;
import net.minecraft.network.play.client.e;
import net.minecraft.network.play.client.f;
import net.minecraft.network.play.client.g;
import net.minecraft.network.play.client.h;
import net.minecraft.network.play.server.i;
import net.minecraft.network.play.server.t;
import rise.event.EventLink;
import rise.event.Listener;
import rise.event.impl.PacketReceiveEvent;
import rise.event.impl.PacketSendEvent;
import rise.event.impl.PreMotionEvent;
import rise.event.impl.PreUpdateEvent;
import rise.module.Mode;
import rise.module.impl.movement.Flight;
import rise.value.BooleanValue;
import rise.value.ModeValue;
import rise.value.NumberValue;

public class NeMode
extends Mode<Flight> {
    private final ModeValue GC = new ModeValue("Lag Mode", this).a(new Mode[]{new aks("Packet")}).a(new Mode[]{new aks("VoidTP")}).a(new Mode[]{new aks("VoidTP2")}).a(new Mode[]{new aks("Packet2")}).a(new Mode[]{new aks("Packet3")}).co("Packet");
    private final ModeValue GD = new ModeValue("Jump Mode", this).a(new Mode[]{new aks("SlowJump")}).a(new Mode[]{new aks("Jump")}).co("SlowJump");
    private final BooleanValue GE = new BooleanValue("Motion Modify", (Mode<?>)this, (Boolean)false);
    private final NumberValue GF = new NumberValue("Motion", this, (Number)0.27, (Number)0.12, (Number)0.4, (Number)0.01, () -> (Boolean)this.GE.wD() == false);
    private final NumberValue GG = new NumberValue("Offset Size", this, (Number)10.0, (Number)10.0, (Number)1024.0, (Number)1.0);
    private final BooleanValue GH = new BooleanValue("Spoof Ground", (Mode<?>)this, (Boolean)false);
    private final NumberValue GI = new NumberValue("Timer", this, (Number)0.1, (Number)0.05, (Number)1.0, (Number)0.01);
    private final NumberValue GJ = new NumberValue("Min Flags", this, (Number)1.0, (Number)1.0, (Number)5.0, (Number)1.0);
    private final BooleanValue GK = new BooleanValue("C06 To C04", (Mode<?>)this, (Boolean)false);
    private final BooleanValue GL = new BooleanValue("Flat Test", (Mode<?>)this, (Boolean)false);
    private final NumberValue GM = new NumberValue("Flat Ticks", this, (Number)10.0, (Number)8.0, (Number)12.0, (Number)1.0);
    private final BooleanValue GN = new BooleanValue("Stuck When Not Flagged", (Mode<?>)this, (Boolean)false);
    private final BooleanValue GO = new BooleanValue("Only Send Once", (Mode<?>)this, (Boolean)false);
    private boolean GP;
    private boolean GQ;
    private int GR;
    private int GS;
    private int hV;
    private double x;
    private double y;
    private double z;
    private double ud;
    private double ue;
    private double uf;
    private boolean GT;
    private boolean GU;
    @EventLink
    public final Listener<PreUpdateEvent> GV = preUpdateEvent -> {
        if (this.GS == 0 && this.hV >= 0) {
            if (NeMode.aER.bgK.aO) {
                NeMode.aER.bgK.jump();
            }
            if (NeMode.aER.bgK.csf >= 0.3f && !this.GT) {
                this.x = NeMode.aER.bgK.gW;
                this.y = NeMode.aER.bgK.gX;
                this.z = NeMode.aER.bgK.gY;
                this.ud = NeMode.aER.bgK.ud;
                this.ue = NeMode.aER.bgK.ue;
                this.uf = NeMode.aER.bgK.uf;
                this.GT = true;
            }
            if (this.hV == 7) {
                NeMode.aER.bgK.ud = this.ud;
                NeMode.aER.bgK.ue = this.ue;
                NeMode.aER.bgK.uf = this.uf;
                this.hV = -4;
                this.GT = false;
            }
            if (this.hV != -4 && this.GT) {
                NeMode.aER.bgK.ud = 0.0;
                NeMode.aER.bgK.ue = 0.0;
                NeMode.aER.bgK.uf = 0.0;
                NeMode.aER.bgK.setPosition(this.x, this.y, this.z);
                ++this.hV;
            }
        }
        if (this.GS == 1) {
            if (this.GP) {
                if (((Boolean)this.GE.wD()).booleanValue()) {
                    aii.strafe(((Number)this.GF.wD()).doubleValue());
                }
                switch (((Mode)this.GD.wD()).getName()) {
                    case "SlowJump": {
                        NeMode.aER.bgK.ue = 0.42;
                        break;
                    }
                    case "Jump": {
                        NeMode.aER.bgK.jump();
                    }
                }
                NeMode.aER.bgK.tR = 0;
                NeMode.aER.bgC.dAp = 1.0f;
                this.GP = false;
                this.GU = false;
            } else if (this.GQ) {
                if (aii.isMoving()) {
                    if (NeMode.aER.bgK.ue <= 0.05 && !NeMode.aER.aIY.chq.Re() || NeMode.aER.bgK.tR >= ((Number)this.GM.wD()).intValue()) {
                        this.GQ = false;
                        NeMode.aER.bgC.dAp = 0.3f;
                    }
                } else if (NeMode.aER.bgK.ue < -0.1) {
                    this.GQ = false;
                    NeMode.aER.bgC.dAp = 0.1f;
                }
            }
        }
    };
    @EventLink
    public final Listener<PreMotionEvent> GW = preMotionEvent -> {
        if (this.GS == 1 && !this.GQ) {
            if (((Boolean)this.GN.wD()).booleanValue()) {
                NeMode.aER.bgK.setPosition(NeMode.aER.bgK.csh, NeMode.aER.bgK.csi, NeMode.aER.bgK.csj);
            }
            NeMode.aER.bgC.dAp = 1.0f;
            if (!((Boolean)this.GO.wD()).booleanValue() || !this.GU) {
                NeMode.aER.bgC.dAp = ((Number)this.GI.wD()).floatValue();
                double d2 = preMotionEvent.getPosX() + ((Number)this.GG.wD()).doubleValue();
                double d3 = preMotionEvent.getPosZ() + ((Number)this.GG.wD()).doubleValue();
                switch (((Mode)this.GC.wD()).getName()) {
                    case "Packet": {
                        double d4 = preMotionEvent.getPosY();
                        ahn.n(new f(d2, d4, d3, (Boolean)this.GH.wD()));
                        break;
                    }
                    case "VoidTP": {
                        preMotionEvent.setPosX(d2);
                        preMotionEvent.setPosZ(d3);
                        preMotionEvent.setPosY(preMotionEvent.getPosY() - ((Number)this.GG.wD()).doubleValue());
                        break;
                    }
                    case "VoidTP2": {
                        preMotionEvent.setPosX(d2);
                        preMotionEvent.setPosZ(d3);
                        preMotionEvent.setPosY(preMotionEvent.getPosY() + ((Number)this.GG.wD()).doubleValue());
                        break;
                    }
                    case "Packet2": {
                        double d5 = preMotionEvent.getPosY() - ((Number)this.GG.wD()).doubleValue();
                        ahn.n(new f(d2, d5, d3, (Boolean)this.GH.wD()));
                        break;
                    }
                    case "Packet3": {
                        double d6 = preMotionEvent.getPosY() + ((Number)this.GG.wD()).doubleValue();
                        ahn.n(new f(d2, d6, d3, (Boolean)this.GH.wD()));
                    }
                }
                this.GU = true;
            }
        }
    };
    @EventLink
    public final Listener<PacketSendEvent> GX = packetSendEvent -> {
        aj<?> aj2 = packetSendEvent.dq();
        if (this.GT && this.GS != 1 && aj2 instanceof e) {
            packetSendEvent.cF();
        }
        if (((Boolean)this.GK.wD()).booleanValue() && this.GS == 1) {
            if (aj2 instanceof h) {
                h h2 = (h)aj2;
                packetSendEvent.cF();
                ahn.n(new f(h2.afS(), h2.afT(), h2.afU(), h2.isOnGround()));
            }
            if (aj2 instanceof g) {
                packetSendEvent.cF();
            }
        }
    };
    @EventLink
    public final Listener<PacketReceiveEvent> GY = packetReceiveEvent -> {
        t t2;
        aj<?> aj2 = packetReceiveEvent.dq();
        if (aj2 instanceof i) {
            if (this.GS == 1) {
                ++this.GR;
                if (this.GR >= ((Number)this.GJ.wD()).intValue() && !this.GP && !this.GQ) {
                    this.GP = true;
                    this.GQ = true;
                    this.GR = 0;
                }
            } else {
                this.GS = 1;
            }
        }
        if (aj2 instanceof t && (t2 = (t)aj2).getEntityID() == NeMode.aER.bgK.getEntityId()) {
            packetReceiveEvent.cF();
        }
    };

    public NeMode(String string, Flight flight) {
        super(string, flight);
    }

    @Override
    public void onEnable() {
        this.GP = false;
        this.GQ = false;
        this.GR = 0;
        this.GS = (Boolean)this.GL.wD() != false && aii.isMoving() ? 0 : 1;
        this.hV = 0;
        this.GT = false;
        this.GU = false;
    }

    @Override
    public void onDisable() {
        NeMode.aER.bgC.dAp = 1.0f;
    }
}

