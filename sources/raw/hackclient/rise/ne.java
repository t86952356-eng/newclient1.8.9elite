/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.ahn;
import hackclient.rise.aii;
import hackclient.rise.akg;
import hackclient.rise.aki;
import hackclient.rise.akp;
import hackclient.rise.akq;
import hackclient.rise.aks;
import hackclient.rise.dk;
import hackclient.rise.dm;
import hackclient.rise.ei;
import hackclient.rise.ej;
import hackclient.rise.fh;
import hackclient.rise.fi;
import hackclient.rise.lw;
import net.minecraft.network.aj;
import net.minecraft.network.play.client.e;
import net.minecraft.network.play.client.f;
import net.minecraft.network.play.client.g;
import net.minecraft.network.play.client.h;
import net.minecraft.network.play.server.i;
import net.minecraft.network.play.server.t;

public class ne
extends akg<lw> {
    private final akp GC = new akp("Lag Mode", this).a(new akg[]{new aks("Packet")}).a(new akg[]{new aks("VoidTP")}).a(new akg[]{new aks("VoidTP2")}).a(new akg[]{new aks("Packet2")}).a(new akg[]{new aks("Packet3")}).co("Packet");
    private final akp GD = new akp("Jump Mode", this).a(new akg[]{new aks("SlowJump")}).a(new akg[]{new aks("Jump")}).co("SlowJump");
    private final aki GE = new aki("Motion Modify", (akg<?>)this, (Boolean)false);
    private final akq GF = new akq("Motion", this, (Number)0.27, (Number)0.12, (Number)0.4, (Number)0.01, () -> (Boolean)this.GE.wD() == false);
    private final akq GG = new akq("Offset Size", this, (Number)10.0, (Number)10.0, (Number)1024.0, (Number)1.0);
    private final aki GH = new aki("Spoof Ground", (akg<?>)this, (Boolean)false);
    private final akq GI = new akq("Timer", this, (Number)0.1, (Number)0.05, (Number)1.0, (Number)0.01);
    private final akq GJ = new akq("Min Flags", this, (Number)1.0, (Number)1.0, (Number)5.0, (Number)1.0);
    private final aki GK = new aki("C06 To C04", (akg<?>)this, (Boolean)false);
    private final aki GL = new aki("Flat Test", (akg<?>)this, (Boolean)false);
    private final akq GM = new akq("Flat Ticks", this, (Number)10.0, (Number)8.0, (Number)12.0, (Number)1.0);
    private final aki GN = new aki("Stuck When Not Flagged", (akg<?>)this, (Boolean)false);
    private final aki GO = new aki("Only Send Once", (akg<?>)this, (Boolean)false);
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
    @dm
    public final dk<ej> GV = ej2 -> {
        if (this.GS == 0 && this.hV >= 0) {
            if (ne.aER.bgK.aO) {
                ne.aER.bgK.jump();
            }
            if (ne.aER.bgK.csf >= 0.3f && !this.GT) {
                this.x = ne.aER.bgK.gW;
                this.y = ne.aER.bgK.gX;
                this.z = ne.aER.bgK.gY;
                this.ud = ne.aER.bgK.ud;
                this.ue = ne.aER.bgK.ue;
                this.uf = ne.aER.bgK.uf;
                this.GT = true;
            }
            if (this.hV == 7) {
                ne.aER.bgK.ud = this.ud;
                ne.aER.bgK.ue = this.ue;
                ne.aER.bgK.uf = this.uf;
                this.hV = -4;
                this.GT = false;
            }
            if (this.hV != -4 && this.GT) {
                ne.aER.bgK.ud = 0.0;
                ne.aER.bgK.ue = 0.0;
                ne.aER.bgK.uf = 0.0;
                ne.aER.bgK.setPosition(this.x, this.y, this.z);
                ++this.hV;
            }
        }
        if (this.GS == 1) {
            if (this.GP) {
                if (((Boolean)this.GE.wD()).booleanValue()) {
                    aii.strafe(((Number)this.GF.wD()).doubleValue());
                }
                switch (((akg)this.GD.wD()).getName()) {
                    case "SlowJump": {
                        ne.aER.bgK.ue = 0.42;
                        break;
                    }
                    case "Jump": {
                        ne.aER.bgK.jump();
                    }
                }
                ne.aER.bgK.tR = 0;
                ne.aER.bgC.dAp = 1.0f;
                this.GP = false;
                this.GU = false;
            } else if (this.GQ) {
                if (aii.isMoving()) {
                    if (ne.aER.bgK.ue <= 0.05 && !ne.aER.aIY.chq.Re() || ne.aER.bgK.tR >= ((Number)this.GM.wD()).intValue()) {
                        this.GQ = false;
                        ne.aER.bgC.dAp = 0.3f;
                    }
                } else if (ne.aER.bgK.ue < -0.1) {
                    this.GQ = false;
                    ne.aER.bgC.dAp = 0.1f;
                }
            }
        }
    };
    @dm
    public final dk<ei> GW = ei2 -> {
        if (this.GS == 1 && !this.GQ) {
            if (((Boolean)this.GN.wD()).booleanValue()) {
                ne.aER.bgK.setPosition(ne.aER.bgK.csh, ne.aER.bgK.csi, ne.aER.bgK.csj);
            }
            ne.aER.bgC.dAp = 1.0f;
            if (!((Boolean)this.GO.wD()).booleanValue() || !this.GU) {
                ne.aER.bgC.dAp = ((Number)this.GI.wD()).floatValue();
                double d2 = ei2.getPosX() + ((Number)this.GG.wD()).doubleValue();
                double d3 = ei2.getPosZ() + ((Number)this.GG.wD()).doubleValue();
                switch (((akg)this.GC.wD()).getName()) {
                    case "Packet": {
                        double d4 = ei2.getPosY();
                        ahn.n(new f(d2, d4, d3, (Boolean)this.GH.wD()));
                        break;
                    }
                    case "VoidTP": {
                        ei2.setPosX(d2);
                        ei2.setPosZ(d3);
                        ei2.setPosY(ei2.getPosY() - ((Number)this.GG.wD()).doubleValue());
                        break;
                    }
                    case "VoidTP2": {
                        ei2.setPosX(d2);
                        ei2.setPosZ(d3);
                        ei2.setPosY(ei2.getPosY() + ((Number)this.GG.wD()).doubleValue());
                        break;
                    }
                    case "Packet2": {
                        double d5 = ei2.getPosY() - ((Number)this.GG.wD()).doubleValue();
                        ahn.n(new f(d2, d5, d3, (Boolean)this.GH.wD()));
                        break;
                    }
                    case "Packet3": {
                        double d6 = ei2.getPosY() + ((Number)this.GG.wD()).doubleValue();
                        ahn.n(new f(d2, d6, d3, (Boolean)this.GH.wD()));
                    }
                }
                this.GU = true;
            }
        }
    };
    @dm
    public final dk<fi> GX = fi2 -> {
        aj<?> aj2 = fi2.dq();
        if (this.GT && this.GS != 1 && aj2 instanceof e) {
            fi2.cF();
        }
        if (((Boolean)this.GK.wD()).booleanValue() && this.GS == 1) {
            if (aj2 instanceof h) {
                h h2 = (h)aj2;
                fi2.cF();
                ahn.n(new f(h2.afS(), h2.afT(), h2.afU(), h2.isOnGround()));
            }
            if (aj2 instanceof g) {
                fi2.cF();
            }
        }
    };
    @dm
    public final dk<fh> GY = fh2 -> {
        t t2;
        aj<?> aj2 = fh2.dq();
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
        if (aj2 instanceof t && (t2 = (t)aj2).getEntityID() == ne.aER.bgK.getEntityId()) {
            fh2.cF();
        }
    };

    public ne(String string, lw lw2) {
        super(string, lw2);
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
        ne.aER.bgC.dAp = 1.0f;
    }
}

