/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 *  lombok.Generated
 */
package hackclient.rise;

import com.alan.clients.util.account.auth.MicrosoftLogin;
import com.alan.clients.util.account.auth.d;
import com.google.gson.JsonObject;
import hackclient.rise.aeo;
import hackclient.rise.aep;
import java.util.function.Consumer;
import lombok.Generated;

public class aes
extends aeo {
    private String aFP;

    public aes(String string, String string2, String string3, String string4) {
        super(aep.aFA, string, string2, string3);
        this.aFP = string4;
    }

    public static aes sD() {
        aes aes2 = new aes("", "", "", "");
        Consumer<String> consumer = string -> {
            aes2.bm((String)string);
            aes2.su();
        };
        MicrosoftLogin.getRefreshToken(consumer);
        return aes2;
    }

    @Override
    public boolean su() {
        if (this.aFP.isEmpty()) {
            return super.su();
        }
        d d2 = MicrosoftLogin.login(this.aFP);
        if (!d2.sC()) {
            d2 = MicrosoftLogin.loginMarketplaceRefreshToken(this.aFP);
        }
        if (!d2.sC()) {
            return false;
        }
        this.setName(d2.aCU);
        this.bg(d2.aFw);
        this.bh(d2.aFI);
        this.bm(d2.aFJ);
        return super.su();
    }

    @Override
    public boolean ln() {
        return super.ln();
    }

    @Override
    public JsonObject sv() {
        JsonObject jsonObject = super.sv();
        jsonObject.addProperty("refreshToken", this.aFP);
        return jsonObject;
    }

    @Override
    public void b(JsonObject jsonObject) {
        super.b(jsonObject);
        if (jsonObject.has("refreshToken")) {
            this.aFP = jsonObject.get("refreshToken").getAsString();
        }
    }

    @Generated
    public String sE() {
        return this.aFP;
    }

    @Generated
    public void bm(String string) {
        this.aFP = string;
    }
}

