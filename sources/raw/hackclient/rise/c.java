/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.ahd;
import hackclient.rise.d;
import java.util.HashMap;
import net.minecraft.client.network.o;
import net.minecraft.event.a;
import net.minecraft.event.b;
import net.minecraft.init.Items;
import net.minecraft.util.s;
import net.minecraft.util.v;

public final class c
implements ahd {
    private final net.minecraft.client.d P = net.minecraft.client.d.AZ();
    private final HashMap<String, s> Q = new HashMap();

    public void a(d d2) {
        aNC.execute(() -> {
            String string = "\u00a7c";
            String string2 = "\u00a7c";
            String string3 = d2.N().Y().xU();
            String string4 = string3 + d2.O().R() + d2.O().S();
            String string5 = "\u00a7cRise \u00a7c\u00bb \u00a7c%player%\u00a77 has failed \u00a7c%check% \u00a77(\u00a7c%type%\u00a77)%dev% (Violations: \u00a7c%vl%\u00a77)".replaceAll("%player%", string3).replaceAll("%check%", d2.O().R()).replaceAll("%type%", d2.O().S()).replaceAll("%dev%", "").replaceAll("%vl%", String.valueOf(d2.P()));
            o o2 = this.P.AU().d(this.P.bgK.Ul());
            o o3 = this.P.AU().d(d2.N().Y().Ul());
            int n2 = o2 == null || this.P.isSingleplayer() ? 0 : o2.Ig();
            int n3 = o3 == null || this.P.isSingleplayer() ? 0 : o3.Ig();
            String string6 = "\u00a7dDescription: \u00a7f" + d2.O().description().concat("\n").concat("\u00a7dYour Ping: " + n2).concat("\n").concat("\u00a7dTheir Ping: " + n3);
            v v2 = new v().a(new net.minecraft.event.c(net.minecraft.event.d.cKU, new s(string6)));
            if ("Flight".equalsIgnoreCase(d2.O().R()) || this.P.bgK.cHV.fi(0) != null && this.P.bgK.cHV.fi(0).bP() == Items.cQU) {
                return;
            }
            Object object = ".target add " + string3;
            if (((String)object).startsWith("/")) {
                object = ((String)object).substring(1);
            }
            s s2 = new s("\u00a77[\u00a7cTarget Player\u00a77]");
            s2.a(new v().a(new a(b.cKK, (String)object)).a(new net.minecraft.event.c(net.minecraft.event.d.cKU, new s("Click to run: " + (String)object))));
            s s3 = new s(string5);
            s3.a(v2);
            s3.n(s2);
            HashMap<String, s> hashMap = this.Q;
            synchronized (hashMap) {
                if (this.Q.containsKey(string4)) {
                    s s4 = this.Q.get(string4);
                    s4.a(v2);
                    s4.aro().clear();
                    s4.n(s2);
                } else {
                    this.Q.put(string4, s3);
                    this.P.f(() -> this.P.bgK.a(s3));
                }
            }
        });
    }
}

