/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package hackclient.rise;

import hackclient.rise.aik;
import hackclient.rise.d;
import hackclient.rise.l;
import hackclient.rise.o;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lombok.Generated;
import net.minecraft.block.BlockAir;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.b;
import net.minecraft.item.co;
import net.minecraft.network.aj;
import net.minecraft.network.play.server.ad;
import net.minecraft.network.play.server.v;
import net.minecraft.network.play.server.y;
import net.minecraft.network.play.server.z;
import net.minecraft.util.bt;
import rip.vantage.commons.util.time.a;
import rise.Client;

public final class m {
    private final b am;
    private final List<d> an;
    private int ao;
    private int ap;
    private int aq;
    private int ar;
    private int as;
    private double x;
    private double y;
    private double z;
    private double at;
    private double au;
    private double av;
    private double aw;
    private double ax;
    private double ay;
    private double az;
    private double aA;
    private double aB;
    private double aC;
    private double aD;
    private double aE;
    private double aF;
    private double aG;
    private double aH;
    private double aI;
    private double aJ;
    private double aK;
    private double aL;
    private double aM;
    private double aN;
    private boolean onGround;
    private boolean aP;
    private boolean aQ;
    private int groundTicks;
    private boolean aS;
    private boolean aT;
    private final a aU = new a();
    private final a aV = new a();
    private int aW = 20;
    private int aX = 1;
    private int aY;
    private int aZ;
    private net.minecraft.entity.player.a ba;
    private final Map<d, Float> bb = new HashMap<d, Float>();
    private boolean bc;
    private final a bd = new a();
    private final a be = new a();
    private final a bf = new a();
    private boolean sneaking;
    private boolean sprinting;
    private boolean usingItem;
    private int bj;
    private net.minecraft.item.d bk;

    public m(b b2) {
        this.am = b2;
        this.ao = b2.ao;
        this.ap = b2.ap;
        this.aq = b2.aq;
        this.an = l.a(this);
    }

    public void a(aj<?> aj2) {
        List<net.minecraft.entity.player.a> list;
        Object object;
        if (this.am.aRg <= 80) {
            this.aV.aX();
            return;
        }
        if (Client.a.x().a(this.am) || !this.am.aec || this.am.p(Minecraft.getMinecraft().bgK)) {
            return;
        }
        if (o.b(aj2)) {
            object = (v)aj2;
            if (((v)object).entityId == this.am.getEntityId()) {
                if (this.am.cus != 0 && this.as > 9 && this.aZ > 40) {
                    this.as = 0;
                }
                this.ao += ((v)object).dcV;
                this.ap += ((v)object).dcW;
                this.aq += ((v)object).dcX;
                this.at = this.x;
                this.au = this.y;
                this.av = this.z;
                this.x = (double)this.ao / 32.0;
                this.y = (double)this.ap / 32.0;
                this.z = (double)this.aq / 32.0;
                this.aM = this.aK;
                this.aN = this.aL;
                if (aj2 instanceof y) {
                    this.aK = ((v)object).dcy;
                    this.aL = ((v)object).dcz;
                }
                this.az = this.aw;
                this.aA = this.ax;
                this.aB = this.ay;
                this.aw = this.x - this.at;
                this.ax = this.y - this.au;
                this.ay = this.z - this.av;
                this.aD = this.aC;
                this.aC = bt.aD(this.aw * this.aw + this.ay * this.ay);
                double d3 = (double)((float)this.aV.aKM() / 50.0f) * 0.2;
                if (this.aV.aKM() / 50L > (long)this.aX && (this.aC > d3 || this.aD > d3)) {
                    this.aX = (int)(this.aV.aKM() / 50L);
                }
                this.aV.aX();
                this.aP = this.onGround;
                this.onGround = !(aik.o(this.x - 0.5, this.y - 0.43, this.z - 0.5) instanceof BlockAir) || !(aik.o(this.x + 0.5, this.y - 0.43, this.z - 0.5) instanceof BlockAir) || !(aik.o(this.x + 0.5, this.y - 0.43, this.z + 0.5) instanceof BlockAir) || !(aik.o(this.x - 0.5, this.y - 0.43, this.z + 0.5) instanceof BlockAir);
                this.aT = this.aS;
                boolean bl2 = this.aS = !(aik.o(this.x - 0.5, this.y - 0.99, this.z - 0.5) instanceof BlockAir) || !(aik.o(this.x + 0.5, this.y - 0.99, this.z - 0.5) instanceof BlockAir) || !(aik.o(this.x + 0.5, this.y - 0.99, this.z + 0.5) instanceof BlockAir) || !(aik.o(this.x - 0.5, this.y - 0.99, this.z + 0.5) instanceof BlockAir);
                if (this.onGround) {
                    this.aH = this.aE;
                    this.aI = this.aF;
                    this.aJ = this.aG;
                    this.aE = this.x;
                    this.aF = this.y;
                    this.aG = this.z;
                    ++this.groundTicks;
                } else {
                    this.groundTicks = 0;
                }
                if (this.aF - this.y > 2.5) {
                    this.aZ = 0;
                }
                double d4 = (bt.aJ(Math.toDegrees(Math.atan2(this.at - this.x, this.av - this.z))) + 180.0) * -1.0;
                double d5 = bt.aJ(this.aw());
                double d6 = Math.abs(d5 - d4);
                this.aQ = d6 < 70.0 || d6 > 290.0;
            }
        } else if (aj2 instanceof z) {
            object = (z)aj2;
            if (((z)object).getEntityId() == this.am.getEntityId()) {
                this.ao = ((z)object).wt();
                this.ap = ((z)object).wu();
                this.aq = ((z)object).wx();
                this.at = this.x;
                this.au = this.y;
                this.av = this.z;
                this.x = (double)this.ao / 32.0;
                this.y = (double)this.ap / 32.0;
                this.z = (double)this.aq / 32.0;
                this.ar = 0;
                this.aD = this.aC;
                this.aC = bt.aD(this.aw * this.aw + this.ay * this.ay);
                double d7 = (double)((float)this.aV.aKM() / 50.0f) * 0.2;
                if (this.aV.aKM() / 50L > (long)this.aX && (this.aC > d7 || this.aD > d7)) {
                    this.aX = (int)(this.aV.aKM() / 50L);
                }
            }
        } else if (this.am.cup && (list = (object = new ArrayList(Minecraft.getMinecraft().bgF.dCY)).stream().filter(a2 -> a2.T(this.am) < 36.0).toList()).size() == 2) {
            this.ba = list.get(0);
            this.aY = 0;
        }
        if (aj2 instanceof ad && ((ad)(object = (ad)aj2)).getEntityId() == this.am.getEntityId() && ((ad)object).agX() != null) {
            ((ad)object).agX().forEach(b2 -> {
                if (b2.Tl() == 0 && b2.Tm() instanceof Byte) {
                    byte by2 = (Byte)b2.Tm();
                    boolean bl2 = (by2 & 2) != 0;
                    boolean bl3 = (by2 & 8) != 0;
                    boolean bl4 = (by2 & 0x10) != 0;
                    this.sneaking = bl2;
                    this.sprinting = bl3;
                    if (bl4) {
                        if (!this.usingItem) {
                            this.usingItem = true;
                        }
                        ++this.bj;
                    } else {
                        this.usingItem = false;
                        this.bj = 0;
                    }
                }
            });
        }
        this.an.forEach(d2 -> d2.a(aj2));
    }

    public void F() {
        ++this.as;
        ++this.ar;
        ++this.aY;
        ++this.aZ;
    }

    public d a(Class<?> clazz) {
        for (d d2 : this.an) {
            if (d2.getClass() != clazz) continue;
            return d2;
        }
        return null;
    }

    public float c(d d2) {
        return this.a(d2, 1);
    }

    public float a(d d2, int n2) {
        float f2 = this.bb.getOrDefault(d2, Float.valueOf(0.0f)).floatValue() + (float)n2;
        this.bb.put(d2, Float.valueOf(f2));
        return f2;
    }

    public float a(d d2, float f2) {
        float f3 = this.bb.getOrDefault(d2, Float.valueOf(0.0f)).floatValue();
        float f4 = f3 * f2;
        if (f4 < 0.0f) {
            f4 = 0.0f;
        }
        this.bb.put(d2, Float.valueOf(f4));
        return f4;
    }

    public boolean V() {
        return this.bc;
    }

    public boolean isSprinting() {
        return this.sprinting;
    }

    public boolean isUsingItem() {
        return this.usingItem;
    }

    public int W() {
        return this.bj;
    }

    public net.minecraft.item.d X() {
        return this.bk;
    }

    public void a(co co2) {
        this.bk = co2 != null ? co2.bP() : null;
    }

    @Generated
    public b Y() {
        return this.am;
    }

    @Generated
    public List<d> Z() {
        return this.an;
    }

    @Generated
    public int aa() {
        return this.ao;
    }

    @Generated
    public int ab() {
        return this.ap;
    }

    @Generated
    public int ac() {
        return this.aq;
    }

    @Generated
    public int ad() {
        return this.ar;
    }

    @Generated
    public int ae() {
        return this.as;
    }

    @Generated
    public double getX() {
        return this.x;
    }

    @Generated
    public double getY() {
        return this.y;
    }

    @Generated
    public double getZ() {
        return this.z;
    }

    @Generated
    public double af() {
        return this.at;
    }

    @Generated
    public double ag() {
        return this.au;
    }

    @Generated
    public double ah() {
        return this.av;
    }

    @Generated
    public double ai() {
        return this.aw;
    }

    @Generated
    public double aj() {
        return this.ax;
    }

    @Generated
    public double ak() {
        return this.ay;
    }

    @Generated
    public double al() {
        return this.az;
    }

    @Generated
    public double am() {
        return this.aA;
    }

    @Generated
    public double an() {
        return this.aB;
    }

    @Generated
    public double ao() {
        return this.aC;
    }

    @Generated
    public double ap() {
        return this.aD;
    }

    @Generated
    public double aq() {
        return this.aE;
    }

    @Generated
    public double ar() {
        return this.aF;
    }

    @Generated
    public double as() {
        return this.aG;
    }

    @Generated
    public double at() {
        return this.aH;
    }

    @Generated
    public double au() {
        return this.aI;
    }

    @Generated
    public double av() {
        return this.aJ;
    }

    @Generated
    public double aw() {
        return this.aK;
    }

    @Generated
    public double ax() {
        return this.aL;
    }

    @Generated
    public double ay() {
        return this.aM;
    }

    @Generated
    public double az() {
        return this.aN;
    }

    @Generated
    public boolean isOnGround() {
        return this.onGround;
    }

    @Generated
    public boolean aA() {
        return this.aP;
    }

    @Generated
    public boolean aB() {
        return this.aQ;
    }

    @Generated
    public int getGroundTicks() {
        return this.groundTicks;
    }

    @Generated
    public boolean aC() {
        return this.aS;
    }

    @Generated
    public boolean aD() {
        return this.aT;
    }

    @Generated
    public a aE() {
        return this.aU;
    }

    @Generated
    public a aF() {
        return this.aV;
    }

    @Generated
    public int aG() {
        return this.aW;
    }

    @Generated
    public int aH() {
        return this.aX;
    }

    @Generated
    public int aI() {
        return this.aY;
    }

    @Generated
    public int aJ() {
        return this.aZ;
    }

    @Generated
    public net.minecraft.entity.player.a aK() {
        return this.ba;
    }

    @Generated
    public Map<d, Float> aL() {
        return this.bb;
    }

    @Generated
    public a aM() {
        return this.bd;
    }

    @Generated
    public a aN() {
        return this.be;
    }

    @Generated
    public a aO() {
        return this.bf;
    }

    @Generated
    public boolean isSneaking() {
        return this.sneaking;
    }
}

