/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonArray
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  lombok.Generated
 *  org.apache.commons.lang3.StringUtils
 *  org.json.JSONArray
 *  org.json.JSONObject
 */
package hackclient.rise;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import hackclient.rise.abz;
import hackclient.rise.aca;
import hackclient.rise.acl;
import hackclient.rise.acm;
import hackclient.rise.aef;
import hackclient.rise.afj;
import hackclient.rise.afk;
import hackclient.rise.agn;
import hackclient.rise.ait;
import hackclient.rise.ajw;
import hackclient.rise.er;
import hackclient.rise.gb;
import hackclient.rise.gd;
import java.awt.Color;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import lombok.Generated;
import org.apache.commons.lang3.StringUtils;
import org.json.JSONArray;
import org.json.JSONObject;
import rip.vantage.commons.packet.impl.client.community.c;
import rip.vantage.commons.packet.impl.client.protection.e;
import rip.vantage.network.core.a;
import rise.Client;
import rise.event.EventLink;
import rise.event.Listener;
import rise.module.Category;
import rise.ui.clickgui.ModernClickGui;
import rise.ui.clickgui.ModuleComponent;
import rise.util.InstanceAccess;
import rise.util.math.Vector2d;
import rise.util.math.Vector2f;

public final class acd
implements aca,
InstanceAccess {
    public agn scrollUtil = new agn();
    public static int auT = 10;
    public static boolean aAp;
    private acm aAq = new acm(Arrays.asList(new acl("", "Loading"), new acl("", "Loading"), new acl("", "Loading")), "Featured Configs");
    private acm aAr = new acm(Arrays.asList(new acl("", "Loading"), new acl("", "Loading"), new acl("", "Loading")), "Community Configs");
    private acm aAs = new acm(Arrays.asList(new acl("", ""), new acl("", ""), new acl("", "")), "Your Configs");
    private ArrayList<ModuleComponent> aAt = new ArrayList();
    public acm[] aAu = new acm[]{this.aAq, this.aAs};
    private boolean aAv;
    private afj animation = new afj(afk.aHn, 400L);
    @EventLink
    public final Listener<er> aAw = er2 -> {
        if (er2.dd() instanceof rip.vantage.commons.packet.impl.server.community.a) {
            rip.vantage.commons.packet.impl.server.community.a a2 = (rip.vantage.commons.packet.impl.server.community.a)er2.dd();
            JSONArray jSONArray = a2.aKb();
            this.aAr.clear();
            for (int i2 = 0; i2 < jSONArray.length(); ++i2) {
                JSONObject jSONObject = jSONArray.getJSONObject(i2);
                String string = StringUtils.capitalize((String)jSONObject.getString("a"));
                String string2 = jSONObject.getString("b");
                String string3 = jSONObject.getString("c");
                this.aAr.add(new acl("Click to load", string, () -> a.aKQ().aKZ().sendMessage(new c(string3).aJz())));
            }
        }
    };

    @Override
    public void b(int n2, int n3, float f2) {
        if (!this.aAv) {
            Client.a.e().b(this);
            this.aAv = true;
        }
        ModernClickGui modernClickGui = this.v();
        Vector2f vector2f = new Vector2f(this.v().pm().x, this.v().pm().y);
        Vector2f vector2f2 = new Vector2f(this.v().pn().x, this.v().pn().y);
        if (modernClickGui.ayD > 0.99) {
            // empty if block
        }
        aAp = true;
        for (acm acm2 : this.aAu) {
            acm2.qV();
        }
        this.scrollUtil.E(aAp);
        vector2f.x = (float)((double)vector2f.x + (modernClickGui.ayu.ayX + (double)auT));
        vector2f.y = (float)((double)vector2f.y + (this.scrollUtil.tT() + (double)auT));
        vector2f2.x = (float)((double)vector2f2.x + ((double)(-auT * 2) - modernClickGui.ayu.ayX));
        Vector2f vector2f3 = new Vector2f(vector2f2.x, 110.0f);
        ait.c((double)vector2f.x, (double)vector2f.y, (double)vector2f3.x, (double)vector2f3.y, 10.0, abz.aAf.Y(abz.aAf.ql().getAlpha() * 2));
        vector2f.y += vector2f3.y + (float)(auT * 2);
        for (acm acm3 : this.aAu) {
            try {
                acm3.j(vector2f);
                vector2f.y += (float)(auT * 2 + acm3.getHeight());
            }
            catch (ConcurrentModificationException d4) {
                // empty catch block
            }
        }
        gb.ks.a(18, gd.kG).a("Your Scripts", vector2f.x, vector2f.y, Color.WHITE.getRGB());
        vector2f.y += (float)auT + gb.ks.a(18, gd.kG).tF();
        for (ModuleComponent moduleComponent : this.aAt) {
            moduleComponent.a(new Vector2d((double)modernClickGui.ayt.x + modernClickGui.ayu.ayX + 8.0, vector2f.y), n2, n3, f2);
            vector2f.y += moduleComponent.alQ.y + 7.0f;
        }
        double d2 = 7.0;
        double d3 = modernClickGui.pm().getX() + modernClickGui.pn().getX() - 4.0f;
        double d4 = (double)modernClickGui.pm().getY() + d2;
        this.scrollUtil.a(new Vector2d(d3, d4), (double)this.v().alQ.y - d2 * 2.0);
        this.scrollUtil.V(-((double)vector2f.y - this.scrollUtil.tT() - (double)modernClickGui.ayt.y) + (double)modernClickGui.alQ.y - 7.0);
        if (modernClickGui.ayD > 0.99) {
            // empty if block
        }
    }

    @Override
    public void a(char c2, int n2) {
        for (ModuleComponent moduleComponent : this.aAt) {
            moduleComponent.b(c2, n2);
        }
    }

    @Override
    public void f(int n2, int n3, int n4) {
        for (acm acm2 : this.aAu) {
            try {
                acm2.f(n2, n3, n4);
            }
            catch (ConcurrentModificationException concurrentModificationException) {
                concurrentModificationException.printStackTrace();
            }
        }
        for (ModuleComponent moduleComponent : this.aAt) {
            moduleComponent.d(n2, n3, n4);
        }
    }

    @Override
    public void oW() {
        for (ModuleComponent moduleComponent : this.aAt) {
            moduleComponent.pP();
        }
    }

    @Override
    public void qo() {
        for (ModuleComponent moduleComponent : this.aAt) {
            moduleComponent.ci();
        }
    }

    @Override
    public void aT() {
        if (!this.aAv) {
            Client.a.e().b(this);
            this.aAv = true;
        }
        for (acm acm2 : this.aAu) {
            acm2.init();
        }
        Client.a.p().update();
        this.aAs.clear();
        Client.a.p().forEach(afz2 -> this.aAs.add(new acl("Click to load", afz2.getName(), afz2::tt)));
        this.aAt = Client.a.v().pw().stream().filter(moduleComponent -> moduleComponent.dl().getModuleInfo().category() == Category.lk).collect(Collectors.toCollection(ArrayList::new));
        a.aKQ().aKZ().sendMessage(new rip.vantage.commons.packet.impl.client.community.a().aJz());
        new Thread(() -> {
            ArrayList<ajw<String, String, String>> arrayList = this.qy();
            this.aAq.clear();
            arrayList.forEach((Consumer<ajw<String, String, String>>)((Consumer<ajw>)ajw2 -> this.aAq.add(new acl("Click to load", (String)ajw2.wi(), () -> a.aKQ().aKZ().sendMessage(new e(aef.aY("https://raw.githubusercontent.com/risellc/RiseOnlineConfigs/main/" + ((String)ajw2.wi()).toLowerCase() + ".json")).aJz())))));
        }).start();
    }

    public ArrayList<ajw<String, String, String>> qy() {
        JsonArray jsonArray = aef.aZ("https://raw.githubusercontent.com/risellc/RiseOnlineConfigs/main/index.json");
        ArrayList<ajw<String, String, String>> arrayList = new ArrayList<ajw<String, String, String>>();
        for (JsonElement jsonElement : jsonArray) {
            JsonObject jsonObject = jsonElement.getAsJsonObject();
            String string = jsonObject.get("name").getAsString();
            String string2 = jsonObject.get("ip").getAsString();
            String string3 = jsonObject.get("last updated").getAsString();
            arrayList.add(new ajw<String, String, String>(string, string2, string3));
        }
        return arrayList;
    }

    @Generated
    public agn qu() {
        return this.scrollUtil;
    }

    @Generated
    public acm qz() {
        return this.aAq;
    }

    @Generated
    public acm qA() {
        return this.aAr;
    }

    @Generated
    public acm qB() {
        return this.aAs;
    }

    @Generated
    public ArrayList<ModuleComponent> qC() {
        return this.aAt;
    }

    @Generated
    public acm[] qD() {
        return this.aAu;
    }

    @Generated
    public boolean qE() {
        return this.aAv;
    }

    @Generated
    public afj mS() {
        return this.animation;
    }

    @Generated
    public Listener<er> qF() {
        return this.aAw;
    }

    @Generated
    public void a(agn agn2) {
        this.scrollUtil = agn2;
    }

    @Generated
    public void a(acm acm2) {
        this.aAq = acm2;
    }

    @Generated
    public void b(acm acm2) {
        this.aAr = acm2;
    }

    @Generated
    public void c(acm acm2) {
        this.aAs = acm2;
    }

    @Generated
    public void c(ArrayList<ModuleComponent> arrayList) {
        this.aAt = arrayList;
    }

    @Generated
    public void a(acm[] acmArray) {
        this.aAu = acmArray;
    }

    @Generated
    public void z(boolean bl2) {
        this.aAv = bl2;
    }

    @Generated
    public void a(afj afj2) {
        this.animation = afj2;
    }
}

