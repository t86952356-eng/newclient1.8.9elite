/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 *  lombok.Generated
 */
package hackclient.rise;

import com.google.gson.JsonObject;
import hackclient.rise.aep;
import lombok.Generated;
import net.minecraft.client.d;
import net.minecraft.util.cp;

public class aeo {
    private aep aFv;
    private String gK;
    private String aFw;
    private String aFx;
    private long aFy;

    public aeo(aep aep2, String string, String string2, String string3) {
        this.aFv = aep2;
        this.gK = string;
        this.aFw = string2;
        this.aFx = string3;
    }

    public boolean su() {
        d d2 = d.AZ();
        d2.a(new cp(this.gK, this.aFw, this.aFx, "mojang"));
        this.aFy = System.currentTimeMillis();
        return true;
    }

    public boolean ln() {
        return this.gK != null && this.aFw != null && this.aFx != null && !this.gK.isEmpty() && !this.aFw.isEmpty() && !this.aFx.isEmpty();
    }

    public JsonObject sv() {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("type", this.aFv.getName());
        jsonObject.addProperty("name", this.gK);
        jsonObject.addProperty("uuid", this.aFw);
        jsonObject.addProperty("accessToken", this.aFx);
        jsonObject.addProperty("lastUsed", (Number)this.aFy);
        return jsonObject;
    }

    public void b(JsonObject jsonObject) {
        this.aFv = jsonObject.has("type") ? aep.bi(jsonObject.get("type").getAsString()) : aep.aFz;
        if (jsonObject.has("name")) {
            this.gK = jsonObject.get("name").getAsString();
        }
        if (jsonObject.has("uuid")) {
            this.aFw = jsonObject.get("uuid").getAsString();
        }
        if (jsonObject.has("accessToken")) {
            this.aFx = jsonObject.get("accessToken").getAsString();
        }
        if (jsonObject.has("lastUsed")) {
            this.aFy = jsonObject.get("lastUsed").getAsLong();
        }
    }

    @Generated
    public aep sw() {
        return this.aFv;
    }

    @Generated
    public String getName() {
        return this.gK;
    }

    @Generated
    public String sx() {
        return this.aFw;
    }

    @Generated
    public String sy() {
        return this.aFx;
    }

    @Generated
    public long sz() {
        return this.aFy;
    }

    @Generated
    public void a(aep aep2) {
        this.aFv = aep2;
    }

    @Generated
    public void setName(String string) {
        this.gK = string;
    }

    @Generated
    public void bg(String string) {
        this.aFw = string;
    }

    @Generated
    public void bh(String string) {
        this.aFx = string;
    }

    @Generated
    public void e(long l2) {
        this.aFy = l2;
    }
}

