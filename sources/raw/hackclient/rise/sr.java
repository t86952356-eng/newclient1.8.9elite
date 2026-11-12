/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONArray
 */
package hackclient.rise;

import hackclient.rise.aef;
import hackclient.rise.akg;
import hackclient.rise.akp;
import hackclient.rise.aks;
import hackclient.rise.dk;
import hackclient.rise.dm;
import hackclient.rise.fh;
import hackclient.rise.gi;
import hackclient.rise.gj;
import hackclient.rise.gl;
import java.net.URLEncoder;
import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import net.minecraft.event.c;
import net.minecraft.event.d;
import net.minecraft.network.aj;
import net.minecraft.util.ba;
import net.minecraft.util.s;
import net.minecraft.util.v;
import org.json.JSONArray;

@gl(aliases={"module.other.translator.name"}, description="Translates your chat, might not work with some VPNs", category=gj.RENDER)
public class sr
extends gi {
    Executor ZQ = Executors.newFixedThreadPool(1);
    private final akp ZR = new akp("Mode", this).a(new akg[]{new aks("Delay")}).a(new akg[]{new aks("Resend")}).co("Delay");
    @dm
    public final dk<fh> ZS = fh2 -> {
        if (sr.aER.bgF == null || sr.aER.bgK == null) {
            return;
        }
        aj<?> aj2 = fh2.dq();
        if (aj2 instanceof net.minecraft.network.play.server.c) {
            net.minecraft.network.play.server.c c2 = (net.minecraft.network.play.server.c)aj2;
            ba ba2 = c2.DM();
            String string = ba2.getFormattedText();
            if (string.contains("\n")) {
                return;
            }
            switch (((akg)this.ZR.wD()).getName()) {
                case "Delay": {
                    fh2.cF();
                    this.U(string);
                    break;
                }
                case "Resend": {
                    this.U(string);
                }
            }
        }
    };

    public void U(String string) {
        this.ZQ.execute(() -> {
            JSONArray jSONArray = new JSONArray(aef.t("https://translate.googleapis.com/translate_a/single?client=gtx&sl=auto&tl=en&dt=t&q=" + URLEncoder.encode(string), "GET"));
            String string2 = jSONArray.getJSONArray(0).getJSONArray(0).getString(0);
            s s2 = new s(string2);
            String string3 = new Locale(jSONArray.getString(2)).getDisplayLanguage(Locale.ENGLISH);
            if (!string2.equals(string)) {
                s2.ga(" ");
                s s3 = new s(String.valueOf((Object)this.rP().rX()) + "[T]");
                v v2 = new v();
                v2.a(new c(d.cKU, new s("Translated from " + string3 + "\n" + string)));
                s3.a(v2);
                s2.n(s3);
            }
            sr.aER.bgK.a(s2);
        });
    }
}

