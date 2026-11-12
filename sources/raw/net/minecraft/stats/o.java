/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 *  com.google.common.collect.Sets
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonParseException
 *  com.google.gson.JsonParser
 *  org.apache.commons.io.FileUtils
 */
package net.minecraft.stats;

import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonParser;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import net.minecraft.entity.player.e;
import net.minecraft.network.play.server.bh;
import net.minecraft.server.MinecraftServer;
import net.minecraft.stats.a;
import net.minecraft.stats.b;
import net.minecraft.stats.f;
import net.minecraft.stats.m;
import net.minecraft.stats.n;
import net.minecraft.util.bc;
import net.minecraft.util.cx;
import net.minecraft.util.t;
import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class o
extends m {
    private static final Logger dqG = LogManager.getLogger();
    private final MinecraftServer dqH;
    private final File dqI;
    private final Set<f> dqJ = Sets.newHashSet();
    private int dqK = -300;
    private boolean dqL = false;

    public o(MinecraftServer minecraftServer, File file) {
        this.dqH = minecraftServer;
        this.dqI = file;
    }

    public void apB() {
        if (this.dqI.isFile()) {
            try {
                this.dpA.clear();
                this.dpA.putAll(this.fV(FileUtils.readFileToString((File)this.dqI)));
            }
            catch (IOException iOException) {
                dqG.error("Couldn't read statistics file " + String.valueOf(this.dqI), (Throwable)iOException);
            }
            catch (JsonParseException jsonParseException) {
                dqG.error("Couldn't parse statistics file " + String.valueOf(this.dqI), (Throwable)jsonParseException);
            }
        }
    }

    public void apC() {
        try {
            FileUtils.writeStringToFile((File)this.dqI, (String)o.q(this.dpA));
        }
        catch (IOException iOException) {
            dqG.error("Couldn't save stats", (Throwable)iOException);
        }
    }

    @Override
    public void b(net.minecraft.entity.player.a a2, f f2, int n2) {
        int n3 = f2.apo() ? this.c(f2) : 0;
        super.b(a2, f2, n2);
        this.dqJ.add(f2);
        if (f2.apo() && n3 == 0 && n2 > 0) {
            this.dqL = true;
            if (this.dqH.alP()) {
                this.dqH.alE().m(new t("chat.type.achievement", a2.xW(), f2.apt()));
            }
        }
        if (f2.apo() && n3 > 0 && n2 == 0) {
            this.dqL = true;
            if (this.dqH.alP()) {
                this.dqH.alE().m(new t("chat.type.achievement.taken", a2.xW(), f2.apt()));
            }
        }
    }

    public Set<f> apD() {
        HashSet hashSet = Sets.newHashSet(this.dqJ);
        this.dqJ.clear();
        this.dqL = false;
        return hashSet;
    }

    public Map<f, cx> fV(String string) {
        JsonElement jsonElement = new JsonParser().parse(string);
        if (!jsonElement.isJsonObject()) {
            return Maps.newHashMap();
        }
        JsonObject jsonObject = jsonElement.getAsJsonObject();
        HashMap hashMap = Maps.newHashMap();
        for (Map.Entry entry : jsonObject.entrySet()) {
            f f2 = n.fU((String)entry.getKey());
            if (f2 != null) {
                cx cx2 = new cx();
                if (((JsonElement)entry.getValue()).isJsonPrimitive() && ((JsonElement)entry.getValue()).getAsJsonPrimitive().isNumber()) {
                    cx2.hV(((JsonElement)entry.getValue()).getAsInt());
                } else if (((JsonElement)entry.getValue()).isJsonObject()) {
                    JsonObject jsonObject2 = ((JsonElement)entry.getValue()).getAsJsonObject();
                    if (jsonObject2.has("value") && jsonObject2.get("value").isJsonPrimitive() && jsonObject2.get("value").getAsJsonPrimitive().isNumber()) {
                        cx2.hV(jsonObject2.getAsJsonPrimitive("value").getAsInt());
                    }
                    if (jsonObject2.has("progress") && f2.apv() != null) {
                        try {
                            Constructor<? extends bc> constructor = f2.apv().getConstructor(new Class[0]);
                            bc bc2 = constructor.newInstance(new Object[0]);
                            bc2.e(jsonObject2.get("progress"));
                            cx2.a(bc2);
                        }
                        catch (Throwable throwable) {
                            dqG.warn("Invalid statistic progress in " + String.valueOf(this.dqI), throwable);
                        }
                    }
                }
                hashMap.put(f2, cx2);
                continue;
            }
            dqG.warn("Invalid statistic in " + String.valueOf(this.dqI) + ": Don't know what " + (String)entry.getKey() + " is");
        }
        return hashMap;
    }

    public static String q(Map<f, cx> map) {
        JsonObject jsonObject = new JsonObject();
        for (Map.Entry<f, cx> entry : map.entrySet()) {
            if (entry.getValue().atO() != null) {
                JsonObject jsonObject2 = new JsonObject();
                jsonObject2.addProperty("value", (Number)entry.getValue().atN());
                try {
                    jsonObject2.add("progress", entry.getValue().atO().atk());
                }
                catch (Throwable throwable) {
                    dqG.warn("Couldn't save statistic " + String.valueOf(entry.getKey().app()) + ": error serializing progress", throwable);
                }
                jsonObject.add(entry.getKey().dpn, (JsonElement)jsonObject2);
                continue;
            }
            jsonObject.addProperty(entry.getKey().dpn, (Number)entry.getValue().atN());
        }
        return jsonObject.toString();
    }

    public void apE() {
        this.dqJ.addAll(this.dpA.keySet());
    }

    public void u(e e2) {
        int n2 = this.dqH.alI();
        HashMap hashMap = Maps.newHashMap();
        if (this.dqL || n2 - this.dqK > 300) {
            this.dqK = n2;
            for (f f2 : this.apD()) {
                hashMap.put(f2, this.c(f2));
            }
        }
        e2.cIX.B(new bh(hashMap));
    }

    public void v(e e2) {
        HashMap hashMap = Maps.newHashMap();
        for (a a2 : b.doD) {
            if (!this.d(a2)) continue;
            hashMap.put(a2, this.c(a2));
            this.dqJ.remove(a2);
        }
        e2.cIX.B(new bh(hashMap));
    }

    public boolean apF() {
        return this.dqL;
    }
}

