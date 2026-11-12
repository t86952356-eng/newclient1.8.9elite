/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 *  lombok.Generated
 */
package hackclient.rise;

import com.google.gson.JsonObject;
import hackclient.rise.aeo;
import hackclient.rise.aep;
import lombok.Generated;

public class aet
extends aeo {
    private String aFQ;
    private long aFR;

    public aet(String string, String string2, String string3, String string4) {
        super(aep.aFB, string, string2, string3);
        this.aFQ = string4;
        this.aFR = System.currentTimeMillis();
    }

    @Override
    public boolean ln() {
        return super.ln() && this.aFQ != null && !this.aFQ.isEmpty();
    }

    @Override
    public JsonObject sv() {
        JsonObject jsonObject = super.sv();
        jsonObject.addProperty("orderId", this.aFQ);
        jsonObject.addProperty("purchaseDate", (Number)this.aFR);
        return jsonObject;
    }

    @Override
    public void b(JsonObject jsonObject) {
        super.b(jsonObject);
        if (jsonObject.has("orderId")) {
            this.aFQ = jsonObject.get("orderId").getAsString();
        }
        if (jsonObject.has("purchaseDate")) {
            this.aFR = jsonObject.get("purchaseDate").getAsLong();
        }
    }

    @Generated
    public String sF() {
        return this.aFQ;
    }

    @Generated
    public long sG() {
        return this.aFR;
    }

    @Generated
    public void bn(String string) {
        this.aFQ = string;
    }

    @Generated
    public void f(long l2) {
        this.aFR = l2;
    }
}

