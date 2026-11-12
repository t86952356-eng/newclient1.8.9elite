/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.GameProfile
 *  org.apache.commons.lang3.ArrayUtils
 */
package net.minecraft.client.network;

import com.mojang.authlib.GameProfile;
import net.minecraft.client.Minecraft;
import net.minecraft.client.multiplayer.f;
import net.minecraft.client.network.r;
import net.minecraft.network.ao;
import net.minecraft.network.status.client.b;
import net.minecraft.network.status.server.a;
import net.minecraft.util.an;
import net.minecraft.util.ba;
import org.apache.commons.lang3.ArrayUtils;

class s
implements net.minecraft.network.status.a {
    private boolean bFz = false;
    private boolean bFA = false;
    private long bFB = 0L;
    final /* synthetic */ net.minecraft.network.r bFC;
    final /* synthetic */ f bFD;
    final /* synthetic */ r bFE;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    s(r r2, net.minecraft.network.r r3, f f2) {
        this.bFE = r2;
        this.bFC = r3;
        this.bFD = f2;
    }

    @Override
    public void a(a a2) {
        if (this.bFA) {
            this.bFC.i(new net.minecraft.util.s("Received unrequested status"));
        } else {
            CharSequence charSequence;
            this.bFA = true;
            ao ao2 = a2.aix();
            this.bFD.bDJ = ao2.afB() != null ? ao2.afB().getFormattedText() : "";
            if (ao2.afD() != null) {
                this.bFD.bDM = ao2.afD().getName();
                this.bFD.bDL = ao2.afD().afF();
            } else {
                this.bFD.bDM = "Old";
                this.bFD.bDL = 0;
            }
            if (ao2.afC() != null) {
                this.bFD.bDI = String.valueOf((Object)an.dvS) + ao2.afC().afG() + String.valueOf((Object)an.dvT) + "/" + String.valueOf((Object)an.dvS) + ao2.afC().getMaxPlayers();
                if (ArrayUtils.isNotEmpty((Object[])ao2.afC().afH())) {
                    charSequence = new StringBuilder();
                    for (GameProfile gameProfile : ao2.afC().afH()) {
                        if (((StringBuilder)charSequence).length() > 0) {
                            ((StringBuilder)charSequence).append("\n");
                        }
                        ((StringBuilder)charSequence).append(gameProfile.getName());
                    }
                    if (ao2.afC().afH().length < ao2.afC().afG()) {
                        if (((StringBuilder)charSequence).length() > 0) {
                            ((StringBuilder)charSequence).append("\n");
                        }
                        ((StringBuilder)charSequence).append("... and ").append(ao2.afC().afG() - ao2.afC().afH().length).append(" more ...");
                    }
                    this.bFD.bDO = ((StringBuilder)charSequence).toString();
                }
            } else {
                this.bFD.bDI = String.valueOf((Object)an.dvT) + "???";
            }
            if (ao2.afE() != null) {
                charSequence = ao2.afE();
                if (((String)charSequence).startsWith("data:image/png;base64,")) {
                    this.bFD.dc(((String)charSequence).substring("data:image/png;base64,".length()));
                } else {
                    r.bFx.error("Invalid server icon (unknown format)");
                }
            } else {
                this.bFD.dc(null);
            }
            this.bFB = Minecraft.Bj();
            this.bFC.B(new b(this.bFB));
            this.bFz = true;
        }
    }

    @Override
    public void a(net.minecraft.network.status.server.b b2) {
        long l2 = this.bFB;
        long l3 = Minecraft.Bj();
        this.bFD.bDK = l3 - l2;
        this.bFC.i(new net.minecraft.util.s("Finished"));
    }

    @Override
    public void f(ba ba2) {
        if (!this.bFz) {
            r.bFx.error("Can't ping " + this.bFD.bDH + ": " + ba2.arq());
            this.bFD.bDJ = String.valueOf((Object)an.dvP) + "Can't connect to server.";
            this.bFD.bDI = "";
            this.bFE.g(this.bFD);
        }
    }
}

