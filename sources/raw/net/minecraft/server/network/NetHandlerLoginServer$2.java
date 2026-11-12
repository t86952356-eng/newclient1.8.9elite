/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.GameProfile
 *  com.mojang.authlib.exceptions.AuthenticationUnavailableException
 */
package net.minecraft.server.network;

import com.mojang.authlib.GameProfile;
import com.mojang.authlib.exceptions.AuthenticationUnavailableException;
import java.math.BigInteger;
import java.util.Objects;
import net.minecraft.server.network.NetHandlerLoginServer;
import net.minecraft.server.network.NetHandlerLoginServer$LoginState;
import net.minecraft.util.ac;

class NetHandlerLoginServer$2
extends Thread {
    final /* synthetic */ NetHandlerLoginServer dny;

    NetHandlerLoginServer$2(NetHandlerLoginServer netHandlerLoginServer, String string) {
        this.dny = netHandlerLoginServer;
        super(string);
    }

    @Override
    public void run() {
        GameProfile gameProfile = this.dny.dnt;
        try {
            Objects.requireNonNull(this.dny);
            String string = new BigInteger(ac.a("", this.dny.dnp.alj().getPublic(), this.dny.dnv)).toString(16);
            this.dny.dnt = this.dny.dnp.alQ().hasJoinedServer(new GameProfile(null, gameProfile.getName()), string);
            if (this.dny.dnt != null) {
                NetHandlerLoginServer.dnm.info("UUID of player " + this.dny.dnt.getName() + " is " + String.valueOf(this.dny.dnt.getId()));
                this.dny.dnr = NetHandlerLoginServer$LoginState.dnC;
            } else if (this.dny.dnp.all()) {
                NetHandlerLoginServer.dnm.warn("Failed to verify username but will let them in anyway!");
                this.dny.dnt = this.dny.r(gameProfile);
                this.dny.dnr = NetHandlerLoginServer$LoginState.dnC;
            } else {
                this.dny.fL("Failed to verify username!");
                NetHandlerLoginServer.dnm.error("Username '" + this.dny.dnt.getName() + "' tried to join with an invalid session");
            }
        }
        catch (AuthenticationUnavailableException authenticationUnavailableException) {
            if (this.dny.dnp.all()) {
                NetHandlerLoginServer.dnm.warn("Authentication servers are down but will let them in anyway!");
                this.dny.dnt = this.dny.r(gameProfile);
                this.dny.dnr = NetHandlerLoginServer$LoginState.dnC;
            }
            this.dny.fL("Authentication servers are down. Please try again later, sorry!");
            NetHandlerLoginServer.dnm.error("Couldn't verify username because servers are unavailable");
        }
    }
}

