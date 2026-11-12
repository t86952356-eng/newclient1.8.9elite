/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonParseException
 */
package net.minecraft.tileentity;

import com.google.gson.JsonParseException;
import net.minecraft.command.ab;
import net.minecraft.command.n;
import net.minecraft.event.a;
import net.minecraft.event.b;
import net.minecraft.network.aj;
import net.minecraft.network.play.server.bd;
import net.minecraft.server.MinecraftServer;
import net.minecraft.tileentity.ah;
import net.minecraft.tileentity.ai;
import net.minecraft.tileentity.d;
import net.minecraft.util.ba;
import net.minecraft.util.bb;
import net.minecraft.util.m;
import net.minecraft.util.s;
import net.minecraft.util.v;

public class ag
extends d {
    public final ba[] dtx = new ba[]{new s(""), new s(""), new s(""), new s("")};
    public int dty = -1;
    private boolean dtz = true;
    private net.minecraft.entity.player.a bij;
    private final ab dtA = new ab();

    @Override
    public void b(net.minecraft.nbt.n n2) {
        super.b(n2);
        for (int i2 = 0; i2 < 4; ++i2) {
            String string = bb.q(this.dtx[i2]);
            n2.R("Text" + (i2 + 1), string);
        }
        this.dtA.g(n2);
    }

    @Override
    public void a(net.minecraft.nbt.n n2) {
        this.dtz = false;
        super.a(n2);
        ah ah2 = new ah(this);
        for (int i2 = 0; i2 < 4; ++i2) {
            String string = n2.eK("Text" + (i2 + 1));
            try {
                ba ba2 = bb.gi(string);
                try {
                    this.dtx[i2] = m.a(ah2, ba2, null);
                }
                catch (n n3) {
                    this.dtx[i2] = ba2;
                }
                continue;
            }
            catch (JsonParseException jsonParseException) {
                this.dtx[i2] = new s(string);
            }
        }
        this.dtA.f(n2);
    }

    @Override
    public aj apQ() {
        ba[] baArray = new ba[4];
        System.arraycopy(this.dtx, 0, baArray, 0, 4);
        return new bd(this.baU, this.aZf, baArray);
    }

    @Override
    public boolean apV() {
        return true;
    }

    public boolean aqO() {
        return this.dtz;
    }

    public void cq(boolean bl2) {
        this.dtz = bl2;
        if (!bl2) {
            this.bij = null;
        }
    }

    public void J(net.minecraft.entity.player.a a2) {
        this.bij = a2;
    }

    public net.minecraft.entity.player.a aqP() {
        return this.bij;
    }

    public boolean K(net.minecraft.entity.player.a a2) {
        ai ai2 = new ai(this, a2);
        for (int i2 = 0; i2 < this.dtx.length; ++i2) {
            a a3;
            v v2;
            v v3 = v2 = this.dtx[i2] == null ? null : this.dtx[i2].arp();
            if (v2 == null || v2.arB() == null || (a3 = v2.arB()).acS() != b.cKK) continue;
            MinecraftServer.afs().ali().i(ai2, a3.SN());
        }
        return true;
    }

    public ab aqQ() {
        return this.dtA;
    }
}

