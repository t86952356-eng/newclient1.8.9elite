/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Objects
 *  com.mojang.authlib.GameProfile
 */
package net.minecraft.client.network;

import com.google.common.base.Objects;
import com.mojang.authlib.GameProfile;
import net.minecraft.client.Minecraft;
import net.minecraft.client.network.p;
import net.minecraft.client.resources.DefaultPlayerSkin;
import net.minecraft.network.play.server.bk;
import net.minecraft.scoreboard.h;
import net.minecraft.util.ba;
import net.minecraft.util.cm;
import net.minecraft.world.ao;

public class o {
    private final GameProfile bFh;
    private ao bFi;
    private int bFj;
    private boolean bFk = false;
    public cm bFl;
    public cm bFm;
    private String bFn;
    private ba bFo;
    private int bFp = 0;
    private int bFq = 0;
    private long bFr = 0L;
    private long bFs = 0L;
    private long bFt = 0L;

    public o(GameProfile gameProfile) {
        this.bFh = gameProfile;
    }

    public o(bk bk2) {
        this.bFh = bk2.afK();
        this.bFi = bk2.ahQ();
        this.bFj = bk2.aG();
        this.bFo = bk2.xW();
    }

    public GameProfile Ie() {
        return this.bFh;
    }

    public ao If() {
        return this.bFi;
    }

    public int Ig() {
        return this.bFj;
    }

    protected void a(ao ao2) {
        this.bFi = ao2;
    }

    protected void cp(int n2) {
        this.bFj = n2;
    }

    public boolean Ih() {
        return this.bFl != null;
    }

    public String Df() {
        return this.bFn == null ? DefaultPlayerSkin.f(this.bFh.getId()) : this.bFn;
    }

    public cm Dd() {
        if (this.bFl == null) {
            this.Ij();
        }
        return (cm)Objects.firstNonNull((Object)this.bFl, (Object)DefaultPlayerSkin.e(this.bFh.getId()));
    }

    public cm De() {
        if (this.bFm == null) {
            this.Ij();
        }
        return this.bFm;
    }

    public h Ii() {
        return Minecraft.getMinecraft().bgF.SD().fs(this.Ie().getName());
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void Ij() {
        o o2 = this;
        synchronized (o2) {
            if (!this.bFk) {
                this.bFk = true;
                Minecraft.getMinecraft().BB().a(this.bFh, new p(this), true);
            }
        }
    }

    public void g(ba ba2) {
        this.bFo = ba2;
    }

    public ba xW() {
        return this.bFo;
    }

    public int Ik() {
        return this.bFp;
    }

    public void cq(int n2) {
        this.bFp = n2;
    }

    public int Il() {
        return this.bFq;
    }

    public void cr(int n2) {
        this.bFq = n2;
    }

    public long Im() {
        return this.bFr;
    }

    public void p(long l2) {
        this.bFr = l2;
    }

    public long In() {
        return this.bFs;
    }

    public void q(long l2) {
        this.bFs = l2;
    }

    public long Io() {
        return this.bFt;
    }

    public void r(long l2) {
        this.bFt = l2;
    }
}

