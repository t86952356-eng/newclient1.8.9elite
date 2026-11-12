/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 */
package net.minecraft.server.management;

import com.google.gson.JsonObject;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import net.minecraft.server.management.UserListEntry;

public abstract class BanEntry<T>
extends UserListEntry<T> {
    public static final SimpleDateFormat dlF = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss Z");
    protected final Date dlG;
    protected final String dlH;
    protected final Date dlI;
    protected final String dlJ;

    public BanEntry(T t2, Date date, String string, Date date2, String string2) {
        super(t2);
        this.dlG = date == null ? new Date() : date;
        this.dlH = string == null ? "(Unknown)" : string;
        this.dlI = date2;
        this.dlJ = string2 == null ? "Banned by an operator." : string2;
    }

    protected BanEntry(T t2, JsonObject jsonObject) {
        super(t2, jsonObject);
        Date date;
        Date date2;
        try {
            date2 = jsonObject.has("created") ? dlF.parse(jsonObject.get("created").getAsString()) : new Date();
        }
        catch (ParseException parseException) {
            date2 = new Date();
        }
        this.dlG = date2;
        this.dlH = jsonObject.has("source") ? jsonObject.get("source").getAsString() : "(Unknown)";
        try {
            date = jsonObject.has("expires") ? dlF.parse(jsonObject.get("expires").getAsString()) : null;
        }
        catch (ParseException parseException) {
            date = null;
        }
        this.dlI = date;
        this.dlJ = jsonObject.has("reason") ? jsonObject.get("reason").getAsString() : "Banned by an operator.";
    }

    public Date amd() {
        return this.dlI;
    }

    public String ame() {
        return this.dlJ;
    }

    @Override
    boolean amf() {
        return this.dlI != null && this.dlI.before(new Date());
    }

    @Override
    protected void x(JsonObject jsonObject) {
        jsonObject.addProperty("created", dlF.format(this.dlG));
        jsonObject.addProperty("source", this.dlH);
        jsonObject.addProperty("expires", this.dlI == null ? "forever" : dlF.format(this.dlI));
        jsonObject.addProperty("reason", this.dlJ);
    }
}

