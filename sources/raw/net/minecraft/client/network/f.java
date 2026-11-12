/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.GameProfile
 *  com.mojang.authlib.exceptions.AuthenticationException
 *  com.mojang.authlib.exceptions.AuthenticationUnavailableException
 *  com.mojang.authlib.exceptions.InvalidCredentialsException
 *  com.mojang.authlib.minecraft.MinecraftSessionService
 *  io.netty.util.concurrent.GenericFutureListener
 */
package net.minecraft.client.network;

import com.mojang.authlib.GameProfile;
import com.mojang.authlib.exceptions.AuthenticationException;
import com.mojang.authlib.exceptions.AuthenticationUnavailableException;
import com.mojang.authlib.exceptions.InvalidCredentialsException;
import com.mojang.authlib.minecraft.MinecraftSessionService;
import io.netty.util.concurrent.GenericFutureListener;
import java.math.BigInteger;
import java.security.PublicKey;
import javax.crypto.SecretKey;
import net.minecraft.client.d;
import net.minecraft.client.gui.bp;
import net.minecraft.client.gui.q;
import net.minecraft.client.network.g;
import net.minecraft.client.network.h;
import net.minecraft.network.login.server.a;
import net.minecraft.network.login.server.b;
import net.minecraft.network.login.server.c;
import net.minecraft.network.r;
import net.minecraft.util.ac;
import net.minecraft.util.ba;
import net.minecraft.util.t;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class f
implements net.minecraft.network.login.a {
    private static final Logger bED = LogManager.getLogger();
    private final d bEE;
    private final bp bEF;
    private final r bEG;
    private GameProfile bEH;

    public f(r r2, d d2, bp bp2) {
        this.bEG = r2;
        this.bEE = d2;
        this.bEF = bp2;
    }

    @Override
    public void a(b b2) {
        SecretKey secretKey = ac.arV();
        String string = b2.afM();
        PublicKey publicKey = b2.afN();
        String string2 = new BigInteger(ac.a(string, publicKey, secretKey)).toString(16);
        if (this.bEE.Be() != null && this.bEE.Be().HG()) {
            try {
                this.BA().joinServer(this.bEE.Bl().afK(), this.bEE.Bl().atE(), string2);
            }
            catch (AuthenticationException authenticationException) {
                bED.warn("Couldn't connect to auth servers but will continue to join LAN");
            }
        } else {
            try {
                this.BA().joinServer(this.bEE.Bl().afK(), this.bEE.Bl().atE(), string2);
            }
            catch (AuthenticationUnavailableException authenticationUnavailableException) {
                this.bEG.i(new t("disconnect.loginFailedInfo", new t("disconnect.loginFailedInfo.serversUnavailable", new Object[0])));
                return;
            }
            catch (InvalidCredentialsException invalidCredentialsException) {
                this.bEG.i(new t("disconnect.loginFailedInfo", new t("disconnect.loginFailedInfo.invalidSession", new Object[0])));
                return;
            }
            catch (AuthenticationException authenticationException) {
                this.bEG.i(new t("disconnect.loginFailedInfo", authenticationException.getMessage()));
                return;
            }
        }
        this.bEG.a(new net.minecraft.network.login.client.b(secretKey, publicKey, b2.afO()), new g(this, secretKey), new GenericFutureListener[0]);
    }

    private MinecraftSessionService BA() {
        return this.bEE.BA();
    }

    @Override
    public void a(c c2) {
        this.bEH = c2.afK();
        this.bEG.a(net.minecraft.network.a.cYG);
        this.bEG.b(new h(this.bEE, this.bEF, this.bEG, this.bEH));
    }

    @Override
    public void f(ba ba2) {
        this.bEE.a(new q(this.bEF, "connect.failed", ba2));
    }

    @Override
    public void a(a a2) {
        this.bEG.i(a2.afL());
    }

    @Override
    public void a(net.minecraft.network.login.server.d d2) {
        if (!this.bEG.afc()) {
            this.bEG.gp(d2.afP());
        }
    }
}

