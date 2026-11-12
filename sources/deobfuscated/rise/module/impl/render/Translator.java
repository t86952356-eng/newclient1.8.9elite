/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONArray
 */
package rise.module.impl.render;

import hackclient.rise.aef;
import hackclient.rise.aks;
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
import rise.event.EventLink;
import rise.event.Listener;
import rise.event.impl.PacketReceiveEvent;
import rise.module.Category;
import rise.module.Mode;
import rise.module.Module;
import rise.module.ModuleInfo;
import rise.value.ModeValue;

@ModuleInfo(aliases={"module.other.translator.name"}, description="Translates your chat, might not work with some VPNs", category=Category.RENDER)
public class Translator
extends Module {
    Executor ZQ = Executors.newFixedThreadPool(1);
    private final ModeValue ZR = new ModeValue("Mode", this).a(new Mode[]{new aks("Delay")}).a(new Mode[]{new aks("Resend")}).co("Delay");
    @EventLink
    public final Listener<PacketReceiveEvent> ZS = packetReceiveEvent -> {
        if (Translator.aER.bgF == null || Translator.aER.bgK == null) {
            return;
        }
        aj<?> aj2 = packetReceiveEvent.dq();
        if (aj2 instanceof net.minecraft.network.play.server.c) {
            net.minecraft.network.play.server.c c2 = (net.minecraft.network.play.server.c)aj2;
            ba ba2 = c2.DM();
            String string = ba2.getFormattedText();
            if (string.contains("\n")) {
                return;
            }
            switch (((Mode)this.ZR.wD()).getName()) {
                case "Delay": {
                    packetReceiveEvent.cF();
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
            Translator.aER.bgK.a(s2);
        });
    }
}

