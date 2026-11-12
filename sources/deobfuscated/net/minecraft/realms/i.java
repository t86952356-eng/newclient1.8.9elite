/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.realms;

import java.net.InetAddress;
import java.net.UnknownHostException;
import net.minecraft.client.Minecraft;
import net.minecraft.client.network.f;
import net.minecraft.network.r;
import net.minecraft.realms.a;
import net.minecraft.realms.b;
import net.minecraft.realms.h;
import net.minecraft.util.t;

class i
extends Thread {
    final /* synthetic */ String diz;
    final /* synthetic */ int diA;
    final /* synthetic */ h diB;

    i(h h2, String string, String string2, int n2) {
        this.diB = h2;
        this.diz = string2;
        this.diA = n2;
        super(string);
    }

    @Override
    public void run() {
        InetAddress inetAddress = null;
        try {
            inetAddress = InetAddress.getByName(this.diz);
            if (this.diB.dix) {
                return;
            }
            this.diB.diy = r.a(inetAddress, this.diA, Minecraft.getMinecraft().aIY.QO());
            if (this.diB.dix) {
                return;
            }
            this.diB.diy.b(new f(this.diB.diy, Minecraft.getMinecraft(), this.diB.diw.getProxy()));
            if (this.diB.dix) {
                return;
            }
            this.diB.diy.B(new net.minecraft.network.handshake.client.a(47, this.diz, this.diA, net.minecraft.network.a.cYI));
            if (this.diB.dix) {
                return;
            }
            this.diB.diy.B(new net.minecraft.network.login.client.a(Minecraft.getMinecraft().Bl().afK()));
        }
        catch (UnknownHostException unknownHostException) {
            b.ajI();
            if (this.diB.dix) {
                return;
            }
            h.div.error("Couldn't connect to world", (Throwable)unknownHostException);
            Minecraft.getMinecraft().Bs().PN();
            b.a(new a(this.diB.diw, "connect.failed", new t("disconnect.genericReason", "Unknown host '" + this.diz + "'")));
        }
        catch (Exception exception) {
            b.ajI();
            if (this.diB.dix) {
                return;
            }
            h.div.error("Couldn't connect to world", (Throwable)exception);
            String string = exception.toString();
            if (inetAddress != null) {
                String string2 = String.valueOf(inetAddress) + ":" + this.diA;
                string = string.replaceAll(string2, "");
            }
            b.a(new a(this.diB.diw, "connect.failed", new t("disconnect.genericReason", string)));
        }
    }
}

