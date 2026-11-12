/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
package rise.module.impl.player;

import hackclient.rise.aei;
import hackclient.rise.afj;
import hackclient.rise.afk;
import hackclient.rise.afl;
import hackclient.rise.ahn;
import hackclient.rise.aik;
import hackclient.rise.ait;
import hackclient.rise.aix;
import hackclient.rise.akd;
import hackclient.rise.ake;
import hackclient.rise.ako;
import hackclient.rise.aks;
import hackclient.rise.bs;
import hackclient.rise.cb;
import hackclient.rise.eu;
import hackclient.rise.fd;
import hackclient.rise.fr;
import hackclient.rise.gg;
import java.util.ArrayList;
import java.util.List;
import net.minecraft.block.Block;
import net.minecraft.block.BlockAir;
import net.minecraft.block.BlockBed;
import net.minecraft.block.BlockLiquid;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.network.aj;
import net.minecraft.network.play.client.i;
import net.minecraft.network.play.client.j;
import net.minecraft.network.play.server.t;
import net.minecraft.util.a;
import net.minecraft.util.ao;
import net.minecraft.util.b;
import net.minecraft.util.ce;
import net.minecraft.util.cf;
import net.minecraft.util.da;
import net.minecraft.world.w;
import org.lwjgl.opengl.GL11;
import rise.Client;
import rise.event.EventLink;
import rise.event.Listener;
import rise.event.impl.PacketReceiveEvent;
import rise.event.impl.PreUpdateEvent;
import rise.event.impl.Render3DEvent;
import rise.module.Category;
import rise.module.Mode;
import rise.module.Module;
import rise.module.ModuleInfo;
import rise.util.math.Vector2f;
import rise.value.BooleanValue;
import rise.value.ModeValue;

@ModuleInfo(aliases={"module.player.breaker.name"}, description="module.player.breaker.description", category=Category.PLAYER)
public class Breaker_tx
extends Module {
    public final ModeValue aeR = new ModeValue("Mode", this).a(new Mode[]{new aks("Normal")}).a(new Mode[]{new aks("Instant")}).co("Normal");
    public final BooleanValue aeS = new BooleanValue("Bed", (Module)this, (Boolean)true);
    public final BooleanValue aeT = new BooleanValue("Keep Break Progress When Out Of Range", (Module)this, (Boolean)true);
    public final BooleanValue aeU = new BooleanValue("Cancel velocity whilst breaking, so you don't slow down in air", (Module)this, (Boolean)true);
    public final BooleanValue aeV = new BooleanValue("Through Walls", (Module)this, (Boolean)true);
    private final BooleanValue aeW = new BooleanValue("Empty Surrounding", (Module)this, (Boolean)false, () -> (Boolean)this.aeV.wD() == false);
    public final BooleanValue aeX = new BooleanValue("Rotate", (Module)this, (Boolean)true);
    public final BooleanValue aeY = new BooleanValue("Only Rotate at Start and Stop", (Module)this, (Boolean)true);
    public final BooleanValue aeZ = new BooleanValue("Whitelist Own Bed", (Module)this, (Boolean)true);
    public final BooleanValue afa = new BooleanValue("Slow Down In Air", (Module)this, (Boolean)true);
    private final ako<cb> afb = new ako("Movement Correction", this);
    private akd acw;
    private akd acx;
    private akd acy;
    private int abk;
    private boolean ji;
    private float acA;
    private afj acB = new afj(afk.aGW, 50L);
    @EventLink
    public final Listener<Render3DEvent> afc = render3DEvent -> {
        if (this.acw == null) {
            return;
        }
        ake ake2 = new ake((int)Math.floor(this.acw.getX()), (int)Math.floor(this.acw.getY()), (int)Math.floor(this.acw.getZ()));
        this.acB.Q(this.acA);
        this.b(gg.kT).c(() -> {
            GlStateManager.JV();
            GlStateManager.Jw();
            GlStateManager.tQ();
            GlStateManager.JO();
            GlStateManager.JA();
            GL11.glDepthMask((boolean)false);
            ait.e(this.rP().rQ());
            ait.g(new a(ake2.wt(), ake2.wu(), ake2.wx(), ake2.wt() + 1, (double)ake2.wu() + 1.0 * this.acB.sV(), ake2.wx() + 1));
            GlStateManager.JN();
            GlStateManager.Jz();
            GlStateManager.tR();
            GL11.glDepthMask((boolean)true);
            GlStateManager.Jx();
            GlStateManager.JW();
            GlStateManager.JX();
        });
    };
    @EventLink(cH=4)
    public final Listener<PacketReceiveEvent> afd = packetReceiveEvent -> {
        t t2;
        if (!((Boolean)this.aeU.wD()).booleanValue() || this.acw == null) {
            return;
        }
        aj<?> aj2 = packetReceiveEvent.dq();
        if (aj2 instanceof t && (t2 = (t)aj2).getEntityID() == Breaker_tx.aER.bgK.getEntityId()) {
            packetReceiveEvent.cF();
            t2.dcS = 0;
            t2.dcR = 0;
            t2.dcT = 0;
        }
    };
    @EventLink(cH=4)
    public final Listener<eu> afe = eu2 -> {
        this.acA = Breaker_tx.aER.bgu.bDx;
        afl.b("Updated Damage", new Object[0]);
        afl.b(eu2.dg(), new Object[0]);
        afl.b(this.acw.getX() + ", " + this.acw.getY() + ", " + this.acw.getZ(), new Object[0]);
    };
    @EventLink(cH=4)
    public final Listener<PreUpdateEvent> aff = preUpdateEvent -> {
        --this.abk;
        if (this.abk > 0) {
            return;
        }
        if (Breaker_tx.aER.bgu.bDx == 0.0f || Breaker_tx.aER.bgu.bDx >= 1.0f) {
            this.acA = 0.0f;
        }
        if (this.acw == null || Breaker_tx.aER.bgK.getDistance(this.acw.getX(), this.acw.getY(), this.acw.getZ()) > 4.0 || aik.o(this.acw.getX(), this.acw.getY(), this.acw.getZ()) instanceof BlockAir) {
            this.jH();
            if (this.ji) {
                Breaker_tx.aER.aIY.chw.ay(false);
                this.ji = false;
            }
            if (this.acw == null) {
                return;
            }
        }
        this.jP();
    };
    @EventLink
    public final Listener<fr> afg = fr2 -> {
        if (this.acw == null) {
            return;
        }
        ce ce2 = this.kr();
        if (!this.e(ce2)) {
            afl.b("Not Target", new Object[0]);
            return;
        }
        fr2.a(ce2);
    };
    @EventLink
    public final Listener<fd> afh = fd2 -> {
        double d2 = Breaker_tx.aER.bgK.getDistance(fd2.getPosX(), fd2.getPosY(), fd2.getPosZ());
        if (d2 > 40.0) {
            this.acy = new akd(fd2.getPosX(), fd2.getPosY(), fd2.getPosZ());
        }
    };

    public Breaker_tx() {
        for (cb cb2 : cb.values()) {
            this.afb.a((cb[])new cb[]{cb2});
        }
        this.afb.p(cb.gG);
    }

    @Override
    public void onEnable() {
        this.acw = null;
        this.acA = 0.0f;
        this.abk = 0;
        this.ji = false;
        this.acx = null;
    }

    @Override
    public void onDisable() {
        this.acw = null;
        if (this.ji) {
            Breaker_tx.aER.aIY.chw.ay(false);
            this.ji = false;
        }
    }

    public void jH() {
        if (this.acw != null && !(aik.o(this.acw.x, this.acw.y, this.acw.z) instanceof BlockAir) && !(Breaker_tx.aER.bgK.getDistance(this.acw.x, this.acw.y - (double)Breaker_tx.aER.bgK.getEyeHeight(), this.acw.z) > 4.5)) {
            return;
        }
        if (this.acx != null && !((Boolean)this.aeT.wD()).booleanValue()) {
            Breaker_tx.aER.bgu.bDx = 0.0f;
        }
        this.acx = this.acw;
        this.acw = this.jJ();
    }

    public void jI() {
        b b2 = new b(Math.floor(this.acw.getX()), Math.floor(this.acw.getY()), Math.floor(this.acw.getZ()));
        float f2 = aik.u(b2).a(Breaker_tx.aER.bgK, Breaker_tx.aER.bgF, b2);
        if (((Boolean)this.aeY.wD()).booleanValue() && Breaker_tx.aER.bgu.bDx != 0.0f && !((double)Breaker_tx.aER.bgu.bDx >= (double)(1.0f - f2) - 0.001)) {
            return;
        }
        if (!((Boolean)this.aeX.wD()).booleanValue()) {
            return;
        }
        bs.a(this.jQ(), 10.0, (cb)((Object)this.afb.wD()));
    }

    public Vector2f jQ() {
        return aix.d(new akd(Math.floor(this.acw.getX()) + 0.5 + (Math.random() - 0.5) / 4.0, Math.floor(this.acw.getY()) + 0.1, Math.floor(this.acw.getZ()) + 0.5 + (Math.random() - 0.5) / 4.0));
    }

    public akd jJ() {
        if (this.acy != null && Breaker_tx.aER.bgK.M(this.acy.getX(), this.acy.getY(), this.acy.getZ()) < 1225.0 && ((Boolean)this.aeZ.wD()).booleanValue()) {
            return null;
        }
        int n2 = 0;
        for (int i2 = -5; i2 <= 5; ++i2) {
            for (int i3 = -5; i3 <= 5; ++i3) {
                for (int i4 = -5; i4 <= 5; ++i4) {
                    ce ce2;
                    Block block2 = aik.p(i2, i3, i4);
                    akd akd2 = new akd(Breaker_tx.aER.bgK.gW + (double)i2, Breaker_tx.aER.bgK.gX + (double)i3, Breaker_tx.aER.bgK.gY + (double)i4);
                    if (!(block2 instanceof BlockBed) || ++n2 <= 1 || (ce2 = aei.c(aix.d(akd2), 4.5)) == null || ce2.daS.x(new da(Breaker_tx.aER.bgK.gW, Breaker_tx.aER.bgK.gX - (double)Breaker_tx.aER.bgK.getEyeHeight(), Breaker_tx.aER.bgK.gY)) > 4.5) continue;
                    if (!((Boolean)this.aeV.wD()).booleanValue()) {
                        var8_8 = ce2.dg();
                        if (!((b)var8_8).h(akd2)) {
                            continue;
                        }
                    } else if (((Boolean)this.aeW.wD()).booleanValue()) {
                        var8_8 = akd2;
                        double d2 = Double.MAX_VALUE;
                        boolean bl2 = false;
                        for (int i5 = -4; i5 <= 4; ++i5) {
                            for (int i6 = 0; i6 <= 1; ++i6) {
                                for (int i7 = -4; i7 <= 4; ++i7) {
                                    double d3;
                                    Block block3 = aik.o(akd2.getX() + (double)i5, akd2.getY() + (double)i6, akd2.getZ() + (double)i7);
                                    if (block3 instanceof BlockBed || bl2 || Breaker_tx.aER.bgK.getDistance(akd2.getX() + (double)i5, akd2.getY() + (double)i6, akd2.getZ()) + (double)i7 > 4.5 || this.a(akd2.v(i5, i6, i7)).stream().noneMatch(block -> block instanceof BlockBed)) continue;
                                    if (block3 instanceof BlockAir || block3 instanceof BlockLiquid) {
                                        bl2 = true;
                                        continue;
                                    }
                                    if (Breaker_tx.aER.bgK.getDistance(akd2.getX() + (double)i5, akd2.getY() + (double)i6 - (double)Breaker_tx.aER.bgK.getEyeHeight(), akd2.getZ() + (double)i7) > 4.5 || !((d3 = (double)block3.xn()) < d2)) continue;
                                    d2 = d3;
                                    var8_8 = akd2.v(i5, i6, i7);
                                }
                            }
                        }
                        if (!bl2) {
                            if (((akd)var8_8).equals(akd2)) {
                                return null;
                            }
                            return var8_8;
                        }
                    }
                    return akd2;
                }
            }
        }
        return null;
    }

    public List<Block> a(akd akd2) {
        ArrayList<Block> arrayList = new ArrayList<Block>();
        for (ao ao2 : ao.values()) {
            if (ao2 == ao.dwr) continue;
            akd akd3 = akd2.e(new akd(ao2.asM().wt(), ao2.asM().wu(), ao2.asM().wx()));
            arrayList.add(aik.c(akd3));
        }
        return arrayList;
    }

    public void o(b b2) {
        eu eu2 = new eu(Breaker_tx.aER.bgK, Breaker_tx.aER.bgK.baU, b2);
        Client.a.e().d(eu2);
    }

    public void jP() {
        boolean bl2 = (Boolean)this.afa.wD();
        boolean bl3 = Breaker_tx.aER.bgK.aO;
        if (!bl2) {
            Breaker_tx.aER.bgK.aO = true;
        }
        b b2 = new b(this.acw.getX(), this.acw.getY(), this.acw.getZ());
        Breaker_tx.aER.bhc = this.kr();
        Breaker_tx.aER.bgu.bDx = this.acA;
        switch (((Mode)this.aeR.wD()).getName()) {
            case "Instant": {
                this.jI();
                this.o(b2);
                Breaker_tx.aER.bgK.swingItem();
                ahn.m(new i(j.daZ, b2, ao.dwr));
                Breaker_tx.aER.bgK.swingItem();
                ahn.m(new i(j.dbb, b2, ao.dwr));
                this.acw = null;
                this.abk = 20;
                Breaker_tx.aER.bgu.d(b2, ao.dwq);
                break;
            }
            case "Normal": {
                this.o(b2);
                this.jI();
                Breaker_tx.aER.aIY.chw.ay(true);
                this.ji = true;
            }
        }
        Breaker_tx.aER.bgK.aO = bl3;
    }

    private ce kr() {
        ce ce2 = this.g(bs.fk);
        if (!this.e(ce2)) {
            ce2 = this.g(this.jQ());
        }
        if (!this.e(ce2)) {
            ce2 = new ce(new da(this.acw.getX() + Math.random(), this.acw.getY() + 1.0, this.acw.getZ() + Math.random()), ao.dwr, new b(this.acw.getX(), this.acw.getY(), this.acw.getZ()));
        }
        return ce2;
    }

    private boolean e(ce ce2) {
        return ce2 != null && ce2.dzu == cf.dzy && ce2.dg().h(new akd(this.acw.getX(), this.acw.getY(), this.acw.getZ()));
    }

    private ce g(Vector2f vector2f) {
        Block block = aik.c(this.acw);
        a a2 = block.a((w)Breaker_tx.aER.bgF, new b(this.acw.getX(), this.acw.getY(), this.acw.getZ()), block.xM());
        da da2 = Breaker_tx.aER.bgK.aQ(1.0f);
        da da3 = Breaker_tx.aER.bgK.s(vector2f.getY(), vector2f.getX());
        double d2 = 4.5;
        da da4 = da2.al(da3.dAG * 4.5, da3.dAH * 4.5, da3.dAI * 4.5);
        ce ce2 = a2.c(da2, da4);
        if (ce2 != null) {
            ce2.a(new b(this.acw.getX(), this.acw.getY(), this.acw.getZ()));
        }
        return ce2;
    }
}

