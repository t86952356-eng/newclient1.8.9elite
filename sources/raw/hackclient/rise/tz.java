/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 *  org.lwjgl.opengl.GL11
 */
package hackclient.rise;

import hackclient.rise.ahn;
import hackclient.rise.aik;
import hackclient.rise.ain;
import hackclient.rise.ait;
import hackclient.rise.aix;
import hackclient.rise.akb;
import hackclient.rise.akg;
import hackclient.rise.aki;
import hackclient.rise.akp;
import hackclient.rise.akq;
import hackclient.rise.aks;
import hackclient.rise.bs;
import hackclient.rise.bu;
import hackclient.rise.cb;
import hackclient.rise.cg;
import hackclient.rise.dk;
import hackclient.rise.dm;
import hackclient.rise.ej;
import hackclient.rise.eq;
import hackclient.rise.fd;
import hackclient.rise.fg;
import hackclient.rise.fs;
import hackclient.rise.ft;
import hackclient.rise.gi;
import hackclient.rise.gj;
import hackclient.rise.gl;
import hackclient.rise.tn;
import java.awt.Color;
import java.util.ArrayList;
import lombok.Generated;
import net.minecraft.block.Block;
import net.minecraft.block.BlockAir;
import net.minecraft.block.BlockBed;
import net.minecraft.client.entity.c;
import net.minecraft.client.gui.cz;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.network.play.client.i;
import net.minecraft.network.play.client.j;
import net.minecraft.network.play.client.l;
import net.minecraft.util.ao;
import net.minecraft.util.b;
import net.minecraft.util.cf;
import net.minecraft.util.da;
import net.minecraft.util.db;
import org.lwjgl.opengl.GL11;

@gl(aliases={"module.player.breaker.name"}, description="module.player.breaker.description", category=gj.PLAYER)
public class tz
extends gi {
    public final akp afj = new akp("Mode", this).a(new akg[]{new aks("Through Walls")}).a(new akg[]{new aks("Surroundings")}).co("Through Walls");
    private final akq afk = new akq("Range", this, (Number)4, (Number)1, (Number)5, (Number)0.1);
    public final aki afl = new aki("Rotate", (gi)this, (Boolean)true);
    public final aki afm = new aki("Movement Correction", (gi)this, (Boolean)false);
    public final aki afn = new aki("Whitelist Friendly Bed", (gi)this, (Boolean)false);
    public final aki afo = new aki("Aura Check", (gi)this, (Boolean)false);
    private final akq afp = new akq("FastBreak", this, (Number)0, (Number)0, (Number)1, (Number)0.1);
    private final akq afq = new akq("FastBreak bed", this, (Number)0, (Number)0, (Number)1, (Number)0.1);
    private final akq afr = new akq("Air Multiplier", this, (Number)1, (Number)0, (Number)3, (Number)0.1);
    private float afs;
    private float aft;
    private int BV;
    private boolean afu = true;
    private int afv;
    private int abk;
    private int afw;
    private da afx;
    private b afy;
    private b afz;
    boolean afA = false;
    @dm(cH=4)
    public final dk<fg> afB = fg2 -> {
        this.afu = true;
    };
    @dm(cH=4)
    public final dk<fd> afC = fd2 -> {
        if (tz.aER.bgK.getDistance(fd2.getPosX(), fd2.getPosY(), fd2.getPosZ()) > 30.0) {
            if (this.afu) {
                this.afu = false;
                cg.e("Breaker", "Whitelisted bed");
            }
            this.afx = new da(fd2.getPosX(), fd2.getPosY(), fd2.getPosZ());
        }
    };
    @dm(cH=4)
    public final dk<ej> afD = ej2 -> {
        Object object2;
        int n2;
        int n3;
        tn tn2 = this.e(tn.class);
        if (tn2 == null || tn2.isEnabled()) {
            return;
        }
        c c2 = tz.aER.bgK;
        ++this.BV;
        --this.abk;
        if (this.abk > 0 || ((Boolean)this.afn.wD()).booleanValue() && this.afx != null && c2.M(this.afx.dAG, this.afx.dAH, this.afx.dAI) < 1500.0) {
            return;
        }
        boolean bl2 = false;
        int n4 = 0;
        int n5 = 0;
        int n6 = 0;
        for (int i2 = -((Number)this.afk.wD()).intValue() + 1; i2 <= ((Number)this.afk.wD()).intValue() + 1; ++i2) {
            for (n3 = -((Number)this.afk.wD()).intValue() + 1; n3 <= ((Number)this.afk.wD()).intValue() + 1; ++n3) {
                for (n2 = -((Number)this.afk.wD()).intValue() + 1; n2 <= ((Number)this.afk.wD()).intValue() + 1; ++n2) {
                    object2 = aik.p(i2, n3, n2);
                    if (!(object2 instanceof BlockBed)) continue;
                    bl2 = true;
                    n4 = i2;
                    n5 = n3;
                    n6 = n2;
                    b object3 = new b(c2.gW + (double)i2, c2.gX + (double)n3, c2.gY + (double)n2);
                    if (!(this.aft <= 0.0f)) continue;
                    if (this.afy != null) {
                        if (!(object3.i(tz.aER.bgK.yl()) < this.afy.i(tz.aER.bgK.yl()))) continue;
                        this.afy = object3;
                        continue;
                    }
                    this.afy = object3;
                }
            }
        }
        ArrayList<b> arrayList = new ArrayList<b>();
        if (bl2) {
            this.afA = true;
            n3 = 0;
            arrayList.add(new b(n4 + 1, n5, n6));
            arrayList.add(new b(n4 - 1, n5, n6));
            arrayList.add(new b(n4, n5, n6 + 1));
            arrayList.add(new b(n4, n5, n6 - 1));
            arrayList.add(new b(n4, n5 + 1, n6));
            for (n2 = 0; n2 < arrayList.size(); ++n2) {
                object2 = (b)arrayList.get(n2);
                Block block = aik.p(((db)object2).wt(), ((db)object2).wu(), ((db)object2).wx());
                if (!(block instanceof BlockBed)) continue;
                arrayList.remove(n2);
                arrayList.add(new b(((db)object2).wt() + 1, ((db)object2).wu(), ((db)object2).wx()));
                arrayList.add(new b(((db)object2).wt() - 1, ((db)object2).wu(), ((db)object2).wx()));
                arrayList.add(new b(((db)object2).wt(), ((db)object2).wu(), ((db)object2).wx() + 1));
                arrayList.add(new b(((db)object2).wt(), ((db)object2).wu(), ((db)object2).wx() - 1));
                arrayList.add(new b(((db)object2).wt(), ((db)object2).wu() + 1, ((db)object2).wx()));
                break;
            }
            for (n2 = 0; n2 < arrayList.size(); ++n2) {
                object2 = (b)arrayList.get(n2);
                Block block = aik.p(((db)object2).wt(), ((db)object2).wu(), ((db)object2).wx());
                if (!(block instanceof BlockAir)) continue;
                ++n3;
            }
            if (n3 > 0 || !((akg)this.afj.wD()).getName().equals("Surroundings")) {
                this.afz = this.afy;
            } else {
                Block block;
                float f2 = 1.0E8f;
                for (b b2 : arrayList) {
                    block = aik.p(b2.wt(), b2.wu(), b2.wx());
                    if (!(block.xn() < f2) || block instanceof BlockBed) continue;
                    f2 = block.xn();
                    if (!(this.aft <= 0.0f)) continue;
                    this.afz = new b(c2.gW + (double)b2.wt(), c2.gX + (double)b2.wu(), c2.gY + (double)b2.wx());
                }
                for (int i3 = 0; i3 < arrayList.size(); ++i3) {
                    b b3 = (b)arrayList.get(i3);
                    block = aik.p(b3.wt(), b3.wu(), b3.wx());
                    if (f2 != block.xn() || !(b3.b(c2.yl()).j(c2.yl()) < this.afz.j(c2.yl())) || !(this.aft <= 0.0f)) continue;
                    this.afz = new b(c2.gW + (double)b3.wt(), c2.gX + (double)b3.wu(), c2.gY + (double)b3.wx());
                }
            }
            if (this.afz.j(c2.yl()) <= (double)((Number)this.afk.wD()).floatValue()) {
                int n7;
                if (((Boolean)this.afl.wD()).booleanValue()) {
                    this.q(this.afz);
                }
                if ((n7 = ain.v(this.afz)) != -1) {
                    ahn.m(new l(n7));
                }
                if (n7 != -1) {
                    this.afs = ain.a(c2, tz.aER.bgF, this.afz, n7);
                } else {
                    net.minecraft.client.multiplayer.j j2 = tz.aER.bgF;
                    this.d(bu.class);
                    this.afs = ain.a(c2, j2, this.afz, bu.bQ());
                }
                if (!tz.aER.bgK.aO) {
                    this.afs *= ((Number)this.afr.wD()).floatValue();
                }
                if (this.aft == 0.0f) {
                    ahn.m(new i(j.daZ, this.afz, ao.dwq));
                }
                tz.aER.bgK.swingItem();
                this.aft += this.afs;
                tz.aER.bgF.b(c2.getEntityId(), this.afz, (int)(this.aft * 10.0f - 1.0f));
                float f2 = aik.p(this.afz.wt(), this.afz.wu(), this.afz.wx()) instanceof BlockBed ? 1.0f - ((Number)this.afq.wD()).floatValue() : 1.0f - ((Number)this.afp.wD()).floatValue();
                if (this.aft >= f2) {
                    this.aft = 0.0f;
                    ahn.m(new i(j.dbb, this.afz, ao.dwq));
                    tz.aER.bgu.d(this.afz, ao.dwr);
                }
                if (n7 != -1) {
                    this.d(bu.class);
                    ahn.m(new l(bu.bQ()));
                }
            }
        } else {
            if (this.afA) {
                this.aft = 0.0f;
            }
            this.afA = false;
        }
        tz.aER.bgu.bDx = this.aft;
    };
    @dm
    public final dk<eq> afE = eq2 -> {
        if (((Boolean)this.afn.wD()).booleanValue()) {
            this.BV = 0;
        } else if (this.BV < 10) {
            ++this.BV;
        }
        this.afA = this.BV < 10;
    };
    @dm
    public final dk<fs> afF = fs2 -> {
        if (this.afA) {
            cz cz2 = fs2.dx();
            double d2 = (double)cz2.getScaledHeight() * 0.8;
            ait.a((double)(((float)cz2.getScaledWidth() - tz.aER.bgu.bDx * 100.0f) / 2.0f), d2, (double)(tz.aER.bgu.bDx * 100.0f), 10.0, 4.0, this.rP().rQ(), this.rP().rR(), true);
            ait.e(Color.WHITE);
        }
    };
    @dm
    public final dk<ft> afG = ft2 -> {
        if (this.afA) {
            try {
                double d2 = this.afz.wt();
                aER.BF();
                double d3 = d2 - RenderManager.bVA;
                double d4 = this.afz.wu();
                aER.BF();
                double d5 = d4 - RenderManager.bVB;
                double d6 = this.afz.wx();
                aER.BF();
                double d7 = d6 - RenderManager.bVC;
                double d8 = d3 + 1.0;
                double d9 = d5 + 1.0;
                double d10 = d7 + 1.0;
                this.a(d3, d5, d7, d8, d9, d10);
            }
            catch (NullPointerException nullPointerException) {
                // empty catch block
            }
        }
    };

    @Override
    public void onDisable() {
        tz.aER.bgu.bDx = 0.0f;
    }

    @Override
    public void onEnable() {
        this.afs = 0.0f;
        this.aft = 0.0f;
    }

    private void a(double d2, double d3, double d4, double d5, double d6, double d7) {
        GL11.glPushMatrix();
        GL11.glDisable((int)3553);
        GL11.glEnable((int)2848);
        GL11.glLineWidth((float)2.0f);
        GL11.glBegin((int)1);
        if (this.afy == this.afz) {
            GL11.glColor3f((float)255.0f, (float)0.0f, (float)0.0f);
        } else {
            GL11.glColor3f((float)255.0f, (float)255.0f, (float)255.0f);
        }
        GL11.glVertex3d((double)d2, (double)d3, (double)d4);
        GL11.glVertex3d((double)d5, (double)d3, (double)d4);
        GL11.glVertex3d((double)d5, (double)d3, (double)d4);
        GL11.glVertex3d((double)d5, (double)d6, (double)d4);
        GL11.glVertex3d((double)d5, (double)d6, (double)d4);
        GL11.glVertex3d((double)d2, (double)d6, (double)d4);
        GL11.glVertex3d((double)d2, (double)d6, (double)d4);
        GL11.glVertex3d((double)d2, (double)d3, (double)d4);
        GL11.glVertex3d((double)d2, (double)d3, (double)d4);
        GL11.glVertex3d((double)d2, (double)d3, (double)d7);
        GL11.glVertex3d((double)d5, (double)d3, (double)d4);
        GL11.glVertex3d((double)d5, (double)d3, (double)d7);
        GL11.glVertex3d((double)d5, (double)d6, (double)d4);
        GL11.glVertex3d((double)d5, (double)d6, (double)d7);
        GL11.glVertex3d((double)d2, (double)d6, (double)d4);
        GL11.glVertex3d((double)d2, (double)d6, (double)d7);
        GL11.glVertex3d((double)d2, (double)d3, (double)d7);
        GL11.glVertex3d((double)d5, (double)d3, (double)d7);
        GL11.glVertex3d((double)d5, (double)d3, (double)d7);
        GL11.glVertex3d((double)d5, (double)d6, (double)d7);
        GL11.glVertex3d((double)d5, (double)d6, (double)d7);
        GL11.glVertex3d((double)d2, (double)d6, (double)d7);
        GL11.glVertex3d((double)d2, (double)d6, (double)d7);
        GL11.glVertex3d((double)d2, (double)d3, (double)d7);
        GL11.glEnd();
        GL11.glEnable((int)3553);
        GL11.glDisable((int)2848);
        GL11.glPopMatrix();
    }

    public void q(b b2) {
        if (!((Boolean)this.afl.wD()).booleanValue()) {
            return;
        }
        akb akb2 = aix.w(b2);
        bs.a(akb2, 10.0, (Boolean)this.afm.wD() != false ? cb.gH : cb.gG);
        tz.aER.bhc.a(b2);
        tz.aER.bhc.dzv = ao.dwr;
        tz.aER.bhc.daS = new da(Math.random(), 1.0, Math.random());
        tz.aER.bhc.dzu = cf.dzy;
    }

    @Generated
    public boolean ks() {
        return this.afA;
    }
}

