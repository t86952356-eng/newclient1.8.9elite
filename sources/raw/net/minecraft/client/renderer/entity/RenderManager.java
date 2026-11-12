/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 */
package net.minecraft.client.renderer.entity;

import com.google.common.collect.Maps;
import hackclient.rise.agg;
import java.util.Collections;
import java.util.Map;
import net.minecraft.block.Block;
import net.minecraft.block.BlockBed;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.entity.a;
import net.minecraft.client.model.ac;
import net.minecraft.client.model.af;
import net.minecraft.client.model.an;
import net.minecraft.client.model.aq;
import net.minecraft.client.model.au;
import net.minecraft.client.model.av;
import net.minecraft.client.model.m;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.RenderGlobal;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.WorldRenderer;
import net.minecraft.client.renderer.culling.ICamera;
import net.minecraft.client.renderer.entity.ArmorStandRenderer;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderArrow;
import net.minecraft.client.renderer.entity.RenderBat;
import net.minecraft.client.renderer.entity.RenderBlaze;
import net.minecraft.client.renderer.entity.RenderBoat;
import net.minecraft.client.renderer.entity.RenderCaveSpider;
import net.minecraft.client.renderer.entity.RenderChicken;
import net.minecraft.client.renderer.entity.RenderCow;
import net.minecraft.client.renderer.entity.RenderCreeper;
import net.minecraft.client.renderer.entity.RenderDragon;
import net.minecraft.client.renderer.entity.RenderEnderman;
import net.minecraft.client.renderer.entity.RenderEndermite;
import net.minecraft.client.renderer.entity.RenderEntity;
import net.minecraft.client.renderer.entity.RenderEntityItem;
import net.minecraft.client.renderer.entity.RenderFallingBlock;
import net.minecraft.client.renderer.entity.RenderFireball;
import net.minecraft.client.renderer.entity.RenderFish;
import net.minecraft.client.renderer.entity.RenderGhast;
import net.minecraft.client.renderer.entity.RenderGiantZombie;
import net.minecraft.client.renderer.entity.RenderGuardian;
import net.minecraft.client.renderer.entity.RenderHorse;
import net.minecraft.client.renderer.entity.RenderIronGolem;
import net.minecraft.client.renderer.entity.RenderItem;
import net.minecraft.client.renderer.entity.RenderLeashKnot;
import net.minecraft.client.renderer.entity.RenderLightningBolt;
import net.minecraft.client.renderer.entity.RenderMagmaCube;
import net.minecraft.client.renderer.entity.RenderMinecart;
import net.minecraft.client.renderer.entity.RenderMinecartMobSpawner;
import net.minecraft.client.renderer.entity.RenderMooshroom;
import net.minecraft.client.renderer.entity.RenderOcelot;
import net.minecraft.client.renderer.entity.RenderPainting;
import net.minecraft.client.renderer.entity.RenderPig;
import net.minecraft.client.renderer.entity.RenderPigZombie;
import net.minecraft.client.renderer.entity.RenderPlayer;
import net.minecraft.client.renderer.entity.RenderPotion;
import net.minecraft.client.renderer.entity.RenderRabbit;
import net.minecraft.client.renderer.entity.RenderSheep;
import net.minecraft.client.renderer.entity.RenderSilverfish;
import net.minecraft.client.renderer.entity.RenderSkeleton;
import net.minecraft.client.renderer.entity.RenderSlime;
import net.minecraft.client.renderer.entity.RenderSnowMan;
import net.minecraft.client.renderer.entity.RenderSnowball;
import net.minecraft.client.renderer.entity.RenderSpider;
import net.minecraft.client.renderer.entity.RenderSquid;
import net.minecraft.client.renderer.entity.RenderTNTPrimed;
import net.minecraft.client.renderer.entity.RenderTntMinecart;
import net.minecraft.client.renderer.entity.RenderVillager;
import net.minecraft.client.renderer.entity.RenderWitch;
import net.minecraft.client.renderer.entity.RenderWither;
import net.minecraft.client.renderer.entity.RenderWolf;
import net.minecraft.client.renderer.entity.RenderXPOrb;
import net.minecraft.client.renderer.entity.RenderZombie;
import net.minecraft.client.renderer.texture.TextureManager;
import net.minecraft.client.renderer.tileentity.RenderEnderCrystal;
import net.minecraft.client.renderer.tileentity.RenderItemFrame;
import net.minecraft.client.renderer.tileentity.RenderWitherSkull;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.entity.ai.bi;
import net.minecraft.entity.item.d;
import net.minecraft.entity.item.e;
import net.minecraft.entity.item.f;
import net.minecraft.entity.item.g;
import net.minecraft.entity.item.h;
import net.minecraft.entity.item.i;
import net.minecraft.entity.item.j;
import net.minecraft.entity.item.k;
import net.minecraft.entity.item.s;
import net.minecraft.entity.item.t;
import net.minecraft.entity.item.v;
import net.minecraft.entity.item.w;
import net.minecraft.entity.monster.ab;
import net.minecraft.entity.monster.ae;
import net.minecraft.entity.monster.ah;
import net.minecraft.entity.monster.ao;
import net.minecraft.entity.monster.ap;
import net.minecraft.entity.monster.at;
import net.minecraft.entity.monster.p;
import net.minecraft.entity.passive.ai;
import net.minecraft.entity.passive.l;
import net.minecraft.entity.passive.u;
import net.minecraft.entity.passive.z;
import net.minecraft.entity.r;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.util.b;
import net.minecraft.util.cl;
import net.minecraft.util.da;
import net.optifine.entity.model.c;

public class RenderManager {
    private Map<Class, Render> bVw = Maps.newHashMap();
    private final Map<String, RenderPlayer> bVx = Maps.newHashMap();
    private final RenderPlayer bVy;
    private agg bVz;
    public static double bVA;
    public static double bVB;
    public static double bVC;
    public TextureManager aIK;
    public net.minecraft.world.w baU;
    public net.minecraft.entity.c bVD;
    public net.minecraft.entity.c bgM;
    public float bVE;
    public float bVF;
    public net.minecraft.client.settings.a bjA;
    public double bVG;
    public double bVH;
    public double bVI;
    private boolean bVJ = false;
    private boolean bVK = true;
    private boolean bVL = false;
    public Render bVM = null;

    public RenderManager(TextureManager textureManager, RenderItem renderItem) {
        this.aIK = textureManager;
        this.bVw.put(net.minecraft.entity.monster.c.class, new RenderCaveSpider(this));
        this.bVw.put(ap.class, new RenderSpider(this));
        this.bVw.put(net.minecraft.entity.passive.k.class, new RenderPig(this, new ac(), 0.7f));
        this.bVw.put(u.class, new RenderSheep(this, new net.minecraft.client.model.ai(), 0.7f));
        this.bVw.put(net.minecraft.entity.passive.e.class, new RenderCow(this, new m(), 0.7f));
        this.bVw.put(net.minecraft.entity.passive.i.class, new RenderMooshroom(this, new m(), 0.7f));
        this.bVw.put(ai.class, new RenderWolf(this, new au(), 0.5f));
        this.bVw.put(net.minecraft.entity.passive.d.class, new RenderChicken(this, new net.minecraft.client.model.l(), 0.3f));
        this.bVw.put(net.minecraft.entity.passive.j.class, new RenderOcelot(this, new net.minecraft.client.model.ab(), 0.4f));
        this.bVw.put(l.class, new RenderRabbit(this, new af(), 0.3f));
        this.bVw.put(ae.class, new RenderSilverfish(this));
        this.bVw.put(net.minecraft.entity.monster.j.class, new RenderEndermite(this));
        this.bVw.put(net.minecraft.entity.monster.d.class, new RenderCreeper(this));
        this.bVw.put(net.minecraft.entity.monster.e.class, new RenderEnderman(this));
        this.bVw.put(ao.class, new RenderSnowMan(this));
        this.bVw.put(ah.class, new RenderSkeleton(this));
        this.bVw.put(at.class, new RenderWitch(this));
        this.bVw.put(net.minecraft.entity.monster.a.class, new RenderBlaze(this));
        this.bVw.put(ab.class, new RenderPigZombie(this));
        this.bVw.put(net.minecraft.entity.monster.au.class, new RenderZombie(this));
        this.bVw.put(net.minecraft.entity.monster.ai.class, new RenderSlime(this, new an(16), 0.25f));
        this.bVw.put(net.minecraft.entity.monster.z.class, new RenderMagmaCube(this));
        this.bVw.put(p.class, new RenderGiantZombie(this, new av(), 0.5f, 6.0f));
        this.bVw.put(net.minecraft.entity.monster.k.class, new RenderGhast(this));
        this.bVw.put(net.minecraft.entity.passive.w.class, new RenderSquid(this, new aq(), 0.7f));
        this.bVw.put(z.class, new RenderVillager(this));
        this.bVw.put(net.minecraft.entity.monster.w.class, new RenderIronGolem(this));
        this.bVw.put(net.minecraft.entity.passive.c.class, new RenderBat(this));
        this.bVw.put(net.minecraft.entity.monster.r.class, new RenderGuardian(this));
        this.bVw.put(net.minecraft.entity.boss.b.class, new RenderDragon(this));
        this.bVw.put(net.minecraft.entity.item.c.class, new RenderEnderCrystal(this));
        this.bVw.put(net.minecraft.entity.boss.d.class, new RenderWither(this));
        this.bVw.put(net.minecraft.entity.c.class, new RenderEntity(this));
        this.bVw.put(t.class, new RenderPainting(this));
        this.bVw.put(j.class, new RenderItemFrame(this, renderItem));
        this.bVw.put(net.minecraft.entity.m.class, new RenderLeashKnot(this));
        this.bVw.put(net.minecraft.entity.projectile.a.class, new RenderArrow(this));
        this.bVw.put(net.minecraft.entity.projectile.h.class, new RenderSnowball(this, Items.cQH, renderItem));
        this.bVw.put(e.class, new RenderSnowball(this, Items.cRy, renderItem));
        this.bVw.put(d.class, new RenderSnowball(this, Items.cRL, renderItem));
        this.bVw.put(net.minecraft.entity.projectile.b.class, new RenderSnowball(this, Items.cQT, renderItem));
        this.bVw.put(net.minecraft.entity.projectile.f.class, new RenderPotion(this, renderItem));
        this.bVw.put(f.class, new RenderSnowball(this, Items.cRO, renderItem));
        this.bVw.put(h.class, new RenderSnowball(this, Items.cSf, renderItem));
        this.bVw.put(net.minecraft.entity.projectile.e.class, new RenderFireball(this, 2.0f));
        this.bVw.put(net.minecraft.entity.projectile.g.class, new RenderFireball(this, 0.5f));
        this.bVw.put(net.minecraft.entity.projectile.j.class, new RenderWitherSkull(this));
        this.bVw.put(i.class, new RenderEntityItem(this, renderItem));
        this.bVw.put(w.class, new RenderXPOrb(this));
        this.bVw.put(v.class, new RenderTNTPrimed(this));
        this.bVw.put(g.class, new RenderFallingBlock(this));
        this.bVw.put(net.minecraft.entity.item.a.class, new ArmorStandRenderer(this));
        this.bVw.put(s.class, new RenderTntMinecart(this));
        this.bVw.put(bi.class, new RenderMinecartMobSpawner(this));
        this.bVw.put(k.class, new RenderMinecart(this));
        this.bVw.put(net.minecraft.entity.item.b.class, new RenderBoat(this));
        this.bVw.put(net.minecraft.entity.projectile.d.class, new RenderFish(this));
        this.bVw.put(net.minecraft.entity.passive.f.class, new RenderHorse(this, new net.minecraft.client.model.u(), 0.75f));
        this.bVw.put(net.minecraft.entity.effect.a.class, new RenderLightningBolt(this));
        this.bVy = new RenderPlayer(this);
        this.bVx.put("default", this.bVy);
        this.bVx.put("slim", new RenderPlayer(this, true));
        net.optifine.player.k.t(this.bVx);
        if (net.optifine.reflect.g.eqF.aDA()) {
            net.optifine.reflect.g.g(net.optifine.reflect.g.eqF, this, this.bVw);
        }
    }

    public void I(double d2, double d3, double d4) {
        bVA = d2;
        bVB = d3;
        bVC = d4;
    }

    public <T extends net.minecraft.entity.c> Render<T> g(Class<? extends net.minecraft.entity.c> clazz) {
        Render<T> render = this.bVw.get(clazz);
        if (render == null && clazz != net.minecraft.entity.c.class) {
            render = this.g(clazz.getSuperclass());
            this.bVw.put(clazz, render);
        }
        return render;
    }

    public <T extends net.minecraft.entity.c> Render<T> O(net.minecraft.entity.c c2) {
        if (c2.csY == null) {
            String string;
            RenderPlayer renderPlayer;
            c2.csY = c2 instanceof a ? ((renderPlayer = this.bVx.get(string = ((a)c2).Df())) != null ? renderPlayer : this.bVy) : this.g(c2.getClass());
        }
        return c2.csY;
    }

    public void a(net.minecraft.world.w w2, agg agg2, net.minecraft.entity.c c2, net.minecraft.entity.c c3, net.minecraft.client.settings.a a2, float f2) {
        this.baU = w2;
        this.bjA = a2;
        this.bVD = c2;
        this.bgM = c3;
        this.bVz = agg2;
        if (c2 instanceof r && ((r)c2).Wg()) {
            IBlockState iBlockState = w2.L(new b(c2));
            Block block = iBlockState.df();
            if (net.optifine.reflect.g.b((Object)block, net.optifine.reflect.g.eor, iBlockState, w2, new b(c2), c2)) {
                net.minecraft.util.ao ao2 = (net.minecraft.util.ao)net.optifine.reflect.g.g(block, net.optifine.reflect.g.eol, iBlockState, w2, new b(c2));
                int n2 = ao2.asA();
                this.bVE = n2 * 90 + 180;
                this.bVF = 0.0f;
            } else if (block == Blocks.cLE) {
                int n3 = iBlockState.b(BlockBed.aTB).asA();
                this.bVE = n3 * 90 + 180;
                this.bVF = 0.0f;
            }
        } else {
            this.bVE = c2.crM + (c2.pl - c2.crM) * f2;
            this.bVF = c2.crO + (c2.pm - c2.crO) * f2;
        }
        if (a2.chP == 2) {
            this.bVE += 180.0f;
        }
        this.bVG = c2.csh + (c2.gW - c2.csh) * (double)f2;
        this.bVH = c2.csi + (c2.gX - c2.csi) * (double)f2;
        this.bVI = c2.csj + (c2.gY - c2.csj) * (double)f2;
    }

    public void aC(float f2) {
        this.bVE = f2;
    }

    public boolean Nv() {
        return this.bVK;
    }

    public void as(boolean bl2) {
        this.bVK = bl2;
    }

    public void at(boolean bl2) {
        this.bVL = bl2;
    }

    public boolean Nw() {
        return this.bVL;
    }

    public boolean e(net.minecraft.entity.c c2, float f2) {
        return this.a(c2, f2, false);
    }

    public boolean a(net.minecraft.entity.c c2, ICamera iCamera, double d2, double d3, double d4) {
        Render<net.minecraft.entity.c> render = this.O(c2);
        return render != null && render.a(c2, iCamera, d2, d3, d4);
    }

    public boolean a(net.minecraft.entity.c c2, float f2, boolean bl2) {
        if (c2.aRg == 0) {
            c2.csh = c2.gW;
            c2.csi = c2.gX;
            c2.csj = c2.gY;
        }
        double d2 = c2.csh + (c2.gW - c2.csh) * (double)f2;
        double d3 = c2.csi + (c2.gX - c2.csi) * (double)f2;
        double d4 = c2.csj + (c2.gY - c2.csj) * (double)f2;
        float f3 = c2.crM + (c2.pl - c2.crM) * f2;
        int n2 = c2.af(f2);
        if (c2.isBurning()) {
            n2 = 0xF000F0;
        }
        int n3 = n2 % 65536;
        int n4 = n2 / 65536;
        OpenGlHelper.a(OpenGlHelper.bMJ, (float)n3, (float)n4);
        GlStateManager.e(1.0f, 1.0f, 1.0f, 1.0f);
        return this.a(c2, d2 - bVA, d3 - bVB, d4 - bVC, f3, f2, bl2);
    }

    public void f(net.minecraft.entity.c c2, float f2) {
        double d2 = c2.csh + (c2.gW - c2.csh) * (double)f2;
        double d3 = c2.csi + (c2.gX - c2.csi) * (double)f2;
        double d4 = c2.csj + (c2.gY - c2.csj) * (double)f2;
        Render<net.minecraft.entity.c> render = this.O(c2);
        if (render != null && this.aIK != null) {
            int n2 = c2.af(f2);
            int n3 = n2 % 65536;
            int n4 = n2 / 65536;
            OpenGlHelper.a(OpenGlHelper.bMJ, (float)n3 / 1.0f, (float)n4 / 1.0f);
            GlStateManager.e(1.0f, 1.0f, 1.0f, 1.0f);
            render.a(c2, d2 - bVA, d3 - bVB, d4 - bVC);
        }
    }

    public boolean e(net.minecraft.entity.c c2, double d2, double d3, double d4, float f2, float f3) {
        return this.a(c2, d2, d3, d4, f2, f3, false);
    }

    public boolean a(net.minecraft.entity.c c2, double d2, double d3, double d4, float f2, float f3, boolean bl2) {
        if (!c2.fX) {
            return false;
        }
        Render<net.minecraft.entity.c> render = null;
        try {
            render = this.O(c2);
            if (render != null && this.aIK != null) {
                try {
                    if (c.bd()) {
                        this.bVM = render;
                    }
                    render.a(c2, d2, d3, d4, f2, f3);
                }
                catch (Throwable throwable) {
                    throw new cl(net.minecraft.crash.a.a(throwable, "Rendering entity in world"));
                }
                if (this.bVL && !c2.isInvisible() && !bl2) {
                    try {
                        this.f(c2, d2, d3, d4, f2, f3);
                    }
                    catch (Throwable throwable) {
                        throw new cl(net.minecraft.crash.a.a(throwable, "Rendering entity hitbox in world"));
                    }
                }
            } else {
                return this.aIK == null;
            }
            return true;
        }
        catch (Throwable throwable) {
            net.minecraft.crash.a a2 = net.minecraft.crash.a.a(throwable, "Rendering entity in world");
            net.minecraft.crash.i i2 = a2.dY("Entity being rendered");
            c2.a(i2);
            net.minecraft.crash.i i3 = a2.dY("Renderer details");
            i3.b("Assigned renderer", render);
            i3.b("Location", net.minecraft.crash.i.K(d2, d3, d4));
            i3.b("Rotation", Float.valueOf(f2));
            i3.b("Delta", Float.valueOf(f3));
            throw new cl(a2);
        }
    }

    private void f(net.minecraft.entity.c c2, double d2, double d3, double d4, float f2, float f3) {
        GlStateManager.an(false);
        GlStateManager.JO();
        GlStateManager.JA();
        GlStateManager.JI();
        GlStateManager.tR();
        float f4 = c2.width / 2.0f;
        net.minecraft.util.a a2 = c2.Us();
        net.minecraft.util.a a3 = new net.minecraft.util.a(a2.dtH - c2.gW + d2, a2.dtI - c2.gX + d3, a2.dtJ - c2.gY + d4, a2.dtK - c2.gW + d2, a2.dtL - c2.gX + d3, a2.dtM - c2.gY + d4);
        RenderGlobal.a(a3, 255, 255, 255, 255);
        if (c2 instanceof r) {
            float f5 = 0.01f;
            RenderGlobal.a(new net.minecraft.util.a(d2 - (double)f4, d3 + (double)c2.getEyeHeight() - (double)0.01f, d4 - (double)f4, d2 + (double)f4, d3 + (double)c2.getEyeHeight() + (double)0.01f, d4 + (double)f4), 255, 0, 0, 255);
        }
        Tessellator tessellator = Tessellator.Li();
        WorldRenderer worldRenderer = tessellator.Lj();
        da da2 = c2.O(f3);
        worldRenderer.a(3, DefaultVertexFormats.cbF);
        worldRenderer.F(d2, d3 + (double)c2.getEyeHeight(), d4).s(0, 0, 255, 255).Lx();
        worldRenderer.F(d2 + da2.dAG * 2.0, d3 + (double)c2.getEyeHeight() + da2.dAH * 2.0, d4 + da2.dAI * 2.0).s(0, 0, 255, 255).Lx();
        tessellator.pZ();
        GlStateManager.JN();
        GlStateManager.Jz();
        GlStateManager.JH();
        GlStateManager.tR();
        GlStateManager.an(true);
    }

    public void e(net.minecraft.world.w w2) {
        this.baU = w2;
    }

    public double J(double d2, double d3, double d4) {
        double d5 = d2 - this.bVG;
        double d6 = d3 - this.bVH;
        double d7 = d4 - this.bVI;
        return d5 * d5 + d6 * d6 + d7 * d7;
    }

    public agg EA() {
        return this.bVz;
    }

    public void au(boolean bl2) {
        this.bVJ = bl2;
    }

    public Map<Class, Render> Nx() {
        return this.bVw;
    }

    public void h(Map map) {
        this.bVw = map;
    }

    public Map<String, RenderPlayer> Ny() {
        return Collections.unmodifiableMap(this.bVx);
    }
}

