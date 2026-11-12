/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.GameProfile
 *  org.apache.commons.lang3.ArrayUtils
 */
package net.minecraft.realms;

import com.mojang.authlib.GameProfile;
import net.minecraft.network.ao;
import net.minecraft.network.status.server.a;
import net.minecraft.realms.b;
import net.minecraft.realms.q;
import net.minecraft.realms.r;
import net.minecraft.util.ba;
import org.apache.commons.lang3.ArrayUtils;

class s
implements net.minecraft.network.status.a {
    private boolean djc = false;
    final /* synthetic */ q djd;
    final /* synthetic */ net.minecraft.network.r dje;
    final /* synthetic */ String djf;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    s(r r2, q q2, net.minecraft.network.r r3, String string) {
        this.djd = q2;
        this.dje = r3;
        this.djf = string;
    }

    @Override
    public void a(a a2) {
        ao ao2 = a2.aix();
        if (ao2.afC() != null) {
            this.djd.diY = String.valueOf(ao2.afC().afG());
            if (ArrayUtils.isNotEmpty((Object[])ao2.afC().afH())) {
                StringBuilder stringBuilder = new StringBuilder();
                for (GameProfile gameProfile : ao2.afC().afH()) {
                    if (stringBuilder.length() > 0) {
                        stringBuilder.append("\n");
                    }
                    stringBuilder.append(gameProfile.getName());
                }
                if (ao2.afC().afH().length < ao2.afC().afG()) {
                    if (stringBuilder.length() > 0) {
                        stringBuilder.append("\n");
                    }
                    stringBuilder.append("... and ").append(ao2.afC().afG() - ao2.afC().afH().length).append(" more ...");
                }
                this.djd.bDO = stringBuilder.toString();
            }
        } else {
            this.djd.bDO = "";
        }
        this.dje.B(new net.minecraft.network.status.client.b(b.aeY()));
        this.djc = true;
    }

    @Override
    public void a(net.minecraft.network.status.server.b b2) {
        this.dje.i(new net.minecraft.util.s("Finished"));
    }

    @Override
    public void f(ba ba2) {
        if (!this.djc) {
            r.dja.error("Can't ping " + this.djf + ": " + ba2.arq());
        }
    }
}

