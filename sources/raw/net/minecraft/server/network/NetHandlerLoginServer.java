/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Charsets
 *  com.mojang.authlib.GameProfile
 *  io.netty.util.concurrent.Future
 *  io.netty.util.concurrent.GenericFutureListener
 *  org.apache.commons.lang3.Validate
 */
package net.minecraft.server.network;

import com.google.common.base.Charsets;
import com.mojang.authlib.GameProfile;
import io.netty.util.concurrent.Future;
import io.netty.util.concurrent.GenericFutureListener;
import java.security.PrivateKey;
import java.util.Arrays;
import java.util.Random;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;
import javax.crypto.SecretKey;
import net.minecraft.entity.player.e;
import net.minecraft.network.login.server.a;
import net.minecraft.network.login.server.b;
import net.minecraft.network.login.server.c;
import net.minecraft.network.login.server.d;
import net.minecraft.network.r;
import net.minecraft.server.MinecraftServer;
import net.minecraft.server.network.NetHandlerLoginServer$1;
import net.minecraft.server.network.NetHandlerLoginServer$2;
import net.minecraft.server.network.NetHandlerLoginServer$LoginState;
import net.minecraft.util.ba;
import net.minecraft.util.bi;
import net.minecraft.util.s;
import org.apache.commons.lang3.Validate;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class NetHandlerLoginServer
implements net.minecraft.network.login.b,
bi {
    private static final AtomicInteger dnl = new AtomicInteger(0);
    private static final Logger dnm = LogManager.getLogger();
    private static final Random dnn = new Random();
    private final byte[] dno = new byte[4];
    private final MinecraftServer dnp;
    public final r dnq;
    private NetHandlerLoginServer$LoginState dnr = NetHandlerLoginServer$LoginState.dnz;
    private int dns;
    private GameProfile dnt;
    private final String dnu = "";
    private SecretKey dnv;
    private e dnw;

    public NetHandlerLoginServer(MinecraftServer minecraftServer, r r2) {
        this.dnp = minecraftServer;
        this.dnq = r2;
        dnn.nextBytes(this.dno);
    }

    @Override
    public void jA() {
        e e2;
        if (this.dnr == NetHandlerLoginServer$LoginState.dnC) {
            this.amJ();
        } else if (this.dnr == NetHandlerLoginServer$LoginState.dnD && (e2 = this.dnp.alE().m(this.dnt.getId())) == null) {
            this.dnr = NetHandlerLoginServer$LoginState.dnC;
            this.dnp.alE().a(this.dnq, this.dnw);
            this.dnw = null;
        }
        if (this.dns++ == 600) {
            this.fL("Took too long to log in");
        }
    }

    public void fL(String string) {
        try {
            dnm.info("Disconnecting " + this.amK() + ": " + string);
            s s2 = new s(string);
            this.dnq.B(new a(s2));
            this.dnq.i(s2);
        }
        catch (Exception exception) {
            dnm.error("Error whilst disconnecting player", (Throwable)exception);
        }
    }

    public void amJ() {
        String string;
        if (!this.dnt.isComplete()) {
            this.dnt = this.r(this.dnt);
        }
        if ((string = this.dnp.alE().a(this.dnq.afb(), this.dnt)) != null) {
            this.fL(string);
        } else {
            this.dnr = NetHandlerLoginServer$LoginState.dnE;
            if (this.dnp.alW() >= 0 && !this.dnq.afc()) {
                this.dnq.a(new d(this.dnp.alW()), (GenericFutureListener<? extends Future<? super Void>>)new NetHandlerLoginServer$1(this), new GenericFutureListener[0]);
            }
            this.dnq.B(new c(this.dnt));
            e e2 = this.dnp.alE().m(this.dnt.getId());
            if (e2 != null) {
                this.dnr = NetHandlerLoginServer$LoginState.dnD;
                this.dnw = this.dnp.alE().g(this.dnt);
            } else {
                this.dnp.alE().a(this.dnq, this.dnp.alE().g(this.dnt));
            }
        }
    }

    @Override
    public void f(ba ba2) {
        dnm.info(this.amK() + " lost connection: " + ba2.arq());
    }

    public String amK() {
        return this.dnt != null ? String.valueOf(this.dnt) + " (" + this.dnq.afb().toString() + ")" : String.valueOf(this.dnq.afb());
    }

    @Override
    public void a(net.minecraft.network.login.client.a a2) {
        Validate.validState((this.dnr == NetHandlerLoginServer$LoginState.dnz ? 1 : 0) != 0, (String)"Unexpected hello packet", (Object[])new Object[0]);
        this.dnt = a2.afK();
        if (this.dnp.alu() && !this.dnq.afc()) {
            this.dnr = NetHandlerLoginServer$LoginState.dnA;
            this.dnq.B(new b(this.dnu, this.dnp.alj().getPublic(), this.dno));
        } else {
            this.dnr = NetHandlerLoginServer$LoginState.dnC;
        }
    }

    @Override
    public void a(net.minecraft.network.login.client.b b2) {
        Validate.validState((this.dnr == NetHandlerLoginServer$LoginState.dnA ? 1 : 0) != 0, (String)"Unexpected key packet", (Object[])new Object[0]);
        PrivateKey privateKey = this.dnp.alj().getPrivate();
        if (!Arrays.equals(this.dno, b2.b(privateKey))) {
            throw new IllegalStateException("Invalid nonce!");
        }
        this.dnv = b2.a(privateKey);
        this.dnr = NetHandlerLoginServer$LoginState.dnB;
        this.dnq.a(this.dnv);
        new NetHandlerLoginServer$2(this, "User Authenticator #" + dnl.incrementAndGet()).start();
    }

    protected GameProfile r(GameProfile gameProfile) {
        UUID uUID = UUID.nameUUIDFromBytes(("OfflinePlayer:" + gameProfile.getName()).getBytes(Charsets.UTF_8));
        return new GameProfile(uUID, gameProfile.getName());
    }
}

