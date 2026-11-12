/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.GameProfile
 */
package net.minecraft.client.entity;

import com.mojang.authlib.GameProfile;
import hackclient.rise.fp;
import net.minecraft.client.Minecraft;
import net.minecraft.client.network.o;
import net.minecraft.client.renderer.ImageBufferDownload;
import net.minecraft.client.renderer.ThreadDownloadImageData;
import net.minecraft.client.renderer.texture.ITextureObject;
import net.minecraft.client.renderer.texture.TextureManager;
import net.minecraft.client.resources.DefaultPlayerSkin;
import net.minecraft.entity.ai.attributes.e;
import net.minecraft.entity.aj;
import net.minecraft.init.Items;
import net.minecraft.util.cm;
import net.minecraft.util.ct;
import net.minecraft.util.da;
import net.minecraft.world.ao;
import net.minecraft.world.w;
import net.optifine.player.b;
import net.optifine.reflect.g;
import rise.Client;
import rise.util.math.Vector2f;

public abstract class a
extends net.minecraft.entity.player.a {
    private o bjQ;
    private cm bjR = null;
    private long bjS = 0L;
    private boolean bjT = false;
    private String bjU = null;
    private static final cm bjV = new cm("textures/entity/elytra.png");

    public a(w w2, GameProfile gameProfile) {
        super(w2, gameProfile);
        this.bjU = gameProfile.getName();
        if (this.bjU != null && !this.bjU.isEmpty()) {
            this.bjU = ct.gs(this.bjU);
        }
        b.g(this);
        net.optifine.player.g.i(this);
    }

    @Override
    public boolean CZ() {
        o o2 = Minecraft.getMinecraft().AU().d(this.Ie().getId());
        return o2 != null && o2.If() == net.minecraft.world.ao.dEA;
    }

    public boolean Da() {
        return this.Db() != null;
    }

    protected o Db() {
        if (this.bjQ == null) {
            this.bjQ = Minecraft.getMinecraft().AU().d(this.Ul());
        }
        return this.bjQ;
    }

    public boolean Dc() {
        o o2 = this.Db();
        return o2 != null && o2.Ih();
    }

    public cm Dd() {
        o o2 = this.Db();
        return o2 == null ? DefaultPlayerSkin.e(this.Ul()) : o2.Dd();
    }

    public cm De() {
        if (!net.minecraft.src.a.aoz()) {
            return null;
        }
        if (this.bjS != 0L && System.currentTimeMillis() > this.bjS) {
            b.h(this);
            this.bjS = 0L;
        }
        if (this.bjR != null) {
            return this.bjR;
        }
        o o2 = this.Db();
        return o2 == null ? null : o2.De();
    }

    public static ThreadDownloadImageData a(cm cm2, String string) {
        TextureManager textureManager = Minecraft.getMinecraft().Bq();
        ITextureObject iTextureObject = textureManager.k(cm2);
        if (iTextureObject == null) {
            iTextureObject = new ThreadDownloadImageData(null, String.format("http://skins.minecraft.net/MinecraftSkins/%s.png", ct.gs(string)), DefaultPlayerSkin.e(a.el(string)), new ImageBufferDownload());
            textureManager.a(cm2, iTextureObject);
        }
        return (ThreadDownloadImageData)iTextureObject;
    }

    public static cm cE(String string) {
        return new cm("skins/" + ct.gs(string));
    }

    public String Df() {
        o o2 = this.Db();
        return o2 == null ? DefaultPlayerSkin.f(this.Ul()) : o2.Df();
    }

    public float Dg() {
        int n2;
        float f2 = 1.0f;
        if (this.cIt.cJK) {
            f2 *= 1.1f;
        }
        e e2 = this.a(aj.cwp);
        double d2 = e2.XB();
        if (this.a(net.minecraft.potion.a.dgw)) {
            n2 = this.b(net.minecraft.potion.a.dgw).ajf() + 1;
            d2 /= 1.0 + (double)n2 * (double)0.2f;
        }
        f2 = (float)((double)f2 * ((d2 / (double)this.cIt.getWalkSpeed() + 1.0) / 2.0));
        if (this.cIt.getWalkSpeed() == 0.0f || Float.isNaN(f2) || Float.isInfinite(f2)) {
            f2 = 1.0f;
        }
        if (this.isUsingItem() && this.abF().bP() == Items.cPj) {
            n2 = this.abH();
            float f3 = (float)n2 / 20.0f;
            f3 = f3 > 1.0f ? 1.0f : (f3 *= f3);
            f2 *= 1.0f - f3 * 0.15f;
        }
        return g.epe.aDA() ? g.d(g.epe, this, Float.valueOf(f2)) : f2;
    }

    public String Dh() {
        return this.bjU;
    }

    public cm Di() {
        return this.bjR;
    }

    public void f(cm cm2) {
        this.bjR = cm2;
    }

    public boolean Dj() {
        cm cm2 = this.De();
        return cm2 != null && (cm2 != this.bjR || this.bjT);
    }

    public void U(boolean bl2) {
        this.bjT = bl2;
    }

    public boolean Dk() {
        return this.bjT;
    }

    public long Dl() {
        return this.bjS;
    }

    public void m(long l2) {
        this.bjS = l2;
    }

    @Override
    public da O(float f2) {
        float f3 = this.pl;
        float f4 = this.pm;
        fp fp2 = new fp(new Vector2f(f3, f4));
        Client.a.e().d(fp2);
        f3 = fp2.dy().x;
        f4 = fp2.dy().y;
        return this.s(f4, f3);
    }
}

