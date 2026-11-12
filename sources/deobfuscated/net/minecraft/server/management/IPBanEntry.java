/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 */
package net.minecraft.server.management;

import com.google.gson.JsonObject;
import java.util.Date;
import net.minecraft.server.management.BanEntry;

public class IPBanEntry
extends BanEntry<String> {
    public IPBanEntry(String string) {
        this(string, (Date)null, (String)null, (Date)null, (String)null);
    }

    public IPBanEntry(String string, Date date, String string2, Date date2, String string3) {
        super(string, date, string2, date2, string3);
    }

    public IPBanEntry(JsonObject jsonObject) {
        super(IPBanEntry.z(jsonObject), jsonObject);
    }

    private static String z(JsonObject jsonObject) {
        return jsonObject.has("ip") ? jsonObject.get("ip").getAsString() : null;
    }

    @Override
    protected void x(JsonObject jsonObject) {
        if (this.wD() != null) {
            jsonObject.addProperty("ip", (String)this.wD());
            super.x(jsonObject);
        }
    }
}

