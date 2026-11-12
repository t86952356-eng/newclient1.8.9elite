/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.multiplayer;

import java.net.InetAddress;
import java.net.UnknownHostException;
import net.minecraft.client.gui.q;
import net.minecraft.client.multiplayer.b;
import net.minecraft.client.network.f;
import net.minecraft.network.handshake.client.a;
import net.minecraft.network.r;
import net.minecraft.util.t;

class c
extends Thread {
    final /* synthetic */ String bDp;
    final /* synthetic */ int bDq;
    final /* synthetic */ b bDr;

    c(b b2, String string, String string2, int n2) {
        this.bDr = b2;
        this.bDp = string2;
        this.bDq = n2;
        super(string);
    }

    @Override
    public void run() {
        InetAddress inetAddress = null;
        try {
            if (this.bDr.bDn) {
                return;
            }
            inetAddress = InetAddress.getByName(this.bDp);
            this.bDr.jS = r.a(inetAddress, this.bDq, b.aER.aIY.QO());
            this.bDr.jS.b(new f(this.bDr.jS, b.aER, this.bDr.bDo));
            this.bDr.jS.B(new a(47, this.bDp, this.bDq, net.minecraft.network.a.cYI));
            this.bDr.jS.B(new net.minecraft.network.login.client.a(b.aER.Bl().afK()));
        }
        catch (UnknownHostException unknownHostException) {
            if (this.bDr.bDn) {
                return;
            }
            b.bDm.error("Couldn't connect to server", (Throwable)unknownHostException);
            b.aER.a(new q(this.bDr.bDo, "connect.failed", new t("disconnect.genericReason", "Unknown host")));
        }
        catch (Exception exception) {
            if (this.bDr.bDn) {
                return;
            }
            b.bDm.error("Couldn't connect to server", (Throwable)exception);
            String string = exception.toString();
            if (inetAddress != null) {
                String string2 = String.valueOf(inetAddress) + ":" + this.bDq;
                string = string.replaceAll(string2, "");
            }
            b.aER.a(new q(this.bDr.bDo, "connect.failed", new t("disconnect.genericReason", string)));
        }
    }
}

