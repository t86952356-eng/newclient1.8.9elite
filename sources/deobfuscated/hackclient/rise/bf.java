/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONArray
 *  org.json.JSONObject
 */
package hackclient.rise;

import hackclient.rise.am;
import hackclient.rise.by;
import hackclient.rise.bz;
import hackclient.rise.ce;
import hackclient.rise.er;
import hackclient.rise.fa;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import net.minecraft.network.aj;
import net.minecraft.util.an;
import net.minecraft.util.ba;
import net.minecraft.util.s;
import org.json.JSONArray;
import org.json.JSONObject;
import rip.vantage.commons.packet.impl.client.community.g;
import rip.vantage.commons.packet.impl.server.community.c;
import rip.vantage.network.core.a;
import rise.Client;
import rise.event.EventLink;
import rise.event.Listener;
import rise.event.impl.PacketReceiveEvent;
import rise.event.impl.TickEvent;
import rise.util.InstanceAccess;

public class bf
extends am
implements InstanceAccess {
    public static HashMap<String, by> dc = new HashMap();
    public static List<String> dd = new ArrayList<String>();
    public static List<String> de = new ArrayList<String>();
    @EventLink
    public final Listener<fa> df = fa2 -> {
        dc = new HashMap();
        dd = new ArrayList<String>();
    };
    @EventLink
    public final Listener<TickEvent> dg = tickEvent -> {
        ce.ch();
        ce.cg();
        for (net.minecraft.entity.player.a a2 : bf.aER.bgF.dCY) {
            if (dd.contains(a2.Ie().getName())) continue;
            dd.add(a2.Ie().getName());
            de.add(a2.Ie().getName());
        }
        bf.aZ();
    };
    @EventLink
    public final Listener<er> dh = er2 -> {
        if (er2.dd() instanceof c) {
            c c2 = (c)er2.dd();
            String string = c2.getMessage();
            JSONObject jSONObject = new JSONObject(string);
            for (String string2 : jSONObject.keySet()) {
                JSONObject jSONObject2 = new JSONObject(jSONObject.get(string2).toString());
                String string3 = jSONObject2.getString("f");
                by by2 = new by(string2);
                if (string3.equals("") || string3.equals(" ")) continue;
                by2.o(string3);
                by2.a(bz.gw);
                if (jSONObject2.getBoolean("h")) {
                    by2.a(bz.gy);
                }
                if (jSONObject2.getBoolean("g")) {
                    by2.a(bz.gx);
                }
                if (jSONObject2.getBoolean("i")) {
                    by2.a(bz.gz);
                }
                JSONArray jSONArray = jSONObject2.getJSONArray("j");
                String[] stringArray = new String[jSONArray.length()];
                for (int i2 = 0; i2 < jSONArray.length(); ++i2) {
                    stringArray[i2] = jSONArray.getString(i2);
                }
                by2.b(stringArray);
                dc.put(string2, by2);
            }
        }
    };
    @EventLink
    public final Listener<PacketReceiveEvent> di = packetReceiveEvent -> {
        aj<?> aj2 = packetReceiveEvent.dq();
        if (aj2 instanceof net.minecraft.network.play.server.c) {
            net.minecraft.network.play.server.c c2 = (net.minecraft.network.play.server.c)aj2;
            for (ba ba2 : new ArrayList<ba>(c2.DM().aro())) {
                if (!(ba2 instanceof s)) continue;
                String string = ba2.getFormattedText();
                c2.DM().aro().remove(ba2);
                for (Map.Entry<String, by> entry : dc.entrySet()) {
                    string = bf.c(string, entry.getKey());
                }
                if (string.equals(ba2.getFormattedText())) {
                    c2.DM().aro().add(ba2);
                    continue;
                }
                c2.DM().aro().add(new s(string));
            }
            packetReceiveEvent.e(c2);
        }
    };

    public static String c(String string, String string2) {
        by by2 = dc.get(string2);
        if (by2 != null) {
            String string3 = " \u00a77(" + string2 + "\u00a77)\u00a7r";
            String string4 = "\u00a7" + by2.bU() + by2.bW() + " \u00a77(";
            if (!string.contains(string4)) {
                int n2 = string.indexOf(string2);
                if (n2 > 1 && string.toCharArray()[n2 - 2] == '\u00a7') {
                    char c2 = string.toCharArray()[n2 - 1];
                    string3 = " \u00a77(\u00a7" + c2 + string2 + "\u00a77)\u00a7r";
                }
                return string.replaceAll(string2, "\u00a7" + by2.bU() + by2.bW() + string3);
            }
        } else if (!dd.contains(string2)) {
            dd.add(string2);
            if (!string2.isBlank()) {
                de.add(string2);
            }
        }
        return string;
    }

    public static void aZ() {
        if (!de.isEmpty() && de.get(0) != "") {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("[");
            for (String string : de) {
                stringBuilder.append("\"").append(string).append("\"");
            }
            stringBuilder.append("]");
            String string = "[\"" + String.join((CharSequence)"\", \"", de) + "\"]";
            a.aKQ().aKZ().sendMessage(new g(string).aJz());
            de = new ArrayList<String>();
        }
    }

    public static String d(String string, String string2) {
        String string3 = Client.a.k().rP().rX().toString();
        return String.valueOf((Object)an.dwd) + string2 + string + String.valueOf((Object)an.dwh) + string3 + " \u00bb " + String.valueOf((Object)an.dwh);
    }
}

