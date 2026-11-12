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
import hackclient.rise.a;
import hackclient.rise.abf;
import hackclient.rise.abg;
import hackclient.rise.abz;
import hackclient.rise.aca;
import hackclient.rise.acl;
import hackclient.rise.acm;
import hackclient.rise.aea;
import hackclient.rise.aef;
import hackclient.rise.afj;
import hackclient.rise.afk;
import hackclient.rise.agn;
import hackclient.rise.ait;
import hackclient.rise.ajw;
import hackclient.rise.aka;
import hackclient.rise.akb;
import hackclient.rise.dk;
import hackclient.rise.dm;
import hackclient.rise.er;
import hackclient.rise.gb;
import hackclient.rise.gd;
import hackclient.rise.gj;
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

public final class acd
implements aca,
aea {
    public agn scrollUtil = new agn();
    public static int auT = 10;
    public static boolean aAp;
    private acm aAq = new acm(Arrays.asList(new acl("", "Loading"), new acl("", "Loading"), new acl("", "Loading")), "Featured Configs");
    private acm aAr = new acm(Arrays.asList(new acl("", "Loading"), new acl("", "Loading"), new acl("", "Loading")), "Community Configs");
    private acm aAs = new acm(Arrays.asList(new acl("", ""), new acl("", ""), new acl("", "")), "Your Configs");
    private ArrayList<abg> aAt = new ArrayList();
    public acm[] aAu = new acm[]{this.aAq, this.aAs};
    private boolean aAv;
    private afj animation = new afj(afk.aHn, 400L);
    @dm
    public final dk<er> aAw = er2 -> {
        if (er2.dd() instanceof rip.vantage.commons.packet.impl.server.community.a) {
            rip.vantage.commons.packet.impl.server.community.a a2 = (rip.vantage.commons.packet.impl.server.community.a)er2.dd();
            JSONArray jSONArray = a2.aKb();
            this.aAr.clear();
            for (int i2 = 0; i2 < jSONArray.length(); ++i2) {
                JSONObject jSONObject = jSONArray.getJSONObject(i2);
                String string = StringUtils.capitalize((String)jSONObject.getString("a"));
                String string2 = jSONObject.getString("b");
                String string3 = jSONObject.getString("c");
                this.aAr.add(new acl("Click to load", string, () -> rip.vantage.network.core.a.aKQ().aKZ().sendMessage(new c(string3).aJz())));
            }
        }
    };

    @Override
    public void b(int n2, int n3, float f2) {
        if (!this.aAv) {
            a.a.e().b(this);
            this.aAv = true;
        }
        abf abf2 = this.v();
        akb akb2 = new akb(this.v().pm().x, this.v().pm().y);
        akb akb3 = new akb(this.v().pn().x, this.v().pn().y);
        if (abf2.ayD > 0.99) {
            // empty if block
        }
        aAp = true;
        for (acm acm2 : this.aAu) {
            acm2.qV();
        }
        this.scrollUtil.E(aAp);
        akb2.x = (float)((double)akb2.x + (abf2.ayu.ayX + (double)auT));
        akb2.y = (float)((double)akb2.y + (this.scrollUtil.tT() + (double)auT));
        akb3.x = (float)((double)akb3.x + ((double)(-auT * 2) - abf2.ayu.ayX));
        akb akb4 = new akb(akb3.x, 110.0f);
        ait.c((double)akb2.x, (double)akb2.y, (double)akb4.x, (double)akb4.y, 10.0, abz.aAf.Y(abz.aAf.ql().getAlpha() * 2));
        akb2.y += akb4.y + (float)(auT * 2);
        for (acm acm3 : this.aAu) {
            try {
                acm3.j(akb2);
                akb2.y += (float)(auT * 2 + acm3.getHeight());
            }
            catch (ConcurrentModificationException d4) {
                // empty catch block
            }
        }
        gb.ks.a(18, gd.kG).a("Your Scripts", akb2.x, akb2.y, Color.WHITE.getRGB());
        akb2.y += (float)auT + gb.ks.a(18, gd.kG).tF();
        for (abg abg2 : this.aAt) {
            abg2.a(new aka((double)abf2.ayt.x + abf2.ayu.ayX + 8.0, akb2.y), n2, n3, f2);
            akb2.y += abg2.alQ.y + 7.0f;
        }
        double d2 = 7.0;
        double d3 = abf2.pm().getX() + abf2.pn().getX() - 4.0f;
        double d4 = (double)abf2.pm().getY() + d2;
        this.scrollUtil.a(new aka(d3, d4), (double)this.v().alQ.y - d2 * 2.0);
        this.scrollUtil.V(-((double)akb2.y - this.scrollUtil.tT() - (double)abf2.ayt.y) + (double)abf2.alQ.y - 7.0);
        if (abf2.ayD > 0.99) {
            // empty if block
        }
    }

    @Override
    public void a(char c2, int n2) {
        for (abg abg2 : this.aAt) {
            abg2.b(c2, n2);
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
        for (abg abg2 : this.aAt) {
            abg2.d(n2, n3, n4);
        }
    }

    @Override
    public void oW() {
        for (abg abg2 : this.aAt) {
            abg2.pP();
        }
    }

    @Override
    public void qo() {
        for (abg abg2 : this.aAt) {
            abg2.ci();
        }
    }

    @Override
    public void aT() {
        if (!this.aAv) {
            a.a.e().b(this);
            this.aAv = true;
        }
        for (acm acm2 : this.aAu) {
            acm2.init();
        }
        a.a.p().update();
        this.aAs.clear();
        a.a.p().forEach(afz2 -> this.aAs.add(new acl("Click to load", afz2.getName(), afz2::tt)));
        this.aAt = a.a.v().pw().stream().filter(abg2 -> abg2.dl().getModuleInfo().category() == gj.lk).collect(Collectors.toCollection(ArrayList::new));
        rip.vantage.network.core.a.aKQ().aKZ().sendMessage(new rip.vantage.commons.packet.impl.client.community.a().aJz());
        new Thread(() -> {
            ArrayList<ajw<String, String, String>> arrayList = this.qy();
            this.aAq.clear();
            arrayList.forEach((Consumer<ajw<String, String, String>>)((Consumer<ajw>)ajw2 -> this.aAq.add(new acl("Click to load", (String)ajw2.wi(), () -> rip.vantage.network.core.a.aKQ().aKZ().sendMessage(new e(aef.aY("https://raw.githubusercontent.com/risellc/RiseOnlineConfigs/main/" + ((String)ajw2.wi()).toLowerCase() + ".json")).aJz())))));
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
    public ArrayList<abg> qC() {
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
    public dk<er> qF() {
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
    public void c(ArrayList<abg> arrayList) {
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

